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
package com.amazonaws.services.docdbelastic;

import javax.annotation.Generated;

import com.amazonaws.services.docdbelastic.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonDocDBElastic}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDocDBElastic implements AmazonDocDBElastic {

    protected AbstractAmazonDocDBElastic() {
    }

    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClusterSnapshotResult createClusterSnapshot(CreateClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterSnapshotResult deleteClusterSnapshot(DeleteClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetClusterResult getCluster(GetClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetClusterSnapshotResult getClusterSnapshot(GetClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClusterSnapshotsResult listClusterSnapshots(ListClusterSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreClusterFromSnapshotResult restoreClusterFromSnapshot(RestoreClusterFromSnapshotRequest request) {
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
    public UpdateClusterResult updateCluster(UpdateClusterRequest request) {
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
