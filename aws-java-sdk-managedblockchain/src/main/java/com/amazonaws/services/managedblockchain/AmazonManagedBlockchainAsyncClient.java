/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain;

import javax.annotation.Generated;

import com.amazonaws.services.managedblockchain.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ManagedBlockchain asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 * <p>
 * Amazon Managed Blockchain is a fully managed service for creating and managing blockchain networks using open source
 * frameworks. Blockchain allows you to build applications where multiple parties can securely and transparently run
 * transactions and share data without the need for a trusted, central authority. Currently, Managed Blockchain supports
 * the Hyperledger Fabric open source framework.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonManagedBlockchainAsyncClient extends AmazonManagedBlockchainClient implements AmazonManagedBlockchainAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonManagedBlockchainAsyncClientBuilder asyncBuilder() {
        return AmazonManagedBlockchainAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ManagedBlockchain using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonManagedBlockchainAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest request) {

        return createMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(final CreateMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMemberRequest, CreateMemberResult> asyncHandler) {
        final CreateMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMemberResult>() {
            @Override
            public CreateMemberResult call() throws Exception {
                CreateMemberResult result = null;

                try {
                    result = executeCreateMember(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest request) {

        return createNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(final CreateNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkRequest, CreateNetworkResult> asyncHandler) {
        final CreateNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkResult>() {
            @Override
            public CreateNetworkResult call() throws Exception {
                CreateNetworkResult result = null;

                try {
                    result = executeCreateNetwork(finalRequest);
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
    public java.util.concurrent.Future<CreateNodeResult> createNodeAsync(CreateNodeRequest request) {

        return createNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNodeResult> createNodeAsync(final CreateNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNodeRequest, CreateNodeResult> asyncHandler) {
        final CreateNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNodeResult>() {
            @Override
            public CreateNodeResult call() throws Exception {
                CreateNodeResult result = null;

                try {
                    result = executeCreateNode(finalRequest);
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
    public java.util.concurrent.Future<CreateProposalResult> createProposalAsync(CreateProposalRequest request) {

        return createProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProposalResult> createProposalAsync(final CreateProposalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProposalRequest, CreateProposalResult> asyncHandler) {
        final CreateProposalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProposalResult>() {
            @Override
            public CreateProposalResult call() throws Exception {
                CreateProposalResult result = null;

                try {
                    result = executeCreateProposal(finalRequest);
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
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request) {

        return deleteMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(final DeleteMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler) {
        final DeleteMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMemberResult>() {
            @Override
            public DeleteMemberResult call() throws Exception {
                DeleteMemberResult result = null;

                try {
                    result = executeDeleteMember(finalRequest);
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
    public java.util.concurrent.Future<DeleteNodeResult> deleteNodeAsync(DeleteNodeRequest request) {

        return deleteNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeResult> deleteNodeAsync(final DeleteNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNodeRequest, DeleteNodeResult> asyncHandler) {
        final DeleteNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNodeResult>() {
            @Override
            public DeleteNodeResult call() throws Exception {
                DeleteNodeResult result = null;

                try {
                    result = executeDeleteNode(finalRequest);
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
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request) {

        return getMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(final GetMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler) {
        final GetMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMemberResult>() {
            @Override
            public GetMemberResult call() throws Exception {
                GetMemberResult result = null;

                try {
                    result = executeGetMember(finalRequest);
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
    public java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest request) {

        return getNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(final GetNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkRequest, GetNetworkResult> asyncHandler) {
        final GetNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkResult>() {
            @Override
            public GetNetworkResult call() throws Exception {
                GetNetworkResult result = null;

                try {
                    result = executeGetNetwork(finalRequest);
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
    public java.util.concurrent.Future<GetNodeResult> getNodeAsync(GetNodeRequest request) {

        return getNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNodeResult> getNodeAsync(final GetNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNodeRequest, GetNodeResult> asyncHandler) {
        final GetNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNodeResult>() {
            @Override
            public GetNodeResult call() throws Exception {
                GetNodeResult result = null;

                try {
                    result = executeGetNode(finalRequest);
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
    public java.util.concurrent.Future<GetProposalResult> getProposalAsync(GetProposalRequest request) {

        return getProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProposalResult> getProposalAsync(final GetProposalRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProposalRequest, GetProposalResult> asyncHandler) {
        final GetProposalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProposalResult>() {
            @Override
            public GetProposalResult call() throws Exception {
                GetProposalResult result = null;

                try {
                    result = executeGetProposal(finalRequest);
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
    public java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest request) {

        return listNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(final ListNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNetworksRequest, ListNetworksResult> asyncHandler) {
        final ListNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNetworksResult>() {
            @Override
            public ListNetworksResult call() throws Exception {
                ListNetworksResult result = null;

                try {
                    result = executeListNetworks(finalRequest);
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
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request) {

        return listNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(final ListNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler) {
        final ListNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNodesResult>() {
            @Override
            public ListNodesResult call() throws Exception {
                ListNodesResult result = null;

                try {
                    result = executeListNodes(finalRequest);
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
    public java.util.concurrent.Future<ListProposalVotesResult> listProposalVotesAsync(ListProposalVotesRequest request) {

        return listProposalVotesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProposalVotesResult> listProposalVotesAsync(final ListProposalVotesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProposalVotesRequest, ListProposalVotesResult> asyncHandler) {
        final ListProposalVotesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProposalVotesResult>() {
            @Override
            public ListProposalVotesResult call() throws Exception {
                ListProposalVotesResult result = null;

                try {
                    result = executeListProposalVotes(finalRequest);
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
    public java.util.concurrent.Future<ListProposalsResult> listProposalsAsync(ListProposalsRequest request) {

        return listProposalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProposalsResult> listProposalsAsync(final ListProposalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProposalsRequest, ListProposalsResult> asyncHandler) {
        final ListProposalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProposalsResult>() {
            @Override
            public ListProposalsResult call() throws Exception {
                ListProposalsResult result = null;

                try {
                    result = executeListProposals(finalRequest);
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
    public java.util.concurrent.Future<VoteOnProposalResult> voteOnProposalAsync(VoteOnProposalRequest request) {

        return voteOnProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VoteOnProposalResult> voteOnProposalAsync(final VoteOnProposalRequest request,
            final com.amazonaws.handlers.AsyncHandler<VoteOnProposalRequest, VoteOnProposalResult> asyncHandler) {
        final VoteOnProposalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VoteOnProposalResult>() {
            @Override
            public VoteOnProposalResult call() throws Exception {
                VoteOnProposalResult result = null;

                try {
                    result = executeVoteOnProposal(finalRequest);
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
