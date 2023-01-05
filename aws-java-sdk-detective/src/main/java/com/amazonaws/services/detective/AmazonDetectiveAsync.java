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

/**
 * Interface for accessing Amazon Detective asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.detective.AbstractAmazonDetectiveAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDetectiveAsync extends AmazonDetective {

    /**
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
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonDetectiveAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

    /**
     * <p>
     * Gets data source package information for the behavior graph.
     * </p>
     * 
     * @param batchGetGraphMemberDatasourcesRequest
     * @return A Java Future containing the result of the BatchGetGraphMemberDatasources operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.BatchGetGraphMemberDatasources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetGraphMemberDatasources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetGraphMemberDatasourcesResult> batchGetGraphMemberDatasourcesAsync(
            BatchGetGraphMemberDatasourcesRequest batchGetGraphMemberDatasourcesRequest);

    /**
     * <p>
     * Gets data source package information for the behavior graph.
     * </p>
     * 
     * @param batchGetGraphMemberDatasourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetGraphMemberDatasources operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.BatchGetGraphMemberDatasources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetGraphMemberDatasources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetGraphMemberDatasourcesResult> batchGetGraphMemberDatasourcesAsync(
            BatchGetGraphMemberDatasourcesRequest batchGetGraphMemberDatasourcesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetGraphMemberDatasourcesRequest, BatchGetGraphMemberDatasourcesResult> asyncHandler);

    /**
     * <p>
     * Gets information on the data source package history for an account.
     * </p>
     * 
     * @param batchGetMembershipDatasourcesRequest
     * @return A Java Future containing the result of the BatchGetMembershipDatasources operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.BatchGetMembershipDatasources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetMembershipDatasources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetMembershipDatasourcesResult> batchGetMembershipDatasourcesAsync(
            BatchGetMembershipDatasourcesRequest batchGetMembershipDatasourcesRequest);

    /**
     * <p>
     * Gets information on the data source package history for an account.
     * </p>
     * 
     * @param batchGetMembershipDatasourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetMembershipDatasources operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.BatchGetMembershipDatasources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetMembershipDatasources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetMembershipDatasourcesResult> batchGetMembershipDatasourcesAsync(
            BatchGetMembershipDatasourcesRequest batchGetMembershipDatasourcesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetMembershipDatasourcesRequest, BatchGetMembershipDatasourcesResult> asyncHandler);

    /**
     * <p>
     * Creates a new behavior graph for the calling account, and sets that account as the administrator account. This
     * operation is called by the account that is enabling Detective.
     * </p>
     * <p>
     * Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at
     * least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty
     * prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within
     * the Detective quota. If it exceeds the quota, then you cannot enable Detective.
     * </p>
     * <p>
     * The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN
     * of the new behavior graph.
     * </p>
     * <p>
     * <code>CreateGraph</code> triggers a process to create the corresponding data tables for the new behavior graph.
     * </p>
     * <p>
     * An account can only be the administrator account for one behavior graph within a Region. If the same account
     * calls <code>CreateGraph</code> with the same administrator account, it always returns the same behavior graph
     * ARN. It does not create a new behavior graph.
     * </p>
     * 
     * @param createGraphRequest
     * @return A Java Future containing the result of the CreateGraph operation returned by the service.
     * @sample AmazonDetectiveAsync.CreateGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGraphResult> createGraphAsync(CreateGraphRequest createGraphRequest);

    /**
     * <p>
     * Creates a new behavior graph for the calling account, and sets that account as the administrator account. This
     * operation is called by the account that is enabling Detective.
     * </p>
     * <p>
     * Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at
     * least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty
     * prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within
     * the Detective quota. If it exceeds the quota, then you cannot enable Detective.
     * </p>
     * <p>
     * The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN
     * of the new behavior graph.
     * </p>
     * <p>
     * <code>CreateGraph</code> triggers a process to create the corresponding data tables for the new behavior graph.
     * </p>
     * <p>
     * An account can only be the administrator account for one behavior graph within a Region. If the same account
     * calls <code>CreateGraph</code> with the same administrator account, it always returns the same behavior graph
     * ARN. It does not create a new behavior graph.
     * </p>
     * 
     * @param createGraphRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGraph operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.CreateGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGraphResult> createGraphAsync(CreateGraphRequest createGraphRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGraphRequest, CreateGraphResult> asyncHandler);

    /**
     * <p>
     * <code>CreateMembers</code> is used to send invitations to accounts. For the organization behavior graph, the
     * Detective administrator account uses <code>CreateMembers</code> to enable organization accounts as member
     * accounts.
     * </p>
     * <p>
     * For invited accounts, <code>CreateMembers</code> sends a request to invite the specified Amazon Web Services
     * accounts to be member accounts in the behavior graph. This operation can only be called by the administrator
     * account for a behavior graph.
     * </p>
     * <p>
     * <code>CreateMembers</code> verifies the accounts and then invites the verified accounts. The administrator can
     * optionally specify to not send invitation emails to the member accounts. This would be used when the
     * administrator manages their member accounts centrally.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, <code>CreateMembers</code> attempts to enable the
     * accounts. The organization accounts do not receive invitations.
     * </p>
     * <p>
     * The request provides the behavior graph ARN and the list of accounts to invite or to enable.
     * </p>
     * <p>
     * The response separates the requested accounts into two lists:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was able to process. For invited accounts, includes member accounts
     * that are being verified, that have passed verification and are to be invited, and that have failed verification.
     * For organization accounts in the organization behavior graph, includes accounts that can be enabled and that
     * cannot be enabled.
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
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonDetectiveAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * <code>CreateMembers</code> is used to send invitations to accounts. For the organization behavior graph, the
     * Detective administrator account uses <code>CreateMembers</code> to enable organization accounts as member
     * accounts.
     * </p>
     * <p>
     * For invited accounts, <code>CreateMembers</code> sends a request to invite the specified Amazon Web Services
     * accounts to be member accounts in the behavior graph. This operation can only be called by the administrator
     * account for a behavior graph.
     * </p>
     * <p>
     * <code>CreateMembers</code> verifies the accounts and then invites the verified accounts. The administrator can
     * optionally specify to not send invitation emails to the member accounts. This would be used when the
     * administrator manages their member accounts centrally.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, <code>CreateMembers</code> attempts to enable the
     * accounts. The organization accounts do not receive invitations.
     * </p>
     * <p>
     * The request provides the behavior graph ARN and the list of accounts to invite or to enable.
     * </p>
     * <p>
     * The response separates the requested accounts into two lists:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was able to process. For invited accounts, includes member accounts
     * that are being verified, that have passed verification and are to be invited, and that have failed verification.
     * For organization accounts in the organization behavior graph, includes accounts that can be enabled and that
     * cannot be enabled.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler);

    /**
     * <p>
     * Disables the specified behavior graph and queues it to be deleted. This operation removes the behavior graph from
     * each member account's list of behavior graphs.
     * </p>
     * <p>
     * <code>DeleteGraph</code> can only be called by the administrator account for a behavior graph.
     * </p>
     * 
     * @param deleteGraphRequest
     * @return A Java Future containing the result of the DeleteGraph operation returned by the service.
     * @sample AmazonDetectiveAsync.DeleteGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGraphResult> deleteGraphAsync(DeleteGraphRequest deleteGraphRequest);

    /**
     * <p>
     * Disables the specified behavior graph and queues it to be deleted. This operation removes the behavior graph from
     * each member account's list of behavior graphs.
     * </p>
     * <p>
     * <code>DeleteGraph</code> can only be called by the administrator account for a behavior graph.
     * </p>
     * 
     * @param deleteGraphRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGraph operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.DeleteGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGraphResult> deleteGraphAsync(DeleteGraphRequest deleteGraphRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGraphRequest, DeleteGraphResult> asyncHandler);

    /**
     * <p>
     * Removes the specified member accounts from the behavior graph. The removed accounts no longer contribute data to
     * the behavior graph. This operation can only be called by the administrator account for the behavior graph.
     * </p>
     * <p>
     * For invited accounts, the removed accounts are deleted from the list of accounts in the behavior graph. To
     * restore the account, the administrator account must send another invitation.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, the Detective administrator account can always
     * enable the organization account again. Organization accounts that are not enabled as member accounts are not
     * included in the <code>ListMembers</code> results for the organization behavior graph.
     * </p>
     * <p>
     * An administrator account cannot use <code>DeleteMembers</code> to remove their own account from the behavior
     * graph. To disable a behavior graph, the administrator account uses the <code>DeleteGraph</code> API method.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonDetectiveAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Removes the specified member accounts from the behavior graph. The removed accounts no longer contribute data to
     * the behavior graph. This operation can only be called by the administrator account for the behavior graph.
     * </p>
     * <p>
     * For invited accounts, the removed accounts are deleted from the list of accounts in the behavior graph. To
     * restore the account, the administrator account must send another invitation.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, the Detective administrator account can always
     * enable the organization account again. Organization accounts that are not enabled as member accounts are not
     * included in the <code>ListMembers</code> results for the organization behavior graph.
     * </p>
     * <p>
     * An administrator account cannot use <code>DeleteMembers</code> to remove their own account from the behavior
     * graph. To disable a behavior graph, the administrator account uses the <code>DeleteGraph</code> API method.
     * </p>
     * 
     * @param deleteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler);

    /**
     * <p>
     * Returns information about the configuration for the organization behavior graph. Currently indicates whether to
     * automatically enable new organization accounts as member accounts.
     * </p>
     * <p>
     * Can only be called by the Detective administrator account for the organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Returns information about the configuration for the organization behavior graph. Currently indicates whether to
     * automatically enable new organization accounts as member accounts.
     * </p>
     * <p>
     * Can only be called by the Detective administrator account for the organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Removes the Detective administrator account in the current Region. Deletes the organization behavior graph.
     * </p>
     * <p>
     * Can only be called by the organization management account.
     * </p>
     * <p>
     * Removing the Detective administrator account does not affect the delegated administrator account for Detective in
     * Organizations.
     * </p>
     * <p>
     * To remove the delegated administrator account in Organizations, use the Organizations API. Removing the delegated
     * administrator account also removes the Detective administrator account in all Regions, except for Regions where
     * the Detective administrator account is the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Removes the Detective administrator account in the current Region. Deletes the organization behavior graph.
     * </p>
     * <p>
     * Can only be called by the organization management account.
     * </p>
     * <p>
     * Removing the Detective administrator account does not affect the delegated administrator account for Detective in
     * Organizations.
     * </p>
     * <p>
     * To remove the delegated administrator account in Organizations, use the Organizations API. Removing the delegated
     * administrator account also removes the Detective administrator account in all Regions, except for Regions where
     * the Detective administrator account is the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Removes the member account from the specified behavior graph. This operation can only be called by an invited
     * member account that has the <code>ENABLED</code> status.
     * </p>
     * <p>
     * <code>DisassociateMembership</code> cannot be called by an organization account in the organization behavior
     * graph. For the organization behavior graph, the Detective administrator account determines which organization
     * accounts to enable or disable as member accounts.
     * </p>
     * 
     * @param disassociateMembershipRequest
     * @return A Java Future containing the result of the DisassociateMembership operation returned by the service.
     * @sample AmazonDetectiveAsync.DisassociateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisassociateMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembershipResult> disassociateMembershipAsync(DisassociateMembershipRequest disassociateMembershipRequest);

    /**
     * <p>
     * Removes the member account from the specified behavior graph. This operation can only be called by an invited
     * member account that has the <code>ENABLED</code> status.
     * </p>
     * <p>
     * <code>DisassociateMembership</code> cannot be called by an organization account in the organization behavior
     * graph. For the organization behavior graph, the Detective administrator account determines which organization
     * accounts to enable or disable as member accounts.
     * </p>
     * 
     * @param disassociateMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMembership operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.DisassociateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisassociateMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembershipResult> disassociateMembershipAsync(DisassociateMembershipRequest disassociateMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembershipRequest, DisassociateMembershipResult> asyncHandler);

    /**
     * <p>
     * Designates the Detective administrator account for the organization in the current Region.
     * </p>
     * <p>
     * If the account does not have Detective enabled, then enables Detective for that account and creates a new
     * behavior graph.
     * </p>
     * <p>
     * Can only be called by the organization management account.
     * </p>
     * <p>
     * If the organization has a delegated administrator account in Organizations, then the Detective administrator
     * account must be either the delegated administrator account or the organization management account.
     * </p>
     * <p>
     * If the organization does not have a delegated administrator account in Organizations, then you can choose any
     * account in the organization. If you choose an account other than the organization management account, Detective
     * calls Organizations to make that account the delegated administrator account for Detective. The organization
     * management account cannot be the delegated administrator account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Designates the Detective administrator account for the organization in the current Region.
     * </p>
     * <p>
     * If the account does not have Detective enabled, then enables Detective for that account and creates a new
     * behavior graph.
     * </p>
     * <p>
     * Can only be called by the organization management account.
     * </p>
     * <p>
     * If the organization has a delegated administrator account in Organizations, then the Detective administrator
     * account must be either the delegated administrator account or the organization management account.
     * </p>
     * <p>
     * If the organization does not have a delegated administrator account in Organizations, then you can choose any
     * account in the organization. If you choose an account other than the organization management account, Detective
     * calls Organizations to make that account the delegated administrator account for Detective. The organization
     * management account cannot be the delegated administrator account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Returns the membership details for specified member accounts for a behavior graph.
     * </p>
     * 
     * @param getMembersRequest
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonDetectiveAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Returns the membership details for specified member accounts for a behavior graph.
     * </p>
     * 
     * @param getMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler);

    /**
     * <p>
     * Lists data source packages in the behavior graph.
     * </p>
     * 
     * @param listDatasourcePackagesRequest
     * @return A Java Future containing the result of the ListDatasourcePackages operation returned by the service.
     * @sample AmazonDetectiveAsync.ListDatasourcePackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListDatasourcePackages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasourcePackagesResult> listDatasourcePackagesAsync(ListDatasourcePackagesRequest listDatasourcePackagesRequest);

    /**
     * <p>
     * Lists data source packages in the behavior graph.
     * </p>
     * 
     * @param listDatasourcePackagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasourcePackages operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.ListDatasourcePackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListDatasourcePackages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasourcePackagesResult> listDatasourcePackagesAsync(ListDatasourcePackagesRequest listDatasourcePackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasourcePackagesRequest, ListDatasourcePackagesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of behavior graphs that the calling account is an administrator account of. This operation can
     * only be called by an administrator account.
     * </p>
     * <p>
     * Because an account can currently only be the administrator of one behavior graph within a Region, the results
     * always contain a single behavior graph.
     * </p>
     * 
     * @param listGraphsRequest
     * @return A Java Future containing the result of the ListGraphs operation returned by the service.
     * @sample AmazonDetectiveAsync.ListGraphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListGraphs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGraphsResult> listGraphsAsync(ListGraphsRequest listGraphsRequest);

    /**
     * <p>
     * Returns the list of behavior graphs that the calling account is an administrator account of. This operation can
     * only be called by an administrator account.
     * </p>
     * <p>
     * Because an account can currently only be the administrator of one behavior graph within a Region, the results
     * always contain a single behavior graph.
     * </p>
     * 
     * @param listGraphsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGraphs operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.ListGraphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListGraphs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGraphsResult> listGraphsAsync(ListGraphsRequest listGraphsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGraphsRequest, ListGraphsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can
     * only be called by an invited member account.
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
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonDetectiveAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can
     * only be called by an invited member account.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of member accounts for a behavior graph.
     * </p>
     * <p>
     * For invited accounts, the results do not include member accounts that were removed from the behavior graph.
     * </p>
     * <p>
     * For the organization behavior graph, the results do not include organization accounts that the Detective
     * administrator account has not enabled as member accounts.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonDetectiveAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Retrieves the list of member accounts for a behavior graph.
     * </p>
     * <p>
     * For invited accounts, the results do not include member accounts that were removed from the behavior graph.
     * </p>
     * <p>
     * For the organization behavior graph, the results do not include organization accounts that the Detective
     * administrator account has not enabled as member accounts.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Returns information about the Detective administrator account for an organization. Can only be called by the
     * organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Returns information about the Detective administrator account for an organization. Can only be called by the
     * organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns the tag values that are assigned to a behavior graph.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDetectiveAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the tag values that are assigned to a behavior graph.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by an
     * invited member account that has the <code>INVITED</code> status.
     * </p>
     * <p>
     * <code>RejectInvitation</code> cannot be called by an organization account in the organization behavior graph. In
     * the organization behavior graph, organization accounts do not receive an invitation.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return A Java Future containing the result of the RejectInvitation operation returned by the service.
     * @sample AmazonDetectiveAsync.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/RejectInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest rejectInvitationRequest);

    /**
     * <p>
     * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by an
     * invited member account that has the <code>INVITED</code> status.
     * </p>
     * <p>
     * <code>RejectInvitation</code> cannot be called by an organization account in the organization behavior graph. In
     * the organization behavior graph, organization accounts do not receive an invitation.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectInvitation operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/RejectInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest rejectInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<RejectInvitationRequest, RejectInvitationResult> asyncHandler);

    /**
     * <p>
     * Sends a request to enable data ingest for a member account that has a status of
     * <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * <p>
     * For valid member accounts, the status is updated as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Detective enabled the member account, then the new status is <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Detective cannot enable the member account, the status remains <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMonitoringMemberRequest
     * @return A Java Future containing the result of the StartMonitoringMember operation returned by the service.
     * @sample AmazonDetectiveAsync.StartMonitoringMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartMonitoringMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMemberResult> startMonitoringMemberAsync(StartMonitoringMemberRequest startMonitoringMemberRequest);

    /**
     * <p>
     * Sends a request to enable data ingest for a member account that has a status of
     * <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * <p>
     * For valid member accounts, the status is updated as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Detective enabled the member account, then the new status is <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Detective cannot enable the member account, the status remains <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMonitoringMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMonitoringMember operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.StartMonitoringMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartMonitoringMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMemberResult> startMonitoringMemberAsync(StartMonitoringMemberRequest startMonitoringMemberRequest,
            com.amazonaws.handlers.AsyncHandler<StartMonitoringMemberRequest, StartMonitoringMemberResult> asyncHandler);

    /**
     * <p>
     * Applies tag values to a behavior graph.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDetectiveAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies tag values to a behavior graph.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a behavior graph.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDetectiveAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a behavior graph.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a data source packages for the behavior graph.
     * </p>
     * 
     * @param updateDatasourcePackagesRequest
     * @return A Java Future containing the result of the UpdateDatasourcePackages operation returned by the service.
     * @sample AmazonDetectiveAsync.UpdateDatasourcePackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateDatasourcePackages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasourcePackagesResult> updateDatasourcePackagesAsync(UpdateDatasourcePackagesRequest updateDatasourcePackagesRequest);

    /**
     * <p>
     * Starts a data source packages for the behavior graph.
     * </p>
     * 
     * @param updateDatasourcePackagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatasourcePackages operation returned by the service.
     * @sample AmazonDetectiveAsyncHandler.UpdateDatasourcePackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateDatasourcePackages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasourcePackagesResult> updateDatasourcePackagesAsync(UpdateDatasourcePackagesRequest updateDatasourcePackagesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasourcePackagesRequest, UpdateDatasourcePackagesResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for the Organizations integration in the current Region. Can only be called by the
     * Detective administrator account for the organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonDetectiveAsync.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates the configuration for the Organizations integration in the current Region. Can only be called by the
     * Detective administrator account for the organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonDetectiveAsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

}
