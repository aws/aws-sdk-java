/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers;

import javax.annotation.Generated;

import com.amazonaws.services.emrcontainers.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonEMRContainers}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEMRContainers implements AmazonEMRContainers {

    protected AbstractAmazonEMRContainers() {
    }

    @Override
    public CancelJobRunResult cancelJobRun(CancelJobRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateManagedEndpointResult createManagedEndpoint(CreateManagedEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVirtualClusterResult createVirtualCluster(CreateVirtualClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteManagedEndpointResult deleteManagedEndpoint(DeleteManagedEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVirtualClusterResult deleteVirtualCluster(DeleteVirtualClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJobRunResult describeJobRun(DescribeJobRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeManagedEndpointResult describeManagedEndpoint(DescribeManagedEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualClusterResult describeVirtualCluster(DescribeVirtualClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobRunsResult listJobRuns(ListJobRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListManagedEndpointsResult listManagedEndpoints(ListManagedEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVirtualClustersResult listVirtualClusters(ListVirtualClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartJobRunResult startJobRun(StartJobRunRequest request) {
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
