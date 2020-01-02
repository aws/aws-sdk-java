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
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts. To share a resource, you create a
 * resource share, associate the resource with the resource share, and specify the principals that can access the
 * resources associated with the resource share. The following principals are supported: AWS accounts, organizational
 * units (OU) from AWS Organizations, and organizations from AWS Organizations.
 * </p>
 * <p>
 * For more information, see the <a href="https://docs.aws.amazon.com/ram/latest/userguide/">AWS Resource Access Manager
 * User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRAMAsync extends AWSRAM {

    /**
     * <p>
     * Accepts an invitation to a resource share from another AWS account.
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
     * Accepts an invitation to a resource share from another AWS account.
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
     * Associates the specified resource share with the specified principals and resources.
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
     * Associates the specified resource share with the specified principals and resources.
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
     * Associates a permission with a resource share.
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
     * Associates a permission with a resource share.
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
     * Creates a resource share.
     * </p>
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
     * Creates a resource share.
     * </p>
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
     * Deletes the specified resource share.
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
     * Deletes the specified resource share.
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
     * Disassociates an AWS RAM permission from a resource share.
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
     * Disassociates an AWS RAM permission from a resource share.
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
     * Enables resource sharing within your AWS Organization.
     * </p>
     * <p>
     * The caller must be the master account for the AWS Organization.
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
     * Enables resource sharing within your AWS Organization.
     * </p>
     * <p>
     * The caller must be the master account for the AWS Organization.
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
     * Gets the contents of an AWS RAM permission in JSON format.
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
     * Gets the contents of an AWS RAM permission in JSON format.
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
     * Gets the policies for the specified resources that you own and have shared.
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
     * Gets the policies for the specified resources that you own and have shared.
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
     * Gets the resources or principals for the resource shares that you own.
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
     * Gets the resources or principals for the resource shares that you own.
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
     * Gets the invitations for resource sharing that you've received.
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
     * Gets the invitations for resource sharing that you've received.
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
     * Gets the resource shares that you own or the resource shares that are shared with you.
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
     * Gets the resource shares that you own or the resource shares that are shared with you.
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
     * Lists the resources in a resource share that is shared with you but that the invitation is still pending for.
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
     * Lists the resources in a resource share that is shared with you but that the invitation is still pending for.
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
     * Lists the AWS RAM permissions.
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
     * Lists the AWS RAM permissions.
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
     * Lists the principals that you have shared resources with or that have shared resources with you.
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
     * Lists the principals that you have shared resources with or that have shared resources with you.
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
     * Lists the AWS RAM permissions that are associated with a resource share.
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
     * Lists the AWS RAM permissions that are associated with a resource share.
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
     * Lists the resources that you added to a resource shares or the resources that are shared with you.
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
     * Lists the resources that you added to a resource shares or the resources that are shared with you.
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
     * Resource shares that were created by attaching a policy to a resource are visible only to the resource share
     * owner, and the resource share cannot be modified in AWS RAM.
     * </p>
     * <p>
     * Use this API action to promote the resource share. When you promote the resource share, it becomes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Visible to all principals that it is shared with.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifiable in AWS RAM.
     * </p>
     * </li>
     * </ul>
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
     * Resource shares that were created by attaching a policy to a resource are visible only to the resource share
     * owner, and the resource share cannot be modified in AWS RAM.
     * </p>
     * <p>
     * Use this API action to promote the resource share. When you promote the resource share, it becomes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Visible to all principals that it is shared with.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifiable in AWS RAM.
     * </p>
     * </li>
     * </ul>
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
     * Rejects an invitation to a resource share from another AWS account.
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
     * Rejects an invitation to a resource share from another AWS account.
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
     * Adds the specified tags to the specified resource share that you own.
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
     * Adds the specified tags to the specified resource share that you own.
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
     * Removes the specified tags from the specified resource share that you own.
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
     * Removes the specified tags from the specified resource share that you own.
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
     * Updates the specified resource share that you own.
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
     * Updates the specified resource share that you own.
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
