/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon MTurk asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Mechanical Turk API Reference</fullname>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMTurkAsyncClient extends AmazonMTurkClient implements AmazonMTurkAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonMTurkAsyncClientBuilder asyncBuilder() {
        return AmazonMTurkAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon MTurk using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonMTurkAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptQualificationRequestResult> acceptQualificationRequestAsync(AcceptQualificationRequestRequest request) {

        return acceptQualificationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptQualificationRequestResult> acceptQualificationRequestAsync(final AcceptQualificationRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptQualificationRequestRequest, AcceptQualificationRequestResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AcceptQualificationRequestResult>() {
            @Override
            public AcceptQualificationRequestResult call() throws Exception {
                AcceptQualificationRequestResult result;

                try {
                    result = acceptQualificationRequest(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ApproveAssignmentResult> approveAssignmentAsync(ApproveAssignmentRequest request) {

        return approveAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApproveAssignmentResult> approveAssignmentAsync(final ApproveAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApproveAssignmentRequest, ApproveAssignmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ApproveAssignmentResult>() {
            @Override
            public ApproveAssignmentResult call() throws Exception {
                ApproveAssignmentResult result;

                try {
                    result = approveAssignment(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateQualificationWithWorkerResult> associateQualificationWithWorkerAsync(
            AssociateQualificationWithWorkerRequest request) {

        return associateQualificationWithWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateQualificationWithWorkerResult> associateQualificationWithWorkerAsync(
            final AssociateQualificationWithWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateQualificationWithWorkerRequest, AssociateQualificationWithWorkerResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssociateQualificationWithWorkerResult>() {
            @Override
            public AssociateQualificationWithWorkerResult call() throws Exception {
                AssociateQualificationWithWorkerResult result;

                try {
                    result = associateQualificationWithWorker(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAdditionalAssignmentsForHITResult> createAdditionalAssignmentsForHITAsync(
            CreateAdditionalAssignmentsForHITRequest request) {

        return createAdditionalAssignmentsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdditionalAssignmentsForHITResult> createAdditionalAssignmentsForHITAsync(
            final CreateAdditionalAssignmentsForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAdditionalAssignmentsForHITRequest, CreateAdditionalAssignmentsForHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAdditionalAssignmentsForHITResult>() {
            @Override
            public CreateAdditionalAssignmentsForHITResult call() throws Exception {
                CreateAdditionalAssignmentsForHITResult result;

                try {
                    result = createAdditionalAssignmentsForHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateHITResult> createHITAsync(CreateHITRequest request) {

        return createHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITResult> createHITAsync(final CreateHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHITRequest, CreateHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHITResult>() {
            @Override
            public CreateHITResult call() throws Exception {
                CreateHITResult result;

                try {
                    result = createHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateHITTypeResult> createHITTypeAsync(CreateHITTypeRequest request) {

        return createHITTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITTypeResult> createHITTypeAsync(final CreateHITTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHITTypeRequest, CreateHITTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHITTypeResult>() {
            @Override
            public CreateHITTypeResult call() throws Exception {
                CreateHITTypeResult result;

                try {
                    result = createHITType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateHITWithHITTypeResult> createHITWithHITTypeAsync(CreateHITWithHITTypeRequest request) {

        return createHITWithHITTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITWithHITTypeResult> createHITWithHITTypeAsync(final CreateHITWithHITTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHITWithHITTypeRequest, CreateHITWithHITTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHITWithHITTypeResult>() {
            @Override
            public CreateHITWithHITTypeResult call() throws Exception {
                CreateHITWithHITTypeResult result;

                try {
                    result = createHITWithHITType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQualificationTypeResult> createQualificationTypeAsync(CreateQualificationTypeRequest request) {

        return createQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQualificationTypeResult> createQualificationTypeAsync(final CreateQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQualificationTypeRequest, CreateQualificationTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateQualificationTypeResult>() {
            @Override
            public CreateQualificationTypeResult call() throws Exception {
                CreateQualificationTypeResult result;

                try {
                    result = createQualificationType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerBlockResult> createWorkerBlockAsync(CreateWorkerBlockRequest request) {

        return createWorkerBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerBlockResult> createWorkerBlockAsync(final CreateWorkerBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkerBlockRequest, CreateWorkerBlockResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkerBlockResult>() {
            @Override
            public CreateWorkerBlockResult call() throws Exception {
                CreateWorkerBlockResult result;

                try {
                    result = createWorkerBlock(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteHITResult> deleteHITAsync(DeleteHITRequest request) {

        return deleteHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHITResult> deleteHITAsync(final DeleteHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHITRequest, DeleteHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHITResult>() {
            @Override
            public DeleteHITResult call() throws Exception {
                DeleteHITResult result;

                try {
                    result = deleteHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteQualificationTypeResult> deleteQualificationTypeAsync(DeleteQualificationTypeRequest request) {

        return deleteQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQualificationTypeResult> deleteQualificationTypeAsync(final DeleteQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQualificationTypeRequest, DeleteQualificationTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteQualificationTypeResult>() {
            @Override
            public DeleteQualificationTypeResult call() throws Exception {
                DeleteQualificationTypeResult result;

                try {
                    result = deleteQualificationType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerBlockResult> deleteWorkerBlockAsync(DeleteWorkerBlockRequest request) {

        return deleteWorkerBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerBlockResult> deleteWorkerBlockAsync(final DeleteWorkerBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkerBlockRequest, DeleteWorkerBlockResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkerBlockResult>() {
            @Override
            public DeleteWorkerBlockResult call() throws Exception {
                DeleteWorkerBlockResult result;

                try {
                    result = deleteWorkerBlock(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateQualificationFromWorkerResult> disassociateQualificationFromWorkerAsync(
            DisassociateQualificationFromWorkerRequest request) {

        return disassociateQualificationFromWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateQualificationFromWorkerResult> disassociateQualificationFromWorkerAsync(
            final DisassociateQualificationFromWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateQualificationFromWorkerRequest, DisassociateQualificationFromWorkerResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisassociateQualificationFromWorkerResult>() {
            @Override
            public DisassociateQualificationFromWorkerResult call() throws Exception {
                DisassociateQualificationFromWorkerResult result;

                try {
                    result = disassociateQualificationFromWorker(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountBalanceResult> getAccountBalanceAsync(GetAccountBalanceRequest request) {

        return getAccountBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountBalanceResult> getAccountBalanceAsync(final GetAccountBalanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountBalanceRequest, GetAccountBalanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAccountBalanceResult>() {
            @Override
            public GetAccountBalanceResult call() throws Exception {
                GetAccountBalanceResult result;

                try {
                    result = getAccountBalance(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentResult> getAssignmentAsync(GetAssignmentRequest request) {

        return getAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentResult> getAssignmentAsync(final GetAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssignmentRequest, GetAssignmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAssignmentResult>() {
            @Override
            public GetAssignmentResult call() throws Exception {
                GetAssignmentResult result;

                try {
                    result = getAssignment(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFileUploadURLResult> getFileUploadURLAsync(GetFileUploadURLRequest request) {

        return getFileUploadURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFileUploadURLResult> getFileUploadURLAsync(final GetFileUploadURLRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFileUploadURLRequest, GetFileUploadURLResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetFileUploadURLResult>() {
            @Override
            public GetFileUploadURLResult call() throws Exception {
                GetFileUploadURLResult result;

                try {
                    result = getFileUploadURL(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetHITResult> getHITAsync(GetHITRequest request) {

        return getHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHITResult> getHITAsync(final GetHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHITRequest, GetHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetHITResult>() {
            @Override
            public GetHITResult call() throws Exception {
                GetHITResult result;

                try {
                    result = getHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQualificationScoreResult> getQualificationScoreAsync(GetQualificationScoreRequest request) {

        return getQualificationScoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQualificationScoreResult> getQualificationScoreAsync(final GetQualificationScoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQualificationScoreRequest, GetQualificationScoreResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetQualificationScoreResult>() {
            @Override
            public GetQualificationScoreResult call() throws Exception {
                GetQualificationScoreResult result;

                try {
                    result = getQualificationScore(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQualificationTypeResult> getQualificationTypeAsync(GetQualificationTypeRequest request) {

        return getQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQualificationTypeResult> getQualificationTypeAsync(final GetQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQualificationTypeRequest, GetQualificationTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetQualificationTypeResult>() {
            @Override
            public GetQualificationTypeResult call() throws Exception {
                GetQualificationTypeResult result;

                try {
                    result = getQualificationType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssignmentsForHITResult> listAssignmentsForHITAsync(ListAssignmentsForHITRequest request) {

        return listAssignmentsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssignmentsForHITResult> listAssignmentsForHITAsync(final ListAssignmentsForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssignmentsForHITRequest, ListAssignmentsForHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAssignmentsForHITResult>() {
            @Override
            public ListAssignmentsForHITResult call() throws Exception {
                ListAssignmentsForHITResult result;

                try {
                    result = listAssignmentsForHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBonusPaymentsResult> listBonusPaymentsAsync(ListBonusPaymentsRequest request) {

        return listBonusPaymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBonusPaymentsResult> listBonusPaymentsAsync(final ListBonusPaymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBonusPaymentsRequest, ListBonusPaymentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListBonusPaymentsResult>() {
            @Override
            public ListBonusPaymentsResult call() throws Exception {
                ListBonusPaymentsResult result;

                try {
                    result = listBonusPayments(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHITsResult> listHITsAsync(ListHITsRequest request) {

        return listHITsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHITsResult> listHITsAsync(final ListHITsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHITsRequest, ListHITsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListHITsResult>() {
            @Override
            public ListHITsResult call() throws Exception {
                ListHITsResult result;

                try {
                    result = listHITs(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHITsForQualificationTypeResult> listHITsForQualificationTypeAsync(ListHITsForQualificationTypeRequest request) {

        return listHITsForQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHITsForQualificationTypeResult> listHITsForQualificationTypeAsync(final ListHITsForQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHITsForQualificationTypeRequest, ListHITsForQualificationTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListHITsForQualificationTypeResult>() {
            @Override
            public ListHITsForQualificationTypeResult call() throws Exception {
                ListHITsForQualificationTypeResult result;

                try {
                    result = listHITsForQualificationType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQualificationRequestsResult> listQualificationRequestsAsync(ListQualificationRequestsRequest request) {

        return listQualificationRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQualificationRequestsResult> listQualificationRequestsAsync(final ListQualificationRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQualificationRequestsRequest, ListQualificationRequestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListQualificationRequestsResult>() {
            @Override
            public ListQualificationRequestsResult call() throws Exception {
                ListQualificationRequestsResult result;

                try {
                    result = listQualificationRequests(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQualificationTypesResult> listQualificationTypesAsync(ListQualificationTypesRequest request) {

        return listQualificationTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQualificationTypesResult> listQualificationTypesAsync(final ListQualificationTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQualificationTypesRequest, ListQualificationTypesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListQualificationTypesResult>() {
            @Override
            public ListQualificationTypesResult call() throws Exception {
                ListQualificationTypesResult result;

                try {
                    result = listQualificationTypes(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReviewPolicyResultsForHITResult> listReviewPolicyResultsForHITAsync(ListReviewPolicyResultsForHITRequest request) {

        return listReviewPolicyResultsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewPolicyResultsForHITResult> listReviewPolicyResultsForHITAsync(
            final ListReviewPolicyResultsForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReviewPolicyResultsForHITRequest, ListReviewPolicyResultsForHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListReviewPolicyResultsForHITResult>() {
            @Override
            public ListReviewPolicyResultsForHITResult call() throws Exception {
                ListReviewPolicyResultsForHITResult result;

                try {
                    result = listReviewPolicyResultsForHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReviewableHITsResult> listReviewableHITsAsync(ListReviewableHITsRequest request) {

        return listReviewableHITsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewableHITsResult> listReviewableHITsAsync(final ListReviewableHITsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReviewableHITsRequest, ListReviewableHITsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListReviewableHITsResult>() {
            @Override
            public ListReviewableHITsResult call() throws Exception {
                ListReviewableHITsResult result;

                try {
                    result = listReviewableHITs(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkerBlocksResult> listWorkerBlocksAsync(ListWorkerBlocksRequest request) {

        return listWorkerBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkerBlocksResult> listWorkerBlocksAsync(final ListWorkerBlocksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkerBlocksRequest, ListWorkerBlocksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListWorkerBlocksResult>() {
            @Override
            public ListWorkerBlocksResult call() throws Exception {
                ListWorkerBlocksResult result;

                try {
                    result = listWorkerBlocks(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkersWithQualificationTypeResult> listWorkersWithQualificationTypeAsync(
            ListWorkersWithQualificationTypeRequest request) {

        return listWorkersWithQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkersWithQualificationTypeResult> listWorkersWithQualificationTypeAsync(
            final ListWorkersWithQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkersWithQualificationTypeRequest, ListWorkersWithQualificationTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListWorkersWithQualificationTypeResult>() {
            @Override
            public ListWorkersWithQualificationTypeResult call() throws Exception {
                ListWorkersWithQualificationTypeResult result;

                try {
                    result = listWorkersWithQualificationType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<NotifyWorkersResult> notifyWorkersAsync(NotifyWorkersRequest request) {

        return notifyWorkersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyWorkersResult> notifyWorkersAsync(final NotifyWorkersRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyWorkersRequest, NotifyWorkersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<NotifyWorkersResult>() {
            @Override
            public NotifyWorkersResult call() throws Exception {
                NotifyWorkersResult result;

                try {
                    result = notifyWorkers(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RejectAssignmentResult> rejectAssignmentAsync(RejectAssignmentRequest request) {

        return rejectAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectAssignmentResult> rejectAssignmentAsync(final RejectAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectAssignmentRequest, RejectAssignmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RejectAssignmentResult>() {
            @Override
            public RejectAssignmentResult call() throws Exception {
                RejectAssignmentResult result;

                try {
                    result = rejectAssignment(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RejectQualificationRequestResult> rejectQualificationRequestAsync(RejectQualificationRequestRequest request) {

        return rejectQualificationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectQualificationRequestResult> rejectQualificationRequestAsync(final RejectQualificationRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectQualificationRequestRequest, RejectQualificationRequestResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RejectQualificationRequestResult>() {
            @Override
            public RejectQualificationRequestResult call() throws Exception {
                RejectQualificationRequestResult result;

                try {
                    result = rejectQualificationRequest(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendBonusResult> sendBonusAsync(SendBonusRequest request) {

        return sendBonusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBonusResult> sendBonusAsync(final SendBonusRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendBonusRequest, SendBonusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendBonusResult>() {
            @Override
            public SendBonusResult call() throws Exception {
                SendBonusResult result;

                try {
                    result = sendBonus(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendTestEventNotificationResult> sendTestEventNotificationAsync(SendTestEventNotificationRequest request) {

        return sendTestEventNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTestEventNotificationResult> sendTestEventNotificationAsync(final SendTestEventNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTestEventNotificationRequest, SendTestEventNotificationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendTestEventNotificationResult>() {
            @Override
            public SendTestEventNotificationResult call() throws Exception {
                SendTestEventNotificationResult result;

                try {
                    result = sendTestEventNotification(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateExpirationForHITResult> updateExpirationForHITAsync(UpdateExpirationForHITRequest request) {

        return updateExpirationForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExpirationForHITResult> updateExpirationForHITAsync(final UpdateExpirationForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExpirationForHITRequest, UpdateExpirationForHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateExpirationForHITResult>() {
            @Override
            public UpdateExpirationForHITResult call() throws Exception {
                UpdateExpirationForHITResult result;

                try {
                    result = updateExpirationForHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateHITReviewStatusResult> updateHITReviewStatusAsync(UpdateHITReviewStatusRequest request) {

        return updateHITReviewStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHITReviewStatusResult> updateHITReviewStatusAsync(final UpdateHITReviewStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHITReviewStatusRequest, UpdateHITReviewStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateHITReviewStatusResult>() {
            @Override
            public UpdateHITReviewStatusResult call() throws Exception {
                UpdateHITReviewStatusResult result;

                try {
                    result = updateHITReviewStatus(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateHITTypeOfHITResult> updateHITTypeOfHITAsync(UpdateHITTypeOfHITRequest request) {

        return updateHITTypeOfHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHITTypeOfHITResult> updateHITTypeOfHITAsync(final UpdateHITTypeOfHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHITTypeOfHITRequest, UpdateHITTypeOfHITResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateHITTypeOfHITResult>() {
            @Override
            public UpdateHITTypeOfHITResult call() throws Exception {
                UpdateHITTypeOfHITResult result;

                try {
                    result = updateHITTypeOfHIT(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationSettingsResult> updateNotificationSettingsAsync(UpdateNotificationSettingsRequest request) {

        return updateNotificationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationSettingsResult> updateNotificationSettingsAsync(final UpdateNotificationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotificationSettingsRequest, UpdateNotificationSettingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotificationSettingsResult>() {
            @Override
            public UpdateNotificationSettingsResult call() throws Exception {
                UpdateNotificationSettingsResult result;

                try {
                    result = updateNotificationSettings(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQualificationTypeResult> updateQualificationTypeAsync(UpdateQualificationTypeRequest request) {

        return updateQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQualificationTypeResult> updateQualificationTypeAsync(final UpdateQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQualificationTypeRequest, UpdateQualificationTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateQualificationTypeResult>() {
            @Override
            public UpdateQualificationTypeResult call() throws Exception {
                UpdateQualificationTypeResult result;

                try {
                    result = updateQualificationType(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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
