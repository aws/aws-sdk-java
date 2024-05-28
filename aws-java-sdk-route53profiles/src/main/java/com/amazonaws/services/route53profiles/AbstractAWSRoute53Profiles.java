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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSRoute53Profiles}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRoute53Profiles implements AWSRoute53Profiles {

    protected AbstractAWSRoute53Profiles() {
    }

    @Override
    public AssociateProfileResult associateProfile(AssociateProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateResourceToProfileResult associateResourceToProfile(AssociateResourceToProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateProfileResult createProfile(CreateProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateProfileResult disassociateProfile(DisassociateProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateResourceFromProfileResult disassociateResourceFromProfile(DisassociateResourceFromProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetProfileResult getProfile(GetProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetProfileAssociationResult getProfileAssociation(GetProfileAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetProfileResourceAssociationResult getProfileResourceAssociation(GetProfileResourceAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProfileAssociationsResult listProfileAssociations(ListProfileAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProfileResourceAssociationsResult listProfileResourceAssociations(ListProfileResourceAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProfilesResult listProfiles(ListProfilesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateProfileResourceAssociationResult updateProfileResourceAssociation(UpdateProfileResourceAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
