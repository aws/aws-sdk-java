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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;

import java.io.File;

import com.amazonaws.auth.profile.ProfilesConfigFile;
import com.amazonaws.auth.profile.internal.AwsProfileNameLoader;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Resolves the use arn region option for S3.
 */
@ThreadSafe
@SdkInternalApi
public final class UseArnRegionResolver {

    private static final Log log = LogFactory.getLog(UseArnRegionResolver.class);
    private static final String ENV_VAR = "AWS_S3_USE_ARN_REGION";
    private static final String PROFILE_PROPERTY = "s3_use_arn_region";

    private final AwsProfileFileLocationProvider configFileLocationProvider;
    private final boolean useArnRegion;

    private volatile String profileName;
    private volatile ProfilesConfigFile configFile;
    private volatile boolean profileLoadAttempted;

    public UseArnRegionResolver() {
        this(AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER);
    }

    public UseArnRegionResolver(AwsProfileFileLocationProvider configFileLocationProvider) {
        this.configFileLocationProvider = configFileLocationProvider;
        this.useArnRegion = resolveUseArnRegion();
    }

    public boolean useArnRegion() {
        return useArnRegion;
    }

    private boolean resolveUseArnRegion() {
        String useArnRegionString = envVar();

        if (useArnRegionString == null) {
            useArnRegionString = profile();
        }

        return Boolean.valueOf(useArnRegionString);
    }

    private String envVar() {
        return System.getenv(ENV_VAR);
    }

    private String profile() {
        String loadedProfileName = getProfileName();
        BasicProfile profile = getProfile(loadedProfileName);
        if (profile == null) {
            return null;
        }
        String val = profile.getPropertyValue(PROFILE_PROPERTY);
        return val;
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

    private BasicProfile getProfile(String profileName) {
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