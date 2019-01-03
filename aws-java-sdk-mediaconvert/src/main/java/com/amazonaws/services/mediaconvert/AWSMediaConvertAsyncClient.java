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
package com.amazonaws.services.mediaconvert;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaConvert asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * AWS Elemental MediaConvert
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaConvertAsyncClient extends AWSMediaConvertClient implements AWSMediaConvertAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaConvertAsyncClientBuilder asyncBuilder() {
        return AWSMediaConvertAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaConvert using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaConvertAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateCertificateResult> associateCertificateAsync(AssociateCertificateRequest request) {

        return associateCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateCertificateResult> associateCertificateAsync(final AssociateCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateCertificateRequest, AssociateCertificateResult> asyncHandler) {
        final AssociateCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateCertificateResult>() {
            @Override
            public AssociateCertificateResult call() throws Exception {
                AssociateCertificateResult result = null;

                try {
                    result = executeAssociateCertificate(finalRequest);
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
    public java.util.concurrent.Future<CreateJobTemplateResult> createJobTemplateAsync(CreateJobTemplateRequest request) {

        return createJobTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobTemplateResult> createJobTemplateAsync(final CreateJobTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobTemplateRequest, CreateJobTemplateResult> asyncHandler) {
        final CreateJobTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobTemplateResult>() {
            @Override
            public CreateJobTemplateResult call() throws Exception {
                CreateJobTemplateResult result = null;

                try {
                    result = executeCreateJobTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest request) {

        return createPresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresetResult> createPresetAsync(final CreatePresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler) {
        final CreatePresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresetResult>() {
            @Override
            public CreatePresetResult call() throws Exception {
                CreatePresetResult result = null;

                try {
                    result = executeCreatePreset(finalRequest);
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
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request) {

        return createQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {
        final CreateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueResult>() {
            @Override
            public CreateQueueResult call() throws Exception {
                CreateQueueResult result = null;

                try {
                    result = executeCreateQueue(finalRequest);
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
    public java.util.concurrent.Future<DeleteJobTemplateResult> deleteJobTemplateAsync(DeleteJobTemplateRequest request) {

        return deleteJobTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobTemplateResult> deleteJobTemplateAsync(final DeleteJobTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobTemplateRequest, DeleteJobTemplateResult> asyncHandler) {
        final DeleteJobTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobTemplateResult>() {
            @Override
            public DeleteJobTemplateResult call() throws Exception {
                DeleteJobTemplateResult result = null;

                try {
                    result = executeDeleteJobTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest request) {

        return deletePresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(final DeletePresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler) {
        final DeletePresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePresetResult>() {
            @Override
            public DeletePresetResult call() throws Exception {
                DeletePresetResult result = null;

                try {
                    result = executeDeletePreset(finalRequest);
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
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest request) {

        return deleteQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(final DeleteQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {
        final DeleteQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueueResult>() {
            @Override
            public DeleteQueueResult call() throws Exception {
                DeleteQueueResult result = null;

                try {
                    result = executeDeleteQueue(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(final DescribeEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {
        final DescribeEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointsResult>() {
            @Override
            public DescribeEndpointsResult call() throws Exception {
                DescribeEndpointsResult result = null;

                try {
                    result = executeDescribeEndpoints(finalRequest);
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
    public java.util.concurrent.Future<DisassociateCertificateResult> disassociateCertificateAsync(DisassociateCertificateRequest request) {

        return disassociateCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateCertificateResult> disassociateCertificateAsync(final DisassociateCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateCertificateRequest, DisassociateCertificateResult> asyncHandler) {
        final DisassociateCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateCertificateResult>() {
            @Override
            public DisassociateCertificateResult call() throws Exception {
                DisassociateCertificateResult result = null;

                try {
                    result = executeDisassociateCertificate(finalRequest);
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
    public java.util.concurrent.Future<GetJobTemplateResult> getJobTemplateAsync(GetJobTemplateRequest request) {

        return getJobTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobTemplateResult> getJobTemplateAsync(final GetJobTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobTemplateRequest, GetJobTemplateResult> asyncHandler) {
        final GetJobTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobTemplateResult>() {
            @Override
            public GetJobTemplateResult call() throws Exception {
                GetJobTemplateResult result = null;

                try {
                    result = executeGetJobTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetPresetResult> getPresetAsync(GetPresetRequest request) {

        return getPresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPresetResult> getPresetAsync(final GetPresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPresetRequest, GetPresetResult> asyncHandler) {
        final GetPresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPresetResult>() {
            @Override
            public GetPresetResult call() throws Exception {
                GetPresetResult result = null;

                try {
                    result = executeGetPreset(finalRequest);
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
    public java.util.concurrent.Future<GetQueueResult> getQueueAsync(GetQueueRequest request) {

        return getQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueResult> getQueueAsync(final GetQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueueRequest, GetQueueResult> asyncHandler) {
        final GetQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueueResult>() {
            @Override
            public GetQueueResult call() throws Exception {
                GetQueueResult result = null;

                try {
                    result = executeGetQueue(finalRequest);
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
    public java.util.concurrent.Future<ListJobTemplatesResult> listJobTemplatesAsync(ListJobTemplatesRequest request) {

        return listJobTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobTemplatesResult> listJobTemplatesAsync(final ListJobTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobTemplatesRequest, ListJobTemplatesResult> asyncHandler) {
        final ListJobTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobTemplatesResult>() {
            @Override
            public ListJobTemplatesResult call() throws Exception {
                ListJobTemplatesResult result = null;

                try {
                    result = executeListJobTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest request) {

        return listPresetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(final ListPresetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler) {
        final ListPresetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPresetsResult>() {
            @Override
            public ListPresetsResult call() throws Exception {
                ListPresetsResult result = null;

                try {
                    result = executeListPresets(finalRequest);
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
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {
        final ListQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueuesResult>() {
            @Override
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;

                try {
                    result = executeListQueues(finalRequest);
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
    public java.util.concurrent.Future<UpdateJobTemplateResult> updateJobTemplateAsync(UpdateJobTemplateRequest request) {

        return updateJobTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobTemplateResult> updateJobTemplateAsync(final UpdateJobTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobTemplateRequest, UpdateJobTemplateResult> asyncHandler) {
        final UpdateJobTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobTemplateResult>() {
            @Override
            public UpdateJobTemplateResult call() throws Exception {
                UpdateJobTemplateResult result = null;

                try {
                    result = executeUpdateJobTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdatePresetResult> updatePresetAsync(UpdatePresetRequest request) {

        return updatePresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePresetResult> updatePresetAsync(final UpdatePresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePresetRequest, UpdatePresetResult> asyncHandler) {
        final UpdatePresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePresetResult>() {
            @Override
            public UpdatePresetResult call() throws Exception {
                UpdatePresetResult result = null;

                try {
                    result = executeUpdatePreset(finalRequest);
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
    public java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(UpdateQueueRequest request) {

        return updateQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(final UpdateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueRequest, UpdateQueueResult> asyncHandler) {
        final UpdateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueResult>() {
            @Override
            public UpdateQueueResult call() throws Exception {
                UpdateQueueResult result = null;

                try {
                    result = executeUpdateQueue(finalRequest);
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
