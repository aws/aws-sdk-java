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

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.client.builder.AdvancedConfig;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.services.s3control.S3ControlClientOptions;
import com.amazonaws.util.StringUtils;

@SdkInternalApi
public final class HandlerUtils {

    public static final String X_AMZ_ACCOUNT_ID = "x-amz-account-id";
    public static final String S3_OUTPOSTS = "s3-outposts";

    private HandlerUtils() {
    }

    public static boolean isDualstackEnabled(Request<?> request) {
        return isAdvancedConfigFlagTrue(request, S3ControlClientOptions.DUALSTACK_ENABLED);
    }

    public static boolean isFipsEnabledInClientConfig(Request<?> request) {
        return isAdvancedConfigFlagTrue(request, S3ControlClientOptions.FIPS_ENABLED);
    }

    /**
     * @param request Marshalled request.
     * @param key Key to check.
     * @return True if advanced config is available in the context AND the specified key is present AND has the value true,
     * false otherwise.
     */
    public static boolean isAdvancedConfigFlagTrue(Request<?> request, AdvancedConfig.Key<Boolean> key) {
        AdvancedConfig advancedConfig = request.getHandlerContext(HandlerContextKey.ADVANCED_CONFIG);
        if (advancedConfig == null) {
            return false;
        }
        Boolean flag = advancedConfig.get(key);
        return Boolean.TRUE.equals(flag);
    }

    /**
     * Returns whether a FIPS pseudo region is provided.
     */
    public static boolean isFipsRegionProvided(String clientRegion, String arnRegion, boolean useArnRegion) {
        if (useArnRegion) {
            return isFipsRegion(arnRegion);
        }

        return isFipsRegion(clientRegion);
    }

    /**
     * Returns whether a region is a FIPS pseudo region.
     */
     public static boolean isFipsRegion(String regionName) {
         if (StringUtils.isNullOrEmpty(regionName)) {
             return false;
         }

        return regionName.startsWith("fips-") || regionName.endsWith("-fips");
    }
}
