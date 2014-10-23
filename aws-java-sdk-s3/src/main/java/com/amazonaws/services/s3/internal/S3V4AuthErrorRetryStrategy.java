/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Immutable;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.retry.internal.AuthErrorRetryStrategy;
import com.amazonaws.retry.internal.AuthRetryParameters;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * The internal implementation of AuthErrorRetryStrategy which automatically
 * switches to V4 signer when the S3 returns auth error asking for v4
 * authentication.
 */
@Immutable
public class S3V4AuthErrorRetryStrategy implements AuthErrorRetryStrategy {

    private static Log log = LogFactory.getLog(AmazonS3Client.class);

    private static final String V4_REGION_WARNING =
            "please use region-specific endpoint to access " +
            "buckets located in regions that require V4 signing.";

    private final String bucketName;

    public S3V4AuthErrorRetryStrategy(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public AuthRetryParameters shouldRetryWithAuthParam(Request<?> originalRequest,
            AmazonServiceException ase) {

        /*
         * If we get an auth error asking us to use v4 signer, retry the request with
         *  - v4 signer
         *  - virtual-host style addressing
         *  - "s3-external-1.amazonaws.com" as the service endpoint
         *  - "us-east-1" as the signer region
         * This will trigger a 307 which will then redirect us to the correct region.
         */
        if ( isAwsV4SigningRequiredError(ase) ) {
            if ( !BucketNameUtils.isDNSBucketName(bucketName) ) {
                throw new AmazonClientException(V4_REGION_WARNING, ase);
            }

            AWSS3V4Signer v4Signer = new AWSS3V4Signer();
            v4Signer.setRegionName("us-east-1");
            v4Signer.setServiceName("s3");

            URI bucketEndpoint = null;
            try {
                bucketEndpoint = new URI(String.format(
                        "https://%s.s3-external-1.amazonaws.com", bucketName));
            } catch (URISyntaxException e) {
                throw new AmazonClientException(
                        "Failed to re-send the request to \"s3-external-1.amazonaws.com\". " +
                        V4_REGION_WARNING, e);
            }

            log.warn("Attempting to re-send the request to " +
                    bucketEndpoint.getHost() + " with AWS V4 authentication. " +
                    "To avoid this warning in the future, " +
                    V4_REGION_WARNING);

            return new AuthRetryParameters(v4Signer, bucketEndpoint);
        }

        return null;
    }

    /**
     * Returns true if the given AWS service exception indicates an auth error
     * asking for V4 authentication.
     */
    private static boolean isAwsV4SigningRequiredError(AmazonServiceException ase) {
        if (ase == null) return false;

        final String INVALID_REQUEST = "InvalidRequest";
        final String PLEASE_USE_SIGV4 = "Please use AWS4-HMAC-SHA256.";

        String errorCode = ase.getErrorCode();
        String errorMsg  = ase.getErrorMessage();

        return INVALID_REQUEST.equalsIgnoreCase(errorCode) &&
                errorMsg != null && errorMsg.contains(PLEASE_USE_SIGV4);
    }
}
