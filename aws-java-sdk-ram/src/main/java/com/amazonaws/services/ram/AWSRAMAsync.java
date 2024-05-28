/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * resources to other Amazon Web Services accounts. If you use Organizations to manage your accounts, then you can share
 * your resources with your entire organization or to organizational units (OUs). For supported resource types, you can
 * also share resources with individual Identity and Access Management (IAM) roles and users.
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
     * Creates a customer managed permission for a specified resource type that you can attach to resource shares. It is
     * created in the Amazon Web Services Region in which you call the operation.
     * </p>
     * 
     * @param createPermissionRequest
     * @return A Java Future containing the result of the CreatePermission operation returned by the service.
     * @sample AWSRAMAsync.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(CreatePermissionRequest createPermissionRequest);

    /**
     * <p>
     * Creates a customer managed permission for a specified resource type that you can attach to resource shares. It is
     * created in the Amazon Web Services Region in which you call the operation.
     * </p>
     * 
     * @param createPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePermission operation returned by the service.
     * @sample AWSRAMAsyncHandler.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(CreatePermissionRequest createPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePermissionRequest, CreatePermissionResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the specified customer managed permission. The new version is automatically set as the
     * default version of the customer managed permission. New resource shares automatically use the default permission.
     * Existing resource shares continue to use their original permission versions, but you can use
     * <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * <p>
     * If the specified customer managed permission already has the maximum of 5 versions, then you must delete one of
     * the existing versions before you can create a new one.
     * </p>
     * 
     * @param createPermissionVersionRequest
     * @return A Java Future containing the result of the CreatePermissionVersion operation returned by the service.
     * @sample AWSRAMAsync.CreatePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionVersionResult> createPermissionVersionAsync(CreatePermissionVersionRequest createPermissionVersionRequest);

    /**
     * <p>
     * Creates a new version of the specified customer managed permission. The new version is automatically set as the
     * default version of the customer managed permission. New resource shares automatically use the default permission.
     * Existing resource shares continue to use their original permission versions, but you can use
     * <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * <p>
     * If the specified customer managed permission already has the maximum of 5 versions, then you must delete one of
     * the existing versions before you can create a new one.
     * </p>
     * 
     * @param createPermissionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePermissionVersion operation returned by the service.
     * @sample AWSRAMAsyncHandler.CreatePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionVersionResult> createPermissionVersionAsync(CreatePermissionVersionRequest createPermissionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePermissionVersionRequest, CreatePermissionVersionResult> asyncHandler);

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
     * Deletes the specified customer managed permission in the Amazon Web Services Region in which you call this
     * operation. You can delete a customer managed permission only if it isn't attached to any resource share. The
     * operation deletes all versions associated with the customer managed permission.
     * </p>
     * 
     * @param deletePermissionRequest
     * @return A Java Future containing the result of the DeletePermission operation returned by the service.
     * @sample AWSRAMAsync.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(DeletePermissionRequest deletePermissionRequest);

    /**
     * <p>
     * Deletes the specified customer managed permission in the Amazon Web Services Region in which you call this
     * operation. You can delete a customer managed permission only if it isn't attached to any resource share. The
     * operation deletes all versions associated with the customer managed permission.
     * </p>
     * 
     * @param deletePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermission operation returned by the service.
     * @sample AWSRAMAsyncHandler.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(DeletePermissionRequest deletePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionRequest, DeletePermissionResult> asyncHandler);

    /**
     * <p>
     * Deletes one version of a customer managed permission. The version you specify must not be attached to any
     * resource share and must not be the default version for the permission.
     * </p>
     * <p>
     * If a customer managed permission has the maximum of 5 versions, then you must delete at least one version before
     * you can create another.
     * </p>
     * 
     * @param deletePermissionVersionRequest
     * @return A Java Future containing the result of the DeletePermissionVersion operation returned by the service.
     * @sample AWSRAMAsync.DeletePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionVersionResult> deletePermissionVersionAsync(DeletePermissionVersionRequest deletePermissionVersionRequest);

    /**
     * <p>
     * Deletes one version of a customer managed permission. The version you specify must not be attached to any
     * resource share and must not be the default version for the permission.
     * </p>
     * <p>
     * If a customer managed permission has the maximum of 5 versions, then you must delete at least one version before
     * you can create another.
     * </p>
     * 
     * @param deletePermissionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionVersion operation returned by the service.
     * @sample AWSRAMAsyncHandler.DeletePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionVersionResult> deletePermissionVersionAsync(DeletePermissionVersionRequest deletePermissionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionVersionRequest, DeletePermissionVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource share.
     * </p>
     * <important>
     * <p>
     * This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing
     * of those resources through this resource share.
     * </p>
     * </important>
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
     * Deletes the specified resource share.
     * </p>
     * <important>
     * <p>
     * This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing
     * of those resources through this resource share.
     * </p>
     * </important>
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
     * Removes the specified principals or resources from participating in the specified resource share.
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
     * Removes the specified principals or resources from participating in the specified resource share.
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
     * Removes a managed permission from a resource share. Permission changes take effect immediately. You can remove a
     * managed permission from a resource share only if there are currently no resources of the relevant resource type
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
     * Removes a managed permission from a resource share. Permission changes take effect immediately. You can remove a
     * managed permission from a resource share only if there are currently no resources of the relevant resource type
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
     * Enables resource sharing within your organization in Organizations. This operation creates a service-linked role
     * called <code>AWSServiceRoleForResourceAccessManager</code> that has the IAM managed policy named
     * AWSResourceAccessManagerServiceRolePolicy attached. This role permits RAM to retrieve information about the
     * organization and its structure. This lets you share resources with all of the accounts in the calling account's
     * organization by specifying the organization ID, or all of the accounts in an organizational unit (OU) by
     * specifying the OU ID. Until you enable sharing within the organization, you can specify only individual Amazon
     * Web Services accounts, or for supported resource types, IAM roles and users.
     * </p>
     * <p>
     * You must call this operation from an IAM role or user in the organization's management account.
     * </p>
     * <p/>
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
     * Enables resource sharing within your organization in Organizations. This operation creates a service-linked role
     * called <code>AWSServiceRoleForResourceAccessManager</code> that has the IAM managed policy named
     * AWSResourceAccessManagerServiceRolePolicy attached. This role permits RAM to retrieve information about the
     * organization and its structure. This lets you share resources with all of the accounts in the calling account's
     * organization by specifying the organization ID, or all of the accounts in an organizational unit (OU) by
     * specifying the OU ID. Until you enable sharing within the organization, you can specify only individual Amazon
     * Web Services accounts, or for supported resource types, IAM roles and users.
     * </p>
     * <p>
     * You must call this operation from an IAM role or user in the organization's management account.
     * </p>
     * <p/>
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
     * Retrieves the contents of a managed permission in JSON format.
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
     * Retrieves the contents of a managed permission in JSON format.
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
     * Retrieves the lists of resources and principals that associated for resource shares that you own.
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
     * Retrieves the lists of resources and principals that associated for resource shares that you own.
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
     * Lists information about the managed permission and its associations to any resource shares that use this managed
     * permission. This lets you see which resource shares use which versions of the specified managed permission.
     * </p>
     * 
     * @param listPermissionAssociationsRequest
     * @return A Java Future containing the result of the ListPermissionAssociations operation returned by the service.
     * @sample AWSRAMAsync.ListPermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionAssociationsResult> listPermissionAssociationsAsync(
            ListPermissionAssociationsRequest listPermissionAssociationsRequest);

    /**
     * <p>
     * Lists information about the managed permission and its associations to any resource shares that use this managed
     * permission. This lets you see which resource shares use which versions of the specified managed permission.
     * </p>
     * 
     * @param listPermissionAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionAssociations operation returned by the service.
     * @sample AWSRAMAsyncHandler.ListPermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionAssociationsResult> listPermissionAssociationsAsync(
            ListPermissionAssociationsRequest listPermissionAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionAssociationsRequest, ListPermissionAssociationsResult> asyncHandler);

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
     * Retrieves the current status of the asynchronous tasks performed by RAM when you perform the
     * <a>ReplacePermissionAssociationsWork</a> operation.
     * </p>
     * 
     * @param listReplacePermissionAssociationsWorkRequest
     * @return A Java Future containing the result of the ListReplacePermissionAssociationsWork operation returned by
     *         the service.
     * @sample AWSRAMAsync.ListReplacePermissionAssociationsWork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListReplacePermissionAssociationsWork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReplacePermissionAssociationsWorkResult> listReplacePermissionAssociationsWorkAsync(
            ListReplacePermissionAssociationsWorkRequest listReplacePermissionAssociationsWorkRequest);

    /**
     * <p>
     * Retrieves the current status of the asynchronous tasks performed by RAM when you perform the
     * <a>ReplacePermissionAssociationsWork</a> operation.
     * </p>
     * 
     * @param listReplacePermissionAssociationsWorkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReplacePermissionAssociationsWork operation returned by
     *         the service.
     * @sample AWSRAMAsyncHandler.ListReplacePermissionAssociationsWork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListReplacePermissionAssociationsWork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReplacePermissionAssociationsWorkResult> listReplacePermissionAssociationsWorkAsync(
            ListReplacePermissionAssociationsWorkRequest listReplacePermissionAssociationsWorkRequest,
            com.amazonaws.handlers.AsyncHandler<ListReplacePermissionAssociationsWorkRequest, ListReplacePermissionAssociationsWorkResult> asyncHandler);

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
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation creates a separate, fully manageable customer managed permission that has the same IAM permissions
     * as the original resource-based policy. You can associate this customer managed permission to any resource shares.
     * </p>
     * <p>
     * Before you use <a>PromoteResourceShareCreatedFromPolicy</a>, you should first run this operation to ensure that
     * you have an appropriate customer managed permission that can be associated with the promoted resource share.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The original <code>CREATED_FROM_POLICY</code> policy isn't deleted, and resource shares using that original
     * policy aren't automatically updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't modify a <code>CREATED_FROM_POLICY</code> resource share so you can't associate the new customer
     * managed permission by using <code>ReplacePermsissionAssociations</code>. However, if you use
     * <a>PromoteResourceShareCreatedFromPolicy</a>, that operation automatically associates the fully manageable
     * customer managed permission to the newly promoted <code>STANDARD</code> resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you promote a resource share, if the original <code>CREATED_FROM_POLICY</code> managed permission has no
     * other associations to A resource share, then RAM automatically deletes it.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promotePermissionCreatedFromPolicyRequest
     * @return A Java Future containing the result of the PromotePermissionCreatedFromPolicy operation returned by the
     *         service.
     * @sample AWSRAMAsync.PromotePermissionCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromotePermissionCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PromotePermissionCreatedFromPolicyResult> promotePermissionCreatedFromPolicyAsync(
            PromotePermissionCreatedFromPolicyRequest promotePermissionCreatedFromPolicyRequest);

    /**
     * <p>
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation creates a separate, fully manageable customer managed permission that has the same IAM permissions
     * as the original resource-based policy. You can associate this customer managed permission to any resource shares.
     * </p>
     * <p>
     * Before you use <a>PromoteResourceShareCreatedFromPolicy</a>, you should first run this operation to ensure that
     * you have an appropriate customer managed permission that can be associated with the promoted resource share.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The original <code>CREATED_FROM_POLICY</code> policy isn't deleted, and resource shares using that original
     * policy aren't automatically updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't modify a <code>CREATED_FROM_POLICY</code> resource share so you can't associate the new customer
     * managed permission by using <code>ReplacePermsissionAssociations</code>. However, if you use
     * <a>PromoteResourceShareCreatedFromPolicy</a>, that operation automatically associates the fully manageable
     * customer managed permission to the newly promoted <code>STANDARD</code> resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you promote a resource share, if the original <code>CREATED_FROM_POLICY</code> managed permission has no
     * other associations to A resource share, then RAM automatically deletes it.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promotePermissionCreatedFromPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PromotePermissionCreatedFromPolicy operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.PromotePermissionCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromotePermissionCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PromotePermissionCreatedFromPolicyResult> promotePermissionCreatedFromPolicyAsync(
            PromotePermissionCreatedFromPolicyRequest promotePermissionCreatedFromPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PromotePermissionCreatedFromPolicyRequest, PromotePermissionCreatedFromPolicyResult> asyncHandler);

    /**
     * <p>
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation promotes the resource share to a <code>STANDARD</code> resource share that is fully manageable in
     * RAM. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to
     * all of the principals you shared it with.
     * </p>
     * <important>
     * <p>
     * Before you perform this operation, you should first run <a>PromotePermissionCreatedFromPolicy</a>to ensure that
     * you have an appropriate customer managed permission that can be associated with this resource share after its is
     * promoted. If this operation can't find a managed permission that exactly matches the existing
     * <code>CREATED_FROM_POLICY</code> permission, then this operation fails.
     * </p>
     * </important>
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
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation promotes the resource share to a <code>STANDARD</code> resource share that is fully manageable in
     * RAM. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to
     * all of the principals you shared it with.
     * </p>
     * <important>
     * <p>
     * Before you perform this operation, you should first run <a>PromotePermissionCreatedFromPolicy</a>to ensure that
     * you have an appropriate customer managed permission that can be associated with this resource share after its is
     * promoted. If this operation can't find a managed permission that exactly matches the existing
     * <code>CREATED_FROM_POLICY</code> permission, then this operation fails.
     * </p>
     * </important>
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
     * Updates all resource shares that use a managed permission to a different managed permission. This operation
     * always applies the default version of the target managed permission. You can optionally specify that the update
     * applies to only resource shares that currently use a specified version. This enables you to update to the latest
     * version, without changing the which managed permission is used.
     * </p>
     * <p>
     * You can use this operation to update all of your resource shares to use the current default version of the
     * permission by specifying the same value for the <code>fromPermissionArn</code> and <code>toPermissionArn</code>
     * parameters.
     * </p>
     * <p>
     * You can use the optional <code>fromPermissionVersion</code> parameter to update only those resources that use a
     * specified version of the managed permission to the new managed permission.
     * </p>
     * <important>
     * <p>
     * To successfully perform this operation, you must have permission to update the resource-based policy on all
     * affected resource types.
     * </p>
     * </important>
     * 
     * @param replacePermissionAssociationsRequest
     * @return A Java Future containing the result of the ReplacePermissionAssociations operation returned by the
     *         service.
     * @sample AWSRAMAsync.ReplacePermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplacePermissionAssociationsResult> replacePermissionAssociationsAsync(
            ReplacePermissionAssociationsRequest replacePermissionAssociationsRequest);

    /**
     * <p>
     * Updates all resource shares that use a managed permission to a different managed permission. This operation
     * always applies the default version of the target managed permission. You can optionally specify that the update
     * applies to only resource shares that currently use a specified version. This enables you to update to the latest
     * version, without changing the which managed permission is used.
     * </p>
     * <p>
     * You can use this operation to update all of your resource shares to use the current default version of the
     * permission by specifying the same value for the <code>fromPermissionArn</code> and <code>toPermissionArn</code>
     * parameters.
     * </p>
     * <p>
     * You can use the optional <code>fromPermissionVersion</code> parameter to update only those resources that use a
     * specified version of the managed permission to the new managed permission.
     * </p>
     * <important>
     * <p>
     * To successfully perform this operation, you must have permission to update the resource-based policy on all
     * affected resource types.
     * </p>
     * </important>
     * 
     * @param replacePermissionAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplacePermissionAssociations operation returned by the
     *         service.
     * @sample AWSRAMAsyncHandler.ReplacePermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplacePermissionAssociationsResult> replacePermissionAssociationsAsync(
            ReplacePermissionAssociationsRequest replacePermissionAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ReplacePermissionAssociationsRequest, ReplacePermissionAssociationsResult> asyncHandler);

    /**
     * <p>
     * Designates the specified version number as the default version for the specified customer managed permission. New
     * resource shares automatically use this new default permission. Existing resource shares continue to use their
     * original permission version, but you can use <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * 
     * @param setDefaultPermissionVersionRequest
     * @return A Java Future containing the result of the SetDefaultPermissionVersion operation returned by the service.
     * @sample AWSRAMAsync.SetDefaultPermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/SetDefaultPermissionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetDefaultPermissionVersionResult> setDefaultPermissionVersionAsync(
            SetDefaultPermissionVersionRequest setDefaultPermissionVersionRequest);

    /**
     * <p>
     * Designates the specified version number as the default version for the specified customer managed permission. New
     * resource shares automatically use this new default permission. Existing resource shares continue to use their
     * original permission version, but you can use <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * 
     * @param setDefaultPermissionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDefaultPermissionVersion operation returned by the service.
     * @sample AWSRAMAsyncHandler.SetDefaultPermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/SetDefaultPermissionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetDefaultPermissionVersionResult> setDefaultPermissionVersionAsync(
            SetDefaultPermissionVersionRequest setDefaultPermissionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultPermissionVersionRequest, SetDefaultPermissionVersionResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tag keys and values to a resource share or managed permission. If you choose a resource share,
     * the tags are attached to only the resource share, not to the resources that are in the resource share.
     * </p>
     * <p>
     * The tags on a managed permission are the same for all versions of the managed permission.
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
     * Adds the specified tag keys and values to a resource share or managed permission. If you choose a resource share,
     * the tags are attached to only the resource share, not to the resources that are in the resource share.
     * </p>
     * <p>
     * The tags on a managed permission are the same for all versions of the managed permission.
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
     * Removes the specified tag key and value pairs from the specified resource share or managed permission.
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
     * Removes the specified tag key and value pairs from the specified resource share or managed permission.
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
