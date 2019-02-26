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

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.PredefinedClientConfigurations;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.AwsRegionProvider;
import com.amazonaws.regions.RegionMetadata;
import com.amazonaws.regions.RegionMetadataProvider;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.junit.Test;
import org.mockito.Mockito;
import utils.builder.StaticExecutorFactory;

public class AwsClientBuilderTest {

    // Note that the tests rely on the socket timeout being set to some arbitrary unique value
    private static final ClientConfiguration DEFAULT_CLIENT_CONFIG = new ClientConfiguration()
            .withSocketTimeout(9001);

    private static class ConcreteRequestHandler extends RequestHandler2 {
    }

    private static class MockClientConfigurationFactory extends ClientConfigurationFactory {
        @Override
        protected ClientConfiguration getDefaultConfig() {
            return DEFAULT_CLIENT_CONFIG;
        }
    }

    private static class ConcreteAsyncBuilder extends
                                              AwsAsyncClientBuilder<ConcreteAsyncBuilder, AmazonConcreteClient> {
        private ConcreteAsyncBuilder() {
            super(new MockClientConfigurationFactory());
        }

        private ConcreteAsyncBuilder(AwsRegionProvider mockRegionProvider) {
            super(new MockClientConfigurationFactory(), mockRegionProvider);
        }

        @Override
        protected AmazonConcreteClient build(AwsAsyncClientParams asyncClientParams) {
            return new AmazonConcreteClient(asyncClientParams);
        }
    }

    private static class ConcreteSyncBuilder extends
                                             AwsSyncClientBuilder<ConcreteSyncBuilder, AmazonConcreteClient> {
        private ConcreteSyncBuilder() {
            super(new MockClientConfigurationFactory());
        }

        @Override
        protected AmazonConcreteClient build(AwsSyncClientParams asyncClientParams) {
            return new AmazonConcreteClient(asyncClientParams);
        }
    }

    /**
     * Dummy client used by both the {@link ConcreteSyncBuilder} and {@link ConcreteAsyncBuilder}.
     * Captures the param object the client was created for for verification in tests.
     */
    private static class AmazonConcreteClient extends AmazonWebServiceClient {

        private AwsAsyncClientParams asyncParams;
        private AwsSyncClientParams syncParams;

        private AmazonConcreteClient(AwsAsyncClientParams asyncParams) {
            super(new ClientConfiguration());
            this.asyncParams = asyncParams;
        }

        private AmazonConcreteClient(AwsSyncClientParams syncParams) {
            super(new ClientConfiguration());
            this.syncParams = syncParams;
        }

        @Override
        public String getServiceNameIntern() {
            return "mockservice";
        }

        @Override
        public String getEndpointPrefix() {
            return "mockprefix";
        }

        public URI getEndpoint() {
            return this.endpoint;
        }

        public AwsAsyncClientParams getAsyncParams() {
            return asyncParams;
        }

        public AwsSyncClientParams getSyncParams() {
            return syncParams;
        }
    }

    /**
     * The sync client is tested less thoroughly then the async client primarily because the async
     * client exercises most of the same code paths so a bug introduced in the sync client builder
     * should be exposed via tests written against the async builder. This test is mainly for
     * additional coverage of the sync builder in case there is a regression specific to sync
     * builders.
     */
    @Test
    public void syncClientBuilder() {
        final List<RequestHandler2> requestHandlers = createRequestHandlerList(
                new ConcreteRequestHandler(), new ConcreteRequestHandler());
        final AWSCredentialsProvider credentials = mock(AWSCredentialsProvider.class);
        final RequestMetricCollector metrics = mock(RequestMetricCollector.class);

        //@formatter:off
        AmazonConcreteClient client = new ConcreteSyncBuilder()
                .withRegion(Regions.EU_CENTRAL_1)
                .withClientConfiguration(new ClientConfiguration().withSocketTimeout(1234))
                .withCredentials(credentials)
                .withMetricsCollector(metrics)
                .withRequestHandlers(requestHandlers.toArray(new RequestHandler2[requestHandlers.size()]))
                .build();
        //@formatter:on

        assertEquals(URI.create("https://mockprefix.eu-central-1.amazonaws.com"),
                     client.getEndpoint());
        assertEquals(1234, client.getSyncParams().getClientConfiguration().getSocketTimeout());
        assertEquals(requestHandlers, client.getSyncParams().getRequestHandlers());
        assertEquals(credentials, client.getSyncParams().getCredentialsProvider());
        assertEquals(metrics, client.getSyncParams().getRequestMetricCollector());
    }


    @Test
    public void credentialsNotExplicitlySet_UsesDefaultCredentialChain() throws Exception {
        AwsAsyncClientParams params = builderWithRegion().build().getAsyncParams();
        assertThat(params.getCredentialsProvider(),
                   instanceOf(DefaultAWSCredentialsProviderChain.class));
    }

