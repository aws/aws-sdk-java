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
package com.amazonaws.services.ssmsap;

import javax.annotation.Generated;

import com.amazonaws.services.ssmsap.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSSsmSap}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSsmSap implements AWSSsmSap {

    protected AbstractAWSSsmSap() {
    }

    @Override
    public DeleteResourcePermissionResult deleteResourcePermission(DeleteResourcePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterApplicationResult deregisterApplication(DeregisterApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComponentResult getComponent(GetComponentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDatabaseResult getDatabase(GetDatabaseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourcePermissionResult getResourcePermission(GetResourcePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListComponentsResult listComponents(ListComponentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDatabasesResult listDatabases(ListDatabasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutResourcePermissionResult putResourcePermission(PutResourcePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterApplicationResult registerApplication(RegisterApplicationRequest request) {
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
    public UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest request) {
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
