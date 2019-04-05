/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhub;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhub.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Migration Hub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The AWS Migration Hub API methods help to obtain server and application migration status and integrate your
 * resource-specific migration tool by providing a programmatic interface to Migration Hub.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubAsyncClient extends AWSMigrationHubClient implements AWSMigrationHubAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMigrationHubAsyncClientBuilder asyncBuilder() {
        return AWSMigrationHubAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Migration Hub using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<AssociateCreatedArtifactResult> associateCreatedArtifactAsync(AssociateCreatedArtifactRequest request) {

        return associateCreatedArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateCreatedArtifactResult> associateCreatedArtifactAsync(final AssociateCreatedArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateCreatedArtifactRequest, AssociateCreatedArtifactResult> asyncHandler) {
        final AssociateCreatedArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateCreatedArtifactResult>() {
            @Override
            public AssociateCreatedArtifactResult call() throws Exception {
                AssociateCreatedArtifactResult result = null;

                try {
                    result = executeAssociateCreatedArtifact(finalRequest);
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
    public java.util.concurrent.Future<AssociateDiscoveredResourceResult> associateDiscoveredResourceAsync(AssociateDiscoveredResourceRequest request) {

        return associateDiscoveredResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDiscoveredResourceResult> associateDiscoveredResourceAsync(final AssociateDiscoveredResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDiscoveredResourceRequest, AssociateDiscoveredResourceResult> asyncHandler) {
        final AssociateDiscoveredResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDiscoveredResourceResult>() {
            @Override
            public AssociateDiscoveredResourceResult call() throws Exception {
                AssociateDiscoveredResourceResult result = null;

                try {
                    result = executeAssociateDiscoveredResource(finalRequest);
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
    public java.util.concurrent.Future<CreateProgressUpdateStreamResult> createProgressUpdateStreamAsync(CreateProgressUpdateStreamRequest request) {

        return createProgressUpdateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProgressUpdateStreamResult> createProgressUpdateStreamAsync(final CreateProgressUpdateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProgressUpdateStreamRequest, CreateProgressUpdateStreamResult> asyncHandler) {
        final CreateProgressUpdateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProgressUpdateStreamResult>() {
            @Override
            public CreateProgressUpdateStreamResult call() throws Exception {
                CreateProgressUpdateStreamResult result = null;

                try {
                    result = executeCreateProgressUpdateStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteProgressUpdateStreamResult> deleteProgressUpdateStreamAsync(DeleteProgressUpdateStreamRequest request) {

        return deleteProgressUpdateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProgressUpdateStreamResult> deleteProgressUpdateStreamAsync(final DeleteProgressUpdateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProgressUpdateStreamRequest, DeleteProgressUpdateStreamResult> asyncHandler) {
        final DeleteProgressUpdateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProgressUpdateStreamResult>() {
            @Override
            public DeleteProgressUpdateStreamResult call() throws Exception {
                DeleteProgressUpdateStreamResult result = null;

                try {
                    result = executeDeleteProgressUpdateStream(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationStateResult> describeApplicationStateAsync(DescribeApplicationStateRequest request) {

        return describeApplicationStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationStateResult> describeApplicationStateAsync(final DescribeApplicationStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationStateRequest, DescribeApplicationStateResult> asyncHandler) {
        final DescribeApplicationStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationStateResult>() {
            @Override
            public DescribeApplicationStateResult call() throws Exception {
                DescribeApplicationStateResult result = null;

                try {
                    result = executeDescribeApplicationState(finalRequest);
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
    public java.util.concurrent.Future<DescribeMigrationTaskResult> describeMigrationTaskAsync(DescribeMigrationTaskRequest request) {

        return describeMigrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMigrationTaskResult> describeMigrationTaskAsync(final DescribeMigrationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMigrationTaskRequest, DescribeMigrationTaskResult> asyncHandler) {
        final DescribeMigrationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMigrationTaskResult>() {
            @Override
            public DescribeMigrationTaskResult call() throws Exception {
                DescribeMigrationTaskResult result = null;

                try {
                    result = executeDescribeMigrationTask(finalRequest);
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
    public java.util.concurrent.Future<DisassociateCreatedArtifactResult> disassociateCreatedArtifactAsync(DisassociateCreatedArtifactRequest request) {

        return disassociateCreatedArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateCreatedArtifactResult> disassociateCreatedArtifactAsync(final DisassociateCreatedArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateCreatedArtifactRequest, DisassociateCreatedArtifactResult> asyncHandler) {
        final DisassociateCreatedArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateCreatedArtifactResult>() {
            @Override
            public DisassociateCreatedArtifactResult call() throws Exception {
                DisassociateCreatedArtifactResult result = null;

                try {
                    result = executeDisassociateCreatedArtifact(finalRequest);
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
    public java.util.concurrent.Future<DisassociateDiscoveredResourceResult> disassociateDiscoveredResourceAsync(DisassociateDiscoveredResourceRequest request) {

        return disassociateDiscoveredResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDiscoveredResourceResult> disassociateDiscoveredResourceAsync(
            final DisassociateDiscoveredResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDiscoveredResourceRequest, DisassociateDiscoveredResourceResult> asyncHandler) {
        final DisassociateDiscoveredResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDiscoveredResourceResult>() {
            @Override
            public DisassociateDiscoveredResourceResult call() throws Exception {
                DisassociateDiscoveredResourceResult result = null;

                try {
                    result = executeDisassociateDiscoveredResource(finalRequest);
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
    public java.util.concurrent.Future<ImportMigrationTaskResult> importMigrationTaskAsync(ImportMigrationTaskRequest request) {

        return importMigrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportMigrationTaskResult> importMigrationTaskAsync(final ImportMigrationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportMigrationTaskRequest, ImportMigrationTaskResult> asyncHandler) {
        final ImportMigrationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportMigrationTaskResult>() {
            @Override
            public ImportMigrationTaskResult call() throws Exception {
                ImportMigrationTaskResult result = null;

                try {
                    result = executeImportMigrationTask(finalRequest);
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
    public java.util.concurrent.Future<ListCreatedArtifactsResult> listCreatedArtifactsAsync(ListCreatedArtifactsRequest request) {

        return listCreatedArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCreatedArtifactsResult> listCreatedArtifactsAsync(final ListCreatedArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCreatedArtifactsRequest, ListCreatedArtifactsResult> asyncHandler) {
        final ListCreatedArtifactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCreatedArtifactsResult>() {
            @Override
            public ListCreatedArtifactsResult call() throws Exception {
                ListCreatedArtifactsResult result = null;

                try {
                    result = executeListCreatedArtifacts(finalRequest);
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
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(final ListDiscoveredResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {
        final ListDiscoveredResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDiscoveredResourcesResult>() {
            @Override
            public ListDiscoveredResourcesResult call() throws Exception {
                ListDiscoveredResourcesResult result = null;

                try {
                    result = executeListDiscoveredResources(finalRequest);
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
    public java.util.concurrent.Future<ListMigrationTasksResult> listMigrationTasksAsync(ListMigrationTasksRequest request) {

        return listMigrationTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMigrationTasksResult> listMigrationTasksAsync(final ListMigrationTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMigrationTasksRequest, ListMigrationTasksResult> asyncHandler) {
        final ListMigrationTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMigrationTasksResult>() {
            @Override
            public ListMigrationTasksResult call() throws Exception {
                ListMigrationTasksResult result = null;

                try {
                    result = executeListMigrationTasks(finalRequest);
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
    public java.util.concurrent.Future<ListProgressUpdateStreamsResult> listProgressUpdateStreamsAsync(ListProgressUpdateStreamsRequest request) {

        return listProgressUpdateStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProgressUpdateStreamsResult> listProgressUpdateStreamsAsync(final ListProgressUpdateStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProgressUpdateStreamsRequest, ListProgressUpdateStreamsResult> asyncHandler) {
        final ListProgressUpdateStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProgressUpdateStreamsResult>() {
            @Override
            public ListProgressUpdateStreamsResult call() throws Exception {
                ListProgressUpdateStreamsResult result = null;

                try {
                    result = executeListProgressUpdateStreams(finalRequest);
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
    public java.util.concurrent.Future<NotifyApplicationStateResult> notifyApplicationStateAsync(NotifyApplicationStateRequest request) {

        return notifyApplicationStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyApplicationStateResult> notifyApplicationStateAsync(final NotifyApplicationStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyApplicationStateRequest, NotifyApplicationStateResult> asyncHandler) {
        final NotifyApplicationStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<NotifyApplicationStateResult>() {
            @Override
            public NotifyApplicationStateResult call() throws Exception {
                NotifyApplicationStateResult result = null;

                try {
                    result = executeNotifyApplicationState(finalRequest);
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
    public java.util.concurrent.Future<NotifyMigrationTaskStateResult> notifyMigrationTaskStateAsync(NotifyMigrationTaskStateRequest request) {

        return notifyMigrationTaskStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyMigrationTaskStateResult> notifyMigrationTaskStateAsync(final NotifyMigrationTaskStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyMigrationTaskStateRequest, NotifyMigrationTaskStateResult> asyncHandler) {
        final NotifyMigrationTaskStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<NotifyMigrationTaskStateResult>() {
            @Override
            public NotifyMigrationTaskStateResult call() throws Exception {
                NotifyMigrationTaskStateResult result = null;

                try {
                    result = executeNotifyMigrationTaskState(finalRequest);
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
    public java.util.concurrent.Future<PutResourceAttributesResult> putResourceAttributesAsync(PutResourceAttributesRequest request) {

        return putResourceAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourceAttributesResult> putResourceAttributesAsync(final PutResourceAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourceAttributesRequest, PutResourceAttributesResult> asyncHandler) {
        final PutResourceAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourceAttributesResult>() {
            @Override
            public PutResourceAttributesResult call() throws Exception {
                PutResourceAttributesResult result = null;

                try {
                    result = executePutResourceAttributes(finalRequest);
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
