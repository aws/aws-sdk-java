/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticache.model.*;

/**
 * Interface for accessing Amazon ElastiCache.
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
public interface AmazonElastiCache {

    /**
     * Overrides the default endpoint for this client
     * ("elasticache.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "elasticache.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "elasticache.us-east-1.amazonaws.com"). If the protocol is
     * not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elasticache.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "elasticache.us-east-1.amazonaws.com") of the region specific AWS
     *        endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonElastiCache#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the AddTagsToResource operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing
     *         snapshot.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the
     *         resource to have more than the allowed number of tags. The
     *         maximum number of tags permitted on a resource is 10.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AmazonElastiCache.AddTagsToResource
     */
    AddTagsToResourceResult addTagsToResource(
            AddTagsToResourceRequest addTagsToResourceRequest);

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
     * @return Result of the AuthorizeCacheSecurityGroupIngress operation
     *         returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow
     *         deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified Amazon EC2 security group is already authorized for
     *         the specified cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.AuthorizeCacheSecurityGroupIngress
     */
    CacheSecurityGroup authorizeCacheSecurityGroupIngress(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest);

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
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing
     *         snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         maximum number of snapshots.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested
     *         action to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CopySnapshot
     */
    Snapshot copySnapshot(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * The <i>CreateCacheCluster</i> action creates a cache cluster. All nodes
     * in the cache cluster run the same protocol-compliant cache engine
     * software, either Memcached or Redis.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a <i>CreateCacheCluster</i> action.
     * @return Result of the CreateCacheCluster operation returned by the
     *         service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <i>available</i>
     *         state.
     * @throws CacheClusterAlreadyExistsException
     *         You already have a cache cluster with the given identifier.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified
     *         Availability Zone.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an
     *         existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache clusters per customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes in a single cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the
     *         resource to have more than the allowed number of tags. The
     *         maximum number of tags permitted on a resource is 10.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheCluster
     */
    CacheCluster createCacheCluster(
            CreateCacheClusterRequest createCacheClusterRequest);

    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> action creates a new cache parameter
     * group. A cache parameter group is a collection of parameters that you
     * apply to all of the nodes in a cache cluster.
     * </p>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <i>CreateCacheParameterGroup</i> action.
     * @return Result of the CreateCacheParameterGroup operation returned by the
     *         service.
     * @throws CacheParameterGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         maximum number of cache security groups.
     * @throws CacheParameterGroupAlreadyExistsException
     *         A cache parameter group with the requested name already exists.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the
     *         requested action to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheParameterGroup
     */
    CacheParameterGroup createCacheParameterGroup(
            CreateCacheParameterGroupRequest createCacheParameterGroupRequest);

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
     * @return Result of the CreateCacheSecurityGroup operation returned by the
     *         service.
     * @throws CacheSecurityGroupAlreadyExistsException
     *         A cache security group with the specified name already exists.
     * @throws CacheSecurityGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache security groups.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheSecurityGroup
     */
    CacheSecurityGroup createCacheSecurityGroup(
            CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest);

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
     * @return Result of the CreateCacheSubnetGroup operation returned by the
     *         service.
     * @throws CacheSubnetGroupAlreadyExistsException
     *         The requested cache subnet group name is already in use by an
     *         existing cache subnet group.
     * @throws CacheSubnetGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache subnet groups.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of subnets in a cache subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @sample AmazonElastiCache.CreateCacheSubnetGroup
     */
    CacheSubnetGroup createCacheSubnetGroup(
            CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest);

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
     * @return Result of the CreateReplicationGroup operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <i>available</i> state.
     * @throws ReplicationGroupAlreadyExistsException
     *         The specified replication group already exists.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified
     *         Availability Zone.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an
     *         existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache clusters per customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes in a single cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the
     *         resource to have more than the allowed number of tags. The
     *         maximum number of tags permitted on a resource is 10.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateReplicationGroup
     */
    ReplicationGroup createReplicationGroup(
            CreateReplicationGroupRequest createReplicationGroupRequest);

    /**
     * <p>
     * The <i>CreateSnapshot</i> action creates a copy of an entire cache
     * cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <i>CreateSnapshot</i> action.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <i>available</i> state.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         maximum number of snapshots.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following actions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cache cluster running on a
     *         <i>t1.micro</i> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cache cluster that is running Memcached
     *         rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.CreateSnapshot
     */
    Snapshot createSnapshot(CreateSnapshotRequest createSnapshotRequest);

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
     * @return Result of the DeleteCacheCluster operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <i>available</i> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following actions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cache cluster running on a
     *         <i>t1.micro</i> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cache cluster that is running Memcached
     *         rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheCluster
     */
    CacheCluster deleteCacheCluster(
            DeleteCacheClusterRequest deleteCacheClusterRequest);

    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> action deletes the specified cache
     * parameter group. You cannot delete a cache parameter group if it is
     * associated with any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <i>DeleteCacheParameterGroup</i> action.
     * @return Result of the DeleteCacheParameterGroup operation returned by the
     *         service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the
     *         requested action to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheParameterGroup
     */
    DeleteCacheParameterGroupResult deleteCacheParameterGroup(
            DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest);

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
     * @return Result of the DeleteCacheSecurityGroup operation returned by the
     *         service.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow
     *         deletion.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheSecurityGroup
     */
    DeleteCacheSecurityGroupResult deleteCacheSecurityGroup(
            DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest);

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
     * @return Result of the DeleteCacheSubnetGroup operation returned by the
     *         service.
     * @throws CacheSubnetGroupInUseException
     *         The requested cache subnet group is currently in use.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an
     *         existing cache subnet group.
     * @sample AmazonElastiCache.DeleteCacheSubnetGroup
     */
    DeleteCacheSubnetGroupResult deleteCacheSubnetGroup(
            DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest);

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
     * @return Result of the DeleteReplicationGroup operation returned by the
     *         service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <i>available</i>
     *         state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following actions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cache cluster running on a
     *         <i>t1.micro</i> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cache cluster that is running Memcached
     *         rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteReplicationGroup
     */
    ReplicationGroup deleteReplicationGroup(
            DeleteReplicationGroupRequest deleteReplicationGroupRequest);

    /**
     * <p>
     * The <i>DeleteSnapshot</i> action deletes an existing snapshot. When you
     * receive a successful response from this action, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <i>DeleteSnapshot</i> action.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing
     *         snapshot.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested
     *         action to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteSnapshot
     */
    Snapshot deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

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
     * @return Result of the DescribeCacheClusters operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheClusters
     */
    DescribeCacheClustersResult describeCacheClusters(
            DescribeCacheClustersRequest describeCacheClustersRequest);

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation.
     *
     * @see #describeCacheClusters(DescribeCacheClustersRequest)
     */
    DescribeCacheClustersResult describeCacheClusters();

    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
     * available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <i>DescribeCacheEngineVersions</i>
     *        action.
     * @return Result of the DescribeCacheEngineVersions operation returned by
     *         the service.
     * @sample AmazonElastiCache.DescribeCacheEngineVersions
     */
    DescribeCacheEngineVersionsResult describeCacheEngineVersions(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions
     * operation.
     *
     * @see #describeCacheEngineVersions(DescribeCacheEngineVersionsRequest)
     */
    DescribeCacheEngineVersionsResult describeCacheEngineVersions();

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
     * @return Result of the DescribeCacheParameterGroups operation returned by
     *         the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameterGroups
     */
    DescribeCacheParameterGroupsResult describeCacheParameterGroups(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups
     * operation.
     *
     * @see #describeCacheParameterGroups(DescribeCacheParameterGroupsRequest)
     */
    DescribeCacheParameterGroupsResult describeCacheParameterGroups();

    /**
     * <p>
     * The <i>DescribeCacheParameters</i> action returns the detailed parameter
     * list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <i>DescribeCacheParameters</i> action.
     * @return Result of the DescribeCacheParameters operation returned by the
     *         service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameters
     */
    DescribeCacheParametersResult describeCacheParameters(
            DescribeCacheParametersRequest describeCacheParametersRequest);

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
     * @return Result of the DescribeCacheSecurityGroups operation returned by
     *         the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheSecurityGroups
     */
    DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups
     * operation.
     *
     * @see #describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest)
     */
    DescribeCacheSecurityGroupsResult describeCacheSecurityGroups();

    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the list
     * will contain only the description of that group.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <i>DescribeCacheSubnetGroups</i> action.
     * @return Result of the DescribeCacheSubnetGroups operation returned by the
     *         service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an
     *         existing cache subnet group.
     * @sample AmazonElastiCache.DescribeCacheSubnetGroups
     */
    DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups
     * operation.
     *
     * @see #describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest)
     */
    DescribeCacheSubnetGroupsResult describeCacheSubnetGroups();

    /**
     * <p>
     * The <i>DescribeEngineDefaultParameters</i> action returns the default
     * engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <i>DescribeEngineDefaultParameters</i>
     *        action.
     * @return Result of the DescribeEngineDefaultParameters operation returned
     *         by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEngineDefaultParameters
     */
    EngineDefaults describeEngineDefaultParameters(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

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
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEvents
     */
    DescribeEventsResult describeEvents(
            DescribeEventsRequest describeEventsRequest);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEvents(DescribeEventsRequest)
     */
    DescribeEventsResult describeEvents();

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
     * @return Result of the DescribeReplicationGroups operation returned by the
     *         service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReplicationGroups
     */
    DescribeReplicationGroupsResult describeReplicationGroups(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeReplicationGroups
     * operation.
     *
     * @see #describeReplicationGroups(DescribeReplicationGroupsRequest)
     */
    DescribeReplicationGroupsResult describeReplicationGroups();

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
     * @return Result of the DescribeReservedCacheNodes operation returned by
     *         the service.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodes
     */
    DescribeReservedCacheNodesResult describeReservedCacheNodes(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes
     * operation.
     *
     * @see #describeReservedCacheNodes(DescribeReservedCacheNodesRequest)
     */
    DescribeReservedCacheNodesResult describeReservedCacheNodes();

    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a
     *        <i>DescribeReservedCacheNodesOfferings</i> action.
     * @return Result of the DescribeReservedCacheNodesOfferings operation
     *         returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodesOfferings
     */
    DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest);

    /**
     * Simplified method form for invoking the
     * DescribeReservedCacheNodesOfferings operation.
     *
     * @see #describeReservedCacheNodesOfferings(DescribeReservedCacheNodesOfferingsRequest)
     */
    DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings();

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
     * @return Result of the DescribeSnapshots operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing
     *         snapshot.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeSnapshots
     */
    DescribeSnapshotsResult describeSnapshots(
            DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshots(DescribeSnapshotsRequest)
     */
    DescribeSnapshotsResult describeSnapshots();

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
     * @return Result of the ListAllowedNodeTypeModifications operation returned
     *         by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.ListAllowedNodeTypeModifications
     */
    ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest);

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications
     * operation.
     *
     * @see #listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest)
     */
    ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications();

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
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing
     *         snapshot.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AmazonElastiCache.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * The <i>ModifyCacheCluster</i> action modifies the settings for a cache
     * cluster. You can use this action to change one or more cluster
     * configuration parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <i>ModifyCacheCluster</i> action.
     * @return Result of the ModifyCacheCluster operation returned by the
     *         service.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <i>available</i> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow
     *         deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified
     *         Availability Zone.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes in a single cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyCacheCluster
     */
    CacheCluster modifyCacheCluster(
            ModifyCacheClusterRequest modifyCacheClusterRequest);

    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> action modifies the parameters of a
     * cache parameter group. You can modify up to 20 parameters in a single
     * request by submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <i>ModifyCacheParameterGroup</i> action.
     * @return Result of the ModifyCacheParameterGroup operation returned by the
     *         service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the
     *         requested action to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyCacheParameterGroup
     */
    ModifyCacheParameterGroupResult modifyCacheParameterGroup(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest);

    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> action modifies an existing cache
     * subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <i>ModifyCacheSubnetGroup</i> action.
     * @return Result of the ModifyCacheSubnetGroup operation returned by the
     *         service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an
     *         existing cache subnet group.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of subnets in a cache subnet group.
     * @throws SubnetInUseException
     *         The requested subnet is being used by another cache subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @sample AmazonElastiCache.ModifyCacheSubnetGroup
     */
    CacheSubnetGroup modifyCacheSubnetGroup(
            ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest);

    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> action modifies the settings for a
     * replication group.
     * </p>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <i>ModifyReplicationGroups</i> action.
     * @return Result of the ModifyReplicationGroup operation returned by the
     *         service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <i>available</i>
     *         state.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <i>available</i> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow
     *         deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified
     *         Availability Zone.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes in a single cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the
     *         allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyReplicationGroup
     */
    ReplicationGroup modifyReplicationGroup(
            ModifyReplicationGroupRequest modifyReplicationGroupRequest);

    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> action allows you to
     * purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a
     *        <i>PurchaseReservedCacheNodesOffering</i> action.
     * @return Result of the PurchaseReservedCacheNodesOffering operation
     *         returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws ReservedCacheNodeAlreadyExistsException
     *         You already have a reservation with the given identifier.
     * @throws ReservedCacheNodeQuotaExceededException
     *         The request cannot be processed because it would exceed the
     *         user's cache node quota.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.PurchaseReservedCacheNodesOffering
     */
    ReservedCacheNode purchaseReservedCacheNodesOffering(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest);

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
     * @return Result of the RebootCacheCluster operation returned by the
     *         service.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <i>available</i> state.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @sample AmazonElastiCache.RebootCacheCluster
     */
    CacheCluster rebootCacheCluster(
            RebootCacheClusterRequest rebootCacheClusterRequest);

    /**
     * <p>
     * The <i>RemoveTagsFromResource</i> action removes the tags identified by
     * the <code>TagKeys</code> list from the named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <i>RemoveTagsFromResource</i> action.
     * @return Result of the RemoveTagsFromResource operation returned by the
     *         service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing
     *         cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing
     *         snapshot.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @throws TagNotFoundException
     *         The requested tag was not found on this resource.
     * @sample AmazonElastiCache.RemoveTagsFromResource
     */
    RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

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
     * @return Result of the ResetCacheParameterGroup operation returned by the
     *         service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the
     *         requested action to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an
     *         existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ResetCacheParameterGroup
     */
    ResetCacheParameterGroupResult resetCacheParameterGroup(
            ResetCacheParameterGroupRequest resetCacheParameterGroupRequest);

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
     * @return Result of the RevokeCacheSecurityGroupIngress operation returned
     *         by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an
     *         existing cache security group.
     * @throws AuthorizationNotFoundException
     *         The specified Amazon EC2 security group is not authorized for the
     *         specified cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow
     *         deletion.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.RevokeCacheSecurityGroupIngress
     */
    CacheSecurityGroup revokeCacheSecurityGroupIngress(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
