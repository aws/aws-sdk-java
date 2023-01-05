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
package com.amazonaws.services.voiceid;

import javax.annotation.Generated;

import com.amazonaws.services.voiceid.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Voice ID asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Connect Voice ID provides real-time caller authentication and fraud screening. This guide describes the APIs
 * used for this service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonVoiceIDAsyncClient extends AmazonVoiceIDClient implements AmazonVoiceIDAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonVoiceIDAsyncClientBuilder asyncBuilder() {
        return AmazonVoiceIDAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Voice ID using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonVoiceIDAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Voice ID using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonVoiceIDAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteFraudsterResult> deleteFraudsterAsync(DeleteFraudsterRequest request) {

        return deleteFraudsterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFraudsterResult> deleteFraudsterAsync(final DeleteFraudsterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFraudsterRequest, DeleteFraudsterResult> asyncHandler) {
        final DeleteFraudsterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFraudsterResult>() {
            @Override
            public DeleteFraudsterResult call() throws Exception {
                DeleteFraudsterResult result = null;

                try {
                    result = executeDeleteFraudster(finalRequest);
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
    public java.util.concurrent.Future<DeleteSpeakerResult> deleteSpeakerAsync(DeleteSpeakerRequest request) {

        return deleteSpeakerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpeakerResult> deleteSpeakerAsync(final DeleteSpeakerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSpeakerRequest, DeleteSpeakerResult> asyncHandler) {
        final DeleteSpeakerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSpeakerResult>() {
            @Override
            public DeleteSpeakerResult call() throws Exception {
                DeleteSpeakerResult result = null;

                try {
                    result = executeDeleteSpeaker(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {
        final DescribeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainResult>() {
            @Override
            public DescribeDomainResult call() throws Exception {
                DescribeDomainResult result = null;

                try {
                    result = executeDescribeDomain(finalRequest);
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
    public java.util.concurrent.Future<DescribeFraudsterResult> describeFraudsterAsync(DescribeFraudsterRequest request) {

        return describeFraudsterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFraudsterResult> describeFraudsterAsync(final DescribeFraudsterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFraudsterRequest, DescribeFraudsterResult> asyncHandler) {
        final DescribeFraudsterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFraudsterResult>() {
            @Override
            public DescribeFraudsterResult call() throws Exception {
                DescribeFraudsterResult result = null;

                try {
                    result = executeDescribeFraudster(finalRequest);
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
    public java.util.concurrent.Future<DescribeFraudsterRegistrationJobResult> describeFraudsterRegistrationJobAsync(
            DescribeFraudsterRegistrationJobRequest request) {

        return describeFraudsterRegistrationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFraudsterRegistrationJobResult> describeFraudsterRegistrationJobAsync(
            final DescribeFraudsterRegistrationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFraudsterRegistrationJobRequest, DescribeFraudsterRegistrationJobResult> asyncHandler) {
        final DescribeFraudsterRegistrationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFraudsterRegistrationJobResult>() {
            @Override
            public DescribeFraudsterRegistrationJobResult call() throws Exception {
                DescribeFraudsterRegistrationJobResult result = null;

                try {
                    result = executeDescribeFraudsterRegistrationJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeSpeakerResult> describeSpeakerAsync(DescribeSpeakerRequest request) {

        return describeSpeakerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpeakerResult> describeSpeakerAsync(final DescribeSpeakerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpeakerRequest, DescribeSpeakerResult> asyncHandler) {
        final DescribeSpeakerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpeakerResult>() {
            @Override
            public DescribeSpeakerResult call() throws Exception {
                DescribeSpeakerResult result = null;

                try {
                    result = executeDescribeSpeaker(finalRequest);
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
    public java.util.concurrent.Future<DescribeSpeakerEnrollmentJobResult> describeSpeakerEnrollmentJobAsync(DescribeSpeakerEnrollmentJobRequest request) {

        return describeSpeakerEnrollmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpeakerEnrollmentJobResult> describeSpeakerEnrollmentJobAsync(final DescribeSpeakerEnrollmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpeakerEnrollmentJobRequest, DescribeSpeakerEnrollmentJobResult> asyncHandler) {
        final DescribeSpeakerEnrollmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpeakerEnrollmentJobResult>() {
            @Override
            public DescribeSpeakerEnrollmentJobResult call() throws Exception {
                DescribeSpeakerEnrollmentJobResult result = null;

                try {
                    result = executeDescribeSpeakerEnrollmentJob(finalRequest);
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
    public java.util.concurrent.Future<EvaluateSessionResult> evaluateSessionAsync(EvaluateSessionRequest request) {

        return evaluateSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluateSessionResult> evaluateSessionAsync(final EvaluateSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<EvaluateSessionRequest, EvaluateSessionResult> asyncHandler) {
        final EvaluateSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EvaluateSessionResult>() {
            @Override
            public EvaluateSessionResult call() throws Exception {
                EvaluateSessionResult result = null;

                try {
                    result = executeEvaluateSession(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
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
    public java.util.concurrent.Future<ListFraudsterRegistrationJobsResult> listFraudsterRegistrationJobsAsync(ListFraudsterRegistrationJobsRequest request) {

        return listFraudsterRegistrationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFraudsterRegistrationJobsResult> listFraudsterRegistrationJobsAsync(
            final ListFraudsterRegistrationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFraudsterRegistrationJobsRequest, ListFraudsterRegistrationJobsResult> asyncHandler) {
        final ListFraudsterRegistrationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFraudsterRegistrationJobsResult>() {
            @Override
            public ListFraudsterRegistrationJobsResult call() throws Exception {
                ListFraudsterRegistrationJobsResult result = null;

                try {
                    result = executeListFraudsterRegistrationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSpeakerEnrollmentJobsResult> listSpeakerEnrollmentJobsAsync(ListSpeakerEnrollmentJobsRequest request) {

        return listSpeakerEnrollmentJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpeakerEnrollmentJobsResult> listSpeakerEnrollmentJobsAsync(final ListSpeakerEnrollmentJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSpeakerEnrollmentJobsRequest, ListSpeakerEnrollmentJobsResult> asyncHandler) {
        final ListSpeakerEnrollmentJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSpeakerEnrollmentJobsResult>() {
            @Override
            public ListSpeakerEnrollmentJobsResult call() throws Exception {
                ListSpeakerEnrollmentJobsResult result = null;

                try {
                    result = executeListSpeakerEnrollmentJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSpeakersResult> listSpeakersAsync(ListSpeakersRequest request) {

        return listSpeakersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpeakersResult> listSpeakersAsync(final ListSpeakersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSpeakersRequest, ListSpeakersResult> asyncHandler) {
        final ListSpeakersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSpeakersResult>() {
            @Override
            public ListSpeakersResult call() throws Exception {
                ListSpeakersResult result = null;

                try {
                    result = executeListSpeakers(finalRequest);
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
    public java.util.concurrent.Future<OptOutSpeakerResult> optOutSpeakerAsync(OptOutSpeakerRequest request) {

        return optOutSpeakerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptOutSpeakerResult> optOutSpeakerAsync(final OptOutSpeakerRequest request,
            final com.amazonaws.handlers.AsyncHandler<OptOutSpeakerRequest, OptOutSpeakerResult> asyncHandler) {
        final OptOutSpeakerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<OptOutSpeakerResult>() {
            @Override
            public OptOutSpeakerResult call() throws Exception {
                OptOutSpeakerResult result = null;

                try {
                    result = executeOptOutSpeaker(finalRequest);
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
    public java.util.concurrent.Future<StartFraudsterRegistrationJobResult> startFraudsterRegistrationJobAsync(StartFraudsterRegistrationJobRequest request) {

        return startFraudsterRegistrationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFraudsterRegistrationJobResult> startFraudsterRegistrationJobAsync(
            final StartFraudsterRegistrationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFraudsterRegistrationJobRequest, StartFraudsterRegistrationJobResult> asyncHandler) {
        final StartFraudsterRegistrationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFraudsterRegistrationJobResult>() {
            @Override
            public StartFraudsterRegistrationJobResult call() throws Exception {
                StartFraudsterRegistrationJobResult result = null;

                try {
                    result = executeStartFraudsterRegistrationJob(finalRequest);
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
    public java.util.concurrent.Future<StartSpeakerEnrollmentJobResult> startSpeakerEnrollmentJobAsync(StartSpeakerEnrollmentJobRequest request) {

        return startSpeakerEnrollmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSpeakerEnrollmentJobResult> startSpeakerEnrollmentJobAsync(final StartSpeakerEnrollmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSpeakerEnrollmentJobRequest, StartSpeakerEnrollmentJobResult> asyncHandler) {
        final StartSpeakerEnrollmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSpeakerEnrollmentJobResult>() {
            @Override
            public StartSpeakerEnrollmentJobResult call() throws Exception {
                StartSpeakerEnrollmentJobResult result = null;

                try {
                    result = executeStartSpeakerEnrollmentJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request) {

        return updateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(final UpdateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler) {
        final UpdateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainResult>() {
            @Override
            public UpdateDomainResult call() throws Exception {
                UpdateDomainResult result = null;

                try {
                    result = executeUpdateDomain(finalRequest);
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
