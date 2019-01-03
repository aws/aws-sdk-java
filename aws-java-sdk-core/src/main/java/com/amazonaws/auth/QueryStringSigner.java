/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;

import com.amazonaws.SdkClientException;
import com.amazonaws.SignableRequest;

/**
 * Signer implementation responsible for signing an AWS query string request
 * according to the various signature versions and hashing algorithms.
 */
public class QueryStringSigner extends AbstractAWSSigner implements Signer {
    /** Date override for testing only */
    private Date overriddenDate;

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
    public void sign(SignableRequest<?> request, AWSCredentials credentials)
            throws SdkClientException {
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
    public void sign(SignableRequest<?> request, SignatureVersion version,
            SigningAlgorithm algorithm, AWSCredentials credentials)
            throws SdkClientException {
        // annonymous credentials, don't sign
        if ( credentials instanceof AnonymousAWSCredentials ) {
            return;
        }

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        request.addParameter("AWSAccessKeyId", sanitizedCredentials.getAWSAccessKeyId());
        request.addParameter("SignatureVersion", version.toString());

        int timeOffset = request.getTimeOffset();
        request.addParameter("Timestamp", getFormattedTimestamp(timeOffset));

        if ( sanitizedCredentials instanceof AWSSessionCredentials ) {
            addSessionCredentials(request, (AWSSessionCredentials) sanitizedCredentials);
        }

        String stringToSign = null;
        if ( version.equals( SignatureVersion.V1 ) ) {
            stringToSign = calculateStringToSignV1(request.getParameters());
        } else if ( version.equals( SignatureVersion.V2 ) ) {
            request.addParameter("SignatureMethod", algorithm.toString());
            stringToSign = calculateStringToSignV2(request);
        } else {
            throw new SdkClientException("Invalid Signature Version specified");
        }

        String signatureValue = signAndBase64Encode(stringToSign,
                sanitizedCredentials.getAWSSecretKey(), algorithm);
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
    private String calculateStringToSignV1(Map<String, List<String>> parameters) {
        StringBuilder data = new StringBuilder();
        SortedMap<String, List<String>> sorted =
            new TreeMap<String, List<String>>(String.CASE_INSENSITIVE_ORDER);
        sorted.putAll(parameters);

        for (Map.Entry<String, List<String>> entry : sorted.entrySet()) {
            for (String value : entry.getValue()) {
                data.append(entry.getKey())
                    .append(value);
            }
        }

        return data.toString();
    }

    /**
     * Calculate string to sign for signature version 2.
     *
     * @param request
     *            The request being signed.
     *
     * @return String to sign
     *
     * @throws SdkClientException
     *             If the string to sign cannot be calculated.
     */
    private String calculateStringToSignV2(SignableRequest<?> request) throws SdkClientException {
        URI endpoint = request.getEndpoint();

        StringBuilder data = new StringBuilder();
        data.append("POST")
            .append("\n")
            .append(getCanonicalizedEndpoint(endpoint))
            .append("\n")
            .append(getCanonicalizedResourcePath(request))
            .append("\n")
            .append(getCanonicalizedQueryString(request.getParameters()));
        return data.toString();
    }

    private String getCanonicalizedResourcePath(SignableRequest<?> request) {
        String resourcePath = "";

        if (request.getEndpoint().getPath() != null) {
            resourcePath += request.getEndpoint().getPath();
        }

        if (request.getResourcePath() != null) {
            if (resourcePath.length() > 0 &&
                !resourcePath.endsWith("/") &&
                !request.getResourcePath().startsWith("/")) {
                resourcePath += "/";
            }

            resourcePath += request.getResourcePath();
        } else if (!resourcePath.endsWith("/")) {
            resourcePath += "/";
        }

        if (!resourcePath.startsWith("/")) {
            resourcePath = "/" + resourcePath;
        }

        if (resourcePath.startsWith("//")) {
            resourcePath = resourcePath.substring(1);
        }

        return resourcePath;
    }

    /**
     * Formats date as ISO 8601 timestamp
     */
    private String getFormattedTimestamp(int offset) {
        SimpleDateFormat df = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        if (overriddenDate != null) {
            return df.format(overriddenDate);
        } else {
            return df.format(getSignatureDate(offset));
        }
    }

    /** For testing purposes only, to control the date used in signing. */
    void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    @Override
    protected void addSessionCredentials(SignableRequest<?> request, AWSSessionCredentials credentials) {
        request.addParameter("SecurityToken", credentials.getSessionToken());
    }
}
