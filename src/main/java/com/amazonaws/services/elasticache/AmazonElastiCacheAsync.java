/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.elasticache.model.*;

/**
 * Interface for accessing AmazonElastiCache asynchronously,
 * using Java Futures.
 * Amazon ElastiCache <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With Amazon ElastiCache, customers gain all of the benefits of a high-performance, in-memory cache with far less of the administrative burden of
 * launching and managing a distributed cache. The service makes set-up, scaling, and cluster failure handling much simpler than in a self-managed cache
 * deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their
 * cache and can receive alarms if a part of their cache runs hot.
 * </p> 
 */       
public interface AmazonElastiCacheAsync extends AmazonElastiCache {
    /**
     * <p>
     * Modifies the parameters of a CacheParameterGroup. To modify more than
     * one parameter, submit a list of ParameterName and ParameterValue
     * parameters. A maximum of 20 parameters can be modified in a single
     * request.
     * </p>
     *
     * @param modifyCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyCacheParameterGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Authorizes ingress to a CacheSecurityGroup using EC2 Security Groups
     * as authorization (therefore the application using the cache must be
     * running on EC2 clusters). This API requires the following parameters:
     * EC2SecurityGroupName and EC2SecurityGroupOwnerId.
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot authorize ingress from an EC2 security group
     * in one Region to an Amazon Cache Cluster in another.
     * </p>
     *
     * @param authorizeCacheSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeCacheSecurityGroupIngress
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeCacheSecurityGroupIngress service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots some (or all) of the cache cluster nodes within a previously
     * provisioned ElastiCache cluster. This API results in the application
     * of modified CacheParameterGroup parameters to the cache cluster. This
     * action is taken as soon as possible, and results in a momentary outage
     * to the cache cluster during which the cache cluster status is set to
     * rebooting. During that momentary outage, the contents of the cache
     * (for each cache cluster node being rebooted) are lost. A CacheCluster
     * event is created when the reboot is completed.
     * </p>
     *
     * @param rebootCacheClusterRequest Container for the necessary
     *           parameters to execute the RebootCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCacheCluster service method, as returned by AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheCluster> rebootCacheClusterAsync(RebootCacheClusterRequest rebootCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists available reserved Cache Node offerings.
     * </p>
     *
     * @param describeReservedCacheNodesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedCacheNodesOfferings operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedCacheNodesOfferings service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously provisioned Cache Cluster. A successful response
     * from the web service indicates the request was received correctly.
     * This action cannot be canceled or reverted. DeleteCacheCluster deletes
     * all associated Cache Nodes, node endpoints and the Cache Cluster
     * itself.
     * </p>
     *
     * @param deleteCacheClusterRequest Container for the necessary
     *           parameters to execute the DeleteCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheCluster service method, as returned by AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheCluster> deleteCacheClusterAsync(DeleteCacheClusterRequest deleteCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Cache Cluster.
     * </p>
     *
     * @param createCacheClusterRequest Container for the necessary
     *           parameters to execute the CreateCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheCluster service method, as returned by AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheCluster> createCacheClusterAsync(CreateCacheClusterRequest createCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes ingress from a CacheSecurityGroup for previously authorized
     * EC2 Security Groups.
     * </p>
     *
     * @param revokeCacheSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the RevokeCacheSecurityGroupIngress
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeCacheSecurityGroupIngress service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Cache Parameter Group. Cache Parameter groups control
     * the parameters for a Cache Cluster.
     * </p>
     *
     * @param createCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateCacheParameterGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheParameterGroup> createCacheParameterGroupAsync(CreateCacheParameterGroupRequest createCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns events related to Cache Clusters, Cache Security Groups, and
     * Cache Parameter Groups for the past 14 days. Events specific to a
     * particular Cache Cluster, Cache Security Group, or Cache Parameter
     * Group can be obtained by providing the name as a parameter. By
     * default, the past hour of events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about reserved Cache Nodes for this account, or
     * about a specified reserved Cache Node.
     * </p>
     *
     * @param describeReservedCacheNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedCacheNodes operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedCacheNodes service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of CacheParameterGroup descriptions. If a
     * CacheParameterGroupName is specified, the list will contain only the
     * descriptions of the specified CacheParameterGroup.
     * </p>
     *
     * @param describeCacheParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheParameterGroups operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheParameterGroups service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified CacheParameterGroup. The CacheParameterGroup
     * cannot be deleted if it is associated with any cache clusters.
     * </p>
     *
     * @param deleteCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheParameterGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCacheParameterGroupAsync(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a Cache Security Group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified Cache Security Group must not be associated
     * with any Cache Clusters.
     * </p>
     *
     * @param deleteCacheSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheSecurityGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheSecurityGroup service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCacheSecurityGroupAsync(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Purchases a reserved Cache Node offering.
     * </p>
     *
     * @param purchaseReservedCacheNodesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedCacheNodesOffering
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedCacheNodesOffering service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about all provisioned Cache Clusters if no Cache
     * Cluster identifier is specified, or about a specific Cache Cluster if
     * a Cache Cluster identifier is supplied.
     * </p>
     * <p>
     * Cluster information will be returned by default. An optional
     * <i>ShowDetails</i> flag can be used to retrieve detailed information
     * about the Cache Nodes associated with the Cache Cluster. Details
     * include the DNS address and port for the Cache Node endpoint.
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
     * While adding Cache Nodes, node endpoint information and creation time
     * for the additional nodes will not be displayed until they are
     * completely provisioned. The cluster lifecycle tells the customer when
     * new nodes are AVAILABLE.
     * </p>
     * <p>
     * While removing existing Cache Nodes from an cluster, endpoint
     * information for the removed nodes will not be displayed.
     * </p>
     * <p>
     * DescribeCacheClusters supports pagination.
     * </p>
     *
     * @param describeCacheClustersRequest Container for the necessary
     *           parameters to execute the DescribeCacheClusters operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheClusters service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheClustersResult> describeCacheClustersAsync(DescribeCacheClustersRequest describeCacheClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the Cache Cluster settings. You can change one or more Cache
     * Cluster configuration parameters by specifying the parameters and the
     * new values in the request.
     * </p>
     *
     * @param modifyCacheClusterRequest Container for the necessary
     *           parameters to execute the ModifyCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheCluster service method, as returned by AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheCluster> modifyCacheClusterAsync(ModifyCacheClusterRequest modifyCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of CacheSecurityGroup descriptions. If a
     * CacheSecurityGroupName is specified, the list will contain only the
     * description of the specified CacheSecurityGroup.
     * </p>
     *
     * @param describeCacheSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheSecurityGroups operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheSecurityGroups service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Cache Security Group. Cache Security groups control
     * access to one or more Cache Clusters.
     * </p>
     *
     * @param createCacheSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateCacheSecurityGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheSecurityGroup service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheSecurityGroup> createCacheSecurityGroupAsync(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the detailed parameter list for a particular
     * CacheParameterGroup.
     * </p>
     *
     * @param describeCacheParametersRequest Container for the necessary
     *           parameters to execute the DescribeCacheParameters operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheParameters service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheParametersResult> describeCacheParametersAsync(DescribeCacheParametersRequest describeCacheParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified cache engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EngineDefaults> describeEngineDefaultParametersAsync(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a CacheParameterGroup to the engine or
     * system default value. To reset specific parameters submit a list of
     * the parameter names. To reset the entire CacheParameterGroup, specify
     * the CacheParameterGroup name and ResetAllParameters parameters.
     * </p>
     *
     * @param resetCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetCacheParameterGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ResetCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        