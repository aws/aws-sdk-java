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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.elasticache.model.*;

/**
 * Asynchronous client for accessing AmazonElastiCache.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
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
public class AmazonElastiCacheAsyncClient extends AmazonElastiCacheClient
        implements AmazonElastiCacheAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private final ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AmazonElastiCacheAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AmazonElastiCacheAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonElastiCacheAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonElastiCacheAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonElastiCacheAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonElastiCacheAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonElastiCacheAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AmazonElastiCacheAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonElastiCacheAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
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
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         AmazonElastiCache.
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
    public Future<EngineDefaults> describeEngineDefaultParametersAsync(final DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EngineDefaults>() {
            public EngineDefaults call() throws Exception {
                return describeEngineDefaultParameters(describeEngineDefaultParametersRequest);
        }
    });
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
     *           operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         AmazonElastiCache.
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
    public Future<EngineDefaults> describeEngineDefaultParametersAsync(
            final DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest,
            final AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EngineDefaults>() {
            public EngineDefaults call() throws Exception {
              EngineDefaults result;
                try {
                result = describeEngineDefaultParameters(describeEngineDefaultParametersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeEngineDefaultParametersRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the DeleteCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> deleteCacheClusterAsync(final DeleteCacheClusterRequest deleteCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
                return deleteCacheCluster(deleteCacheClusterRequest);
        }
    });
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
     *           parameters to execute the DeleteCacheCluster operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> deleteCacheClusterAsync(
            final DeleteCacheClusterRequest deleteCacheClusterRequest,
            final AsyncHandler<DeleteCacheClusterRequest, CacheCluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
              CacheCluster result;
                try {
                result = deleteCacheCluster(deleteCacheClusterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteCacheClusterRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the DeleteReplicationGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteReplicationGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReplicationGroup> deleteReplicationGroupAsync(final DeleteReplicationGroupRequest deleteReplicationGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicationGroup>() {
            public ReplicationGroup call() throws Exception {
                return deleteReplicationGroup(deleteReplicationGroupRequest);
        }
    });
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
     *           parameters to execute the DeleteReplicationGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteReplicationGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReplicationGroup> deleteReplicationGroupAsync(
            final DeleteReplicationGroupRequest deleteReplicationGroupRequest,
            final AsyncHandler<DeleteReplicationGroupRequest, ReplicationGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicationGroup>() {
            public ReplicationGroup call() throws Exception {
              ReplicationGroup result;
                try {
                result = deleteReplicationGroup(deleteReplicationGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteReplicationGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> action returns information
     * about reserved cache nodes for this account, or about a specified
     * reserved cache node.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(final DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedCacheNodesResult>() {
            public DescribeReservedCacheNodesResult call() throws Exception {
                return describeReservedCacheNodes(describeReservedCacheNodesRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeReservedCacheNodes</i> action returns information
     * about reserved cache nodes for this account, or about a specified
     * reserved cache node.
     * </p>
     *
     * @param describeReservedCacheNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedCacheNodes operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedCacheNodes service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            final DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest,
            final AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedCacheNodesResult>() {
            public DescribeReservedCacheNodesResult call() throws Exception {
              DescribeReservedCacheNodesResult result;
                try {
                result = describeReservedCacheNodes(describeReservedCacheNodesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeReservedCacheNodesRequest, result);
                 return result;
        }
    });
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
     *           execute the DeleteSnapshot operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AmazonElastiCache.
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
    public Future<Snapshot> deleteSnapshotAsync(final DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return deleteSnapshot(deleteSnapshotRequest);
        }
    });
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
     *           execute the DeleteSnapshot operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AmazonElastiCache.
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
    public Future<Snapshot> deleteSnapshotAsync(
            final DeleteSnapshotRequest deleteSnapshotRequest,
            final AsyncHandler<DeleteSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
              Snapshot result;
                try {
                result = deleteSnapshot(deleteSnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteSnapshotRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the DeleteCacheSubnetGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheSubnetGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<Void> deleteCacheSubnetGroupAsync(final DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteCacheSubnetGroup(deleteCacheSubnetGroupRequest);
                return null;
        }
    });
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
     *           parameters to execute the DeleteCacheSubnetGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheSubnetGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<Void> deleteCacheSubnetGroupAsync(
            final DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest,
            final AsyncHandler<DeleteCacheSubnetGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteCacheSubnetGroup(deleteCacheSubnetGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteCacheSubnetGroupRequest, null);
                 return null;
        }
    });
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
     *           parameters to execute the CreateCacheSubnetGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheSubnetGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSubnetGroup> createCacheSubnetGroupAsync(final CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSubnetGroup>() {
            public CacheSubnetGroup call() throws Exception {
                return createCacheSubnetGroup(createCacheSubnetGroupRequest);
        }
    });
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
     *           parameters to execute the CreateCacheSubnetGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheSubnetGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSubnetGroup> createCacheSubnetGroupAsync(
            final CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest,
            final AsyncHandler<CreateCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSubnetGroup>() {
            public CacheSubnetGroup call() throws Exception {
              CacheSubnetGroup result;
                try {
                result = createCacheSubnetGroup(createCacheSubnetGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createCacheSubnetGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeCacheParameters</i> action returns the detailed
     * parameter list for a particular cache parameter group.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheParametersResult> describeCacheParametersAsync(final DescribeCacheParametersRequest describeCacheParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheParametersResult>() {
            public DescribeCacheParametersResult call() throws Exception {
                return describeCacheParameters(describeCacheParametersRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeCacheParameters</i> action returns the detailed
     * parameter list for a particular cache parameter group.
     * </p>
     *
     * @param describeCacheParametersRequest Container for the necessary
     *           parameters to execute the DescribeCacheParameters operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheParameters service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheParametersResult> describeCacheParametersAsync(
            final DescribeCacheParametersRequest describeCacheParametersRequest,
            final AsyncHandler<DescribeCacheParametersRequest, DescribeCacheParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheParametersResult>() {
            public DescribeCacheParametersResult call() throws Exception {
              DescribeCacheParametersResult result;
                try {
                result = describeCacheParameters(describeCacheParametersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCacheParametersRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the ListTagsForResource operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonElastiCache.
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
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest listTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                return listTagsForResource(listTagsForResourceRequest);
        }
    });
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
     *           parameters to execute the ListTagsForResource operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonElastiCache.
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
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest,
            final AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
              ListTagsForResourceResult result;
                try {
                result = listTagsForResource(listTagsForResourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listTagsForResourceRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the DeleteCacheSecurityGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheSecurityGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<Void> deleteCacheSecurityGroupAsync(final DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteCacheSecurityGroup(deleteCacheSecurityGroupRequest);
                return null;
        }
    });
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
     *           parameters to execute the DeleteCacheSecurityGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheSecurityGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<Void> deleteCacheSecurityGroupAsync(
            final DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest,
            final AsyncHandler<DeleteCacheSecurityGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteCacheSecurityGroup(deleteCacheSecurityGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteCacheSecurityGroupRequest, null);
                 return null;
        }
    });
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
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ListAllowedNodeTypeModifications service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(final ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAllowedNodeTypeModificationsResult>() {
            public ListAllowedNodeTypeModificationsResult call() throws Exception {
                return listAllowedNodeTypeModifications(listAllowedNodeTypeModificationsRequest);
        }
    });
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
     *           operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAllowedNodeTypeModifications service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            final ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest,
            final AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAllowedNodeTypeModificationsResult>() {
            public ListAllowedNodeTypeModificationsResult call() throws Exception {
              ListAllowedNodeTypeModificationsResult result;
                try {
                result = listAllowedNodeTypeModifications(listAllowedNodeTypeModificationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listAllowedNodeTypeModificationsRequest, result);
                 return result;
        }
    });
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
     *           to execute the AddTagsToResource operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by AmazonElastiCache.
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
    public Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest addTagsToResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsToResourceResult>() {
            public AddTagsToResourceResult call() throws Exception {
                return addTagsToResource(addTagsToResourceRequest);
        }
    });
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
     *           to execute the AddTagsToResource operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by AmazonElastiCache.
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
    public Future<AddTagsToResourceResult> addTagsToResourceAsync(
            final AddTagsToResourceRequest addTagsToResourceRequest,
            final AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsToResourceResult>() {
            public AddTagsToResourceResult call() throws Exception {
              AddTagsToResourceResult result;
                try {
                result = addTagsToResource(addTagsToResourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(addTagsToResourceRequest, result);
                 return result;
        }
    });
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
     *           to execute the DescribeSnapshots operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AmazonElastiCache.
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
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSnapshotsResult>() {
            public DescribeSnapshotsResult call() throws Exception {
                return describeSnapshots(describeSnapshotsRequest);
        }
    });
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
     *           to execute the DescribeSnapshots operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AmazonElastiCache.
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
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            final DescribeSnapshotsRequest describeSnapshotsRequest,
            final AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSnapshotsResult>() {
            public DescribeSnapshotsResult call() throws Exception {
              DescribeSnapshotsResult result;
                try {
                result = describeSnapshots(describeSnapshotsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeSnapshotsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>CopySnapshot</i> action makes a copy of an existing snapshot.
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CopySnapshot service method, as returned by AmazonElastiCache.
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
    public Future<Snapshot> copySnapshotAsync(final CopySnapshotRequest copySnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return copySnapshot(copySnapshotRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>CopySnapshot</i> action makes a copy of an existing snapshot.
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CopySnapshot service method, as returned by AmazonElastiCache.
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
    public Future<Snapshot> copySnapshotAsync(
            final CopySnapshotRequest copySnapshotRequest,
            final AsyncHandler<CopySnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
              Snapshot result;
                try {
                result = copySnapshot(copySnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(copySnapshotRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> action returns a list of cache
     * security group descriptions. If a cache security group name is
     * specified, the list will contain only the description of that group.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(final DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheSecurityGroupsResult>() {
            public DescribeCacheSecurityGroupsResult call() throws Exception {
                return describeCacheSecurityGroups(describeCacheSecurityGroupsRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeCacheSecurityGroups</i> action returns a list of cache
     * security group descriptions. If a cache security group name is
     * specified, the list will contain only the description of that group.
     * </p>
     *
     * @param describeCacheSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheSecurityGroups operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheSecurityGroups service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            final DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest,
            final AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheSecurityGroupsResult>() {
            public DescribeCacheSecurityGroupsResult call() throws Exception {
              DescribeCacheSecurityGroupsResult result;
                try {
                result = describeCacheSecurityGroups(describeCacheSecurityGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCacheSecurityGroupsRequest, result);
                 return result;
        }
    });
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
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeCacheSecurityGroupIngress service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(final RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSecurityGroup>() {
            public CacheSecurityGroup call() throws Exception {
                return revokeCacheSecurityGroupIngress(revokeCacheSecurityGroupIngressRequest);
        }
    });
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
     *           operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeCacheSecurityGroupIngress service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(
            final RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest,
            final AsyncHandler<RevokeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSecurityGroup>() {
            public CacheSecurityGroup call() throws Exception {
              CacheSecurityGroup result;
                try {
                result = revokeCacheSecurityGroupIngress(revokeCacheSecurityGroupIngressRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(revokeCacheSecurityGroupIngressRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the CreateReplicationGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReplicationGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReplicationGroup> createReplicationGroupAsync(final CreateReplicationGroupRequest createReplicationGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicationGroup>() {
            public ReplicationGroup call() throws Exception {
                return createReplicationGroup(createReplicationGroupRequest);
        }
    });
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
     *           parameters to execute the CreateReplicationGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReplicationGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReplicationGroup> createReplicationGroupAsync(
            final CreateReplicationGroupRequest createReplicationGroupRequest,
            final AsyncHandler<CreateReplicationGroupRequest, ReplicationGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicationGroup>() {
            public ReplicationGroup call() throws Exception {
              ReplicationGroup result;
                try {
                result = createReplicationGroup(createReplicationGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createReplicationGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>RemoveTagsFromResource</i> action removes the tags identified
     * by the <code>TagKeys</code> list from the named resource.
     * </p>
     *
     * @param removeTagsFromResourceRequest Container for the necessary
     *           parameters to execute the RemoveTagsFromResource operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by
     *         AmazonElastiCache.
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
    public Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest removeTagsFromResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsFromResourceResult>() {
            public RemoveTagsFromResourceResult call() throws Exception {
                return removeTagsFromResource(removeTagsFromResourceRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>RemoveTagsFromResource</i> action removes the tags identified
     * by the <code>TagKeys</code> list from the named resource.
     * </p>
     *
     * @param removeTagsFromResourceRequest Container for the necessary
     *           parameters to execute the RemoveTagsFromResource operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by
     *         AmazonElastiCache.
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
    public Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            final RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            final AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsFromResourceResult>() {
            public RemoveTagsFromResourceResult call() throws Exception {
              RemoveTagsFromResourceResult result;
                try {
                result = removeTagsFromResource(removeTagsFromResourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(removeTagsFromResourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>CreateCacheCluster</i> action creates a cache cluster. All
     * nodes in the cache cluster run the same protocol-compliant cache
     * engine software, either Memcached or Redis.
     * </p>
     *
     * @param createCacheClusterRequest Container for the necessary
     *           parameters to execute the CreateCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> createCacheClusterAsync(final CreateCacheClusterRequest createCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
                return createCacheCluster(createCacheClusterRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>CreateCacheCluster</i> action creates a cache cluster. All
     * nodes in the cache cluster run the same protocol-compliant cache
     * engine software, either Memcached or Redis.
     * </p>
     *
     * @param createCacheClusterRequest Container for the necessary
     *           parameters to execute the CreateCacheCluster operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> createCacheClusterAsync(
            final CreateCacheClusterRequest createCacheClusterRequest,
            final AsyncHandler<CreateCacheClusterRequest, CacheCluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
              CacheCluster result;
                try {
                result = createCacheCluster(createCacheClusterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createCacheClusterRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
     * available cache engines and their versions.
     * </p>
     *
     * @param describeCacheEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeCacheEngineVersions operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheEngineVersions service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(final DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheEngineVersionsResult>() {
            public DescribeCacheEngineVersionsResult call() throws Exception {
                return describeCacheEngineVersions(describeCacheEngineVersionsRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeCacheEngineVersions</i> action returns a list of the
     * available cache engines and their versions.
     * </p>
     *
     * @param describeCacheEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeCacheEngineVersions operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheEngineVersions service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            final DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest,
            final AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheEngineVersionsResult>() {
            public DescribeCacheEngineVersionsResult call() throws Exception {
              DescribeCacheEngineVersionsResult result;
                try {
                result = describeCacheEngineVersions(describeCacheEngineVersionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCacheEngineVersionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> action modifies an existing cache
     * subnet group.
     * </p>
     *
     * @param modifyCacheSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyCacheSubnetGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheSubnetGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(final ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSubnetGroup>() {
            public CacheSubnetGroup call() throws Exception {
                return modifyCacheSubnetGroup(modifyCacheSubnetGroupRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>ModifyCacheSubnetGroup</i> action modifies an existing cache
     * subnet group.
     * </p>
     *
     * @param modifyCacheSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyCacheSubnetGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheSubnetGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(
            final ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest,
            final AsyncHandler<ModifyCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSubnetGroup>() {
            public CacheSubnetGroup call() throws Exception {
              CacheSubnetGroup result;
                try {
                result = modifyCacheSubnetGroup(modifyCacheSubnetGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyCacheSubnetGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> action deletes the specified
     * cache parameter group. You cannot delete a cache parameter group if it
     * is associated with any cache clusters.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCacheParameterGroupAsync(final DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteCacheParameterGroup(deleteCacheParameterGroupRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * The <i>DeleteCacheParameterGroup</i> action deletes the specified
     * cache parameter group. You cannot delete a cache parameter group if it
     * is associated with any cache clusters.
     * </p>
     *
     * @param deleteCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteCacheParameterGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<Void> deleteCacheParameterGroupAsync(
            final DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest,
            final AsyncHandler<DeleteCacheParameterGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteCacheParameterGroup(deleteCacheParameterGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteCacheParameterGroupRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * The <i>CreateSnapshot</i> action creates a copy of an entire cache
     * cluster at a specific moment in time.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AmazonElastiCache.
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
    public Future<Snapshot> createSnapshotAsync(final CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return createSnapshot(createSnapshotRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>CreateSnapshot</i> action creates a copy of an entire cache
     * cluster at a specific moment in time.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AmazonElastiCache.
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
    public Future<Snapshot> createSnapshotAsync(
            final CreateSnapshotRequest createSnapshotRequest,
            final AsyncHandler<CreateSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
              Snapshot result;
                try {
                result = createSnapshot(createSnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createSnapshotRequest, result);
                 return result;
        }
    });
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
     *           execute the DescribeEvents operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonElastiCache.
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
    public Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
                return describeEvents(describeEventsRequest);
        }
    });
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
     *           execute the DescribeEvents operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonElastiCache.
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
    public Future<DescribeEventsResult> describeEventsAsync(
            final DescribeEventsRequest describeEventsRequest,
            final AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
              DescribeEventsResult result;
                try {
                result = describeEvents(describeEventsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeEventsRequest, result);
                 return result;
        }
    });
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
     *           operation on AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeCacheSecurityGroupIngress service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(final AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSecurityGroup>() {
            public CacheSecurityGroup call() throws Exception {
                return authorizeCacheSecurityGroupIngress(authorizeCacheSecurityGroupIngressRequest);
        }
    });
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
     *           operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeCacheSecurityGroupIngress service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(
            final AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest,
            final AsyncHandler<AuthorizeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSecurityGroup>() {
            public CacheSecurityGroup call() throws Exception {
              CacheSecurityGroup result;
                try {
                result = authorizeCacheSecurityGroupIngress(authorizeCacheSecurityGroupIngressRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(authorizeCacheSecurityGroupIngressRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> action allows you to
     * purchase a reserved cache node offering.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(final PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReservedCacheNode>() {
            public ReservedCacheNode call() throws Exception {
                return purchaseReservedCacheNodesOffering(purchaseReservedCacheNodesOfferingRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>PurchaseReservedCacheNodesOffering</i> action allows you to
     * purchase a reserved cache node offering.
     * </p>
     *
     * @param purchaseReservedCacheNodesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedCacheNodesOffering
     *           operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedCacheNodesOffering service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(
            final PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest,
            final AsyncHandler<PurchaseReservedCacheNodesOfferingRequest, ReservedCacheNode> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReservedCacheNode>() {
            public ReservedCacheNode call() throws Exception {
              ReservedCacheNode result;
                try {
                result = purchaseReservedCacheNodesOffering(purchaseReservedCacheNodesOfferingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(purchaseReservedCacheNodesOfferingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> action modifies the settings for a
     * replication group.
     * </p>
     *
     * @param modifyReplicationGroupRequest Container for the necessary
     *           parameters to execute the ModifyReplicationGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyReplicationGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReplicationGroup> modifyReplicationGroupAsync(final ModifyReplicationGroupRequest modifyReplicationGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicationGroup>() {
            public ReplicationGroup call() throws Exception {
                return modifyReplicationGroup(modifyReplicationGroupRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>ModifyReplicationGroup</i> action modifies the settings for a
     * replication group.
     * </p>
     *
     * @param modifyReplicationGroupRequest Container for the necessary
     *           parameters to execute the ModifyReplicationGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyReplicationGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ReplicationGroup> modifyReplicationGroupAsync(
            final ModifyReplicationGroupRequest modifyReplicationGroupRequest,
            final AsyncHandler<ModifyReplicationGroupRequest, ReplicationGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicationGroup>() {
            public ReplicationGroup call() throws Exception {
              ReplicationGroup result;
                try {
                result = modifyReplicationGroup(modifyReplicationGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyReplicationGroupRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the DescribeReplicationGroups operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReplicationGroups service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(final DescribeReplicationGroupsRequest describeReplicationGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReplicationGroupsResult>() {
            public DescribeReplicationGroupsResult call() throws Exception {
                return describeReplicationGroups(describeReplicationGroupsRequest);
        }
    });
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
     *           parameters to execute the DescribeReplicationGroups operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReplicationGroups service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            final DescribeReplicationGroupsRequest describeReplicationGroupsRequest,
            final AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReplicationGroupsResult>() {
            public DescribeReplicationGroupsResult call() throws Exception {
              DescribeReplicationGroupsResult result;
                try {
                result = describeReplicationGroups(describeReplicationGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeReplicationGroupsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> action modifies the parameters
     * of a cache parameter group. You can modify up to 20 parameters in a
     * single request by submitting a list parameter name and value pairs.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(final ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyCacheParameterGroupResult>() {
            public ModifyCacheParameterGroupResult call() throws Exception {
                return modifyCacheParameterGroup(modifyCacheParameterGroupRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>ModifyCacheParameterGroup</i> action modifies the parameters
     * of a cache parameter group. You can modify up to 20 parameters in a
     * single request by submitting a list parameter name and value pairs.
     * </p>
     *
     * @param modifyCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyCacheParameterGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(
            final ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest,
            final AsyncHandler<ModifyCacheParameterGroupRequest, ModifyCacheParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyCacheParameterGroupResult>() {
            public ModifyCacheParameterGroupResult call() throws Exception {
              ModifyCacheParameterGroupResult result;
                try {
                result = modifyCacheParameterGroup(modifyCacheParameterGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyCacheParameterGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(final DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedCacheNodesOfferingsResult>() {
            public DescribeReservedCacheNodesOfferingsResult call() throws Exception {
                return describeReservedCacheNodesOfferings(describeReservedCacheNodesOfferingsRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeReservedCacheNodesOfferings</i> action lists available
     * reserved cache node offerings.
     * </p>
     *
     * @param describeReservedCacheNodesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedCacheNodesOfferings operation on AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedCacheNodesOfferings service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            final DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest,
            final AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedCacheNodesOfferingsResult>() {
            public DescribeReservedCacheNodesOfferingsResult call() throws Exception {
              DescribeReservedCacheNodesOfferingsResult result;
                try {
                result = describeReservedCacheNodesOfferings(describeReservedCacheNodesOfferingsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeReservedCacheNodesOfferingsRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the ModifyCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> modifyCacheClusterAsync(final ModifyCacheClusterRequest modifyCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
                return modifyCacheCluster(modifyCacheClusterRequest);
        }
    });
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
     *           parameters to execute the ModifyCacheCluster operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> modifyCacheClusterAsync(
            final ModifyCacheClusterRequest modifyCacheClusterRequest,
            final AsyncHandler<ModifyCacheClusterRequest, CacheCluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
              CacheCluster result;
                try {
                result = modifyCacheCluster(modifyCacheClusterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyCacheClusterRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the ResetCacheParameterGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         ResetCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(final ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetCacheParameterGroupResult>() {
            public ResetCacheParameterGroupResult call() throws Exception {
                return resetCacheParameterGroup(resetCacheParameterGroupRequest);
        }
    });
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
     *           parameters to execute the ResetCacheParameterGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(
            final ResetCacheParameterGroupRequest resetCacheParameterGroupRequest,
            final AsyncHandler<ResetCacheParameterGroupRequest, ResetCacheParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetCacheParameterGroupResult>() {
            public ResetCacheParameterGroupResult call() throws Exception {
              ResetCacheParameterGroupResult result;
                try {
                result = resetCacheParameterGroup(resetCacheParameterGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(resetCacheParameterGroupRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the DescribeCacheClusters operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheClusters service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheClustersResult> describeCacheClustersAsync(final DescribeCacheClustersRequest describeCacheClustersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheClustersResult>() {
            public DescribeCacheClustersResult call() throws Exception {
                return describeCacheClusters(describeCacheClustersRequest);
        }
    });
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
     *           parameters to execute the DescribeCacheClusters operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheClusters service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheClustersResult> describeCacheClustersAsync(
            final DescribeCacheClustersRequest describeCacheClustersRequest,
            final AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheClustersResult>() {
            public DescribeCacheClustersResult call() throws Exception {
              DescribeCacheClustersResult result;
                try {
                result = describeCacheClusters(describeCacheClustersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCacheClustersRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the CreateCacheSecurityGroup operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheSecurityGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSecurityGroup> createCacheSecurityGroupAsync(final CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSecurityGroup>() {
            public CacheSecurityGroup call() throws Exception {
                return createCacheSecurityGroup(createCacheSecurityGroupRequest);
        }
    });
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
     *           parameters to execute the CreateCacheSecurityGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheSecurityGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheSecurityGroup> createCacheSecurityGroupAsync(
            final CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest,
            final AsyncHandler<CreateCacheSecurityGroupRequest, CacheSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheSecurityGroup>() {
            public CacheSecurityGroup call() throws Exception {
              CacheSecurityGroup result;
                try {
                result = createCacheSecurityGroup(createCacheSecurityGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createCacheSecurityGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the
     * list will contain only the description of that group.
     * </p>
     *
     * @param describeCacheSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheSubnetGroups operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheSubnetGroups service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(final DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheSubnetGroupsResult>() {
            public DescribeCacheSubnetGroupsResult call() throws Exception {
                return describeCacheSubnetGroups(describeCacheSubnetGroupsRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeCacheSubnetGroups</i> action returns a list of cache
     * subnet group descriptions. If a subnet group name is specified, the
     * list will contain only the description of that group.
     * </p>
     *
     * @param describeCacheSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheSubnetGroups operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheSubnetGroups service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            final DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest,
            final AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheSubnetGroupsResult>() {
            public DescribeCacheSubnetGroupsResult call() throws Exception {
              DescribeCacheSubnetGroupsResult result;
                try {
                result = describeCacheSubnetGroups(describeCacheSubnetGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCacheSubnetGroupsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> action returns a list of
     * cache parameter group descriptions. If a cache parameter group name is
     * specified, the list will contain only the descriptions for that group.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(final DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheParameterGroupsResult>() {
            public DescribeCacheParameterGroupsResult call() throws Exception {
                return describeCacheParameterGroups(describeCacheParameterGroupsRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>DescribeCacheParameterGroups</i> action returns a list of
     * cache parameter group descriptions. If a cache parameter group name is
     * specified, the list will contain only the descriptions for that group.
     * </p>
     *
     * @param describeCacheParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeCacheParameterGroups operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCacheParameterGroups service method, as returned by
     *         AmazonElastiCache.
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
    public Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            final DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest,
            final AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheParameterGroupsResult>() {
            public DescribeCacheParameterGroupsResult call() throws Exception {
              DescribeCacheParameterGroupsResult result;
                try {
                result = describeCacheParameterGroups(describeCacheParameterGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCacheParameterGroupsRequest, result);
                 return result;
        }
    });
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
     *           parameters to execute the RebootCacheCluster operation on
     *           AmazonElastiCache.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> rebootCacheClusterAsync(final RebootCacheClusterRequest rebootCacheClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
                return rebootCacheCluster(rebootCacheClusterRequest);
        }
    });
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
     *           parameters to execute the RebootCacheCluster operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCacheCluster service method, as returned by AmazonElastiCache.
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
    public Future<CacheCluster> rebootCacheClusterAsync(
            final RebootCacheClusterRequest rebootCacheClusterRequest,
            final AsyncHandler<RebootCacheClusterRequest, CacheCluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheCluster>() {
            public CacheCluster call() throws Exception {
              CacheCluster result;
                try {
                result = rebootCacheCluster(rebootCacheClusterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(rebootCacheClusterRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> action creates a new cache
     * parameter group. A cache parameter group is a collection of parameters
     * that you apply to all of the nodes in a cache cluster.
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElastiCache indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CacheParameterGroup> createCacheParameterGroupAsync(final CreateCacheParameterGroupRequest createCacheParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheParameterGroup>() {
            public CacheParameterGroup call() throws Exception {
                return createCacheParameterGroup(createCacheParameterGroupRequest);
        }
    });
    }

    /**
     * <p>
     * The <i>CreateCacheParameterGroup</i> action creates a new cache
     * parameter group. A cache parameter group is a collection of parameters
     * that you apply to all of the nodes in a cache cluster.
     * </p>
     *
     * @param createCacheParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateCacheParameterGroup operation on
     *           AmazonElastiCache.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCacheParameterGroup service method, as returned by
     *         AmazonElastiCache.
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
    public Future<CacheParameterGroup> createCacheParameterGroupAsync(
            final CreateCacheParameterGroupRequest createCacheParameterGroupRequest,
            final AsyncHandler<CreateCacheParameterGroupRequest, CacheParameterGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CacheParameterGroup>() {
            public CacheParameterGroup call() throws Exception {
              CacheParameterGroup result;
                try {
                result = createCacheParameterGroup(createCacheParameterGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createCacheParameterGroupRequest, result);
                 return result;
        }
    });
    }
    
}
        