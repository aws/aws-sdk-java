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
package com.amazonaws.services.cloudhsmv2;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCloudHSMV2}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudHSMV2 implements AWSCloudHSMV2 {

    protected AbstractAWSCloudHSMV2() {
    }

    @Override
    public CopyBackupToRegionResult copyBackupToRegion(CopyBackupToRegionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateHsmResult createHsm(CreateHsmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHsmResult deleteHsm(DeleteHsmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClustersResult describeClusters(DescribeClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InitializeClusterResult initializeCluster(InitializeClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreBackupResult restoreBackup(RestoreBackupRequest request) {
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
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
