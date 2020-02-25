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

package com.amazonaws.auth.profile.internal;

import static com.amazonaws.util.ValidationUtils.assertNotNull;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.profile.ProfilesConfigFile;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import java.io.File;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Basic profile config loader to load config file from {@link AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER}.
 */
@SdkInternalApi
public final class BasicProfileConfigFileLoader {

    public static final BasicProfileConfigFileLoader INSTANCE = new BasicProfileConfigFileLoader();
    private static final Log log = LogFactory.getLog(BasicProfileConfigFileLoader.class);

    private final AwsProfileFileLocationProvider configFileLocationProvider;
    private volatile String profileName;
    private volatile ProfilesConfigFile configFile;
    private volatile boolean profileLoadAttempted;

    private BasicProfileConfigFileLoader() {
        this.configFileLocationProvider = AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER;
    }

    @SdkTestInternalApi
    public BasicProfileConfigFileLoader(AwsProfileFileLocationProvider configFileLocationProvider) {
        this.configFileLocationProvider = assertNotNull(configFileLocationProvider, "configFileLocationProvider");
    }

    /**
     * @return a {@link BasicProfile} if available, otherwise null.
     */
    public BasicProfile getProfile() {
        ProfilesConfigFile profilesConfigFile = getProfilesConfigFile();
        if (profilesConfigFile != null) {
            return profilesConfigFile.getAllBasicProfiles().get(getProfileName());
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
}
