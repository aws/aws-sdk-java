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

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.amazonaws.annotation.Immutable;

import com.amazonaws.SdkClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.internal.SdkPredicate;
import com.amazonaws.regions.Regions;
import com.amazonaws.retry.internal.AuthErrorRetryStrategy;
import com.amazonaws.retry.internal.AuthRetryParameters;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.util.StringUtils;

/**
 * The internal implementation of AuthErrorRetryStrategy which automatically switches to V4 signer
 * when the S3 returns auth error asking for v4 authentication.
 */
@Immutable
public class S3V4AuthErrorRetryStrategy implements AuthErrorRetryStrategy {

    private static Log log = LogFactory.getLog(S3V4AuthErrorRetryStrategy.class);

    private static final String V4_REGION_WARNING = "please use region-specific endpoint to access "
            + "buckets located in regions that require V4 signing.";

    private final S3RequestEndpointResolver endpointResolver;
    private final SdkPredicate<AmazonServiceException> sigV4RetryPredicate;

    public S3V4AuthErrorRetryStrategy(S3RequestEndpointResolver endpointResolver) {
        this(endpointResolver, new IsSigV4RetryablePredicate());
    }

    /**
     * Currently only used for testing
     */
    S3V4AuthErrorRetryStrategy(S3RequestEndpointResolver endpointResolver,
            SdkPredicate<AmazonServiceException> isSigV4Retryable) {
        this.endpointResolver = endpointResolver;
        this.sigV4RetryPredicate = isSigV4Retryable;
    }

    @Override
    public AuthRetryParameters shouldRetryWithAuthParam(Request<?> request,
                                                        HttpResponse response,
                                                        AmazonServiceException ase) {
        if (!sigV4RetryPredicate.test(ase)) {
            return null;
        }
        if (hasServingRegionHeader(response)) {
            return redirectToRegionInHeader(request, response);
        } else if (canUseVirtualAddressing()) {
            return redirectToS3External();
        } else {
            throw new SdkClientException(V4_REGION_WARNING, ase);
        }
    }

    private boolean canUseVirtualAddressing() {
        return BucketNameUtils.isDNSBucketName(endpointResolver.getBucketName());
    }

    private AuthRetryParameters redirectToRegionInHeader(Request<?> request, HttpResponse response) {
        final String region = getServingRegionHeader(response);
        AWSS3V4Signer v4Signer = buildSigV4Signer(region);
        endpointResolver.resolveRequestEndpoint(request, region);
        return buildRetryParams(v4Signer, request.getEndpoint());
    }

    /**
     * If the response doesn't have the x-amz-region header we have to resort to sending a request
     * to s3-external-1
     *
     * @return
     */
    private AuthRetryParameters redirectToS3External() {
        AWSS3V4Signer v4Signer = buildSigV4Signer(Regions.US_EAST_1.getName());
        try {
            URI bucketEndpoint = new URI(
                    String.format("https://%s.s3-external-1.amazonaws.com", endpointResolver.getBucketName()));
            return buildRetryParams(v4Signer, bucketEndpoint);
        } catch (URISyntaxException e) {
            throw new SdkClientException(
                    "Failed to re-send the request to \"s3-external-1.amazonaws.com\". " + V4_REGION_WARNING, e);
        }
    }

    private AWSS3V4Signer buildSigV4Signer(final String region) {
        AWSS3V4Signer v4Signer = new AWSS3V4Signer();
        v4Signer.setRegionName(region);
        v4Signer.setServiceName(AmazonS3Client.S3_SERVICE_NAME);
        return v4Signer;
    }

    private AuthRetryParameters buildRetryParams(AWSS3V4Signer signer, URI endpoint) {
        log.warn("Attempting to re-send the request to " + endpoint.getHost() + " with AWS V4 authentication. "
                + "To avoid this warning in the future, " + V4_REGION_WARNING);
        return new AuthRetryParameters(signer, endpoint);
    }

    private static boolean hasServingRegionHeader(HttpResponse response) {
        return !StringUtils.isNullOrEmpty(getServingRegionHeader(response));
    }

    private static String getServingRegionHeader(HttpResponse response) {
        return response.getHeaders().get(Headers.S3_SERVING_REGION);
    }
}
