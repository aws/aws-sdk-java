/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing;

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

import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Asynchronous client for accessing AmazonElasticLoadBalancing.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Elastic Load Balancing <p>
 * Elastic Load Balancing automatically distributes incoming web traffic
 * across multiple Amazon EC2 instances.
 * </p>
 * <p>
 * All Elastic Load Balancing actions and commands are <i>idempotent</i>
 * , which means that they complete no more than one time. If you repeat
 * a request or a command, the action succeeds with a 200 OK response
 * code.
 * </p>
 * <p>
 * For detailed information about the features of Elastic Load Balancing,
 * see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenarios.html"> Managing Load Balancers </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 */
public class AmazonElasticLoadBalancingAsyncClient extends AmazonElasticLoadBalancingClient
        implements AmazonElasticLoadBalancingAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing.  A credentials provider chain will be used
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
    public AmazonElasticLoadBalancingAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing.  A credentials provider chain will be used
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
     *                       client connects to AmazonElasticLoadBalancing
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticLoadBalancingAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials.
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials,
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials provider.
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials provider
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
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
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with CreateLoadBalancerPolicy to
     * create policy configurations for a load balancer.
     * </p>
     *
     * @param describeLoadBalancerPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerPolicyTypes
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(final DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPolicyTypesResult>() {
            public DescribeLoadBalancerPolicyTypesResult call() throws Exception {
                return describeLoadBalancerPolicyTypes(describeLoadBalancerPolicyTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with CreateLoadBalancerPolicy to
     * create policy configurations for a load balancer.
     * </p>
     *
     * @param describeLoadBalancerPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerPolicyTypes
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            final DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest,
            final AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPolicyTypesResult>() {
            public DescribeLoadBalancerPolicyTypesResult call() throws Exception {
              DescribeLoadBalancerPolicyTypesResult result;
                try {
                result = describeLoadBalancerPolicyTypes(describeLoadBalancerPolicyTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLoadBalancerPolicyTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#healthcheck"> Health Checks </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(final ConfigureHealthCheckRequest configureHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfigureHealthCheckResult>() {
            public ConfigureHealthCheckResult call() throws Exception {
                return configureHealthCheck(configureHealthCheckRequest);
        }
    });
    }

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#healthcheck"> Health Checks </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(
            final ConfigureHealthCheckRequest configureHealthCheckRequest,
            final AsyncHandler<ConfigureHealthCheckRequest, ConfigureHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfigureHealthCheckResult>() {
            public ConfigureHealthCheckResult call() throws Exception {
              ConfigureHealthCheckResult result;
                try {
                result = configureHealthCheck(configureHealthCheckRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(configureHealthCheckRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for
     * the load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the
     * remaining routable subnets.
     * </p>
     *
     * @param detachLoadBalancerFromSubnetsRequest Container for the
     *           necessary parameters to execute the DetachLoadBalancerFromSubnets
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(final DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancerFromSubnetsResult>() {
            public DetachLoadBalancerFromSubnetsResult call() throws Exception {
                return detachLoadBalancerFromSubnets(detachLoadBalancerFromSubnetsRequest);
        }
    });
    }

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for
     * the load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the
     * remaining routable subnets.
     * </p>
     *
     * @param detachLoadBalancerFromSubnetsRequest Container for the
     *           necessary parameters to execute the DetachLoadBalancerFromSubnets
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            final DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest,
            final AsyncHandler<DetachLoadBalancerFromSubnetsRequest, DetachLoadBalancerFromSubnetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancerFromSubnetsResult>() {
            public DetachLoadBalancerFromSubnetsResult call() throws Exception {
              DetachLoadBalancerFromSubnetsResult result;
                try {
                result = detachLoadBalancerFromSubnets(detachLoadBalancerFromSubnetsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(detachLoadBalancerFromSubnetsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the
     * same key is already associated with the load balancer,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb"> Tagging </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(final AddTagsRequest addTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsResult>() {
            public AddTagsResult call() throws Exception {
                return addTags(addTagsRequest);
        }
    });
    }

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the
     * same key is already associated with the load balancer,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb"> Tagging </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(
            final AddTagsRequest addTagsRequest,
            final AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsResult>() {
            public AddTagsResult call() throws Exception {
              AddTagsResult result;
                try {
                result = addTags(addTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(addTagsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code> , <code>ConnectionDraining</code> , and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling
     * them. Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection
     * timeout value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load
     * Balancing Developer Guide</i> :
     * </p>
     * 
     * <ul>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"> Cross-Zone Load Balancing </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"> Connection Draining </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"> Access Logs </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"> Idle Connection Timeout </a>
     * </li>
     * 
     * </ul>
     *
     * @param modifyLoadBalancerAttributesRequest Container for the necessary
     *           parameters to execute the ModifyLoadBalancerAttributes operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(final ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyLoadBalancerAttributesResult>() {
            public ModifyLoadBalancerAttributesResult call() throws Exception {
                return modifyLoadBalancerAttributes(modifyLoadBalancerAttributesRequest);
        }
    });
    }

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code> , <code>ConnectionDraining</code> , and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling
     * them. Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection
     * timeout value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load
     * Balancing Developer Guide</i> :
     * </p>
     * 
     * <ul>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"> Cross-Zone Load Balancing </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"> Connection Draining </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"> Access Logs </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"> Idle Connection Timeout </a>
     * </li>
     * 
     * </ul>
     *
     * @param modifyLoadBalancerAttributesRequest Container for the necessary
     *           parameters to execute the ModifyLoadBalancerAttributes operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            final ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            final AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyLoadBalancerAttributesResult>() {
            public ModifyLoadBalancerAttributesResult call() throws Exception {
              ModifyLoadBalancerAttributesResult result;
                try {
                result = modifyLoadBalancerAttributes(modifyLoadBalancerAttributesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyLoadBalancerAttributesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is
     * created; otherwise, the properties of the new listener must match the
     * properties of the existing listener.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"> Add a Listener to Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLoadBalancerListenersAsync(final CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createLoadBalancerListeners(createLoadBalancerListenersRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is
     * created; otherwise, the properties of the new listener must match the
     * properties of the existing listener.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"> Add a Listener to Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLoadBalancerListenersAsync(
            final CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest,
            final AsyncHandler<CreateLoadBalancerListenersRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createLoadBalancerListeners(createLoadBalancerListenersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLoadBalancerListenersRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     *
     * @param deleteLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerListenersAsync(final DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     *
     * @param deleteLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerListenersAsync(
            final DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest,
            final AsyncHandler<DeleteLoadBalancerListenersRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLoadBalancerListenersRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that
     * follow that of an application-generated cookie. This policy can be
     * associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * CreateLBCookieStickinessPolicy, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code> , follows
     * the lifetime of the application-generated cookie specified in the
     * policy configuration. The load balancer only inserts a new stickiness
     * cookie when the application response includes a new application
     * cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the
     * session stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_StickySessions.html#US_EnableStickySessionsAppCookies"> Application-Controlled Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(final CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppCookieStickinessPolicyResult>() {
            public CreateAppCookieStickinessPolicyResult call() throws Exception {
                return createAppCookieStickinessPolicy(createAppCookieStickinessPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that
     * follow that of an application-generated cookie. This policy can be
     * associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * CreateLBCookieStickinessPolicy, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code> , follows
     * the lifetime of the application-generated cookie specified in the
     * policy configuration. The load balancer only inserts a new stickiness
     * cookie when the application response includes a new application
     * cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the
     * session stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_StickySessions.html#US_EnableStickySessionsAppCookies"> Application-Controlled Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            final CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest,
            final AsyncHandler<CreateAppCookieStickinessPolicyRequest, CreateAppCookieStickinessPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppCookieStickinessPolicyResult>() {
            public CreateAppCookieStickinessPolicyResult call() throws Exception {
              CreateAppCookieStickinessPolicyResult result;
                try {
                result = createAppCookieStickinessPolicy(createAppCookieStickinessPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAppCookieStickinessPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override
     * the previously associated security groups.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/USVPC_ApplySG.html"> Manage Security Groups for Amazon VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param applySecurityGroupsToLoadBalancerRequest Container for the
     *           necessary parameters to execute the ApplySecurityGroupsToLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(final ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ApplySecurityGroupsToLoadBalancerResult>() {
            public ApplySecurityGroupsToLoadBalancerResult call() throws Exception {
                return applySecurityGroupsToLoadBalancer(applySecurityGroupsToLoadBalancerRequest);
        }
    });
    }

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override
     * the previously associated security groups.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/USVPC_ApplySG.html"> Manage Security Groups for Amazon VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param applySecurityGroupsToLoadBalancerRequest Container for the
     *           necessary parameters to execute the ApplySecurityGroupsToLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            final ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest,
            final AsyncHandler<ApplySecurityGroupsToLoadBalancerRequest, ApplySecurityGroupsToLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ApplySecurityGroupsToLoadBalancerResult>() {
            public ApplySecurityGroupsToLoadBalancerResult call() throws Exception {
              ApplySecurityGroupsToLoadBalancerResult result;
                try {
                result = applySecurityGroupsToLoadBalancer(applySecurityGroupsToLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(applySecurityGroupsToLoadBalancerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the
     * descriptions of all policies created for the load balancer. If you
     * specify a policy name associated with your load balancer, the action
     * returns the description of that policy. If you don't specify a load
     * balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the
     * sample policies have the <code>ELBSample-</code> prefix.
     * </p>
     *
     * @param describeLoadBalancerPoliciesRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancerPolicies operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(final DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPoliciesResult>() {
            public DescribeLoadBalancerPoliciesResult call() throws Exception {
                return describeLoadBalancerPolicies(describeLoadBalancerPoliciesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the
     * descriptions of all policies created for the load balancer. If you
     * specify a policy name associated with your load balancer, the action
     * returns the description of that policy. If you don't specify a load
     * balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the
     * sample policies have the <code>ELBSample-</code> prefix.
     * </p>
     *
     * @param describeLoadBalancerPoliciesRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancerPolicies operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            final DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest,
            final AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPoliciesResult>() {
            public DescribeLoadBalancerPoliciesResult call() throws Exception {
              DescribeLoadBalancerPoliciesResult result;
                try {
                result = describeLoadBalancerPolicies(describeLoadBalancerPoliciesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLoadBalancerPoliciesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(final SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerPoliciesOfListenerResult>() {
            public SetLoadBalancerPoliciesOfListenerResult call() throws Exception {
                return setLoadBalancerPoliciesOfListener(setLoadBalancerPoliciesOfListenerRequest);
        }
    });
    }

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            final SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest,
            final AsyncHandler<SetLoadBalancerPoliciesOfListenerRequest, SetLoadBalancerPoliciesOfListenerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerPoliciesOfListenerResult>() {
            public SetLoadBalancerPoliciesOfListenerResult call() throws Exception {
              SetLoadBalancerPoliciesOfListenerResult result;
                try {
                result = setLoadBalancerPoliciesOfListener(setLoadBalancerPoliciesOfListenerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setLoadBalancerPoliciesOfListenerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then,
     * the load balancer attempts to equally balance the traffic among its
     * remaining Availability Zones.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"> Disable an Availability Zone from a Load-Balanced Application </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(final DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableAvailabilityZonesForLoadBalancerResult>() {
            public DisableAvailabilityZonesForLoadBalancerResult call() throws Exception {
                return disableAvailabilityZonesForLoadBalancer(disableAvailabilityZonesForLoadBalancerRequest);
        }
    });
    }

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then,
     * the load balancer attempts to equally balance the traffic among its
     * remaining Availability Zones.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"> Disable an Availability Zone from a Load-Balanced Application </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            final DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest,
            final AsyncHandler<DisableAvailabilityZonesForLoadBalancerRequest, DisableAvailabilityZonesForLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableAvailabilityZonesForLoadBalancerResult>() {
            public DisableAvailabilityZonesForLoadBalancerResult call() throws Exception {
              DisableAvailabilityZonesForLoadBalancerResult result;
                try {
                result = disableAvailabilityZonesForLoadBalancer(disableAvailabilityZonesForLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableAvailabilityZonesForLoadBalancerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the state of the specified instances registered with the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances registered with the load
     * balancer, not including any terminated instances.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(final DescribeInstanceHealthRequest describeInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceHealthResult>() {
            public DescribeInstanceHealthResult call() throws Exception {
                return describeInstanceHealth(describeInstanceHealthRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the state of the specified instances registered with the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances registered with the load
     * balancer, not including any terminated instances.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(
            final DescribeInstanceHealthRequest describeInstanceHealthRequest,
            final AsyncHandler<DescribeInstanceHealthRequest, DescribeInstanceHealthResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceHealthResult>() {
            public DescribeInstanceHealthResult call() throws Exception {
              DescribeInstanceHealthResult result;
                try {
                result = describeInstanceHealth(describeInstanceHealthRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeInstanceHealthRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(final DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerPolicyResult>() {
            public DeleteLoadBalancerPolicyResult call() throws Exception {
                return deleteLoadBalancerPolicy(deleteLoadBalancerPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(
            final DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest,
            final AsyncHandler<DeleteLoadBalancerPolicyRequest, DeleteLoadBalancerPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerPolicyResult>() {
            public DeleteLoadBalancerPolicyResult call() throws Exception {
              DeleteLoadBalancerPolicyResult result;
                try {
                result = deleteLoadBalancerPolicy(deleteLoadBalancerPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLoadBalancerPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
                return describeTags(describeTagsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest,
            final AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
              DescribeTagsResult result;
                try {
                result = describeTags(describeTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeTagsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that
     * can be applied to the front-end listener or the back-end application
     * server, depending on the policy type.
     * </p>
     *
     * @param createLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(final CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerPolicyResult>() {
            public CreateLoadBalancerPolicyResult call() throws Exception {
                return createLoadBalancerPolicy(createLoadBalancerPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that
     * can be applied to the front-end listener or the back-end application
     * server, depending on the policy type.
     * </p>
     *
     * @param createLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(
            final CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest,
            final AsyncHandler<CreateLoadBalancerPolicyRequest, CreateLoadBalancerPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerPolicyResult>() {
            public CreateLoadBalancerPolicyResult call() throws Exception {
              CreateLoadBalancerPolicyResult result;
                try {
                result = createLoadBalancerPolicy(createLoadBalancerPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLoadBalancerPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsResult>() {
            public RemoveTagsResult call() throws Exception {
                return removeTags(removeTagsRequest);
        }
    });
    }

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(
            final RemoveTagsRequest removeTagsRequest,
            final AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsResult>() {
            public RemoveTagsResult call() throws Exception {
              RemoveTagsResult result;
                try {
                result = removeTags(removeTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(removeTagsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its
     * registered Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"> Add Availability Zone </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(final EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableAvailabilityZonesForLoadBalancerResult>() {
            public EnableAvailabilityZonesForLoadBalancerResult call() throws Exception {
                return enableAvailabilityZonesForLoadBalancer(enableAvailabilityZonesForLoadBalancerRequest);
        }
    });
    }

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its
     * registered Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"> Add Availability Zone </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            final EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest,
            final AsyncHandler<EnableAvailabilityZonesForLoadBalancerRequest, EnableAvailabilityZonesForLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableAvailabilityZonesForLoadBalancerResult>() {
            public EnableAvailabilityZonesForLoadBalancerResult call() throws Exception {
              EnableAvailabilityZonesForLoadBalancerResult result;
                try {
                result = enableAvailabilityZonesForLoadBalancer(enableAvailabilityZonesForLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableAvailabilityZonesForLoadBalancerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must
     * reconfigure all settings. The DNS name associated with a deleted load
     * balancer are no longer usable. The name and associated DNS record of
     * the deleted load balancer no longer exist and traffic sent to any of
     * its IP addresses is no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the
     * call to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerAsync(final DeleteLoadBalancerRequest deleteLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLoadBalancer(deleteLoadBalancerRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must
     * reconfigure all settings. The DNS name associated with a deleted load
     * balancer are no longer usable. The name and associated DNS record of
     * the deleted load balancer no longer exist and traffic sent to any of
     * its IP addresses is no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the
     * call to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerAsync(
            final DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            final AsyncHandler<DeleteLoadBalancerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteLoadBalancer(deleteLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLoadBalancerRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created
     * with a unique Domain Name Service (DNS) name. The DNS name includes
     * the name of the AWS region in which the load balancer was created. For
     * example, the DNS name might end with either of the following:
     * </p>
     * 
     * <ul>
     * <li> <code>us-east-1.elb.amazonaws.com</code> </li>
     * <li> <code>us-west-2.elb.amazonaws.com</code> </li>
     * 
     * </ul>
     * <p>
     * For information about the AWS regions supported by Elastic Load
     * Balancing, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region"> Regions and Endpoints </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You
     * can request an increase for the number of load balancers for your
     * account. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"> Elastic Load Balancing Limits </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * Elastic Load Balancing supports load balancing your EC2 instances
     * launched in either the EC2-Classic or EC2-VPC platform. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForEC2.html"> Elastic Load Balancing in EC2-Classic </a> or <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Elastic Load Balancing in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(final CreateLoadBalancerRequest createLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerResult>() {
            public CreateLoadBalancerResult call() throws Exception {
                return createLoadBalancer(createLoadBalancerRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created
     * with a unique Domain Name Service (DNS) name. The DNS name includes
     * the name of the AWS region in which the load balancer was created. For
     * example, the DNS name might end with either of the following:
     * </p>
     * 
     * <ul>
     * <li> <code>us-east-1.elb.amazonaws.com</code> </li>
     * <li> <code>us-west-2.elb.amazonaws.com</code> </li>
     * 
     * </ul>
     * <p>
     * For information about the AWS regions supported by Elastic Load
     * Balancing, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region"> Regions and Endpoints </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You
     * can request an increase for the number of load balancers for your
     * account. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"> Elastic Load Balancing Limits </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * Elastic Load Balancing supports load balancing your EC2 instances
     * launched in either the EC2-Classic or EC2-VPC platform. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForEC2.html"> Elastic Load Balancing in EC2-Classic </a> or <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Elastic Load Balancing in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(
            final CreateLoadBalancerRequest createLoadBalancerRequest,
            final AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerResult>() {
            public CreateLoadBalancerResult call() throws Exception {
              CreateLoadBalancerResult result;
                try {
                result = createLoadBalancer(createLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLoadBalancerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Replaces the set of policies associated with the specified port on
     * which the back-end server is listening with a new set of policies. At
     * this time, only the back-end server authentication policy type can be
     * applied to the back-end ports; this policy type is composed of
     * multiple public key policies.
     * </p>
     * <p>
     * Each time you use
     * <code>SetLoadBalancerPoliciesForBackendServer</code> to enable the
     * policies, use the <code>PolicyNames</code> parameter to list the
     * policies that you want to enable.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to
     * verify that the policy is associated with the back-end server.
     * </p>
     *
     * @param setLoadBalancerPoliciesForBackendServerRequest Container for
     *           the necessary parameters to execute the
     *           SetLoadBalancerPoliciesForBackendServer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(final SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerPoliciesForBackendServerResult>() {
            public SetLoadBalancerPoliciesForBackendServerResult call() throws Exception {
                return setLoadBalancerPoliciesForBackendServer(setLoadBalancerPoliciesForBackendServerRequest);
        }
    });
    }

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on
     * which the back-end server is listening with a new set of policies. At
     * this time, only the back-end server authentication policy type can be
     * applied to the back-end ports; this policy type is composed of
     * multiple public key policies.
     * </p>
     * <p>
     * Each time you use
     * <code>SetLoadBalancerPoliciesForBackendServer</code> to enable the
     * policies, use the <code>PolicyNames</code> parameter to list the
     * policies that you want to enable.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to
     * verify that the policy is associated with the back-end server.
     * </p>
     *
     * @param setLoadBalancerPoliciesForBackendServerRequest Container for
     *           the necessary parameters to execute the
     *           SetLoadBalancerPoliciesForBackendServer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            final SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest,
            final AsyncHandler<SetLoadBalancerPoliciesForBackendServerRequest, SetLoadBalancerPoliciesForBackendServerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerPoliciesForBackendServerResult>() {
            public SetLoadBalancerPoliciesForBackendServerResult call() throws Exception {
              SetLoadBalancerPoliciesForBackendServerResult result;
                try {
                result = setLoadBalancerPoliciesForBackendServer(setLoadBalancerPoliciesForBackendServerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setLoadBalancerPoliciesForBackendServerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register Amazon EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(final DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterInstancesFromLoadBalancerResult>() {
            public DeregisterInstancesFromLoadBalancerResult call() throws Exception {
                return deregisterInstancesFromLoadBalancer(deregisterInstancesFromLoadBalancerRequest);
        }
    });
    }

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register Amazon EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            final DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest,
            final AsyncHandler<DeregisterInstancesFromLoadBalancerRequest, DeregisterInstancesFromLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterInstancesFromLoadBalancerResult>() {
            public DeregisterInstancesFromLoadBalancerResult call() throws Exception {
              DeregisterInstancesFromLoadBalancerResult result;
                try {
                result = deregisterInstancesFromLoadBalancer(deregisterInstancesFromLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deregisterInstancesFromLoadBalancerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"> Updating an SSL Certificate for a Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param setLoadBalancerListenerSSLCertificateRequest Container for the
     *           necessary parameters to execute the
     *           SetLoadBalancerListenerSSLCertificate operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBalancerListenerSSLCertificateAsync(final SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setLoadBalancerListenerSSLCertificate(setLoadBalancerListenerSSLCertificateRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"> Updating an SSL Certificate for a Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param setLoadBalancerListenerSSLCertificateRequest Container for the
     *           necessary parameters to execute the
     *           SetLoadBalancerListenerSSLCertificate operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBalancerListenerSSLCertificateAsync(
            final SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest,
            final AsyncHandler<SetLoadBalancerListenerSSLCertificateRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setLoadBalancerListenerSSLCertificate(setLoadBalancerListenerSSLCertificateRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setLoadBalancerListenerSSLCertificateRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     *
     * @param describeLoadBalancerAttributesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerAttributes
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(final DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerAttributesResult>() {
            public DescribeLoadBalancerAttributesResult call() throws Exception {
                return describeLoadBalancerAttributes(describeLoadBalancerAttributesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     *
     * @param describeLoadBalancerAttributesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerAttributes
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            final DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            final AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerAttributesResult>() {
            public DescribeLoadBalancerAttributesResult call() throws Exception {
              DescribeLoadBalancerAttributesResult result;
                try {
                result = describeLoadBalancerAttributes(describeLoadBalancerAttributesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLoadBalancerAttributesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes
     * controlled by the lifetime of the browser (user-agent) or a specified
     * expiration period. This policy can be associated only with HTTP/HTTPS
     * listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if
     * this cookie is present in the request. If so, the load balancer sends
     * the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based
     * on the existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent
     * requests from the same user to that server. The validity of the cookie
     * is based on the cookie expiration time, which is specified in the
     * policy configuration.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_StickySessions.html#US_EnableStickySessionsLBCookies"> Duration-Based Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(final CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLBCookieStickinessPolicyResult>() {
            public CreateLBCookieStickinessPolicyResult call() throws Exception {
                return createLBCookieStickinessPolicy(createLBCookieStickinessPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes
     * controlled by the lifetime of the browser (user-agent) or a specified
     * expiration period. This policy can be associated only with HTTP/HTTPS
     * listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if
     * this cookie is present in the request. If so, the load balancer sends
     * the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based
     * on the existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent
     * requests from the same user to that server. The validity of the cookie
     * is based on the cookie expiration time, which is specified in the
     * policy configuration.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_StickySessions.html#US_EnableStickySessionsLBCookies"> Duration-Based Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            final CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest,
            final AsyncHandler<CreateLBCookieStickinessPolicyRequest, CreateLBCookieStickinessPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLBCookieStickinessPolicyResult>() {
            public CreateLBCookieStickinessPolicyResult call() throws Exception {
              CreateLBCookieStickinessPolicyResult result;
                try {
                result = createLBCookieStickinessPolicy(createLBCookieStickinessPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLBCookieStickinessPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Elastic Load Balancing in Amazon VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param attachLoadBalancerToSubnetsRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancerToSubnets operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(final AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancerToSubnetsResult>() {
            public AttachLoadBalancerToSubnetsResult call() throws Exception {
                return attachLoadBalancerToSubnets(attachLoadBalancerToSubnetsRequest);
        }
    });
    }

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Elastic Load Balancing in Amazon VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param attachLoadBalancerToSubnetsRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancerToSubnets operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            final AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest,
            final AsyncHandler<AttachLoadBalancerToSubnetsRequest, AttachLoadBalancerToSubnetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancerToSubnetsResult>() {
            public AttachLoadBalancerToSubnetsResult call() throws Exception {
              AttachLoadBalancerToSubnetsResult result;
                try {
                result = attachLoadBalancerToSubnets(attachLoadBalancerToSubnetsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(attachLoadBalancerToSubnetsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the
     * load balancer (EC2-Classic or the same VPC). If you have EC2-Classic
     * instances and a load balancer in a VPC with ClassicLink enabled, you
     * can link the EC2-Classic instances to that VPC and then register the
     * linked EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes
     * when the request has been registered. Instance registration happens
     * shortly afterwards. To check the state of the registered instances,
     * use DescribeLoadBalancers or DescribeInstanceHealth.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of
     * the Availability Zones registered for the load balancer is moved to
     * the <code>OutOfService</code> state. If an Availability Zone is added
     * to the load balancer later, any instances registered with the load
     * balancer move to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then
     * start it, the IP addresses associated with the instance changes.
     * Elastic Load Balancing cannot recognize the new IP address, which
     * prevents it from routing traffic to the instances. We recommend that
     * you use the following sequence: stop the instance, deregister the
     * instance, start the instance, and then register the instance. To
     * deregister instances from a load balancer, use
     * DeregisterInstancesFromLoadBalancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(final RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterInstancesWithLoadBalancerResult>() {
            public RegisterInstancesWithLoadBalancerResult call() throws Exception {
                return registerInstancesWithLoadBalancer(registerInstancesWithLoadBalancerRequest);
        }
    });
    }

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the
     * load balancer (EC2-Classic or the same VPC). If you have EC2-Classic
     * instances and a load balancer in a VPC with ClassicLink enabled, you
     * can link the EC2-Classic instances to that VPC and then register the
     * linked EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes
     * when the request has been registered. Instance registration happens
     * shortly afterwards. To check the state of the registered instances,
     * use DescribeLoadBalancers or DescribeInstanceHealth.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of
     * the Availability Zones registered for the load balancer is moved to
     * the <code>OutOfService</code> state. If an Availability Zone is added
     * to the load balancer later, any instances registered with the load
     * balancer move to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then
     * start it, the IP addresses associated with the instance changes.
     * Elastic Load Balancing cannot recognize the new IP address, which
     * prevents it from routing traffic to the instances. We recommend that
     * you use the following sequence: stop the instance, deregister the
     * instance, start the instance, and then register the instance. To
     * deregister instances from a load balancer, use
     * DeregisterInstancesFromLoadBalancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            final RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest,
            final AsyncHandler<RegisterInstancesWithLoadBalancerRequest, RegisterInstancesWithLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterInstancesWithLoadBalancerResult>() {
            public RegisterInstancesWithLoadBalancerResult call() throws Exception {
              RegisterInstancesWithLoadBalancerResult result;
                try {
                result = registerInstancesWithLoadBalancer(registerInstancesWithLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerInstancesWithLoadBalancerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(final DescribeLoadBalancersRequest describeLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancersResult>() {
            public DescribeLoadBalancersResult call() throws Exception {
                return describeLoadBalancers(describeLoadBalancersRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            final DescribeLoadBalancersRequest describeLoadBalancersRequest,
            final AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancersResult>() {
            public DescribeLoadBalancersResult call() throws Exception {
              DescribeLoadBalancersResult result;
                try {
                result = describeLoadBalancers(describeLoadBalancersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLoadBalancersRequest, result);
                 return result;
        }
    });
    }
    
}
        