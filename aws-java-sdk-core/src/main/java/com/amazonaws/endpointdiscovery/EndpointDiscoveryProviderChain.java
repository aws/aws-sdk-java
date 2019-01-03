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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EndpointDiscoveryProviderChain implements EndpointDiscoveryProvider {

    private static final Log LOG = LogFactory.getLog(EndpointDiscoveryProviderChain.class);

    private final List<EndpointDiscoveryProvider> providers;

    public EndpointDiscoveryProviderChain(EndpointDiscoveryProvider... providers) {
        this.providers = new ArrayList<EndpointDiscoveryProvider>(providers.length);
        Collections.addAll(this.providers, providers);
    }

    @Override
    public Boolean endpointDiscoveryEnabled() {
        Boolean endpointDiscoveryEnabled = null;

        for (EndpointDiscoveryProvider provider : providers) {
            try {
                endpointDiscoveryEnabled = provider.endpointDiscoveryEnabled();
                if (endpointDiscoveryEnabled != null) {
                    return endpointDiscoveryEnabled;
                }
            } catch (Exception e) {
                // Ignore any exceptions and move onto the next provider
                LOG.debug("Unable to discover endpoint discovery setting " + provider.toString() +
                          ": " + e.getMessage());
            }
        }
        return endpointDiscoveryEnabled;
    }
}
