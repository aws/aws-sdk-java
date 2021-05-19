/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3control.internal.handlers;

import static com.amazonaws.services.s3control.AWSS3Control.ENDPOINT_PREFIX;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isAdvancedConfigFlagTrue;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isDualstackEnabled;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isFipsEnabledInClientConfig;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isFipsRegion;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.arn.Arn;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.s3.S3Resource;
import com.amazonaws.services.s3.internal.S3OutpostResource;
import com.amazonaws.services.s3.internal.UseArnRegionResolver;
import com.amazonaws.services.s3control.S3ArnableField;
import com.amazonaws.services.s3control.S3ControlClientOptions;
import com.amazonaws.services.s3control.S3ControlHandlerContextKey;
import com.amazonaws.services.s3control.internal.S3ControlArnConverter;
import com.amazonaws.services.s3control.model.CreateBucketRequest;
import com.amazonaws.services.s3control.model.ListRegionalBucketsRequest;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * {@link RequestHandler2} that modifies the endpoint to handle virtual addressing (account id hoisting),
 * Dual-Stack, and FIPS.
 */
@SdkInternalApi
public final class EndpointHandler extends RequestHandler2 {
    private static final UseArnRegionResolver USE_ARN_REGION_RESOLVER = new UseArnRegionResolver();
    private static final String X_AMZ_OUTPOST_ID_HEADER = "x-amz-outpost-id";

    @Override
    public void beforeRequest(Request<?> request) {
        Arn requestArn = getRequestArn(request);

        if (requestArn != null) {
            resolveHostForOutpostArnRequest(request, requestArn);
        } else if (isNonArnOutpostRequest(request)) {
            resolveHostForOutpostNonArnRequest(request);
        } else {
            resolveHostForNonOutpostNonArnRequest(request);
        }
    }

    private void resolveHostForOutpostArnRequest(Request<?> request, Arn arn) {
        S3Resource s3Resource = S3ControlArnConverter.getInstance().convertArn(arn);

        String signingRegion = request.getHandlerContext(HandlerContextKey.SIGNING_REGION);
        String arnRegion = arnRegion(arn);
        String arnPartition = arn.getPartition();
        S3Resource parentS3Resource = s3Resource.getParentS3Resource();

        validateIsTrue(!isFipsInvolved(signingRegion, arnRegion, request),
                        "FIPS is not supported for outpost requests.");

        // Even though we validated that we're not *calling* a FIPS region, the client region may still be a FIPS region if we're
        // using the ARN region. For that reason, we need to strip off the "fips" from the signing region before we get the
        // partition to make sure we're not making a cross-partition call.
        signingRegion = removeFipsIfNeeded(signingRegion);

        String signingPartition = RegionUtils.getRegion(signingRegion).getPartition();


        S3OutpostResource outpostResource = validateIsInstanceOf(S3OutpostResource.class, parentS3Resource,
                                                                 "The ARN passed must have a parent outpost resource.");
        validateIsTrue(!isDualstackEnabled(request), "Dual stack endpoints are not supported for outpost requests.");
        validateIsTrue(arnPartition.equals(signingPartition),
                        "The partition field of the ARN being passed as a bucket parameter to an S3 operation does not match "
                        + "the partition the client has been configured with. Provided partition: '%s'; client partition: '%s'.",
                        arnPartition, signingPartition);
        validateIsTrue(useArnRegion(request) || arnRegion.equals(signingRegion),
                        "The region field of the ARN being passed as a bucket parameter to an operation does not match the "
                        + "region the client was configured with. Provided region: '%s'; client region: '%s'.",
                        arnRegion, signingRegion);

        request.addHandlerContext(HandlerContextKey.SIGNING_REGION, arnRegion);
        request.addHandlerContext(HandlerContextKey.SIGNING_NAME, "s3-outposts");
        request.addHeader(X_AMZ_OUTPOST_ID_HEADER, outpostResource.getOutpostId());

        if (isEndpointOverridden(request)) {
            // Drop endpoint prefix for ARN-based requests
            replaceHost(request, clientEndpoint(request).getHost());
        } else {
            String arnPartitionDnsSuffix = RegionUtils.getRegion(arnRegion).getDomain();
            request.setEndpoint(URI.create(String.format("%s://s3-outposts.%s.%s",
                                                         request.getEndpoint().getScheme(), arnRegion, arnPartitionDnsSuffix)));
        }
    }

