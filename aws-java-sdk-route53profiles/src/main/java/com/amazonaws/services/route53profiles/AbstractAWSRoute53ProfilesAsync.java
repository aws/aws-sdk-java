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
package com.amazonaws.services.route53profiles;

import javax.annotation.Generated;

import com.amazonaws.services.route53profiles.model.*;

/**
 * Abstract implementation of {@code AWSRoute53ProfilesAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRoute53ProfilesAsync extends AbstractAWSRoute53Profiles implements AWSRoute53ProfilesAsync {

    protected AbstractAWSRoute53ProfilesAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateProfileResult> associateProfileAsync(AssociateProfileRequest request) {

        return associateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProfileResult> associateProfileAsync(AssociateProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateProfileRequest, AssociateProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceToProfileResult> associateResourceToProfileAsync(AssociateResourceToProfileRequest request) {

        return associateResourceToProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceToProfileResult> associateResourceToProfileAsync(AssociateResourceToProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceToProfileRequest, AssociateResourceToProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateProfileResult> disassociateProfileAsync(DisassociateProfileRequest request) {

        return disassociateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProfileResult> disassociateProfileAsync(DisassociateProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateProfileRequest, DisassociateProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceFromProfileResult> disassociateResourceFromProfileAsync(
            DisassociateResourceFromProfileRequest request) {

        return disassociateResourceFromProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceFromProfileResult> disassociateResourceFromProfileAsync(
            DisassociateResourceFromProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceFromProfileRequest, DisassociateResourceFromProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request) {

        return getProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProfileAssociationResult> getProfileAssociationAsync(GetProfileAssociationRequest request) {

        return getProfileAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileAssociationResult> getProfileAssociationAsync(GetProfileAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProfileAssociationRequest, GetProfileAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProfileResourceAssociationResult> getProfileResourceAssociationAsync(GetProfileResourceAssociationRequest request) {

        return getProfileResourceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResourceAssociationResult> getProfileResourceAssociationAsync(GetProfileResourceAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProfileResourceAssociationRequest, GetProfileResourceAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProfileAssociationsResult> listProfileAssociationsAsync(ListProfileAssociationsRequest request) {

        return listProfileAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileAssociationsResult> listProfileAssociationsAsync(ListProfileAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProfileAssociationsRequest, ListProfileAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProfileResourceAssociationsResult> listProfileResourceAssociationsAsync(
            ListProfileResourceAssociationsRequest request) {

        return listProfileResourceAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileResourceAssociationsResult> listProfileResourceAssociationsAsync(
            ListProfileResourceAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProfileResourceAssociationsRequest, ListProfileResourceAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request) {

        return listProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateProfileResourceAssociationResult> updateProfileResourceAssociationAsync(
            UpdateProfileResourceAssociationRequest request) {

        return updateProfileResourceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResourceAssociationResult> updateProfileResourceAssociationAsync(
            UpdateProfileResourceAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileResourceAssociationRequest, UpdateProfileResourceAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
