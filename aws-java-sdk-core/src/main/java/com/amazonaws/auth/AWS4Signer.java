/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.ReadLimitInfo;
import com.amazonaws.SdkClientException;
import com.amazonaws.SignableRequest;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.internal.AWS4SignerRequestParams;
import com.amazonaws.auth.internal.AWS4SignerUtils;
import com.amazonaws.auth.internal.SignerKey;
import com.amazonaws.internal.FIFOCache;
import com.amazonaws.log.InternalLogApi;
import com.amazonaws.log.InternalLogFactory;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.amazonaws.auth.internal.SignerConstants.AUTHORIZATION;
import static com.amazonaws.auth.internal.SignerConstants.AWS4_SIGNING_ALGORITHM;
import static com.amazonaws.auth.internal.SignerConstants.AWS4_TERMINATOR;
import static com.amazonaws.auth.internal.SignerConstants.HOST;
import static com.amazonaws.auth.internal.SignerConstants.LINE_SEPARATOR;
import static com.amazonaws.auth.internal.SignerConstants.PRESIGN_URL_MAX_EXPIRATION_SECONDS;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_ALGORITHM;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_CONTENT_SHA256;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_CREDENTIAL;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_DATE;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_EXPIRES;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_SECURITY_TOKEN;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_SIGNATURE;
import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_SIGNED_HEADER;

/**
 * Signer implementation that signs requests with the AWS4 signing protocol.
 */
