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
        final AcceptQualificationRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptQualificationRequestResult>() {
            @Override
            public AcceptQualificationRequestResult call() throws Exception {
                AcceptQualificationRequestResult result = null;

                try {
                    result = executeAcceptQualificationRequest(finalRequest);
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
    public java.util.concurrent.Future<ApproveAssignmentResult> approveAssignmentAsync(ApproveAssignmentRequest request) {

        return approveAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApproveAssignmentResult> approveAssignmentAsync(final ApproveAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApproveAssignmentRequest, ApproveAssignmentResult> asyncHandler) {
        final ApproveAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ApproveAssignmentResult>() {
            @Override
            public ApproveAssignmentResult call() throws Exception {
                ApproveAssignmentResult result = null;

                try {
                    result = executeApproveAssignment(finalRequest);
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
    public java.util.concurrent.Future<AssociateQualificationWithWorkerResult> associateQualificationWithWorkerAsync(
            AssociateQualificationWithWorkerRequest request) {

        return associateQualificationWithWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateQualificationWithWorkerResult> associateQualificationWithWorkerAsync(
            final AssociateQualificationWithWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateQualificationWithWorkerRequest, AssociateQualificationWithWorkerResult> asyncHandler) {
        final AssociateQualificationWithWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateQualificationWithWorkerResult>() {
            @Override
            public AssociateQualificationWithWorkerResult call() throws Exception {
                AssociateQualificationWithWorkerResult result = null;

                try {
                    result = executeAssociateQualificationWithWorker(finalRequest);
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
    public java.util.concurrent.Future<CreateAdditionalAssignmentsForHITResult> createAdditionalAssignmentsForHITAsync(
            CreateAdditionalAssignmentsForHITRequest request) {

        return createAdditionalAssignmentsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdditionalAssignmentsForHITResult> createAdditionalAssignmentsForHITAsync(
            final CreateAdditionalAssignmentsForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAdditionalAssignmentsForHITRequest, CreateAdditionalAssignmentsForHITResult> asyncHandler) {
        final CreateAdditionalAssignmentsForHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAdditionalAssignmentsForHITResult>() {
            @Override
            public CreateAdditionalAssignmentsForHITResult call() throws Exception {
                CreateAdditionalAssignmentsForHITResult result = null;

                try {
                    result = executeCreateAdditionalAssignmentsForHIT(finalRequest);
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
    public java.util.concurrent.Future<CreateHITResult> createHITAsync(CreateHITRequest request) {

        return createHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITResult> createHITAsync(final CreateHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHITRequest, CreateHITResult> asyncHandler) {
        final CreateHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHITResult>() {
            @Override
            public CreateHITResult call() throws Exception {
                CreateHITResult result = null;

                try {
                    result = executeCreateHIT(finalRequest);
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
    public java.util.concurrent.Future<CreateHITTypeResult> createHITTypeAsync(CreateHITTypeRequest request) {

        return createHITTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITTypeResult> createHITTypeAsync(final CreateHITTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHITTypeRequest, CreateHITTypeResult> asyncHandler) {
        final CreateHITTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHITTypeResult>() {
            @Override
            public CreateHITTypeResult call() throws Exception {
                CreateHITTypeResult result = null;

                try {
                    result = executeCreateHITType(finalRequest);
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
    public java.util.concurrent.Future<CreateHITWithHITTypeResult> createHITWithHITTypeAsync(CreateHITWithHITTypeRequest request) {

        return createHITWithHITTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITWithHITTypeResult> createHITWithHITTypeAsync(final CreateHITWithHITTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHITWithHITTypeRequest, CreateHITWithHITTypeResult> asyncHandler) {
        final CreateHITWithHITTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHITWithHITTypeResult>() {
            @Override
            public CreateHITWithHITTypeResult call() throws Exception {
                CreateHITWithHITTypeResult result = null;

                try {
                    result = executeCreateHITWithHITType(finalRequest);
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
    public java.util.concurrent.Future<CreateQualificationTypeResult> createQualificationTypeAsync(CreateQualificationTypeRequest request) {

        return createQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQualificationTypeResult> createQualificationTypeAsync(final CreateQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQualificationTypeRequest, CreateQualificationTypeResult> asyncHandler) {
        final CreateQualificationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQualificationTypeResult>() {
            @Override
            public CreateQualificationTypeResult call() throws Exception {
                CreateQualificationTypeResult result = null;

                try {
                    result = executeCreateQualificationType(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkerBlockResult> createWorkerBlockAsync(CreateWorkerBlockRequest request) {

        return createWorkerBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerBlockResult> createWorkerBlockAsync(final CreateWorkerBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkerBlockRequest, CreateWorkerBlockResult> asyncHandler) {
        final CreateWorkerBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkerBlockResult>() {
            @Override
            public CreateWorkerBlockResult call() throws Exception {
                CreateWorkerBlockResult result = null;

                try {
                    result = executeCreateWorkerBlock(finalRequest);
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
    public java.util.concurrent.Future<DeleteHITResult> deleteHITAsync(DeleteHITRequest request) {

        return deleteHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHITResult> deleteHITAsync(final DeleteHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHITRequest, DeleteHITResult> asyncHandler) {
        final DeleteHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHITResult>() {
            @Override
            public DeleteHITResult call() throws Exception {
                DeleteHITResult result = null;

                try {
                    result = executeDeleteHIT(finalRequest);
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
    public java.util.concurrent.Future<DeleteQualificationTypeResult> deleteQualificationTypeAsync(DeleteQualificationTypeRequest request) {

        return deleteQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQualificationTypeResult> deleteQualificationTypeAsync(final DeleteQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQualificationTypeRequest, DeleteQualificationTypeResult> asyncHandler) {
        final DeleteQualificationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQualificationTypeResult>() {
            @Override
            public DeleteQualificationTypeResult call() throws Exception {
                DeleteQualificationTypeResult result = null;

                try {
                    result = executeDeleteQualificationType(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkerBlockResult> deleteWorkerBlockAsync(DeleteWorkerBlockRequest request) {

        return deleteWorkerBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerBlockResult> deleteWorkerBlockAsync(final DeleteWorkerBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkerBlockRequest, DeleteWorkerBlockResult> asyncHandler) {
        final DeleteWorkerBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkerBlockResult>() {
            @Override
            public DeleteWorkerBlockResult call() throws Exception {
                DeleteWorkerBlockResult result = null;

                try {
                    result = executeDeleteWorkerBlock(finalRequest);
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
    public java.util.concurrent.Future<DisassociateQualificationFromWorkerResult> disassociateQualificationFromWorkerAsync(
            DisassociateQualificationFromWorkerRequest request) {

        return disassociateQualificationFromWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateQualificationFromWorkerResult> disassociateQualificationFromWorkerAsync(
            final DisassociateQualificationFromWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateQualificationFromWorkerRequest, DisassociateQualificationFromWorkerResult> asyncHandler) {
        final DisassociateQualificationFromWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateQualificationFromWorkerResult>() {
            @Override
            public DisassociateQualificationFromWorkerResult call() throws Exception {
                DisassociateQualificationFromWorkerResult result = null;

                try {
                    result = executeDisassociateQualificationFromWorker(finalRequest);
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
    public java.util.concurrent.Future<GetAccountBalanceResult> getAccountBalanceAsync(GetAccountBalanceRequest request) {

        return getAccountBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountBalanceResult> getAccountBalanceAsync(final GetAccountBalanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountBalanceRequest, GetAccountBalanceResult> asyncHandler) {
        final GetAccountBalanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountBalanceResult>() {
            @Override
            public GetAccountBalanceResult call() throws Exception {
                GetAccountBalanceResult result = null;

                try {
                    result = executeGetAccountBalance(finalRequest);
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
    public java.util.concurrent.Future<GetAssignmentResult> getAssignmentAsync(GetAssignmentRequest request) {

        return getAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentResult> getAssignmentAsync(final GetAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssignmentRequest, GetAssignmentResult> asyncHandler) {
        final GetAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssignmentResult>() {
            @Override
            public GetAssignmentResult call() throws Exception {
                GetAssignmentResult result = null;

                try {
                    result = executeGetAssignment(finalRequest);
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
    public java.util.concurrent.Future<GetFileUploadURLResult> getFileUploadURLAsync(GetFileUploadURLRequest request) {

        return getFileUploadURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFileUploadURLResult> getFileUploadURLAsync(final GetFileUploadURLRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFileUploadURLRequest, GetFileUploadURLResult> asyncHandler) {
        final GetFileUploadURLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFileUploadURLResult>() {
            @Override
            public GetFileUploadURLResult call() throws Exception {
                GetFileUploadURLResult result = null;

                try {
                    result = executeGetFileUploadURL(finalRequest);
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
    public java.util.concurrent.Future<GetHITResult> getHITAsync(GetHITRequest request) {

        return getHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHITResult> getHITAsync(final GetHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHITRequest, GetHITResult> asyncHandler) {
        final GetHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHITResult>() {
            @Override
            public GetHITResult call() throws Exception {
                GetHITResult result = null;

                try {
                    result = executeGetHIT(finalRequest);
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
    public java.util.concurrent.Future<GetQualificationScoreResult> getQualificationScoreAsync(GetQualificationScoreRequest request) {

        return getQualificationScoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQualificationScoreResult> getQualificationScoreAsync(final GetQualificationScoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQualificationScoreRequest, GetQualificationScoreResult> asyncHandler) {
        final GetQualificationScoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQualificationScoreResult>() {
            @Override
            public GetQualificationScoreResult call() throws Exception {
                GetQualificationScoreResult result = null;

                try {
                    result = executeGetQualificationScore(finalRequest);
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
    public java.util.concurrent.Future<GetQualificationTypeResult> getQualificationTypeAsync(GetQualificationTypeRequest request) {

        return getQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQualificationTypeResult> getQualificationTypeAsync(final GetQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQualificationTypeRequest, GetQualificationTypeResult> asyncHandler) {
        final GetQualificationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQualificationTypeResult>() {
            @Override
            public GetQualificationTypeResult call() throws Exception {
                GetQualificationTypeResult result = null;

                try {
                    result = executeGetQualificationType(finalRequest);
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
    public java.util.concurrent.Future<ListAssignmentsForHITResult> listAssignmentsForHITAsync(ListAssignmentsForHITRequest request) {

        return listAssignmentsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssignmentsForHITResult> listAssignmentsForHITAsync(final ListAssignmentsForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssignmentsForHITRequest, ListAssignmentsForHITResult> asyncHandler) {
        final ListAssignmentsForHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssignmentsForHITResult>() {
            @Override
            public ListAssignmentsForHITResult call() throws Exception {
                ListAssignmentsForHITResult result = null;

                try {
                    result = executeListAssignmentsForHIT(finalRequest);
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
    public java.util.concurrent.Future<ListBonusPaymentsResult> listBonusPaymentsAsync(ListBonusPaymentsRequest request) {

        return listBonusPaymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBonusPaymentsResult> listBonusPaymentsAsync(final ListBonusPaymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBonusPaymentsRequest, ListBonusPaymentsResult> asyncHandler) {
        final ListBonusPaymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBonusPaymentsResult>() {
            @Override
            public ListBonusPaymentsResult call() throws Exception {
                ListBonusPaymentsResult result = null;

                try {
                    result = executeListBonusPayments(finalRequest);
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
    public java.util.concurrent.Future<ListHITsResult> listHITsAsync(ListHITsRequest request) {

        return listHITsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHITsResult> listHITsAsync(final ListHITsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHITsRequest, ListHITsResult> asyncHandler) {
        final ListHITsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHITsResult>() {
            @Override
            public ListHITsResult call() throws Exception {
                ListHITsResult result = null;

                try {
                    result = executeListHITs(finalRequest);
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
    public java.util.concurrent.Future<ListHITsForQualificationTypeResult> listHITsForQualificationTypeAsync(ListHITsForQualificationTypeRequest request) {

        return listHITsForQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHITsForQualificationTypeResult> listHITsForQualificationTypeAsync(final ListHITsForQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHITsForQualificationTypeRequest, ListHITsForQualificationTypeResult> asyncHandler) {
        final ListHITsForQualificationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHITsForQualificationTypeResult>() {
            @Override
            public ListHITsForQualificationTypeResult call() throws Exception {
                ListHITsForQualificationTypeResult result = null;

                try {
                    result = executeListHITsForQualificationType(finalRequest);
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
    public java.util.concurrent.Future<ListQualificationRequestsResult> listQualificationRequestsAsync(ListQualificationRequestsRequest request) {

        return listQualificationRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQualificationRequestsResult> listQualificationRequestsAsync(final ListQualificationRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQualificationRequestsRequest, ListQualificationRequestsResult> asyncHandler) {
        final ListQualificationRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQualificationRequestsResult>() {
            @Override
            public ListQualificationRequestsResult call() throws Exception {
                ListQualificationRequestsResult result = null;

                try {
                    result = executeListQualificationRequests(finalRequest);
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
    public java.util.concurrent.Future<ListQualificationTypesResult> listQualificationTypesAsync(ListQualificationTypesRequest request) {

        return listQualificationTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQualificationTypesResult> listQualificationTypesAsync(final ListQualificationTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQualificationTypesRequest, ListQualificationTypesResult> asyncHandler) {
        final ListQualificationTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQualificationTypesResult>() {
            @Override
            public ListQualificationTypesResult call() throws Exception {
                ListQualificationTypesResult result = null;

                try {
                    result = executeListQualificationTypes(finalRequest);
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
    public java.util.concurrent.Future<ListReviewPolicyResultsForHITResult> listReviewPolicyResultsForHITAsync(ListReviewPolicyResultsForHITRequest request) {

        return listReviewPolicyResultsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewPolicyResultsForHITResult> listReviewPolicyResultsForHITAsync(
            final ListReviewPolicyResultsForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReviewPolicyResultsForHITRequest, ListReviewPolicyResultsForHITResult> asyncHandler) {
        final ListReviewPolicyResultsForHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReviewPolicyResultsForHITResult>() {
            @Override
            public ListReviewPolicyResultsForHITResult call() throws Exception {
                ListReviewPolicyResultsForHITResult result = null;

                try {
                    result = executeListReviewPolicyResultsForHIT(finalRequest);
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
    public java.util.concurrent.Future<ListReviewableHITsResult> listReviewableHITsAsync(ListReviewableHITsRequest request) {

        return listReviewableHITsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewableHITsResult> listReviewableHITsAsync(final ListReviewableHITsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReviewableHITsRequest, ListReviewableHITsResult> asyncHandler) {
        final ListReviewableHITsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReviewableHITsResult>() {
            @Override
            public ListReviewableHITsResult call() throws Exception {
                ListReviewableHITsResult result = null;

                try {
                    result = executeListReviewableHITs(finalRequest);
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
    public java.util.concurrent.Future<ListWorkerBlocksResult> listWorkerBlocksAsync(ListWorkerBlocksRequest request) {

        return listWorkerBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkerBlocksResult> listWorkerBlocksAsync(final ListWorkerBlocksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkerBlocksRequest, ListWorkerBlocksResult> asyncHandler) {
        final ListWorkerBlocksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkerBlocksResult>() {
            @Override
            public ListWorkerBlocksResult call() throws Exception {
                ListWorkerBlocksResult result = null;

                try {
                    result = executeListWorkerBlocks(finalRequest);
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
    public java.util.concurrent.Future<ListWorkersWithQualificationTypeResult> listWorkersWithQualificationTypeAsync(
            ListWorkersWithQualificationTypeRequest request) {

        return listWorkersWithQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkersWithQualificationTypeResult> listWorkersWithQualificationTypeAsync(
            final ListWorkersWithQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkersWithQualificationTypeRequest, ListWorkersWithQualificationTypeResult> asyncHandler) {
        final ListWorkersWithQualificationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkersWithQualificationTypeResult>() {
            @Override
            public ListWorkersWithQualificationTypeResult call() throws Exception {
                ListWorkersWithQualificationTypeResult result = null;

                try {
                    result = executeListWorkersWithQualificationType(finalRequest);
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
    public java.util.concurrent.Future<NotifyWorkersResult> notifyWorkersAsync(NotifyWorkersRequest request) {

        return notifyWorkersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyWorkersResult> notifyWorkersAsync(final NotifyWorkersRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyWorkersRequest, NotifyWorkersResult> asyncHandler) {
        final NotifyWorkersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<NotifyWorkersResult>() {
            @Override
            public NotifyWorkersResult call() throws Exception {
                NotifyWorkersResult result = null;

                try {
                    result = executeNotifyWorkers(finalRequest);
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
    public java.util.concurrent.Future<RejectAssignmentResult> rejectAssignmentAsync(RejectAssignmentRequest request) {

        return rejectAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectAssignmentResult> rejectAssignmentAsync(final RejectAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectAssignmentRequest, RejectAssignmentResult> asyncHandler) {
        final RejectAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectAssignmentResult>() {
            @Override
            public RejectAssignmentResult call() throws Exception {
                RejectAssignmentResult result = null;

                try {
                    result = executeRejectAssignment(finalRequest);
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
    public java.util.concurrent.Future<RejectQualificationRequestResult> rejectQualificationRequestAsync(RejectQualificationRequestRequest request) {

        return rejectQualificationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectQualificationRequestResult> rejectQualificationRequestAsync(final RejectQualificationRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectQualificationRequestRequest, RejectQualificationRequestResult> asyncHandler) {
        final RejectQualificationRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectQualificationRequestResult>() {
            @Override
            public RejectQualificationRequestResult call() throws Exception {
                RejectQualificationRequestResult result = null;

                try {
                    result = executeRejectQualificationRequest(finalRequest);
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
    public java.util.concurrent.Future<SendBonusResult> sendBonusAsync(SendBonusRequest request) {

        return sendBonusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBonusResult> sendBonusAsync(final SendBonusRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendBonusRequest, SendBonusResult> asyncHandler) {
        final SendBonusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendBonusResult>() {
            @Override
            public SendBonusResult call() throws Exception {
                SendBonusResult result = null;

                try {
                    result = executeSendBonus(finalRequest);
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
    public java.util.concurrent.Future<SendTestEventNotificationResult> sendTestEventNotificationAsync(SendTestEventNotificationRequest request) {

        return sendTestEventNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTestEventNotificationResult> sendTestEventNotificationAsync(final SendTestEventNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTestEventNotificationRequest, SendTestEventNotificationResult> asyncHandler) {
        final SendTestEventNotificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTestEventNotificationResult>() {
            @Override
            public SendTestEventNotificationResult call() throws Exception {
                SendTestEventNotificationResult result = null;

                try {
                    result = executeSendTestEventNotification(finalRequest);
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
    public java.util.concurrent.Future<UpdateExpirationForHITResult> updateExpirationForHITAsync(UpdateExpirationForHITRequest request) {

        return updateExpirationForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExpirationForHITResult> updateExpirationForHITAsync(final UpdateExpirationForHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExpirationForHITRequest, UpdateExpirationForHITResult> asyncHandler) {
        final UpdateExpirationForHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExpirationForHITResult>() {
            @Override
            public UpdateExpirationForHITResult call() throws Exception {
                UpdateExpirationForHITResult result = null;

                try {
                    result = executeUpdateExpirationForHIT(finalRequest);
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
    public java.util.concurrent.Future<UpdateHITReviewStatusResult> updateHITReviewStatusAsync(UpdateHITReviewStatusRequest request) {

        return updateHITReviewStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHITReviewStatusResult> updateHITReviewStatusAsync(final UpdateHITReviewStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHITReviewStatusRequest, UpdateHITReviewStatusResult> asyncHandler) {
        final UpdateHITReviewStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHITReviewStatusResult>() {
            @Override
            public UpdateHITReviewStatusResult call() throws Exception {
                UpdateHITReviewStatusResult result = null;

                try {
                    result = executeUpdateHITReviewStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateHITTypeOfHITResult> updateHITTypeOfHITAsync(UpdateHITTypeOfHITRequest request) {

        return updateHITTypeOfHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHITTypeOfHITResult> updateHITTypeOfHITAsync(final UpdateHITTypeOfHITRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHITTypeOfHITRequest, UpdateHITTypeOfHITResult> asyncHandler) {
        final UpdateHITTypeOfHITRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHITTypeOfHITResult>() {
            @Override
            public UpdateHITTypeOfHITResult call() throws Exception {
                UpdateHITTypeOfHITResult result = null;

                try {
                    result = executeUpdateHITTypeOfHIT(finalRequest);
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
    public java.util.concurrent.Future<UpdateNotificationSettingsResult> updateNotificationSettingsAsync(UpdateNotificationSettingsRequest request) {

        return updateNotificationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationSettingsResult> updateNotificationSettingsAsync(final UpdateNotificationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotificationSettingsRequest, UpdateNotificationSettingsResult> asyncHandler) {
        final UpdateNotificationSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotificationSettingsResult>() {
            @Override
            public UpdateNotificationSettingsResult call() throws Exception {
                UpdateNotificationSettingsResult result = null;

                try {
                    result = executeUpdateNotificationSettings(finalRequest);
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
    public java.util.concurrent.Future<UpdateQualificationTypeResult> updateQualificationTypeAsync(UpdateQualificationTypeRequest request) {

        return updateQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQualificationTypeResult> updateQualificationTypeAsync(final UpdateQualificationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQualificationTypeRequest, UpdateQualificationTypeResult> asyncHandler) {
        final UpdateQualificationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQualificationTypeResult>() {
            @Override
            public UpdateQualificationTypeResult call() throws Exception {
                UpdateQualificationTypeResult result = null;

                try {
                    result = executeUpdateQualificationType(finalRequest);
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
