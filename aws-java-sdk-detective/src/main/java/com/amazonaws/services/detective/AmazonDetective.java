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
package com.amazonaws.services.detective;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.detective.model.*;

/**
 * Interface for accessing Amazon Detective.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.detective.AbstractAmazonDetective} instead.
 * </p>
 * <p>
 * <important>
 * <p>
 * Amazon Detective is currently in preview. The Detective API can only be used by accounts that are admitted into the
 * preview.
 * </p>
 * </important>
 * <p>
 * Detective uses machine learning and purpose-built visualizations to help you analyze and investigate security issues
 * across your Amazon Web Services (AWS) workloads. Detective automatically extracts time-based events such as login
 * attempts, API calls, and network traffic from AWS CloudTrail and Amazon Virtual Private Cloud (Amazon VPC) flow logs.
 * It also extracts findings detected by Amazon GuardDuty.
 * </p>
 * <p>
 * The Detective API primarily supports the creation and management of behavior graphs. A behavior graph contains the
 * extracted data from a set of member accounts, and is created and managed by a master account.
 * </p>
 * <p>
 * Every behavior graph is specific to a Region. You can only use the API to manage graphs that belong to the Region
 * that is associated with the currently selected endpoint.
 * </p>
 * <p>
 * A Detective master account can use the Detective API to do the following:
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
 * </ul>
 * <p>
 * A member account can use the Detective API to do the following:
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
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDetective {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.detective";

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be
     * called by an invited member account.
     * </p>
     * <p>
     * The request provides the ARN of behavior graph.
     * </p>
     * <p>
     * The member account status in the graph must be <code>INVITED</code>.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Creates a new behavior graph for the calling account, and sets that account as the master account. This operation
     * is called by the account that is enabling Detective.
     * </p>
     * <p>
     * The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN
     * of the new behavior graph.
     * </p>
     * <p>
     * <code>CreateGraph</code> triggers a process to create the corresponding data tables for the new behavior graph.
     * </p>
     * <p>
     * An account can only be the master account for one behavior graph within a Region. If the same account calls
     * <code>CreateGraph</code> with the same master account, it always returns the same behavior graph ARN. It does not
     * create a new behavior graph.
     * </p>
     * 
     * @param createGraphRequest
     * @return Result of the CreateGraph operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @sample AmazonDetective.CreateGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateGraph" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGraphResult createGraph(CreateGraphRequest createGraphRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Sends a request to invite the specified AWS accounts to be member accounts in the behavior graph. This operation
     * can only be called by the master account for a behavior graph.
     * </p>
     * <p>
     * <code>CreateMembers</code> verifies the accounts and then sends invitations to the verified accounts.
     * </p>
     * <p>
     * The request provides the behavior graph ARN and the list of accounts to invite.
     * </p>
     * <p>
     * The response separates the requested accounts into two lists:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was able to start the verification for. This list includes member
     * accounts that are being verified, that have passed verification and are being sent an invitation, and that have
     * failed verification.
     * </p>
     * </li>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was unable to process. This list includes accounts that were already
     * invited to be member accounts in the behavior graph.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ServiceQuotaExceededException
     *         This request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1000 member accounts.
     * @sample AmazonDetective.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Disables the specified behavior graph and queues it to be deleted. This operation removes the graph from each
     * member account's list of behavior graphs.
     * </p>
     * <p>
     * <code>DeleteGraph</code> can only be called by the master account for a behavior graph.
     * </p>
     * 
     * @param deleteGraphRequest
     * @return Result of the DeleteGraph operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DeleteGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteGraph" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGraphResult deleteGraph(DeleteGraphRequest deleteGraphRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Deletes one or more member accounts from the master account behavior graph. This operation can only be called by
     * a Detective master account. That account cannot use <code>DeleteMembers</code> to delete their own account from
     * the behavior graph. To disable a behavior graph, the master account uses the <code>DeleteGraph</code> API method.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Removes the member account from the specified behavior graph. This operation can only be called by a member
     * account that has the <code>ENABLED</code> status.
     * </p>
     * 
     * @param disassociateMembershipRequest
     * @return Result of the DisassociateMembership operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DisassociateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisassociateMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMembershipResult disassociateMembership(DisassociateMembershipRequest disassociateMembershipRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Returns the membership details for specified member accounts for a behavior graph.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Returns the list of behavior graphs that the calling account is a master of. This operation can only be called by
     * a master account.
     * </p>
     * <p>
     * Because an account can currently only be the master of one behavior graph within a Region, the results always
     * contain a single graph.
     * </p>
     * 
     * @param listGraphsRequest
     * @return Result of the ListGraphs operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListGraphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListGraphs" target="_top">AWS API
     *      Documentation</a>
     */
    ListGraphsResult listGraphs(ListGraphsRequest listGraphsRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can
     * only be called by a member account.
     * </p>
     * <p>
     * Open invitations are invitations that the member account has not responded to.
     * </p>
     * <p>
     * The results do not include behavior graphs for which the member account declined the invitation. The results also
     * do not include behavior graphs that the member account resigned from or was removed from.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Retrieves the list of member accounts for a behavior graph. Does not return member accounts that were removed
     * from the behavior graph.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Amazon Detective is currently in preview.
     * </p>
     * <p>
     * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by a
     * member account that has the <code>INVITED</code> status.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return Result of the RejectInvitation operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/RejectInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    RejectInvitationResult rejectInvitation(RejectInvitationRequest rejectInvitationRequest);

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
