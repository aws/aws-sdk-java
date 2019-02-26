/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.profile.internal.AllProfiles;
import com.amazonaws.auth.profile.internal.AwsProfileNameLoader;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigLoader;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import com.amazonaws.util.StringUtils;

import java.io.File;

/**
 * Loads region information from the shared AWS config file. Uses the default profile unless
 * otherwise specified.
 */
public class AwsProfileRegionProvider extends AwsRegionProvider {

    private final String profileName;
    private final AwsProfileFileLocationProvider locationProvider;
    private final BasicProfileConfigLoader profileConfigLoader;

    public AwsProfileRegionProvider() {
        this(AwsProfileNameLoader.INSTANCE.loadProfileName());
    }

    public AwsProfileRegionProvider(String profileName) {
        this(profileName, AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER,
             BasicProfileConfigLoader.INSTANCE);
    }

    @SdkTestInternalApi
    AwsProfileRegionProvider(String profileName, AwsProfileFileLocationProvider locationProvider,
                             BasicProfileConfigLoader configLoader) {
        this.profileName = profileName;
        this.locationProvider = locationProvider;
        this.profileConfigLoader = configLoader;
    }

    @Override
    public String getRegion() throws SdkClientException {
        File configFile = locationProvider.getLocation();
        if (configFile != null && configFile.exists()) {
            BasicProfile profile = loadProfile(configFile);
            if (profile != null && !StringUtils.isNullOrEmpty(profile.getRegion())) {
                return profile.getRegion();
            }
        }
        return null;
    }

    private BasicProfile loadProfile(File configFile) {
        final AllProfiles allProfiles = profileConfigLoader.loadProfiles(configFile);
        return allProfiles.getProfile(profileName);
    }

}
