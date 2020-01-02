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
package com.amazonaws.services.lakeformation;

import javax.annotation.Generated;

import com.amazonaws.services.lakeformation.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSLakeFormation}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLakeFormation implements AWSLakeFormation {

    protected AbstractAWSLakeFormation() {
    }

    @Override
    public BatchGrantPermissionsResult batchGrantPermissions(BatchGrantPermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchRevokePermissionsResult batchRevokePermissions(BatchRevokePermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterResourceResult deregisterResource(DeregisterResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeResourceResult describeResource(DescribeResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDataLakeSettingsResult getDataLakeSettings(GetDataLakeSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEffectivePermissionsForPathResult getEffectivePermissionsForPath(GetEffectivePermissionsForPathRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GrantPermissionsResult grantPermissions(GrantPermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPermissionsResult listPermissions(ListPermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutDataLakeSettingsResult putDataLakeSettings(PutDataLakeSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterResourceResult registerResource(RegisterResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RevokePermissionsResult revokePermissions(RevokePermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
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
