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
package com.amazonaws.services.securityhub;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS SecurityHub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Security Hub provides you with a comprehensive view of your security state within AWS and your compliance with
 * the security industry standards and best practices. Security Hub collects security data from across AWS accounts,
 * services, and supported third-party partners and helps you analyze your security trends and identify the highest
 * priority security issues. For more information, see <a
 * href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">AWS Security Hub User
 * Guide</a>.
 * </p>
 * <important>
 * <p>
 * Currently, AWS Security Hub is in Preview release.
 * </p>
 * </important>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecurityHubAsyncClient extends AWSSecurityHubClient implements AWSSecurityHubAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSecurityHubAsyncClientBuilder asyncBuilder() {
        return AWSSecurityHubAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSecurityHubAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request) {

        return acceptInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(final AcceptInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler) {
        final AcceptInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptInvitationResult>() {
            @Override
            public AcceptInvitationResult call() throws Exception {
                AcceptInvitationResult result = null;

                try {
                    result = executeAcceptInvitation(finalRequest);
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
    public java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest request) {

        return batchDisableStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(final BatchDisableStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisableStandardsRequest, BatchDisableStandardsResult> asyncHandler) {
        final BatchDisableStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisableStandardsResult>() {
            @Override
            public BatchDisableStandardsResult call() throws Exception {
                BatchDisableStandardsResult result = null;

                try {
                    result = executeBatchDisableStandards(finalRequest);
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
    public java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest request) {

        return batchEnableStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(final BatchEnableStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchEnableStandardsRequest, BatchEnableStandardsResult> asyncHandler) {
        final BatchEnableStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchEnableStandardsResult>() {
            @Override
            public BatchEnableStandardsResult call() throws Exception {
                BatchEnableStandardsResult result = null;

                try {
                    result = executeBatchEnableStandards(finalRequest);
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
    public java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest request) {

        return batchImportFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(final BatchImportFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchImportFindingsRequest, BatchImportFindingsResult> asyncHandler) {
        final BatchImportFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchImportFindingsResult>() {
            @Override
            public BatchImportFindingsResult call() throws Exception {
                BatchImportFindingsResult result = null;

                try {
                    result = executeBatchImportFindings(finalRequest);
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
    public java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest request) {

        return createInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInsightResult> createInsightAsync(final CreateInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInsightRequest, CreateInsightResult> asyncHandler) {
        final CreateInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInsightResult>() {
            @Override
            public CreateInsightResult call() throws Exception {
                CreateInsightResult result = null;

                try {
                    result = executeCreateInsight(finalRequest);
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
    public java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest request) {

        return createMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMembersResult> createMembersAsync(final CreateMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler) {
        final CreateMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMembersResult>() {
            @Override
            public CreateMembersResult call() throws Exception {
                CreateMembersResult result = null;

                try {
                    result = executeCreateMembers(finalRequest);
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
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest request) {

        return declineInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(final DeclineInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler) {
        final DeclineInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeclineInvitationsResult>() {
            @Override
            public DeclineInvitationsResult call() throws Exception {
                DeclineInvitationsResult result = null;

                try {
                    result = executeDeclineInvitations(finalRequest);
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
    public java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest request) {

        return deleteInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(final DeleteInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInsightRequest, DeleteInsightResult> asyncHandler) {
        final DeleteInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInsightResult>() {
            @Override
            public DeleteInsightResult call() throws Exception {
                DeleteInsightResult result = null;

                try {
                    result = executeDeleteInsight(finalRequest);
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
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest request) {

        return deleteInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(final DeleteInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler) {
        final DeleteInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInvitationsResult>() {
            @Override
            public DeleteInvitationsResult call() throws Exception {
                DeleteInvitationsResult result = null;

                try {
                    result = executeDeleteInvitations(finalRequest);
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
    public java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest request) {

        return deleteMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(final DeleteMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler) {
        final DeleteMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMembersResult>() {
            @Override
            public DeleteMembersResult call() throws Exception {
                DeleteMembersResult result = null;

                try {
                    result = executeDeleteMembers(finalRequest);
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
    public java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest request) {

        return disableImportFindingsForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            final DisableImportFindingsForProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableImportFindingsForProductRequest, DisableImportFindingsForProductResult> asyncHandler) {
        final DisableImportFindingsForProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableImportFindingsForProductResult>() {
            @Override
            public DisableImportFindingsForProductResult call() throws Exception {
                DisableImportFindingsForProductResult result = null;

                try {
                    result = executeDisableImportFindingsForProduct(finalRequest);
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
    public java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest request) {

        return disableSecurityHubAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(final DisableSecurityHubRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSecurityHubRequest, DisableSecurityHubResult> asyncHandler) {
        final DisableSecurityHubRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableSecurityHubResult>() {
            @Override
            public DisableSecurityHubResult call() throws Exception {
                DisableSecurityHubResult result = null;

                try {
                    result = executeDisableSecurityHub(finalRequest);
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
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(DisassociateFromMasterAccountRequest request) {

        return disassociateFromMasterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            final DisassociateFromMasterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler) {
        final DisassociateFromMasterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFromMasterAccountResult>() {
            @Override
            public DisassociateFromMasterAccountResult call() throws Exception {
                DisassociateFromMasterAccountResult result = null;

                try {
                    result = executeDisassociateFromMasterAccount(finalRequest);
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
    public java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest request) {

        return disassociateMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(final DisassociateMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler) {
        final DisassociateMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMembersResult>() {
            @Override
            public DisassociateMembersResult call() throws Exception {
                DisassociateMembersResult result = null;

                try {
                    result = executeDisassociateMembers(finalRequest);
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
    public java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(EnableImportFindingsForProductRequest request) {

        return enableImportFindingsForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            final EnableImportFindingsForProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableImportFindingsForProductRequest, EnableImportFindingsForProductResult> asyncHandler) {
        final EnableImportFindingsForProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableImportFindingsForProductResult>() {
            @Override
            public EnableImportFindingsForProductResult call() throws Exception {
                EnableImportFindingsForProductResult result = null;

                try {
                    result = executeEnableImportFindingsForProduct(finalRequest);
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
    public java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest request) {

        return enableSecurityHubAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(final EnableSecurityHubRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSecurityHubRequest, EnableSecurityHubResult> asyncHandler) {
        final EnableSecurityHubRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableSecurityHubResult>() {
            @Override
            public EnableSecurityHubResult call() throws Exception {
                EnableSecurityHubResult result = null;

                try {
                    result = executeEnableSecurityHub(finalRequest);
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
    public java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest request) {

        return getEnabledStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(final GetEnabledStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnabledStandardsRequest, GetEnabledStandardsResult> asyncHandler) {
        final GetEnabledStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnabledStandardsResult>() {
            @Override
            public GetEnabledStandardsResult call() throws Exception {
                GetEnabledStandardsResult result = null;

                try {
                    result = executeGetEnabledStandards(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request) {

        return getFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(final GetFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler) {
        final GetFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsResult>() {
            @Override
            public GetFindingsResult call() throws Exception {
                GetFindingsResult result = null;

                try {
                    result = executeGetFindings(finalRequest);
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
    public java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest request) {

        return getInsightResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(final GetInsightResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInsightResultsRequest, GetInsightResultsResult> asyncHandler) {
        final GetInsightResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInsightResultsResult>() {
            @Override
            public GetInsightResultsResult call() throws Exception {
                GetInsightResultsResult result = null;

                try {
                    result = executeGetInsightResults(finalRequest);
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
    public java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest request) {

        return getInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(final GetInsightsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInsightsRequest, GetInsightsResult> asyncHandler) {
        final GetInsightsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInsightsResult>() {
            @Override
            public GetInsightsResult call() throws Exception {
                GetInsightsResult result = null;

                try {
                    result = executeGetInsights(finalRequest);
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
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest request) {

        return getInvitationsCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(final GetInvitationsCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler) {
        final GetInvitationsCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInvitationsCountResult>() {
            @Override
            public GetInvitationsCountResult call() throws Exception {
                GetInvitationsCountResult result = null;

                try {
                    result = executeGetInvitationsCount(finalRequest);
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
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest request) {

        return getMasterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(final GetMasterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler) {
        final GetMasterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMasterAccountResult>() {
            @Override
            public GetMasterAccountResult call() throws Exception {
                GetMasterAccountResult result = null;

                try {
                    result = executeGetMasterAccount(finalRequest);
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
    public java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest request) {

        return getMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMembersResult> getMembersAsync(final GetMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler) {
        final GetMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMembersResult>() {
            @Override
            public GetMembersResult call() throws Exception {
                GetMembersResult result = null;

                try {
                    result = executeGetMembers(finalRequest);
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
    public java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest request) {

        return inviteMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(final InviteMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler) {
        final InviteMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InviteMembersResult>() {
            @Override
            public InviteMembersResult call() throws Exception {
                InviteMembersResult result = null;

                try {
                    result = executeInviteMembers(finalRequest);
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
    public java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(ListEnabledProductsForImportRequest request) {

        return listEnabledProductsForImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(final ListEnabledProductsForImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnabledProductsForImportRequest, ListEnabledProductsForImportResult> asyncHandler) {
        final ListEnabledProductsForImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnabledProductsForImportResult>() {
            @Override
            public ListEnabledProductsForImportResult call() throws Exception {
                ListEnabledProductsForImportResult result = null;

                try {
                    result = executeListEnabledProductsForImport(finalRequest);
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
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request) {

        return listInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(final ListInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler) {
        final ListInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInvitationsResult>() {
            @Override
            public ListInvitationsResult call() throws Exception {
                ListInvitationsResult result = null;

                try {
                    result = executeListInvitations(finalRequest);
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
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(final ListMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {
        final ListMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMembersResult>() {
            @Override
            public ListMembersResult call() throws Exception {
                ListMembersResult result = null;

                try {
                    result = executeListMembers(finalRequest);
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
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest request) {

        return updateFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(final UpdateFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler) {
        final UpdateFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFindingsResult>() {
            @Override
            public UpdateFindingsResult call() throws Exception {
                UpdateFindingsResult result = null;

                try {
                    result = executeUpdateFindings(finalRequest);
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
    public java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest request) {

        return updateInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(final UpdateInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInsightRequest, UpdateInsightResult> asyncHandler) {
        final UpdateInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInsightResult>() {
            @Override
            public UpdateInsightResult call() throws Exception {
                UpdateInsightResult result = null;

                try {
                    result = executeUpdateInsight(finalRequest);
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
