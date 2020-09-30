/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3control.internal;

import static com.amazonaws.services.s3control.internal.HandlerUtils.isAdvancedConfigFlagTrue;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isDualstackEnabled;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isFipsEnabledInClientConfig;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isFipsRegionProvided;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.arn.Arn;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.s3.S3Resource;
import com.amazonaws.services.s3.internal.S3OutpostResource;
import com.amazonaws.services.s3.internal.UseArnRegionResolver;
import com.amazonaws.services.s3control.S3ControlClientOptions;
import com.amazonaws.util.SdkHttpUtils;
import java.net.URI;

@SdkInternalApi
public class ArnHandler {
    private static final String X_AMZ_OUTPOST_ID_HEADER = "x-amz-outpost-id";
    private static final ArnHandler INSTANCE = new ArnHandler();
    private static final UseArnRegionResolver USE_ARN_REGION_RESOLVER = new UseArnRegionResolver();

    private ArnHandler() {
    }

    public static ArnHandler getInstance() {
        return INSTANCE;
    }

    public void resolveHostForArn(Request<?> request, Arn arn) {

        S3Resource s3Resource = S3ControlArnConverter.getInstance().convertArn(arn);

        URI endpoint = request.getEndpoint();

        String clientRegion = request.getHandlerContext(HandlerContextKey.SIGNING_REGION);
        String originalArnRegion = s3Resource.getRegion();

        boolean isFipsEnabled = isFipsEnabledInClientConfig(request) || isFipsRegionProvided(clientRegion, originalArnRegion, useArnRegion(request));

        String arnRegion = removeFipsIfNeeded(originalArnRegion);
        validateConfiguration(request, s3Resource.getPartition(), arnRegion);

        request.addHandlerContext(HandlerContextKey.SIGNING_REGION, arnRegion);

        S3Resource parentS3Resource = s3Resource.getParentS3Resource();
        if (parentS3Resource instanceof S3OutpostResource) {
            handleOutpostArn(request, (S3OutpostResource) parentS3Resource, endpoint, isFipsEnabled);
        } else {
            throw new IllegalArgumentException("Parent resource invalid, outpost resource expected.");
        }
    }

    private void handleOutpostArn(Request<?> request, S3OutpostResource outpostResource, URI endpoint, boolean isFipsEnabled) {
        if (isFipsEnabled) {
            throw new IllegalArgumentException("FIPS endpints are not supported for outpost ARNs");
        }

        if (isDualstackEnabled(request)) {
            throw new IllegalArgumentException("Dualstack endpoints are not supported for outpost ARNs");
        }

        request.addHandlerContext(HandlerContextKey.SIGNING_NAME, "s3-outposts");
        request.addHeader(X_AMZ_OUTPOST_ID_HEADER, outpostResource.getOutpostId());

        String arnRegion = outpostResource.getRegion();

        URI arnEndpoint = URI.create(String.format("%s://s3-outposts.%s.%s", endpoint.getScheme(), arnRegion, RegionUtils.getRegion(arnRegion).getDomain()));
        request.setEndpoint(arnEndpoint);
    }

    private void validateConfiguration(Request<?> request, String arnPartition, String arnRegion) {
        String clientRegionString = removeFipsIfNeeded(request.getHandlerContext(HandlerContextKey.SIGNING_REGION));
        Region clientRegion = RegionUtils.getRegion(clientRegionString);

        if (Boolean.TRUE.equals(request.getHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN))) {
            throw new IllegalArgumentException("An ARN cannot be passed to an "
                                               + " operation if the client has been configured with an endpoint "
                                               + "override.");
        }

        if (!arnPartition.equals(clientRegion.getPartition())) {
            throw new IllegalArgumentException("The partition field of the ARN being passed as a bucket parameter to "
                                               + "an S3 operation does not match the partition the client has been configured with. Provided "
                                               + "partition: '" + arnPartition + "'; client partition: "
                                               + "'" + clientRegion.getPartition() + "'.");
        }

        if (!arnRegion.equals(clientRegion.getName()) && !useArnRegion(request)) {
            throw new IllegalArgumentException("The region field of the ARN being passed as a bucket parameter to an "
                                               + "operation does not match the region the client was configured "
                                               + "with. Provided region: '" + arnRegion + "'; client "
                                               + "region: '" + clientRegion.getName() + "'.");
        }
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

    private boolean useArnRegion(Request<?> request) {
        // If useArnRegion is false, it was not set to false by the customer, it was simply not enabled
        if (isAdvancedConfigFlagTrue(request, S3ControlClientOptions.USE_ARN_REGION_ENABLED)) {
            return true;
        }

        return USE_ARN_REGION_RESOLVER.useArnRegion();
    }
}