public class AWS4Signer extends AbstractAWSSigner implements
        ServiceAwareSigner, RegionAwareSigner, Presigner, EndpointPrefixAwareSigner {

    protected static final InternalLogApi log = InternalLogFactory.getLog(AWS4Signer.class);
    private static final int SIGNER_CACHE_MAX_SIZE = 300;
    private static final FIFOCache<SignerKey> signerCache = new FIFOCache<SignerKey>(SIGNER_CACHE_MAX_SIZE);
    private static final List<String> listOfHeadersToIgnoreInLowerCase = Arrays.asList("connection", "x-amzn-trace-id");

    private final SdkClock clock;

    /**
     * Service name override for use when the endpoint can't be used to
     * determine the service name.
     */
    protected String serviceName;

    /**
     * Endpoint prefix to compute the region name for signing
     * when the {@link #regionName} is null.
     */
    private String endpointPrefix;

    /**
     * Region name override for use when the endpoint can't be used to determine
     * the region name.
     */
    protected String regionName;

    /** Date override for testing only */
    protected Date overriddenDate;

    /**
     * Whether double url-encode the resource path when constructing the
     * canonical request. By default, we enable double url-encoding.
     *
     * TODO: Different sigv4 services seem to be inconsistent on this. So for
     * services that want to suppress this, they should use new
     * AWS4Signer(false).
     */
    protected boolean doubleUrlEncode;

    /**
     * Construct a new AWS4 signer instance. By default, enable double
     * url-encoding.
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
        this(doubleUrlEncoding, SdkClock.Instance.get());
    }

    @SdkTestInternalApi
    public AWS4Signer(SdkClock clock) {
        this(true, clock);
    }

    private AWS4Signer(boolean doubleUrlEncode, SdkClock clock) {
        this.doubleUrlEncode = doubleUrlEncode;
        this.clock = clock;
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
    @Override
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
    @Override
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * Sets the endpoint prefix which is used to compute the region that is
     * used for signing the request.
     *
     * This value is passed to {@link AWS4SignerRequestParams} class which
     * has the logic to compute region.
     *
     * @param endpointPrefix The endpoint prefix of the service
     */
    @Override
    public void setEndpointPrefix(String endpointPrefix) {
        this.endpointPrefix = endpointPrefix;
    }

    /**
     * Sets the date that overrides the signing date in the request. This method
     * is internal and should be used only for testing purposes.
     */
    @SdkTestInternalApi
    public void setOverrideDate(Date overriddenDate) {
        if (overriddenDate != null) {
            this.overriddenDate = new Date(overriddenDate.getTime());
        } else {
            this.overriddenDate = null;
        }
    }

    /**
     * Returns the region name that is used when calculating the signature.
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Returns the service name that is used when calculating the signature.
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Returns a copy of date that overrides the signing date in the request.
     * Return null by default.
     */
    public Date getOverriddenDate() {
        return overriddenDate == null ? null : new Date(
                overriddenDate.getTime());
    }

    @Override
    public void sign(SignableRequest<?> request, AWSCredentials credentials) {
        // anonymous credentials, don't sign
        if (isAnonymous(credentials)) {
            return;
        }

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        if (sanitizedCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request,
                    (AWSSessionCredentials) sanitizedCredentials);
        }

        final AWS4SignerRequestParams signerParams = new AWS4SignerRequestParams(
                request, overriddenDate, regionName, serviceName,
                AWS4_SIGNING_ALGORITHM, endpointPrefix);

        addHostHeader(request);
        request.addHeader(X_AMZ_DATE,
                signerParams.getFormattedSigningDateTime());

        String contentSha256 = calculateContentHash(request);

        if ("required".equals(request.getHeaders().get(X_AMZ_CONTENT_SHA256))) {
            request.addHeader(X_AMZ_CONTENT_SHA256, contentSha256);
        }

        final String canonicalRequest = createCanonicalRequest(request,
                contentSha256);

        final String stringToSign = createStringToSign(canonicalRequest,
                signerParams);

        final byte[] signingKey = deriveSigningKey(sanitizedCredentials,
                signerParams);

        final byte[] signature = computeSignature(stringToSign, signingKey,
                signerParams);

        request.addHeader(
                AUTHORIZATION,
                buildAuthorizationHeader(request, signature,
                        sanitizedCredentials, signerParams));

        processRequestPayload(request, signature, signingKey,
                signerParams);
    }

    @Override
    public void presignRequest(SignableRequest<?> request, AWSCredentials credentials,
            Date userSpecifiedExpirationDate) {

        // anonymous credentials, don't sign
        if (isAnonymous(credentials)) {
            return;
        }

        long expirationInSeconds = generateExpirationDate(userSpecifiedExpirationDate);

        addHostHeader(request);

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        if (sanitizedCredentials instanceof AWSSessionCredentials) {
            // For SigV4 pre-signing URL, we need to add "X-Amz-Security-Token"
            // as a query string parameter, before constructing the canonical
            // request.
            request.addParameter(X_AMZ_SECURITY_TOKEN,
                    ((AWSSessionCredentials) sanitizedCredentials)
                            .getSessionToken());
        }

        final AWS4SignerRequestParams signerRequestParams = new AWS4SignerRequestParams(
                request, overriddenDate, regionName, serviceName,
                AWS4_SIGNING_ALGORITHM, endpointPrefix);

        // Add the important parameters for v4 signing
        final String timeStamp = signerRequestParams.getFormattedSigningDateTime();

        addPreSignInformationToRequest(request, sanitizedCredentials,
                signerRequestParams, timeStamp, expirationInSeconds);

        final String contentSha256 = calculateContentHashPresign(request);

        final String canonicalRequest = createCanonicalRequest(request,
                contentSha256);

        final String stringToSign = createStringToSign(canonicalRequest,
                signerRequestParams);

        final byte[] signingKey = deriveSigningKey(sanitizedCredentials,
                signerRequestParams);

        final byte[] signature = computeSignature(stringToSign, signingKey,
                signerRequestParams);

        request.addParameter(X_AMZ_SIGNATURE, BinaryUtils.toHex(signature));
    }

    /**
     * Step 1 of the AWS Signature version 4 calculation. Refer to
     * http://docs.aws
     * .amazon.com/general/latest/gr/sigv4-create-canonical-request.html to
     * generate the canonical request.
     */
    protected String createCanonicalRequest(SignableRequest<?> request,
            String contentSha256) {
        /* This would url-encode the resource path for the first time. */
        final String path = SdkHttpUtils.appendUri(
                request.getEndpoint().getPath(), request.getResourcePath());

        final StringBuilder canonicalRequestBuilder = new StringBuilder(request
                .getHttpMethod().toString());

        canonicalRequestBuilder.append(LINE_SEPARATOR)
                // This would optionally double url-encode the resource path
                .append(getCanonicalizedResourcePath(path, doubleUrlEncode))
                .append(LINE_SEPARATOR)
                .append(getCanonicalizedQueryString(request))
                .append(LINE_SEPARATOR)
                .append(getCanonicalizedHeaderString(request))
                .append(LINE_SEPARATOR)
                .append(getSignedHeadersString(request)).append(LINE_SEPARATOR)
                .append(contentSha256);

        final String canonicalRequest = canonicalRequestBuilder.toString();

        if (log.isDebugEnabled())
            log.debug("AWS4 Canonical Request: '\"" + canonicalRequest + "\"");

        return canonicalRequest;
    }

    /**
     * Step 2 of the AWS Signature version 4 calculation. Refer to
     * http://docs.aws
     * .amazon.com/general/latest/gr/sigv4-create-string-to-sign.html.
     */
    protected String createStringToSign(String canonicalRequest,
            AWS4SignerRequestParams signerParams) {

        final StringBuilder stringToSignBuilder = new StringBuilder(
                signerParams.getSigningAlgorithm());
        stringToSignBuilder.append(LINE_SEPARATOR)
                .append(signerParams.getFormattedSigningDateTime())
                .append(LINE_SEPARATOR)
                .append(signerParams.getScope())
                .append(LINE_SEPARATOR)
                .append(BinaryUtils.toHex(hash(canonicalRequest)));

        final String stringToSign = stringToSignBuilder.toString();

        if (log.isDebugEnabled())
            log.debug("AWS4 String to Sign: '\"" + stringToSign + "\"");

        return stringToSign;
    }

    /**
     * Step 3 of the AWS Signature version 4 calculation. It involves deriving
     * the signing key and computing the signature. Refer to
     * http://docs.aws.amazon
     * .com/general/latest/gr/sigv4-calculate-signature.html
     */
    private final byte[] deriveSigningKey(AWSCredentials credentials,
            AWS4SignerRequestParams signerRequestParams) {

        final String cacheKey = computeSigningCacheKeyName(credentials,
                signerRequestParams);
        final long daysSinceEpochSigningDate = DateUtils
                .numberOfDaysSinceEpoch(signerRequestParams
                        .getSigningDateTimeMilli());

        SignerKey signerKey = signerCache.get(cacheKey);

        if (signerKey != null) {
            if (daysSinceEpochSigningDate == signerKey
                    .getNumberOfDaysSinceEpoch()) {
                return signerKey.getSigningKey();
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("Generating a new signing key as the signing key not available in the cache for the date "
                    + TimeUnit.DAYS.toMillis(daysSinceEpochSigningDate));
        }
        byte[] signingKey = newSigningKey(credentials,
                signerRequestParams.getFormattedSigningDate(),
                signerRequestParams.getRegionName(),
                signerRequestParams.getServiceName());
        signerCache.add(cacheKey, new SignerKey(
                daysSinceEpochSigningDate, signingKey));
        return signingKey;
    }

    /**
     * Computes the name to be used to reference the signing key in the cache.
     */
    private final String computeSigningCacheKeyName(AWSCredentials credentials,
            AWS4SignerRequestParams signerRequestParams) {
        final StringBuilder hashKeyBuilder = new StringBuilder(
                credentials.getAWSSecretKey());

        return hashKeyBuilder.append("-")
                .append(signerRequestParams.getRegionName())
                .append("-")
                .append(signerRequestParams.getServiceName()).toString();
    }

    /**
     * Step 3 of the AWS Signature version 4 calculation. It involves deriving
     * the signing key and computing the signature. Refer to
     * http://docs.aws.amazon
     * .com/general/latest/gr/sigv4-calculate-signature.html
     */
    protected final byte[] computeSignature(String stringToSign,
            byte[] signingKey, AWS4SignerRequestParams signerRequestParams) {
        return sign(stringToSign.getBytes(Charset.forName("UTF-8")), signingKey,
                SigningAlgorithm.HmacSHA256);
    }

    /**
     * Creates the authorization header to be included in the request.
     */
    private String buildAuthorizationHeader(SignableRequest<?> request,
            byte[] signature, AWSCredentials credentials,
            AWS4SignerRequestParams signerParams) {
        final String signingCredentials = credentials.getAWSAccessKeyId() + "/"
                + signerParams.getScope();

        final String credential = "Credential="
                + signingCredentials;
        final String signerHeaders = "SignedHeaders="
                + getSignedHeadersString(request);
        final String signatureHeader = "Signature="
                + BinaryUtils.toHex(signature);

        final StringBuilder authHeaderBuilder = new StringBuilder();

        authHeaderBuilder.append(AWS4_SIGNING_ALGORITHM)
                         .append(" ")
                         .append(credential)
                         .append(", ")
                         .append(signerHeaders)
                         .append(", ")
                         .append(signatureHeader);

        return authHeaderBuilder.toString();
    }

    /**
     * Includes all the signing headers as request parameters for pre-signing.
     */
    private void addPreSignInformationToRequest(SignableRequest<?> request,
            AWSCredentials credentials, AWS4SignerRequestParams signerParams,
            String timeStamp, long expirationInSeconds) {

        String signingCredentials = credentials.getAWSAccessKeyId() + "/"
                + signerParams.getScope();

        request.addParameter(X_AMZ_ALGORITHM, AWS4_SIGNING_ALGORITHM);
        request.addParameter(X_AMZ_DATE, timeStamp);
        request.addParameter(X_AMZ_SIGNED_HEADER,
                getSignedHeadersString(request));
        request.addParameter(X_AMZ_EXPIRES,
                Long.toString(expirationInSeconds));
        request.addParameter(X_AMZ_CREDENTIAL, signingCredentials);
    }

    @Override
    protected void addSessionCredentials(SignableRequest<?> request,
            AWSSessionCredentials credentials) {
        request.addHeader(X_AMZ_SECURITY_TOKEN, credentials.getSessionToken());
    }

    protected String getCanonicalizedHeaderString(SignableRequest<?> request) {
        final List<String> sortedHeaders = new ArrayList<String>(request.getHeaders()
                .keySet());
        Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);

        final Map<String, String> requestHeaders = request.getHeaders();
        StringBuilder buffer = new StringBuilder();
        for (String header : sortedHeaders) {
            if (shouldExcludeHeaderFromSigning(header)) {
                continue;
            }
            String key = StringUtils.lowerCase(header);
            String value = requestHeaders.get(header);

            StringUtils.appendCompactedString(buffer, key);
            buffer.append(":");
            if (value != null) {
                StringUtils.appendCompactedString(buffer, value);
            }

            buffer.append("\n");
        }

        return buffer.toString();
    }

    protected String getSignedHeadersString(SignableRequest<?> request) {
        final List<String> sortedHeaders = new ArrayList<String>(request
                .getHeaders().keySet());
        Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);

        StringBuilder buffer = new StringBuilder();
        for (String header : sortedHeaders) {
            if (shouldExcludeHeaderFromSigning(header)) {
                continue;
            }
            if (buffer.length() > 0)
                buffer.append(";");
            buffer.append(StringUtils.lowerCase(header));
        }

        return buffer.toString();
    }

    protected boolean shouldExcludeHeaderFromSigning(String header) {
        return listOfHeadersToIgnoreInLowerCase.contains(header.toLowerCase());
    }

    protected void addHostHeader(SignableRequest<?> request) {
        // AWS4 requires that we sign the Host header so we
        // have to have it in the request by the time we sign.

        final URI endpoint = request.getEndpoint();
        final StringBuilder hostHeaderBuilder = new StringBuilder(
                endpoint.getHost());
        if (SdkHttpUtils.isUsingNonDefaultPort(endpoint)) {
            hostHeaderBuilder.append(":").append(endpoint.getPort());
        }

        request.addHeader(HOST, hostHeaderBuilder.toString());
    }

    /**
     * Calculate the hash of the request's payload. Subclass could override this
     * method to provide different values for "x-amz-content-sha256" header or
     * do any other necessary set-ups on the request headers. (e.g. aws-chunked
     * uses a pre-defined header value, and needs to change some headers
     * relating to content-encoding and content-length.)
     */
    protected String calculateContentHash(SignableRequest<?> request) {
        InputStream payloadStream = getBinaryRequestPayloadStream(request);
        ReadLimitInfo info = request.getReadLimitInfo();
        payloadStream.mark(info == null ? -1 : info.getReadLimit());
        String contentSha256 = BinaryUtils.toHex(hash(payloadStream));
        try {
            payloadStream.reset();
        } catch (IOException e) {
            throw new SdkClientException(
                    "Unable to reset stream after calculating AWS4 signature",
                    e);
        }
        return contentSha256;
    }

    /**
     * Subclass could override this method to perform any additional procedure
     * on the request payload, with access to the result from signing the
     * header. (e.g. Signing the payload by chunk-encoding). The default
     * implementation doesn't need to do anything.
     */
    protected void processRequestPayload(SignableRequest<?> request, byte[] signature,
            byte[] signingKey, AWS4SignerRequestParams signerRequestParams) {
        return;
    }

    /**
     * Calculate the hash of the request's payload. In case of pre-sign, the
     * existing code would generate the hash of an empty byte array and returns
     * it. This method can be overridden by sub classes to provide different
     * values (e.g) For S3 pre-signing, the content hash calculation is
     * different from the general implementation.
     *
     */
    protected String calculateContentHashPresign(SignableRequest<?> request) {
        return calculateContentHash(request);
    }

    /**
     * Checks if the credentials is an instance of
     * <code>AnonymousAWSCredentials<code>
     */
    private boolean isAnonymous(AWSCredentials credentials) {
        return credentials instanceof AnonymousAWSCredentials;
    }

    /**
     * Generates an expiration date for the presigned url. If user has specified
     * an expiration date, check if it is in the given limit.
     */
    private long generateExpirationDate(Date expirationDate) {

        long expirationInSeconds = expirationDate != null ? ((expirationDate
                .getTime() - clock.currentTimeMillis()) / 1000L)
                : PRESIGN_URL_MAX_EXPIRATION_SECONDS;

        if (expirationInSeconds > PRESIGN_URL_MAX_EXPIRATION_SECONDS) {
            throw new SdkClientException(
                    "Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. "
                            + "The expiration date set on the current request ["
                            + AWS4SignerUtils.formatTimestamp(expirationDate
                                    .getTime()) + "] has exceeded this limit.");
        }
        return expirationInSeconds;
    }

    /**
     * Generates a new signing key from the given parameters and returns it.
     */
    protected byte[] newSigningKey(AWSCredentials credentials,
            String dateStamp, String regionName, String serviceName) {
        byte[] kSecret = ("AWS4" + credentials.getAWSSecretKey())
                .getBytes(Charset.forName("UTF-8"));
        byte[] kDate = sign(dateStamp, kSecret, SigningAlgorithm.HmacSHA256);
        byte[] kRegion = sign(regionName, kDate, SigningAlgorithm.HmacSHA256);
        byte[] kService = sign(serviceName, kRegion,
                SigningAlgorithm.HmacSHA256);
        return sign(AWS4_TERMINATOR, kService, SigningAlgorithm.HmacSHA256);
    }
}
