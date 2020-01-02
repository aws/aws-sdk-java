/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Data Exchange asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Data Exchange is a service that makes it easy for AWS customers to exchange data in the cloud. You can use the
 * AWS Data Exchange APIs to create, update, manage, and access file-based data set in the AWS Cloud.
 * </p>
 * <p>
 * As a subscriber, you can view and access the data sets that you have an entitlement to through a subscription. You
 * can use the APIS to download or copy your entitled data sets to Amazon S3 for use across a variety of AWS analytics
 * and machine learning services.
 * </p>
 * <p>
 * As a provider, you can create and manage your data sets that you would like to publish to a product. Being able to
 * package and provide your data sets into products requires a few steps to determine eligibility. For more information,
 * visit the AWS Data Exchange User Guide.
 * </p>
 * <p>
 * A data set is a collection of data that can be changed or updated over time. Data sets can be updated using
 * revisions, which represent a new version or incremental change to a data set. A revision contains one or more assets.
 * An asset in AWS Data Exchange is a piece of data that can be stored as an Amazon S3 object. The asset can be a
 * structured data file, an image file, or some other data file. Jobs are asynchronous import or export operations used
 * to create or copy assets.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDataExchangeAsyncClient extends AWSDataExchangeClient implements AWSDataExchangeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSDataExchangeAsyncClientBuilder asyncBuilder() {
        return AWSDataExchangeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Exchange using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDataExchangeAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(final CancelJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {
        final CancelJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelJobResult>() {
            @Override
            public CancelJobResult call() throws Exception {
                CancelJobResult result = null;

                try {
                    result = executeCancelJob(finalRequest);
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
    public java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest request) {

        return createDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(final CreateDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSetRequest, CreateDataSetResult> asyncHandler) {
        final CreateDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSetResult>() {
            @Override
            public CreateDataSetResult call() throws Exception {
                CreateDataSetResult result = null;

                try {
                    result = executeCreateDataSet(finalRequest);
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
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(final CreateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {
        final CreateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobResult>() {
            @Override
            public CreateJobResult call() throws Exception {
                CreateJobResult result = null;

                try {
                    result = executeCreateJob(finalRequest);
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
    public java.util.concurrent.Future<CreateRevisionResult> createRevisionAsync(CreateRevisionRequest request) {

        return createRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRevisionResult> createRevisionAsync(final CreateRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRevisionRequest, CreateRevisionResult> asyncHandler) {
        final CreateRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRevisionResult>() {
            @Override
            public CreateRevisionResult call() throws Exception {
                CreateRevisionResult result = null;

                try {
                    result = executeCreateRevision(finalRequest);
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
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest request) {

        return deleteAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(final DeleteAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler) {
        final DeleteAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssetResult>() {
            @Override
            public DeleteAssetResult call() throws Exception {
                DeleteAssetResult result = null;

                try {
                    result = executeDeleteAsset(finalRequest);
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
    public java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest request) {

        return deleteDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(final DeleteDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSetRequest, DeleteDataSetResult> asyncHandler) {
        final DeleteDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSetResult>() {
            @Override
            public DeleteDataSetResult call() throws Exception {
                DeleteDataSetResult result = null;

                try {
                    result = executeDeleteDataSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteRevisionResult> deleteRevisionAsync(DeleteRevisionRequest request) {

        return deleteRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRevisionResult> deleteRevisionAsync(final DeleteRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRevisionRequest, DeleteRevisionResult> asyncHandler) {
        final DeleteRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRevisionResult>() {
            @Override
            public DeleteRevisionResult call() throws Exception {
                DeleteRevisionResult result = null;

                try {
                    result = executeDeleteRevision(finalRequest);
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
    public java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest request) {

        return getAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetResult> getAssetAsync(final GetAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetRequest, GetAssetResult> asyncHandler) {
        final GetAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetResult>() {
            @Override
            public GetAssetResult call() throws Exception {
                GetAssetResult result = null;

                try {
                    result = executeGetAsset(finalRequest);
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
    public java.util.concurrent.Future<GetDataSetResult> getDataSetAsync(GetDataSetRequest request) {

        return getDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSetResult> getDataSetAsync(final GetDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSetRequest, GetDataSetResult> asyncHandler) {
        final GetDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSetResult>() {
            @Override
            public GetDataSetResult call() throws Exception {
                GetDataSetResult result = null;

                try {
                    result = executeGetDataSet(finalRequest);
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
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(final GetJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {
        final GetJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobResult>() {
            @Override
            public GetJobResult call() throws Exception {
                GetJobResult result = null;

                try {
                    result = executeGetJob(finalRequest);
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
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest request) {

        return getRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(final GetRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRevisionRequest, GetRevisionResult> asyncHandler) {
        final GetRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRevisionResult>() {
            @Override
            public GetRevisionResult call() throws Exception {
                GetRevisionResult result = null;

                try {
                    result = executeGetRevision(finalRequest);
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
    public java.util.concurrent.Future<ListDataSetRevisionsResult> listDataSetRevisionsAsync(ListDataSetRevisionsRequest request) {

        return listDataSetRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetRevisionsResult> listDataSetRevisionsAsync(final ListDataSetRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSetRevisionsRequest, ListDataSetRevisionsResult> asyncHandler) {
        final ListDataSetRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSetRevisionsResult>() {
            @Override
            public ListDataSetRevisionsResult call() throws Exception {
                ListDataSetRevisionsResult result = null;

                try {
                    result = executeListDataSetRevisions(finalRequest);
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
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest request) {

        return listDataSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(final ListDataSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler) {
        final ListDataSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSetsResult>() {
            @Override
            public ListDataSetsResult call() throws Exception {
                ListDataSetsResult result = null;

                try {
                    result = executeListDataSets(finalRequest);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {
        final ListJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result = null;

                try {
                    result = executeListJobs(finalRequest);
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
    public java.util.concurrent.Future<ListRevisionAssetsResult> listRevisionAssetsAsync(ListRevisionAssetsRequest request) {

        return listRevisionAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRevisionAssetsResult> listRevisionAssetsAsync(final ListRevisionAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRevisionAssetsRequest, ListRevisionAssetsResult> asyncHandler) {
        final ListRevisionAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRevisionAssetsResult>() {
            @Override
            public ListRevisionAssetsResult call() throws Exception {
                ListRevisionAssetsResult result = null;

                try {
                    result = executeListRevisionAssets(finalRequest);
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
    public java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest request) {

        return startJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobResult> startJobAsync(final StartJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartJobRequest, StartJobResult> asyncHandler) {
        final StartJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartJobResult>() {
            @Override
            public StartJobResult call() throws Exception {
                StartJobResult result = null;

                try {
                    result = executeStartJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest request) {

        return updateAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(final UpdateAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssetRequest, UpdateAssetResult> asyncHandler) {
        final UpdateAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssetResult>() {
            @Override
            public UpdateAssetResult call() throws Exception {
                UpdateAssetResult result = null;

                try {
                    result = executeUpdateAsset(finalRequest);
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
    public java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest request) {

        return updateDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(final UpdateDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSetRequest, UpdateDataSetResult> asyncHandler) {
        final UpdateDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSetResult>() {
            @Override
            public UpdateDataSetResult call() throws Exception {
                UpdateDataSetResult result = null;

                try {
                    result = executeUpdateDataSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateRevisionResult> updateRevisionAsync(UpdateRevisionRequest request) {

        return updateRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRevisionResult> updateRevisionAsync(final UpdateRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRevisionRequest, UpdateRevisionResult> asyncHandler) {
        final UpdateRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRevisionResult>() {
            @Override
            public UpdateRevisionResult call() throws Exception {
                UpdateRevisionResult result = null;

                try {
                    result = executeUpdateRevision(finalRequest);
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
