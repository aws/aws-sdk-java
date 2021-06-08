/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.timestreamquery;

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsAsyncClientBuilder;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.endpointdiscovery.EndpointDiscoveryProviderChain;
import com.amazonaws.endpointdiscovery.DefaultEndpointDiscoveryProviderChain;
import com.amazonaws.internal.config.InternalConfig;

/**
 * Fluent builder for {@link com.amazonaws.services.timestreamquery.AmazonTimestreamQueryAsync}. Use of the builder is
 * preferred over using constructors of the client class.
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class AmazonTimestreamQueryAsyncClientBuilder extends AwsAsyncClientBuilder<AmazonTimestreamQueryAsyncClientBuilder, AmazonTimestreamQueryAsync> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ClientConfigurationFactory();;

    private static final EndpointDiscoveryProviderChain DEFAULT_ENDPOINT_DISCOVERY_PROVIDER = new DefaultEndpointDiscoveryProviderChain();

    private boolean endpointDiscoveryEnabled = true;
    private boolean endpointDiscoveryDisabled = false;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AmazonTimestreamQueryAsyncClientBuilder standard() {
        return new AmazonTimestreamQueryAsyncClientBuilder();
    }

    /**
     * @return Default async client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain} and
     *         {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static AmazonTimestreamQueryAsync defaultClient() {
        return standard().build();
    }

    private AmazonTimestreamQueryAsyncClientBuilder() {
        super(CLIENT_CONFIG_FACTORY);
    }

    public AmazonTimestreamQueryAsyncClientBuilder enableEndpointDiscovery() {
        this.endpointDiscoveryEnabled = true;
        return this;
    }

    public AmazonTimestreamQueryAsyncClientBuilder disableEndpointDiscovery() {
        this.endpointDiscoveryDisabled = true;
        return this;
    }

    private boolean endpointDiscoveryEnabled() {

        Boolean endpointDiscoveryChainSetting = DEFAULT_ENDPOINT_DISCOVERY_PROVIDER.endpointDiscoveryEnabled();

        if (endpointDiscoveryDisabled) {
            return false;
        }

        if (endpointDiscoveryEnabled) {
            return true;
        }

        if (endpointDiscoveryChainSetting != null && endpointDiscoveryChainSetting == false) {
            return false;
        }

        if (endpointDiscoveryChainSetting != null && endpointDiscoveryChainSetting) {
            return true;
        }

        if (InternalConfig.Factory.getInternalConfig().endpointDiscoveryEnabled()) {
            return true;
        }

        return false;
    }

    /**
     * Construct an asynchronous implementation of AmazonTimestreamQueryAsync using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of AmazonTimestreamQueryAsync.
     */
    @Override
    protected AmazonTimestreamQueryAsync build(AwsAsyncClientParams params) {
        if (endpointDiscoveryEnabled() && getEndpoint() == null) {
            return new AmazonTimestreamQueryAsyncClient(params, true);
        }
        return new AmazonTimestreamQueryAsyncClient(params);
    }

}
