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
public class AmazonElastiCacheAsyncClient extends AmazonElastiCacheClient
        implements AmazonElastiCacheAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


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
     * @see DefaultAWSCredentialsProvider
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
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonElastiCacheAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElastiCache using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be
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
        this(awsCredentials, Executors.newCachedThreadPool());
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
     * Default client settings will be used, and a default cached thread pool will be
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
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
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
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
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
     * Modifies the parameters of a CacheParameterGroup. To modify more than
     * one parameter, submit a list of ParameterName and ParameterValue
     * parameters. A maximum of 20 parameters can be modified in a single
     * request.
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
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
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
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
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
     * Lists available reserved Cache Node offerings.
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
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
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
     * Creates a new Cache Cluster.
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
     * Revokes ingress from a CacheSecurityGroup for previously authorized
     * EC2 Security Groups.
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
     * Creates a new Cache Parameter Group. Cache Parameter groups control
     * the parameters for a Cache Cluster.
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
     * Returns events related to Cache Clusters, Cache Security Groups, and
     * Cache Parameter Groups for the past 14 days. Events specific to a
     * particular Cache Cluster, Cache Security Group, or Cache Parameter
     * Group can be obtained by providing the name as a parameter. By
     * default, the past hour of events are returned.
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
     * Returns information about reserved Cache Nodes for this account, or
     * about a specified reserved Cache Node.
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
     * Returns a list of CacheParameterGroup descriptions. If a
     * CacheParameterGroupName is specified, the list will contain only the
     * descriptions of the specified CacheParameterGroup.
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
     * Deletes the specified CacheParameterGroup. The CacheParameterGroup
     * cannot be deleted if it is associated with any cache clusters.
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
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
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
     * Purchases a reserved Cache Node offering.
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
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
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
     * Modifies the Cache Cluster settings. You can change one or more Cache
     * Cluster configuration parameters by specifying the parameters and the
     * new values in the request.
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
     * Returns a list of CacheSecurityGroup descriptions. If a
     * CacheSecurityGroupName is specified, the list will contain only the
     * description of the specified CacheSecurityGroup.
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
     * Creates a new Cache Security Group. Cache Security groups control
     * access to one or more Cache Clusters.
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
     * Returns the detailed parameter list for a particular
     * CacheParameterGroup.
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
     * Returns the default engine and system parameter information for the
     * specified cache engine.
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
     * Modifies the parameters of a CacheParameterGroup to the engine or
     * system default value. To reset specific parameters submit a list of
     * the parameter names. To reset the entire CacheParameterGroup, specify
     * the CacheParameterGroup name and ResetAllParameters parameters.
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
    
}
        