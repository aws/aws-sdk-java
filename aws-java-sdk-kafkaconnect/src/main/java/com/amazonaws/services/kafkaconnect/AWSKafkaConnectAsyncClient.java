/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafkaconnect;

import javax.annotation.Generated;

import com.amazonaws.services.kafkaconnect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Kafka Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSKafkaConnectAsyncClient extends AWSKafkaConnectClient implements AWSKafkaConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSKafkaConnectAsyncClientBuilder asyncBuilder() {
        return AWSKafkaConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kafka Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSKafkaConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kafka Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSKafkaConnectAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest request) {

        return createConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(final CreateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler) {
        final CreateConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectorResult>() {
            @Override
            public CreateConnectorResult call() throws Exception {
                CreateConnectorResult result = null;

                try {
                    result = executeCreateConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCustomPluginResult> createCustomPluginAsync(CreateCustomPluginRequest request) {

        return createCustomPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomPluginResult> createCustomPluginAsync(final CreateCustomPluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomPluginRequest, CreateCustomPluginResult> asyncHandler) {
        final CreateCustomPluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomPluginResult>() {
            @Override
            public CreateCustomPluginResult call() throws Exception {
                CreateCustomPluginResult result = null;

                try {
                    result = executeCreateCustomPlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerConfigurationResult> createWorkerConfigurationAsync(CreateWorkerConfigurationRequest request) {

        return createWorkerConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerConfigurationResult> createWorkerConfigurationAsync(final CreateWorkerConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkerConfigurationRequest, CreateWorkerConfigurationResult> asyncHandler) {
        final CreateWorkerConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkerConfigurationResult>() {
            @Override
            public CreateWorkerConfigurationResult call() throws Exception {
                CreateWorkerConfigurationResult result = null;

                try {
                    result = executeCreateWorkerConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest request) {

        return deleteConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(final DeleteConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler) {
        final DeleteConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectorResult>() {
            @Override
            public DeleteConnectorResult call() throws Exception {
                DeleteConnectorResult result = null;

                try {
                    result = executeDeleteConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomPluginResult> deleteCustomPluginAsync(DeleteCustomPluginRequest request) {

        return deleteCustomPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomPluginResult> deleteCustomPluginAsync(final DeleteCustomPluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomPluginRequest, DeleteCustomPluginResult> asyncHandler) {
        final DeleteCustomPluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomPluginResult>() {
            @Override
            public DeleteCustomPluginResult call() throws Exception {
                DeleteCustomPluginResult result = null;

                try {
                    result = executeDeleteCustomPlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest request) {

        return describeConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(final DescribeConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectorRequest, DescribeConnectorResult> asyncHandler) {
        final DescribeConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectorResult>() {
            @Override
            public DescribeConnectorResult call() throws Exception {
                DescribeConnectorResult result = null;

                try {
                    result = executeDescribeConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomPluginResult> describeCustomPluginAsync(DescribeCustomPluginRequest request) {

        return describeCustomPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomPluginResult> describeCustomPluginAsync(final DescribeCustomPluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomPluginRequest, DescribeCustomPluginResult> asyncHandler) {
        final DescribeCustomPluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomPluginResult>() {
            @Override
            public DescribeCustomPluginResult call() throws Exception {
                DescribeCustomPluginResult result = null;

                try {
                    result = executeDescribeCustomPlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkerConfigurationResult> describeWorkerConfigurationAsync(DescribeWorkerConfigurationRequest request) {

        return describeWorkerConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkerConfigurationResult> describeWorkerConfigurationAsync(final DescribeWorkerConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkerConfigurationRequest, DescribeWorkerConfigurationResult> asyncHandler) {
        final DescribeWorkerConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkerConfigurationResult>() {
            @Override
            public DescribeWorkerConfigurationResult call() throws Exception {
                DescribeWorkerConfigurationResult result = null;

                try {
                    result = executeDescribeWorkerConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest request) {

        return listConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(final ListConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler) {
        final ListConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectorsResult>() {
            @Override
            public ListConnectorsResult call() throws Exception {
                ListConnectorsResult result = null;

                try {
                    result = executeListConnectors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCustomPluginsResult> listCustomPluginsAsync(ListCustomPluginsRequest request) {

        return listCustomPluginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomPluginsResult> listCustomPluginsAsync(final ListCustomPluginsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomPluginsRequest, ListCustomPluginsResult> asyncHandler) {
        final ListCustomPluginsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomPluginsResult>() {
            @Override
            public ListCustomPluginsResult call() throws Exception {
                ListCustomPluginsResult result = null;

                try {
                    result = executeListCustomPlugins(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkerConfigurationsResult> listWorkerConfigurationsAsync(ListWorkerConfigurationsRequest request) {

        return listWorkerConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkerConfigurationsResult> listWorkerConfigurationsAsync(final ListWorkerConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkerConfigurationsRequest, ListWorkerConfigurationsResult> asyncHandler) {
        final ListWorkerConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkerConfigurationsResult>() {
            @Override
            public ListWorkerConfigurationsResult call() throws Exception {
                ListWorkerConfigurationsResult result = null;

                try {
                    result = executeListWorkerConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest request) {

        return updateConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(final UpdateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectorRequest, UpdateConnectorResult> asyncHandler) {
        final UpdateConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectorResult>() {
            @Override
            public UpdateConnectorResult call() throws Exception {
                UpdateConnectorResult result = null;

                try {
                    result = executeUpdateConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
