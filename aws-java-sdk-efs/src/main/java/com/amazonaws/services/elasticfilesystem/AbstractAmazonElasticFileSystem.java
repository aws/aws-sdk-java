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
package com.amazonaws.services.elasticfilesystem;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonElasticFileSystem}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticFileSystem implements AmazonElasticFileSystem {

    protected AbstractAmazonElasticFileSystem() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateMountTargetResult createMountTarget(CreateMountTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteMountTargetResult deleteMountTarget(DeleteMountTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFileSystemsResult describeFileSystems() {
        return describeFileSystems(new DescribeFileSystemsRequest());
    }

    @Override
    public DescribeLifecycleConfigurationResult describeLifecycleConfiguration(DescribeLifecycleConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMountTargetsResult describeMountTargets(DescribeMountTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyMountTargetSecurityGroupsResult modifyMountTargetSecurityGroups(ModifyMountTargetSecurityGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLifecycleConfigurationResult putLifecycleConfiguration(PutLifecycleConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest request) {
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
