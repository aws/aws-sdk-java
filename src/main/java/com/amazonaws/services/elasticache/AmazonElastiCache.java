/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AmazonElastiCache.
 * Amazon ElastiCache <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With ElastiCache, customers gain all of the benefits of a high-performance, in-memory cache with far less of the administrative burden of launching
 * and managing a distributed cache. The service makes set-up, scaling, and cluster failure handling much simpler than in a self-managed cache
 * deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their
 * cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
public interface AmazonElastiCache {

    /**
     * Overrides the default endpoint for this client ("https://elasticache.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticache.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://elasticache.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "elasticache.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://elasticache.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

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
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> operation lists
     * available reserved cache node offerings.
     * </p>
     *
     * @param describeReservedCacheNodesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedCacheNodesOfferings service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DescribeReservedCacheNodesOfferings
     *         service method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DeleteReplicationGroup</i> operation deletes an existing
     * replication group. <i>DeleteReplicationGroup</i> deletes the primary
     * cache cluster and all of the read replicas in the replication group.
     * When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the entire replication group;
     * you cannot cancel or revert this operation.
     * </p>
     *
     * @param deleteReplicationGroupRequest Container for the necessary
     *           parameters to execute the DeleteReplicationGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DeleteReplicationGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest deleteReplicationGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>ModifyCacheCluster</i> operation modifies the settings for a
     * cache cluster. You can use this operation to change one or more
     * cluster configuration parameters by specifying the parameters and the
     * new values.
     * </p>
     *
     * @param modifyCacheClusterRequest Container for the necessary
     *           parameters to execute the ModifyCacheCluster service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ModifyCacheCluster service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws NodeQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidVPCNetworkStateException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheCluster modifyCacheCluster(ModifyCacheClusterRequest modifyCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>RevokeCacheSecurityGroupIngress</i> operation revokes ingress
     * from a cache security group. Use this operation to disallow access
     * from an Amazon EC2 security group that had been previously authorized.
     * </p>
     *
     * @param revokeCacheSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the RevokeCacheSecurityGroupIngress
     *           service method on AmazonElastiCache.
     * 
     * @return The response from the RevokeCacheSecurityGroupIngress service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws AuthorizationNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheSecurityGroup revokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeReplicationGroups</i> operation returns information
     * about a particular replication group. If no identifier is specified,
     * <i>DescribeReplicationGroups</i> returns information about all
     * replication groups.
     * </p>
     *
     * @param describeReplicationGroupsRequest Container for the necessary
     *           parameters to execute the DescribeReplicationGroups service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DescribeReplicationGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReplicationGroupsResult describeReplicationGroups(DescribeReplicationGroupsRequest describeReplicationGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>CreateCacheCluster</i> operation creates a new cache cluster.
     * All nodes in the cache cluster run the same protocol-compliant cache
     * engine software - either Memcached or Redis.
     * </p>
     *
     * @param createCacheClusterRequest Container for the necessary
     *           parameters to execute the CreateCacheCluster service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the CreateCacheCluster service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws NodeQuotaForCustomerExceededException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws CacheClusterAlreadyExistsException
     * @throws InsufficientCacheClusterCapacityException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     * @throws CacheSecurityGroupNotFoundException
     * @throws NodeQuotaForClusterExceededException
     * @throws CacheSubnetGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidVPCNetworkStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheCluster createCacheCluster(CreateCacheClusterRequest createCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>CreateReplicationGroup</i> operation creates a replication
     * group. A replication group is a collection of cache clusters, where
     * one of the clusters is a read/write primary and the other clusters are
     * read-only replicas. Writes to the primary are automatically propagated
     * to the replicas.
     * </p>
     * <p>
     * When you create a replication group, you must specify an existing
     * cache cluster that is in the primary role. When the replication group
     * has been successfully created, you can add one or more read replica
     * replicas to it, up to a total of five read replicas.
     * </p>
     *
     * @param createReplicationGroupRequest Container for the necessary
     *           parameters to execute the CreateReplicationGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the CreateReplicationGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws ReplicationGroupAlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCacheClusterStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplicationGroup createReplicationGroup(CreateReplicationGroupRequest createReplicationGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DeleteCacheCluster</i> operation deletes a previously
     * provisioned cache cluster. <i>DeleteCacheCluster</i> deletes all
     * associated cache nodes, node endpoints and the cache cluster itself.
     * When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the cache cluster; you cannot
     * cancel or revert this operation.
     * </p>
     *
     * @param deleteCacheClusterRequest Container for the necessary
     *           parameters to execute the DeleteCacheCluster service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DeleteCacheCluster service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCacheClusterStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheCluster deleteCacheCluster(DeleteCacheClusterRequest deleteCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> operation returns a list of
     * cache security group descriptions. If a cache security group name is
     * specified, the list will contain only the description of that group.
     * </p>
     *
     * @param describeCacheSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheSecurityGroups service method
     *           on AmazonElastiCache.
     * 
     * @return The response from the DescribeCacheSecurityGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> operation modifies the settings for
     * a replication group.
     * </p>
     *
     * @param modifyReplicationGroupRequest Container for the necessary
     *           parameters to execute the ModifyReplicationGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ModifyReplicationGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidVPCNetworkStateException
     * @throws ReplicationGroupNotFoundException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplicationGroup modifyReplicationGroup(ModifyReplicationGroupRequest modifyReplicationGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeCacheClusters</i> operation returns information about
     * all provisioned cache clusters if no cache cluster identifier is
     * specified, or about a specific cache cluster if a cache cluster
     * identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the cache clusters(s) will
     * be returned. You can use the optional <i>ShowDetails</i> flag to
     * retrieve detailed information about the cache nodes associated with
     * the cache clusters. These details include the DNS address and port for
     * the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level
     * information will be displayed until all of the nodes are successfully
     * provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level
     * information will be displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cache cluster, node
     * endpoint information and creation time for the additional nodes will
     * not be displayed until they are completely provisioned. When the cache
     * cluster state is <i>available</i> , the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cache cluster, no
     * endpoint information for the removed nodes is displayed.
     * </p>
     *
     * @param describeCacheClustersRequest Container for the necessary
     *           parameters to execute the DescribeCacheClusters service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DescribeCacheClusters service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheClustersResult describeCacheClusters(DescribeCacheClustersRequest describeCacheClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> operation creates a new cache
     * parameter group. A cache parameter group is a collection of parameters
     * that you apply to all of the nodes in a cache cluster.
     * </p>
     *
     * @param createCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateCacheParameterGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the CreateCacheParameterGroup service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws CacheParameterGroupQuotaExceededException
     * @throws CacheParameterGroupAlreadyExistsException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCacheParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheParameterGroup createCacheParameterGroup(CreateCacheParameterGroupRequest createCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> operation returns a list of
     * cache parameter group descriptions. If a cache parameter group name is
     * specified, the list will contain only the descriptions for that group.
     * </p>
     *
     * @param describeCacheParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheParameterGroups service method
     *           on AmazonElastiCache.
     * 
     * @return The response from the DescribeCacheParameterGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> operation returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the
     * list will contain only the description of that group.
     * </p>
     *
     * @param describeCacheSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheSubnetGroups service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DescribeCacheSubnetGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws CacheSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> operation modifies an existing cache
     * subnet group.
     * </p>
     *
     * @param modifyCacheSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyCacheSubnetGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ModifyCacheSubnetGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws CacheSubnetGroupNotFoundException
     * @throws CacheSubnetQuotaExceededException
     * @throws InvalidSubnetException
     * @throws SubnetInUseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> operation deletes the specified
     * cache parameter group. You cannot delete a cache parameter group if it
     * is associated with any cache clusters.
     * </p>
     *
     * @param deleteCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheParameterGroup service method on
     *           AmazonElastiCache.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCacheParameterGroupStateException
     * @throws CacheParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCacheParameterGroup(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeCacheParameters</i> operation returns the detailed
     * parameter list for a particular cache parameter group.
     * </p>
     *
     * @param describeCacheParametersRequest Container for the necessary
     *           parameters to execute the DescribeCacheParameters service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DescribeCacheParameters service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheParametersResult describeCacheParameters(DescribeCacheParametersRequest describeCacheParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> operation returns information
     * about reserved cache nodes for this account, or about a specified
     * reserved cache node.
     * </p>
     *
     * @param describeReservedCacheNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedCacheNodes service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the DescribeReservedCacheNodes service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws ReservedCacheNodeNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedCacheNodesResult describeReservedCacheNodes(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DeleteCacheSubnetGroup</i> operation deletes a cache subnet
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete a cache subnet group if it is associated
     * with any cache clusters.
     * </p>
     *
     * @param deleteCacheSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheSubnetGroup service method on
     *           AmazonElastiCache.
     * 
     * 
     * @throws CacheSubnetGroupNotFoundException
     * @throws CacheSubnetGroupInUseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeEvents</i> operation returns events related to cache
     * clusters, cache security groups, and cache parameter groups. You can
     * obtain events specific to a particular cache cluster, cache security
     * group, or cache parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are
     * returned; however, you can retrieve up to 14 days' worth of events if
     * necessary.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents service method on AmazonElastiCache.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DeleteCacheSecurityGroup</i> operation deletes a cache security
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete a cache security group if it is
     * associated with any cache clusters.
     * </p>
     *
     * @param deleteCacheSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheSecurityGroup service method on
     *           AmazonElastiCache.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidParameterCombinationException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeEngineDefaultParameters</i> operation returns the
     * default engine and system parameter information for the specified
     * cache engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           service method on AmazonElastiCache.
     * 
     * @return The response from the DescribeEngineDefaultParameters service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>AuthorizeCacheSecurityGroupIngress</i> operation allows network
     * ingress to a cache security group. Applications using ElastiCache must
     * be running on Amazon EC2, and Amazon EC2 security groups are used as
     * the authorization mechanism.
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot authorize ingress from an Amazon EC2 security
     * group in one Region to an ElastiCache cluster in another Region.
     * </p>
     *
     * @param authorizeCacheSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeCacheSecurityGroupIngress
     *           service method on AmazonElastiCache.
     * 
     * @return The response from the AuthorizeCacheSecurityGroupIngress
     *         service method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws AuthorizationAlreadyExistsException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidParameterCombinationException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheSecurityGroup authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>CreateCacheSubnetGroup</i> operation creates a new cache subnet
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon
     * Virtual Private Cloud (VPC).
     * </p>
     *
     * @param createCacheSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateCacheSubnetGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the CreateCacheSubnetGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws CacheSubnetGroupAlreadyExistsException
     * @throws CacheSubnetGroupQuotaExceededException
     * @throws CacheSubnetQuotaExceededException
     * @throws InvalidSubnetException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> operation returns a list of the
     * available cache engines and their versions.
     * </p>
     *
     * @param describeCacheEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeCacheEngineVersions service method
     *           on AmazonElastiCache.
     * 
     * @return The response from the DescribeCacheEngineVersions service
     *         method, as returned by AmazonElastiCache.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions(DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>CreateCacheSecurityGroup</i> operation creates a new cache
     * security group. Use a cache security group to control access to one or
     * more cache clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster
     * outside of an Amazon Virtual Private Cloud (VPC). If you are creating
     * a cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <i>CreateCacheSubnetGroup</i> .
     * </p>
     *
     * @param createCacheSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateCacheSecurityGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the CreateCacheSecurityGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws CacheSecurityGroupAlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws CacheSecurityGroupQuotaExceededException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheSecurityGroup createCacheSecurityGroup(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> operation allows you to
     * purchase a reserved cache node offering.
     * </p>
     *
     * @param purchaseReservedCacheNodesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedCacheNodesOffering
     *           service method on AmazonElastiCache.
     * 
     * @return The response from the PurchaseReservedCacheNodesOffering
     *         service method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws ReservedCacheNodeQuotaExceededException
     * @throws ReservedCacheNodeAlreadyExistsException
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReservedCacheNode purchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>ResetCacheParameterGroup</i> operation modifies the parameters
     * of a cache parameter group to the engine or system default value. You
     * can reset specific parameters by submitting a list of parameter names.
     * To reset the entire cache parameter group, specify the
     * <i>ResetAllParameters</i> and <i>CacheParameterGroupName</i>
     * parameters.
     * </p>
     *
     * @param resetCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetCacheParameterGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ResetCacheParameterGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCacheParameterGroupStateException
     * @throws CacheParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResetCacheParameterGroupResult resetCacheParameterGroup(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> operation modifies the parameters
     * of a cache parameter group. You can modify up to 20 parameters in a
     * single request by submitting a list parameter name and value pairs.
     * </p>
     *
     * @param modifyCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyCacheParameterGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ModifyCacheParameterGroup service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidCacheParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyCacheParameterGroupResult modifyCacheParameterGroup(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>RebootCacheCluster</i> operation reboots some, or all, of the
     * cache cluster nodes within a provisioned cache cluster. This API will
     * apply any modified cache parameter groups to the cache cluster. The
     * reboot action takes place as soon as possible, and results in a
     * momentary outage to the cache cluster. During the reboot, the cache
     * cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache cluster
     * node being rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cache cluster event is created.
     * </p>
     *
     * @param rebootCacheClusterRequest Container for the necessary
     *           parameters to execute the RebootCacheCluster service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the RebootCacheCluster service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws CacheClusterNotFoundException
     * @throws InvalidCacheClusterStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheCluster rebootCacheCluster(RebootCacheClusterRequest rebootCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> operation lists
     * available reserved cache node offerings.
     * </p>
     * 
     * @return The response from the DescribeReservedCacheNodesOfferings
     *         service method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeReplicationGroups</i> operation returns information
     * about a particular replication group. If no identifier is specified,
     * <i>DescribeReplicationGroups</i> returns information about all
     * replication groups.
     * </p>
     * 
     * @return The response from the DescribeReplicationGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReplicationGroupsResult describeReplicationGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> operation returns a list of
     * cache security group descriptions. If a cache security group name is
     * specified, the list will contain only the description of that group.
     * </p>
     * 
     * @return The response from the DescribeCacheSecurityGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws CacheSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeCacheClusters</i> operation returns information about
     * all provisioned cache clusters if no cache cluster identifier is
     * specified, or about a specific cache cluster if a cache cluster
     * identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the cache clusters(s) will
     * be returned. You can use the optional <i>ShowDetails</i> flag to
     * retrieve detailed information about the cache nodes associated with
     * the cache clusters. These details include the DNS address and port for
     * the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level
     * information will be displayed until all of the nodes are successfully
     * provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level
     * information will be displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cache cluster, node
     * endpoint information and creation time for the additional nodes will
     * not be displayed until they are completely provisioned. When the cache
     * cluster state is <i>available</i> , the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cache cluster, no
     * endpoint information for the removed nodes is displayed.
     * </p>
     * 
     * @return The response from the DescribeCacheClusters service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheClustersResult describeCacheClusters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> operation returns a list of
     * cache parameter group descriptions. If a cache parameter group name is
     * specified, the list will contain only the descriptions for that group.
     * </p>
     * 
     * @return The response from the DescribeCacheParameterGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> operation returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the
     * list will contain only the description of that group.
     * </p>
     * 
     * @return The response from the DescribeCacheSubnetGroups service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws CacheSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> operation returns information
     * about reserved cache nodes for this account, or about a specified
     * reserved cache node.
     * </p>
     * 
     * @return The response from the DescribeReservedCacheNodes service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws ReservedCacheNodeNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedCacheNodesResult describeReservedCacheNodes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeEvents</i> operation returns events related to cache
     * clusters, cache security groups, and cache parameter groups. You can
     * obtain events specific to a particular cache cluster, cache security
     * group, or cache parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are
     * returned; however, you can retrieve up to 14 days' worth of events if
     * necessary.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> operation returns a list of the
     * available cache engines and their versions.
     * </p>
     * 
     * @return The response from the DescribeCacheEngineVersions service
     *         method, as returned by AmazonElastiCache.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        