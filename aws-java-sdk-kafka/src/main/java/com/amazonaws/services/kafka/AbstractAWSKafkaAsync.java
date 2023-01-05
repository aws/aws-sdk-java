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
    public java.util.concurrent.Future<BatchAssociateScramSecretResult> batchAssociateScramSecretAsync(BatchAssociateScramSecretRequest request) {

        return batchAssociateScramSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateScramSecretResult> batchAssociateScramSecretAsync(BatchAssociateScramSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateScramSecretRequest, BatchAssociateScramSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateScramSecretResult> batchDisassociateScramSecretAsync(BatchDisassociateScramSecretRequest request) {

        return batchDisassociateScramSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateScramSecretResult> batchDisassociateScramSecretAsync(BatchDisassociateScramSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateScramSecretRequest, BatchDisassociateScramSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<CreateClusterV2Result> createClusterV2Async(CreateClusterV2Request request) {

        return createClusterV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterV2Result> createClusterV2Async(CreateClusterV2Request request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterV2Request, CreateClusterV2Result> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteConfigurationResult> deleteConfigurationAsync(DeleteConfigurationRequest request) {

        return deleteConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationResult> deleteConfigurationAsync(DeleteConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationRequest, DeleteConfigurationResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeClusterV2Result> describeClusterV2Async(DescribeClusterV2Request request) {

        return describeClusterV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterV2Result> describeClusterV2Async(DescribeClusterV2Request request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterV2Request, DescribeClusterV2Result> asyncHandler) {

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
    public java.util.concurrent.Future<GetCompatibleKafkaVersionsResult> getCompatibleKafkaVersionsAsync(GetCompatibleKafkaVersionsRequest request) {

        return getCompatibleKafkaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleKafkaVersionsResult> getCompatibleKafkaVersionsAsync(GetCompatibleKafkaVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCompatibleKafkaVersionsRequest, GetCompatibleKafkaVersionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListClustersV2Result> listClustersV2Async(ListClustersV2Request request) {

        return listClustersV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersV2Result> listClustersV2Async(ListClustersV2Request request,
            com.amazonaws.handlers.AsyncHandler<ListClustersV2Request, ListClustersV2Result> asyncHandler) {

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
    public java.util.concurrent.Future<ListScramSecretsResult> listScramSecretsAsync(ListScramSecretsRequest request) {

        return listScramSecretsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScramSecretsResult> listScramSecretsAsync(ListScramSecretsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListScramSecretsRequest, ListScramSecretsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest request) {

        return rebootBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootBrokerRequest, RebootBrokerResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateBrokerTypeResult> updateBrokerTypeAsync(UpdateBrokerTypeRequest request) {

        return updateBrokerTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerTypeResult> updateBrokerTypeAsync(UpdateBrokerTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerTypeRequest, UpdateBrokerTypeResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateClusterKafkaVersionResult> updateClusterKafkaVersionAsync(UpdateClusterKafkaVersionRequest request) {

        return updateClusterKafkaVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterKafkaVersionResult> updateClusterKafkaVersionAsync(UpdateClusterKafkaVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterKafkaVersionRequest, UpdateClusterKafkaVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request) {

        return updateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectivityResult> updateConnectivityAsync(UpdateConnectivityRequest request) {

        return updateConnectivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectivityResult> updateConnectivityAsync(UpdateConnectivityRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectivityRequest, UpdateConnectivityResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateSecurityResult> updateSecurityAsync(UpdateSecurityRequest request) {

        return updateSecurityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityResult> updateSecurityAsync(UpdateSecurityRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityRequest, UpdateSecurityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageResult> updateStorageAsync(UpdateStorageRequest request) {

        return updateStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageResult> updateStorageAsync(UpdateStorageRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStorageRequest, UpdateStorageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
