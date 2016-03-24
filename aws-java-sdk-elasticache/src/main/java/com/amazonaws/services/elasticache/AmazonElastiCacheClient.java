/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.services.elasticache.model.transform.*;

/**
 * Client for accessing AmazonElastiCache.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon ElastiCache <p>
 * Amazon ElastiCache is a web service that makes it easier to set up,
 * operate, and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With ElastiCache, customers gain all of the benefits of a
 * high-performance, in-memory cache with far less of the administrative
 * burden of launching and managing a distributed cache. The service
 * makes setup, scaling, and cluster failure handling much simpler than
 * in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get
 * enhanced visibility into the key performance statistics associated
 * with their cache and can receive alarms if a part of their cache runs
 * hot.
 * </p>
 */
public class AmazonElastiCacheClient extends AmazonWebServiceClient implements AmazonElastiCache {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonElastiCache exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, org.w3c.dom.Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, org.w3c.dom.Node>>();

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
     * @see DefaultAWSCredentialsProviderChain
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
     * @see DefaultAWSCredentialsProviderChain
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
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
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
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new TagQuotaPerResourceExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCacheClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotNotFoundExceptionUnmarshaller());
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
        exceptionUnmarshallers.add(new TagNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidARNExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotFeatureNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForClusterExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticache.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticache/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/elasticache/request.handler2s"));
    }

    /**
     * <p>
     * The <i>DescribeEngineDefaultParameters</i> action returns the default
     * engine and system parameter information for the specified cache
     * engine.
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
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultParametersRequest> request = null;
        Response<EngineDefaults> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineDefaultParametersRequestMarshaller().marshall(super.beforeMarshalling(describeEngineDefaultParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new EngineDefaultsStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
     * This API cannot be used to delete a cache cluster that is the last
     * read replica of a replication group that has Multi-AZ mode enabled.
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
     * @throws SnapshotFeatureNotSupportedException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCacheClusterStateException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CacheCluster deleteCacheCluster(DeleteCacheClusterRequest deleteCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DeleteReplicationGroup</i> action deletes an existing
     * replication group. By default, this action deletes the entire
     * replication group, including the primary cluster and all of the read
     * replicas. You can optionally delete only the read replicas, while
     * retaining the primary cluster.
     * </p>
     * <p>
     * When you receive a successful response from this action, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this action.
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
     * @throws SnapshotFeatureNotSupportedException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest deleteReplicationGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ReplicationGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> action returns information
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
    public DescribeReservedCacheNodesResult describeReservedCacheNodes(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesRequest> request = null;
        Response<DescribeReservedCacheNodesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedCacheNodesRequestMarshaller().marshall(super.beforeMarshalling(describeReservedCacheNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReservedCacheNodesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DeleteSnapshot</i> action deletes an existing snapshot. When
     * you receive a successful response from this action, ElastiCache
     * immediately begins deleting the snapshot; you cannot cancel or revert
     * this action.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot service method on AmazonElastiCache.
     * 
     * @return The response from the DeleteSnapshot service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidSnapshotStateException
     * @throws InvalidParameterValueException
     * @throws SnapshotNotFoundException
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
    public Snapshot deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DeleteCacheSubnetGroup</i> action deletes a cache subnet
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete a cache subnet group if it is
     * associated with any cache clusters.
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
    public void deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteCacheSubnetGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSubnetGroupRequest> request = null;
        Response<CacheSubnetGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheSubnetGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeCacheParameters</i> action returns the detailed
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
    public DescribeCacheParametersResult describeCacheParameters(DescribeCacheParametersRequest describeCacheParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParametersRequest> request = null;
        Response<DescribeCacheParametersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheParametersRequestMarshaller().marshall(super.beforeMarshalling(describeCacheParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeCacheParametersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>ListTagsForResource</i> action lists all cost allocation tags
     * currently on the named resource. A <i>cost allocation tag</i> is a
     * key-value pair where the key is case-sensitive and the value is
     * optional. Cost allocation tags can be used to categorize and track
     * your AWS costs.
     * </p>
     * <p>
     * You can have a maximum of 10 cost allocation tags on an ElastiCache
     * resource. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/BestPractices.html"> Using Cost Allocation Tags in Amazon ElastiCache </a>
     * .
     * </p>
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ListTagsForResource service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws SnapshotNotFoundException
     * @throws CacheClusterNotFoundException
     * @throws InvalidARNException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListTagsForResourceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DeleteCacheSecurityGroup</i> action deletes a cache security
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
    public void deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteCacheSecurityGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>ListAllowedNodeTypeModifications</code> action lists all
     * available node types that you can scale your Redis cluster's or
     * replication group's current node type up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code> APIs to scale up your cluster or
     * replication group, the value of the <i>CacheNodeType</i> parameter
     * must be one of the node types returned by this action.
     * </p>
     *
     * @param listAllowedNodeTypeModificationsRequest Container for the
     *           necessary parameters to execute the ListAllowedNodeTypeModifications
     *           service method on AmazonElastiCache.
     * 
     * @return The response from the ListAllowedNodeTypeModifications service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws CacheClusterNotFoundException
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
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAllowedNodeTypeModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAllowedNodeTypeModificationsRequest> request = null;
        Response<ListAllowedNodeTypeModificationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAllowedNodeTypeModificationsRequestMarshaller().marshall(super.beforeMarshalling(listAllowedNodeTypeModificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListAllowedNodeTypeModificationsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>AddTagsToResource</i> action adds up to 10 cost allocation
     * tags to the named resource. A <i>cost allocation tag</i> is a
     * key-value pair where the key and value are case-sensitive. Cost
     * allocation tags can be used to categorize and track your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a
     * cost allocation report as a comma-separated value (CSV) file with your
     * usage and costs aggregated by your tags. You can apply tags that
     * represent business categories (such as cost centers, application
     * names, or owners) to organize your costs across multiple services. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Tagging.html"> Using Cost Allocation Tags in Amazon ElastiCache </a>
     * .
     * </p>
     *
     * @param addTagsToResourceRequest Container for the necessary parameters
     *           to execute the AddTagsToResource service method on AmazonElastiCache.
     * 
     * @return The response from the AddTagsToResource service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws SnapshotNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws CacheClusterNotFoundException
     * @throws InvalidARNException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller().marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new AddTagsToResourceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeSnapshots</i> action returns information about cache
     * cluster snapshots. By default, <i>DescribeSnapshots</i> lists all of
     * your snapshots; it can optionally describe a single snapshot, or just
     * the snapshots associated with a particular cache cluster.
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots service method on AmazonElastiCache.
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws SnapshotNotFoundException
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
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeSnapshotsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>CopySnapshot</i> action makes a copy of an existing snapshot.
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot service method on AmazonElastiCache.
     * 
     * @return The response from the CopySnapshot service method, as returned
     *         by AmazonElastiCache.
     * 
     * @throws InvalidSnapshotStateException
     * @throws InvalidParameterValueException
     * @throws SnapshotNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot copySnapshot(CopySnapshotRequest copySnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestMarshaller().marshall(super.beforeMarshalling(copySnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> action returns a list of cache
     * security group descriptions. If a cache security group name is
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
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSecurityGroupsRequest> request = null;
        Response<DescribeCacheSecurityGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeCacheSecurityGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>RevokeCacheSecurityGroupIngress</i> action revokes ingress
     * from a cache security group. Use this action to disallow access from
     * an Amazon EC2 security group that had been previously authorized.
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
    public CacheSecurityGroup revokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeCacheSecurityGroupIngressRequest> request = null;
        Response<CacheSecurityGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeCacheSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(revokeCacheSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheSecurityGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>CreateReplicationGroup</i> action creates a replication group.
     * A replication group is a collection of cache clusters, where one of
     * the cache clusters is a read/write primary and the others are
     * read-only replicas. Writes to the primary are automatically propagated
     * to the replicas.
     * </p>
     * <p>
     * When you create a replication group, you must specify an existing
     * cache cluster that is in the primary role. When the replication group
     * has been successfully created, you can add one or more read replica
     * replicas to it, up to a total of five read replicas.
     * </p>
     * <p>
     * <b>Note:</b> This action is valid only for Redis.
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
     * @throws NodeQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws CacheSubnetGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws TagQuotaPerResourceExceededException
     * @throws InsufficientCacheClusterCapacityException
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
    public ReplicationGroup createReplicationGroup(CreateReplicationGroupRequest createReplicationGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(createReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ReplicationGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>RemoveTagsFromResource</i> action removes the tags identified
     * by the <code>TagKeys</code> list from the named resource.
     * </p>
     *
     * @param removeTagsFromResourceRequest Container for the necessary
     *           parameters to execute the RemoveTagsFromResource service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the RemoveTagsFromResource service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws TagNotFoundException
     * @throws SnapshotNotFoundException
     * @throws CacheClusterNotFoundException
     * @throws InvalidARNException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller().marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new RemoveTagsFromResourceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>CreateCacheCluster</i> action creates a cache cluster. All
     * nodes in the cache cluster run the same protocol-compliant cache
     * engine software, either Memcached or Redis.
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
     * @throws TagQuotaPerResourceExceededException
     * @throws InsufficientCacheClusterCapacityException
     * @throws InvalidParameterCombinationException
     * @throws ReplicationGroupNotFoundException
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
    public CacheCluster createCacheCluster(CreateCacheClusterRequest createCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(createCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
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
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions(DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheEngineVersionsRequest> request = null;
        Response<DescribeCacheEngineVersionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheEngineVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeCacheEngineVersionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> action modifies an existing cache
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
    public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheSubnetGroupRequest> request = null;
        Response<CacheSubnetGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheSubnetGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> action deletes the specified
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
    public void deleteCacheParameterGroup(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteCacheParameterGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <i>CreateSnapshot</i> action creates a copy of an entire cache
     * cluster at a specific moment in time.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot service method on AmazonElastiCache.
     * 
     * @return The response from the CreateSnapshot service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws SnapshotFeatureNotSupportedException
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws SnapshotAlreadyExistsException
     * @throws InvalidCacheClusterStateException
     * @throws SnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot createSnapshot(CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeEvents</i> action returns events related to cache
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
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>AuthorizeCacheSecurityGroupIngress</i> action allows network
     * ingress to a cache security group. Applications using ElastiCache must
     * be running on Amazon EC2, and Amazon EC2 security groups are used as
     * the authorization mechanism.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot authorize ingress from an Amazon EC2 security
     * group in one region to an ElastiCache cluster in another region.
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
    public CacheSecurityGroup authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(authorizeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeCacheSecurityGroupIngressRequest> request = null;
        Response<CacheSecurityGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeCacheSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(authorizeCacheSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheSecurityGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> action allows you to
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
    public ReservedCacheNode purchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedCacheNodesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedCacheNodesOfferingRequest> request = null;
        Response<ReservedCacheNode> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedCacheNodesOfferingRequestMarshaller().marshall(super.beforeMarshalling(purchaseReservedCacheNodesOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ReservedCacheNodeStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> action modifies the settings for a
     * replication group.
     * </p>
     *
     * @param modifyReplicationGroupRequest Container for the necessary
     *           parameters to execute the ModifyReplicationGroup service method on
     *           AmazonElastiCache.
     * 
     * @return The response from the ModifyReplicationGroup service method,
     *         as returned by AmazonElastiCache.
     * 
     * @throws NodeQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheClusterNotFoundException
     * @throws ReplicationGroupNotFoundException
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
    public ReplicationGroup modifyReplicationGroup(ModifyReplicationGroupRequest modifyReplicationGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ReplicationGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeReplicationGroups</i> action returns information about
     * a particular replication group. If no identifier is specified,
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
    public DescribeReplicationGroupsResult describeReplicationGroups(DescribeReplicationGroupsRequest describeReplicationGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReplicationGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationGroupsRequest> request = null;
        Response<DescribeReplicationGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeReplicationGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReplicationGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> action modifies the parameters
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
    public ModifyCacheParameterGroupResult modifyCacheParameterGroup(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheParameterGroupRequest> request = null;
        Response<ModifyCacheParameterGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ModifyCacheParameterGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
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
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesOfferingsRequest> request = null;
        Response<DescribeReservedCacheNodesOfferingsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedCacheNodesOfferingsRequestMarshaller().marshall(super.beforeMarshalling(describeReservedCacheNodesOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReservedCacheNodesOfferingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>ModifyCacheCluster</i> action modifies the settings for a
     * cache cluster. You can use this action to change one or more cluster
     * configuration parameters by specifying the parameters and the new
     * values.
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
     * @throws InsufficientCacheClusterCapacityException
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
    public CacheCluster modifyCacheCluster(ModifyCacheClusterRequest modifyCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>ResetCacheParameterGroup</i> action modifies the parameters of
     * a cache parameter group to the engine or system default value. You can
     * reset specific parameters by submitting a list of parameter names. To
     * reset the entire cache parameter group, specify the
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
    public ResetCacheParameterGroupResult resetCacheParameterGroup(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(resetCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheParameterGroupRequest> request = null;
        Response<ResetCacheParameterGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ResetCacheParameterGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeCacheClusters</i> action returns information about all
     * provisioned cache clusters if no cache cluster identifier is
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
    public DescribeCacheClustersResult describeCacheClusters(DescribeCacheClustersRequest describeCacheClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheClustersRequest> request = null;
        Response<DescribeCacheClustersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheClustersRequestMarshaller().marshall(super.beforeMarshalling(describeCacheClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeCacheClustersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>CreateCacheSecurityGroup</i> action creates a new cache
     * security group. Use a cache security group to control access to one or
     * more cache clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cache
     * cluster outside of an Amazon Virtual Private Cloud (VPC). If you are
     * creating a cache cluster inside of a VPC, use a cache subnet group
     * instead. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"> CreateCacheSubnetGroup </a>
     * .
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
    public CacheSecurityGroup createCacheSecurityGroup(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSecurityGroupRequest> request = null;
        Response<CacheSecurityGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheSecurityGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
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
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSubnetGroupsRequest> request = null;
        Response<DescribeCacheSubnetGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheSubnetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeCacheSubnetGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> action returns a list of
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
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParameterGroupsRequest> request = null;
        Response<DescribeCacheParameterGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeCacheParameterGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>RebootCacheCluster</i> action reboots some, or all, of the
     * cache nodes within a provisioned cache cluster. This API will apply
     * any modified cache parameter groups to the cache cluster. The reboot
     * action takes place as soon as possible, and results in a momentary
     * outage to the cache cluster. During the reboot, the cache cluster
     * status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node
     * being rebooted) to be lost.
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
    public CacheCluster rebootCacheCluster(RebootCacheClusterRequest rebootCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(rebootCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> action creates a new cache
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
    public CacheParameterGroup createCacheParameterGroup(CreateCacheParameterGroupRequest createCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheParameterGroupRequest> request = null;
        Response<CacheParameterGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CacheParameterGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> action returns information
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
     * The <code>ListAllowedNodeTypeModifications</code> action lists all
     * available node types that you can scale your Redis cluster's or
     * replication group's current node type up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code> APIs to scale up your cluster or
     * replication group, the value of the <i>CacheNodeType</i> parameter
     * must be one of the node types returned by this action.
     * </p>
     * 
     * @return The response from the ListAllowedNodeTypeModifications service
     *         method, as returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws CacheClusterNotFoundException
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
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications() throws AmazonServiceException, AmazonClientException {
        return listAllowedNodeTypeModifications(new ListAllowedNodeTypeModificationsRequest());
    }
    
    /**
     * <p>
     * The <i>DescribeSnapshots</i> action returns information about cache
     * cluster snapshots. By default, <i>DescribeSnapshots</i> lists all of
     * your snapshots; it can optionally describe a single snapshot, or just
     * the snapshots associated with a particular cache cluster.
     * </p>
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AmazonElastiCache.
     * 
     * @throws InvalidParameterValueException
     * @throws SnapshotNotFoundException
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
    public DescribeSnapshotsResult describeSnapshots() throws AmazonServiceException, AmazonClientException {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }
    
    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> action returns a list of cache
     * security group descriptions. If a cache security group name is
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
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
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
    
    /**
     * <p>
     * The <i>DescribeEvents</i> action returns events related to cache
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
     * The <i>DescribeReplicationGroups</i> action returns information about
     * a particular replication group. If no identifier is specified,
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
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
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
     * The <i>DescribeCacheClusters</i> action returns information about all
     * provisioned cache clusters if no cache cluster identifier is
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
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
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
     * The <i>DescribeCacheParameterGroups</i> action returns a list of
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

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        