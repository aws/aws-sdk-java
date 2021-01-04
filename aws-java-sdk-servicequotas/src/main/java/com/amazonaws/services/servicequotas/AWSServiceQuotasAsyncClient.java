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
package com.amazonaws.services.servicequotas;

import javax.annotation.Generated;

import com.amazonaws.services.servicequotas.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Service Quotas asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * With Service Quotas, you can view and manage your quotas easily as your AWS workloads grow. Quotas, also referred to
 * as limits, are the maximum number of resources that you can create in your AWS account. For more information, see the
 * <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/">Service Quotas User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceQuotasAsyncClient extends AWSServiceQuotasClient implements AWSServiceQuotasAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSServiceQuotasAsyncClientBuilder asyncBuilder() {
        return AWSServiceQuotasAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Service Quotas using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSServiceQuotasAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Service Quotas using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSServiceQuotasAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateServiceQuotaTemplateResult> associateServiceQuotaTemplateAsync(AssociateServiceQuotaTemplateRequest request) {

        return associateServiceQuotaTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateServiceQuotaTemplateResult> associateServiceQuotaTemplateAsync(
            final AssociateServiceQuotaTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateServiceQuotaTemplateRequest, AssociateServiceQuotaTemplateResult> asyncHandler) {
        final AssociateServiceQuotaTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateServiceQuotaTemplateResult>() {
            @Override
            public AssociateServiceQuotaTemplateResult call() throws Exception {
                AssociateServiceQuotaTemplateResult result = null;

                try {
                    result = executeAssociateServiceQuotaTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceQuotaIncreaseRequestFromTemplateResult> deleteServiceQuotaIncreaseRequestFromTemplateAsync(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest request) {

        return deleteServiceQuotaIncreaseRequestFromTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceQuotaIncreaseRequestFromTemplateResult> deleteServiceQuotaIncreaseRequestFromTemplateAsync(
            final DeleteServiceQuotaIncreaseRequestFromTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceQuotaIncreaseRequestFromTemplateRequest, DeleteServiceQuotaIncreaseRequestFromTemplateResult> asyncHandler) {
        final DeleteServiceQuotaIncreaseRequestFromTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceQuotaIncreaseRequestFromTemplateResult>() {
            @Override
            public DeleteServiceQuotaIncreaseRequestFromTemplateResult call() throws Exception {
                DeleteServiceQuotaIncreaseRequestFromTemplateResult result = null;

                try {
                    result = executeDeleteServiceQuotaIncreaseRequestFromTemplate(finalRequest);
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
    public java.util.concurrent.Future<DisassociateServiceQuotaTemplateResult> disassociateServiceQuotaTemplateAsync(
            DisassociateServiceQuotaTemplateRequest request) {

        return disassociateServiceQuotaTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateServiceQuotaTemplateResult> disassociateServiceQuotaTemplateAsync(
            final DisassociateServiceQuotaTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateServiceQuotaTemplateRequest, DisassociateServiceQuotaTemplateResult> asyncHandler) {
        final DisassociateServiceQuotaTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateServiceQuotaTemplateResult>() {
            @Override
            public DisassociateServiceQuotaTemplateResult call() throws Exception {
                DisassociateServiceQuotaTemplateResult result = null;

                try {
                    result = executeDisassociateServiceQuotaTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetAWSDefaultServiceQuotaResult> getAWSDefaultServiceQuotaAsync(GetAWSDefaultServiceQuotaRequest request) {

        return getAWSDefaultServiceQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAWSDefaultServiceQuotaResult> getAWSDefaultServiceQuotaAsync(final GetAWSDefaultServiceQuotaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAWSDefaultServiceQuotaRequest, GetAWSDefaultServiceQuotaResult> asyncHandler) {
        final GetAWSDefaultServiceQuotaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAWSDefaultServiceQuotaResult>() {
            @Override
            public GetAWSDefaultServiceQuotaResult call() throws Exception {
                GetAWSDefaultServiceQuotaResult result = null;

                try {
                    result = executeGetAWSDefaultServiceQuota(finalRequest);
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
    public java.util.concurrent.Future<GetAssociationForServiceQuotaTemplateResult> getAssociationForServiceQuotaTemplateAsync(
            GetAssociationForServiceQuotaTemplateRequest request) {

        return getAssociationForServiceQuotaTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssociationForServiceQuotaTemplateResult> getAssociationForServiceQuotaTemplateAsync(
            final GetAssociationForServiceQuotaTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssociationForServiceQuotaTemplateRequest, GetAssociationForServiceQuotaTemplateResult> asyncHandler) {
        final GetAssociationForServiceQuotaTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssociationForServiceQuotaTemplateResult>() {
            @Override
            public GetAssociationForServiceQuotaTemplateResult call() throws Exception {
                GetAssociationForServiceQuotaTemplateResult result = null;

                try {
                    result = executeGetAssociationForServiceQuotaTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetRequestedServiceQuotaChangeResult> getRequestedServiceQuotaChangeAsync(GetRequestedServiceQuotaChangeRequest request) {

        return getRequestedServiceQuotaChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRequestedServiceQuotaChangeResult> getRequestedServiceQuotaChangeAsync(
            final GetRequestedServiceQuotaChangeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRequestedServiceQuotaChangeRequest, GetRequestedServiceQuotaChangeResult> asyncHandler) {
        final GetRequestedServiceQuotaChangeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRequestedServiceQuotaChangeResult>() {
            @Override
            public GetRequestedServiceQuotaChangeResult call() throws Exception {
                GetRequestedServiceQuotaChangeResult result = null;

                try {
                    result = executeGetRequestedServiceQuotaChange(finalRequest);
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
    public java.util.concurrent.Future<GetServiceQuotaResult> getServiceQuotaAsync(GetServiceQuotaRequest request) {

        return getServiceQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceQuotaResult> getServiceQuotaAsync(final GetServiceQuotaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceQuotaRequest, GetServiceQuotaResult> asyncHandler) {
        final GetServiceQuotaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceQuotaResult>() {
            @Override
            public GetServiceQuotaResult call() throws Exception {
                GetServiceQuotaResult result = null;

                try {
                    result = executeGetServiceQuota(finalRequest);
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
    public java.util.concurrent.Future<GetServiceQuotaIncreaseRequestFromTemplateResult> getServiceQuotaIncreaseRequestFromTemplateAsync(
            GetServiceQuotaIncreaseRequestFromTemplateRequest request) {

        return getServiceQuotaIncreaseRequestFromTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceQuotaIncreaseRequestFromTemplateResult> getServiceQuotaIncreaseRequestFromTemplateAsync(
            final GetServiceQuotaIncreaseRequestFromTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceQuotaIncreaseRequestFromTemplateRequest, GetServiceQuotaIncreaseRequestFromTemplateResult> asyncHandler) {
        final GetServiceQuotaIncreaseRequestFromTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceQuotaIncreaseRequestFromTemplateResult>() {
            @Override
            public GetServiceQuotaIncreaseRequestFromTemplateResult call() throws Exception {
                GetServiceQuotaIncreaseRequestFromTemplateResult result = null;

                try {
                    result = executeGetServiceQuotaIncreaseRequestFromTemplate(finalRequest);
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
    public java.util.concurrent.Future<ListAWSDefaultServiceQuotasResult> listAWSDefaultServiceQuotasAsync(ListAWSDefaultServiceQuotasRequest request) {

        return listAWSDefaultServiceQuotasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAWSDefaultServiceQuotasResult> listAWSDefaultServiceQuotasAsync(final ListAWSDefaultServiceQuotasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAWSDefaultServiceQuotasRequest, ListAWSDefaultServiceQuotasResult> asyncHandler) {
        final ListAWSDefaultServiceQuotasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAWSDefaultServiceQuotasResult>() {
            @Override
            public ListAWSDefaultServiceQuotasResult call() throws Exception {
                ListAWSDefaultServiceQuotasResult result = null;

                try {
                    result = executeListAWSDefaultServiceQuotas(finalRequest);
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
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryResult> listRequestedServiceQuotaChangeHistoryAsync(
            ListRequestedServiceQuotaChangeHistoryRequest request) {

        return listRequestedServiceQuotaChangeHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryResult> listRequestedServiceQuotaChangeHistoryAsync(
            final ListRequestedServiceQuotaChangeHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRequestedServiceQuotaChangeHistoryRequest, ListRequestedServiceQuotaChangeHistoryResult> asyncHandler) {
        final ListRequestedServiceQuotaChangeHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRequestedServiceQuotaChangeHistoryResult>() {
            @Override
            public ListRequestedServiceQuotaChangeHistoryResult call() throws Exception {
                ListRequestedServiceQuotaChangeHistoryResult result = null;

                try {
                    result = executeListRequestedServiceQuotaChangeHistory(finalRequest);
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
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryByQuotaResult> listRequestedServiceQuotaChangeHistoryByQuotaAsync(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest request) {

        return listRequestedServiceQuotaChangeHistoryByQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryByQuotaResult> listRequestedServiceQuotaChangeHistoryByQuotaAsync(
            final ListRequestedServiceQuotaChangeHistoryByQuotaRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRequestedServiceQuotaChangeHistoryByQuotaRequest, ListRequestedServiceQuotaChangeHistoryByQuotaResult> asyncHandler) {
        final ListRequestedServiceQuotaChangeHistoryByQuotaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRequestedServiceQuotaChangeHistoryByQuotaResult>() {
            @Override
            public ListRequestedServiceQuotaChangeHistoryByQuotaResult call() throws Exception {
                ListRequestedServiceQuotaChangeHistoryByQuotaResult result = null;

                try {
                    result = executeListRequestedServiceQuotaChangeHistoryByQuota(finalRequest);
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
    public java.util.concurrent.Future<ListServiceQuotaIncreaseRequestsInTemplateResult> listServiceQuotaIncreaseRequestsInTemplateAsync(
            ListServiceQuotaIncreaseRequestsInTemplateRequest request) {

        return listServiceQuotaIncreaseRequestsInTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceQuotaIncreaseRequestsInTemplateResult> listServiceQuotaIncreaseRequestsInTemplateAsync(
            final ListServiceQuotaIncreaseRequestsInTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceQuotaIncreaseRequestsInTemplateRequest, ListServiceQuotaIncreaseRequestsInTemplateResult> asyncHandler) {
        final ListServiceQuotaIncreaseRequestsInTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceQuotaIncreaseRequestsInTemplateResult>() {
            @Override
            public ListServiceQuotaIncreaseRequestsInTemplateResult call() throws Exception {
                ListServiceQuotaIncreaseRequestsInTemplateResult result = null;

                try {
                    result = executeListServiceQuotaIncreaseRequestsInTemplate(finalRequest);
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
    public java.util.concurrent.Future<ListServiceQuotasResult> listServiceQuotasAsync(ListServiceQuotasRequest request) {

        return listServiceQuotasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceQuotasResult> listServiceQuotasAsync(final ListServiceQuotasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceQuotasRequest, ListServiceQuotasResult> asyncHandler) {
        final ListServiceQuotasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceQuotasResult>() {
            @Override
            public ListServiceQuotasResult call() throws Exception {
                ListServiceQuotasResult result = null;

                try {
                    result = executeListServiceQuotas(finalRequest);
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
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(final ListServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {
        final ListServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicesResult>() {
            @Override
            public ListServicesResult call() throws Exception {
                ListServicesResult result = null;

                try {
                    result = executeListServices(finalRequest);
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
    public java.util.concurrent.Future<PutServiceQuotaIncreaseRequestIntoTemplateResult> putServiceQuotaIncreaseRequestIntoTemplateAsync(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest request) {

        return putServiceQuotaIncreaseRequestIntoTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutServiceQuotaIncreaseRequestIntoTemplateResult> putServiceQuotaIncreaseRequestIntoTemplateAsync(
            final PutServiceQuotaIncreaseRequestIntoTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutServiceQuotaIncreaseRequestIntoTemplateRequest, PutServiceQuotaIncreaseRequestIntoTemplateResult> asyncHandler) {
        final PutServiceQuotaIncreaseRequestIntoTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutServiceQuotaIncreaseRequestIntoTemplateResult>() {
            @Override
            public PutServiceQuotaIncreaseRequestIntoTemplateResult call() throws Exception {
                PutServiceQuotaIncreaseRequestIntoTemplateResult result = null;

                try {
                    result = executePutServiceQuotaIncreaseRequestIntoTemplate(finalRequest);
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
    public java.util.concurrent.Future<RequestServiceQuotaIncreaseResult> requestServiceQuotaIncreaseAsync(RequestServiceQuotaIncreaseRequest request) {

        return requestServiceQuotaIncreaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestServiceQuotaIncreaseResult> requestServiceQuotaIncreaseAsync(final RequestServiceQuotaIncreaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestServiceQuotaIncreaseRequest, RequestServiceQuotaIncreaseResult> asyncHandler) {
        final RequestServiceQuotaIncreaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestServiceQuotaIncreaseResult>() {
            @Override
            public RequestServiceQuotaIncreaseResult call() throws Exception {
                RequestServiceQuotaIncreaseResult result = null;

                try {
                    result = executeRequestServiceQuotaIncrease(finalRequest);
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
