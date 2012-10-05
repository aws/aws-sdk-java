/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.HttpUtils;

/**
 * Signer implementation that signs requests with the AWS4 signing protocol.
 */
public class AWS4Signer extends AbstractAWSSigner {

    private static final String ALGORITHM = "AWS4-HMAC-SHA256";
    private static final String TERMINATOR = "aws4_request";

    /**
     * Service name override for use when the endpoint can't be used to
     * determine the service name.
     */
    private String serviceName;

    /**
     * Region name override for use when the endpoint can't be used to
     * determine the region name.
     */
    private String regionName;

    /** Date override for testing only */
    private Date overriddenDate;

    private static final Log log = LogFactory.getLog(AWS4Signer.class);


    /* (non-Javadoc)
     * @see com.amazonaws.auth.Signer#sign(com.amazonaws.Request, com.amazonaws.auth.AWSCredentials)
     */
    public void sign(Request<?> request, AWSCredentials credentials) throws AmazonClientException {
        // annonymous credentials, don't sign
        if ( credentials instanceof AnonymousAWSCredentials ) {
            return;
        }

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        if ( sanitizedCredentials instanceof AWSSessionCredentials ) {
            addSessionCredentials(request, (AWSSessionCredentials) sanitizedCredentials);
        }

        SimpleDateFormat dateStampFormat = new SimpleDateFormat("yyyyMMdd");
        dateStampFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));

        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        dateTimeFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));

        String regionName  = extractRegionName(request.getEndpoint());
        String serviceName = extractServiceName(request.getEndpoint());

        // AWS4 requires that we sign the Host header so we
        // have to have it in the request by the time we sign.
        String hostHeader = request.getEndpoint().getHost();
        if (HttpUtils.isUsingNonDefaultPort(request.getEndpoint())) {
            hostHeader += ":" + request.getEndpoint().getPort();
        }
        request.addHeader("Host", hostHeader);

        Date date = new Date();
        if (overriddenDate != null) date = overriddenDate;

        String dateTime  = dateTimeFormat.format(date);
        String dateStamp = dateStampFormat.format(date);

        InputStream payloadStream = getBinaryRequestPayloadStream(request);
        payloadStream.mark(-1);
        String contentSha256 = BinaryUtils.toHex(hash(payloadStream));
        try {
            payloadStream.reset();
        } catch (IOException e) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
        }

        request.addHeader("X-Amz-Date", dateTime);
        request.addHeader("x-amz-content-sha256", contentSha256);

        String canonicalRequest =
                request.getHttpMethod().toString() + "\n" +
                        super.getCanonicalizedResourcePath(request.getResourcePath()) + "\n" +
                        getCanonicalizedQueryString(request) + "\n" +
                        getCanonicalizedHeaderString(request) + "\n" +
                        getSignedHeadersString(request) + "\n" +
                        contentSha256;

        log.debug("AWS4 Canonical Request: '\"" + canonicalRequest + "\"");

        String scope = dateStamp + "/" + regionName + "/" + serviceName + "/" + TERMINATOR;
        String signingCredentials = sanitizedCredentials.getAWSAccessKeyId() + "/" + scope;
        String stringToSign =
                ALGORITHM + "\n" +
                        dateTime + "\n" +
                        scope + "\n" +
                        BinaryUtils.toHex(hash(canonicalRequest));
        log.debug("AWS4 String to Sign: '\"" + stringToSign + "\"");

        // AWS4 uses a series of derived keys, formed by hashing different pieces of data
        byte[] kSecret  = ("AWS4" + sanitizedCredentials.getAWSSecretKey()).getBytes();
        byte[] kDate    = sign(dateStamp, kSecret, SigningAlgorithm.HmacSHA256);
        byte[] kRegion  = sign(regionName, kDate, SigningAlgorithm.HmacSHA256);
        byte[] kService = sign(serviceName, kRegion, SigningAlgorithm.HmacSHA256);
        byte[] kSigning = sign(TERMINATOR, kService, SigningAlgorithm.HmacSHA256);

        byte[] signature = sign(stringToSign.getBytes(), kSigning, SigningAlgorithm.HmacSHA256);

        String credentialsAuthorizationHeader =
                "Credential=" + signingCredentials;
        String signedHeadersAuthorizationHeader =
                "SignedHeaders=" + getSignedHeadersString(request);
        String signatureAuthorizationHeader =
                "Signature=" + BinaryUtils.toHex(signature);

        String authorizationHeader = ALGORITHM + " "
                + credentialsAuthorizationHeader + ", "
                + signedHeadersAuthorizationHeader + ", "
                + signatureAuthorizationHeader;

        request.addHeader("Authorization", authorizationHeader);
    }

    /**
     * Sets the service name that this signer should use when calculating
     * request signatures. This can almost always be determined directly from
     * the request's end point, so you shouldn't need this method, but it's
     * provided for the edge case where the information is not in the endpoint.
     *
     * @param serviceName
     *            The service name to use when calculating signatures in this
     *            signer.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Sets the region name that this signer should use when calculating request
     * signatures. This can almost always be determined directly from the
     * request's end point, so you shouldn't need this method, but it's provided
     * for the edge case where the information is not in the endpoint.
     *
     * @param regionName
     *            The region name to use when calculating signatures in this
     *            signer.
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    protected void addSessionCredentials(Request<?> request, AWSSessionCredentials credentials) {
        request.addHeader("x-amz-security-token", credentials.getSessionToken());
    }

    private String extractRegionName(URI endpoint) {
        if (regionName != null) return regionName;

        return AwsHostNameUtils.parseRegionName(endpoint);
    }

    private String extractServiceName(URI endpoint) {
        if (serviceName != null) return serviceName;

        return AwsHostNameUtils.parseServiceName(endpoint);
    }


    void overrideDate(Date overriddenDate) {
        this.overriddenDate = overriddenDate;
    }

    private String getCanonicalizedHeaderString(Request<?> request) {
        List<String> sortedHeaders = new ArrayList<String>();
        sortedHeaders.addAll(request.getHeaders().keySet());
        Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);

        StringBuilder buffer = new StringBuilder();
        for (String header : sortedHeaders) {
            buffer.append(header.toLowerCase().replaceAll("\\s+", " ") + ":" + request.getHeaders().get(header).replaceAll("\\s+", " "));
            buffer.append("\n");
        }

        return buffer.toString();
    }

    private String getSignedHeadersString(Request<?> request) {
        List<String> sortedHeaders = new ArrayList<String>();
        sortedHeaders.addAll(request.getHeaders().keySet());
        Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);

        StringBuilder buffer = new StringBuilder();
        for (String header : sortedHeaders) {
            if (buffer.length() > 0) buffer.append(";");
            buffer.append(header.toLowerCase());
        }

        return buffer.toString();
    }

}
