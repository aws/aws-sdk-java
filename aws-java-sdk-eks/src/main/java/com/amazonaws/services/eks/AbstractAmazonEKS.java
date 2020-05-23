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
package com.amazonaws.services.eks;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.*;
import com.amazonaws.services.eks.waiters.AmazonEKSWaiters;

/**
 * Abstract implementation of {@code AmazonEKS}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEKS implements AmazonEKS {

    protected AbstractAmazonEKS() {
    }

    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateFargateProfileResult createFargateProfile(CreateFargateProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateNodegroupResult createNodegroup(CreateNodegroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteFargateProfileResult deleteFargateProfile(DeleteFargateProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteNodegroupResult deleteNodegroup(DeleteNodegroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeFargateProfileResult describeFargateProfile(DescribeFargateProfileRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeNodegroupResult describeNodegroup(DescribeNodegroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeUpdateResult describeUpdate(DescribeUpdateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListFargateProfilesResult listFargateProfiles(ListFargateProfilesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListNodegroupsResult listNodegroups(ListNodegroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListUpdatesResult listUpdates(ListUpdatesRequest request) {
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
    public UpdateClusterConfigResult updateClusterConfig(UpdateClusterConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateClusterVersionResult updateClusterVersion(UpdateClusterVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateNodegroupConfigResult updateNodegroupConfig(UpdateNodegroupConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateNodegroupVersionResult updateNodegroupVersion(UpdateNodegroupVersionRequest request) {
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

    @Override
    public AmazonEKSWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
