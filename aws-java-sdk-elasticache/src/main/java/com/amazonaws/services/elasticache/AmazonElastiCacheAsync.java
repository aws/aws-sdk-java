/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache;

import com.amazonaws.services.elasticache.model.*;

/**
 * Interface for accessing Amazon ElastiCache asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate,
 * and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With ElastiCache, customers gain all of the benefits of a high-performance,
 * in-memory cache with far less of the administrative burden of launching and
 * managing a distributed cache. The service makes setup, scaling, and cluster
 * failure handling much simpler than in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get
 * enhanced visibility into the key performance statistics associated with their
 * cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
public interface AmazonElastiCacheAsync extends AmazonElastiCache {

    /**
     * <p>
     * The <i>AddTagsToResource</i> action adds up to 10 cost allocation tags to
     * the named resource. A <i>cost allocation tag</i> is a key-value pair
     * where the key and value are case-sensitive. Cost allocation tags can be
     * used to categorize and track your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost
     * allocation report as a comma-separated value (CSV) file with your usage
     * and costs aggregated by your tags. You can apply tags that represent
     * business categories (such as cost centers, application names, or owners)
     * to organize your costs across multiple services. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Tagging.html"
     * >Using Cost Allocation Tags in Amazon ElastiCache</a> in the
     * <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an <i>AddTagsToResource</i> action.
     * @return A Java Future containing the result of the AddTagsToResource
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * The <i>AddTagsToResource</i> action adds up to 10 cost allocation tags to
     * the named resource. A <i>cost allocation tag</i> is a key-value pair
     * where the key and value are case-sensitive. Cost allocation tags can be
     * used to categorize and track your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost
     * allocation report as a comma-separated value (CSV) file with your usage
     * and costs aggregated by your tags. You can apply tags that represent
     * business categories (such as cost centers, application names, or owners)
     * to organize your costs across multiple services. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Tagging.html"
     * >Using Cost Allocation Tags in Amazon ElastiCache</a> in the
     * <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an <i>AddTagsToResource</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * The <i>AuthorizeCacheSecurityGroupIngress</i> action allows network
     * ingress to a cache security group. Applications using ElastiCache must be
     * running on Amazon EC2, and Amazon EC2 security groups are used as the
     * authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one
     * region to an ElastiCache cluster in another region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an
     *        <i>AuthorizeCacheSecurityGroupIngress</i> action.
     * @return A Java Future containing the result of the
     *         AuthorizeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.AuthorizeCacheSecurityGroupIngress
     */
    java.util.concurrent.Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest);

    /**
     * <p>
     * The <i>AuthorizeCacheSecurityGroupIngress</i> action allows network
     * ingress to a cache security group. Applications using ElastiCache must be
     * running on Amazon EC2, and Amazon EC2 security groups are used as the
     * authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one
     * region to an ElastiCache cluster in another region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an
     *        <i>AuthorizeCacheSecurityGroupIngress</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         AuthorizeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.AuthorizeCacheSecurityGroupIngress
     */
    java.util.concurrent.Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler);

    /**
     * <p>
     * The <i>CopySnapshot</i> action makes a copy of an existing snapshot.
     * </p>
     * <important>
     * <p>
     * Users or groups that have permissions to use the <i>CopySnapshot</i> API
     * can create their own Amazon S3 buckets and copy snapshots to it. To
     * control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <i>CopySnapshot</i> API. For more information
     * about using IAM to control the use of ElastiCache APIs, see <a href=
     * "http://docs.aws.amazon.com/ElastiCache/latest/Snapshots.Exporting.html"
     * >Exporting Snapshots</a> and <a
     * href="http://docs.aws.amazon.com/ElastiCache/latest/IAM.html"
     * >Authentication &amp; Access Control</a>.
     * </p>
     * </important>
     * <p class="title">
     * <b>Erorr Message:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient
     * permissions to perform the desired activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed
     * permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <i>CopySnapshotMessage</i> action.
     * @return A Java Future containing the result of the CopySnapshot operation
     *         returned by the service.
     * @sample AmazonElastiCacheAsync.CopySnapshot
     */
    java.util.concurrent.Future<Snapshot> copySnapshotAsync(
            CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * The <i>CopySnapshot</i> action makes a copy of an existing snapshot.
     * </p>
     * <important>
     * <p>
     * Users or groups that have permissions to use the <i>CopySnapshot</i> API
     * can create their own Amazon S3 buckets and copy snapshots to it. To
     * control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <i>CopySnapshot</i> API. For more information
     * about using IAM to control the use of ElastiCache APIs, see <a href=
     * "http://docs.aws.amazon.com/ElastiCache/latest/Snapshots.Exporting.html"
     * >Exporting Snapshots</a> and <a
     * href="http://docs.aws.amazon.com/ElastiCache/latest/IAM.html"
     * >Authentication &amp; Access Control</a>.
     * </p>
     * </important>
     * <p class="title">
     * <b>Erorr Message:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient
     * permissions to perform the desired activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed
     * permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <i>CopySnapshotMessage</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopySnapshot operation
     *         returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CopySnapshot
     */
    java.util.concurrent.Future<Snapshot> copySnapshotAsync(
            CopySnapshotRequest copySnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * The <i>CreateCacheCluster</i> action creates a cache cluster. All nodes
     * in the cache cluster run the same protocol-compliant cache engine
     * software, either Memcached or Redis.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a <i>CreateCacheCluster</i> action.
     * @return A Java Future containing the result of the CreateCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> createCacheClusterAsync(
            CreateCacheClusterRequest createCacheClusterRequest);

    /**
     * <p>
     * The <i>CreateCacheCluster</i> action creates a cache cluster. All nodes
     * in the cache cluster run the same protocol-compliant cache engine
     * software, either Memcached or Redis.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a <i>CreateCacheCluster</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> createCacheClusterAsync(
            CreateCacheClusterRequest createCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> action creates a new cache parameter
     * group. A cache parameter group is a collection of parameters that you
     * apply to all of the nodes in a cache cluster.
     * </p>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <i>CreateCacheParameterGroup</i> action.
     * @return A Java Future containing the result of the
     *         CreateCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheParameterGroup
     */
    java.util.concurrent.Future<CacheParameterGroup> createCacheParameterGroupAsync(
            CreateCacheParameterGroupRequest createCacheParameterGroupRequest);

    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> action creates a new cache parameter
     * group. A cache parameter group is a collection of parameters that you
     * apply to all of the nodes in a cache cluster.
     * </p>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <i>CreateCacheParameterGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheParameterGroup
     */
    java.util.concurrent.Future<CacheParameterGroup> createCacheParameterGroupAsync(
            CreateCacheParameterGroupRequest createCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheParameterGroupRequest, CacheParameterGroup> asyncHandler);

    /**
     * <p>
     * The <i>CreateCacheSecurityGroup</i> action creates a new cache security
     * group. Use a cache security group to control access to one or more cache
     * clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC). If you are creating a
     * cache cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <i>CreateCacheSecurityGroup</i> action.
     * @return A Java Future containing the result of the
     *         CreateCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheSecurityGroup
     */
    java.util.concurrent.Future<CacheSecurityGroup> createCacheSecurityGroupAsync(
            CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest);

    /**
     * <p>
     * The <i>CreateCacheSecurityGroup</i> action creates a new cache security
     * group. Use a cache security group to control access to one or more cache
     * clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC). If you are creating a
     * cache cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <i>CreateCacheSecurityGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheSecurityGroup
     */
    java.util.concurrent.Future<CacheSecurityGroup> createCacheSecurityGroupAsync(
            CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheSecurityGroupRequest, CacheSecurityGroup> asyncHandler);

    /**
     * <p>
     * The <i>CreateCacheSubnetGroup</i> action creates a new cache subnet
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon
     * Virtual Private Cloud (VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <i>CreateCacheSubnetGroup</i> action.
     * @return A Java Future containing the result of the CreateCacheSubnetGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheSubnetGroup
     */
    java.util.concurrent.Future<CacheSubnetGroup> createCacheSubnetGroupAsync(
            CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest);

    /**
     * <p>
     * The <i>CreateCacheSubnetGroup</i> action creates a new cache subnet
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon
     * Virtual Private Cloud (VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <i>CreateCacheSubnetGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCacheSubnetGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheSubnetGroup
     */
    java.util.concurrent.Future<CacheSubnetGroup> createCacheSubnetGroupAsync(
            CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler);

    /**
     * <p>
     * The <i>CreateReplicationGroup</i> action creates a replication group. A
     * replication group is a collection of cache clusters, where one of the
     * cache clusters is a read/write primary and the others are read-only
     * replicas. Writes to the primary are automatically propagated to the
     * replicas.
     * </p>
     * <p>
     * When you create a replication group, you must specify an existing cache
     * cluster that is in the primary role. When the replication group has been
     * successfully created, you can add one or more read replica replicas to
     * it, up to a total of five read replicas.
     * </p>
     * <note>
     * <p>
     * This action is valid only for Redis.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <i>CreateReplicationGroup</i> action.
     * @return A Java Future containing the result of the CreateReplicationGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateReplicationGroup
     */
    java.util.concurrent.Future<ReplicationGroup> createReplicationGroupAsync(
            CreateReplicationGroupRequest createReplicationGroupRequest);

    /**
     * <p>
     * The <i>CreateReplicationGroup</i> action creates a replication group. A
     * replication group is a collection of cache clusters, where one of the
     * cache clusters is a read/write primary and the others are read-only
     * replicas. Writes to the primary are automatically propagated to the
     * replicas.
     * </p>
     * <p>
     * When you create a replication group, you must specify an existing cache
     * cluster that is in the primary role. When the replication group has been
     * successfully created, you can add one or more read replica replicas to
     * it, up to a total of five read replicas.
     * </p>
     * <note>
     * <p>
     * This action is valid only for Redis.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <i>CreateReplicationGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateReplicationGroup
     */
    java.util.concurrent.Future<ReplicationGroup> createReplicationGroupAsync(
            CreateReplicationGroupRequest createReplicationGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationGroupRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * The <i>CreateSnapshot</i> action creates a copy of an entire cache
     * cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <i>CreateSnapshot</i> action.
     * @return A Java Future containing the result of the CreateSnapshot
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateSnapshot
     */
    java.util.concurrent.Future<Snapshot> createSnapshotAsync(
            CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * The <i>CreateSnapshot</i> action creates a copy of an entire cache
     * cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <i>CreateSnapshot</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateSnapshot
     */
    java.util.concurrent.Future<Snapshot> createSnapshotAsync(
            CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * The <i>DeleteCacheCluster</i> action deletes a previously provisioned
     * cache cluster. <i>DeleteCacheCluster</i> deletes all associated cache
     * nodes, node endpoints and the cache cluster itself. When you receive a
     * successful response from this action, Amazon ElastiCache immediately
     * begins deleting the cache cluster; you cannot cancel or revert this
     * action.
     * </p>
     * <p>
     * This API cannot be used to delete a cache cluster that is the last read
     * replica of a replication group that has Multi-AZ mode enabled.
     * </p>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <i>DeleteCacheCluster</i> action.
     * @return A Java Future containing the result of the DeleteCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> deleteCacheClusterAsync(
            DeleteCacheClusterRequest deleteCacheClusterRequest);

    /**
     * <p>
     * The <i>DeleteCacheCluster</i> action deletes a previously provisioned
     * cache cluster. <i>DeleteCacheCluster</i> deletes all associated cache
     * nodes, node endpoints and the cache cluster itself. When you receive a
     * successful response from this action, Amazon ElastiCache immediately
     * begins deleting the cache cluster; you cannot cancel or revert this
     * action.
     * </p>
     * <p>
     * This API cannot be used to delete a cache cluster that is the last read
     * replica of a replication group that has Multi-AZ mode enabled.
     * </p>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <i>DeleteCacheCluster</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> deleteCacheClusterAsync(
            DeleteCacheClusterRequest deleteCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> action deletes the specified cache
     * parameter group. You cannot delete a cache parameter group if it is
     * associated with any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <i>DeleteCacheParameterGroup</i> action.
     * @return A Java Future containing the result of the
     *         DeleteCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheParameterGroup
     */
    java.util.concurrent.Future<DeleteCacheParameterGroupResult> deleteCacheParameterGroupAsync(
            DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest);

    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> action deletes the specified cache
     * parameter group. You cannot delete a cache parameter group if it is
     * associated with any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <i>DeleteCacheParameterGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheParameterGroup
     */
    java.util.concurrent.Future<DeleteCacheParameterGroupResult> deleteCacheParameterGroupAsync(
            DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheParameterGroupRequest, DeleteCacheParameterGroupResult> asyncHandler);

    /**
     * <p>
     * The <i>DeleteCacheSecurityGroup</i> action deletes a cache security
     * group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any
     * cache clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <i>DeleteCacheSecurityGroup</i> action.
     * @return A Java Future containing the result of the
     *         DeleteCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheSecurityGroup
     */
    java.util.concurrent.Future<DeleteCacheSecurityGroupResult> deleteCacheSecurityGroupAsync(
            DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest);

    /**
     * <p>
     * The <i>DeleteCacheSecurityGroup</i> action deletes a cache security
     * group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any
     * cache clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <i>DeleteCacheSecurityGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheSecurityGroup
     */
    java.util.concurrent.Future<DeleteCacheSecurityGroupResult> deleteCacheSecurityGroupAsync(
            DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheSecurityGroupRequest, DeleteCacheSecurityGroupResult> asyncHandler);

    /**
     * <p>
     * The <i>DeleteCacheSubnetGroup</i> action deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any cache
     * clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <i>DeleteCacheSubnetGroup</i> action.
     * @return A Java Future containing the result of the DeleteCacheSubnetGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheSubnetGroup
     */
    java.util.concurrent.Future<DeleteCacheSubnetGroupResult> deleteCacheSubnetGroupAsync(
            DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest);

    /**
     * <p>
     * The <i>DeleteCacheSubnetGroup</i> action deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any cache
     * clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <i>DeleteCacheSubnetGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCacheSubnetGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheSubnetGroup
     */
    java.util.concurrent.Future<DeleteCacheSubnetGroupResult> deleteCacheSubnetGroupAsync(
            DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheSubnetGroupRequest, DeleteCacheSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * The <i>DeleteReplicationGroup</i> action deletes an existing replication
     * group. By default, this action deletes the entire replication group,
     * including the primary cluster and all of the read replicas. You can
     * optionally delete only the read replicas, while retaining the primary
     * cluster.
     * </p>
     * <p>
     * When you receive a successful response from this action, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <i>DeleteReplicationGroup</i> action.
     * @return A Java Future containing the result of the DeleteReplicationGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteReplicationGroup
     */
    java.util.concurrent.Future<ReplicationGroup> deleteReplicationGroupAsync(
            DeleteReplicationGroupRequest deleteReplicationGroupRequest);

    /**
     * <p>
     * The <i>DeleteReplicationGroup</i> action deletes an existing replication
     * group. By default, this action deletes the entire replication group,
     * including the primary cluster and all of the read replicas. You can
     * optionally delete only the read replicas, while retaining the primary
     * cluster.
     * </p>
     * <p>
     * When you receive a successful response from this action, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <i>DeleteReplicationGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteReplicationGroup
     */
    java.util.concurrent.Future<ReplicationGroup> deleteReplicationGroupAsync(
            DeleteReplicationGroupRequest deleteReplicationGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationGroupRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * The <i>DeleteSnapshot</i> action deletes an existing snapshot. When you
     * receive a successful response from this action, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <i>DeleteSnapshot</i> action.
     * @return A Java Future containing the result of the DeleteSnapshot
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteSnapshot
     */
    java.util.concurrent.Future<Snapshot> deleteSnapshotAsync(
            DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * The <i>DeleteSnapshot</i> action deletes an existing snapshot. When you
     * receive a successful response from this action, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <i>DeleteSnapshot</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteSnapshot
     */
    java.util.concurrent.Future<Snapshot> deleteSnapshotAsync(
            DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * The <i>DescribeCacheClusters</i> action returns information about all
     * provisioned cache clusters if no cache cluster identifier is specified,
     * or about a specific cache cluster if a cache cluster identifier is
     * supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the cache clusters(s) will be
     * returned. You can use the optional <i>ShowDetails</i> flag to retrieve
     * detailed information about the cache nodes associated with the cache
     * clusters. These details include the DNS address and port for the cache
     * node endpoint.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level information
     * will be displayed until all of the nodes are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level information
     * will be displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cache cluster, node
     * endpoint information and creation time for the additional nodes will not
     * be displayed until they are completely provisioned. When the cache
     * cluster state is <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cache cluster, no
     * endpoint information for the removed nodes is displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <i>DescribeCacheClusters</i> action.
     * @return A Java Future containing the result of the DescribeCacheClusters
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheClusters
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(
            DescribeCacheClustersRequest describeCacheClustersRequest);

    /**
     * <p>
     * The <i>DescribeCacheClusters</i> action returns information about all
     * provisioned cache clusters if no cache cluster identifier is specified,
     * or about a specific cache cluster if a cache cluster identifier is
     * supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the cache clusters(s) will be
     * returned. You can use the optional <i>ShowDetails</i> flag to retrieve
     * detailed information about the cache nodes associated with the cache
     * clusters. These details include the DNS address and port for the cache
     * node endpoint.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level information
     * will be displayed until all of the nodes are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level information
     * will be displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cache cluster, node
     * endpoint information and creation time for the additional nodes will not
     * be displayed until they are completely provisioned. When the cache
     * cluster state is <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cache cluster, no
     * endpoint information for the removed nodes is displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <i>DescribeCacheClusters</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheClusters
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheClusters
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(
            DescribeCacheClustersRequest describeCacheClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation.
     *
     * @see #describeCacheClustersAsync(DescribeCacheClustersRequest)
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync();

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation
     * with an AsyncHandler.
     *
     * @see #describeCacheClustersAsync(DescribeCacheClustersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
     * available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <i>DescribeCacheEngineVersions</i>
     *        action.
     * @return A Java Future containing the result of the
     *         DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheEngineVersions
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest);

    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
     * available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <i>DescribeCacheEngineVersions</i>
     *        action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheEngineVersions
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions
     * operation.
     *
     * @see #describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest)
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions
     * operation with an AsyncHandler.
     *
     * @see #describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> action returns a list of cache
     * parameter group descriptions. If a cache parameter group name is
     * specified, the list will contain only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <i>DescribeCacheParameterGroups</i>
     *        action.
     * @return A Java Future containing the result of the
     *         DescribeCacheParameterGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheParameterGroups
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest);

    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> action returns a list of cache
     * parameter group descriptions. If a cache parameter group name is
     * specified, the list will contain only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <i>DescribeCacheParameterGroups</i>
     *        action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeCacheParameterGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheParameterGroups
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups
     * operation.
     *
     * @see #describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest)
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups
     * operation with an AsyncHandler.
     *
     * @see #describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeCacheParameters</i> action returns the detailed parameter
     * list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <i>DescribeCacheParameters</i> action.
     * @return A Java Future containing the result of the
     *         DescribeCacheParameters operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheParameters
     */
    java.util.concurrent.Future<DescribeCacheParametersResult> describeCacheParametersAsync(
            DescribeCacheParametersRequest describeCacheParametersRequest);

    /**
     * <p>
     * The <i>DescribeCacheParameters</i> action returns the detailed parameter
     * list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <i>DescribeCacheParameters</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeCacheParameters operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheParameters
     */
    java.util.concurrent.Future<DescribeCacheParametersResult> describeCacheParametersAsync(
            DescribeCacheParametersRequest describeCacheParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParametersRequest, DescribeCacheParametersResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> action returns a list of cache
     * security group descriptions. If a cache security group name is specified,
     * the list will contain only the description of that group.
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <i>DescribeCacheSecurityGroups</i>
     *        action.
     * @return A Java Future containing the result of the
     *         DescribeCacheSecurityGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheSecurityGroups
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest);

    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> action returns a list of cache
     * security group descriptions. If a cache security group name is specified,
     * the list will contain only the description of that group.
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <i>DescribeCacheSecurityGroups</i>
     *        action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeCacheSecurityGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheSecurityGroups
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups
     * operation.
     *
     * @see #describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest)
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups
     * operation with an AsyncHandler.
     *
     * @see #describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the list
     * will contain only the description of that group.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <i>DescribeCacheSubnetGroups</i> action.
     * @return A Java Future containing the result of the
     *         DescribeCacheSubnetGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheSubnetGroups
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest);

    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the list
     * will contain only the description of that group.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <i>DescribeCacheSubnetGroups</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeCacheSubnetGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheSubnetGroups
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups
     * operation.
     *
     * @see #describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest)
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups
     * operation with an AsyncHandler.
     *
     * @see #describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeEngineDefaultParameters</i> action returns the default
     * engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <i>DescribeEngineDefaultParameters</i>
     *        action.
     * @return A Java Future containing the result of the
     *         DescribeEngineDefaultParameters operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.DescribeEngineDefaultParameters
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * The <i>DescribeEngineDefaultParameters</i> action returns the default
     * engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <i>DescribeEngineDefaultParameters</i>
     *        action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeEngineDefaultParameters operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeEngineDefaultParameters
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler);

    /**
     * <p>
     * The <i>DescribeEvents</i> action returns events related to cache
     * clusters, cache security groups, and cache parameter groups. You can
     * obtain events specific to a particular cache cluster, cache security
     * group, or cache parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned;
     * however, you can retrieve up to 14 days' worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <i>DescribeEvents</i> action.
     * @return A Java Future containing the result of the DescribeEvents
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeEvents
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * The <i>DescribeEvents</i> action returns events related to cache
     * clusters, cache security groups, and cache parameter groups. You can
     * obtain events specific to a particular cache cluster, cache security
     * group, or cache parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned;
     * however, you can retrieve up to 14 days' worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <i>DescribeEvents</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeEvents
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync();

    /**
     * Simplified method form for invoking the DescribeEvents operation with an
     * AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeReplicationGroups</i> action returns information about a
     * particular replication group. If no identifier is specified,
     * <i>DescribeReplicationGroups</i> returns information about all
     * replication groups.
     * </p>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <i>DescribeReplicationGroups</i> action.
     * @return A Java Future containing the result of the
     *         DescribeReplicationGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeReplicationGroups
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest);

    /**
     * <p>
     * The <i>DescribeReplicationGroups</i> action returns information about a
     * particular replication group. If no identifier is specified,
     * <i>DescribeReplicationGroups</i> returns information about all
     * replication groups.
     * </p>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <i>DescribeReplicationGroups</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeReplicationGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeReplicationGroups
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReplicationGroups
     * operation.
     *
     * @see #describeReplicationGroupsAsync(DescribeReplicationGroupsRequest)
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeReplicationGroups
     * operation with an AsyncHandler.
     *
     * @see #describeReplicationGroupsAsync(DescribeReplicationGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> action returns information about
     * reserved cache nodes for this account, or about a specified reserved
     * cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <i>DescribeReservedCacheNodes</i>
     *        action.
     * @return A Java Future containing the result of the
     *         DescribeReservedCacheNodes operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeReservedCacheNodes
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest);

    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> action returns information about
     * reserved cache nodes for this account, or about a specified reserved
     * cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <i>DescribeReservedCacheNodes</i>
     *        action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeReservedCacheNodes operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeReservedCacheNodes
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes
     * operation.
     *
     * @see #describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync();

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes
     * operation with an AsyncHandler.
     *
     * @see #describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a
     *        <i>DescribeReservedCacheNodesOfferings</i> action.
     * @return A Java Future containing the result of the
     *         DescribeReservedCacheNodesOfferings operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.DescribeReservedCacheNodesOfferings
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest);

    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a
     *        <i>DescribeReservedCacheNodesOfferings</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeReservedCacheNodesOfferings operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeReservedCacheNodesOfferings
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the
     * DescribeReservedCacheNodesOfferings operation.
     *
     * @see #describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync();

    /**
     * Simplified method form for invoking the
     * DescribeReservedCacheNodesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler);

    /**
     * <p>
     * The <i>DescribeSnapshots</i> action returns information about cache
     * cluster snapshots. By default, <i>DescribeSnapshots</i> lists all of your
     * snapshots; it can optionally describe a single snapshot, or just the
     * snapshots associated with a particular cache cluster.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <i>DescribeSnapshotsMessage</i> action.
     * @return A Java Future containing the result of the DescribeSnapshots
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeSnapshots
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * The <i>DescribeSnapshots</i> action returns information about cache
     * cluster snapshots. By default, <i>DescribeSnapshots</i> lists all of your
     * snapshots; it can optionally describe a single snapshot, or just the
     * snapshots associated with a particular cache cluster.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <i>DescribeSnapshotsMessage</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeSnapshots
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with
     * an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * The <code>ListAllowedNodeTypeModifications</code> action lists all
     * available node types that you can scale your Redis cluster's or
     * replication group's current node type up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code> APIs to scale up your cluster or
     * replication group, the value of the <i>CacheNodeType</i> parameter must
     * be one of the node types returned by this action.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the
     *        <i>ListAllowedNodeTypeModifications</i> action.
     * @return A Java Future containing the result of the
     *         ListAllowedNodeTypeModifications operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.ListAllowedNodeTypeModifications
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest);

    /**
     * <p>
     * The <code>ListAllowedNodeTypeModifications</code> action lists all
     * available node types that you can scale your Redis cluster's or
     * replication group's current node type up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code> APIs to scale up your cluster or
     * replication group, the value of the <i>CacheNodeType</i> parameter must
     * be one of the node types returned by this action.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the
     *        <i>ListAllowedNodeTypeModifications</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListAllowedNodeTypeModifications operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.ListAllowedNodeTypeModifications
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications
     * operation.
     *
     * @see #listAllowedNodeTypeModificationsAsync(ListAllowedNodeTypeModificationsRequest)
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync();

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications
     * operation with an AsyncHandler.
     *
     * @see #listAllowedNodeTypeModificationsAsync(ListAllowedNodeTypeModificationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler);

    /**
     * <p>
     * The <i>ListTagsForResource</i> action lists all cost allocation tags
     * currently on the named resource. A <i>cost allocation tag</i> is a
     * key-value pair where the key is case-sensitive and the value is optional.
     * Cost allocation tags can be used to categorize and track your AWS costs.
     * </p>
     * <p>
     * You can have a maximum of 10 cost allocation tags on an ElastiCache
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/BestPractices.html"
     * >Using Cost Allocation Tags in Amazon ElastiCache</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <i>ListTagsForResource</i> action.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * The <i>ListTagsForResource</i> action lists all cost allocation tags
     * currently on the named resource. A <i>cost allocation tag</i> is a
     * key-value pair where the key is case-sensitive and the value is optional.
     * Cost allocation tags can be used to categorize and track your AWS costs.
     * </p>
     * <p>
     * You can have a maximum of 10 cost allocation tags on an ElastiCache
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/BestPractices.html"
     * >Using Cost Allocation Tags in Amazon ElastiCache</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <i>ListTagsForResource</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * The <i>ModifyCacheCluster</i> action modifies the settings for a cache
     * cluster. You can use this action to change one or more cluster
     * configuration parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <i>ModifyCacheCluster</i> action.
     * @return A Java Future containing the result of the ModifyCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> modifyCacheClusterAsync(
            ModifyCacheClusterRequest modifyCacheClusterRequest);

    /**
     * <p>
     * The <i>ModifyCacheCluster</i> action modifies the settings for a cache
     * cluster. You can use this action to change one or more cluster
     * configuration parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <i>ModifyCacheCluster</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> modifyCacheClusterAsync(
            ModifyCacheClusterRequest modifyCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> action modifies the parameters of a
     * cache parameter group. You can modify up to 20 parameters in a single
     * request by submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <i>ModifyCacheParameterGroup</i> action.
     * @return A Java Future containing the result of the
     *         ModifyCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyCacheParameterGroup
     */
    java.util.concurrent.Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest);

    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> action modifies the parameters of a
     * cache parameter group. You can modify up to 20 parameters in a single
     * request by submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <i>ModifyCacheParameterGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ModifyCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyCacheParameterGroup
     */
    java.util.concurrent.Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheParameterGroupRequest, ModifyCacheParameterGroupResult> asyncHandler);

    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> action modifies an existing cache
     * subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <i>ModifyCacheSubnetGroup</i> action.
     * @return A Java Future containing the result of the ModifyCacheSubnetGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyCacheSubnetGroup
     */
    java.util.concurrent.Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(
            ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest);

    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> action modifies an existing cache
     * subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <i>ModifyCacheSubnetGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCacheSubnetGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyCacheSubnetGroup
     */
    java.util.concurrent.Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(
            ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler);

    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> action modifies the settings for a
     * replication group.
     * </p>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <i>ModifyReplicationGroups</i> action.
     * @return A Java Future containing the result of the ModifyReplicationGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyReplicationGroup
     */
    java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupAsync(
            ModifyReplicationGroupRequest modifyReplicationGroupRequest);

    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> action modifies the settings for a
     * replication group.
     * </p>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <i>ModifyReplicationGroups</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReplicationGroup
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyReplicationGroup
     */
    java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupAsync(
            ModifyReplicationGroupRequest modifyReplicationGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationGroupRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> action allows you to
     * purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a
     *        <i>PurchaseReservedCacheNodesOffering</i> action.
     * @return A Java Future containing the result of the
     *         PurchaseReservedCacheNodesOffering operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.PurchaseReservedCacheNodesOffering
     */
    java.util.concurrent.Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest);

    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> action allows you to
     * purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a
     *        <i>PurchaseReservedCacheNodesOffering</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         PurchaseReservedCacheNodesOffering operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.PurchaseReservedCacheNodesOffering
     */
    java.util.concurrent.Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedCacheNodesOfferingRequest, ReservedCacheNode> asyncHandler);

    /**
     * <p>
     * The <i>RebootCacheCluster</i> action reboots some, or all, of the cache
     * nodes within a provisioned cache cluster. This API will apply any
     * modified cache parameter groups to the cache cluster. The reboot action
     * takes place as soon as possible, and results in a momentary outage to the
     * cache cluster. During the reboot, the cache cluster status is set to
     * REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being
     * rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cache cluster event is created.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <i>RebootCacheCluster</i> action.
     * @return A Java Future containing the result of the RebootCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.RebootCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> rebootCacheClusterAsync(
            RebootCacheClusterRequest rebootCacheClusterRequest);

    /**
     * <p>
     * The <i>RebootCacheCluster</i> action reboots some, or all, of the cache
     * nodes within a provisioned cache cluster. This API will apply any
     * modified cache parameter groups to the cache cluster. The reboot action
     * takes place as soon as possible, and results in a momentary outage to the
     * cache cluster. During the reboot, the cache cluster status is set to
     * REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being
     * rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cache cluster event is created.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <i>RebootCacheCluster</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootCacheCluster
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.RebootCacheCluster
     */
    java.util.concurrent.Future<CacheCluster> rebootCacheClusterAsync(
            RebootCacheClusterRequest rebootCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RebootCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * The <i>RemoveTagsFromResource</i> action removes the tags identified by
     * the <code>TagKeys</code> list from the named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <i>RemoveTagsFromResource</i> action.
     * @return A Java Future containing the result of the RemoveTagsFromResource
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsync.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * The <i>RemoveTagsFromResource</i> action removes the tags identified by
     * the <code>TagKeys</code> list from the named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <i>RemoveTagsFromResource</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource
     *         operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * The <i>ResetCacheParameterGroup</i> action modifies the parameters of a
     * cache parameter group to the engine or system default value. You can
     * reset specific parameters by submitting a list of parameter names. To
     * reset the entire cache parameter group, specify the
     * <i>ResetAllParameters</i> and <i>CacheParameterGroupName</i> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <i>ResetCacheParameterGroup</i> action.
     * @return A Java Future containing the result of the
     *         ResetCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.ResetCacheParameterGroup
     */
    java.util.concurrent.Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(
            ResetCacheParameterGroupRequest resetCacheParameterGroupRequest);

    /**
     * <p>
     * The <i>ResetCacheParameterGroup</i> action modifies the parameters of a
     * cache parameter group to the engine or system default value. You can
     * reset specific parameters by submitting a list of parameter names. To
     * reset the entire cache parameter group, specify the
     * <i>ResetAllParameters</i> and <i>CacheParameterGroupName</i> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <i>ResetCacheParameterGroup</i> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ResetCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ResetCacheParameterGroup
     */
    java.util.concurrent.Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(
            ResetCacheParameterGroupRequest resetCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetCacheParameterGroupRequest, ResetCacheParameterGroupResult> asyncHandler);

    /**
     * <p>
     * The <i>RevokeCacheSecurityGroupIngress</i> action revokes ingress from a
     * cache security group. Use this action to disallow access from an Amazon
     * EC2 security group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <i>RevokeCacheSecurityGroupIngress</i>
     *        action.
     * @return A Java Future containing the result of the
     *         RevokeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.RevokeCacheSecurityGroupIngress
     */
    java.util.concurrent.Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest);

    /**
     * <p>
     * The <i>RevokeCacheSecurityGroupIngress</i> action revokes ingress from a
     * cache security group. Use this action to disallow access from an Amazon
     * EC2 security group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <i>RevokeCacheSecurityGroupIngress</i>
     *        action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         RevokeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.RevokeCacheSecurityGroupIngress
     */
    java.util.concurrent.Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler);

}
