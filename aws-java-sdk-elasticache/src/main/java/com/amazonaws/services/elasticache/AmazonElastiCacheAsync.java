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
package com.amazonaws.services.elasticache;

import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;

/**
 * Interface for accessing Amazon ElastiCache asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticache.AbstractAmazonElastiCacheAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
 * cloud.
 * </p>
 * <p>
 * With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
 * administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
 * cluster failure handling much simpler than in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
 * statistics associated with their cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElastiCacheAsync extends AmazonElastiCache {

    /**
     * <p>
     * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key
     * and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated
     * value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business
     * categories (such as cost centers, application names, or owners) to organize your costs across multiple services.
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html">Using
     * Cost Allocation Tags in Amazon ElastiCache</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an AddTagsToResource operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AmazonElastiCacheAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AddTagsToResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key
     * and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated
     * value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business
     * categories (such as cost centers, application names, or owners) to organize your costs across multiple services.
     * For more information, see <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html">Using
     * Cost Allocation Tags in Amazon ElastiCache</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an AddTagsToResource operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AddTagsToResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
     * and Amazon EC2 security groups are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
     * region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
     * @return A Java Future containing the result of the AuthorizeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.AuthorizeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AuthorizeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest);

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
     * and Amazon EC2 security groups are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
     * region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.AuthorizeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AuthorizeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler);

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the <code>CopySnapshot</code> operation can create their own Amazon
     * S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <code>CopySnapshot</code> operation. For more information about using IAM to control the
     * use of ElastiCache operations, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html">Exporting
     * Snapshots</a> and <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html">Authentication
     * &amp; Access Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient permissions to perform the desired
     * activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and unique value. If exporting a snapshot, you
     * could alternatively create a new Amazon S3 bucket and use this same value for <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <code>CopySnapshotMessage</code> operation.
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonElastiCacheAsync.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the <code>CopySnapshot</code> operation can create their own Amazon
     * S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <code>CopySnapshot</code> operation. For more information about using IAM to control the
     * use of ElastiCache operations, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html">Exporting
     * Snapshots</a> and <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html">Authentication
     * &amp; Access Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient permissions to perform the desired
     * activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and unique value. If exporting a snapshot, you
     * could alternatively create a new Amazon S3 bucket and use this same value for <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <code>CopySnapshotMessage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
     * Memcached or Redis.
     * </p>
     * <p>
     * This operation is not supported for Redis (cluster mode enabled) clusters.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a CreateCacheCluster operation.
     * @return A Java Future containing the result of the CreateCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> createCacheClusterAsync(CreateCacheClusterRequest createCacheClusterRequest);

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
     * Memcached or Redis.
     * </p>
     * <p>
     * This operation is not supported for Redis (cluster mode enabled) clusters.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a CreateCacheCluster operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> createCacheClusterAsync(CreateCacheClusterRequest createCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of
     * parameters and their values that are applied to all of the nodes in any cluster or replication group using the
     * CacheParameterGroup.
     * </p>
     * <p>
     * A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the
     * CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of
     * specific parameters. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html">
     * ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html">Parameters and
     * Parameter Groups</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <code>CreateCacheParameterGroup</code> operation.
     * @return A Java Future containing the result of the CreateCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheParameterGroup> createCacheParameterGroupAsync(CreateCacheParameterGroupRequest createCacheParameterGroupRequest);

    /**
     * <p>
     * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of
     * parameters and their values that are applied to all of the nodes in any cluster or replication group using the
     * CacheParameterGroup.
     * </p>
     * <p>
     * A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the
     * CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of
     * specific parameters. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html">
     * ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html">Parameters and
     * Parameter Groups</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <code>CreateCacheParameterGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheParameterGroup> createCacheParameterGroupAsync(CreateCacheParameterGroupRequest createCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheParameterGroupRequest, CacheParameterGroup> asyncHandler);

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control access to one or more clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
     * (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
     * @return A Java Future containing the result of the CreateCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSecurityGroup> createCacheSecurityGroupAsync(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest);

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control access to one or more clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
     * (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSecurityGroup> createCacheSecurityGroupAsync(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheSecurityGroupRequest, CacheSecurityGroup> asyncHandler);

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
     * @return A Java Future containing the result of the CreateCacheSubnetGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSubnetGroup> createCacheSubnetGroupAsync(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest);

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCacheSubnetGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSubnetGroup> createCacheSubnetGroupAsync(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler);

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a
     * read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to
     * the replicas.
     * </p>
     * <p>
     * A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group
     * (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are
     * asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data
     * across node groups (shards).
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more
     * read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled)
     * replication group after it has been created. However, if you need to increase or decrease the number of node
     * groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-restoring.html">Restoring From a Backup
     * with Cluster Resizing</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <code>CreateReplicationGroup</code> operation.
     * @return A Java Future containing the result of the CreateReplicationGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> createReplicationGroupAsync(CreateReplicationGroupRequest createReplicationGroupRequest);

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a
     * read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to
     * the replicas.
     * </p>
     * <p>
     * A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group
     * (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are
     * asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data
     * across node groups (shards).
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more
     * read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled)
     * replication group after it has been created. However, if you need to increase or decrease the number of node
     * groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-restoring.html">Restoring From a Backup
     * with Cluster Resizing</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <code>CreateReplicationGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> createReplicationGroupAsync(CreateReplicationGroupRequest createReplicationGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationGroupRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * Creates a copy of an entire cluster or replication group at a specific moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <code>CreateSnapshot</code> operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonElastiCacheAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a copy of an entire cluster or replication group at a specific moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <code>CreateSnapshot</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of
     * replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param decreaseReplicaCountRequest
     * @return A Java Future containing the result of the DecreaseReplicaCount operation returned by the service.
     * @sample AmazonElastiCacheAsync.DecreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> decreaseReplicaCountAsync(DecreaseReplicaCountRequest decreaseReplicaCountRequest);

    /**
     * <p>
     * Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of
     * replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param decreaseReplicaCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DecreaseReplicaCount operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DecreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> decreaseReplicaCountAsync(DecreaseReplicaCountRequest decreaseReplicaCountRequest,
            com.amazonaws.handlers.AsyncHandler<DecreaseReplicaCountRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code> deletes all associated cache nodes,
     * node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation.
     * </p>
     * <p>
     * This operation cannot be used to delete a cluster that is the last read replica of a replication group or node
     * group (shard) that has Multi-AZ mode enabled or a cluster from a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * This operation is not valid for Redis (cluster mode enabled) clusters.
     * </p>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <code>DeleteCacheCluster</code> operation.
     * @return A Java Future containing the result of the DeleteCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> deleteCacheClusterAsync(DeleteCacheClusterRequest deleteCacheClusterRequest);

    /**
     * <p>
     * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code> deletes all associated cache nodes,
     * node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation.
     * </p>
     * <p>
     * This operation cannot be used to delete a cluster that is the last read replica of a replication group or node
     * group (shard) that has Multi-AZ mode enabled or a cluster from a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * This operation is not valid for Redis (cluster mode enabled) clusters.
     * </p>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <code>DeleteCacheCluster</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> deleteCacheClusterAsync(DeleteCacheClusterRequest deleteCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
     * any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
     * @return A Java Future containing the result of the DeleteCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCacheParameterGroupResult> deleteCacheParameterGroupAsync(
            DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest);

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
     * any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCacheParameterGroupResult> deleteCacheParameterGroupAsync(
            DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheParameterGroupRequest, DeleteCacheParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
     * @return A Java Future containing the result of the DeleteCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCacheSecurityGroupResult> deleteCacheSecurityGroupAsync(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest);

    /**
     * <p>
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCacheSecurityGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCacheSecurityGroupResult> deleteCacheSecurityGroupAsync(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheSecurityGroupRequest, DeleteCacheSecurityGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
     * @return A Java Future containing the result of the DeleteCacheSubnetGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCacheSubnetGroupResult> deleteCacheSubnetGroupAsync(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest);

    /**
     * <p>
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCacheSubnetGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCacheSubnetGroupResult> deleteCacheSubnetGroupAsync(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheSubnetGroupRequest, DeleteCacheSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes the entire replication group, including
     * the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <code>DeleteReplicationGroup</code> operation.
     * @return A Java Future containing the result of the DeleteReplicationGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> deleteReplicationGroupAsync(DeleteReplicationGroupRequest deleteReplicationGroupRequest);

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes the entire replication group, including
     * the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <code>DeleteReplicationGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> deleteReplicationGroupAsync(DeleteReplicationGroupRequest deleteReplicationGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationGroupRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <code>DeleteSnapshot</code> operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonElastiCacheAsync.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <code>DeleteSnapshot</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cache cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the clusters is returned. You can use the optional
     * <i>ShowCacheNodeInfo</i> flag to retrieve detailed information about the cache nodes associated with the
     * clusters. These details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the <i>creating</i> state, only cluster-level information is displayed until all of the
     * nodes are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the <i>deleting</i> state, only cluster-level information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cluster, node endpoint information and creation time for the
     * additional nodes are not displayed until they are completely provisioned. When the cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <code>DescribeCacheClusters</code> operation.
     * @return A Java Future containing the result of the DescribeCacheClusters operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheClusters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(DescribeCacheClustersRequest describeCacheClustersRequest);

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cache cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the clusters is returned. You can use the optional
     * <i>ShowCacheNodeInfo</i> flag to retrieve detailed information about the cache nodes associated with the
     * clusters. These details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the <i>creating</i> state, only cluster-level information is displayed until all of the
     * nodes are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the <i>deleting</i> state, only cluster-level information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cluster, node endpoint information and creation time for the
     * additional nodes are not displayed until they are completely provisioned. When the cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <code>DescribeCacheClusters</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheClusters operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheClusters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(DescribeCacheClustersRequest describeCacheClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation.
     *
     * @see #describeCacheClustersAsync(DescribeCacheClustersRequest)
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync();

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation with an AsyncHandler.
     *
     * @see #describeCacheClustersAsync(DescribeCacheClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
     * @return A Java Future containing the result of the DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest);

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions operation.
     *
     * @see #describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest)
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions operation with an AsyncHandler.
     *
     * @see #describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
     * contains only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
     * @return A Java Future containing the result of the DescribeCacheParameterGroups operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.DescribeCacheParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
     * contains only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheParameterGroups operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups operation.
     *
     * @see #describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest)
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups operation with an AsyncHandler.
     *
     * @see #describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <code>DescribeCacheParameters</code> operation.
     * @return A Java Future containing the result of the DescribeCacheParameters operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheParametersResult> describeCacheParametersAsync(DescribeCacheParametersRequest describeCacheParametersRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <code>DescribeCacheParameters</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheParameters operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheParametersResult> describeCacheParametersAsync(DescribeCacheParametersRequest describeCacheParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParametersRequest, DescribeCacheParametersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security group name is specified, the list
     * contains only the description of that group.
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
     * @return A Java Future containing the result of the DescribeCacheSecurityGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest);

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security group name is specified, the list
     * contains only the description of that group.
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheSecurityGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups operation.
     *
     * @see #describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest)
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
     * the description of that group.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
     * @return A Java Future containing the result of the DescribeCacheSubnetGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeCacheSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest);

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
     * the description of that group.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCacheSubnetGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeCacheSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups operation.
     *
     * @see #describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest)
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
     * @return A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler);

    /**
     * <p>
     * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
     * specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
     * parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <code>DescribeEvents</code> operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
     * specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
     * parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <code>DescribeEvents</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync();

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a particular replication group. If no identifier is specified,
     * <code>DescribeReplicationGroups</code> returns information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <code>DescribeReplicationGroups</code> operation.
     * @return A Java Future containing the result of the DescribeReplicationGroups operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeReplicationGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReplicationGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest);

    /**
     * <p>
     * Returns information about a particular replication group. If no identifier is specified,
     * <code>DescribeReplicationGroups</code> returns information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <code>DescribeReplicationGroups</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationGroups operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeReplicationGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReplicationGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReplicationGroups operation.
     *
     * @see #describeReplicationGroupsAsync(DescribeReplicationGroupsRequest)
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeReplicationGroups operation with an AsyncHandler.
     *
     * @see #describeReplicationGroupsAsync(DescribeReplicationGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
     * @return A Java Future containing the result of the DescribeReservedCacheNodes operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeReservedCacheNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest);

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedCacheNodes operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeReservedCacheNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes operation.
     *
     * @see #describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync();

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes operation with an AsyncHandler.
     *
     * @see #describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler);

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
     * @return A Java Future containing the result of the DescribeReservedCacheNodesOfferings operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.DescribeReservedCacheNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest);

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedCacheNodesOfferings operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeReservedCacheNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodesOfferings operation.
     *
     * @see #describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync();

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler);

    /**
     * <p>
     * Returns information about cluster or replication group snapshots. By default, <code>DescribeSnapshots</code>
     * lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
     * a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonElastiCacheAsync.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * Returns information about cluster or replication group snapshots. By default, <code>DescribeSnapshots</code>
     * lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
     * a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of
     * replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param increaseReplicaCountRequest
     * @return A Java Future containing the result of the IncreaseReplicaCount operation returned by the service.
     * @sample AmazonElastiCacheAsync.IncreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> increaseReplicaCountAsync(IncreaseReplicaCountRequest increaseReplicaCountRequest);

    /**
     * <p>
     * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of
     * replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param increaseReplicaCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IncreaseReplicaCount operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.IncreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> increaseReplicaCountAsync(IncreaseReplicaCountRequest increaseReplicaCountRequest,
            com.amazonaws.handlers.AsyncHandler<IncreaseReplicaCountRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or replication group's current node type
     * up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code> operations to scale up
     * your cluster or replication group, the value of the <code>CacheNodeType</code> parameter must be one of the node
     * types returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
     * @return A Java Future containing the result of the ListAllowedNodeTypeModifications operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.ListAllowedNodeTypeModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListAllowedNodeTypeModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest);

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or replication group's current node type
     * up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code> operations to scale up
     * your cluster or replication group, the value of the <code>CacheNodeType</code> parameter must be one of the node
     * types returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAllowedNodeTypeModifications operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.ListAllowedNodeTypeModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListAllowedNodeTypeModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications operation.
     *
     * @see #listAllowedNodeTypeModificationsAsync(ListAllowedNodeTypeModificationsRequest)
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync();

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications operation with an AsyncHandler.
     *
     * @see #listAllowedNodeTypeModificationsAsync(ListAllowedNodeTypeModificationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler);

    /**
     * <p>
     * Lists all cost allocation tags currently on the named resource. A <code>cost allocation tag</code> is a key-value
     * pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize
     * and track your AWS costs.
     * </p>
     * <p>
     * If the cluster is not in the <i>available</i> state, <code>ListTagsForResource</code> returns an error.
     * </p>
     * <p>
     * You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html">Monitoring Costs with Tags</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <code>ListTagsForResource</code> operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonElastiCacheAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all cost allocation tags currently on the named resource. A <code>cost allocation tag</code> is a key-value
     * pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize
     * and track your AWS costs.
     * </p>
     * <p>
     * If the cluster is not in the <i>available</i> state, <code>ListTagsForResource</code> returns an error.
     * </p>
     * <p>
     * You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html">Monitoring Costs with Tags</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <code>ListTagsForResource</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <code>ModifyCacheCluster</code> operation.
     * @return A Java Future containing the result of the ModifyCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> modifyCacheClusterAsync(ModifyCacheClusterRequest modifyCacheClusterRequest);

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <code>ModifyCacheCluster</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> modifyCacheClusterAsync(ModifyCacheClusterRequest modifyCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
     * @return A Java Future containing the result of the ModifyCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheParameterGroupRequest, ModifyCacheParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
     * @return A Java Future containing the result of the ModifyCacheSubnetGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCacheSubnetGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <p>
     * For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or
     * engine version. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html">
     * Scaling for Amazon ElastiCache for Redis—Redis (cluster mode enabled)</a> in the ElastiCache User Guide
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
     * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <code>ModifyReplicationGroups</code> operation.
     * @return A Java Future containing the result of the ModifyReplicationGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.ModifyReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupAsync(ModifyReplicationGroupRequest modifyReplicationGroupRequest);

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <p>
     * For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or
     * engine version. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html">
     * Scaling for Amazon ElastiCache for Redis—Redis (cluster mode enabled)</a> in the ElastiCache User Guide
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
     * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <code>ModifyReplicationGroups</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReplicationGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupAsync(ModifyReplicationGroupRequest modifyReplicationGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationGroupRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
     * the keyspaces among exisiting shards.
     * </p>
     * 
     * @param modifyReplicationGroupShardConfigurationRequest
     *        Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
     * @return A Java Future containing the result of the ModifyReplicationGroupShardConfiguration operation returned by
     *         the service.
     * @sample AmazonElastiCacheAsync.ModifyReplicationGroupShardConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroupShardConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupShardConfigurationAsync(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest);

    /**
     * <p>
     * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
     * the keyspaces among exisiting shards.
     * </p>
     * 
     * @param modifyReplicationGroupShardConfigurationRequest
     *        Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReplicationGroupShardConfiguration operation returned by
     *         the service.
     * @sample AmazonElastiCacheAsyncHandler.ModifyReplicationGroupShardConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroupShardConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupShardConfigurationAsync(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationGroupShardConfigurationRequest, ReplicationGroup> asyncHandler);

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
     * @return A Java Future containing the result of the PurchaseReservedCacheNodesOffering operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.PurchaseReservedCacheNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PurchaseReservedCacheNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest);

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedCacheNodesOffering operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.PurchaseReservedCacheNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PurchaseReservedCacheNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedCacheNodesOfferingRequest, ReservedCacheNode> asyncHandler);

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache
     * parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary
     * outage to the cluster. During the reboot, the cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cluster event is created.
     * </p>
     * <p>
     * Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is
     * not supported on Redis (cluster mode enabled) clusters.
     * </p>
     * <p>
     * If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to
     * be applied, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html">Rebooting a Cluster</a>
     * for an alternate process.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <code>RebootCacheCluster</code> operation.
     * @return A Java Future containing the result of the RebootCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsync.RebootCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebootCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> rebootCacheClusterAsync(RebootCacheClusterRequest rebootCacheClusterRequest);

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache
     * parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary
     * outage to the cluster. During the reboot, the cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cluster event is created.
     * </p>
     * <p>
     * Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is
     * not supported on Redis (cluster mode enabled) clusters.
     * </p>
     * <p>
     * If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to
     * be applied, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html">Rebooting a Cluster</a>
     * for an alternate process.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <code>RebootCacheCluster</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootCacheCluster operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.RebootCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebootCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CacheCluster> rebootCacheClusterAsync(RebootCacheClusterRequest rebootCacheClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RebootCacheClusterRequest, CacheCluster> asyncHandler);

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <code>RemoveTagsFromResource</code> operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AmazonElastiCacheAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <code>RemoveTagsFromResource</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
     * <code>ResetAllParameters</code> and <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <code>ResetCacheParameterGroup</code> operation.
     * @return A Java Future containing the result of the ResetCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsync.ResetCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ResetCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
     * <code>ResetAllParameters</code> and <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <code>ResetCacheParameterGroup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetCacheParameterGroup operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.ResetCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ResetCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetCacheParameterGroupRequest, ResetCacheParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
     * group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
     * @return A Java Future containing the result of the RevokeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsync.RevokeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RevokeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest);

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
     * group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeCacheSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonElastiCacheAsyncHandler.RevokeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RevokeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler);

    /**
     * <p>
     * Represents the input of a <code>TestFailover</code> operation which test automatic failover on a specified node
     * group (called shard in the console) in a replication group (called cluster in the console).
     * </p>
     * <p class="title">
     * <b>Note the following</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the
     * ElastiCache API and AWS CLI) in any rolling 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * If calling this operation on shards in different clusters (called replication groups in the API and CLI), the
     * calls can be made concurrently.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication
     * group, the first node replacement must complete before a subsequent call can be made.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console,
     * the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in
     * order of occurrance:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Replication group message: <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replication group message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Recovering cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html">Viewing ElastiCache
     * Events</a> in the <i>ElastiCache User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html">DescribeEvents<
     * /a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Also see, <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test">Testing
     * Multi-AZ with Automatic Failover</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param testFailoverRequest
     * @return A Java Future containing the result of the TestFailover operation returned by the service.
     * @sample AmazonElastiCacheAsync.TestFailover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/TestFailover" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> testFailoverAsync(TestFailoverRequest testFailoverRequest);

    /**
     * <p>
     * Represents the input of a <code>TestFailover</code> operation which test automatic failover on a specified node
     * group (called shard in the console) in a replication group (called cluster in the console).
     * </p>
     * <p class="title">
     * <b>Note the following</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the
     * ElastiCache API and AWS CLI) in any rolling 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * If calling this operation on shards in different clusters (called replication groups in the API and CLI), the
     * calls can be made concurrently.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication
     * group, the first node replacement must complete before a subsequent call can be made.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console,
     * the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in
     * order of occurrance:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Replication group message: <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replication group message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Recovering cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html">Viewing ElastiCache
     * Events</a> in the <i>ElastiCache User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html">DescribeEvents<
     * /a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Also see, <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test">Testing
     * Multi-AZ with Automatic Failover</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param testFailoverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestFailover operation returned by the service.
     * @sample AmazonElastiCacheAsyncHandler.TestFailover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/TestFailover" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplicationGroup> testFailoverAsync(TestFailoverRequest testFailoverRequest,
            com.amazonaws.handlers.AsyncHandler<TestFailoverRequest, ReplicationGroup> asyncHandler);

}
