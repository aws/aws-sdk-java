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

import java.io.InputStream;
import java.net.MalformedURLException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;

/**
 * Signer implementation that signs requests with the AWS3 signing protocol.
 */
public class AWS3Signer extends AbstractAWSSigner {

    private static final String AUTHORIZATION_HEADER = "X-Amzn-Authorization";
    private static final String NONCE_HEADER = "x-amz-nonce";
    private static final String HTTP_SCHEME = "AWS3";
    private static final String HTTPS_SCHEME = "AWS3-HTTPS";

    /** For internal testing only - allows the request's date to be overridden for testing. */
    private String overriddenDate;

    protected static final DateUtils dateUtils = new DateUtils();
    private static final Log log = LogFactory.getLog(AWS3Signer.class);


    /**
     * Signs the specified request with the AWS3 signing protocol by using the
     * AWS account credentials specified when this object was constructed and
     * adding the required AWS3 headers to the request.
     *
     * @param request
     *            The request to sign.
     */
    public void sign(Request<?> request, AWSCredentials credentials) throws AmazonClientException {
        SigningAlgorithm algorithm = SigningAlgorithm.HmacSHA256;
        String nonce = UUID.randomUUID().toString();
        String date = dateUtils.formatRfc822Date(new Date());
        boolean isHttps = isHttpsRequest(request);

        if (overriddenDate != null) date = overriddenDate;
        request.addHeader("Date", date);
        request.addHeader("X-Amz-Date", date);

        // AWS3 HTTP requires that we sign the Host header
        // so we have to have it in the request by the time we sign.
        String hostHeader = request.getEndpoint().getHost();
        if (HttpUtils.isUsingNonDefaultPort(request.getEndpoint())) {
            hostHeader += ":" + request.getEndpoint().getPort();
        }
        request.addHeader("Host", hostHeader);


        byte[] bytesToSign;
        String stringToSign;
        if (isHttps) {
        	request.addHeader(NONCE_HEADER, nonce);
            stringToSign = date + nonce;
            bytesToSign = stringToSign.getBytes();
        } else {
            stringToSign = "POST\n"
                + getCanonicalizedResourcePath(request.getEndpoint()) + "\n"
                + getCanonicalizedQueryString(request.getParameters()) + "\n"
                + getCanonicalizedHeadersForStringToSign(request) + "\n"
                + getRequestPayload(request);
            bytesToSign = hash(stringToSign);
        }
        log.debug("Calculated StringToSign: " + stringToSign);

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        String signature = sign(bytesToSign, sanitizedCredentials.getAWSSecretKey(), algorithm);

        StringBuilder builder = new StringBuilder();
        builder.append(isHttps ? HTTPS_SCHEME : HTTP_SCHEME).append(" ");
        builder.append("AWSAccessKeyId=" + sanitizedCredentials.getAWSAccessKeyId() + ",");
        builder.append("Algorithm=" + algorithm.toString() + ",");

        if (!isHttps) {
        	builder.append(getSignedHeadersComponent(request) + ",");
        }

        builder.append("Signature=" + signature);
        request.addHeader(AUTHORIZATION_HEADER, builder.toString());
    }

    private String getRequestPayload(Request<?> request) {
        try {
        	InputStream content = request.getContent();
        	if (!content.markSupported()) {
        		throw new AmazonClientException("Unable to read request payload to sign request.");
        	}

        	StringBuilder sb = new StringBuilder();
        	content.mark(-1);
        	int b;
        	while ((b = content.read()) > -1) {
        		sb.append((char)b);
        	}
        	content.reset();
            return sb.toString();
        } catch (Exception e) {
        	throw new AmazonClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }

    private String getSignedHeadersComponent(Request<?> request) {
    	StringBuilder builder = new StringBuilder();
    	builder.append("SignedHeaders=");
    	boolean first = true;
    	for (String header : getHeadersForStringToSign(request)) {
    		if (!first) builder.append(";");
    		builder.append(header);
    		first = false;
    	}
    	return builder.toString();
    }

    private byte[] hash(String text) throws AmazonClientException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            return md.digest();
        } catch (Exception e) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e.getMessage(), e);
        }
    }

    protected List<String> getHeadersForStringToSign(Request<?> request) {
        List<String> headersToSign = new ArrayList<String>();
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            String key = entry.getKey();
            String lowerCaseKey = key.toLowerCase();
            if (lowerCaseKey.startsWith("x-amz")
            		|| lowerCaseKey.equals("content-encoding")
            		|| lowerCaseKey.equals("host")) {
            	headersToSign.add(key);
            }
        }

        Collections.sort(headersToSign);
        return headersToSign;
    }

	/**
	 * For internal testing only - allows the date to be overridden for internal
	 * tests.
	 *
	 * @param date
	 *            The RFC822 date string to use when signing requests.
	 */
    void overrideDate(String date) {
		this.overriddenDate = date;
    }

    protected String getCanonicalizedHeadersForStringToSign(Request<?> request) {
    	List<String> headersToSign = getHeadersForStringToSign(request);

    	for (int i = 0; i < headersToSign.size(); i++) {
    		headersToSign.set(i, headersToSign.get(i).toLowerCase());
    	}

        SortedMap<String, String> sortedHeaderMap = new TreeMap<String, String>();
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
        	if (headersToSign.contains(entry.getKey().toLowerCase())) {
        		sortedHeaderMap.put(entry.getKey(), entry.getValue());
        	}
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedHeaderMap.entrySet()) {
            builder.append(entry.getKey().toLowerCase()).append(":")
                   .append(entry.getValue()).append("\n");
        }

        return builder.toString();
    }

    private boolean isHttpsRequest(Request<?> request) throws AmazonClientException {
        try {
            String protocol = request.getEndpoint().toURL().getProtocol().toLowerCase();
            if (protocol.equals("http")) {
                return false;
            } else if (protocol.equals("https")) {
                return true;
            } else {
                throw new AmazonClientException("Unknown request endpoint protocol " +
                		"encountered while signing request: " + protocol);
            }
        } catch (MalformedURLException e) {
            throw new AmazonClientException("Unable to parse request endpoint during signing", e);
        }
    }
}
