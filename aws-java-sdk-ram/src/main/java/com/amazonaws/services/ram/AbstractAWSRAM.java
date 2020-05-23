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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSRAM}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRAM implements AWSRAM {

    protected AbstractAWSRAM() {
    }

    @Override
    public AcceptResourceShareInvitationResult acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssociateResourceShareResult associateResourceShare(AssociateResourceShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssociateResourceSharePermissionResult associateResourceSharePermission(AssociateResourceSharePermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateResourceShareResult createResourceShare(CreateResourceShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteResourceShareResult deleteResourceShare(DeleteResourceShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateResourceShareResult disassociateResourceShare(DisassociateResourceShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateResourceSharePermissionResult disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EnableSharingWithAwsOrganizationResult enableSharingWithAwsOrganization(EnableSharingWithAwsOrganizationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetPermissionResult getPermission(GetPermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetResourcePoliciesResult getResourcePolicies(GetResourcePoliciesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetResourceShareAssociationsResult getResourceShareAssociations(GetResourceShareAssociationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetResourceShareInvitationsResult getResourceShareInvitations(GetResourceShareInvitationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetResourceSharesResult getResourceShares(GetResourceSharesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPendingInvitationResourcesResult listPendingInvitationResources(ListPendingInvitationResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPermissionsResult listPermissions(ListPermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPrincipalsResult listPrincipals(ListPrincipalsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListResourceSharePermissionsResult listResourceSharePermissions(ListResourceSharePermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListResourceTypesResult listResourceTypes(ListResourceTypesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PromoteResourceShareCreatedFromPolicyResult promoteResourceShareCreatedFromPolicy(PromoteResourceShareCreatedFromPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RejectResourceShareInvitationResult rejectResourceShareInvitation(RejectResourceShareInvitationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateResourceShareResult updateResourceShare(UpdateResourceShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}
