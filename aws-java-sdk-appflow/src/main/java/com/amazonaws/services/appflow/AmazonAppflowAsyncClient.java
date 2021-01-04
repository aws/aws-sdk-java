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
package com.amazonaws.services.appflow;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Appflow asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the Amazon AppFlow API reference. This guide is for developers who need detailed information about the
 * Amazon AppFlow API operations, data types, and errors.
 * </p>
 * <p>
 * Amazon AppFlow is a fully managed integration service that enables you to securely transfer data between software as
 * a service (SaaS) applications like Salesforce, Marketo, Slack, and ServiceNow, and AWS services like Amazon S3 and
 * Amazon Redshift.
 * </p>
 * <p>
 * Use the following links to get started on the Amazon AppFlow API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/API_Operations.html">Actions</a>: An alphabetical list
 * of all Amazon AppFlow API operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/API_Types.html">Data types</a>: An alphabetical list of
 * all Amazon AppFlow data types.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/CommonParameters.html">Common parameters</a>:
 * Parameters that all Query operations can use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/CommonErrors.html">Common errors</a>: Client and server
 * errors that all operations can return.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you're new to Amazon AppFlow, we recommend that you review the <a
 * href="https://docs.aws.amazon.com/appflow/latest/userguide/what-is-appflow.html">Amazon AppFlow User Guide</a>.
 * </p>
 * <p>
 * Amazon AppFlow API users can use vendor-specific mechanisms for OAuth, and include applicable OAuth attributes (such
 * as <code>auth-code</code> and <code>redirecturi</code>) with the connector-specific
 * <code>ConnectorProfileProperties</code> when creating a new connector profile using Amazon AppFlow API operations.
 * For example, Salesforce users can refer to the <a
 * href="https://help.salesforce.com/articleView?id=remoteaccess_authenticate.htm"> <i>Authorize Apps with OAuth</i>
 * </a> documentation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppflowAsyncClient extends AmazonAppflowClient implements AmazonAppflowAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonAppflowAsyncClientBuilder asyncBuilder() {
        return AmazonAppflowAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Appflow using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAppflowAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Appflow using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonAppflowAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateConnectorProfileResult> createConnectorProfileAsync(CreateConnectorProfileRequest request) {

        return createConnectorProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorProfileResult> createConnectorProfileAsync(final CreateConnectorProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectorProfileRequest, CreateConnectorProfileResult> asyncHandler) {
        final CreateConnectorProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectorProfileResult>() {
            @Override
            public CreateConnectorProfileResult call() throws Exception {
                CreateConnectorProfileResult result = null;

                try {
                    result = executeCreateConnectorProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest request) {

        return createFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(final CreateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler) {
        final CreateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowResult>() {
            @Override
            public CreateFlowResult call() throws Exception {
                CreateFlowResult result = null;

                try {
                    result = executeCreateFlow(finalRequest);
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
    public java.util.concurrent.Future<DeleteConnectorProfileResult> deleteConnectorProfileAsync(DeleteConnectorProfileRequest request) {

        return deleteConnectorProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorProfileResult> deleteConnectorProfileAsync(final DeleteConnectorProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectorProfileRequest, DeleteConnectorProfileResult> asyncHandler) {
        final DeleteConnectorProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectorProfileResult>() {
            @Override
            public DeleteConnectorProfileResult call() throws Exception {
                DeleteConnectorProfileResult result = null;

                try {
                    result = executeDeleteConnectorProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request) {

        return deleteFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(final DeleteFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler) {
        final DeleteFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowResult>() {
            @Override
            public DeleteFlowResult call() throws Exception {
                DeleteFlowResult result = null;

                try {
                    result = executeDeleteFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeConnectorEntityResult> describeConnectorEntityAsync(DescribeConnectorEntityRequest request) {

        return describeConnectorEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorEntityResult> describeConnectorEntityAsync(final DescribeConnectorEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectorEntityRequest, DescribeConnectorEntityResult> asyncHandler) {
        final DescribeConnectorEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectorEntityResult>() {
            @Override
            public DescribeConnectorEntityResult call() throws Exception {
                DescribeConnectorEntityResult result = null;

                try {
                    result = executeDescribeConnectorEntity(finalRequest);
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
    public java.util.concurrent.Future<DescribeConnectorProfilesResult> describeConnectorProfilesAsync(DescribeConnectorProfilesRequest request) {

        return describeConnectorProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorProfilesResult> describeConnectorProfilesAsync(final DescribeConnectorProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectorProfilesRequest, DescribeConnectorProfilesResult> asyncHandler) {
        final DescribeConnectorProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectorProfilesResult>() {
            @Override
            public DescribeConnectorProfilesResult call() throws Exception {
                DescribeConnectorProfilesResult result = null;

                try {
                    result = executeDescribeConnectorProfiles(finalRequest);
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
    public java.util.concurrent.Future<DescribeConnectorsResult> describeConnectorsAsync(DescribeConnectorsRequest request) {

        return describeConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorsResult> describeConnectorsAsync(final DescribeConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectorsRequest, DescribeConnectorsResult> asyncHandler) {
        final DescribeConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectorsResult>() {
            @Override
            public DescribeConnectorsResult call() throws Exception {
                DescribeConnectorsResult result = null;

                try {
                    result = executeDescribeConnectors(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest request) {

        return describeFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(final DescribeFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowRequest, DescribeFlowResult> asyncHandler) {
        final DescribeFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowResult>() {
            @Override
            public DescribeFlowResult call() throws Exception {
                DescribeFlowResult result = null;

                try {
                    result = executeDescribeFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowExecutionRecordsResult> describeFlowExecutionRecordsAsync(DescribeFlowExecutionRecordsRequest request) {

        return describeFlowExecutionRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowExecutionRecordsResult> describeFlowExecutionRecordsAsync(final DescribeFlowExecutionRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowExecutionRecordsRequest, DescribeFlowExecutionRecordsResult> asyncHandler) {
        final DescribeFlowExecutionRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowExecutionRecordsResult>() {
            @Override
            public DescribeFlowExecutionRecordsResult call() throws Exception {
                DescribeFlowExecutionRecordsResult result = null;

                try {
                    result = executeDescribeFlowExecutionRecords(finalRequest);
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
    public java.util.concurrent.Future<ListConnectorEntitiesResult> listConnectorEntitiesAsync(ListConnectorEntitiesRequest request) {

        return listConnectorEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorEntitiesResult> listConnectorEntitiesAsync(final ListConnectorEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectorEntitiesRequest, ListConnectorEntitiesResult> asyncHandler) {
        final ListConnectorEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectorEntitiesResult>() {
            @Override
            public ListConnectorEntitiesResult call() throws Exception {
                ListConnectorEntitiesResult result = null;

                try {
                    result = executeListConnectorEntities(finalRequest);
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
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest request) {

        return listFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(final ListFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler) {
        final ListFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowsResult>() {
            @Override
            public ListFlowsResult call() throws Exception {
                ListFlowsResult result = null;

                try {
                    result = executeListFlows(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest request) {

        return startFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(final StartFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFlowRequest, StartFlowResult> asyncHandler) {
        final StartFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFlowResult>() {
            @Override
            public StartFlowResult call() throws Exception {
                StartFlowResult result = null;

                try {
                    result = executeStartFlow(finalRequest);
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
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest request) {

        return stopFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(final StopFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopFlowRequest, StopFlowResult> asyncHandler) {
        final StopFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopFlowResult>() {
            @Override
            public StopFlowResult call() throws Exception {
                StopFlowResult result = null;

                try {
                    result = executeStopFlow(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateConnectorProfileResult> updateConnectorProfileAsync(UpdateConnectorProfileRequest request) {

        return updateConnectorProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorProfileResult> updateConnectorProfileAsync(final UpdateConnectorProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectorProfileRequest, UpdateConnectorProfileResult> asyncHandler) {
        final UpdateConnectorProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectorProfileResult>() {
            @Override
            public UpdateConnectorProfileResult call() throws Exception {
                UpdateConnectorProfileResult result = null;

                try {
                    result = executeUpdateConnectorProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest request) {

        return updateFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(final UpdateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowRequest, UpdateFlowResult> asyncHandler) {
        final UpdateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowResult>() {
            @Override
            public UpdateFlowResult call() throws Exception {
                UpdateFlowResult result = null;

                try {
                    result = executeUpdateFlow(finalRequest);
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
