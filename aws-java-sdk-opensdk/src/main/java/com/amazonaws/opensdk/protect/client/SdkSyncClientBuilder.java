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
package com.amazonaws.opensdk.protect.client;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.monitoring.MonitoringListener;
import com.amazonaws.monitoring.CsmConfigurationProvider;
import com.amazonaws.monitoring.CsmConfigurationProviderChain;
import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.ProxyConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;
import com.amazonaws.opensdk.internal.auth.IamSignerFactory;
import com.amazonaws.opensdk.internal.auth.SignerProviderAdapter;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfiguration;
import com.amazonaws.opensdk.internal.config.ClientConfigurationAdapter;
import com.amazonaws.opensdk.protect.auth.IamRequestSigner;
import com.amazonaws.opensdk.protect.auth.RequestSignerRegistry;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.NoOpSigner;
import com.amazonaws.auth.RequestSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerAsRequestSigner;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.opensdk.retry.RetryPolicyBuilder;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.v2.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

import org.apache.http.conn.ConnectTimeoutException;

import java.net.BindException;
import java.net.ConnectException;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/**
 * Base class for all Open SDK client builders.
 *
 * @param <Subclass>    Concrete builder for better fluent setters.
 * @param <TypeToBuild> Type being built by concrete builder.
 */
public abstract class SdkSyncClientBuilder<Subclass extends SdkSyncClientBuilder, TypeToBuild> {

    private static final String USER_AGENT_PREFIX = "aws-apig-java";
    private static final String UA_NAME_VERSION_SEPERATOR = "/";

    private AWSCredentialsProvider iamCredentials;
    private String endpoint;
    private String apiKey;
    private String region = defaultRegion();
    private RetryPolicy retryPolicy;
    private RequestSignerRegistry signerRegistry = new RequestSignerRegistry();
    private final ApiGatewayClientConfiguration apiGatewayClientConfiguration
            = new ApiGatewayClientConfiguration();
    /*
     * Different services may have custom client configuration factories to vend defaults
     * tailored for that service.
     */
    private final ClientConfigurationFactory clientConfigFactory;

    protected SdkSyncClientBuilder(ClientConfigurationFactory clientConfigFactory) {
        this.clientConfigFactory = clientConfigFactory;
    }

    protected void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    protected void setIamCredentials(AWSCredentialsProvider iamCredentials) {
        this.iamCredentials = iamCredentials;
    }

    protected void setIamRegion(String iamRegion) {
        this.region = iamRegion;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Subclass endpoint(String endpoint) {
        setEndpoint(endpoint);
        return getSubclass();
    }

    /**
     * Sets the optional proxy configuration of a client.
     *
     * @param proxyConfiguration The proxy configuration of the client.
     */
    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        apiGatewayClientConfiguration.setProxyConfiguration(proxyConfiguration);
    }

