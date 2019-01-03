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
package com.amazonaws.services.snowball;

import javax.annotation.Generated;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonSnowball}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSnowball implements AmazonSnowball {

    protected AbstractAmazonSnowball() {
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
    public CancelClusterResult cancelCluster(CancelClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAddressResult createAddress(CreateAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAddressResult describeAddress(DescribeAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJobManifestResult getJobManifest(GetJobManifestRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSnowballUsageResult getSnowballUsage(GetSnowballUsageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClusterJobsResult listClusterJobs(ListClusterJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCompatibleImagesResult listCompatibleImages(ListCompatibleImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateClusterResult updateCluster(UpdateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateJobResult updateJob(UpdateJobRequest request) {
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