    @Test
    public void regionProvidedExplicitly_WhenRegionNotFoundInMetadata_ThrowsIllegalArgumentException() throws Exception {
        try {
            RegionUtils.initializeWithMetadata(new RegionMetadata(Mockito.mock(RegionMetadataProvider.class)));
            new ConcreteAsyncBuilder().withRegion(Regions.AP_NORTHEAST_1);
            fail("Expected SdkClientException");
        } catch (SdkClientException e) {
            assertThat(e.getMessage(), containsString("Could not find region information"));
        } finally {
            // Reset region metadata
            RegionUtils.initialize();
        }
    }

    /**
     * Customers may not need to explicitly configure a builder with a region if one can be found
     * from the {@link AwsRegionProvider} implementation. We mock the provider to yield consistent
     * results for the tests.
     */
    @Test
    public void regionProvidedByChain_WhenRegionNotFoundInMetadata_ThrowsIllegalArgumentException() {
        try {
            RegionUtils.initializeWithMetadata(new RegionMetadata(Mockito.mock(RegionMetadataProvider.class)));
            AwsRegionProvider mockRegionProvider = mock(AwsRegionProvider.class);
            when(mockRegionProvider.getRegion()).thenReturn("ap-southeast-2");
            new ConcreteAsyncBuilder(mockRegionProvider).build();
            fail("Expected SdkClientException");
        } catch (SdkClientException e) {
            assertThat(e.getMessage(), containsString("Could not find region information"));
        } finally {
            // Reset region metadata
            RegionUtils.initialize();
        }
    }

    @Test
    public void credentialsExplicitlySet_UsesExplicitCredentials() throws Exception {
        AWSCredentialsProvider provider = new StaticCredentialsProvider(
                new BasicAWSCredentials("akid", "skid"));
        AwsAsyncClientParams params = builderWithRegion().withCredentials(provider).build()
                .getAsyncParams();
        assertEquals(provider, params.getCredentialsProvider());
    }

    @Test
    public void metricCollectorNotExplicitlySet_UsesNullMetricsCollector() throws Exception {
        assertNull(builderWithRegion().build().getAsyncParams().getRequestMetricCollector());
    }

    @Test
    public void metricsCollectorExplicitlySet_UsesExplicitMetricsCollector() throws Exception {
        RequestMetricCollector metricCollector = RequestMetricCollector.NONE;
        AwsAsyncClientParams params = builderWithRegion().withMetricsCollector(metricCollector)
                .build().getAsyncParams();
        assertEquals(metricCollector, params.getRequestMetricCollector());
    }

    @Test
    public void clientConfigurationNotExplicitlySet_UsesServiceDefaultClientConfiguration() {
        AwsAsyncClientParams params = builderWithRegion().build().getAsyncParams();
        ClientConfiguration actualConfig = params.getClientConfiguration();
        assertEquals(DEFAULT_CLIENT_CONFIG.getSocketTimeout(), actualConfig.getSocketTimeout());
    }

    @Test
    public void clientConfigurationExplicitlySet_UsesExplicitConfiguration() {
        ClientConfiguration config = new ClientConfiguration().withSocketTimeout(1000);
        AwsAsyncClientParams params = builderWithRegion().withClientConfiguration(config).build()
                .getAsyncParams();
        assertEquals(config.getSocketTimeout(), params.getClientConfiguration().getSocketTimeout());
    }

    @Test
    public void explicitRegionIsSet_UsesRegionToConstructEndpoint() {
        URI actualUri = new ConcreteAsyncBuilder().withRegion(Regions.US_WEST_2).build()
                .getEndpoint();
        assertEquals(URI.create("https://mockprefix.us-west-2.amazonaws.com"), actualUri);
    }

    /**
     * If no region is explicitly given and no region can be found from the {@link
     * AwsRegionProvider} implementation then the builder should fail to build clients. We mock the
     * provider to yield consistent results for the tests.
     */
    @Test(expected = AmazonClientException.class)
    public void noRegionProvidedExplicitlyOrImplicitly_ThrowsException() {
        AwsRegionProvider mockRegionProvider = mock(AwsRegionProvider.class);
        when(mockRegionProvider.getRegion()).thenReturn(null);
        new ConcreteAsyncBuilder(mockRegionProvider).build();
    }

    /**
     * Customers may not need to explicitly configure a builder with a region if one can be found
     * from the {@link AwsRegionProvider} implementation. We mock the provider to yield consistent
     * results for the tests.
     */
    @Test
    public void regionImplicitlyProvided_UsesRegionToConstructEndpoint() {
        AwsRegionProvider mockRegionProvider = mock(AwsRegionProvider.class);
        when(mockRegionProvider.getRegion()).thenReturn("ap-southeast-2");
        final URI actualUri = new ConcreteAsyncBuilder(mockRegionProvider).build().getEndpoint();
        assertEquals(URI.create("https://mockprefix.ap-southeast-2.amazonaws.com"), actualUri);
    }

