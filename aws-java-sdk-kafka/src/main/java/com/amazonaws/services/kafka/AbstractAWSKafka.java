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
package com.amazonaws.services.kafka;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSKafka}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSKafka implements AWSKafka {

    protected AbstractAWSKafka() {
    }

    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateConfigurationResult createConfiguration(CreateConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeClusterOperationResult describeClusterOperation(DescribeClusterOperationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationResult describeConfiguration(DescribeConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRevisionResult describeConfigurationRevision(DescribeConfigurationRevisionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetBootstrapBrokersResult getBootstrapBrokers(GetBootstrapBrokersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListClusterOperationsResult listClusterOperations(ListClusterOperationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListConfigurationRevisionsResult listConfigurationRevisions(ListConfigurationRevisionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListConfigurationsResult listConfigurations(ListConfigurationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListKafkaVersionsResult listKafkaVersions(ListKafkaVersionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListNodesResult listNodes(ListNodesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
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
    public UpdateBrokerCountResult updateBrokerCount(UpdateBrokerCountRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateBrokerStorageResult updateBrokerStorage(UpdateBrokerStorageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateClusterConfigurationResult updateClusterConfiguration(UpdateClusterConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateMonitoringResult updateMonitoring(UpdateMonitoringRequest request) {
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
