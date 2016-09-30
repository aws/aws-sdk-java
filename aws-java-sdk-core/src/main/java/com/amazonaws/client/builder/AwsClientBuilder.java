/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.PredefinedClientConfigurations;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.metrics.RequestMetricCollector;
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
     * {@link AwsRegionProvider} to use when no explicit region is configured. This is currently
     * not
     * exposed for customization by customers.
     */
    private final AwsRegionProvider regionProvider;

    private AWSCredentialsProvider credentials;
    private ClientConfiguration clientConfig;
    private RequestMetricCollector metricsCollector;
    private Region region;
    private List<RequestHandler2> requestHandlers;

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
     * Sets the region to be used by the client. If region is not explicity provided in the builder
     * the {@link #DEFAULT_REGION_PROVIDER} is consulted.
     *
     * @param region Region to use
     */
    public final void setRegion(String region) {
        withRegion(region);
    }

    /**
     * Sets the region to be used by the client. If region is not explicity provided in the builder
     * the {@link #DEFAULT_REGION_PROVIDER} is consulted.
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
     * Sets the region to be used by the client. If region is not explicity provided in the builder
     * the DefaultRegionProviderChain is consulted.
     *
     * @param region Region to use
     * @return This object for method chaining.
     */
    public final Subclass withRegion(String region) {
        return withRegion(RegionUtils.getRegion(region));
    }

    /**
     * Sets the region to be used by the client. There is no default for region. You must provide
     * either a region or an endpoint.
     *
     * @param region Region to use
     * @return This object for method chaining.
     */
    private Subclass withRegion(Region region) {
        this.region = region;
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
     * Request handlers are copied to a new list to avoid mutation, if no request handlers are
     * provided to the builder we supply an empty list.
     */
    private List<RequestHandler2> resolveRequestHandlers() {
        return (requestHandlers == null) ? new ArrayList<RequestHandler2>() :
                new ArrayList<RequestHandler2>(requestHandlers);
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

    private <ClientClass extends AmazonWebServiceClient> void setRegion(ClientClass client) {
        if (region != null) {
            client.setRegion(region);
        } else {
            final String region = regionProvider.getRegion();
            if (region != null) {
                client.setRegion(RegionUtils.getRegion(region));
            } else {
                throw new AmazonClientException(
                        "Unable to find a region via the region provider chain. " +
                        "Must provide an explicit region in the builder or setup environment to supply a region.");
            }
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

        protected SyncBuilderParams() {
            this._clientConfig = resolveClientConfiguration();
            this._credentials = resolveCredentials();
            this._metricsCollector = metricsCollector;
            this._requestHandlers = resolveRequestHandlers();
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
        public ExecutorService getExecutor() {
            throw new UnsupportedOperationException("ExecutorService is not used for sync client.");
        }
    }

}
