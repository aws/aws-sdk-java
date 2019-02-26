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
package com.amazonaws.opensdk.internal.config;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.ProxyConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;

import java.util.Optional;

/**
 * Client configuration options such as proxy settings, timeouts, connections etc.
 */
@SdkInternalApi
public class ApiGatewayClientConfiguration {

    private ProxyConfiguration proxyConfiguration;
    private TimeoutConfiguration timeoutConfiguration;
    private ConnectionConfiguration connectionConfiguration;

    /**
     * Returns an {@link Optional} object of type {@link ProxyConfiguration} that has the
     * proxy options for the client. The returned {@link Optional} can contain null value.
     *
     * @return An {@link Optional} object of type {@link ProxyConfiguration}.
     */
    public Optional<ProxyConfiguration> getProxyConfiguration() {
        return Optional.ofNullable(proxyConfiguration);
    }

    /**
     * Sets the proxy configuration of a client.
     *
     * @param proxyConfiguration The proxy configuration of the client.
     */
    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * Sets the proxy configuration of a client.
     *
     * @param proxyConfiguration The proxy configuration of the client.
     * @return This object for method chaining.
     */
    public ApiGatewayClientConfiguration proxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
        return this;
    }

    /**
     * Returns an {@link Optional} object of type {@link TimeoutConfiguration} that contains
     * the customizations for the various timeouts used by the client.
     *
     * @return An {@link Optional} object of type {@link TimeoutConfiguration}.
     */
    public Optional<TimeoutConfiguration> getTimeoutConfiguration() {
        return Optional.ofNullable(timeoutConfiguration);
    }


    /**
     * Returns an {@link Optional} object of type {@link ConnectionConfiguration} that contains
     * the customizations for the http connections.
     *
     * @return An {@link Optional} object of type {@link ConnectionConfiguration}.
     *//**
     * Sets the various timeouts used by the client.
     *
     * @param timeoutConfiguration The {@link TimeoutConfiguration} object with the custom timeouts.
     */
    public void setTimeoutConfiguration(TimeoutConfiguration timeoutConfiguration) {
        this.timeoutConfiguration = timeoutConfiguration;
    }

    /**
     * Sets the various timeouts used by the client.
     *
     * @param timeoutConfiguration The {@link TimeoutConfiguration} object with the custom timeouts.
     * @return This object for method chaining.
     */
    public ApiGatewayClientConfiguration timeoutConfiguration(TimeoutConfiguration timeoutConfiguration) {
        setTimeoutConfiguration(timeoutConfiguration);
        return this;
    }

    public Optional<ConnectionConfiguration> getConnectionConfiguration() {
        return Optional.ofNullable(connectionConfiguration);
    }

    /**
     * Sets various options related to the http connection pool and connections.
     *
     * @param connectionConfiguration The {@link ConnectionConfiguration} object with the custom values.
     */
    public void setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
    }

    /**
     * Sets various options related to the http connection pool and connections.
     *
     * @param connectionConfiguration The {@link ConnectionConfiguration} object with the custom values.
     * @return This object for method chaining.
     */
    public ApiGatewayClientConfiguration connectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        setConnectionConfiguration(connectionConfiguration);
        return this;
    }

}
