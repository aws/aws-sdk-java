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
 * Interface for accessing ManagedBlockchain asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedblockchain.AbstractAmazonManagedBlockchainAsync} instead.
 * </p>
 * <p>
 * <p/>
 * <p>
 * Amazon Managed Blockchain is a fully managed service for creating and managing blockchain networks using open source
 * frameworks. Blockchain allows you to build applications where multiple parties can securely and transparently run
 * transactions and share data without the need for a trusted, central authority. Currently, Managed Blockchain supports
 * the Hyperledger Fabric open source framework.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonManagedBlockchainAsync extends AmazonManagedBlockchain {

    /**
     * <p>
     * Creates a member within a Managed Blockchain network.
     * </p>
     * 
     * @param createMemberRequest
     * @return A Java Future containing the result of the CreateMember operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest createMemberRequest);

    /**
     * <p>
     * Creates a member within a Managed Blockchain network.
     * </p>
     * 
     * @param createMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMember operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest createMemberRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMemberRequest, CreateMemberResult> asyncHandler);

    /**
     * <p>
     * Creates a new blockchain network using Amazon Managed Blockchain.
     * </p>
     * 
     * @param createNetworkRequest
     * @return A Java Future containing the result of the CreateNetwork operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest createNetworkRequest);

    /**
     * <p>
     * Creates a new blockchain network using Amazon Managed Blockchain.
     * </p>
     * 
     * @param createNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetwork operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest createNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkRequest, CreateNetworkResult> asyncHandler);

    /**
     * <p>
     * Creates a peer node in a member.
     * </p>
     * 
     * @param createNodeRequest
     * @return A Java Future containing the result of the CreateNode operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.CreateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateNodeResult> createNodeAsync(CreateNodeRequest createNodeRequest);

    /**
     * <p>
     * Creates a peer node in a member.
     * </p>
     * 
     * @param createNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNode operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.CreateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateNodeResult> createNodeAsync(CreateNodeRequest createNodeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNodeRequest, CreateNodeResult> asyncHandler);

    /**
     * <p>
     * Creates a proposal for a change to the network that other members of the network can vote on, for example, a
     * proposal to add a new member to the network. Any member can create a proposal.
     * </p>
     * 
     * @param createProposalRequest
     * @return A Java Future containing the result of the CreateProposal operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.CreateProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProposalResult> createProposalAsync(CreateProposalRequest createProposalRequest);

    /**
     * <p>
     * Creates a proposal for a change to the network that other members of the network can vote on, for example, a
     * proposal to add a new member to the network. Any member can create a proposal.
     * </p>
     * 
     * @param createProposalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProposal operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.CreateProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProposalResult> createProposalAsync(CreateProposalRequest createProposalRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProposalRequest, CreateProposalResult> asyncHandler);

    /**
     * <p>
     * Deletes a member. Deleting a member removes the member and all associated resources from the network.
     * <code>DeleteMember</code> can only be called for a specified <code>MemberId</code> if the principal performing
     * the action is associated with the AWS account that owns the member. In all other cases, the
     * <code>DeleteMember</code> action is carried out as the result of an approved proposal to remove a member. If
     * <code>MemberId</code> is the last member in a network specified by the last AWS account, the network is deleted
     * also.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return A Java Future containing the result of the DeleteMember operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest deleteMemberRequest);

    /**
     * <p>
     * Deletes a member. Deleting a member removes the member and all associated resources from the network.
     * <code>DeleteMember</code> can only be called for a specified <code>MemberId</code> if the principal performing
     * the action is associated with the AWS account that owns the member. In all other cases, the
     * <code>DeleteMember</code> action is carried out as the result of an approved proposal to remove a member. If
     * <code>MemberId</code> is the last member in a network specified by the last AWS account, the network is deleted
     * also.
     * </p>
     * 
     * @param deleteMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMember operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest deleteMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler);

    /**
     * <p>
     * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be
     * recovered.
     * </p>
     * 
     * @param deleteNodeRequest
     * @return A Java Future containing the result of the DeleteNode operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.DeleteNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNodeResult> deleteNodeAsync(DeleteNodeRequest deleteNodeRequest);

    /**
     * <p>
     * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be
     * recovered.
     * </p>
     * 
     * @param deleteNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNode operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.DeleteNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNodeResult> deleteNodeAsync(DeleteNodeRequest deleteNodeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNodeRequest, DeleteNodeResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about a member.
     * </p>
     * 
     * @param getMemberRequest
     * @return A Java Future containing the result of the GetMember operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest getMemberRequest);

    /**
     * <p>
     * Returns detailed information about a member.
     * </p>
     * 
     * @param getMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMember operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest getMemberRequest,
            com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about a network.
     * </p>
     * 
     * @param getNetworkRequest
     * @return A Java Future containing the result of the GetNetwork operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest getNetworkRequest);

    /**
     * <p>
     * Returns detailed information about a network.
     * </p>
     * 
     * @param getNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetwork operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest getNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkRequest, GetNetworkResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about a peer node.
     * </p>
     * 
     * @param getNodeRequest
     * @return A Java Future containing the result of the GetNode operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.GetNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNodeResult> getNodeAsync(GetNodeRequest getNodeRequest);

    /**
     * <p>
     * Returns detailed information about a peer node.
     * </p>
     * 
     * @param getNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNode operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.GetNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNodeResult> getNodeAsync(GetNodeRequest getNodeRequest,
            com.amazonaws.handlers.AsyncHandler<GetNodeRequest, GetNodeResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about a proposal.
     * </p>
     * 
     * @param getProposalRequest
     * @return A Java Future containing the result of the GetProposal operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.GetProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetProposal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProposalResult> getProposalAsync(GetProposalRequest getProposalRequest);

    /**
     * <p>
     * Returns detailed information about a proposal.
     * </p>
     * 
     * @param getProposalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProposal operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.GetProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetProposal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProposalResult> getProposalAsync(GetProposalRequest getProposalRequest,
            com.amazonaws.handlers.AsyncHandler<GetProposalRequest, GetProposalResult> asyncHandler);

    /**
     * <p>
     * Returns a listing of all invitations made on the specified network.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Returns a listing of all invitations made on the specified network.
     * </p>
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Returns a listing of the members in a network and properties of their configurations.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Returns a listing of the members in a network and properties of their configurations.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Returns information about the networks in which the current AWS account has members.
     * </p>
     * 
     * @param listNetworksRequest
     * @return A Java Future containing the result of the ListNetworks operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest listNetworksRequest);

    /**
     * <p>
     * Returns information about the networks in which the current AWS account has members.
     * </p>
     * 
     * @param listNetworksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworks operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest listNetworksRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworksRequest, ListNetworksResult> asyncHandler);

    /**
     * <p>
     * Returns information about the nodes within a network.
     * </p>
     * 
     * @param listNodesRequest
     * @return A Java Future containing the result of the ListNodes operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns information about the nodes within a network.
     * </p>
     * 
     * @param listNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNodes operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest listNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler);

    /**
     * <p>
     * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier
     * of the member that cast the vote.
     * </p>
     * 
     * @param listProposalVotesRequest
     * @return A Java Future containing the result of the ListProposalVotes operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.ListProposalVotes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposalVotes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProposalVotesResult> listProposalVotesAsync(ListProposalVotesRequest listProposalVotesRequest);

    /**
     * <p>
     * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier
     * of the member that cast the vote.
     * </p>
     * 
     * @param listProposalVotesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProposalVotes operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.ListProposalVotes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposalVotes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProposalVotesResult> listProposalVotesAsync(ListProposalVotesRequest listProposalVotesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProposalVotesRequest, ListProposalVotesResult> asyncHandler);

    /**
     * <p>
     * Returns a listing of proposals for the network.
     * </p>
     * 
     * @param listProposalsRequest
     * @return A Java Future containing the result of the ListProposals operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.ListProposals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposals"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProposalsResult> listProposalsAsync(ListProposalsRequest listProposalsRequest);

    /**
     * <p>
     * Returns a listing of proposals for the network.
     * </p>
     * 
     * @param listProposalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProposals operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.ListProposals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposals"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProposalsResult> listProposalsAsync(ListProposalsRequest listProposalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProposalsRequest, ListProposalsResult> asyncHandler);

    /**
     * <p>
     * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has
     * received an invitation to create a member and join a network.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return A Java Future containing the result of the RejectInvitation operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/RejectInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest rejectInvitationRequest);

    /**
     * <p>
     * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has
     * received an invitation to create a member and join a network.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectInvitation operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/RejectInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest rejectInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<RejectInvitationRequest, RejectInvitationResult> asyncHandler);

    /**
     * <p>
     * Casts a vote for a specified <code>ProposalId</code> on behalf of a member. The member to vote as, specified by
     * <code>VoterMemberId</code>, must be in the same AWS account as the principal that calls the action.
     * </p>
     * 
     * @param voteOnProposalRequest
     * @return A Java Future containing the result of the VoteOnProposal operation returned by the service.
     * @sample AmazonManagedBlockchainAsync.VoteOnProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VoteOnProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VoteOnProposalResult> voteOnProposalAsync(VoteOnProposalRequest voteOnProposalRequest);

    /**
     * <p>
     * Casts a vote for a specified <code>ProposalId</code> on behalf of a member. The member to vote as, specified by
     * <code>VoterMemberId</code>, must be in the same AWS account as the principal that calls the action.
     * </p>
     * 
     * @param voteOnProposalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VoteOnProposal operation returned by the service.
     * @sample AmazonManagedBlockchainAsyncHandler.VoteOnProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VoteOnProposal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VoteOnProposalResult> voteOnProposalAsync(VoteOnProposalRequest voteOnProposalRequest,
            com.amazonaws.handlers.AsyncHandler<VoteOnProposalRequest, VoteOnProposalResult> asyncHandler);

}
