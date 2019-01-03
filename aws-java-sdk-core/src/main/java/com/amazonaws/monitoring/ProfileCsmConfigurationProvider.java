/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.monitoring;

import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_CLIENT_ID;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_PORT;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.auth.profile.ProfilesConfigFile;
import com.amazonaws.auth.profile.internal.AwsProfileNameLoader;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;

/**
 * Configuration provider that sources the client side monitoring configuration
 * parameters from the configured profile in the shared AWS config file.
 * <p />
 * If no profile name is given, {@link AwsProfileNameLoader} will be used to
 * find the profile to load the configuration from.
 */
@ThreadSafe
public final class ProfileCsmConfigurationProvider implements CsmConfigurationProvider {
    public static final String CSM_ENABLED_PROPERTY = "csm_enabled";
    public static final String CSM_PORT_PROPERTY = "csm_port";
    public static final String CSM_CLIENT_ID_PROPERTY = "csm_client_id";

    private final AwsProfileFileLocationProvider configFileLocationProvider;

    private volatile String profileName;

    private volatile ProfilesConfigFile configFile;

    /**
     * No-arg constructor.
     * <p />
     * {@link AwsProfileNameLoader} and {@link
     * AwsProfileFileLocationProvider#DEFAULT_CONFIG_LOCATION_PROVIDER} will be
     * used to find locate the profile name and config file respectively.
     */
    public ProfileCsmConfigurationProvider() {
        this(null, AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER);
    }

    /**
     * Create an instance that loads the configuration from the given profile
     * name.
     * <p />
     * {@link AwsProfileFileLocationProvider#DEFAULT_CONFIG_LOCATION_PROVIDER}
     * will be used to find locate the config file.
     *
     * @param profileName The name of the profile.
     */
    public ProfileCsmConfigurationProvider(String profileName) {
        this(profileName, AwsProfileFileLocationProvider.DEFAULT_CONFIG_LOCATION_PROVIDER);
    }

    /**
     * Create an instance that loads the configuration from the given profile
     * name and config file location.
     *
     * @param profileName The name of the profile.
     * @param configFileLocationProvider The provider to use to locate the
     * config file.
     */
    public ProfileCsmConfigurationProvider(String profileName,
            AwsProfileFileLocationProvider configFileLocationProvider) {
        this.profileName = profileName;
        this.configFileLocationProvider = configFileLocationProvider;
    }

    @Override
    public CsmConfiguration getConfiguration() {
        String profileName = getProfileName();

        BasicProfile profile = getProfile(profileName);
        if (profile == null) {
            throw new SdkClientException(String.format("Could not find the '%s' profile!",
                        profileName));
        }

        String enabled = profile.getPropertyValue(CSM_ENABLED_PROPERTY);

        if (enabled == null) {
            throw new SdkClientException(String.format("The '%s' profile does not define all the"
                                                       + " required properties!", profileName));
        }

        String port = profile.getPropertyValue(CSM_PORT_PROPERTY);
        String clientId = profile.getPropertyValue(CSM_CLIENT_ID_PROPERTY);
        clientId = clientId == null ? DEFAULT_AWS_CSM_CLIENT_ID : clientId;

        try {
            int portNumber = port == null ? DEFAULT_AWS_CSM_PORT : Integer.parseInt(port);

            return new CsmConfiguration(Boolean.parseBoolean(enabled), portNumber,
                    clientId);
        } catch (Exception e) {
            throw new SdkClientException(String.format("Unable to load configuration from the '%s'"
                        + " profile!", profileName), e);
        }
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
        return getProfilesConfigFile().getAllBasicProfiles().get(profileName);
    }

    // ProfilesConfigFile immediately loads the profiles at construction time
    private ProfilesConfigFile getProfilesConfigFile() {
        if (configFile == null) {
            synchronized (this) {
                if (configFile == null) {
                    try {
                        configFile = new ProfilesConfigFile(configFileLocationProvider.getLocation());
                    } catch (Exception e) {
                        throw new SdkClientException("Unable to load config file", e);
                    }
                }
            }
        }
        return configFile;
    }
}