    private void resolveHostForOutpostNonArnRequest(Request<?> request) {
        String signingRegion = request.getHandlerContext(HandlerContextKey.SIGNING_REGION);

        validateIsTrue(!isDualstackEnabled(request),
                        "Dual stack is not supported for outpost requests.");
        validateIsTrue(!isFipsEnabledInClientConfig(request) && !isFipsRegion(signingRegion),
                        "FIPS endpoints are not supported for outpost requests.");

        request.addHandlerContext(HandlerContextKey.SIGNING_NAME, "s3-outposts");

        if (!isEndpointOverridden(request)) {
            String signingDnsSuffix = RegionUtils.getRegion(signingRegion).getDomain();
            replaceHost(request, String.format("s3-outposts.%s.%s", signingRegion, signingDnsSuffix));
        }
    }

    private void resolveHostForNonOutpostNonArnRequest(Request<?> request) {
        boolean isDualStackEnabled = isDualstackEnabled(request);
        boolean isFipsEnabledInClient = isFipsEnabledInClientConfig(request);

        validateIsTrue(!isDualStackEnabled || !isFipsEnabledInClient, "Dual stack and FIPS are not supported together.");

        if (isEndpointOverridden(request)) {
            validateIsTrue(!isDualStackEnabled, "Dual stack is not supported with endpoint overrides.");
            validateIsTrue(!isFipsEnabledInClient, "FIPS is not supported with endpoint overrides.");
        } else if (isDualStackEnabled) {
            String newEndpointPrefix = String.format("%s.%s", ENDPOINT_PREFIX, "dualstack");
            replaceHost(request, request.getEndpoint().getHost().replace(ENDPOINT_PREFIX, newEndpointPrefix));
        } else if (isFipsEnabledInClient) {
            String newEndpointPrefix = String.format("%s-%s", ENDPOINT_PREFIX, "fips");
            replaceHost(request, request.getEndpoint().getHost().replace(ENDPOINT_PREFIX, newEndpointPrefix));
        }
    }

    private Arn getRequestArn(Request<?> request) {
        S3ArnableField field = request.getHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD);
        return field != null ? field.getArn() : null;
    }

    private boolean isEndpointOverridden(Request<?> request) {
        return Boolean.TRUE.equals(request.getHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN));
    }

    private void replaceHost(Request<?> request, String newHost) {
        URI currentEndpoint = request.getEndpoint();
        try {
            request.setEndpoint(new URI(currentEndpoint.getScheme(),
                                        currentEndpoint.getUserInfo(),
                                        newHost,
                                        currentEndpoint.getPort(),
                                        currentEndpoint.getPath(),
                                        currentEndpoint.getQuery(),
                                        currentEndpoint.getFragment()));
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * It should redirect signer if the request is CreateBucketRequest or ListRegionalBucketsRequest with outpostId present
     */
    private boolean isNonArnOutpostRequest(Request<?> request) {
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        if (originalRequest instanceof CreateBucketRequest &&
            !StringUtils.isNullOrEmpty(((CreateBucketRequest) originalRequest).getOutpostId())) {
            return true;
        }

        return originalRequest instanceof ListRegionalBucketsRequest &&
               !StringUtils.isNullOrEmpty(((ListRegionalBucketsRequest) originalRequest).getOutpostId());
    }

    private URI clientEndpoint(Request<?> request) {
        return request.getHandlerContext(HandlerContextKey.CLIENT_ENDPOINT);
    }

    private String arnRegion(Arn arn) {
        String region = arn.getRegion();
        if (region == null) {
            throw new IllegalArgumentException("Region is missing from ARN: " + arn);
        }
        return region;
    }

    private boolean useArnRegion(Request<?> request) {
        // If useArnRegion is false, it was not set to false by the customer, it was simply not enabled
        if (isAdvancedConfigFlagTrue(request, S3ControlClientOptions.USE_ARN_REGION_ENABLED)) {
            return true;
        }

        return USE_ARN_REGION_RESOLVER.useArnRegion();
    }

    private boolean isFipsInvolved(String signingRegion, String arnRegion, Request<?> request) {
        if (isFipsEnabledInClientConfig(request)) {
            return true;
        }
        return isFipsRegion(signingRegion) || isFipsRegion(arnRegion);
    }

    private String removeFipsIfNeeded(String region) {
        if (region.startsWith("fips-")) {
            return region.replace("fips-", "");
        }

        if (region.endsWith("-fips")) {
            return region.replace("-fips", "");
        }
        return region;
    }

    private void validateIsTrue(boolean condition, String error, Object... params) {
        if (!condition) {
            throw new IllegalArgumentException(String.format(error, params));
        }
    }

    private <T> T validateIsInstanceOf(Class<T> clazz, Object toValidate, String error, Object... params) {
        if (!clazz.isAssignableFrom(toValidate.getClass())) {
            throw new IllegalArgumentException(String.format(error, params));
        }

        return clazz.cast(toValidate);
    }
}
