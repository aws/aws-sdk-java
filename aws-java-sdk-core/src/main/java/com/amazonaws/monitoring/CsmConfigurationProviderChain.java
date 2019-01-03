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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A {@link CsmConfigurationProvider} that delegates to a list of other {@link
 * CsmConfigurationProvider}s in order and returns the first result.
 */
public class CsmConfigurationProviderChain implements CsmConfigurationProvider {
    private static final Log log = LogFactory.getLog(CsmConfigurationProviderChain.class);

    private final List<CsmConfigurationProvider> providers =
        new ArrayList<CsmConfigurationProvider>();

    public CsmConfigurationProviderChain(CsmConfigurationProvider... providers) {
        if (providers != null) {
            Collections.addAll(this.providers, providers);
        }
    }

    @Override
    public CsmConfiguration getConfiguration() {
        for (CsmConfigurationProvider p : providers) {
            try {
                return p.getConfiguration();
            } catch (SdkClientException e) {
                if (log.isDebugEnabled()) {
                    log.debug("Unable to load configuration from " + p.toString() + ": " + e.getMessage());
                }
            }
        }
        throw new SdkClientException("Could not resolve client side monitoring configuration from"
                + " the configured providers in the chain");
    }
}
