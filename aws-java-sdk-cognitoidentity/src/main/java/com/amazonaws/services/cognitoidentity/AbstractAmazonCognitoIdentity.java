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
package com.amazonaws.services.cognitoidentity;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonCognitoIdentity}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCognitoIdentity implements AmazonCognitoIdentity {

    protected AbstractAmazonCognitoIdentity() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateIdentityPoolResult createIdentityPool(CreateIdentityPoolRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteIdentitiesResult deleteIdentities(DeleteIdentitiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteIdentityPoolResult deleteIdentityPool(DeleteIdentityPoolRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeIdentityResult describeIdentity(DescribeIdentityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeIdentityPoolResult describeIdentityPool(DescribeIdentityPoolRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCredentialsForIdentityResult getCredentialsForIdentity(GetCredentialsForIdentityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetIdResult getId(GetIdRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetIdentityPoolRolesResult getIdentityPoolRoles(GetIdentityPoolRolesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetOpenIdTokenResult getOpenIdToken(GetOpenIdTokenRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentity(GetOpenIdTokenForDeveloperIdentityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIdentityPoolsResult listIdentityPools(ListIdentityPoolsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LookupDeveloperIdentityResult lookupDeveloperIdentity(LookupDeveloperIdentityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MergeDeveloperIdentitiesResult mergeDeveloperIdentities(MergeDeveloperIdentitiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetIdentityPoolRolesResult setIdentityPoolRoles(SetIdentityPoolRolesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UnlinkDeveloperIdentityResult unlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UnlinkIdentityResult unlinkIdentity(UnlinkIdentityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateIdentityPoolResult updateIdentityPool(UpdateIdentityPoolRequest request) {
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
