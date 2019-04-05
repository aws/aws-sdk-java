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
package com.amazonaws.client.builder;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.PredefinedClientConfigurations;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.monitoring.MonitoringListener;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.monitoring.CsmConfigurationProvider;
import com.amazonaws.monitoring.DefaultCsmConfigurationProviderChain;
import com.amazonaws.regions.AwsRegionProvider;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * Base class for all service specific client builders.
 *
 * @param <Subclass> Concrete builder type, used for better fluent methods.
 * @param <TypeToBuild>  Type that this builder builds.
 */
@NotThreadSafe
@SdkProtectedApi
public abstract class AwsClientBuilder<Subclass extends AwsClientBuilder, TypeToBuild> {

    /**
     * Default Region Provider chain. Used only when the builder is not explicitly configured with a
     * region.
     */
    private static final AwsRegionProvider DEFAULT_REGION_PROVIDER = new DefaultAwsRegionProviderChain();

    /**
     * Different services may have custom client configuration factories to vend defaults tailored
     * for that service. If no explicit client configuration is provided to the builder the default
     * factory for the service is used.
     */
    private final ClientConfigurationFactory clientConfigFactory;

    /**
     * {@link AwsRegionProvider} to use when no explicit region or endpointConfiguration is configured.
     * This is currently not exposed for customization by customers.
     */
    private final AwsRegionProvider regionProvider;

    private final AdvancedConfig.Builder advancedConfig = AdvancedConfig.builder();

    private AWSCredentialsProvider credentials;
    private ClientConfiguration clientConfig;
    private RequestMetricCollector metricsCollector;
    private Region region;
    private List<RequestHandler2> requestHandlers;
    private EndpointConfiguration endpointConfiguration;
    private CsmConfigurationProvider csmConfig;
    private MonitoringListener monitoringListener;

    protected AwsClientBuilder(ClientConfigurationFactory clientConfigFactory) {
        this(clientConfigFactory, DEFAULT_REGION_PROVIDER);
    }

    @SdkTestInternalApi
    protected AwsClientBuilder(ClientConfigurationFactory clientConfigFactory,
                               AwsRegionProvider regionProvider) {
        this.clientConfigFactory = clientConfigFactory;
        this.regionProvider = regionProvider;
    }

    /**
     * Gets the AWSCredentialsProvider currently configured in the builder.
     */
    public final AWSCredentialsProvider getCredentials() {
        return this.credentials;
    }

    /**
     * Sets the AWSCredentialsProvider used by the client. If not specified the default is {@link
     * DefaultAWSCredentialsProviderChain}.
     *
     * @param credentialsProvider New AWSCredentialsProvider to use.
     */
    public final void setCredentials(AWSCredentialsProvider credentialsProvider) {
        this.credentials = credentialsProvider;
    }

    /**
     * Sets the AWSCredentialsProvider used by the client. If not specified the default is {@link
     * DefaultAWSCredentialsProviderChain}.
     *
     * @param credentialsProvider New AWSCredentialsProvider to use.
     * @return This object for method chaining.
     */
    public final Subclass withCredentials(AWSCredentialsProvider credentialsProvider) {
        setCredentials(credentialsProvider);
        return getSubclass();
    }

    /**
     * If the builder isn't explicitly configured with credentials we use the {@link
     * DefaultAWSCredentialsProviderChain}.
     */
    private AWSCredentialsProvider resolveCredentials() {
        return (credentials == null) ? DefaultAWSCredentialsProviderChain.getInstance() : credentials;
    }

    /**
     * Gets the ClientConfiguration currently configured in the builder
     */
    public final ClientConfiguration getClientConfiguration() {
        return this.clientConfig;
    }

    /**
     * Sets the ClientConfiguration to be used by the client. If not specified the default is
     * typically {@link PredefinedClientConfigurations#defaultConfig} but may differ per service.
     *
     * @param config Custom configuration to use
     */
    public final void setClientConfiguration(ClientConfiguration config) {
        this.clientConfig = config;
    }

    /**
     * Sets the ClientConfiguration to be used by the client. If not specified the default is
     * typically {@link PredefinedClientConfigurations#defaultConfig} but may differ per service.
     *
     * @param config Custom configuration to use
     * @return This object for method chaining.
     */
    public final Subclass withClientConfiguration(ClientConfiguration config) {
        setClientConfiguration(config);
        return getSubclass();
    }

