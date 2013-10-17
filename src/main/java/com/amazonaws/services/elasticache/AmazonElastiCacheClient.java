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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.services.elasticache.model.transform.*;


/**
 * Client for accessing AmazonElastiCache.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AmazonElastiCacheClient extends AmazonWebServiceClient implements AmazonElastiCache {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonElastiCache exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonElastiCacheClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElastiCache
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonElastiCacheClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonElastiCacheClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElastiCache
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElastiCacheClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElastiCache
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InsufficientCacheClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodesOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForClusterExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("elasticache.us-east-1.amazonaws.com/");

        signer = new QueryStringSigner();
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticache/request.handlers"));
    }

    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReservedCacheNodesOfferingsRequest> request = new DescribeReservedCacheNodesOfferingsRequestMarshaller().marshall(describeReservedCacheNodesOfferingsRequest);
        return invoke(request, new DescribeReservedCacheNodesOfferingsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteReplicationGroupRequest> request = new DeleteReplicationGroupRequestMarshaller().marshall(deleteReplicationGroupRequest);
        return invoke(request, new ReplicationGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyCacheClusterRequest> request = new ModifyCacheClusterRequestMarshaller().marshall(modifyCacheClusterRequest);
        return invoke(request, new CacheClusterStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<RevokeCacheSecurityGroupIngressRequest> request = new RevokeCacheSecurityGroupIngressRequestMarshaller().marshall(revokeCacheSecurityGroupIngressRequest);
        return invoke(request, new CacheSecurityGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReplicationGroupsRequest> request = new DescribeReplicationGroupsRequestMarshaller().marshall(describeReplicationGroupsRequest);
        return invoke(request, new DescribeReplicationGroupsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateCacheClusterRequest> request = new CreateCacheClusterRequestMarshaller().marshall(createCacheClusterRequest);
        return invoke(request, new CacheClusterStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateReplicationGroupRequest> request = new CreateReplicationGroupRequestMarshaller().marshall(createReplicationGroupRequest);
        return invoke(request, new ReplicationGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteCacheClusterRequest> request = new DeleteCacheClusterRequestMarshaller().marshall(deleteCacheClusterRequest);
        return invoke(request, new CacheClusterStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCacheSecurityGroupsRequest> request = new DescribeCacheSecurityGroupsRequestMarshaller().marshall(describeCacheSecurityGroupsRequest);
        return invoke(request, new DescribeCacheSecurityGroupsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyReplicationGroupRequest> request = new ModifyReplicationGroupRequestMarshaller().marshall(modifyReplicationGroupRequest);
        return invoke(request, new ReplicationGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCacheClustersRequest> request = new DescribeCacheClustersRequestMarshaller().marshall(describeCacheClustersRequest);
        return invoke(request, new DescribeCacheClustersResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateCacheParameterGroupRequest> request = new CreateCacheParameterGroupRequestMarshaller().marshall(createCacheParameterGroupRequest);
        return invoke(request, new CacheParameterGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCacheParameterGroupsRequest> request = new DescribeCacheParameterGroupsRequestMarshaller().marshall(describeCacheParameterGroupsRequest);
        return invoke(request, new DescribeCacheParameterGroupsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCacheSubnetGroupsRequest> request = new DescribeCacheSubnetGroupsRequestMarshaller().marshall(describeCacheSubnetGroupsRequest);
        return invoke(request, new DescribeCacheSubnetGroupsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyCacheSubnetGroupRequest> request = new ModifyCacheSubnetGroupRequestMarshaller().marshall(modifyCacheSubnetGroupRequest);
        return invoke(request, new CacheSubnetGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteCacheParameterGroupRequest> request = new DeleteCacheParameterGroupRequestMarshaller().marshall(deleteCacheParameterGroupRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCacheParametersRequest> request = new DescribeCacheParametersRequestMarshaller().marshall(describeCacheParametersRequest);
        return invoke(request, new DescribeCacheParametersResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReservedCacheNodesRequest> request = new DescribeReservedCacheNodesRequestMarshaller().marshall(describeReservedCacheNodesRequest);
        return invoke(request, new DescribeReservedCacheNodesResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteCacheSubnetGroupRequest> request = new DeleteCacheSubnetGroupRequestMarshaller().marshall(deleteCacheSubnetGroupRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeEventsRequest> request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
        return invoke(request, new DescribeEventsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteCacheSecurityGroupRequest> request = new DeleteCacheSecurityGroupRequestMarshaller().marshall(deleteCacheSecurityGroupRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeEngineDefaultParametersRequest> request = new DescribeEngineDefaultParametersRequestMarshaller().marshall(describeEngineDefaultParametersRequest);
        return invoke(request, new EngineDefaultsStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<AuthorizeCacheSecurityGroupIngressRequest> request = new AuthorizeCacheSecurityGroupIngressRequestMarshaller().marshall(authorizeCacheSecurityGroupIngressRequest);
        return invoke(request, new CacheSecurityGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateCacheSubnetGroupRequest> request = new CreateCacheSubnetGroupRequestMarshaller().marshall(createCacheSubnetGroupRequest);
        return invoke(request, new CacheSubnetGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCacheEngineVersionsRequest> request = new DescribeCacheEngineVersionsRequestMarshaller().marshall(describeCacheEngineVersionsRequest);
        return invoke(request, new DescribeCacheEngineVersionsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateCacheSecurityGroupRequest> request = new CreateCacheSecurityGroupRequestMarshaller().marshall(createCacheSecurityGroupRequest);
        return invoke(request, new CacheSecurityGroupStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<PurchaseReservedCacheNodesOfferingRequest> request = new PurchaseReservedCacheNodesOfferingRequestMarshaller().marshall(purchaseReservedCacheNodesOfferingRequest);
        return invoke(request, new ReservedCacheNodeStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ResetCacheParameterGroupRequest> request = new ResetCacheParameterGroupRequestMarshaller().marshall(resetCacheParameterGroupRequest);
        return invoke(request, new ResetCacheParameterGroupResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyCacheParameterGroupRequest> request = new ModifyCacheParameterGroupRequestMarshaller().marshall(modifyCacheParameterGroupRequest);
        return invoke(request, new ModifyCacheParameterGroupResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<RebootCacheClusterRequest> request = new RebootCacheClusterRequestMarshaller().marshall(rebootCacheClusterRequest);
        return invoke(request, new CacheClusterStaxUnmarshaller());
    }
    
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
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() throws AmazonServiceException, AmazonClientException {
        return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest());
    }
    
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
    public DescribeReplicationGroupsResult describeReplicationGroups() throws AmazonServiceException, AmazonClientException {
        return describeReplicationGroups(new DescribeReplicationGroupsRequest());
    }
    
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
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups() throws AmazonServiceException, AmazonClientException {
        return describeCacheSecurityGroups(new DescribeCacheSecurityGroupsRequest());
    }
    
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
    public DescribeCacheClustersResult describeCacheClusters() throws AmazonServiceException, AmazonClientException {
        return describeCacheClusters(new DescribeCacheClustersRequest());
    }
    
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
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups() throws AmazonServiceException, AmazonClientException {
        return describeCacheParameterGroups(new DescribeCacheParameterGroupsRequest());
    }
    
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
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups() throws AmazonServiceException, AmazonClientException {
        return describeCacheSubnetGroups(new DescribeCacheSubnetGroupsRequest());
    }
    
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
    public DescribeReservedCacheNodesResult describeReservedCacheNodes() throws AmazonServiceException, AmazonClientException {
        return describeReservedCacheNodes(new DescribeReservedCacheNodesRequest());
    }
    
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
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException {
        return describeEvents(new DescribeEventsRequest());
    }
    
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
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions() throws AmazonServiceException, AmazonClientException {
        return describeCacheEngineVersions(new DescribeCacheEngineVersionsRequest());
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "elasticache";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext(originalRequest);
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        