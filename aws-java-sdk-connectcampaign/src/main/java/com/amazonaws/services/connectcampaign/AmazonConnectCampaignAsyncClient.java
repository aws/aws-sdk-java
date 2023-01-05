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
package com.amazonaws.services.connectcampaign;

import javax.annotation.Generated;

import com.amazonaws.services.connectcampaign.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AmazonConnectCampaignService asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Provide APIs to create and manage Amazon Connect Campaigns.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectCampaignAsyncClient extends AmazonConnectCampaignClient implements AmazonConnectCampaignAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectCampaignAsyncClientBuilder asyncBuilder() {
        return AmazonConnectCampaignAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmazonConnectCampaignService using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectCampaignAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmazonConnectCampaignService using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectCampaignAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(final CreateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {
        final CreateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCampaignResult>() {
            @Override
            public CreateCampaignResult call() throws Exception {
                CreateCampaignResult result = null;

                try {
                    result = executeCreateCampaign(finalRequest);
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
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(final DeleteCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {
        final DeleteCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCampaignResult>() {
            @Override
            public DeleteCampaignResult call() throws Exception {
                DeleteCampaignResult result = null;

                try {
                    result = executeDeleteCampaign(finalRequest);
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
    public java.util.concurrent.Future<DeleteConnectInstanceConfigResult> deleteConnectInstanceConfigAsync(DeleteConnectInstanceConfigRequest request) {

        return deleteConnectInstanceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectInstanceConfigResult> deleteConnectInstanceConfigAsync(final DeleteConnectInstanceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectInstanceConfigRequest, DeleteConnectInstanceConfigResult> asyncHandler) {
        final DeleteConnectInstanceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectInstanceConfigResult>() {
            @Override
            public DeleteConnectInstanceConfigResult call() throws Exception {
                DeleteConnectInstanceConfigResult result = null;

                try {
                    result = executeDeleteConnectInstanceConfig(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceOnboardingJobResult> deleteInstanceOnboardingJobAsync(DeleteInstanceOnboardingJobRequest request) {

        return deleteInstanceOnboardingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceOnboardingJobResult> deleteInstanceOnboardingJobAsync(final DeleteInstanceOnboardingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceOnboardingJobRequest, DeleteInstanceOnboardingJobResult> asyncHandler) {
        final DeleteInstanceOnboardingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceOnboardingJobResult>() {
            @Override
            public DeleteInstanceOnboardingJobResult call() throws Exception {
                DeleteInstanceOnboardingJobResult result = null;

                try {
                    result = executeDeleteInstanceOnboardingJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest request) {

        return describeCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(final DescribeCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCampaignRequest, DescribeCampaignResult> asyncHandler) {
        final DescribeCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCampaignResult>() {
            @Override
            public DescribeCampaignResult call() throws Exception {
                DescribeCampaignResult result = null;

                try {
                    result = executeDescribeCampaign(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignStateResult> getCampaignStateAsync(GetCampaignStateRequest request) {

        return getCampaignStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignStateResult> getCampaignStateAsync(final GetCampaignStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignStateRequest, GetCampaignStateResult> asyncHandler) {
        final GetCampaignStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignStateResult>() {
            @Override
            public GetCampaignStateResult call() throws Exception {
                GetCampaignStateResult result = null;

                try {
                    result = executeGetCampaignState(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignStateBatchResult> getCampaignStateBatchAsync(GetCampaignStateBatchRequest request) {

        return getCampaignStateBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignStateBatchResult> getCampaignStateBatchAsync(final GetCampaignStateBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignStateBatchRequest, GetCampaignStateBatchResult> asyncHandler) {
        final GetCampaignStateBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignStateBatchResult>() {
            @Override
            public GetCampaignStateBatchResult call() throws Exception {
                GetCampaignStateBatchResult result = null;

                try {
                    result = executeGetCampaignStateBatch(finalRequest);
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
    public java.util.concurrent.Future<GetConnectInstanceConfigResult> getConnectInstanceConfigAsync(GetConnectInstanceConfigRequest request) {

        return getConnectInstanceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectInstanceConfigResult> getConnectInstanceConfigAsync(final GetConnectInstanceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectInstanceConfigRequest, GetConnectInstanceConfigResult> asyncHandler) {
        final GetConnectInstanceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectInstanceConfigResult>() {
            @Override
            public GetConnectInstanceConfigResult call() throws Exception {
                GetConnectInstanceConfigResult result = null;

                try {
                    result = executeGetConnectInstanceConfig(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceOnboardingJobStatusResult> getInstanceOnboardingJobStatusAsync(GetInstanceOnboardingJobStatusRequest request) {

        return getInstanceOnboardingJobStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceOnboardingJobStatusResult> getInstanceOnboardingJobStatusAsync(
            final GetInstanceOnboardingJobStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceOnboardingJobStatusRequest, GetInstanceOnboardingJobStatusResult> asyncHandler) {
        final GetInstanceOnboardingJobStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceOnboardingJobStatusResult>() {
            @Override
            public GetInstanceOnboardingJobStatusResult call() throws Exception {
                GetInstanceOnboardingJobStatusResult result = null;

                try {
                    result = executeGetInstanceOnboardingJobStatus(finalRequest);
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
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request) {

        return listCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(final ListCampaignsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler) {
        final ListCampaignsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCampaignsResult>() {
            @Override
            public ListCampaignsResult call() throws Exception {
                ListCampaignsResult result = null;

                try {
                    result = executeListCampaigns(finalRequest);
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
    public java.util.concurrent.Future<PauseCampaignResult> pauseCampaignAsync(PauseCampaignRequest request) {

        return pauseCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PauseCampaignResult> pauseCampaignAsync(final PauseCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<PauseCampaignRequest, PauseCampaignResult> asyncHandler) {
        final PauseCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PauseCampaignResult>() {
            @Override
            public PauseCampaignResult call() throws Exception {
                PauseCampaignResult result = null;

                try {
                    result = executePauseCampaign(finalRequest);
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
    public java.util.concurrent.Future<PutDialRequestBatchResult> putDialRequestBatchAsync(PutDialRequestBatchRequest request) {

        return putDialRequestBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDialRequestBatchResult> putDialRequestBatchAsync(final PutDialRequestBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDialRequestBatchRequest, PutDialRequestBatchResult> asyncHandler) {
        final PutDialRequestBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDialRequestBatchResult>() {
            @Override
            public PutDialRequestBatchResult call() throws Exception {
                PutDialRequestBatchResult result = null;

                try {
                    result = executePutDialRequestBatch(finalRequest);
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
    public java.util.concurrent.Future<ResumeCampaignResult> resumeCampaignAsync(ResumeCampaignRequest request) {

        return resumeCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeCampaignResult> resumeCampaignAsync(final ResumeCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeCampaignRequest, ResumeCampaignResult> asyncHandler) {
        final ResumeCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeCampaignResult>() {
            @Override
            public ResumeCampaignResult call() throws Exception {
                ResumeCampaignResult result = null;

                try {
                    result = executeResumeCampaign(finalRequest);
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
    public java.util.concurrent.Future<StartCampaignResult> startCampaignAsync(StartCampaignRequest request) {

        return startCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCampaignResult> startCampaignAsync(final StartCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCampaignRequest, StartCampaignResult> asyncHandler) {
        final StartCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCampaignResult>() {
            @Override
            public StartCampaignResult call() throws Exception {
                StartCampaignResult result = null;

                try {
                    result = executeStartCampaign(finalRequest);
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
    public java.util.concurrent.Future<StartInstanceOnboardingJobResult> startInstanceOnboardingJobAsync(StartInstanceOnboardingJobRequest request) {

        return startInstanceOnboardingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstanceOnboardingJobResult> startInstanceOnboardingJobAsync(final StartInstanceOnboardingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstanceOnboardingJobRequest, StartInstanceOnboardingJobResult> asyncHandler) {
        final StartInstanceOnboardingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInstanceOnboardingJobResult>() {
            @Override
            public StartInstanceOnboardingJobResult call() throws Exception {
                StartInstanceOnboardingJobResult result = null;

                try {
                    result = executeStartInstanceOnboardingJob(finalRequest);
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
    public java.util.concurrent.Future<StopCampaignResult> stopCampaignAsync(StopCampaignRequest request) {

        return stopCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCampaignResult> stopCampaignAsync(final StopCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCampaignRequest, StopCampaignResult> asyncHandler) {
        final StopCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCampaignResult>() {
            @Override
            public StopCampaignResult call() throws Exception {
                StopCampaignResult result = null;

                try {
                    result = executeStopCampaign(finalRequest);
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
    public java.util.concurrent.Future<UpdateCampaignDialerConfigResult> updateCampaignDialerConfigAsync(UpdateCampaignDialerConfigRequest request) {

        return updateCampaignDialerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignDialerConfigResult> updateCampaignDialerConfigAsync(final UpdateCampaignDialerConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignDialerConfigRequest, UpdateCampaignDialerConfigResult> asyncHandler) {
        final UpdateCampaignDialerConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignDialerConfigResult>() {
            @Override
            public UpdateCampaignDialerConfigResult call() throws Exception {
                UpdateCampaignDialerConfigResult result = null;

                try {
                    result = executeUpdateCampaignDialerConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateCampaignNameResult> updateCampaignNameAsync(UpdateCampaignNameRequest request) {

        return updateCampaignNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignNameResult> updateCampaignNameAsync(final UpdateCampaignNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignNameRequest, UpdateCampaignNameResult> asyncHandler) {
        final UpdateCampaignNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignNameResult>() {
            @Override
            public UpdateCampaignNameResult call() throws Exception {
                UpdateCampaignNameResult result = null;

                try {
                    result = executeUpdateCampaignName(finalRequest);
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
    public java.util.concurrent.Future<UpdateCampaignOutboundCallConfigResult> updateCampaignOutboundCallConfigAsync(
            UpdateCampaignOutboundCallConfigRequest request) {

        return updateCampaignOutboundCallConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignOutboundCallConfigResult> updateCampaignOutboundCallConfigAsync(
            final UpdateCampaignOutboundCallConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignOutboundCallConfigRequest, UpdateCampaignOutboundCallConfigResult> asyncHandler) {
        final UpdateCampaignOutboundCallConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignOutboundCallConfigResult>() {
            @Override
            public UpdateCampaignOutboundCallConfigResult call() throws Exception {
                UpdateCampaignOutboundCallConfigResult result = null;

                try {
                    result = executeUpdateCampaignOutboundCallConfig(finalRequest);
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
