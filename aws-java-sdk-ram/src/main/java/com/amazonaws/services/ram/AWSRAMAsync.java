/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * resource. The following principals are supported:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ID of an AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an OU from AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an organization from AWS Organizations
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify an AWS account that doesn't exist in the same organization as the account that owns the resource
 * share, the owner of the specified account receives an invitation to accept the resource share. After the owner
 * accepts the invitation, they can access the resources in the resource share. An administrator of the specified
 * account can use IAM policies to restrict access resources in the resource share.
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
     * Enables resource sharing within your organization.
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
     * Enables resource sharing within your organization.
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
     * Gets the policies for the specifies resources.
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
     * Gets the policies for the specifies resources.
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
     * Gets the associations for the specified resource share.
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
     * Gets the associations for the specified resource share.
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
     * Gets the specified invitations for resource sharing.
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
     * Gets the specified invitations for resource sharing.
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
     * Gets the specified resource shares or all of your resource shares.
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
     * Gets the specified resource shares or all of your resource shares.
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
     * Lists the principals with access to the specified resource.
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
     * Lists the principals with access to the specified resource.
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
     * Lists the resources that the specified principal can access.
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
     * Lists the resources that the specified principal can access.
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
     * Adds the specified tags to the specified resource share.
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
     * Adds the specified tags to the specified resource share.
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
     * Removes the specified tags from the specified resource share.
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
     * Removes the specified tags from the specified resource share.
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
     * Updates the specified resource share.
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
     * Updates the specified resource share.
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
