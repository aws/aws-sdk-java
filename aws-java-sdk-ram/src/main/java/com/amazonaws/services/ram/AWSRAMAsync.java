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
package com.amazonaws.services.ram;

import javax.annotation.Generated;

import com.amazonaws.services.ram.model.*;

/**
 * Interface for accessing RAM asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ram.AbstractAWSRAMAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Resource Access Manager API Reference</i>. This documentation provides descriptions and syntax for
 * each of the actions and data types in RAM. RAM is a service that helps you securely share your Amazon Web Services
 * resources across Amazon Web Services accounts. If you have multiple Amazon Web Services accounts, you can use RAM to
 * share those resources with other accounts. If you use Organizations to manage your accounts, then you share your
 * resources with your organization or organizational units (OUs). For supported resource types, you can also share
 * resources with individual Identity and Access Management (IAM) roles an users.
 * </p>
 * <p>
 * To learn more about RAM, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/ram">Resource Access Manager product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ram/latest/userguide/">Resource Access Manager User Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRAMAsync extends AWSRAM {

    /**
     * <p>
     * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the
     * invitation, the resources included in the resource share are available to interact with in the relevant Amazon
     * Web Services Management Consoles and tools.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return A Java Future containing the result of the AcceptResourceShareInvitation operation returned by the
     *         service.
     * @sample AWSRAMAsync.AcceptResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AcceptResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptResourceShareInvitationResult> acceptResourceShareInvitationAsync(
            AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest);

    /**
     * <p>
     * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the
     * invitation, the resources included in the resource share are available to interact with in the relevant Amazon
     * Web Services Management Consoles and tools.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptResourceShareInvitation operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.AcceptResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AcceptResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptResourceShareInvitationResult> acceptResourceShareInvitationAsync(
            AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResult> asyncHandler);

    /**
     * <p>
     * Adds the specified list of principals and list of resources to a resource share. Principals that already have
     * access to this resource share immediately receive access to the added resources. Newly added principals
     * immediately receive access to the resources shared in this resource share.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return A Java Future containing the result of the AssociateResourceShare operation returned by the service.
     * @sample AWSRAMAsync.AssociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceShareResult> associateResourceShareAsync(AssociateResourceShareRequest associateResourceShareRequest);

    /**
     * <p>
     * Adds the specified list of principals and list of resources to a resource share. Principals that already have
     * access to this resource share immediately receive access to the added resources. Newly added principals
     * immediately receive access to the resources shared in this resource share.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResourceShare operation returned by the service.
     * @sample AWSRAMAsyncHandler.AssociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceShareResult> associateResourceShareAsync(AssociateResourceShareRequest associateResourceShareRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceShareRequest, AssociateResourceShareResult> asyncHandler);

    /**
     * <p>
     * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one
     * permission associated with each resource type in the resource share. You can add a new RAM permission only if
     * there are currently no resources of that resource type currently in the resource share.
     * </p>
     * 
     * @param associateResourceSharePermissionRequest
     * @return A Java Future containing the result of the AssociateResourceSharePermission operation returned by the
     *         service.
     * @sample AWSRAMAsync.AssociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceSharePermissionResult> associateResourceSharePermissionAsync(
            AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest);

    /**
     * <p>
     * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one
     * permission associated with each resource type in the resource share. You can add a new RAM permission only if
     * there are currently no resources of that resource type currently in the resource share.
     * </p>
     * 
     * @param associateResourceSharePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResourceSharePermission operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.AssociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceSharePermissionResult> associateResourceSharePermissionAsync(
            AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResult> asyncHandler);

    /**
     * <p>
     * Creates a resource share. You can provide a list of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> for the resources that you want to share, a list of principals you want to share the resources with,
     * and the permissions to grant those principals.
     * </p>
     * <note>
     * <p>
     * Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that
     * created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account
     * that created it.
     * </p>
     * </note>
     * 
     * @param createResourceShareRequest
     * @return A Java Future containing the result of the CreateResourceShare operation returned by the service.
     * @sample AWSRAMAsync.CreateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceShareResult> createResourceShareAsync(CreateResourceShareRequest createResourceShareRequest);

    /**
     * <p>
     * Creates a resource share. You can provide a list of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> for the resources that you want to share, a list of principals you want to share the resources with,
     * and the permissions to grant those principals.
     * </p>
     * <note>
     * <p>
     * Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that
     * created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account
     * that created it.
     * </p>
     * </note>
     * 
     * @param createResourceShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceShare operation returned by the service.
     * @sample AWSRAMAsyncHandler.CreateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceShareResult> createResourceShareAsync(CreateResourceShareRequest createResourceShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceShareRequest, CreateResourceShareResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource share. This doesn't delete any of the resources that were associated with the
     * resource share; it only stops the sharing of those resources outside of the Amazon Web Services account that
     * created them.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @return A Java Future containing the result of the DeleteResourceShare operation returned by the service.
     * @sample AWSRAMAsync.DeleteResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeleteResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceShareResult> deleteResourceShareAsync(DeleteResourceShareRequest deleteResourceShareRequest);

    /**
     * <p>
     * Deletes the specified resource share. This doesn't delete any of the resources that were associated with the
     * resource share; it only stops the sharing of those resources outside of the Amazon Web Services account that
     * created them.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceShare operation returned by the service.
     * @sample AWSRAMAsyncHandler.DeleteResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeleteResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceShareResult> deleteResourceShareAsync(DeleteResourceShareRequest deleteResourceShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceShareRequest, DeleteResourceShareResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified principals or resources from the specified resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return A Java Future containing the result of the DisassociateResourceShare operation returned by the service.
     * @sample AWSRAMAsync.DisassociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceShare" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceShareResult> disassociateResourceShareAsync(
            DisassociateResourceShareRequest disassociateResourceShareRequest);

    /**
     * <p>
     * Disassociates the specified principals or resources from the specified resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResourceShare operation returned by the service.
     * @sample AWSRAMAsyncHandler.DisassociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceShare" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceShareResult> disassociateResourceShareAsync(
            DisassociateResourceShareRequest disassociateResourceShareRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceShareRequest, DisassociateResourceShareResult> asyncHandler);

    /**
     * <p>
     * Disassociates an RAM permission from a resource share. Permission changes take effect immediately. You can remove
     * a RAM permission from a resource share only if there are currently no resources of the relevant resource type
     * currently attached to the resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @return A Java Future containing the result of the DisassociateResourceSharePermission operation returned by the
     *         service.
     * @sample AWSRAMAsync.DisassociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceSharePermissionResult> disassociateResourceSharePermissionAsync(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest);

    /**
     * <p>
     * Disassociates an RAM permission from a resource share. Permission changes take effect immediately. You can remove
     * a RAM permission from a resource share only if there are currently no resources of the relevant resource type
     * currently attached to the resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResourceSharePermission operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.DisassociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceSharePermissionResult> disassociateResourceSharePermissionAsync(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResult> asyncHandler);

    /**
     * <p>
     * Enables resource sharing within your organization in Organizations. Calling this operation enables RAM to
     * retrieve information about the organization and its structure. This lets you share resources with all of the
     * accounts in an organization by specifying the organization's ID, or all of the accounts in an organizational unit
     * (OU) by specifying the OU's ID. Until you enable sharing within the organization, you can specify only individual
     * Amazon Web Services accounts, or for supported resource types, IAM users and roles.
     * </p>
     * <p>
     * You must call this operation from an IAM user or role in the organization's management account.
     * </p>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return A Java Future containing the result of the EnableSharingWithAwsOrganization operation returned by the
     *         service.
     * @sample AWSRAMAsync.EnableSharingWithAwsOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/EnableSharingWithAwsOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableSharingWithAwsOrganizationResult> enableSharingWithAwsOrganizationAsync(
            EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest);

    /**
     * <p>
     * Enables resource sharing within your organization in Organizations. Calling this operation enables RAM to
     * retrieve information about the organization and its structure. This lets you share resources with all of the
     * accounts in an organization by specifying the organization's ID, or all of the accounts in an organizational unit
     * (OU) by specifying the OU's ID. Until you enable sharing within the organization, you can specify only individual
     * Amazon Web Services accounts, or for supported resource types, IAM users and roles.
     * </p>
     * <p>
     * You must call this operation from an IAM user or role in the organization's management account.
     * </p>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSharingWithAwsOrganization operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.EnableSharingWithAwsOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/EnableSharingWithAwsOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableSharingWithAwsOrganizationResult> enableSharingWithAwsOrganizationAsync(
            EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSharingWithAwsOrganizationRequest, EnableSharingWithAwsOrganizationResult> asyncHandler);

    /**
     * <p>
     * Gets the contents of an RAM permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @return A Java Future containing the result of the GetPermission operation returned by the service.
     * @sample AWSRAMAsync.GetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionResult> getPermissionAsync(GetPermissionRequest getPermissionRequest);

    /**
     * <p>
     * Gets the contents of an RAM permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPermission operation returned by the service.
     * @sample AWSRAMAsyncHandler.GetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionResult> getPermissionAsync(GetPermissionRequest getPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPermissionRequest, GetPermissionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource policies for the specified resources that you own and have shared.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return A Java Future containing the result of the GetResourcePolicies operation returned by the service.
     * @sample AWSRAMAsync.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest getResourcePoliciesRequest);

    /**
     * <p>
     * Retrieves the resource policies for the specified resources that you own and have shared.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicies operation returned by the service.
     * @sample AWSRAMAsyncHandler.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest getResourcePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePoliciesRequest, GetResourcePoliciesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource and principal associations for resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return A Java Future containing the result of the GetResourceShareAssociations operation returned by the
     *         service.
     * @sample AWSRAMAsync.GetResourceShareAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceShareAssociationsResult> getResourceShareAssociationsAsync(
            GetResourceShareAssociationsRequest getResourceShareAssociationsRequest);

    /**
     * <p>
     * Retrieves the resource and principal associations for resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceShareAssociations operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.GetResourceShareAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceShareAssociationsResult> getResourceShareAssociationsAsync(
            GetResourceShareAssociationsRequest getResourceShareAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceShareAssociationsRequest, GetResourceShareAssociationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about invitations that you have received for resource shares.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return A Java Future containing the result of the GetResourceShareInvitations operation returned by the service.
     * @sample AWSRAMAsync.GetResourceShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceShareInvitationsResult> getResourceShareInvitationsAsync(
            GetResourceShareInvitationsRequest getResourceShareInvitationsRequest);

    /**
     * <p>
     * Retrieves details about invitations that you have received for resource shares.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceShareInvitations operation returned by the service.
     * @sample AWSRAMAsyncHandler.GetResourceShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceShareInvitationsResult> getResourceShareInvitationsAsync(
            GetResourceShareInvitationsRequest getResourceShareInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceShareInvitationsRequest, GetResourceShareInvitationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about the resource shares that you own or that are shared with you.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return A Java Future containing the result of the GetResourceShares operation returned by the service.
     * @sample AWSRAMAsync.GetResourceShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSharesResult> getResourceSharesAsync(GetResourceSharesRequest getResourceSharesRequest);

    /**
     * <p>
     * Retrieves details about the resource shares that you own or that are shared with you.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceShares operation returned by the service.
     * @sample AWSRAMAsyncHandler.GetResourceShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSharesResult> getResourceSharesAsync(GetResourceSharesRequest getResourceSharesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceSharesRequest, GetResourceSharesResult> asyncHandler);

    /**
     * <p>
     * Lists the resources in a resource share that is shared with you but for which the invitation is still
     * <code>PENDING</code>. That means that you haven't accepted or rejected the invitation and the invitation hasn't
     * expired.
     * </p>
     * 
     * @param listPendingInvitationResourcesRequest
     * @return A Java Future containing the result of the ListPendingInvitationResources operation returned by the
     *         service.
     * @sample AWSRAMAsync.ListPendingInvitationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPendingInvitationResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPendingInvitationResourcesResult> listPendingInvitationResourcesAsync(
            ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest);

    /**
     * <p>
     * Lists the resources in a resource share that is shared with you but for which the invitation is still
     * <code>PENDING</code>. That means that you haven't accepted or rejected the invitation and the invitation hasn't
     * expired.
     * </p>
     * 
     * @param listPendingInvitationResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPendingInvitationResources operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.ListPendingInvitationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPendingInvitationResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPendingInvitationResourcesResult> listPendingInvitationResourcesAsync(
            ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPendingInvitationResourcesRequest, ListPendingInvitationResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the available versions of the specified RAM permission.
     * </p>
     * 
     * @param listPermissionVersionsRequest
     * @return A Java Future containing the result of the ListPermissionVersions operation returned by the service.
     * @sample AWSRAMAsync.ListPermissionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionVersionsResult> listPermissionVersionsAsync(ListPermissionVersionsRequest listPermissionVersionsRequest);

    /**
     * <p>
     * Lists the available versions of the specified RAM permission.
     * </p>
     * 
     * @param listPermissionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionVersions operation returned by the service.
     * @sample AWSRAMAsyncHandler.ListPermissionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionVersionsResult> listPermissionVersionsAsync(ListPermissionVersionsRequest listPermissionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionVersionsRequest, ListPermissionVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of available RAM permissions that you can use for the supported resource types.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSRAMAsync.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Retrieves a list of available RAM permissions that you can use for the supported resource types.
     * </p>
     * 
     * @param listPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSRAMAsyncHandler.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists the principals that you are sharing resources with or that are sharing resources with you.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return A Java Future containing the result of the ListPrincipals operation returned by the service.
     * @sample AWSRAMAsync.ListPrincipals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPrincipalsResult> listPrincipalsAsync(ListPrincipalsRequest listPrincipalsRequest);

    /**
     * <p>
     * Lists the principals that you are sharing resources with or that are sharing resources with you.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrincipals operation returned by the service.
     * @sample AWSRAMAsyncHandler.ListPrincipals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPrincipalsResult> listPrincipalsAsync(ListPrincipalsRequest listPrincipalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalsRequest, ListPrincipalsResult> asyncHandler);

    /**
     * <p>
     * Lists the RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @return A Java Future containing the result of the ListResourceSharePermissions operation returned by the
     *         service.
     * @sample AWSRAMAsync.ListResourceSharePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceSharePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSharePermissionsResult> listResourceSharePermissionsAsync(
            ListResourceSharePermissionsRequest listResourceSharePermissionsRequest);

    /**
     * <p>
     * Lists the RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceSharePermissions operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.ListResourceSharePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceSharePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSharePermissionsResult> listResourceSharePermissionsAsync(
            ListResourceSharePermissionsRequest listResourceSharePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists the resource types that can be shared by RAM.
     * </p>
     * 
     * @param listResourceTypesRequest
     * @return A Java Future containing the result of the ListResourceTypes operation returned by the service.
     * @sample AWSRAMAsync.ListResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceTypesResult> listResourceTypesAsync(ListResourceTypesRequest listResourceTypesRequest);

    /**
     * <p>
     * Lists the resource types that can be shared by RAM.
     * </p>
     * 
     * @param listResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceTypes operation returned by the service.
     * @sample AWSRAMAsyncHandler.ListResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceTypesResult> listResourceTypesAsync(ListResourceTypesRequest listResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceTypesRequest, ListResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Lists the resources that you added to a resource share or the resources that are shared with you.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSRAMAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Lists the resources that you added to a resource share or the resources that are shared with you.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSRAMAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * When you attach a resource-based permission policy to a resource, it automatically creates a resource share.
     * However, resource shares created this way are visible only to the resource share owner, and the resource share
     * can't be modified in RAM.
     * </p>
     * <p>
     * You can use this operation to promote the resource share to a full RAM resource share. When you promote a
     * resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you
     * shared it with.
     * </p>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @return A Java Future containing the result of the PromoteResourceShareCreatedFromPolicy operation returned by
     *         the service.
     * @sample AWSRAMAsync.PromoteResourceShareCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromoteResourceShareCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PromoteResourceShareCreatedFromPolicyResult> promoteResourceShareCreatedFromPolicyAsync(
            PromoteResourceShareCreatedFromPolicyRequest promoteResourceShareCreatedFromPolicyRequest);

    /**
     * <p>
     * When you attach a resource-based permission policy to a resource, it automatically creates a resource share.
     * However, resource shares created this way are visible only to the resource share owner, and the resource share
     * can't be modified in RAM.
     * </p>
     * <p>
     * You can use this operation to promote the resource share to a full RAM resource share. When you promote a
     * resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you
     * shared it with.
     * </p>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PromoteResourceShareCreatedFromPolicy operation returned by
     *         the service.
     * @sample AWSRAMAsyncHandler.PromoteResourceShareCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromoteResourceShareCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PromoteResourceShareCreatedFromPolicyResult> promoteResourceShareCreatedFromPolicyAsync(
            PromoteResourceShareCreatedFromPolicyRequest promoteResourceShareCreatedFromPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PromoteResourceShareCreatedFromPolicyRequest, PromoteResourceShareCreatedFromPolicyResult> asyncHandler);

    /**
     * <p>
     * Rejects an invitation to a resource share from another Amazon Web Services account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return A Java Future containing the result of the RejectResourceShareInvitation operation returned by the
     *         service.
     * @sample AWSRAMAsync.RejectResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/RejectResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectResourceShareInvitationResult> rejectResourceShareInvitationAsync(
            RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest);

    /**
     * <p>
     * Rejects an invitation to a resource share from another Amazon Web Services account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectResourceShareInvitation operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.RejectResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/RejectResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectResourceShareInvitationResult> rejectResourceShareInvitationAsync(
            RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tag keys and values to the specified resource share. The tags are attached only to the
     * resource share, not to the resources that are in the resource share.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRAMAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tag keys and values to the specified resource share. The tags are attached only to the
     * resource share, not to the resources that are in the resource share.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRAMAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tag key and value pairs from the specified resource share.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRAMAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tag key and value pairs from the specified resource share.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRAMAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies some of the properties of the specified resource share.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return A Java Future containing the result of the UpdateResourceShare operation returned by the service.
     * @sample AWSRAMAsync.UpdateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UpdateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceShareResult> updateResourceShareAsync(UpdateResourceShareRequest updateResourceShareRequest);

    /**
     * <p>
     * Modifies some of the properties of the specified resource share.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceShare operation returned by the service.
     * @sample AWSRAMAsyncHandler.UpdateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UpdateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceShareResult> updateResourceShareAsync(UpdateResourceShareRequest updateResourceShareRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceShareRequest, UpdateResourceShareResult> asyncHandler);

}
