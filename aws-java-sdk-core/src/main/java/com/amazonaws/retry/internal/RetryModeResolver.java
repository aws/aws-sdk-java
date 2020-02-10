/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.retry.internal;

import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_RETRY_MODE_SYSTEM_PROPERTY;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import com.amazonaws.retry.RetryMode;

/**
 * Resolves the retryMode in the following order:
 *
 * <ul>
 *   <li>Environment Variable</li>
 *   <li>Java System Properties</li>
 *   <li>Credential config file at the default location (~/.aws/config) shared by all AWS SDKs and the AWS CLI</li>
 * </ul>
 */
@SdkInternalApi
public final class RetryModeResolver {
    private static final String PROFILE_PROPERTY = "retry_mode";

    private final BasicProfileConfigFileLoader configFileLoader;
    private final RetryMode retryMode;

    public RetryModeResolver() {
        this.configFileLoader = BasicProfileConfigFileLoader.INSTANCE;
        this.retryMode = resolveRetryMode();
    }

    @SdkTestInternalApi
    RetryModeResolver(AwsProfileFileLocationProvider configFileLocationProvider) {
        this.configFileLoader = new BasicProfileConfigFileLoader(configFileLocationProvider);
        this.retryMode = resolveRetryMode();
    }

    /**
     * @return the resolved retry mode. If not found, {@link RetryMode.LEGACY} will be returned
     */
    public RetryMode retryMode() {
        return retryMode;
    }

    private RetryMode systemProperty() {
        return RetryMode.fromName(System.getProperty(AWS_RETRY_MODE_SYSTEM_PROPERTY));
    }

    private RetryMode envVar() {
        return RetryMode.fromName(System.getenv(AWS_RETRY_MODE_ENV_VAR));

    }

    private RetryMode resolveRetryMode() {
        RetryMode mode = envVar();

        if (mode != null) {
            return mode;
        }

        mode = systemProperty();
        if (mode != null) {
            return mode;
        }

        mode = profile();
        if (mode != null) {
            return mode;
        }

        return RetryMode.LEGACY;
    }

    private RetryMode profile() {
        BasicProfile profile = configFileLoader.getProfile();
        if (profile == null) {
            return null;
        }
        String val = profile.getPropertyValue(PROFILE_PROPERTY);

        return RetryMode.fromName(val);
    }
}
