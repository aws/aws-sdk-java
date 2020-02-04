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
 * Interface for accessing Kafka asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kafka.AbstractAWSKafkaAsync} instead.
 * </p>
 * <p>
 * 
 * <p>
 * The operations for managing an Amazon MSK cluster.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSKafkaAsync extends AWSKafka {

    /**
     * <p>
     * Creates a new MSK cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSKafkaAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new MSK cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSKafkaAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a new MSK configuration.
     * </p>
     * 
     * @param createConfigurationRequest
     * @return A Java Future containing the result of the CreateConfiguration operation returned by the service.
     * @sample AWSKafkaAsync.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest createConfigurationRequest);

    /**
     * <p>
     * Creates a new MSK configuration.
     * </p>
     * 
     * @param createConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguration operation returned by the service.
     * @sample AWSKafkaAsyncHandler.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest createConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationRequest, CreateConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSKafkaAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSKafkaAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     * </p>
     * 
     * @param describeClusterRequest
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AWSKafkaAsync.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     * </p>
     * 
     * @param describeClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AWSKafkaAsyncHandler.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the cluster operation specified by the ARN.
     * </p>
     * 
     * @param describeClusterOperationRequest
     * @return A Java Future containing the result of the DescribeClusterOperation operation returned by the service.
     * @sample AWSKafkaAsync.DescribeClusterOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeClusterOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterOperationResult> describeClusterOperationAsync(DescribeClusterOperationRequest describeClusterOperationRequest);

    /**
     * <p>
     * Returns a description of the cluster operation specified by the ARN.
     * </p>
     * 
     * @param describeClusterOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterOperation operation returned by the service.
     * @sample AWSKafkaAsyncHandler.DescribeClusterOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeClusterOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterOperationResult> describeClusterOperationAsync(DescribeClusterOperationRequest describeClusterOperationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterOperationRequest, DescribeClusterOperationResult> asyncHandler);

    /**
     * <p>
     * Returns a description of this MSK configuration.
     * </p>
     * 
     * @param describeConfigurationRequest
     * @return A Java Future containing the result of the DescribeConfiguration operation returned by the service.
     * @sample AWSKafkaAsync.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest describeConfigurationRequest);

    /**
     * <p>
     * Returns a description of this MSK configuration.
     * </p>
     * 
     * @param describeConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfiguration operation returned by the service.
     * @sample AWSKafkaAsyncHandler.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest describeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRequest, DescribeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a description of this revision of the configuration.
     * </p>
     * 
     * @param describeConfigurationRevisionRequest
     * @return A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
     *         service.
     * @sample AWSKafkaAsync.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(
            DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest);

    /**
     * <p>
     * Returns a description of this revision of the configuration.
     * </p>
     * 
     * @param describeConfigurationRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
     *         service.
     * @sample AWSKafkaAsyncHandler.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(
            DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRevisionRequest, DescribeConfigurationRevisionResult> asyncHandler);

    /**
     * <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @return A Java Future containing the result of the GetBootstrapBrokers operation returned by the service.
     * @sample AWSKafkaAsync.GetBootstrapBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetBootstrapBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBootstrapBrokersResult> getBootstrapBrokersAsync(GetBootstrapBrokersRequest getBootstrapBrokersRequest);

    /**
     * <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBootstrapBrokers operation returned by the service.
     * @sample AWSKafkaAsyncHandler.GetBootstrapBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetBootstrapBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBootstrapBrokersResult> getBootstrapBrokersAsync(GetBootstrapBrokersRequest getBootstrapBrokersRequest,
            com.amazonaws.handlers.AsyncHandler<GetBootstrapBrokersRequest, GetBootstrapBrokersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the operations that have been performed on the specified MSK cluster.
     * </p>
     * 
     * @param listClusterOperationsRequest
     * @return A Java Future containing the result of the ListClusterOperations operation returned by the service.
     * @sample AWSKafkaAsync.ListClusterOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusterOperations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListClusterOperationsResult> listClusterOperationsAsync(ListClusterOperationsRequest listClusterOperationsRequest);

    /**
     * <p>
     * Returns a list of all the operations that have been performed on the specified MSK cluster.
     * </p>
     * 
     * @param listClusterOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusterOperations operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListClusterOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusterOperations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListClusterOperationsResult> listClusterOperationsAsync(ListClusterOperationsRequest listClusterOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListClusterOperationsRequest, ListClusterOperationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the MSK clusters in the current Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AWSKafkaAsync.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns a list of all the MSK clusters in the current Region.
     * </p>
     * 
     * @param listClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationRevisionsRequest
     * @return A Java Future containing the result of the ListConfigurationRevisions operation returned by the service.
     * @sample AWSKafkaAsync.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurationRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(
            ListConfigurationRevisionsRequest listConfigurationRevisionsRequest);

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationRevisions operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurationRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(
            ListConfigurationRevisionsRequest listConfigurationRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationRevisionsRequest, ListConfigurationRevisionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AWSKafkaAsync.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Kafka versions.
     * </p>
     * 
     * @param listKafkaVersionsRequest
     * @return A Java Future containing the result of the ListKafkaVersions operation returned by the service.
     * @sample AWSKafkaAsync.ListKafkaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListKafkaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKafkaVersionsResult> listKafkaVersionsAsync(ListKafkaVersionsRequest listKafkaVersionsRequest);

    /**
     * <p>
     * Returns a list of Kafka versions.
     * </p>
     * 
     * @param listKafkaVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKafkaVersions operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListKafkaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListKafkaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKafkaVersionsResult> listKafkaVersionsAsync(ListKafkaVersionsRequest listKafkaVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListKafkaVersionsRequest, ListKafkaVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @return A Java Future containing the result of the ListNodes operation returned by the service.
     * @sample AWSKafkaAsync.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNodes operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest listNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSKafkaAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSKafkaAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds tags to the specified MSK resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSKafkaAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to the specified MSK resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSKafkaAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the tags associated with the keys that are provided in the query.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSKafkaAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the tags associated with the keys that are provided in the query.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSKafkaAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the number of broker nodes in the cluster.
     * </p>
     * 
     * @param updateBrokerCountRequest
     * @return A Java Future containing the result of the UpdateBrokerCount operation returned by the service.
     * @sample AWSKafkaAsync.UpdateBrokerCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerCount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrokerCountResult> updateBrokerCountAsync(UpdateBrokerCountRequest updateBrokerCountRequest);

    /**
     * <p>
     * Updates the number of broker nodes in the cluster.
     * </p>
     * 
     * @param updateBrokerCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBrokerCount operation returned by the service.
     * @sample AWSKafkaAsyncHandler.UpdateBrokerCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerCount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrokerCountResult> updateBrokerCountAsync(UpdateBrokerCountRequest updateBrokerCountRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerCountRequest, UpdateBrokerCountResult> asyncHandler);

    /**
     * <p>
     * Updates the EBS storage associated with MSK brokers.
     * </p>
     * 
     * @param updateBrokerStorageRequest
     * @return A Java Future containing the result of the UpdateBrokerStorage operation returned by the service.
     * @sample AWSKafkaAsync.UpdateBrokerStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerStorage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrokerStorageResult> updateBrokerStorageAsync(UpdateBrokerStorageRequest updateBrokerStorageRequest);

    /**
     * <p>
     * Updates the EBS storage associated with MSK brokers.
     * </p>
     * 
     * @param updateBrokerStorageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBrokerStorage operation returned by the service.
     * @sample AWSKafkaAsyncHandler.UpdateBrokerStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerStorage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrokerStorageResult> updateBrokerStorageAsync(UpdateBrokerStorageRequest updateBrokerStorageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerStorageRequest, UpdateBrokerStorageResult> asyncHandler);

    /**
     * <p>
     * Updates the cluster with the configuration that is specified in the request body.
     * </p>
     * 
     * @param updateClusterConfigurationRequest
     * @return A Java Future containing the result of the UpdateClusterConfiguration operation returned by the service.
     * @sample AWSKafkaAsync.UpdateClusterConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateClusterConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterConfigurationResult> updateClusterConfigurationAsync(
            UpdateClusterConfigurationRequest updateClusterConfigurationRequest);

    /**
     * <p>
     * Updates the cluster with the configuration that is specified in the request body.
     * </p>
     * 
     * @param updateClusterConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClusterConfiguration operation returned by the service.
     * @sample AWSKafkaAsyncHandler.UpdateClusterConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateClusterConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterConfigurationResult> updateClusterConfigurationAsync(
            UpdateClusterConfigurationRequest updateClusterConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterConfigurationRequest, UpdateClusterConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the monitoring settings for the cluster. You can use this operation to specify which Apache Kafka metrics
     * you want Amazon MSK to send to Amazon CloudWatch. You can also specify settings for open monitoring with
     * Prometheus.
     * </p>
     * 
     * @param updateMonitoringRequest
     *        Request body for UpdateMonitoring.
     * @return A Java Future containing the result of the UpdateMonitoring operation returned by the service.
     * @sample AWSKafkaAsync.UpdateMonitoring
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateMonitoring" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitoringResult> updateMonitoringAsync(UpdateMonitoringRequest updateMonitoringRequest);

    /**
     * <p>
     * Updates the monitoring settings for the cluster. You can use this operation to specify which Apache Kafka metrics
     * you want Amazon MSK to send to Amazon CloudWatch. You can also specify settings for open monitoring with
     * Prometheus.
     * </p>
     * 
     * @param updateMonitoringRequest
     *        Request body for UpdateMonitoring.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMonitoring operation returned by the service.
     * @sample AWSKafkaAsyncHandler.UpdateMonitoring
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateMonitoring" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitoringResult> updateMonitoringAsync(UpdateMonitoringRequest updateMonitoringRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitoringRequest, UpdateMonitoringResult> asyncHandler);

}
