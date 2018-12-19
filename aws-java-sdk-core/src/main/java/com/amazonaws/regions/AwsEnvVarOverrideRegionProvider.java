/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;

import com.amazonaws.SdkClientException;

import static com.amazonaws.SDKGlobalConfiguration.AWS_REGION_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.ALTERNATE_AWS_REGION_ENV_VAR;

/**
 * Loads region information from the '{@value com.amazonaws.SDKGlobalConfiguration#AWS_REGION_ENV_VAR}'
 * environment variable or it's legacy alternative.
 */
public class AwsEnvVarOverrideRegionProvider extends AwsRegionProvider {

    @Override
    public String getRegion() throws SdkClientException {
        String region = System.getenv(AWS_REGION_ENV_VAR);
        if (region == null) {
            region = System.getenv(ALTERNATE_AWS_REGION_ENV_VAR);
        }
        region = StringUtils.trim(region);

        if (StringUtils.isNullOrEmpty(region) {
            throw new SdkClientException(
                    "Unable to load region from environment variables " +
                    "(" + AWS_REGION_ENV_VAR + " (or " + ALTERNATE_AWS_REGION_ENV_VAR + "))");
        }
        return region;
    }
}
