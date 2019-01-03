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
package com.amazonaws.services.dax;

import javax.annotation.Generated;

import com.amazonaws.services.dax.model.*;

/**
 * Interface for accessing Amazon DAX asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dax.AbstractAmazonDaxAsync} instead.
 * </p>
 * <p>
 * <p>
 * DAX is a managed caching service engineered for Amazon DynamoDB. DAX dramatically speeds up database reads by caching
 * frequently-accessed data from DynamoDB, so applications can access that data with sub-millisecond latency. You can
 * create a DAX cluster easily, using the AWS Management Console. With a few simple modifications to your code, your
 * application can begin taking advantage of the DAX cluster and realize significant improvements in read performance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDaxAsync extends AmazonDax {

    /**
     * <p>
     * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonDaxAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonDaxAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes
     * in a DAX cluster.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @return A Java Future containing the result of the CreateParameterGroup operation returned by the service.
     * @sample AmazonDaxAsync.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest createParameterGroupRequest);

    /**
     * <p>
     * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes
     * in a DAX cluster.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateParameterGroup operation returned by the service.
     * @sample AmazonDaxAsyncHandler.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest createParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateParameterGroupRequest, CreateParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new subnet group.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @return A Java Future containing the result of the CreateSubnetGroup operation returned by the service.
     * @sample AmazonDaxAsync.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest createSubnetGroupRequest);

    /**
     * <p>
     * Creates a new subnet group.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubnetGroup operation returned by the service.
     * @sample AmazonDaxAsyncHandler.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest createSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubnetGroupRequest, CreateSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Removes one or more nodes from a DAX cluster.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>DecreaseReplicationFactor</code> to remove the last node in a DAX cluster. If you need to do
     * this, use <code>DeleteCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param decreaseReplicationFactorRequest
     * @return A Java Future containing the result of the DecreaseReplicationFactor operation returned by the service.
     * @sample AmazonDaxAsync.DecreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DecreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DecreaseReplicationFactorResult> decreaseReplicationFactorAsync(
            DecreaseReplicationFactorRequest decreaseReplicationFactorRequest);

    /**
     * <p>
     * Removes one or more nodes from a DAX cluster.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>DecreaseReplicationFactor</code> to remove the last node in a DAX cluster. If you need to do
     * this, use <code>DeleteCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param decreaseReplicationFactorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DecreaseReplicationFactor operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DecreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DecreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DecreaseReplicationFactorResult> decreaseReplicationFactorAsync(
            DecreaseReplicationFactorRequest decreaseReplicationFactorRequest,
            com.amazonaws.handlers.AsyncHandler<DecreaseReplicationFactorRequest, DecreaseReplicationFactorResult> asyncHandler);

    /**
     * <p>
     * Deletes a previously provisioned DAX cluster. <i>DeleteCluster</i> deletes all associated nodes, node endpoints
     * and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins
     * deleting the cluster; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonDaxAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes a previously provisioned DAX cluster. <i>DeleteCluster</i> deletes all associated nodes, node endpoints
     * and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins
     * deleting the cluster; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX
     * clusters.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @return A Java Future containing the result of the DeleteParameterGroup operation returned by the service.
     * @sample AmazonDaxAsync.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest deleteParameterGroupRequest);

    /**
     * <p>
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX
     * clusters.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteParameterGroup operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest deleteParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteParameterGroupRequest, DeleteParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a subnet group if it is associated with any DAX clusters.
     * </p>
     * </note>
     * 
     * @param deleteSubnetGroupRequest
     * @return A Java Future containing the result of the DeleteSubnetGroup operation returned by the service.
     * @sample AmazonDaxAsync.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest deleteSubnetGroupRequest);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a subnet group if it is associated with any DAX clusters.
     * </p>
     * </note>
     * 
     * @param deleteSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubnetGroup operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest deleteSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubnetGroupRequest, DeleteSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific
     * DAX cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes
     * are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level information will be displayed.
     * </p>
     * <p>
     * If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the
     * additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeClustersRequest
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonDaxAsync.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific
     * DAX cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes
     * are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level information will be displayed.
     * </p>
     * <p>
     * If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the
     * additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * <p>
     * Returns the default system parameter information for the DAX caching software.
     * </p>
     * 
     * @param describeDefaultParametersRequest
     * @return A Java Future containing the result of the DescribeDefaultParameters operation returned by the service.
     * @sample AmazonDaxAsync.DescribeDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeDefaultParameters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDefaultParametersResult> describeDefaultParametersAsync(
            DescribeDefaultParametersRequest describeDefaultParametersRequest);

    /**
     * <p>
     * Returns the default system parameter information for the DAX caching software.
     * </p>
     * 
     * @param describeDefaultParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDefaultParameters operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DescribeDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeDefaultParameters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDefaultParametersResult> describeDefaultParametersAsync(
            DescribeDefaultParametersRequest describeDefaultParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDefaultParametersRequest, DescribeDefaultParametersResult> asyncHandler);

    /**
     * <p>
     * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX
     * cluster or parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonDaxAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX
     * cluster or parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain
     * only the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @return A Java Future containing the result of the DescribeParameterGroups operation returned by the service.
     * @sample AmazonDaxAsync.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest describeParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain
     * only the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeParameterGroups operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest describeParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeParameterGroupsRequest, DescribeParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AmazonDaxAsync.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @return A Java Future containing the result of the DescribeSubnetGroups operation returned by the service.
     * @sample AmazonDaxAsync.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest describeSubnetGroupsRequest);

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubnetGroups operation returned by the service.
     * @sample AmazonDaxAsyncHandler.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest describeSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetGroupsRequest, DescribeSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Adds one or more nodes to a DAX cluster.
     * </p>
     * 
     * @param increaseReplicationFactorRequest
     * @return A Java Future containing the result of the IncreaseReplicationFactor operation returned by the service.
     * @sample AmazonDaxAsync.IncreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/IncreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<IncreaseReplicationFactorResult> increaseReplicationFactorAsync(
            IncreaseReplicationFactorRequest increaseReplicationFactorRequest);

    /**
     * <p>
     * Adds one or more nodes to a DAX cluster.
     * </p>
     * 
     * @param increaseReplicationFactorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IncreaseReplicationFactor operation returned by the service.
     * @sample AmazonDaxAsyncHandler.IncreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/IncreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<IncreaseReplicationFactorResult> increaseReplicationFactorAsync(
            IncreaseReplicationFactorRequest increaseReplicationFactorRequest,
            com.amazonaws.handlers.AsyncHandler<IncreaseReplicationFactorRequest, IncreaseReplicationFactorResult> asyncHandler);

    /**
     * <p>
     * List all of the tags for a DAX cluster. You can call <code>ListTags</code> up to 10 times per second, per
     * account.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonDaxAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * List all of the tags for a DAX cluster. You can call <code>ListTags</code> up to 10 times per second, per
     * account.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonDaxAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the
     * node status is set to REBOOTING.
     * </p>
     * 
     * @param rebootNodeRequest
     * @return A Java Future containing the result of the RebootNode operation returned by the service.
     * @sample AmazonDaxAsync.RebootNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/RebootNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootNodeResult> rebootNodeAsync(RebootNodeRequest rebootNodeRequest);

    /**
     * <p>
     * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the
     * node status is set to REBOOTING.
     * </p>
     * 
     * @param rebootNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootNode operation returned by the service.
     * @sample AmazonDaxAsyncHandler.RebootNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/RebootNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootNodeResult> rebootNodeAsync(RebootNodeRequest rebootNodeRequest,
            com.amazonaws.handlers.AsyncHandler<RebootNodeRequest, RebootNodeResult> asyncHandler);

    /**
     * <p>
     * Associates a set of tags with a DAX resource. You can call <code>TagResource</code> up to 5 times per second, per
     * account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDaxAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a set of tags with a DAX resource. You can call <code>TagResource</code> up to 5 times per second, per
     * account.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDaxAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the association of tags from a DAX resource. You can call <code>UntagResource</code> up to 5 times per
     * second, per account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDaxAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a DAX resource. You can call <code>UntagResource</code> up to 5 times per
     * second, per account.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDaxAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonDaxAsync.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonDaxAsyncHandler.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @return A Java Future containing the result of the UpdateParameterGroup operation returned by the service.
     * @sample AmazonDaxAsync.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest updateParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateParameterGroup operation returned by the service.
     * @sample AmazonDaxAsyncHandler.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest updateParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateParameterGroupRequest, UpdateParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing subnet group.
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @return A Java Future containing the result of the UpdateSubnetGroup operation returned by the service.
     * @sample AmazonDaxAsync.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest updateSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing subnet group.
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubnetGroup operation returned by the service.
     * @sample AmazonDaxAsyncHandler.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest updateSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubnetGroupRequest, UpdateSubnetGroupResult> asyncHandler);

}
