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
package com.amazonaws.services.mgn;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing mgn asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * The Application Migration Service service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSmgnAsyncClient extends AWSmgnClient implements AWSmgnAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSmgnAsyncClientBuilder asyncBuilder() {
        return AWSmgnAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on mgn using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSmgnAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on mgn using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSmgnAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(ChangeServerLifeCycleStateRequest request) {

        return changeServerLifeCycleStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(final ChangeServerLifeCycleStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeServerLifeCycleStateRequest, ChangeServerLifeCycleStateResult> asyncHandler) {
        final ChangeServerLifeCycleStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangeServerLifeCycleStateResult>() {
            @Override
            public ChangeServerLifeCycleStateResult call() throws Exception {
                ChangeServerLifeCycleStateResult result = null;

                try {
                    result = executeChangeServerLifeCycleState(finalRequest);
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
    public java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest request) {

        return createReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            final CreateReplicationConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigurationTemplateRequest, CreateReplicationConfigurationTemplateResult> asyncHandler) {
        final CreateReplicationConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationConfigurationTemplateResult>() {
            @Override
            public CreateReplicationConfigurationTemplateResult call() throws Exception {
                CreateReplicationConfigurationTemplateResult result = null;

                try {
                    result = executeCreateReplicationConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest request) {

        return deleteJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(final DeleteJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler) {
        final DeleteJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobResult>() {
            @Override
            public DeleteJobResult call() throws Exception {
                DeleteJobResult result = null;

                try {
                    result = executeDeleteJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest request) {

        return deleteReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            final DeleteReplicationConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigurationTemplateRequest, DeleteReplicationConfigurationTemplateResult> asyncHandler) {
        final DeleteReplicationConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationConfigurationTemplateResult>() {
            @Override
            public DeleteReplicationConfigurationTemplateResult call() throws Exception {
                DeleteReplicationConfigurationTemplateResult result = null;

                try {
                    result = executeDeleteReplicationConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest request) {

        return deleteSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(final DeleteSourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSourceServerRequest, DeleteSourceServerResult> asyncHandler) {
        final DeleteSourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSourceServerResult>() {
            @Override
            public DeleteSourceServerResult call() throws Exception {
                DeleteSourceServerResult result = null;

                try {
                    result = executeDeleteSourceServer(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest request) {

        return describeJobLogItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(final DescribeJobLogItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobLogItemsRequest, DescribeJobLogItemsResult> asyncHandler) {
        final DescribeJobLogItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobLogItemsResult>() {
            @Override
            public DescribeJobLogItemsResult call() throws Exception {
                DescribeJobLogItemsResult result = null;

                try {
                    result = executeDescribeJobLogItems(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request) {

        return describeJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(final DescribeJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler) {
        final DescribeJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobsResult>() {
            @Override
            public DescribeJobsResult call() throws Exception {
                DescribeJobsResult result = null;

                try {
                    result = executeDescribeJobs(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest request) {

        return describeReplicationConfigurationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            final DescribeReplicationConfigurationTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigurationTemplatesRequest, DescribeReplicationConfigurationTemplatesResult> asyncHandler) {
        final DescribeReplicationConfigurationTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationConfigurationTemplatesResult>() {
            @Override
            public DescribeReplicationConfigurationTemplatesResult call() throws Exception {
                DescribeReplicationConfigurationTemplatesResult result = null;

                try {
                    result = executeDescribeReplicationConfigurationTemplates(finalRequest);
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
    public java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest request) {

        return describeSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(final DescribeSourceServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSourceServersRequest, DescribeSourceServersResult> asyncHandler) {
        final DescribeSourceServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSourceServersResult>() {
            @Override
            public DescribeSourceServersResult call() throws Exception {
                DescribeSourceServersResult result = null;

                try {
                    result = executeDescribeSourceServers(finalRequest);
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
    public java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(DisconnectFromServiceRequest request) {

        return disconnectFromServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(final DisconnectFromServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectFromServiceRequest, DisconnectFromServiceResult> asyncHandler) {
        final DisconnectFromServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectFromServiceResult>() {
            @Override
            public DisconnectFromServiceResult call() throws Exception {
                DisconnectFromServiceResult result = null;

                try {
                    result = executeDisconnectFromService(finalRequest);
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
    public java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(FinalizeCutoverRequest request) {

        return finalizeCutoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(final FinalizeCutoverRequest request,
            final com.amazonaws.handlers.AsyncHandler<FinalizeCutoverRequest, FinalizeCutoverResult> asyncHandler) {
        final FinalizeCutoverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FinalizeCutoverResult>() {
            @Override
            public FinalizeCutoverResult call() throws Exception {
                FinalizeCutoverResult result = null;

                try {
                    result = executeFinalizeCutover(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest request) {

        return getLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(final GetLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchConfigurationRequest, GetLaunchConfigurationResult> asyncHandler) {
        final GetLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchConfigurationResult>() {
            @Override
            public GetLaunchConfigurationResult call() throws Exception {
                GetLaunchConfigurationResult result = null;

                try {
                    result = executeGetLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(GetReplicationConfigurationRequest request) {

        return getReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(final GetReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationConfigurationRequest, GetReplicationConfigurationResult> asyncHandler) {
        final GetReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationConfigurationResult>() {
            @Override
            public GetReplicationConfigurationResult call() throws Exception {
                GetReplicationConfigurationResult result = null;

                try {
                    result = executeGetReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest request) {

        return initializeServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(final InitializeServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitializeServiceRequest, InitializeServiceResult> asyncHandler) {
        final InitializeServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InitializeServiceResult>() {
            @Override
            public InitializeServiceResult call() throws Exception {
                InitializeServiceResult result = null;

                try {
                    result = executeInitializeService(finalRequest);
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
    public java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(MarkAsArchivedRequest request) {

        return markAsArchivedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(final MarkAsArchivedRequest request,
            final com.amazonaws.handlers.AsyncHandler<MarkAsArchivedRequest, MarkAsArchivedResult> asyncHandler) {
        final MarkAsArchivedRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MarkAsArchivedResult>() {
            @Override
            public MarkAsArchivedResult call() throws Exception {
                MarkAsArchivedResult result = null;

                try {
                    result = executeMarkAsArchived(finalRequest);
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
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest request) {

        return retryDataReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(final RetryDataReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetryDataReplicationRequest, RetryDataReplicationResult> asyncHandler) {
        final RetryDataReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetryDataReplicationResult>() {
            @Override
            public RetryDataReplicationResult call() throws Exception {
                RetryDataReplicationResult result = null;

                try {
                    result = executeRetryDataReplication(finalRequest);
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
    public java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(StartCutoverRequest request) {

        return startCutoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(final StartCutoverRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCutoverRequest, StartCutoverResult> asyncHandler) {
        final StartCutoverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCutoverResult>() {
            @Override
            public StartCutoverResult call() throws Exception {
                StartCutoverResult result = null;

                try {
                    result = executeStartCutover(finalRequest);
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
    public java.util.concurrent.Future<StartTestResult> startTestAsync(StartTestRequest request) {

        return startTestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTestResult> startTestAsync(final StartTestRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTestRequest, StartTestResult> asyncHandler) {
        final StartTestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTestResult>() {
            @Override
            public StartTestResult call() throws Exception {
                StartTestResult result = null;

                try {
                    result = executeStartTest(finalRequest);
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
    public java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(TerminateTargetInstancesRequest request) {

        return terminateTargetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(final TerminateTargetInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateTargetInstancesRequest, TerminateTargetInstancesResult> asyncHandler) {
        final TerminateTargetInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateTargetInstancesResult>() {
            @Override
            public TerminateTargetInstancesResult call() throws Exception {
                TerminateTargetInstancesResult result = null;

                try {
                    result = executeTerminateTargetInstances(finalRequest);
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
    public java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(UpdateLaunchConfigurationRequest request) {

        return updateLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(final UpdateLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationRequest, UpdateLaunchConfigurationResult> asyncHandler) {
        final UpdateLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLaunchConfigurationResult>() {
            @Override
            public UpdateLaunchConfigurationResult call() throws Exception {
                UpdateLaunchConfigurationResult result = null;

                try {
                    result = executeUpdateLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(UpdateReplicationConfigurationRequest request) {

        return updateReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(
            final UpdateReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationRequest, UpdateReplicationConfigurationResult> asyncHandler) {
        final UpdateReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationConfigurationResult>() {
            @Override
            public UpdateReplicationConfigurationResult call() throws Exception {
                UpdateReplicationConfigurationResult result = null;

                try {
                    result = executeUpdateReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest request) {

        return updateReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            final UpdateReplicationConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationTemplateRequest, UpdateReplicationConfigurationTemplateResult> asyncHandler) {
        final UpdateReplicationConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationConfigurationTemplateResult>() {
            @Override
            public UpdateReplicationConfigurationTemplateResult call() throws Exception {
                UpdateReplicationConfigurationTemplateResult result = null;

                try {
                    result = executeUpdateReplicationConfigurationTemplate(finalRequest);
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
