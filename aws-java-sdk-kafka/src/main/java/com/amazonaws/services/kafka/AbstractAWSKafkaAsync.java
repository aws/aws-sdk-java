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

/**
 * Abstract implementation of {@code AWSKafkaAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSKafkaAsync extends AbstractAWSKafka implements AWSKafkaAsync {

    protected AbstractAWSKafkaAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest request) {

        return createConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationRequest, CreateConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterOperationResult> describeClusterOperationAsync(DescribeClusterOperationRequest request) {

        return describeClusterOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterOperationResult> describeClusterOperationAsync(DescribeClusterOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterOperationRequest, DescribeClusterOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest request) {

        return describeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRequest, DescribeConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(DescribeConfigurationRevisionRequest request) {

        return describeConfigurationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(DescribeConfigurationRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRevisionRequest, DescribeConfigurationRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBootstrapBrokersResult> getBootstrapBrokersAsync(GetBootstrapBrokersRequest request) {

        return getBootstrapBrokersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBootstrapBrokersResult> getBootstrapBrokersAsync(GetBootstrapBrokersRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBootstrapBrokersRequest, GetBootstrapBrokersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClusterOperationsResult> listClusterOperationsAsync(ListClusterOperationsRequest request) {

        return listClusterOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClusterOperationsResult> listClusterOperationsAsync(ListClusterOperationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClusterOperationsRequest, ListClusterOperationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(ListConfigurationRevisionsRequest request) {

        return listConfigurationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(ListConfigurationRevisionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationRevisionsRequest, ListConfigurationRevisionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKafkaVersionsResult> listKafkaVersionsAsync(ListKafkaVersionsRequest request) {

        return listKafkaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKafkaVersionsResult> listKafkaVersionsAsync(ListKafkaVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKafkaVersionsRequest, ListKafkaVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request) {

        return listNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerCountResult> updateBrokerCountAsync(UpdateBrokerCountRequest request) {

        return updateBrokerCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerCountResult> updateBrokerCountAsync(UpdateBrokerCountRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerCountRequest, UpdateBrokerCountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerStorageResult> updateBrokerStorageAsync(UpdateBrokerStorageRequest request) {

        return updateBrokerStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerStorageResult> updateBrokerStorageAsync(UpdateBrokerStorageRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerStorageRequest, UpdateBrokerStorageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterConfigurationResult> updateClusterConfigurationAsync(UpdateClusterConfigurationRequest request) {

        return updateClusterConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterConfigurationResult> updateClusterConfigurationAsync(UpdateClusterConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterConfigurationRequest, UpdateClusterConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringResult> updateMonitoringAsync(UpdateMonitoringRequest request) {

        return updateMonitoringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringResult> updateMonitoringAsync(UpdateMonitoringRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitoringRequest, UpdateMonitoringResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
