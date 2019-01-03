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

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.ThreadSafe;

import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_ENABLED_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.AWS_CSM_PORT_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_PORT;

/**
 * Configuration provider that sources the client side monitoring
 * configuration parameters from system properties.
 *
 * @see com.amazonaws.SDKGlobalConfiguration#AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY
 * @see com.amazonaws.SDKGlobalConfiguration#AWS_CSM_ENABLED_SYSTEM_PROPERTY
 * @see com.amazonaws.SDKGlobalConfiguration#AWS_CSM_PORT_SYSTEM_PROPERTY
 */
@ThreadSafe
public final class SystemPropertyCsmConfigurationProvider implements CsmConfigurationProvider {
   @Override
    public CsmConfiguration getConfiguration() throws SdkClientException {
        String enabled = System.getProperty(AWS_CSM_ENABLED_SYSTEM_PROPERTY);

        if (enabled == null) {
            throw new SdkClientException("Unable to load Client Side Monitoring configurations from"
                    + " system properties variables!");
        }

       String port = System.getProperty(AWS_CSM_PORT_SYSTEM_PROPERTY);
       String clientId = System.getProperty(AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY, "");

        try {
            int portNumber = port == null ? DEFAULT_AWS_CSM_PORT : Integer.parseInt(port);
            return new CsmConfiguration(Boolean.parseBoolean(enabled), portNumber, clientId);
        } catch (Exception e) {
            throw new SdkClientException("Unable to load Client Side Monitoring configurations from"
                    + " system properties variables!", e);
        }
    }
}