    /**
     * If not explicit client configuration is provided we consult the {@link
     * ClientConfigurationFactory} of the service. If an explicit configuration is provided we use
     * ClientConfiguration's copy constructor to avoid mutation.
     */
    private ClientConfiguration resolveClientConfiguration() {
        return (clientConfig == null) ? clientConfigFactory.getConfig() :
                new ClientConfiguration(clientConfig);
    }

    /**
     * Gets the {@link RequestMetricCollector} in use by the builder.
     */
    public final RequestMetricCollector getMetricsCollector() {
        return this.metricsCollector;
    }

    /**
     * Sets a custom RequestMetricCollector to use for the client.
     *
     * @param metrics Custom RequestMetricCollector to use.
     */
    public final void setMetricsCollector(RequestMetricCollector metrics) {
        this.metricsCollector = metrics;
    }

    /**
     * Sets a custom RequestMetricCollector to use for the client.
     *
     * @param metrics Custom RequestMetricCollector to use.
     * @return This object for method chaining.
     */
    public final Subclass withMetricsCollector(RequestMetricCollector metrics) {
        setMetricsCollector(metrics);
        return getSubclass();
    }

    /**
     * Gets the region in use by the builder.
     */
    public final String getRegion() {
        return region == null ? null : region.getName();
    }

    /**
     * Sets the region to be used by the client. This will be used to determine both the
     * service endpoint (eg: https://sns.us-west-1.amazonaws.com) and signing region (eg: us-west-1)
     * for requests. If neither region or endpoint configuration {@link #setEndpointConfiguration(EndpointConfiguration)}
     * are explicitly provided in the builder the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * @param region Region to use
     */
    public final void setRegion(String region) {
        withRegion(region);
    }

    /**
     * Sets the region to be used by the client. This will be used to determine both the
     * service endpoint (eg: https://sns.us-west-1.amazonaws.com) and signing region (eg: us-west-1)
     * for requests. If neither region or endpoint configuration {@link #setEndpointConfiguration(EndpointConfiguration)}
     * are explicitly provided in the builder the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * <p> For regions not explicitly in the {@link Regions} enum use the {@link
     * #withRegion(String)} overload.</p>
     *
     * @param region Region to use
     * @return This object for method chaining.
     */
    public final Subclass withRegion(Regions region) {
        return withRegion(region.getName());
    }

    /**
     * Sets the region to be used by the client. This will be used to determine both the
     * service endpoint (eg: https://sns.us-west-1.amazonaws.com) and signing region (eg: us-west-1)
     * for requests. If neither region or endpoint configuration {@link #setEndpointConfiguration(EndpointConfiguration)}
     * are explicitly provided in the builder the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * @param region Region to use
     * @return This object for method chaining.
     */
    public final Subclass withRegion(String region) {
        return withRegion(getRegionObject(region));
    }

    /**
     * Lookups the {@link Region} object for the given string region name.
     *
     * @param regionStr Region name.
     * @return Region object.
     * @throws SdkClientException If region cannot be found in the metadata.
     */
    private Region getRegionObject(String regionStr) {
        Region regionObj = RegionUtils.getRegion(regionStr);
        if (regionObj == null) {
            throw new SdkClientException(String.format("Could not find region information for '%s' in SDK metadata.",
                                                             regionStr));
        }
        return regionObj;
    }

    /**
     * Sets the region to be used by the client. This will be used to determine both the
     * service endpoint (eg: https://sns.us-west-1.amazonaws.com) and signing region (eg: us-west-1)
     * for requests. If neither region or endpoint configuration {@link #setEndpointConfiguration(EndpointConfiguration)}
     * are explicitly provided in the builder the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * @param region Region to use, this will be used to determine both service endpoint
     *               and the signing region
     * @return This object for method chaining.
     */
    private Subclass withRegion(Region region) {
        this.region = region;
        return getSubclass();
    }

    /**
     * Gets the service endpointConfiguration in use by the builder
     */
    public final EndpointConfiguration getEndpoint() {
        return endpointConfiguration;
    }

