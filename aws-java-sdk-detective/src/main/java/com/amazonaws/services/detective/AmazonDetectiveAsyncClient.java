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
package com.amazonaws.services.detective;

import javax.annotation.Generated;

import com.amazonaws.services.detective.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Detective asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Detective uses machine learning and purpose-built visualizations to help you to analyze and investigate security
 * issues across your Amazon Web Services (Amazon Web Services) workloads. Detective automatically extracts time-based
 * events such as login attempts, API calls, and network traffic from CloudTrail and Amazon Virtual Private Cloud
 * (Amazon VPC) flow logs. It also extracts findings detected by Amazon GuardDuty.
 * </p>
 * <p>
 * The Detective API primarily supports the creation and management of behavior graphs. A behavior graph contains the
 * extracted data from a set of member accounts, and is created and managed by an administrator account.
 * </p>
 * <p>
 * To add a member account to the behavior graph, the administrator account sends an invitation to the account. When the
 * account accepts the invitation, it becomes a member account in the behavior graph.
 * </p>
 * <p>
 * Detective is also integrated with Organizations. The organization management account designates the Detective
 * administrator account for the organization. That account becomes the administrator account for the organization
 * behavior graph. The Detective administrator account is also the delegated administrator account for Detective in
 * Organizations.
 * </p>
 * <p>
 * The Detective administrator account can enable any organization account as a member account in the organization
 * behavior graph. The organization accounts do not receive invitations. The Detective administrator account can also
 * invite other accounts to the organization behavior graph.
 * </p>
 * <p>
 * Every behavior graph is specific to a Region. You can only use the API to manage behavior graphs that belong to the
 * Region that is associated with the currently selected endpoint.
 * </p>
 * <p>
 * The administrator account for a behavior graph can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enable and disable Detective. Enabling Detective creates a new behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * View the list of member accounts in a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Add member accounts to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove member accounts from a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Apply tags to a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The organization management account can use the Detective API to select the delegated administrator for Detective.
 * </p>
 * <p>
 * The Detective administrator account for an organization can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Perform all of the functions of an administrator account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Determine whether to automatically enable new organization accounts as member accounts in the organization behavior
 * graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * An invited member account can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * View the list of behavior graphs that they are invited to.
 * </p>
 * </li>
 * <li>
 * <p>
 * Accept an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Decline an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove their account from a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All API actions are logged as CloudTrail events. See <a
 * href="https://docs.aws.amazon.com/detective/latest/adminguide/logging-using-cloudtrail.html">Logging Detective API
 * Calls with CloudTrail</a>.
 * </p>
 * <note>
 * <p>
 * We replaced the term "master account" with the term "administrator account." An administrator account is used to
 * centrally manage multiple accounts. In the case of Detective, the administrator account manages the accounts in their
 * behavior graph.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDetectiveAsyncClient extends AmazonDetectiveClient implements AmazonDetectiveAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonDetectiveAsyncClientBuilder asyncBuilder() {
        return AmazonDetectiveAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Detective using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDetectiveAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Detective using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonDetectiveAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetGraphMemberDatasourcesResult> batchGetGraphMemberDatasourcesAsync(BatchGetGraphMemberDatasourcesRequest request) {

        return batchGetGraphMemberDatasourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetGraphMemberDatasourcesResult> batchGetGraphMemberDatasourcesAsync(
            final BatchGetGraphMemberDatasourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetGraphMemberDatasourcesRequest, BatchGetGraphMemberDatasourcesResult> asyncHandler) {
        final BatchGetGraphMemberDatasourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetGraphMemberDatasourcesResult>() {
            @Override
            public BatchGetGraphMemberDatasourcesResult call() throws Exception {
                BatchGetGraphMemberDatasourcesResult result = null;

                try {
                    result = executeBatchGetGraphMemberDatasources(finalRequest);
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
    public java.util.concurrent.Future<BatchGetMembershipDatasourcesResult> batchGetMembershipDatasourcesAsync(BatchGetMembershipDatasourcesRequest request) {

        return batchGetMembershipDatasourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetMembershipDatasourcesResult> batchGetMembershipDatasourcesAsync(
            final BatchGetMembershipDatasourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetMembershipDatasourcesRequest, BatchGetMembershipDatasourcesResult> asyncHandler) {
        final BatchGetMembershipDatasourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetMembershipDatasourcesResult>() {
            @Override
            public BatchGetMembershipDatasourcesResult call() throws Exception {
                BatchGetMembershipDatasourcesResult result = null;

                try {
                    result = executeBatchGetMembershipDatasources(finalRequest);
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
    public java.util.concurrent.Future<CreateGraphResult> createGraphAsync(CreateGraphRequest request) {

        return createGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGraphResult> createGraphAsync(final CreateGraphRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGraphRequest, CreateGraphResult> asyncHandler) {
        final CreateGraphRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGraphResult>() {
            @Override
            public CreateGraphResult call() throws Exception {
                CreateGraphResult result = null;

                try {
                    result = executeCreateGraph(finalRequest);
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
    public java.util.concurrent.Future<DeleteGraphResult> deleteGraphAsync(DeleteGraphRequest request) {

        return deleteGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGraphResult> deleteGraphAsync(final DeleteGraphRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGraphRequest, DeleteGraphResult> asyncHandler) {
        final DeleteGraphRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGraphResult>() {
            @Override
            public DeleteGraphResult call() throws Exception {
                DeleteGraphResult result = null;

                try {
                    result = executeDeleteGraph(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest request) {

        return describeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            final DescribeOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler) {
        final DescribeOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConfigurationResult>() {
            @Override
            public DescribeOrganizationConfigurationResult call() throws Exception {
                DescribeOrganizationConfigurationResult result = null;

                try {
                    result = executeDescribeOrganizationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest request) {

        return disableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            final DisableOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler) {
        final DisableOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableOrganizationAdminAccountResult>() {
            @Override
            public DisableOrganizationAdminAccountResult call() throws Exception {
                DisableOrganizationAdminAccountResult result = null;

                try {
                    result = executeDisableOrganizationAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<DisassociateMembershipResult> disassociateMembershipAsync(DisassociateMembershipRequest request) {

        return disassociateMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMembershipResult> disassociateMembershipAsync(final DisassociateMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMembershipRequest, DisassociateMembershipResult> asyncHandler) {
        final DisassociateMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMembershipResult>() {
            @Override
            public DisassociateMembershipResult call() throws Exception {
                DisassociateMembershipResult result = null;

                try {
                    result = executeDisassociateMembership(finalRequest);
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
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request) {

        return enableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            final EnableOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler) {
        final EnableOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableOrganizationAdminAccountResult>() {
            @Override
            public EnableOrganizationAdminAccountResult call() throws Exception {
                EnableOrganizationAdminAccountResult result = null;

                try {
                    result = executeEnableOrganizationAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<ListDatasourcePackagesResult> listDatasourcePackagesAsync(ListDatasourcePackagesRequest request) {

        return listDatasourcePackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasourcePackagesResult> listDatasourcePackagesAsync(final ListDatasourcePackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasourcePackagesRequest, ListDatasourcePackagesResult> asyncHandler) {
        final ListDatasourcePackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasourcePackagesResult>() {
            @Override
            public ListDatasourcePackagesResult call() throws Exception {
                ListDatasourcePackagesResult result = null;

                try {
                    result = executeListDatasourcePackages(finalRequest);
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
    public java.util.concurrent.Future<ListGraphsResult> listGraphsAsync(ListGraphsRequest request) {

        return listGraphsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGraphsResult> listGraphsAsync(final ListGraphsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGraphsRequest, ListGraphsResult> asyncHandler) {
        final ListGraphsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGraphsResult>() {
            @Override
            public ListGraphsResult call() throws Exception {
                ListGraphsResult result = null;

                try {
                    result = executeListGraphs(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request) {

        return listOrganizationAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            final ListOrganizationAdminAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler) {
        final ListOrganizationAdminAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationAdminAccountsResult>() {
            @Override
            public ListOrganizationAdminAccountsResult call() throws Exception {
                ListOrganizationAdminAccountsResult result = null;

                try {
                    result = executeListOrganizationAdminAccounts(finalRequest);
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
    public java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest request) {

        return rejectInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(final RejectInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectInvitationRequest, RejectInvitationResult> asyncHandler) {
        final RejectInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectInvitationResult>() {
            @Override
            public RejectInvitationResult call() throws Exception {
                RejectInvitationResult result = null;

                try {
                    result = executeRejectInvitation(finalRequest);
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
    public java.util.concurrent.Future<StartMonitoringMemberResult> startMonitoringMemberAsync(StartMonitoringMemberRequest request) {

        return startMonitoringMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringMemberResult> startMonitoringMemberAsync(final StartMonitoringMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMonitoringMemberRequest, StartMonitoringMemberResult> asyncHandler) {
        final StartMonitoringMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMonitoringMemberResult>() {
            @Override
            public StartMonitoringMemberResult call() throws Exception {
                StartMonitoringMemberResult result = null;

                try {
                    result = executeStartMonitoringMember(finalRequest);
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
    public java.util.concurrent.Future<UpdateDatasourcePackagesResult> updateDatasourcePackagesAsync(UpdateDatasourcePackagesRequest request) {

        return updateDatasourcePackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasourcePackagesResult> updateDatasourcePackagesAsync(final UpdateDatasourcePackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatasourcePackagesRequest, UpdateDatasourcePackagesResult> asyncHandler) {
        final UpdateDatasourcePackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatasourcePackagesResult>() {
            @Override
            public UpdateDatasourcePackagesResult call() throws Exception {
                UpdateDatasourcePackagesResult result = null;

                try {
                    result = executeUpdateDatasourcePackages(finalRequest);
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
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest request) {

        return updateOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            final UpdateOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler) {
        final UpdateOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOrganizationConfigurationResult>() {
            @Override
            public UpdateOrganizationConfigurationResult call() throws Exception {
                UpdateOrganizationConfigurationResult result = null;

                try {
                    result = executeUpdateOrganizationConfiguration(finalRequest);
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
