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

import java.net.MalformedURLException;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.DateUtils;

/**
 * Signer implementation that signs requests with the AWS3 signing protocol.
 */
public class AWS3Signer extends AbstractAWSSigner {

    private static final String AUTHORIZATION_HEADER = "X-Amzn-Authorization";
    private static final String NONCE_HEADER = "x-amz-nonce";
    private static final String HTTP_SCHEME = "AWS3";
    private static final String HTTPS_SCHEME = "AWS3-HTTPS";

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

        String stringToSign;
        if (isHttps) {
            stringToSign = date + nonce;
        } else {
            stringToSign = "POST\n"
                + getCanonicalizedEndpoint(request.getEndpoint()) + "\n"
                + getCanonicalizedResourcePath(request.getEndpoint()) + "\n"
                + getCanonicalizedQueryString(request.getParameters()) + "\n"
                + getCanonicalizedHeadersForStringToSign(request) + "\n"
                + ""; // we shouldn't ever have a payload in a request yet
            stringToSign = hash(stringToSign);
        }
        log.debug("Calculated StringToSign: " + stringToSign);

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        String signature = sign(stringToSign, sanitizedCredentials.getAWSSecretKey(), algorithm);

        StringBuilder builder = new StringBuilder();
        builder.append(isHttps ? HTTPS_SCHEME : HTTP_SCHEME).append(" ");
        builder.append("AWSAccessKeyId=" + sanitizedCredentials.getAWSAccessKeyId() + ",");
        builder.append("Algorithm=" + algorithm.toString() + ",");
        builder.append("Signature=" + signature);

        request.addHeader(AUTHORIZATION_HEADER, builder.toString());
        request.addHeader(NONCE_HEADER, nonce);
        request.addHeader("Date", date);
    }

    private String hash(String text) throws AmazonClientException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            return toHex(md.digest());
        } catch (Exception e) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e.getMessage(), e);
        }
    }

    private String toHex(byte[] data) {
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (int i = 0; i < data.length; i++) {
            String hex = Integer.toHexString(data[i]);
            if (hex.length() == 1) {
                // Append leading zero.
                sb.append("0");
            } else if (hex.length() == 8) {
                // Remove ff prefix from negative numbers.
                hex = hex.substring(6);
            }
            sb.append(hex);
        }
        return sb.toString().toLowerCase(Locale.getDefault());
    }

    protected String getCanonicalizedHeadersForStringToSign(Request<?> request) {
        SortedMap<String, String> sortedHeaderMap = new TreeMap<String, String>();
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            String key = entry.getKey().toLowerCase();
            if (key.startsWith("x-amz") || key.equals("date") || key.equals("content-length")) {
                sortedHeaderMap.put(key, entry.getValue());
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedHeaderMap.entrySet()) {
            builder.append(entry.getKey()).append(":")
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
