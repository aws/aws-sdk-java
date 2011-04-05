/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.HttpUtils;

/**
 * Abstract base class for AWS signing protocol implementations. Provides
 * utilities commonly needed by signing protocols such as computing
 * canonicalized host names, query string parameters, etc.
 * <p>
 * Not intended to be sub-classed by developers.
 */
public abstract class AbstractAWSSigner implements Signer {

    /** The default encoding to use when URL encoding */
    private static final String DEFAULT_ENCODING = "UTF-8";


    /**
     * Computes an RFC 2104-compliant HMAC signature.
     */
    protected String sign(String data, String key, SigningAlgorithm algorithm)
            throws AmazonClientException {
    	try {
			return sign(data.getBytes(DEFAULT_ENCODING), key, algorithm);
		} catch (UnsupportedEncodingException e) {
    		throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
		}
    }

    /**
     * Computes an RFC 2104-compliant HMAC signature for an array of bytes.
     */
    protected String sign(byte[] data, String key, SigningAlgorithm algorithm)
    		throws AmazonClientException {
    	try {
    		Mac mac = Mac.getInstance(algorithm.toString());
    		mac.init(new SecretKeySpec(key.getBytes(), algorithm.toString()));
    		byte[] signature = Base64.encodeBase64(mac.doFinal(data));
    		return new String(signature);
    	} catch (Exception e) {
    		throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
    	}
    }

    protected String getCanonicalizedQueryString(Map<String, String> parameters) {
        SortedMap<String, String> sorted = new TreeMap<String, String>();
        sorted.putAll(parameters);

        StringBuilder builder = new StringBuilder();
        Iterator<Map.Entry<String, String>> pairs = sorted.entrySet().iterator();
        while (pairs.hasNext()) {
            Map.Entry<String, String> pair = pairs.next();
            String key = pair.getKey();
            String value = pair.getValue();
            builder.append(HttpUtils.urlEncode(key, false));
            builder.append("=");
            builder.append(HttpUtils.urlEncode(value, false));
            if (pairs.hasNext()) {
                builder.append("&");
            }
        }

        return builder.toString();
    }

    protected String getCanonicalizedResourcePath(URI endpoint) {
        String uri = endpoint.getPath();
        if (uri == null || uri.length() == 0) {
            return "/";
        } else {
            return HttpUtils.urlEncode(uri, true);
        }
    }

    protected String getCanonicalizedEndpoint(URI endpoint) {
        String endpointForStringToSign = endpoint.getHost().toLowerCase();
        /*
         * Apache HttpClient will omit the port in the Host header for default
         * port values (i.e. 80 for HTTP and 443 for HTTPS) even if we
         * explicitly specify it, so we need to be careful that we use the same
         * value here when we calculate the string to sign and in the Host
         * header we send in the HTTP request.
         */
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            endpointForStringToSign += ":" + endpoint.getPort();
        }

        return endpointForStringToSign;
    }

    /**
     * Loads the individual access key ID and secret key from the specified credentials, ensuring that
     * access to the credentials is synchronized on the credentials object itself, and trimming any extra
     * whitespace from the credentials.
     * @param credentials
     * @return A new credentials object with the sanitized credentials.
     */
    protected AWSCredentials sanitizeCredentials(AWSCredentials credentials) {
        String accessKeyId = null;
        String secretKey   = null;
        synchronized (credentials) {
            accessKeyId = credentials.getAWSAccessKeyId();
            secretKey   = credentials.getAWSSecretKey();
        }
        if (secretKey != null) secretKey = secretKey.trim();
        if (accessKeyId != null) accessKeyId = accessKeyId.trim();

        return new BasicAWSCredentials(accessKeyId, secretKey);
    }

}
