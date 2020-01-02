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
package com.amazonaws.services.s3.internal;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.auth.profile.ProfilesConfigFile;
import com.amazonaws.auth.profile.internal.AwsProfileNameLoader;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;

/**
 * Resolves the regional endpoints option for S3.
 */
@ThreadSafe
@SdkInternalApi
public final class RegionalEndpointsOptionResolver {
    private enum Option {
        LEGACY,
        REGIONAL
    }
    private static final Log log = LogFactory.getLog(RegionalEndpointsOptionResolver.class);
    private static final String ENV_VAR = "AWS_S3_US_EAST_1_REGIONAL_ENDPOINT";
    private static final String PROFILE_PROPERTY = "s3_us_east_1_regional_endpoint";

    private final AwsProfileFileLocationProvider configFileLocationProvider;

    private volatile String profileName;
    private volatile ProfilesConfigFile configFile;
    private volatile boolean profileLoadAttempted;

    public RegionalEndpointsOptionResolver() {
        configFileLocationProvider = AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER;
    }

    public RegionalEndpointsOptionResolver(AwsProfileFileLocationProvider configFileLocationProvider) {
        this.configFileLocationProvider = configFileLocationProvider;
    }

    public boolean useRegionalMode() {
        Option option = envVarOption();
        if (option == null) {
            option = profileOption();
        }
        return option == Option.REGIONAL;
    }

    private Option envVarOption() {
        String val = System.getenv(ENV_VAR);
        return resolveOption(val, String.format("Unexpected value set for %s environment variable: '%s'", ENV_VAR,
                             val));
    }

    private synchronized Option profileOption() {
        String profileName = getProfileName();
        BasicProfile profile = getProfile(profileName);
        if (profile == null) {
            return null;
        }
        String val = profile.getPropertyValue(PROFILE_PROPERTY);
        return resolveOption(val, String.format("Unexpected option for '%s' property in profile '%s': %s",
                             PROFILE_PROPERTY, profileName, val));
    }

    private Option resolveOption(String value, String errMsg) {
        if (value == null) {
            return null;
        }

        if ("legacy".equalsIgnoreCase(value)) {
            return Option.LEGACY;
        }

        if ("regional".equalsIgnoreCase(value)) {
            return Option.REGIONAL;
        }

        throw new SdkClientException(errMsg);
    }

    private String getProfileName() {
        if (profileName == null) {
            synchronized (this) {
                if (profileName == null) {
                    profileName = AwsProfileNameLoader.INSTANCE.loadProfileName();
                }
            }
        }
        return profileName;
    }

    private synchronized BasicProfile getProfile(String profileName) {
        ProfilesConfigFile profilesConfigFile = getProfilesConfigFile();
        if (profilesConfigFile != null) {
            return profilesConfigFile.getAllBasicProfiles().get(profileName);
        }
        return null;
    }

    // ProfilesConfigFile immediately loads the profiles at construction time
    private ProfilesConfigFile getProfilesConfigFile() {
        if (!profileLoadAttempted) {
            synchronized (this) {
                if (!profileLoadAttempted) {
                    File location = null;
                    try {
                        location = configFileLocationProvider.getLocation();
                        if (location != null) {
                            configFile = new ProfilesConfigFile(location);
                        }
                    } catch (Exception e) {
                        if (log.isWarnEnabled()) {
                            log.warn("Unable to load config file " + location, e);
                        }
                    } finally {
                        profileLoadAttempted = true;
                    }
                }
            }
        }
        return configFile;
    }
}
