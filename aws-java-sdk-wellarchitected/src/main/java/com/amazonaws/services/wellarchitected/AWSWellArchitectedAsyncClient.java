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
package com.amazonaws.services.wellarchitected;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Well-Architected asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Well-Architected Tool</fullname>
 * <p>
 * This is the <i>AWS Well-Architected Tool API Reference</i>. The AWS Well-Architected Tool API provides programmatic
 * access to the <a href="http://aws.amazon.com/well-architected-tool">AWS Well-Architected Tool</a> in the <a
 * href="https://console.aws.amazon.com/wellarchitected">AWS Management Console</a>. For information about the AWS
 * Well-Architected Tool, see the <a href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html">AWS
 * Well-Architected Tool User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWellArchitectedAsyncClient extends AWSWellArchitectedClient implements AWSWellArchitectedAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSWellArchitectedAsyncClientBuilder asyncBuilder() {
        return AWSWellArchitectedAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Well-Architected using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSWellArchitectedAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Well-Architected using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSWellArchitectedAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateLensesResult> associateLensesAsync(AssociateLensesRequest request) {

        return associateLensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLensesResult> associateLensesAsync(final AssociateLensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLensesRequest, AssociateLensesResult> asyncHandler) {
        final AssociateLensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLensesResult>() {
            @Override
            public AssociateLensesResult call() throws Exception {
                AssociateLensesResult result = null;

                try {
                    result = executeAssociateLenses(finalRequest);
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
    public java.util.concurrent.Future<CreateMilestoneResult> createMilestoneAsync(CreateMilestoneRequest request) {

        return createMilestoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMilestoneResult> createMilestoneAsync(final CreateMilestoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMilestoneRequest, CreateMilestoneResult> asyncHandler) {
        final CreateMilestoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMilestoneResult>() {
            @Override
            public CreateMilestoneResult call() throws Exception {
                CreateMilestoneResult result = null;

                try {
                    result = executeCreateMilestone(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkloadResult> createWorkloadAsync(CreateWorkloadRequest request) {

        return createWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadResult> createWorkloadAsync(final CreateWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkloadRequest, CreateWorkloadResult> asyncHandler) {
        final CreateWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkloadResult>() {
            @Override
            public CreateWorkloadResult call() throws Exception {
                CreateWorkloadResult result = null;

                try {
                    result = executeCreateWorkload(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkloadShareResult> createWorkloadShareAsync(CreateWorkloadShareRequest request) {

        return createWorkloadShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadShareResult> createWorkloadShareAsync(final CreateWorkloadShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkloadShareRequest, CreateWorkloadShareResult> asyncHandler) {
        final CreateWorkloadShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkloadShareResult>() {
            @Override
            public CreateWorkloadShareResult call() throws Exception {
                CreateWorkloadShareResult result = null;

                try {
                    result = executeCreateWorkloadShare(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkloadResult> deleteWorkloadAsync(DeleteWorkloadRequest request) {

        return deleteWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkloadResult> deleteWorkloadAsync(final DeleteWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkloadRequest, DeleteWorkloadResult> asyncHandler) {
        final DeleteWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkloadResult>() {
            @Override
            public DeleteWorkloadResult call() throws Exception {
                DeleteWorkloadResult result = null;

                try {
                    result = executeDeleteWorkload(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkloadShareResult> deleteWorkloadShareAsync(DeleteWorkloadShareRequest request) {

        return deleteWorkloadShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkloadShareResult> deleteWorkloadShareAsync(final DeleteWorkloadShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkloadShareRequest, DeleteWorkloadShareResult> asyncHandler) {
        final DeleteWorkloadShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkloadShareResult>() {
            @Override
            public DeleteWorkloadShareResult call() throws Exception {
                DeleteWorkloadShareResult result = null;

                try {
                    result = executeDeleteWorkloadShare(finalRequest);
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
    public java.util.concurrent.Future<DisassociateLensesResult> disassociateLensesAsync(DisassociateLensesRequest request) {

        return disassociateLensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLensesResult> disassociateLensesAsync(final DisassociateLensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLensesRequest, DisassociateLensesResult> asyncHandler) {
        final DisassociateLensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLensesResult>() {
            @Override
            public DisassociateLensesResult call() throws Exception {
                DisassociateLensesResult result = null;

                try {
                    result = executeDisassociateLenses(finalRequest);
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
    public java.util.concurrent.Future<GetAnswerResult> getAnswerAsync(GetAnswerRequest request) {

        return getAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnswerResult> getAnswerAsync(final GetAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnswerRequest, GetAnswerResult> asyncHandler) {
        final GetAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnswerResult>() {
            @Override
            public GetAnswerResult call() throws Exception {
                GetAnswerResult result = null;

                try {
                    result = executeGetAnswer(finalRequest);
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
    public java.util.concurrent.Future<GetLensReviewResult> getLensReviewAsync(GetLensReviewRequest request) {

        return getLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensReviewResult> getLensReviewAsync(final GetLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensReviewRequest, GetLensReviewResult> asyncHandler) {
        final GetLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensReviewResult>() {
            @Override
            public GetLensReviewResult call() throws Exception {
                GetLensReviewResult result = null;

                try {
                    result = executeGetLensReview(finalRequest);
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
    public java.util.concurrent.Future<GetLensReviewReportResult> getLensReviewReportAsync(GetLensReviewReportRequest request) {

        return getLensReviewReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensReviewReportResult> getLensReviewReportAsync(final GetLensReviewReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensReviewReportRequest, GetLensReviewReportResult> asyncHandler) {
        final GetLensReviewReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensReviewReportResult>() {
            @Override
            public GetLensReviewReportResult call() throws Exception {
                GetLensReviewReportResult result = null;

                try {
                    result = executeGetLensReviewReport(finalRequest);
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
    public java.util.concurrent.Future<GetLensVersionDifferenceResult> getLensVersionDifferenceAsync(GetLensVersionDifferenceRequest request) {

        return getLensVersionDifferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensVersionDifferenceResult> getLensVersionDifferenceAsync(final GetLensVersionDifferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensVersionDifferenceRequest, GetLensVersionDifferenceResult> asyncHandler) {
        final GetLensVersionDifferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensVersionDifferenceResult>() {
            @Override
            public GetLensVersionDifferenceResult call() throws Exception {
                GetLensVersionDifferenceResult result = null;

                try {
                    result = executeGetLensVersionDifference(finalRequest);
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
    public java.util.concurrent.Future<GetMilestoneResult> getMilestoneAsync(GetMilestoneRequest request) {

        return getMilestoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMilestoneResult> getMilestoneAsync(final GetMilestoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMilestoneRequest, GetMilestoneResult> asyncHandler) {
        final GetMilestoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMilestoneResult>() {
            @Override
            public GetMilestoneResult call() throws Exception {
                GetMilestoneResult result = null;

                try {
                    result = executeGetMilestone(finalRequest);
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
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest request) {

        return getWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(final GetWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkloadRequest, GetWorkloadResult> asyncHandler) {
        final GetWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkloadResult>() {
            @Override
            public GetWorkloadResult call() throws Exception {
                GetWorkloadResult result = null;

                try {
                    result = executeGetWorkload(finalRequest);
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
    public java.util.concurrent.Future<ListAnswersResult> listAnswersAsync(ListAnswersRequest request) {

        return listAnswersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnswersResult> listAnswersAsync(final ListAnswersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnswersRequest, ListAnswersResult> asyncHandler) {
        final ListAnswersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnswersResult>() {
            @Override
            public ListAnswersResult call() throws Exception {
                ListAnswersResult result = null;

                try {
                    result = executeListAnswers(finalRequest);
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
    public java.util.concurrent.Future<ListLensReviewImprovementsResult> listLensReviewImprovementsAsync(ListLensReviewImprovementsRequest request) {

        return listLensReviewImprovementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensReviewImprovementsResult> listLensReviewImprovementsAsync(final ListLensReviewImprovementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensReviewImprovementsRequest, ListLensReviewImprovementsResult> asyncHandler) {
        final ListLensReviewImprovementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensReviewImprovementsResult>() {
            @Override
            public ListLensReviewImprovementsResult call() throws Exception {
                ListLensReviewImprovementsResult result = null;

                try {
                    result = executeListLensReviewImprovements(finalRequest);
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
    public java.util.concurrent.Future<ListLensReviewsResult> listLensReviewsAsync(ListLensReviewsRequest request) {

        return listLensReviewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensReviewsResult> listLensReviewsAsync(final ListLensReviewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensReviewsRequest, ListLensReviewsResult> asyncHandler) {
        final ListLensReviewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensReviewsResult>() {
            @Override
            public ListLensReviewsResult call() throws Exception {
                ListLensReviewsResult result = null;

                try {
                    result = executeListLensReviews(finalRequest);
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
    public java.util.concurrent.Future<ListLensesResult> listLensesAsync(ListLensesRequest request) {

        return listLensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensesResult> listLensesAsync(final ListLensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensesRequest, ListLensesResult> asyncHandler) {
        final ListLensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensesResult>() {
            @Override
            public ListLensesResult call() throws Exception {
                ListLensesResult result = null;

                try {
                    result = executeListLenses(finalRequest);
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
    public java.util.concurrent.Future<ListMilestonesResult> listMilestonesAsync(ListMilestonesRequest request) {

        return listMilestonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMilestonesResult> listMilestonesAsync(final ListMilestonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMilestonesRequest, ListMilestonesResult> asyncHandler) {
        final ListMilestonesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMilestonesResult>() {
            @Override
            public ListMilestonesResult call() throws Exception {
                ListMilestonesResult result = null;

                try {
                    result = executeListMilestones(finalRequest);
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
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest request) {

        return listNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(final ListNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler) {
        final ListNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotificationsResult>() {
            @Override
            public ListNotificationsResult call() throws Exception {
                ListNotificationsResult result = null;

                try {
                    result = executeListNotifications(finalRequest);
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
    public java.util.concurrent.Future<ListShareInvitationsResult> listShareInvitationsAsync(ListShareInvitationsRequest request) {

        return listShareInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListShareInvitationsResult> listShareInvitationsAsync(final ListShareInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListShareInvitationsRequest, ListShareInvitationsResult> asyncHandler) {
        final ListShareInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListShareInvitationsResult>() {
            @Override
            public ListShareInvitationsResult call() throws Exception {
                ListShareInvitationsResult result = null;

                try {
                    result = executeListShareInvitations(finalRequest);
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
    public java.util.concurrent.Future<ListWorkloadSharesResult> listWorkloadSharesAsync(ListWorkloadSharesRequest request) {

        return listWorkloadSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadSharesResult> listWorkloadSharesAsync(final ListWorkloadSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkloadSharesRequest, ListWorkloadSharesResult> asyncHandler) {
        final ListWorkloadSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkloadSharesResult>() {
            @Override
            public ListWorkloadSharesResult call() throws Exception {
                ListWorkloadSharesResult result = null;

                try {
                    result = executeListWorkloadShares(finalRequest);
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
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest request) {

        return listWorkloadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(final ListWorkloadsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkloadsRequest, ListWorkloadsResult> asyncHandler) {
        final ListWorkloadsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkloadsResult>() {
            @Override
            public ListWorkloadsResult call() throws Exception {
                ListWorkloadsResult result = null;

                try {
                    result = executeListWorkloads(finalRequest);
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
    public java.util.concurrent.Future<UpdateAnswerResult> updateAnswerAsync(UpdateAnswerRequest request) {

        return updateAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnswerResult> updateAnswerAsync(final UpdateAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnswerRequest, UpdateAnswerResult> asyncHandler) {
        final UpdateAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnswerResult>() {
            @Override
            public UpdateAnswerResult call() throws Exception {
                UpdateAnswerResult result = null;

                try {
                    result = executeUpdateAnswer(finalRequest);
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
    public java.util.concurrent.Future<UpdateLensReviewResult> updateLensReviewAsync(UpdateLensReviewRequest request) {

        return updateLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLensReviewResult> updateLensReviewAsync(final UpdateLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLensReviewRequest, UpdateLensReviewResult> asyncHandler) {
        final UpdateLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLensReviewResult>() {
            @Override
            public UpdateLensReviewResult call() throws Exception {
                UpdateLensReviewResult result = null;

                try {
                    result = executeUpdateLensReview(finalRequest);
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
    public java.util.concurrent.Future<UpdateShareInvitationResult> updateShareInvitationAsync(UpdateShareInvitationRequest request) {

        return updateShareInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateShareInvitationResult> updateShareInvitationAsync(final UpdateShareInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateShareInvitationRequest, UpdateShareInvitationResult> asyncHandler) {
        final UpdateShareInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateShareInvitationResult>() {
            @Override
            public UpdateShareInvitationResult call() throws Exception {
                UpdateShareInvitationResult result = null;

                try {
                    result = executeUpdateShareInvitation(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkloadResult> updateWorkloadAsync(UpdateWorkloadRequest request) {

        return updateWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadResult> updateWorkloadAsync(final UpdateWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkloadRequest, UpdateWorkloadResult> asyncHandler) {
        final UpdateWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkloadResult>() {
            @Override
            public UpdateWorkloadResult call() throws Exception {
                UpdateWorkloadResult result = null;

                try {
                    result = executeUpdateWorkload(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkloadShareResult> updateWorkloadShareAsync(UpdateWorkloadShareRequest request) {

        return updateWorkloadShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadShareResult> updateWorkloadShareAsync(final UpdateWorkloadShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkloadShareRequest, UpdateWorkloadShareResult> asyncHandler) {
        final UpdateWorkloadShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkloadShareResult>() {
            @Override
            public UpdateWorkloadShareResult call() throws Exception {
                UpdateWorkloadShareResult result = null;

                try {
                    result = executeUpdateWorkloadShare(finalRequest);
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
    public java.util.concurrent.Future<UpgradeLensReviewResult> upgradeLensReviewAsync(UpgradeLensReviewRequest request) {

        return upgradeLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeLensReviewResult> upgradeLensReviewAsync(final UpgradeLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeLensReviewRequest, UpgradeLensReviewResult> asyncHandler) {
        final UpgradeLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeLensReviewResult>() {
            @Override
            public UpgradeLensReviewResult call() throws Exception {
                UpgradeLensReviewResult result = null;

                try {
                    result = executeUpgradeLensReview(finalRequest);
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
