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


import static com.amazonaws.SDKGlobalConfiguration.AWS_MAX_ATTEMPTS_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_MAX_ATTEMPTS_SYSTEM_PROPERTY;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Resolves the max attempts for retry in the following order:
 *
 * <ul>
 *   <li>Environment Variable</li>
 *   <li>Java System Properties</li>
 *   <li>Credential config file at the default location (~/.aws/config) shared by all AWS SDKs and the AWS CLI</li>
 * </ul>
 */
@SdkInternalApi
public final class MaxAttemptsResolver {
    private static final Log log = LogFactory.getLog(MaxAttemptsResolver.class);
    private static final String PROFILE_PROPERTY = "max_attempts";
    private final Integer maxAttempts;
    private final BasicProfileConfigFileLoader configFileLoader;

    public MaxAttemptsResolver() {
        this.configFileLoader = BasicProfileConfigFileLoader.INSTANCE;
        this.maxAttempts = resolveMaxAttempts();
    }

    @SdkTestInternalApi
    MaxAttemptsResolver(AwsProfileFileLocationProvider configFileLocationProvider) {
        this.configFileLoader = new BasicProfileConfigFileLoader(configFileLocationProvider);
        this.maxAttempts = resolveMaxAttempts();
    }

    /**
     * @return the resolved max attempts. If not found, null will be returned.
     */
    public Integer maxAttempts() {
        return maxAttempts;
    }

    private Integer resolveMaxAttempts() {
        Integer attempts = envVar();

        if (attempts != null) {
            return attempts;
        }

        attempts = systemProperty();
        if (attempts != null) {
            return attempts;
        }

        return profile();
    }

    private Integer profile() {
        BasicProfile profile = configFileLoader.getProfile();
        if (profile == null) {
            return null;
        }
        String val = profile.getPropertyValue(PROFILE_PROPERTY);

        return parseInteger(val);
    }

    private Integer systemProperty() {
        return parseInteger(System.getProperty(AWS_MAX_ATTEMPTS_SYSTEM_PROPERTY));
    }

    private Integer envVar() {
        return parseInteger(System.getenv(AWS_MAX_ATTEMPTS_ENV_VAR));
    }

    private Integer parseInteger(String value) {

        if (value == null) {
            return null;
        }

        try {
            return Integer.valueOf(value);
        } catch (NumberFormatException ex) {
            log.warn("Fail to parse " + AWS_MAX_ATTEMPTS_SYSTEM_PROPERTY, ex);
        }

        return null;
    }
}
