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
package com.amazonaws;

import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Factory producing predefined {@link ClientConfiguration} instances.
 * Individual service clients may extend this factory to override
 * these with service specific configuration values.
 */
@SdkProtectedApi
public class ClientConfigurationFactory {

    /**
     * Builds a {@link ClientConfiguration} instance with the default configuration
     * for the current client.  If the {@link SDKGlobalConfiguration#ENABLE_IN_REGION_OPTIMIZED_MODE}
     * system property has been set, in-region optimized configuration will be used.
     *
     * @return constructed {@link ClientConfiguration} instance
     */
    public final ClientConfiguration getConfig() {
        return SDKGlobalConfiguration.isInRegionOptimizedModeEnabled()
                ? getInRegionOptimizedConfig() : getDefaultConfig();
    }

    /**
     * Builds a {@link ClientConfiguration} instance with default configuration
     * values suitable for most use cases.
     *
     * @return constructed {@link ClientConfiguration} with standard configuration.
     */
    protected ClientConfiguration getDefaultConfig() {
        return new ClientConfiguration();
    }

    /**
     * Builds a {@link ClientConfiguration} instance with configuration values
     * tailored towards clients operating in the same AWS region as the service
     * endpoint they call.  Timeouts in in-region optimized configurations are
     * generally set much lower than the client standard configuration.
     *
     * @return constructed {@link ClientConfiguration} with in-region optimized configuration
     */
    protected ClientConfiguration getInRegionOptimizedConfig() {
        return new ClientConfiguration().withConnectionTimeout(1000);
    }

}
