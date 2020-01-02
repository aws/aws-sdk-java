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

/**
 * Abstract implementation of {@code AmazonManagedBlockchainAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonManagedBlockchainAsync extends AbstractAmazonManagedBlockchain implements AmazonManagedBlockchainAsync {

    protected AbstractAmazonManagedBlockchainAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest request) {

        return createMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMemberRequest, CreateMemberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest request) {

        return createNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkRequest, CreateNetworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNodeResult> createNodeAsync(CreateNodeRequest request) {

        return createNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNodeResult> createNodeAsync(CreateNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNodeRequest, CreateNodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProposalResult> createProposalAsync(CreateProposalRequest request) {

        return createProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProposalResult> createProposalAsync(CreateProposalRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProposalRequest, CreateProposalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request) {

        return deleteMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeResult> deleteNodeAsync(DeleteNodeRequest request) {

        return deleteNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeResult> deleteNodeAsync(DeleteNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNodeRequest, DeleteNodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request) {

        return getMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest request) {

        return getNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetNetworkRequest, GetNetworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetNodeResult> getNodeAsync(GetNodeRequest request) {

        return getNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNodeResult> getNodeAsync(GetNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetNodeRequest, GetNodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProposalResult> getProposalAsync(GetProposalRequest request) {

        return getProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProposalResult> getProposalAsync(GetProposalRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProposalRequest, GetProposalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request) {

        return listInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest request) {

        return listNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNetworksRequest, ListNetworksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request) {

        return listNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProposalVotesResult> listProposalVotesAsync(ListProposalVotesRequest request) {

        return listProposalVotesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProposalVotesResult> listProposalVotesAsync(ListProposalVotesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProposalVotesRequest, ListProposalVotesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProposalsResult> listProposalsAsync(ListProposalsRequest request) {

        return listProposalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProposalsResult> listProposalsAsync(ListProposalsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProposalsRequest, ListProposalsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest request) {

        return rejectInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectInvitationRequest, RejectInvitationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VoteOnProposalResult> voteOnProposalAsync(VoteOnProposalRequest request) {

        return voteOnProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VoteOnProposalResult> voteOnProposalAsync(VoteOnProposalRequest request,
            com.amazonaws.handlers.AsyncHandler<VoteOnProposalRequest, VoteOnProposalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
