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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.SdkInternalApi;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Adapter that adapts {@link ApiGatewayClientConfiguration} to {@link ClientConfiguration}.
 */
@SdkInternalApi
public class ClientConfigurationAdapter {

    /**
     * Helper method that takes in a custom {@link ApiGatewayClientConfiguration} object and
     * a service default {@link ClientConfiguration} object,
     * adapts it to a target {@link ClientConfiguration} object and returns it.
     * <p>
     * If value is not present for a property in customConfiguration object,
     * then the value from the defaultConfiguration is used.
     * </p>
     *
     * @param customConfiguration The adaptee which is a {@link ApiGatewayClientConfiguration} object.
     * @param defaultConfiguration The configuration to use for options that are not set in customConfiguration.
     * @return The target {@link ClientConfiguration} object.
     */
    public static ClientConfiguration adapt(ApiGatewayClientConfiguration customConfiguration, ClientConfiguration defaultConfiguration) {
        ClientConfiguration adaptedConfiguration = new ClientConfiguration(defaultConfiguration);

        customConfiguration.getProxyConfiguration().ifPresent(
            proxyConfiguration -> {
                bind(proxyConfiguration::getProtocol, adaptedConfiguration::setProtocol);
                bind(proxyConfiguration::getProxyHost, adaptedConfiguration::setProxyHost);
                bind(proxyConfiguration::getProxyPort, adaptedConfiguration::setProxyPort);
                bind(proxyConfiguration::getProxyUsername, adaptedConfiguration::setProxyUsername);
                bind(proxyConfiguration::getProxyPassword, adaptedConfiguration::setProxyPassword);
                bind(proxyConfiguration::getProxyDomain, adaptedConfiguration::setProxyDomain);
                bind(proxyConfiguration::getProxyWorkstation, adaptedConfiguration::setProxyWorkstation);
                bind(proxyConfiguration::getNonProxyHosts, adaptedConfiguration::setNonProxyHosts);
                bind(proxyConfiguration::isPreemptiveBasicProxyAuth, adaptedConfiguration::setPreemptiveBasicProxyAuth);
            }
        );

        customConfiguration.getTimeoutConfiguration().ifPresent(
            timeoutConfiguration -> {
                bind(timeoutConfiguration::getSocketTimeout, adaptedConfiguration::setSocketTimeout);
                bind(timeoutConfiguration::getConnectionTimeout, adaptedConfiguration::setConnectionTimeout);
                bind(timeoutConfiguration::getHttpRequestTimeout, adaptedConfiguration::setRequestTimeout);
                bind(timeoutConfiguration::getTotalExecutionTimeout, adaptedConfiguration::setClientExecutionTimeout);
            }
        );

        customConfiguration.getConnectionConfiguration().ifPresent(
            connectionConfiguration -> {
                bind(connectionConfiguration::getMaxConnections, adaptedConfiguration::setMaxConnections);
                bind(connectionConfiguration::getConnectionTTL, adaptedConfiguration::setConnectionTTL);
                bind(connectionConfiguration::getConnectionMaxIdleMillis, adaptedConfiguration::setConnectionMaxIdleMillis);
                bind(connectionConfiguration::isUseReaper, adaptedConfiguration::setUseReaper);
            }
        );

        return  adaptedConfiguration;
    }

    public static <T> void bind(Supplier<Optional<T>> supplier, Consumer<T> consumer) {
        supplier.get().ifPresent(t -> consumer.accept(t));
    }
}