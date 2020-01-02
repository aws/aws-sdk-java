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
 * Abstract implementation of {@code AWSRAMAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRAMAsync extends AbstractAWSRAM implements AWSRAMAsync {

    protected AbstractAWSRAMAsync() {
    }

    @Override
    public java.util.concurrent.Future<AcceptResourceShareInvitationResult> acceptResourceShareInvitationAsync(AcceptResourceShareInvitationRequest request) {

        return acceptResourceShareInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptResourceShareInvitationResult> acceptResourceShareInvitationAsync(AcceptResourceShareInvitationRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceShareResult> associateResourceShareAsync(AssociateResourceShareRequest request) {

        return associateResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceShareResult> associateResourceShareAsync(AssociateResourceShareRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceShareRequest, AssociateResourceShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceSharePermissionResult> associateResourceSharePermissionAsync(
            AssociateResourceSharePermissionRequest request) {

        return associateResourceSharePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceSharePermissionResult> associateResourceSharePermissionAsync(
            AssociateResourceSharePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResourceShareResult> createResourceShareAsync(CreateResourceShareRequest request) {

        return createResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceShareResult> createResourceShareAsync(CreateResourceShareRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResourceShareRequest, CreateResourceShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceShareResult> deleteResourceShareAsync(DeleteResourceShareRequest request) {

        return deleteResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceShareResult> deleteResourceShareAsync(DeleteResourceShareRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceShareRequest, DeleteResourceShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceShareResult> disassociateResourceShareAsync(DisassociateResourceShareRequest request) {

        return disassociateResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceShareResult> disassociateResourceShareAsync(DisassociateResourceShareRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceShareRequest, DisassociateResourceShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceSharePermissionResult> disassociateResourceSharePermissionAsync(
            DisassociateResourceSharePermissionRequest request) {

        return disassociateResourceSharePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceSharePermissionResult> disassociateResourceSharePermissionAsync(
            DisassociateResourceSharePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableSharingWithAwsOrganizationResult> enableSharingWithAwsOrganizationAsync(
            EnableSharingWithAwsOrganizationRequest request) {

        return enableSharingWithAwsOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSharingWithAwsOrganizationResult> enableSharingWithAwsOrganizationAsync(
            EnableSharingWithAwsOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableSharingWithAwsOrganizationRequest, EnableSharingWithAwsOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPermissionResult> getPermissionAsync(GetPermissionRequest request) {

        return getPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPermissionResult> getPermissionAsync(GetPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPermissionRequest, GetPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest request) {

        return getResourcePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourcePoliciesRequest, GetResourcePoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareAssociationsResult> getResourceShareAssociationsAsync(GetResourceShareAssociationsRequest request) {

        return getResourceShareAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareAssociationsResult> getResourceShareAssociationsAsync(GetResourceShareAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceShareAssociationsRequest, GetResourceShareAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareInvitationsResult> getResourceShareInvitationsAsync(GetResourceShareInvitationsRequest request) {

        return getResourceShareInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareInvitationsResult> getResourceShareInvitationsAsync(GetResourceShareInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceShareInvitationsRequest, GetResourceShareInvitationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceSharesResult> getResourceSharesAsync(GetResourceSharesRequest request) {

        return getResourceSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceSharesResult> getResourceSharesAsync(GetResourceSharesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceSharesRequest, GetResourceSharesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPendingInvitationResourcesResult> listPendingInvitationResourcesAsync(ListPendingInvitationResourcesRequest request) {

        return listPendingInvitationResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPendingInvitationResourcesResult> listPendingInvitationResourcesAsync(ListPendingInvitationResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPendingInvitationResourcesRequest, ListPendingInvitationResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsResult> listPrincipalsAsync(ListPrincipalsRequest request) {

        return listPrincipalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsResult> listPrincipalsAsync(ListPrincipalsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalsRequest, ListPrincipalsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourceSharePermissionsResult> listResourceSharePermissionsAsync(ListResourceSharePermissionsRequest request) {

        return listResourceSharePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceSharePermissionsResult> listResourceSharePermissionsAsync(ListResourceSharePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PromoteResourceShareCreatedFromPolicyResult> promoteResourceShareCreatedFromPolicyAsync(
            PromoteResourceShareCreatedFromPolicyRequest request) {

        return promoteResourceShareCreatedFromPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PromoteResourceShareCreatedFromPolicyResult> promoteResourceShareCreatedFromPolicyAsync(
            PromoteResourceShareCreatedFromPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PromoteResourceShareCreatedFromPolicyRequest, PromoteResourceShareCreatedFromPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectResourceShareInvitationResult> rejectResourceShareInvitationAsync(RejectResourceShareInvitationRequest request) {

        return rejectResourceShareInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectResourceShareInvitationResult> rejectResourceShareInvitationAsync(RejectResourceShareInvitationRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceShareResult> updateResourceShareAsync(UpdateResourceShareRequest request) {

        return updateResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceShareResult> updateResourceShareAsync(UpdateResourceShareRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceShareRequest, UpdateResourceShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
