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

import com.amazonaws.*;
import com.amazonaws.services.elasticache.model.*;


/**
 * Interface for accessing AmazonElastiCache.
 * Amazon ElastiCache <p>
 * Amazon ElastiCache is a web service that makes it easier to set up,
 * operate, and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With Amazon ElastiCache, customers gain all of the benefits of a
 * high-performance, in-memory cache with far less of the administrative
 * burden of launching and managing a distributed cache. The service
 * makes set-up, scaling, and cluster failure handling much simpler than
 * in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers
 * get enhanced visibility into the key performance statistics associated
 * with their cache and can receive alarms if a part of their cache runs
 * hot.
 * </p>
 */
public interface AmazonElastiCache {

    /**
     * Overrides the default endpoint for this client ("https://elasticache.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Modifies the parameters of a CacheParameterGroup. To modify more than
     * one parameter, submit a list of ParameterName and ParameterValue
     * parameters. A maximum of 20 parameters can be modified in a single
     * request.
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
     * Lists available reserved Cache Node offerings.
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
     * Deletes a previously provisioned Cache Cluster. A successful response
     * from the web service indicates the request was received correctly.
     * This action cannot be canceled or reverted. DeleteCacheCluster deletes
     * all associated Cache Nodes, node endpoints and the Cache Cluster
     * itself.
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
     * Creates a new Cache Cluster.
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
     * @throws NodeQuotaForClusterExceededException
     * @throws InvalidParameterValueException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws CacheClusterAlreadyExistsException
     * @throws InsufficientCacheClusterCapacityException
     * @throws InvalidParameterCombinationException
     * @throws CacheParameterGroupNotFoundException
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
    public CacheCluster createCacheCluster(CreateCacheClusterRequest createCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes ingress from a CacheSecurityGroup for previously authorized
     * EC2 Security Groups.
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
     * Creates a new Cache Parameter Group. Cache Parameter groups control
     * the parameters for a Cache Cluster.
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
     * Returns events related to Cache Clusters, Cache Security Groups, and
     * Cache Parameter Groups for the past 14 days. Events specific to a
     * particular Cache Cluster, Cache Security Group, or Cache Parameter
     * Group can be obtained by providing the name as a parameter. By
     * default, the past hour of events are returned.
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
     * Returns information about reserved Cache Nodes for this account, or
     * about a specified reserved Cache Node.
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
     * Returns a list of CacheParameterGroup descriptions. If a
     * CacheParameterGroupName is specified, the list will contain only the
     * descriptions of the specified CacheParameterGroup.
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
     * Deletes the specified CacheParameterGroup. The CacheParameterGroup
     * cannot be deleted if it is associated with any cache clusters.
     * </p>
     *
     * @param deleteCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheParameterGroup service method on
     *           AmazonElastiCache.
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
     * Deletes a Cache Security Group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified Cache Security Group must not be associated
     * with any Cache Clusters.
     * </p>
     *
     * @param deleteCacheSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheSecurityGroup service method on
     *           AmazonElastiCache.
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
     * Purchases a reserved Cache Node offering.
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
     * Modifies the Cache Cluster settings. You can change one or more Cache
     * Cluster configuration parameters by specifying the parameters and the
     * new values in the request.
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
     * Returns a list of CacheSecurityGroup descriptions. If a
     * CacheSecurityGroupName is specified, the list will contain only the
     * description of the specified CacheSecurityGroup.
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
     * Creates a new Cache Security Group. Cache Security groups control
     * access to one or more Cache Clusters.
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
     * Returns the detailed parameter list for a particular
     * CacheParameterGroup.
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
     * Returns the default engine and system parameter information for the
     * specified cache engine.
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
     * Modifies the parameters of a CacheParameterGroup to the engine or
     * system default value. To reset specific parameters submit a list of
     * the parameter names. To reset the entire CacheParameterGroup, specify
     * the CacheParameterGroup name and ResetAllParameters parameters.
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
     * Lists available reserved Cache Node offerings.
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
     * Returns events related to Cache Clusters, Cache Security Groups, and
     * Cache Parameter Groups for the past 14 days. Events specific to a
     * particular Cache Cluster, Cache Security Group, or Cache Parameter
     * Group can be obtained by providing the name as a parameter. By
     * default, the past hour of events are returned.
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
     * Returns information about reserved Cache Nodes for this account, or
     * about a specified reserved Cache Node.
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
     * Returns a list of CacheParameterGroup descriptions. If a
     * CacheParameterGroupName is specified, the list will contain only the
     * descriptions of the specified CacheParameterGroup.
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
     * Returns a list of CacheSecurityGroup descriptions. If a
     * CacheSecurityGroupName is specified, the list will contain only the
     * description of the specified CacheSecurityGroup.
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
        