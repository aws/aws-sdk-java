/*
 * Copyright 2013-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    protected static final String ALGORITHM = "AWS4-HMAC-SHA256";
    protected static final String TERMINATOR = "aws4_request";

    /**
     * Service name override for use when the endpoint can't be used to
     * determine the service name.
     */
    protected String serviceName;

    /**
     * Region name override for use when the endpoint can't be used to
     * determine the region name.
     */
    protected String regionName;

    /** Date override for testing only */
    protected Date overriddenDate;
    
    /**
     * Whether double url-encode the resource path when constructing the
     * canonical request. By default, we enable double url-encoding.
     * 
     * TODO: Different sigv4 services seem to be inconsistent on this. So for
     * services that want to suppress this, they should use new AWS4Signer(false).
     */
    protected boolean doubleUrlEncode;

    /**
     * Construct a new AWS4 signer instance.
     * By default, enable double url-encoding.
     */
    public AWS4Signer() {
        this(true);
    }
    
    /**
     * Construct a new AWS4 signer instance.
     * 
     * @param doubleUrlEncoding
     *            Whether double url-encode the resource path when constructing
     *            the canonical request.
     */
    public AWS4Signer(boolean doubleUrlEncoding) {
        this.doubleUrlEncode = doubleUrlEncoding;
    }

    protected ThreadLocal<SimpleDateFormat> dateTimeFormat = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
            dateTimeFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
            return dateTimeFormat;
        }
    };

    protected ThreadLocal<SimpleDateFormat> dateStampFormat = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            final SimpleDateFormat dateStampFormat = new SimpleDateFormat("yyyyMMdd");
            dateStampFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
            return dateStampFormat;
        }
    };

    protected static final Log log = LogFactory.getLog(AWS4Signer.class);


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

        addHostHeader(request);

        Date date = getDateFromRequest(request);

        String scope =  getScope(request, date);

        String contentSha256 = calculateContentHash(request);

        request.addHeader("X-Amz-Date", getDateTimeStamp(date));

        if (request.getHeaders().get("x-amz-content-sha256") != null && request.getHeaders().get("x-amz-content-sha256").equals("required")) {
            request.addHeader("x-amz-content-sha256", contentSha256);
        }

        String signingCredentials = sanitizedCredentials.getAWSAccessKeyId() + "/" + scope;

        HeaderSigningResult headerSigningResult = computeSignature(request, date, ALGORITHM, contentSha256, sanitizedCredentials);

        String credentialsAuthorizationHeader =
                "Credential=" + signingCredentials;
        String signedHeadersAuthorizationHeader =
                "SignedHeaders=" + getSignedHeadersString(request);
        String signatureAuthorizationHeader =
                "Signature=" + BinaryUtils.toHex(headerSigningResult.getSignature());

        String authorizationHeader = ALGORITHM + " "
                + credentialsAuthorizationHeader + ", "
                + signedHeadersAuthorizationHeader + ", "
                + signatureAuthorizationHeader;

        request.addHeader("Authorization", authorizationHeader);

        processRequestPayload(request, headerSigningResult);
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

    protected String extractRegionName(URI endpoint) {
        if (regionName != null) return regionName;

        return AwsHostNameUtils.parseRegionName(endpoint);
    }

    protected String extractServiceName(URI endpoint) {
        if (serviceName != null) return serviceName;

        return AwsHostNameUtils.parseServiceName(endpoint);
    }


    void overrideDate(Date overriddenDate) {
        this.overriddenDate = overriddenDate;
    }

    protected String getCanonicalizedHeaderString(Request<?> request) {
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

    protected String getSignedHeadersString(Request<?> request) {
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

    protected String getCanonicalRequest(Request<?> request, String contentSha256) {
        /* This would url-encode the resource path for the first time */
        String path = HttpUtils.appendUri(request.getEndpoint().getPath(), request.getResourcePath());

        String canonicalRequest =
                request.getHttpMethod().toString() + "\n" +
        /* This would optionally double url-encode the resource path */
                        getCanonicalizedResourcePath(path, doubleUrlEncode) + "\n" +
                        getCanonicalizedQueryString(request) + "\n" +
                        getCanonicalizedHeaderString(request) + "\n" +
                        getSignedHeadersString(request) + "\n" +
                        contentSha256;
        log.debug("AWS4 Canonical Request: '\"" + canonicalRequest + "\"");
        return canonicalRequest;
    }

    protected String getStringToSign(String algorithm, String dateTime, String scope, String canonicalRequest) {
        String stringToSign =
                algorithm + "\n" +
                        dateTime + "\n" +
                        scope + "\n" +
                        BinaryUtils.toHex(hash(canonicalRequest));
        log.debug("AWS4 String to Sign: '\"" + stringToSign + "\"");
        return stringToSign;
    }


    protected HeaderSigningResult computeSignature(Request<?> request, Date date, String algorithm, String contentSha256, AWSCredentials sanitizedCredentials) {

        String regionName = extractRegionName(request.getEndpoint());
        String serviceName = extractServiceName(request.getEndpoint());

        String dateTime = getDateTimeStamp(date);
        String dateStamp = getDateStamp(date);
        String scope =  dateStamp + "/" + regionName + "/" + serviceName + "/" + TERMINATOR;

        String stringToSign = getStringToSign(algorithm, dateTime, scope, getCanonicalRequest(request,contentSha256 ));

        // AWS4 uses a series of derived keys, formed by hashing different
        // pieces of data
        byte[] kSecret = ("AWS4" + sanitizedCredentials.getAWSSecretKey()).getBytes();
        byte[] kDate = sign(dateStamp, kSecret, SigningAlgorithm.HmacSHA256);
        byte[] kRegion = sign(regionName, kDate, SigningAlgorithm.HmacSHA256);
        byte[] kService = sign(serviceName, kRegion, SigningAlgorithm.HmacSHA256);
        byte[] kSigning = sign(TERMINATOR, kService, SigningAlgorithm.HmacSHA256);

        byte[] signature = sign(stringToSign.getBytes(), kSigning, SigningAlgorithm.HmacSHA256);
        return new HeaderSigningResult(dateTime, scope, kSigning, signature);
    }

    protected String getDateTimeStamp(Date date) {
        return dateTimeFormat.get().format(date);
    }

    protected String getDateStamp(Date date) {
        return dateStampFormat.get().format(date);
    }

    protected Date getDateFromRequest(Request<?> request) {
    	int timeOffset = getTimeOffset(request);
        Date date = getSignatureDate(timeOffset);
        if (overriddenDate != null) date = overriddenDate;
        return date;
    }


    protected void addHostHeader(Request<?> request) {
        // AWS4 requires that we sign the Host header so we
        // have to have it in the request by the time we sign.
        String hostHeader = request.getEndpoint().getHost();
        if (HttpUtils.isUsingNonDefaultPort(request.getEndpoint())) {
            hostHeader += ":" + request.getEndpoint().getPort();
        }
        request.addHeader("Host", hostHeader);
    }

    protected String getScope(Request<?> request, Date date) {
        String regionName = extractRegionName(request.getEndpoint());
        String serviceName = extractServiceName(request.getEndpoint());

        String dateStamp = getDateStamp(date);
        String scope =  dateStamp + "/" + regionName + "/" + serviceName + "/" + TERMINATOR;
        return scope;
    }

    /**
     * Calculate the hash of the request's payload.
     * Subclass could override this method to provide different values for "x-amz-content-sha256" header
     * or do any other necessary set-ups on the request headers.
     * (e.g. aws-chunked uses a pre-defined header value, and needs to change some headers
     * relating to content-encoding and content-length.)
     */
    protected String calculateContentHash(Request<?> request) {
        InputStream payloadStream = getBinaryRequestPayloadStream(request);
        payloadStream.mark(-1);
        String contentSha256 = BinaryUtils.toHex(hash(payloadStream));
        try {
            payloadStream.reset();
        } catch (IOException e) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
        }
        return contentSha256;
    }

    /**
     * Subclass could override this method to perform any additional procedure on the request
     * payload, with access to the result from signing the header. (e.g. Signing the payload by
     * chunk-encoding).
     * The default implementation doesn't need to do anything.
     */
    protected void processRequestPayload(Request<?> request, HeaderSigningResult headerSigningResult) {
        return;
    }

    protected static class HeaderSigningResult {

        private String dateTime;
        private String scope;
        private byte[] kSigning;
        private byte[] signature;

        public HeaderSigningResult(String dateTime, String scope, byte[] kSigning, byte[] signature) {
            this.dateTime = dateTime;
            this.scope = scope;
            this.kSigning = kSigning;
            this.signature = signature;
        }

        public String getDateTime() {
            return dateTime;
        }

        public String getScope() {
            return scope;
        }

        public byte[] getKSigning() {
            byte[] kSigningCopy = new byte[kSigning.length];
            System.arraycopy(kSigning, 0, kSigningCopy, 0, kSigning.length);
            return kSigningCopy;
        }

        public byte[] getSignature() {
            byte[] signatureCopy = new byte[signature.length];
            System.arraycopy(signature, 0, signatureCopy, 0, signature.length);
            return signatureCopy;
        }
    }
}
