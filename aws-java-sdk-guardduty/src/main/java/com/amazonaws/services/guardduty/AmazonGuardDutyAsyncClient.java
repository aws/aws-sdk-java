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
package com.amazonaws.services.guardduty;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon GuardDuty asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * Assess, monitor, manage, and remediate security issues across your AWS infrastructure, applications, and data.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonGuardDutyAsyncClient extends AmazonGuardDutyClient implements AmazonGuardDutyAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonGuardDutyAsyncClientBuilder asyncBuilder() {
        return AmazonGuardDutyAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GuardDuty using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonGuardDutyAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest request) {

        return archiveFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(final ArchiveFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ArchiveFindingsRequest, ArchiveFindingsResult> asyncHandler) {
        final ArchiveFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ArchiveFindingsResult>() {
            @Override
            public ArchiveFindingsResult call() throws Exception {
                ArchiveFindingsResult result = null;

                try {
                    result = executeArchiveFindings(finalRequest);
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
    public java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(CreateDetectorRequest request) {

        return createDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(final CreateDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDetectorRequest, CreateDetectorResult> asyncHandler) {
        final CreateDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDetectorResult>() {
            @Override
            public CreateDetectorResult call() throws Exception {
                CreateDetectorResult result = null;

                try {
                    result = executeCreateDetector(finalRequest);
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
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest request) {

        return createFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(final CreateFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler) {
        final CreateFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFilterResult>() {
            @Override
            public CreateFilterResult call() throws Exception {
                CreateFilterResult result = null;

                try {
                    result = executeCreateFilter(finalRequest);
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
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest request) {

        return createIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(final CreateIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler) {
        final CreateIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIPSetResult>() {
            @Override
            public CreateIPSetResult call() throws Exception {
                CreateIPSetResult result = null;

                try {
                    result = executeCreateIPSet(finalRequest);
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
    public java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest request) {

        return createSampleFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(final CreateSampleFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSampleFindingsRequest, CreateSampleFindingsResult> asyncHandler) {
        final CreateSampleFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSampleFindingsResult>() {
            @Override
            public CreateSampleFindingsResult call() throws Exception {
                CreateSampleFindingsResult result = null;

                try {
                    result = executeCreateSampleFindings(finalRequest);
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
    public java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(CreateThreatIntelSetRequest request) {

        return createThreatIntelSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(final CreateThreatIntelSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThreatIntelSetRequest, CreateThreatIntelSetResult> asyncHandler) {
        final CreateThreatIntelSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThreatIntelSetResult>() {
            @Override
            public CreateThreatIntelSetResult call() throws Exception {
                CreateThreatIntelSetResult result = null;

                try {
                    result = executeCreateThreatIntelSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest request) {

        return deleteDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(final DeleteDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDetectorRequest, DeleteDetectorResult> asyncHandler) {
        final DeleteDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDetectorResult>() {
            @Override
            public DeleteDetectorResult call() throws Exception {
                DeleteDetectorResult result = null;

                try {
                    result = executeDeleteDetector(finalRequest);
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
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest request) {

        return deleteFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(final DeleteFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler) {
        final DeleteFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFilterResult>() {
            @Override
            public DeleteFilterResult call() throws Exception {
                DeleteFilterResult result = null;

                try {
                    result = executeDeleteFilter(finalRequest);
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
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest request) {

        return deleteIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(final DeleteIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler) {
        final DeleteIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIPSetResult>() {
            @Override
            public DeleteIPSetResult call() throws Exception {
                DeleteIPSetResult result = null;

                try {
                    result = executeDeleteIPSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(DeleteThreatIntelSetRequest request) {

        return deleteThreatIntelSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(final DeleteThreatIntelSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThreatIntelSetRequest, DeleteThreatIntelSetResult> asyncHandler) {
        final DeleteThreatIntelSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThreatIntelSetResult>() {
            @Override
            public DeleteThreatIntelSetResult call() throws Exception {
                DeleteThreatIntelSetResult result = null;

                try {
                    result = executeDeleteThreatIntelSet(finalRequest);
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
    public java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(GetDetectorRequest request) {

        return getDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(final GetDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDetectorRequest, GetDetectorResult> asyncHandler) {
        final GetDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDetectorResult>() {
            @Override
            public GetDetectorResult call() throws Exception {
                GetDetectorResult result = null;

                try {
                    result = executeGetDetector(finalRequest);
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
    public java.util.concurrent.Future<GetFilterResult> getFilterAsync(GetFilterRequest request) {

        return getFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFilterResult> getFilterAsync(final GetFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFilterRequest, GetFilterResult> asyncHandler) {
        final GetFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFilterResult>() {
            @Override
            public GetFilterResult call() throws Exception {
                GetFilterResult result = null;

                try {
                    result = executeGetFilter(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(GetFindingsStatisticsRequest request) {

        return getFindingsStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(final GetFindingsStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsStatisticsRequest, GetFindingsStatisticsResult> asyncHandler) {
        final GetFindingsStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsStatisticsResult>() {
            @Override
            public GetFindingsStatisticsResult call() throws Exception {
                GetFindingsStatisticsResult result = null;

                try {
                    result = executeGetFindingsStatistics(finalRequest);
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
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest request) {

        return getIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(final GetIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler) {
        final GetIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIPSetResult>() {
            @Override
            public GetIPSetResult call() throws Exception {
                GetIPSetResult result = null;

                try {
                    result = executeGetIPSet(finalRequest);
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
    public java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(GetThreatIntelSetRequest request) {

        return getThreatIntelSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(final GetThreatIntelSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetThreatIntelSetRequest, GetThreatIntelSetResult> asyncHandler) {
        final GetThreatIntelSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetThreatIntelSetResult>() {
            @Override
            public GetThreatIntelSetResult call() throws Exception {
                GetThreatIntelSetResult result = null;

                try {
                    result = executeGetThreatIntelSet(finalRequest);
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
    public java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest request) {

        return listDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(final ListDetectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDetectorsRequest, ListDetectorsResult> asyncHandler) {
        final ListDetectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDetectorsResult>() {
            @Override
            public ListDetectorsResult call() throws Exception {
                ListDetectorsResult result = null;

                try {
                    result = executeListDetectors(finalRequest);
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
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest request) {

        return listFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(final ListFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler) {
        final ListFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFiltersResult>() {
            @Override
            public ListFiltersResult call() throws Exception {
                ListFiltersResult result = null;

                try {
                    result = executeListFilters(finalRequest);
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
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(final ListFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {
        final ListFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsResult>() {
            @Override
            public ListFindingsResult call() throws Exception {
                ListFindingsResult result = null;

                try {
                    result = executeListFindings(finalRequest);
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
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest request) {

        return listIPSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(final ListIPSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler) {
        final ListIPSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIPSetsResult>() {
            @Override
            public ListIPSetsResult call() throws Exception {
                ListIPSetsResult result = null;

                try {
                    result = executeListIPSets(finalRequest);
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
    public java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(ListThreatIntelSetsRequest request) {

        return listThreatIntelSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(final ListThreatIntelSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThreatIntelSetsRequest, ListThreatIntelSetsResult> asyncHandler) {
        final ListThreatIntelSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThreatIntelSetsResult>() {
            @Override
            public ListThreatIntelSetsResult call() throws Exception {
                ListThreatIntelSetsResult result = null;

                try {
                    result = executeListThreatIntelSets(finalRequest);
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
    public java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(StartMonitoringMembersRequest request) {

        return startMonitoringMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(final StartMonitoringMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMonitoringMembersRequest, StartMonitoringMembersResult> asyncHandler) {
        final StartMonitoringMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMonitoringMembersResult>() {
            @Override
            public StartMonitoringMembersResult call() throws Exception {
                StartMonitoringMembersResult result = null;

                try {
                    result = executeStartMonitoringMembers(finalRequest);
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
    public java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(StopMonitoringMembersRequest request) {

        return stopMonitoringMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(final StopMonitoringMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopMonitoringMembersRequest, StopMonitoringMembersResult> asyncHandler) {
        final StopMonitoringMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopMonitoringMembersResult>() {
            @Override
            public StopMonitoringMembersResult call() throws Exception {
                StopMonitoringMembersResult result = null;

                try {
                    result = executeStopMonitoringMembers(finalRequest);
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
    public java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest request) {

        return unarchiveFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(final UnarchiveFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnarchiveFindingsRequest, UnarchiveFindingsResult> asyncHandler) {
        final UnarchiveFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnarchiveFindingsResult>() {
            @Override
            public UnarchiveFindingsResult call() throws Exception {
                UnarchiveFindingsResult result = null;

                try {
                    result = executeUnarchiveFindings(finalRequest);
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
    public java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(UpdateDetectorRequest request) {

        return updateDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(final UpdateDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDetectorRequest, UpdateDetectorResult> asyncHandler) {
        final UpdateDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDetectorResult>() {
            @Override
            public UpdateDetectorResult call() throws Exception {
                UpdateDetectorResult result = null;

                try {
                    result = executeUpdateDetector(finalRequest);
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
    public java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest request) {

        return updateFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(final UpdateFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFilterRequest, UpdateFilterResult> asyncHandler) {
        final UpdateFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFilterResult>() {
            @Override
            public UpdateFilterResult call() throws Exception {
                UpdateFilterResult result = null;

                try {
                    result = executeUpdateFilter(finalRequest);
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
    public java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(UpdateFindingsFeedbackRequest request) {

        return updateFindingsFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(final UpdateFindingsFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFindingsFeedbackRequest, UpdateFindingsFeedbackResult> asyncHandler) {
        final UpdateFindingsFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFindingsFeedbackResult>() {
            @Override
            public UpdateFindingsFeedbackResult call() throws Exception {
                UpdateFindingsFeedbackResult result = null;

                try {
                    result = executeUpdateFindingsFeedback(finalRequest);
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
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest request) {

        return updateIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(final UpdateIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler) {
        final UpdateIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIPSetResult>() {
            @Override
            public UpdateIPSetResult call() throws Exception {
                UpdateIPSetResult result = null;

                try {
                    result = executeUpdateIPSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(UpdateThreatIntelSetRequest request) {

        return updateThreatIntelSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(final UpdateThreatIntelSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThreatIntelSetRequest, UpdateThreatIntelSetResult> asyncHandler) {
        final UpdateThreatIntelSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThreatIntelSetResult>() {
            @Override
            public UpdateThreatIntelSetResult call() throws Exception {
                UpdateThreatIntelSetResult result = null;

                try {
                    result = executeUpdateThreatIntelSet(finalRequest);
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
