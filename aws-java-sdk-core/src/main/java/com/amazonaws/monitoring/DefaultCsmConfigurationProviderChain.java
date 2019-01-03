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

import com.amazonaws.profile.path.AwsProfileFileLocationProvider;

/**
 * The default chain of {@link CsmConfigurationProvider}s.
 * <p />
 * This chain attempts to load the client side monitoring configuration by
 * delegating to the following providers in order, and returning the first
 * result:
 * <ul>
 *     <li>{@link EnvironmentVariableCsmConfigurationProvider}</li>
 *     <li>{@link SystemPropertyCsmConfigurationProvider}</li>
 *     <li>{@link ProfileCsmConfigurationProvider}, using {@link
 *     AwsProfileFileLocationProvider#DEFAULT_CONFIG_LOCATION_PROVIDER} to
 *     locate the configuration file</li>
 * </ul>
 */
public final class DefaultCsmConfigurationProviderChain extends CsmConfigurationProviderChain {
    private static final DefaultCsmConfigurationProviderChain INSTANCE =
        new DefaultCsmConfigurationProviderChain();

    private DefaultCsmConfigurationProviderChain() {
        super(new EnvironmentVariableCsmConfigurationProvider(),
              new SystemPropertyCsmConfigurationProvider(),
              new ProfileCsmConfigurationProvider());
    }

    public static DefaultCsmConfigurationProviderChain getInstance() {
        return INSTANCE;
    }
}
