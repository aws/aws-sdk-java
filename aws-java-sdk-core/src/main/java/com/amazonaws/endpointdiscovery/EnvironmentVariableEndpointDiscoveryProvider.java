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
package com.amazonaws.endpointdiscovery;


import static com.amazonaws.endpointdiscovery.Constants.ENDPOINT_DISCOVERY_ENVIRONMENT_VARIABLE;

public class EnvironmentVariableEndpointDiscoveryProvider implements EndpointDiscoveryProvider {

    @Override
    public Boolean endpointDiscoveryEnabled() {

        Boolean endpointDiscoveryEnabled = null;

        String endpointDiscoveryEnabledString = System.getenv(ENDPOINT_DISCOVERY_ENVIRONMENT_VARIABLE);

        if (endpointDiscoveryEnabledString != null) {
            try {
                endpointDiscoveryEnabled = Boolean.parseBoolean(endpointDiscoveryEnabledString);
            } catch (Exception e) {
                throw new RuntimeException("Unable to parse environment variable " + ENDPOINT_DISCOVERY_ENVIRONMENT_VARIABLE);
            }
        }

        return endpointDiscoveryEnabled;
    }
}