    @Test
    public void endpointAndSigningRegionCanBeUsedInPlaceOfSetRegion() {
        AmazonConcreteClient client = new ConcreteSyncBuilder()
                .withEndpointConfiguration(new EndpointConfiguration("https://mockprefix.ap-southeast-2.amazonaws.com", "us-east-1"))
                .build();
        assertEquals("us-east-1", client.getSignerRegionOverride());
        assertEquals(URI.create("https://mockprefix.ap-southeast-2.amazonaws.com"), client.getEndpoint());
    }

    @Test(expected = IllegalStateException.class)
    public void cannotSetBothEndpointConfigurationAndRegionOnBuilder() {
        new ConcreteSyncBuilder()
                .withEndpointConfiguration(new EndpointConfiguration("http://localhost:3030", "us-west-2"))
                .withRegion("us-east-1")
                .build();
    }

    @Test
    public void defaultClientConfigAndNoExplicitExecutor_UsesDefaultExecutorBasedOnMaxConns() {
        ExecutorService executor = builderWithRegion().build().getAsyncParams().getExecutor();
        assertThat(executor, instanceOf(ThreadPoolExecutor.class));
        assertEquals(PredefinedClientConfigurations.defaultConfig().getMaxConnections(),
                     ((ThreadPoolExecutor) executor).getMaximumPoolSize());
    }

    @Test
    public void customMaxConnsAndNoExplicitExecutor_UsesDefaultExecutorBasedOnMaxConns() {
        final int maxConns = 10;
        ExecutorService executor = builderWithRegion()
                .withClientConfiguration(new ClientConfiguration().withMaxConnections(maxConns))
                .build().getAsyncParams().getExecutor();
        assertThat(executor, instanceOf(ThreadPoolExecutor.class));
        assertEquals(maxConns, ((ThreadPoolExecutor) executor).getMaximumPoolSize());
    }

    /**
     * If a custom executor is set then the Max Connections in Client Configuration should be
     * ignored and the executor should be used as is.
     */
    @Test
    public void customMaxConnsAndExplicitExecutor_UsesExplicitExecutor() throws Exception {
        final int clientConfigMaxConns = 10;
        final int customExecutorThreadCount = 15;
        final ExecutorService customExecutor = Executors
                .newFixedThreadPool(customExecutorThreadCount);
        ExecutorService actualExecutor = builderWithRegion().withClientConfiguration(
                new ClientConfiguration().withMaxConnections(clientConfigMaxConns))
                .withExecutorFactory(new StaticExecutorFactory(customExecutor)).build()
                .getAsyncParams().getExecutor();
        assertThat(actualExecutor, instanceOf(ThreadPoolExecutor.class));
        assertEquals(customExecutor, actualExecutor);
        assertEquals(customExecutorThreadCount,
                     ((ThreadPoolExecutor) actualExecutor).getMaximumPoolSize());

    }

    @Test
    public void noRequestHandlersExplicitlySet_UsesEmptyRequestHandlerList() throws Exception {
        List<RequestHandler2> requestHandlers = builderWithRegion().build().getAsyncParams()
                .getRequestHandlers();
        assertThat(requestHandlers, empty());
    }

    @Test
    public void requestHandlersExplicitlySet_UsesClonedListOfExplicitRequestHandlers() throws
                                                                                       Exception {
        List<RequestHandler2> expectedHandlers = createRequestHandlerList(
                new ConcreteRequestHandler(), new ConcreteRequestHandler());
        List<RequestHandler2> actualHandlers = builderWithRegion()
                .withRequestHandlers(expectedHandlers.toArray(new RequestHandler2[0])).build()
                .getAsyncParams().getRequestHandlers();
        assertEquals(expectedHandlers, actualHandlers);
        // List should be copied or cloned
        assertThat(actualHandlers, not(sameInstance(expectedHandlers)));
    }

    @Test
    public void requestHandlersExplicitlySetWithVarArgs_UsesExplicitRequestHandlers() throws
                                                                                      Exception {
        RequestHandler2 handlerOne = new ConcreteRequestHandler();
        RequestHandler2 handlerTwo = new ConcreteRequestHandler();
        RequestHandler2 handlerThree = new ConcreteRequestHandler();
        List<RequestHandler2> actualHandlers = builderWithRegion()
                .withRequestHandlers(handlerOne, handlerTwo, handlerThree).build().getAsyncParams()
                .getRequestHandlers();
        assertEquals(createRequestHandlerList(handlerOne, handlerTwo, handlerThree),
                     actualHandlers);
    }

    /**
     * @return A {@link ConcreteAsyncBuilder} instance with an explicitly configured region.
     */
    private ConcreteAsyncBuilder builderWithRegion() {
        return new ConcreteAsyncBuilder().withRegion(Regions.AP_NORTHEAST_1);
    }

    private List<RequestHandler2> createRequestHandlerList(RequestHandler2... handlers) {
        List<RequestHandler2> requestHandlers = new ArrayList<RequestHandler2>();
        Collections.addAll(requestHandlers, handlers);
        return requestHandlers;
    }
}
