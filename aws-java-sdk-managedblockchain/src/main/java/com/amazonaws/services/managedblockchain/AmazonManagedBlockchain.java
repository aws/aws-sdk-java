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
package com.amazonaws.services.managedblockchain;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.managedblockchain.model.*;

/**
 * Interface for accessing ManagedBlockchain.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedblockchain.AbstractAmazonManagedBlockchain} instead.
 * </p>
 * <p>
 * <p/>
 * <p>
 * Amazon Managed Blockchain is a fully managed service for creating and managing blockchain networks using open-source
 * frameworks. Blockchain allows you to build applications where multiple parties can securely and transparently run
 * transactions and share data without the need for a trusted, central authority.
 * </p>
 * <p>
 * Managed Blockchain supports the Hyperledger Fabric and Ethereum open-source frameworks. Because of fundamental
 * differences between the frameworks, some API actions or data types may only apply in the context of one framework and
 * not the other. For example, actions related to Hyperledger Fabric network members such as <code>CreateMember</code>
 * and <code>DeleteMember</code> do not apply to Ethereum.
 * </p>
 * <p>
 * The description for each action indicates the framework or frameworks to which it applies. Data types and properties
 * that apply only in the context of a particular framework are similarly indicated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonManagedBlockchain {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "managedblockchain";

    /**
     * <p>
     * Creates a member within a Managed Blockchain network.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param createMemberRequest
     * @return Result of the CreateMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceAlreadyExistsException
     *         A resource request is issued for a resource that already exists.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws TooManyTagsException
     * @sample AmazonManagedBlockchain.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateMember" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMemberResult createMember(CreateMemberRequest createMemberRequest);

    /**
     * <p>
     * Creates a new blockchain network using Amazon Managed Blockchain.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param createNetworkRequest
     * @return Result of the CreateNetwork operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceAlreadyExistsException
     *         A resource request is issued for a resource that already exists.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws TooManyTagsException
     * @sample AmazonManagedBlockchain.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNetworkResult createNetwork(CreateNetworkRequest createNetworkRequest);

    /**
     * <p>
     * Creates a node on the specified blockchain network.
     * </p>
     * <p>
     * Applies to Hyperledger Fabric and Ethereum.
     * </p>
     * 
     * @param createNodeRequest
     * @return Result of the CreateNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceAlreadyExistsException
     *         A resource request is issued for a resource that already exists.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws TooManyTagsException
     * @sample AmazonManagedBlockchain.CreateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNode" target="_top">AWS
     *      API Documentation</a>
     */
    CreateNodeResult createNode(CreateNodeRequest createNodeRequest);

    /**
     * <p>
     * Creates a proposal for a change to the network that other members of the network can vote on, for example, a
     * proposal to add a new member to the network. Any member can create a proposal.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param createProposalRequest
     * @return Result of the CreateProposal operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws TooManyTagsException
     * @sample AmazonManagedBlockchain.CreateProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateProposal"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProposalResult createProposal(CreateProposalRequest createProposalRequest);

    /**
     * <p>
     * Deletes a member. Deleting a member removes the member and all associated resources from the network.
     * <code>DeleteMember</code> can only be called for a specified <code>MemberId</code> if the principal performing
     * the action is associated with the AWS account that owns the member. In all other cases, the
     * <code>DeleteMember</code> action is carried out as the result of an approved proposal to remove a member. If
     * <code>MemberId</code> is the last member in a network specified by the last AWS account, the network is deleted
     * also.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return Result of the DeleteMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteMember" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMemberResult deleteMember(DeleteMemberRequest deleteMemberRequest);

    /**
     * <p>
     * Deletes a node that your AWS account owns. All data on the node is lost and cannot be recovered.
     * </p>
     * <p>
     * Applies to Hyperledger Fabric and Ethereum.
     * </p>
     * 
     * @param deleteNodeRequest
     * @return Result of the DeleteNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.DeleteNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteNode" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteNodeResult deleteNode(DeleteNodeRequest deleteNodeRequest);

    /**
     * <p>
     * Returns detailed information about a member.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param getMemberRequest
     * @return Result of the GetMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetMember" target="_top">AWS
     *      API Documentation</a>
     */
    GetMemberResult getMember(GetMemberRequest getMemberRequest);

    /**
     * <p>
     * Returns detailed information about a network.
     * </p>
     * <p>
     * Applies to Hyperledger Fabric and Ethereum.
     * </p>
     * 
     * @param getNetworkRequest
     * @return Result of the GetNetwork operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    GetNetworkResult getNetwork(GetNetworkRequest getNetworkRequest);

    /**
     * <p>
     * Returns detailed information about a node.
     * </p>
     * <p>
     * Applies to Hyperledger Fabric and Ethereum.
     * </p>
     * 
     * @param getNodeRequest
     * @return Result of the GetNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNode" target="_top">AWS API
     *      Documentation</a>
     */
    GetNodeResult getNode(GetNodeRequest getNodeRequest);

    /**
     * <p>
     * Returns detailed information about a proposal.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param getProposalRequest
     * @return Result of the GetProposal operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetProposal" target="_top">AWS
     *      API Documentation</a>
     */
    GetProposalResult getProposal(GetProposalRequest getProposalRequest);

    /**
     * <p>
     * Returns a list of all invitations for the current AWS account.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Returns a list of the members in a network and properties of their configurations.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListMembers" target="_top">AWS
     *      API Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Returns information about the networks in which the current AWS account participates.
     * </p>
     * <p>
     * Applies to Hyperledger Fabric and Ethereum.
     * </p>
     * 
     * @param listNetworksRequest
     * @return Result of the ListNetworks operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    ListNetworksResult listNetworks(ListNetworksRequest listNetworksRequest);

    /**
     * <p>
     * Returns information about the nodes within a network.
     * </p>
     * <p>
     * Applies to Hyperledger Fabric and Ethereum.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNodes" target="_top">AWS
     *      API Documentation</a>
     */
    ListNodesResult listNodes(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns the list of votes for a specified proposal, including the value of each vote and the unique identifier of
     * the member that cast the vote.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param listProposalVotesRequest
     * @return Result of the ListProposalVotes operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListProposalVotes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposalVotes"
     *      target="_top">AWS API Documentation</a>
     */
    ListProposalVotesResult listProposalVotes(ListProposalVotesRequest listProposalVotesRequest);

    /**
     * <p>
     * Returns a list of proposals for the network.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param listProposalsRequest
     * @return Result of the ListProposals operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListProposals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposals"
     *      target="_top">AWS API Documentation</a>
     */
    ListProposalsResult listProposals(ListProposalsRequest listProposalsRequest);

    /**
     * <p>
     * Returns a list of tags for the specified resource. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @sample AmazonManagedBlockchain.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has
     * received an invitation to create a member and join a network.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return Result of the RejectInvitation operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws IllegalActionException
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/RejectInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    RejectInvitationResult rejectInvitation(RejectInvitationRequest rejectInvitationRequest);

    /**
     * <p>
     * Adds or overwrites the specified tags for the specified Amazon Managed Blockchain resource. Each tag consists of
     * a key and optional value.
     * </p>
     * <p>
     * When you specify a tag key that already exists, the tag value is overwritten with the new value. Use
     * <code>UntagResource</code> to remove tag keys.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and
     * returns an error.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws TooManyTagsException
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @sample AmazonManagedBlockchain.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the Amazon Managed Blockchain resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @sample AmazonManagedBlockchain.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a member configuration with new parameters.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param updateMemberRequest
     * @return Result of the UpdateMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.UpdateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/UpdateMember" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMemberResult updateMember(UpdateMemberRequest updateMemberRequest);

    /**
     * <p>
     * Updates a node configuration with new parameters.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param updateNodeRequest
     * @return Result of the UpdateNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.UpdateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/UpdateNode" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateNodeResult updateNode(UpdateNodeRequest updateNodeRequest);

    /**
     * <p>
     * Casts a vote for a specified <code>ProposalId</code> on behalf of a member. The member to vote as, specified by
     * <code>VoterMemberId</code>, must be in the same AWS account as the principal that calls the action.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param voteOnProposalRequest
     * @return Result of the VoteOnProposal operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws IllegalActionException
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.VoteOnProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VoteOnProposal"
     *      target="_top">AWS API Documentation</a>
     */
    VoteOnProposalResult voteOnProposal(VoteOnProposalRequest voteOnProposalRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