    /**
     * Sets the endpoint configuration (service endpoint & signing region) to be used for requests. If neither region {@link #setRegion(String)}
     * or endpoint configuration are explicitly provided in the builder the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * <p><b>Only use this if using a non-standard service endpoint - the recommended approach for configuring a client is to use {@link #setRegion(String)}</b>
     *
     * @param endpointConfiguration The endpointConfiguration to use
     */
    public final void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        withEndpointConfiguration(endpointConfiguration);
    }

    /**
     * Sets the endpoint configuration (service endpoint & signing region) to be used for requests. If neither region {@link #withRegion(String)}
     * or endpoint configuration are explicitly provided in the builder the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * <p><b>Only use this if using a non-standard service endpoint - the recommended approach for configuring a client is to use {@link #withRegion(String)}</b>
     *
     * @param endpointConfiguration The endpointConfiguration to use
     * @return This object for method chaining.
     */
    public final Subclass withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return getSubclass();
    }

    /**
     * Gets the list of request handlers in use by the builder.
     */
    public final List<RequestHandler2> getRequestHandlers() {
        return this.requestHandlers == null ? null :
                Collections.unmodifiableList(this.requestHandlers);
    }

    /**
     * Sets the request handlers to use in the client.
     *
     * @param handlers Request handlers to use for client.
     */
    public final void setRequestHandlers(RequestHandler2... handlers) {
        this.requestHandlers = Arrays.asList(handlers);
    }

    /**
     * Sets the request handlers to use in the client.
     *
     * @param handlers Request handlers to use for client.
     * @return This object for method chaining.
     */
    public final Subclass withRequestHandlers(RequestHandler2... handlers) {
        setRequestHandlers(handlers);
        return getSubclass();
    }

    /**
     * Gets the {@link MonitoringListener} in use by the builder.
     */
    public final MonitoringListener getMonitoringListener() {
        return this.monitoringListener;
    }

    /**
     * Sets a custom MonitoringListener to use for the client.
     *
     * @param monitoringListener Custom Monitoring Listener to use.
     */
    public final void setMonitoringListener(MonitoringListener monitoringListener) {
        this.monitoringListener = monitoringListener;
    }

    /**
     * Sets a custom MonitoringListener to use for the client.
     *
     * @param monitoringListener Custom MonitoringListener to use.
     * @return This object for method chaining.
     */
    public final Subclass withMonitoringListener(MonitoringListener monitoringListener) {
        setMonitoringListener(monitoringListener);
        return getSubclass();
    }

    /**
     * Request handlers are copied to a new list to avoid mutation, if no request handlers are
     * provided to the builder we supply an empty list.
     */
    private List<RequestHandler2> resolveRequestHandlers() {
        return (requestHandlers == null) ? new ArrayList<RequestHandler2>() :
                new ArrayList<RequestHandler2>(requestHandlers);
    }

    public CsmConfigurationProvider getClientSideMonitoringConfigurationProvider() {
        return csmConfig;
    }

    public void setClientSideMonitoringConfigurationProvider(CsmConfigurationProvider csmConfig) {
        this.csmConfig = csmConfig;
    }

    public Subclass withClientSideMonitoringConfigurationProvider(
            CsmConfigurationProvider csmConfig) {
        setClientSideMonitoringConfigurationProvider(csmConfig);
        return getSubclass();
    }

    private CsmConfigurationProvider resolveClientSideMonitoringConfig() {
        return csmConfig == null ? DefaultCsmConfigurationProviderChain.getInstance() : csmConfig;
    }

    /**
     * Get the current value of an advanced config option.
     * @param key Key of value to get.
     * @param <T> Type of value to get.
     * @return Value if set, otherwise null.
     */
    protected final <T> T getAdvancedConfig(AdvancedConfig.Key<T> key) {
        return advancedConfig.get(key);
    }

    /**
     * Sets the value of an advanced config option.
     * @param key Key of value to set.
     * @param value The new value.
     * @param <T> Type of value.
     */
    protected final <T> void putAdvancedConfig(AdvancedConfig.Key<T> key, T value) {
        advancedConfig.put(key, value);
    }

    /**
     * Region and endpoint logic is tightly coupled to the client class right now so it's easier to
     * set them after client creation and let the normal logic kick in. Ideally this should resolve
     * the endpoint and signer information here and just pass that information as is to the client.
     *
     * @param clientInterface Client to configure
     */
    @SdkInternalApi
    final TypeToBuild configureMutableProperties(TypeToBuild clientInterface) {
        AmazonWebServiceClient client = (AmazonWebServiceClient) clientInterface;
        setRegion(client);
        client.makeImmutable();
        return clientInterface;
    }

    /**
     * Builds a client with the configure properties.
     *
     * @return Client instance to make API calls with.
     */
    public abstract TypeToBuild build();

    /**
     * @return An instance of AwsSyncClientParams that has all params to be used in the sync client
     * constructor.
     */
    protected final AwsSyncClientParams getSyncClientParams() {
        return new SyncBuilderParams();
    }

    protected final AdvancedConfig getAdvancedConfig() {
        return advancedConfig.build();
    }

    private void setRegion(AmazonWebServiceClient client) {
        if (region != null && endpointConfiguration != null) {
            throw new IllegalStateException("Only one of Region or EndpointConfiguration may be set.");
        }
        if (endpointConfiguration != null) {
            client.setEndpoint(endpointConfiguration.getServiceEndpoint());
            client.setSignerRegionOverride(endpointConfiguration.getSigningRegion());
        } else if (region != null) {
            client.setRegion(region);
        } else {
            final String region = determineRegionFromRegionProvider();
            if (region != null) {
                client.setRegion(getRegionObject(region));
            } else {
                throw new SdkClientException(
                        "Unable to find a region via the region provider chain. " +
                        "Must provide an explicit region in the builder or setup environment to supply a region.");
            }
        }
    }

    /**
     * Attempt to determine the region from the configured region provider. This will return null in the event that the
     * region provider could not determine the region automatically.
     */
    private String determineRegionFromRegionProvider() {
        try {
            return regionProvider.getRegion();
        }
        catch (SdkClientException e) {
            // The AwsRegionProviderChain that is used by default throws an exception instead of returning null when
            // the region is not defined. For that reason, we have to support both throwing an exception and returning
            // null as the region not being defined.
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    protected final Subclass getSubclass() {
        return (Subclass) this;
    }

    /**
     * Presents a view of the builder to be used in a client constructor.
     */
    protected class SyncBuilderParams extends AwsAsyncClientParams {


        private final ClientConfiguration _clientConfig;
        private final AWSCredentialsProvider _credentials;
        private final RequestMetricCollector _metricsCollector;
        private final List<RequestHandler2> _requestHandlers;
        private final CsmConfigurationProvider _csmConfig;
        private final MonitoringListener _monitoringListener;
        private final AdvancedConfig _advancedConfig;

        protected SyncBuilderParams() {
            this._clientConfig = resolveClientConfiguration();
            this._credentials = resolveCredentials();
            this._metricsCollector = metricsCollector;
            this._requestHandlers = resolveRequestHandlers();
            this._csmConfig = resolveClientSideMonitoringConfig();
            this._monitoringListener = monitoringListener;
            this._advancedConfig = advancedConfig.build();
        }

        @Override
        public AWSCredentialsProvider getCredentialsProvider() {
            return this._credentials;
        }

        @Override
        public ClientConfiguration getClientConfiguration() {
            return this._clientConfig;
        }

        @Override
        public RequestMetricCollector getRequestMetricCollector() {
            return this._metricsCollector;
        }

        @Override
        public List<RequestHandler2> getRequestHandlers() {
            return this._requestHandlers;
        }

        @Override
        public CsmConfigurationProvider getClientSideMonitoringConfigurationProvider() {
            return this._csmConfig;
        }

        @Override
        public MonitoringListener getMonitoringListener() {
            return this._monitoringListener;
        }

        @Override
        public AdvancedConfig getAdvancedConfig() {
            return _advancedConfig;
        }

        @Override
        public ExecutorService getExecutor() {
            throw new UnsupportedOperationException("ExecutorService is not used for sync client.");
        }

    }

    /**
     * A container for configuration required to submit requests to a service (service endpoint and signing region)
     */
    public static final class EndpointConfiguration {
        private final String serviceEndpoint;
        private final String signingRegion;

        /**
         * @param serviceEndpoint the service endpoint either with or without the protocol (e.g. https://sns.us-west-1.amazonaws.com or sns.us-west-1.amazonaws.com)
         * @param signingRegion the region to use for SigV4 signing of requests (e.g. us-west-1)
         */
        public EndpointConfiguration(String serviceEndpoint, String signingRegion) {
            this.serviceEndpoint = serviceEndpoint;
            this.signingRegion = signingRegion;
        }

        public String getServiceEndpoint() {
            return serviceEndpoint;
        }

        public String getSigningRegion() {
            return signingRegion;
        }
    }

}
