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

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;

/**
 * Signer implementation responsible for signing an AWS query string request
 * according to the various signature versions and hashing algorithms.
 */
public class QueryStringSigner extends AbstractAWSSigner implements Signer {

	/**
	 * This signer will add "Signature" parameter to the request. Default
	 * signature version is "2" and default signing algorithm is "HmacSHA256".
	 *
	 * AWSAccessKeyId SignatureVersion SignatureMethod Timestamp Signature
	 *
	 * @param request
	 *            request to be signed.
	 * @param credentials
	 *            The credentials used to use to sign the request.
	 */
	public void sign(Request<?> request, AWSCredentials credentials) throws AmazonClientException {
        sign(request, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, credentials);
	}

    /**
     * This signer will add following authentication parameters to the request:
     *
     * AWSAccessKeyId SignatureVersion SignatureMethod Timestamp Signature
     *
     * @param request
     *            request to be signed.
     *
     * @param version
     *            signature version. "2" is recommended.
     *
     * @param algorithm
     *            signature algorithm. "HmacSHA256" is recommended.
     */
    public void sign(Request<?> request, SignatureVersion version, SigningAlgorithm algorithm, AWSCredentials credentials) throws AmazonClientException {
    	AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        request.addParameter("AWSAccessKeyId", sanitizedCredentials.getAWSAccessKeyId());
        request.addParameter("SignatureVersion", version.toString());
        request.addParameter("Timestamp", getFormattedTimestamp());

        String stringToSign = null;
        if ( version.equals( SignatureVersion.V1 ) ) {
            stringToSign = calculateStringToSignV1(request.getParameters());
        } else if ( version.equals( SignatureVersion.V2 ) ) {
            request.addParameter("SignatureMethod", algorithm.toString());
            stringToSign = calculateStringToSignV2(request.getEndpoint(), request.getParameters());
        } else {
            throw new AmazonClientException("Invalid Signature Version specified");
        }

        String signatureValue = sign(stringToSign, sanitizedCredentials.getAWSSecretKey(), algorithm);
        request.addParameter("Signature", signatureValue);
    }

    /**
     * Calculates string to sign for signature version 1.
     *
     * @param parameters
     *            request parameters
     *
     * @return String to sign
     */
    private String calculateStringToSignV1(Map<String, String> parameters) {
        StringBuilder data = new StringBuilder();
        SortedMap<String, String> sorted =
            new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        sorted.putAll(parameters);

        for (String key : sorted.keySet()) {
            data.append(key);
            data.append(sorted.get(key));
        }

        return data.toString();
    }

    /**
     * Calculate string to sign for signature version 2.
     *
     * @param parameters
     *            request parameters
     *
     * @param serviceUrl
     *            service url
     *
     * @return String to sign
     *
     * @throws AmazonClientException
     *             If the string to sign cannot be calculated.
     */
    private String calculateStringToSignV2(URI endpoint,
            Map<String, String> parameters) throws AmazonClientException {
        StringBuilder data = new StringBuilder();
        data.append("POST").append("\n");
        data.append(getCanonicalizedEndpoint(endpoint)).append("\n");
        data.append(getCanonicalizedResourcePath(endpoint)).append("\n");
        data.append(getCanonicalizedQueryString(parameters));
        return data.toString();
    }

    /**
     * Formats date as ISO 8601 timestamp
     */
    private String getFormattedTimestamp() {
        SimpleDateFormat df = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        return df.format(new Date());
    }

}
