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
package com.amazonaws.services.s3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.Request;
import com.amazonaws.SignableRequest;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.util.SdkHttpUtils;

/**
 * Implementation of the {@linkplain Signer} interface specific to S3's signing
 * algorithm.
 */
public class S3Signer extends AbstractAWSSigner {

    /** Shared log for signing debug output */
    private static final Log log = LogFactory.getLog(S3Signer.class);

    /**
     * The HTTP verb (GET, PUT, HEAD, DELETE) the request to sign is using.
     *
     * TODO: We need to know the HTTP verb in order to create the authentication
     * signature, but we don't have easy access to it through the request
     * object.
     *
     * Maybe it'd be better for the S3 signer (or all signers?) to work directly
     * off of the HttpRequest instead of the Request object?
     */
    private final String httpVerb;

    /**
     * The canonical resource path portion of the S3 string to sign. Examples:
     * "/", "/<bucket name>/", or "/<bucket name>/<key>"
     *
     * TODO: We don't want to hold the resource path as member data in the S3
     * signer, but we need access to it and can't get it through the request
     * yet.
     */
    private final String resourcePath;

    /**
     * The names of all the user-specified query parameters that should be
     * included in the canonical request, in addition to those default
     * parameters that are always signed.
     *
     * @see RestUtils#makeS3CanonicalString(String, String, Request, String)
     */
    private final Set<String> additionalQueryParamsToSign;

    /**
     * Create a dummy instance of the S3Signer. This constructor will be invoked
     * by internal config via reflection.
     */
    public S3Signer() {
        /*
         * NOTE: don't delegate to the other ctors, otherwise an IAE will be
         * thrown since the resourcePath is lazily initialized to null.
         */
        this.httpVerb = null;
        this.resourcePath = null;
        this.additionalQueryParamsToSign = null;
    }

    /**
     * Constructs a new S3Signer to sign requests based on the AWS credentials,
     * HTTP method and canonical S3 resource path.
     *
     * @param httpVerb
     *            The HTTP verb (GET, PUT, POST, HEAD, DELETE) the request is
     *            using.
     * @param resourcePath
     *            The canonical S3 resource path (ex: "/", "/<bucket name>/", or
     *            "/<bucket name>/<key>".
     */
    public S3Signer(String httpVerb, String resourcePath) {
        this(httpVerb, resourcePath, null);
    }

    /**
     * Constructs a new S3Signer to sign requests based on the AWS credentials,
     * HTTP method and canonical S3 resource path.
     *
     * @param httpVerb
     *            The HTTP verb (GET, PUT, POST, HEAD, DELETE) the request is
     *            using.
     * @param resourcePath
     *            The canonical S3 resource path (ex: "/", "/<bucket name>/", or
     *            "/<bucket name>/<key>".
     * @param additionalQueryParamsToSign
     *            A collection of user-specified query parameters that should be
     *            included in the canonical request, in addition to those
     *            default parameters that are always signed.
     *
     * @see RestUtils#makeS3CanonicalString(String, String, Request, String)
     */
    public S3Signer(String httpVerb, String resourcePath,
            Collection<String> additionalQueryParamsToSign) {
        if (resourcePath == null)
            throw new IllegalArgumentException(
                    "Parameter resourcePath is empty");

        this.httpVerb = httpVerb;
        this.resourcePath = resourcePath;
        this.additionalQueryParamsToSign = additionalQueryParamsToSign == null
                ? null
                : Collections.unmodifiableSet(new HashSet<String>(
                        additionalQueryParamsToSign));
    }

    @Override
    public void sign(SignableRequest<?> request, AWSCredentials credentials) {

        if (resourcePath == null) {
            throw new UnsupportedOperationException(
                    "Cannot sign a request using a dummy S3Signer instance with "
                            + "no resource path");
        }

        if (credentials == null || credentials.getAWSSecretKey() == null) {
            log.debug("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        if (sanitizedCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request,
                    (AWSSessionCredentials) sanitizedCredentials);
        }

        /*
         * In s3 sigv2, the way slash characters are encoded should be
         * consistent in both the request url and the encoded resource path.
         * Since we have to encode "//" to "/%2F" in the request url to make
         * httpclient works, we need to do the same encoding here for the
         * resource path.
         */
        String encodedResourcePath = SdkHttpUtils.appendUri(
                request.getEndpoint().getPath(), SdkHttpUtils.urlEncode(resourcePath, true),
                true);

        int timeOffset = request.getTimeOffset();
        Date date = getSignatureDate(timeOffset);
        request.addHeader(Headers.DATE, ServiceUtils.formatRfc822Date(date));
        String canonicalString = RestUtils.makeS3CanonicalString(httpVerb,
                encodedResourcePath, request, null, additionalQueryParamsToSign);
        log.debug("Calculated string to sign:\n\"" + canonicalString + "\"");

        String signature = super.signAndBase64Encode(canonicalString,
                sanitizedCredentials.getAWSSecretKey(),
                SigningAlgorithm.HmacSHA1);
        request.addHeader("Authorization",
                "AWS " + sanitizedCredentials.getAWSAccessKeyId() + ":"
                        + signature);
    }

    @Override
    protected void addSessionCredentials(SignableRequest<?> request,
            AWSSessionCredentials credentials) {
        request.addHeader("x-amz-security-token", credentials.getSessionToken());
    }
}