    /**
     * Sets the optional proxy configuration of a client.
     *
     * @param proxyConfiguration The proxy configuration of the client.
     * @return This object for method chaining.
     */
    public Subclass proxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
        return getSubclass();
    }

    /**
     * Sets the optional timeouts used by the client.
     *
     * @param timeoutConfiguration The {@link TimeoutConfiguration} object with the custom timeouts.
     */
    public void setTimeoutConfiguration(TimeoutConfiguration timeoutConfiguration) {
        apiGatewayClientConfiguration.setTimeoutConfiguration(timeoutConfiguration);
    }

    /**
     * Sets the optional timeouts used by the client.
     *
     * @param timeoutConfiguration The {@link TimeoutConfiguration} object with the custom timeouts.
     * @return This object for method chaining.
     */
    public Subclass timeoutConfiguration(TimeoutConfiguration timeoutConfiguration) {
        setTimeoutConfiguration(timeoutConfiguration);
        return getSubclass();
    }

    /**
     * Sets various optional options related to the http connection pool and connections.
     *
     * @param connectionConfiguration The {@link ConnectionConfiguration} object with the custom values.
     */
    public void setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        apiGatewayClientConfiguration.setConnectionConfiguration(connectionConfiguration);
    }

    /**
     * Sets various optional options related to the http connection pool and connections.
     *
     * @param connectionConfiguration The {@link ConnectionConfiguration} object with the custom values.
     * @return This object for method chaining.
     */
    public Subclass connectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        setConnectionConfiguration(connectionConfiguration);
        return getSubclass();
    }

    /**
     * Sets a custom retry policy to use in the event of an error. See {@link RetryPolicyBuilder} for a declarative way to create
     * a retry policy.
     *
     * @param retryPolicy Custom retry policy to use for the client.
     */
    public Subclass retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return getSubclass();
    }

    /**
     * Sets a custom retry policy to use in the event of an error. See {@link RetryPolicyBuilder} for a declarative way to create
     * a retry policy.
     *
     * @param retryPolicy Custom retry policy to use for the client.
     */
    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    protected abstract URI defaultEndpoint();

    protected abstract String defaultRegion();

    protected Signer defaultIamSigner() {
        return new NoOpSigner();
    }

    protected IamSignerFactory signerFactory() {
        return new IamSignerFactory(region);
    }

    public final TypeToBuild build() {
        return build(new BuilderParams());
    }

    protected abstract TypeToBuild build(AwsSyncClientParams params);

    @SuppressWarnings("unchecked")
    private Subclass getSubclass() {
        return (Subclass) this;
    }

    protected Subclass signer(RequestSigner requestSigner, Class<? extends RequestSigner> signerType) {
        signerRegistry = signerRegistry.register(requestSigner, signerType);
        return getSubclass();
    }

    private class BuilderParams extends AwsSyncClientParams {

        private AWSCredentialsProvider resolveCredentials() {
            return iamCredentials == null ? new AnonymousCredentialsProvider() : iamCredentials;
        }

        @Override
        public AWSCredentialsProvider getCredentialsProvider() {
            return resolveCredentials();
        }

        @Override
        public ClientConfiguration getClientConfiguration() {
            return resolveClientConfiguration();
        }

        private ClientConfiguration resolveClientConfiguration() {
            ClientConfiguration config = ClientConfigurationAdapter
                    .adapt(apiGatewayClientConfiguration, clientConfigFactory.getConfig());

            if (apiKey != null) {
                config.addHeader("x-api-key", apiKey);
            }
            config.setUserAgentPrefix(USER_AGENT_PREFIX + UA_NAME_VERSION_SEPERATOR + VersionInfoUtils.getVersion());
            return config;
        }

        @Override
        public RequestMetricCollector getRequestMetricCollector() {
            return null;
        }

        @Override
        public List<RequestHandler2> getRequestHandlers() {
            return Collections.emptyList();
        }

        @Override
        public CsmConfigurationProvider getClientSideMonitoringConfigurationProvider() {
            // Empty chain
            return new CsmConfigurationProviderChain();
        }

        @Override
        public MonitoringListener getMonitoringListener() {
            return null;
        }

        @Override
        public SignerProvider getSignerProvider() {
            if (iamCredentials != null) {
                signerRegistry = signerRegistry
                        .register(new SignerAsRequestSigner(defaultIamSigner(), iamCredentials), IamRequestSigner.class);
            }
            return new SignerProviderAdapter(signerRegistry);
        }

        @Override
        public URI getEndpoint() {
            return endpoint != null ? URI.create(endpoint) : defaultEndpoint();
        }

        @Override
        public RetryPolicy getRetryPolicy() {
            return retryPolicy == null ? getDefaultRetryPolicy() : retryPolicy;
        }
    }

    private static class AnonymousCredentialsProvider implements AWSCredentialsProvider {

        @Override
        public AWSCredentials getCredentials() {
            return null;
        }

        @Override
        public void refresh() {
        }
    }

    /**
     * Returns the default retry policy for ApiGateway clients.
     */
    private RetryPolicy getDefaultRetryPolicy() {
        return RetryPolicyBuilder.standard()
                .retryOnExceptions(ConnectException.class, BindException.class, ConnectTimeoutException.class)
                .retryOnStatusCodes(429)
                .backoffStrategy(PredefinedRetryPolicies.DEFAULT_BACKOFF_STRATEGY_V2)
                .maxNumberOfRetries(PredefinedRetryPolicies.DEFAULT_MAX_ERROR_RETRY)
                .build();
    }

}
