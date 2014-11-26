/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling;

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

import com.amazonaws.services.autoscaling.model.*;

/**
 * Asynchronous client for accessing AmazonAutoScaling.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Auto Scaling <p>
 * Auto Scaling is designed to automatically launch or terminate EC2
 * instances based on user-defined policies, schedules, and health
 * checks. Use this service in conjunction with the Amazon CloudWatch and
 * Elastic Load Balancing services.
 * </p>
 */
public class AmazonAutoScalingAsyncClient extends AmazonAutoScalingClient
        implements AmazonAutoScalingAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling.  A credentials provider chain will be used
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
    public AmazonAutoScalingAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling.  A credentials provider chain will be used
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
     *                       client connects to AmazonAutoScaling
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonAutoScalingAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials.
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
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials
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
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials,
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
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials provider.
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
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials provider
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
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials
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
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials
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
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Describes the current Auto Scaling resource limits for your AWS
     * account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
     * .
     * </p>
     *
     * @param describeAccountLimitsRequest Container for the necessary
     *           parameters to execute the DescribeAccountLimits operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAccountLimits service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(final DescribeAccountLimitsRequest describeAccountLimitsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAccountLimitsResult>() {
            public DescribeAccountLimitsResult call() throws Exception {
                return describeAccountLimits(describeAccountLimitsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the current Auto Scaling resource limits for your AWS
     * account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
     * .
     * </p>
     *
     * @param describeAccountLimitsRequest Container for the necessary
     *           parameters to execute the DescribeAccountLimits operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAccountLimits service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            final DescribeAccountLimitsRequest describeAccountLimitsRequest,
            final AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAccountLimitsResult>() {
            public DescribeAccountLimitsResult call() throws Exception {
              DescribeAccountLimitsResult result;
                try {
                result = describeAccountLimits(describeAccountLimitsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAccountLimitsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeAutoScalingGroupsRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingGroups operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingGroups service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(final DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingGroupsResult>() {
            public DescribeAutoScalingGroupsResult call() throws Exception {
                return describeAutoScalingGroups(describeAutoScalingGroupsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeAutoScalingGroupsRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingGroups operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingGroups service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            final DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest,
            final AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingGroupsResult>() {
            public DescribeAutoScalingGroupsResult call() throws Exception {
              DescribeAutoScalingGroupsResult result;
                try {
                result = describeAutoScalingGroups(describeAutoScalingGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAutoScalingGroupsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Enables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * You can only enable metrics collection if
     * <code>InstanceMonitoring</code> in the launch configuration for the
     * group is set to <code>True</code> .
     * </p>
     *
     * @param enableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the EnableMetricsCollection operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         EnableMetricsCollection service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableMetricsCollectionAsync(final EnableMetricsCollectionRequest enableMetricsCollectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableMetricsCollection(enableMetricsCollectionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Enables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * You can only enable metrics collection if
     * <code>InstanceMonitoring</code> in the launch configuration for the
     * group is set to <code>True</code> .
     * </p>
     *
     * @param enableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the EnableMetricsCollection operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableMetricsCollection service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableMetricsCollectionAsync(
            final EnableMetricsCollectionRequest enableMetricsCollectionRequest,
            final AsyncHandler<EnableMetricsCollectionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                enableMetricsCollection(enableMetricsCollectionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableMetricsCollectionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes for the
     * specified Auto Scaling group. To resume specific processes, use the
     * <code>ScalingProcesses</code> parameter. To resume all processes, omit
     * the <code>ScalingProcesses</code> parameter. For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param resumeProcessesRequest Container for the necessary parameters
     *           to execute the ResumeProcesses operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         ResumeProcesses service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resumeProcessesAsync(final ResumeProcessesRequest resumeProcessesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                resumeProcesses(resumeProcessesRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes for the
     * specified Auto Scaling group. To resume specific processes, use the
     * <code>ScalingProcesses</code> parameter. To resume all processes, omit
     * the <code>ScalingProcesses</code> parameter. For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param resumeProcessesRequest Container for the necessary parameters
     *           to execute the ResumeProcesses operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResumeProcesses service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resumeProcessesAsync(
            final ResumeProcessesRequest resumeProcessesRequest,
            final AsyncHandler<ResumeProcessesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                resumeProcesses(resumeProcessesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(resumeProcessesRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     *
     * @param describeLifecycleHooksRequest Container for the necessary
     *           parameters to execute the DescribeLifecycleHooks operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLifecycleHooks service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(final DescribeLifecycleHooksRequest describeLifecycleHooksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHooksResult>() {
            public DescribeLifecycleHooksResult call() throws Exception {
                return describeLifecycleHooks(describeLifecycleHooksRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     *
     * @param describeLifecycleHooksRequest Container for the necessary
     *           parameters to execute the DescribeLifecycleHooks operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLifecycleHooks service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            final DescribeLifecycleHooksRequest describeLifecycleHooksRequest,
            final AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHooksResult>() {
            public DescribeLifecycleHooksResult call() throws Exception {
              DescribeLifecycleHooksResult result;
                try {
                result = describeLifecycleHooks(describeLifecycleHooksRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLifecycleHooksRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describePoliciesRequest Container for the necessary parameters
     *           to execute the DescribePolicies operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePolicies service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePoliciesResult> describePoliciesAsync(final DescribePoliciesRequest describePoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePoliciesResult>() {
            public DescribePoliciesResult call() throws Exception {
                return describePolicies(describePoliciesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describePoliciesRequest Container for the necessary parameters
     *           to execute the DescribePolicies operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePolicies service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePoliciesResult> describePoliciesAsync(
            final DescribePoliciesRequest describePoliciesRequest,
            final AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePoliciesResult>() {
            public DescribePoliciesResult call() throws Exception {
              DescribePoliciesResult result;
                try {
                result = describePolicies(describePoliciesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describePoliciesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns scaling process types for use in the ResumeProcesses and
     * SuspendProcesses actions.
     * </p>
     *
     * @param describeScalingProcessTypesRequest Container for the necessary
     *           parameters to execute the DescribeScalingProcessTypes operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingProcessTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(final DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingProcessTypesResult>() {
            public DescribeScalingProcessTypesResult call() throws Exception {
                return describeScalingProcessTypes(describeScalingProcessTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns scaling process types for use in the ResumeProcesses and
     * SuspendProcesses actions.
     * </p>
     *
     * @param describeScalingProcessTypesRequest Container for the necessary
     *           parameters to execute the DescribeScalingProcessTypes operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingProcessTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            final DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest,
            final AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingProcessTypesResult>() {
            public DescribeScalingProcessTypesResult call() throws Exception {
              DescribeScalingProcessTypesResult result;
                try {
                result = describeScalingProcessTypes(describeScalingProcessTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeScalingProcessTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling
     * group. When this call completes, the launch configuration is no longer
     * available for use.
     * </p>
     *
     * @param deleteLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLaunchConfigurationAsync(final DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLaunchConfiguration(deleteLaunchConfigurationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling
     * group. When this call completes, the launch configuration is no longer
     * available for use.
     * </p>
     *
     * @param deleteLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLaunchConfigurationAsync(
            final DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest,
            final AsyncHandler<DeleteLaunchConfigurationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteLaunchConfiguration(deleteLaunchConfigurationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLaunchConfigurationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by
     * default is 20 per region, the call fails. For information about
     * viewing and updating these limits, see DescribeAccountLimits.
     * </p>
     *
     * @param createAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the CreateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAutoScalingGroupAsync(final CreateAutoScalingGroupRequest createAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createAutoScalingGroup(createAutoScalingGroupRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by
     * default is 20 per region, the call fails. For information about
     * viewing and updating these limits, see DescribeAccountLimits.
     * </p>
     *
     * @param createAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the CreateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAutoScalingGroupAsync(
            final CreateAutoScalingGroupRequest createAutoScalingGroupRequest,
            final AsyncHandler<CreateAutoScalingGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createAutoScalingGroup(createAutoScalingGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAutoScalingGroupRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html"> Attach Amazon EC2 Instances to Your Existing Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param attachInstancesRequest Container for the necessary parameters
     *           to execute the AttachInstances operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         AttachInstances service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachInstancesAsync(final AttachInstancesRequest attachInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                attachInstances(attachInstancesRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html"> Attach Amazon EC2 Instances to Your Existing Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param attachInstancesRequest Container for the necessary parameters
     *           to execute the AttachInstances operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachInstances service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachInstancesAsync(
            final AttachInstancesRequest attachInstancesRequest,
            final AsyncHandler<AttachInstancesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                attachInstances(attachInstancesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(attachInstancesRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto
     * Scaling group. If you omit the <code>ActivityIds</code> , the call
     * returns all activities from the past six weeks. Activities are sorted
     * by the start time. Activities still in progress appear first on the
     * list.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeScalingActivitiesRequest Container for the necessary
     *           parameters to execute the DescribeScalingActivities operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingActivities service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(final DescribeScalingActivitiesRequest describeScalingActivitiesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingActivitiesResult>() {
            public DescribeScalingActivitiesResult call() throws Exception {
                return describeScalingActivities(describeScalingActivitiesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto
     * Scaling group. If you omit the <code>ActivityIds</code> , the call
     * returns all activities from the past six weeks. Activities are sorted
     * by the start time. Activities still in progress appear first on the
     * list.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeScalingActivitiesRequest Container for the necessary
     *           parameters to execute the DescribeScalingActivities operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingActivities service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            final DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            final AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingActivitiesResult>() {
            public DescribeScalingActivitiesResult call() throws Exception {
              DescribeScalingActivitiesResult result;
                try {
                result = describeScalingActivities(describeScalingActivitiesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeScalingActivitiesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     *
     * @param describeNotificationConfigurationsRequest Container for the
     *           necessary parameters to execute the DescribeNotificationConfigurations
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNotificationConfigurations service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(final DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeNotificationConfigurationsResult>() {
            public DescribeNotificationConfigurationsResult call() throws Exception {
                return describeNotificationConfigurations(describeNotificationConfigurationsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     *
     * @param describeNotificationConfigurationsRequest Container for the
     *           necessary parameters to execute the DescribeNotificationConfigurations
     *           operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNotificationConfigurations service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            final DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest,
            final AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeNotificationConfigurationsResult>() {
            public DescribeNotificationConfigurationsResult call() throws Exception {
              DescribeNotificationConfigurationsResult result;
                try {
                result = describeNotificationConfigurations(describeNotificationConfigurationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeNotificationConfigurationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed
     * first ( <code>ABANDON</code> for launching instances,
     * <code>CONTINUE</code> for terminating instances).
     * </p>
     *
     * @param deleteLifecycleHookRequest Container for the necessary
     *           parameters to execute the DeleteLifecycleHook operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLifecycleHook service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(final DeleteLifecycleHookRequest deleteLifecycleHookRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLifecycleHookResult>() {
            public DeleteLifecycleHookResult call() throws Exception {
                return deleteLifecycleHook(deleteLifecycleHookRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed
     * first ( <code>ABANDON</code> for launching instances,
     * <code>CONTINUE</code> for terminating instances).
     * </p>
     *
     * @param deleteLifecycleHookRequest Container for the necessary
     *           parameters to execute the DeleteLifecycleHook operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLifecycleHook service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            final DeleteLifecycleHookRequest deleteLifecycleHookRequest,
            final AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLifecycleHookResult>() {
            public DeleteLifecycleHookResult call() throws Exception {
              DeleteLifecycleHookResult result;
                try {
                result = deleteLifecycleHook(deleteLifecycleHookRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLifecycleHookRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling
     * Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an
     * action on an instance that is not actively in service; for example,
     * either when the instance launches or before the instance terminates.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li> <b>Create the lifecycle hook. You can create a hook that acts
     * when instances launch or when instances terminate.</b> </li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li>Complete the lifecycle action.</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param putLifecycleHookRequest Container for the necessary parameters
     *           to execute the PutLifecycleHook operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutLifecycleHook service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutLifecycleHookResult> putLifecycleHookAsync(final PutLifecycleHookRequest putLifecycleHookRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutLifecycleHookResult>() {
            public PutLifecycleHookResult call() throws Exception {
                return putLifecycleHook(putLifecycleHookRequest);
        }
    });
    }

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling
     * Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an
     * action on an instance that is not actively in service; for example,
     * either when the instance launches or before the instance terminates.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li> <b>Create the lifecycle hook. You can create a hook that acts
     * when instances launch or when instances terminate.</b> </li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li>Complete the lifecycle action.</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param putLifecycleHookRequest Container for the necessary parameters
     *           to execute the PutLifecycleHook operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutLifecycleHook service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutLifecycleHookResult> putLifecycleHookAsync(
            final PutLifecycleHookRequest putLifecycleHookRequest,
            final AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutLifecycleHookResult>() {
            public PutLifecycleHookResult call() throws Exception {
              PutLifecycleHookResult result;
                try {
                result = putLifecycleHook(putLifecycleHookRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putLifecycleHookRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the termination policies supported by Auto Scaling.
     * </p>
     *
     * @param describeTerminationPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeTerminationPolicyTypes
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTerminationPolicyTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(final DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTerminationPolicyTypesResult>() {
            public DescribeTerminationPolicyTypesResult call() throws Exception {
                return describeTerminationPolicyTypes(describeTerminationPolicyTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the termination policies supported by Auto Scaling.
     * </p>
     *
     * @param describeTerminationPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeTerminationPolicyTypes
     *           operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTerminationPolicyTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            final DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest,
            final AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTerminationPolicyTypesResult>() {
            public DescribeTerminationPolicyTypesResult call() throws Exception {
              DescribeTerminationPolicyTypesResult result;
                try {
                result = describeTerminationPolicyTypes(describeTerminationPolicyTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeTerminationPolicyTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query
     * for the tags for a specific Auto Scaling group. You can specify
     * multiple values for a filter. A tag must match at least one of the
     * specified values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes
     * information for a particular tag only if it matches all the filters.
     * If there's no match, no special message is returned.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
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
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query
     * for the tags for a specific Auto Scaling group. You can specify
     * multiple values for a filter. A tag must match at least one of the
     * specified values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes
     * information for a particular tag only if it matches all the filters.
     * If there's no match, no special message is returned.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
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
     * Deletes the specified tags.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTags service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTagsAsync(final DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTags(deleteTagsRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTags service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTagsAsync(
            final DeleteTagsRequest deleteTagsRequest,
            final AsyncHandler<DeleteTagsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteTags(deleteTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteTagsRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Executes the specified policy.
     * </p>
     *
     * @param executePolicyRequest Container for the necessary parameters to
     *           execute the ExecutePolicy operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         ExecutePolicy service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> executePolicyAsync(final ExecutePolicyRequest executePolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                executePolicy(executePolicyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     *
     * @param executePolicyRequest Container for the necessary parameters to
     *           execute the ExecutePolicy operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ExecutePolicy service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> executePolicyAsync(
            final ExecutePolicyRequest executePolicyRequest,
            final AsyncHandler<ExecutePolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                executePolicy(executePolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(executePolicyRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameters
     * you want to change. Any existing parameter not changed in an update to
     * an existing policy is not changed in this update request.
     * </p>
     *
     * @param putScalingPolicyRequest Container for the necessary parameters
     *           to execute the PutScalingPolicy operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutScalingPolicy service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutScalingPolicyResult> putScalingPolicyAsync(final PutScalingPolicyRequest putScalingPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutScalingPolicyResult>() {
            public PutScalingPolicyResult call() throws Exception {
                return putScalingPolicy(putScalingPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameters
     * you want to change. Any existing parameter not changed in an update to
     * an existing policy is not changed in this update request.
     * </p>
     *
     * @param putScalingPolicyRequest Container for the necessary parameters
     *           to execute the PutScalingPolicy operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutScalingPolicy service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutScalingPolicyResult> putScalingPolicyAsync(
            final PutScalingPolicyRequest putScalingPolicyRequest,
            final AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutScalingPolicyResult>() {
            public PutScalingPolicyResult call() throws Exception {
              PutScalingPolicyResult result;
                try {
                result = putScalingPolicy(putScalingPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putScalingPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to this topic can have messages for
     * events delivered to an endpoint such as a web server or email address.
     * </p>
     * <p>
     * For more information see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html"> Getting Notifications When Your Auto Scaling Group Changes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * <p>
     * This configuration overwrites an existing configuration.
     * </p>
     *
     * @param putNotificationConfigurationRequest Container for the necessary
     *           parameters to execute the PutNotificationConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutNotificationConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putNotificationConfigurationAsync(final PutNotificationConfigurationRequest putNotificationConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putNotificationConfiguration(putNotificationConfigurationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to this topic can have messages for
     * events delivered to an endpoint such as a web server or email address.
     * </p>
     * <p>
     * For more information see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html"> Getting Notifications When Your Auto Scaling Group Changes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * <p>
     * This configuration overwrites an existing configuration.
     * </p>
     *
     * @param putNotificationConfigurationRequest Container for the necessary
     *           parameters to execute the PutNotificationConfiguration operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutNotificationConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putNotificationConfigurationAsync(
            final PutNotificationConfigurationRequest putNotificationConfigurationRequest,
            final AsyncHandler<PutNotificationConfigurationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putNotificationConfiguration(putNotificationConfigurationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putNotificationConfigurationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"> Auto Scaling InService State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param exitStandbyRequest Container for the necessary parameters to
     *           execute the ExitStandby operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         ExitStandby service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ExitStandbyResult> exitStandbyAsync(final ExitStandbyRequest exitStandbyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ExitStandbyResult>() {
            public ExitStandbyResult call() throws Exception {
                return exitStandby(exitStandbyRequest);
        }
    });
    }

    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"> Auto Scaling InService State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param exitStandbyRequest Container for the necessary parameters to
     *           execute the ExitStandby operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ExitStandby service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ExitStandbyResult> exitStandbyAsync(
            final ExitStandbyRequest exitStandbyRequest,
            final AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ExitStandbyResult>() {
            public ExitStandbyResult call() throws Exception {
              ExitStandbyResult result;
                try {
                result = exitStandby(exitStandbyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(exitStandbyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePolicy service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePolicyAsync(final DeletePolicyRequest deletePolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePolicy(deletePolicyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePolicy service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePolicyAsync(
            final DeletePolicyRequest deletePolicyRequest,
            final AsyncHandler<DeletePolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deletePolicy(deletePolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deletePolicyRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Completes the lifecycle action for the associated token initiated
     * under the given lifecycle hook with the specified result.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li> <b>Complete the lifecycle action</b> .</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param completeLifecycleActionRequest Container for the necessary
     *           parameters to execute the CompleteLifecycleAction operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CompleteLifecycleAction service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(final CompleteLifecycleActionRequest completeLifecycleActionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CompleteLifecycleActionResult>() {
            public CompleteLifecycleActionResult call() throws Exception {
                return completeLifecycleAction(completeLifecycleActionRequest);
        }
    });
    }

    /**
     * <p>
     * Completes the lifecycle action for the associated token initiated
     * under the given lifecycle hook with the specified result.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li> <b>Complete the lifecycle action</b> .</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param completeLifecycleActionRequest Container for the necessary
     *           parameters to execute the CompleteLifecycleAction operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CompleteLifecycleAction service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            final CompleteLifecycleActionRequest completeLifecycleActionRequest,
            final AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CompleteLifecycleActionResult>() {
            public CompleteLifecycleActionResult call() throws Exception {
              CompleteLifecycleActionResult result;
                try {
                result = completeLifecycleAction(completeLifecycleActionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(completeLifecycleActionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     *
     * @param deleteNotificationConfigurationRequest Container for the
     *           necessary parameters to execute the DeleteNotificationConfiguration
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNotificationConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNotificationConfigurationAsync(final DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteNotificationConfiguration(deleteNotificationConfigurationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     *
     * @param deleteNotificationConfigurationRequest Container for the
     *           necessary parameters to execute the DeleteNotificationConfiguration
     *           operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNotificationConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNotificationConfigurationAsync(
            final DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest,
            final AsyncHandler<DeleteNotificationConfigurationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteNotificationConfiguration(deleteNotificationConfigurationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteNotificationConfigurationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     *
     * @param deleteScheduledActionRequest Container for the necessary
     *           parameters to execute the DeleteScheduledAction operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteScheduledAction service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteScheduledActionAsync(final DeleteScheduledActionRequest deleteScheduledActionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteScheduledAction(deleteScheduledActionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     *
     * @param deleteScheduledActionRequest Container for the necessary
     *           parameters to execute the DeleteScheduledAction operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteScheduledAction service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteScheduledActionAsync(
            final DeleteScheduledActionRequest deleteScheduledActionRequest,
            final AsyncHandler<DeleteScheduledActionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteScheduledAction(deleteScheduledActionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteScheduledActionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"> Health Checks </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param setInstanceHealthRequest Container for the necessary parameters
     *           to execute the SetInstanceHealth operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SetInstanceHealth service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setInstanceHealthAsync(final SetInstanceHealthRequest setInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setInstanceHealth(setInstanceHealthRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"> Health Checks </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param setInstanceHealthRequest Container for the necessary parameters
     *           to execute the SetInstanceHealth operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetInstanceHealth service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setInstanceHealthAsync(
            final SetInstanceHealthRequest setInstanceHealthRequest,
            final AsyncHandler<SetInstanceHealthRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setInstanceHealth(setInstanceHealthRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setInstanceHealthRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Lists the notification types that are supported by Auto Scaling.
     * </p>
     *
     * @param describeAutoScalingNotificationTypesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeAutoScalingNotificationTypes operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingNotificationTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(final DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingNotificationTypesResult>() {
            public DescribeAutoScalingNotificationTypesResult call() throws Exception {
                return describeAutoScalingNotificationTypes(describeAutoScalingNotificationTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the notification types that are supported by Auto Scaling.
     * </p>
     *
     * @param describeAutoScalingNotificationTypesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeAutoScalingNotificationTypes operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingNotificationTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            final DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest,
            final AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingNotificationTypesResult>() {
            public DescribeAutoScalingNotificationTypesResult call() throws Exception {
              DescribeAutoScalingNotificationTypesResult result;
                try {
                result = describeAutoScalingNotificationTypes(describeAutoScalingNotificationTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAutoScalingNotificationTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Suspends the specified Auto Scaling processes for the specified Auto
     * Scaling group. To suspend specific processes, use the
     * <code>ScalingProcesses</code> parameter. To suspend all processes,
     * omit the <code>ScalingProcesses</code> parameter.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or
     * <code>Terminate</code> process types, it can prevent other process
     * types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use ResumeProcesses.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param suspendProcessesRequest Container for the necessary parameters
     *           to execute the SuspendProcesses operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SuspendProcesses service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> suspendProcessesAsync(final SuspendProcessesRequest suspendProcessesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                suspendProcesses(suspendProcessesRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Suspends the specified Auto Scaling processes for the specified Auto
     * Scaling group. To suspend specific processes, use the
     * <code>ScalingProcesses</code> parameter. To suspend all processes,
     * omit the <code>ScalingProcesses</code> parameter.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or
     * <code>Terminate</code> process types, it can prevent other process
     * types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use ResumeProcesses.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param suspendProcessesRequest Container for the necessary parameters
     *           to execute the SuspendProcesses operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SuspendProcesses service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> suspendProcessesAsync(
            final SuspendProcessesRequest suspendProcessesRequest,
            final AsyncHandler<SuspendProcessesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                suspendProcesses(suspendProcessesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(suspendProcessesRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> A tag's definition is composed of a resource ID,
     * resource type, key and value, and the propagate flag. Value and the
     * propagate flag are optional parameters. See the Request Parameters for
     * more information.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"> Add, Modify, or Remove Auto Scaling Group Tags </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param createOrUpdateTagsRequest Container for the necessary
     *           parameters to execute the CreateOrUpdateTags operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateTags service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createOrUpdateTagsAsync(final CreateOrUpdateTagsRequest createOrUpdateTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createOrUpdateTags(createOrUpdateTagsRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> A tag's definition is composed of a resource ID,
     * resource type, key and value, and the propagate flag. Value and the
     * propagate flag are optional parameters. See the Request Parameters for
     * more information.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"> Add, Modify, or Remove Auto Scaling Group Tags </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param createOrUpdateTagsRequest Container for the necessary
     *           parameters to execute the CreateOrUpdateTags operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateTags service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createOrUpdateTagsAsync(
            final CreateOrUpdateTagsRequest createOrUpdateTagsRequest,
            final AsyncHandler<CreateOrUpdateTagsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createOrUpdateTags(createOrUpdateTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createOrUpdateTagsRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * After the instances are detached, you can manage them independently
     * from the rest of the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html"> Detach EC2 Instances from Your Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param detachInstancesRequest Container for the necessary parameters
     *           to execute the DetachInstances operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DetachInstances service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachInstancesResult> detachInstancesAsync(final DetachInstancesRequest detachInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachInstancesResult>() {
            public DetachInstancesResult call() throws Exception {
                return detachInstances(detachInstancesRequest);
        }
    });
    }

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * After the instances are detached, you can manage them independently
     * from the rest of the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html"> Detach EC2 Instances from Your Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param detachInstancesRequest Container for the necessary parameters
     *           to execute the DetachInstances operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachInstances service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachInstancesResult> detachInstancesAsync(
            final DetachInstancesRequest detachInstancesRequest,
            final AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachInstancesResult>() {
            public DetachInstancesResult call() throws Exception {
              DetachInstancesResult result;
                try {
                result = detachInstances(detachInstancesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(detachInstancesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not
     * provided, the call describes all instances.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call.
     * By default, a call returns up to 20 instances. If there are more items
     * to return, the call returns a token. To get the next set of items,
     * repeat the call with the returned token in the <code>NextToken</code>
     * parameter.
     * </p>
     *
     * @param describeAutoScalingInstancesRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingInstances operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingInstances service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(final DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingInstancesResult>() {
            public DescribeAutoScalingInstancesResult call() throws Exception {
                return describeAutoScalingInstances(describeAutoScalingInstancesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not
     * provided, the call describes all instances.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call.
     * By default, a call returns up to 20 instances. If there are more items
     * to return, the call returns a token. To get the next set of items,
     * repeat the call with the returned token in the <code>NextToken</code>
     * parameter.
     * </p>
     *
     * @param describeAutoScalingInstancesRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingInstances operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingInstances service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            final DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest,
            final AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingInstancesResult>() {
            public DescribeAutoScalingInstancesResult call() throws Exception {
              DescribeAutoScalingInstancesResult result;
                try {
                result = describeAutoScalingInstances(describeAutoScalingInstancesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAutoScalingInstancesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by
     * default is 100 per region, the call fails. For information about
     * viewing and updating these limits, see DescribeAccountLimits.
     * </p>
     *
     * @param createLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the CreateLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLaunchConfigurationAsync(final CreateLaunchConfigurationRequest createLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createLaunchConfiguration(createLaunchConfigurationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by
     * default is 100 per region, the call fails. For information about
     * viewing and updating these limits, see DescribeAccountLimits.
     * </p>
     *
     * @param createLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the CreateLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLaunchConfigurationAsync(
            final CreateLaunchConfigurationRequest createLaunchConfigurationRequest,
            final AsyncHandler<CreateLaunchConfigurationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createLaunchConfiguration(createLaunchConfigurationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLaunchConfigurationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"> Auto Scaling InService State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param enterStandbyRequest Container for the necessary parameters to
     *           execute the EnterStandby operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         EnterStandby service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnterStandbyResult> enterStandbyAsync(final EnterStandbyRequest enterStandbyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnterStandbyResult>() {
            public EnterStandbyResult call() throws Exception {
                return enterStandby(enterStandbyRequest);
        }
    });
    }

    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"> Auto Scaling InService State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param enterStandbyRequest Container for the necessary parameters to
     *           execute the EnterStandby operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnterStandby service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnterStandbyResult> enterStandbyAsync(
            final EnterStandbyRequest enterStandbyRequest,
            final AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnterStandbyResult>() {
            public EnterStandbyResult call() throws Exception {
              EnterStandbyResult result;
                try {
                result = enterStandby(enterStandbyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enterStandbyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     *
     * @param describeLifecycleHookTypesRequest Container for the necessary
     *           parameters to execute the DescribeLifecycleHookTypes operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLifecycleHookTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(final DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHookTypesResult>() {
            public DescribeLifecycleHookTypesResult call() throws Exception {
                return describeLifecycleHookTypes(describeLifecycleHookTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     *
     * @param describeLifecycleHookTypesRequest Container for the necessary
     *           parameters to execute the DescribeLifecycleHookTypes operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLifecycleHookTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            final DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest,
            final AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLifecycleHookTypesResult>() {
            public DescribeLifecycleHookTypesResult call() throws Exception {
              DescribeLifecycleHookTypesResult result;
                try {
                result = describeLifecycleHookTypes(describeLifecycleHookTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLifecycleHookTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * The group must have no instances and no scaling activities in
     * progress.
     * </p>
     * <p>
     * To remove all instances before calling DeleteAutoScalingGroup, you
     * can call UpdateAutoScalingGroup to set the minimum and maximum size of
     * the AutoScalingGroup to zero.
     * </p>
     *
     * @param deleteAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the DeleteAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAutoScalingGroupAsync(final DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAutoScalingGroup(deleteAutoScalingGroupRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * The group must have no instances and no scaling activities in
     * progress.
     * </p>
     * <p>
     * To remove all instances before calling DeleteAutoScalingGroup, you
     * can call UpdateAutoScalingGroup to set the minimum and maximum size of
     * the AutoScalingGroup to zero.
     * </p>
     *
     * @param deleteAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the DeleteAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAutoScalingGroupAsync(
            final DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest,
            final AsyncHandler<DeleteAutoScalingGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteAutoScalingGroup(deleteAutoScalingGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteAutoScalingGroupRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Disables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     *
     * @param disableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the DisableMetricsCollection operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DisableMetricsCollection service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableMetricsCollectionAsync(final DisableMetricsCollectionRequest disableMetricsCollectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableMetricsCollection(disableMetricsCollectionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Disables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     *
     * @param disableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the DisableMetricsCollection operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableMetricsCollection service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableMetricsCollectionAsync(
            final DisableMetricsCollectionRequest disableMetricsCollectionRequest,
            final AsyncHandler<DisableMetricsCollectionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                disableMetricsCollection(disableMetricsCollectionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableMetricsCollectionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Updates the configuration for the specified AutoScalingGroup.
     * </p>
     * <p>
     * <b>NOTE:</b> To update an Auto Scaling group with a launch
     * configuration that has the InstanceMonitoring flag set to False, you
     * must first ensure that collection of group metrics is disabled.
     * Otherwise, calls to UpdateAutoScalingGroup will fail. If you have
     * previously enabled group metrics collection, you can disable
     * collection of all group metrics by calling DisableMetricsCollection.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this
     * call returns. Scaling activities that are currently in progress aren't
     * affected.
     * </p>
     * <p>
     * <b>NOTE:</b> If a new value is specified for MinSize without
     * specifying the value for DesiredCapacity, and if the new MinSize is
     * larger than the current size of the Auto Scaling group, there will be
     * an implicit call to SetDesiredCapacity to set the group to the new
     * MinSize. If a new value is specified for MaxSize without specifying
     * the value for DesiredCapacity, and the new MaxSize is smaller than the
     * current size of the Auto Scaling group, there will be an implicit call
     * to SetDesiredCapacity to set the group to the new MaxSize. All other
     * optional parameters are left unchanged if not passed in the request.
     * </p>
     *
     * @param updateAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the UpdateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAutoScalingGroupAsync(final UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateAutoScalingGroup(updateAutoScalingGroupRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates the configuration for the specified AutoScalingGroup.
     * </p>
     * <p>
     * <b>NOTE:</b> To update an Auto Scaling group with a launch
     * configuration that has the InstanceMonitoring flag set to False, you
     * must first ensure that collection of group metrics is disabled.
     * Otherwise, calls to UpdateAutoScalingGroup will fail. If you have
     * previously enabled group metrics collection, you can disable
     * collection of all group metrics by calling DisableMetricsCollection.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this
     * call returns. Scaling activities that are currently in progress aren't
     * affected.
     * </p>
     * <p>
     * <b>NOTE:</b> If a new value is specified for MinSize without
     * specifying the value for DesiredCapacity, and if the new MinSize is
     * larger than the current size of the Auto Scaling group, there will be
     * an implicit call to SetDesiredCapacity to set the group to the new
     * MinSize. If a new value is specified for MaxSize without specifying
     * the value for DesiredCapacity, and the new MaxSize is smaller than the
     * current size of the Auto Scaling group, there will be an implicit call
     * to SetDesiredCapacity to set the group to the new MaxSize. All other
     * optional parameters are left unchanged if not passed in the request.
     * </p>
     *
     * @param updateAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the UpdateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAutoScalingGroupAsync(
            final UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest,
            final AsyncHandler<UpdateAutoScalingGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateAutoScalingGroup(updateAutoScalingGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateAutoScalingGroupRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeLaunchConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeLaunchConfigurations operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLaunchConfigurations service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(final DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLaunchConfigurationsResult>() {
            public DescribeLaunchConfigurationsResult call() throws Exception {
                return describeLaunchConfigurations(describeLaunchConfigurationsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     * <p>
     * You can specify a maximum number of items to be returned with a
     * single call. If there are more items to return, the call returns a
     * token. To get the next set of items, repeat the call with the returned
     * token in the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeLaunchConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeLaunchConfigurations operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLaunchConfigurations service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            final DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest,
            final AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLaunchConfigurationsResult>() {
            public DescribeLaunchConfigurationsResult call() throws Exception {
              DescribeLaunchConfigurationsResult result;
                try {
                result = describeLaunchConfigurations(describeLaunchConfigurationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLaunchConfigurationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the policy adjustment types for use with PutScalingPolicy.
     * </p>
     *
     * @param describeAdjustmentTypesRequest Container for the necessary
     *           parameters to execute the DescribeAdjustmentTypes operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAdjustmentTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(final DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAdjustmentTypesResult>() {
            public DescribeAdjustmentTypesResult call() throws Exception {
                return describeAdjustmentTypes(describeAdjustmentTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the policy adjustment types for use with PutScalingPolicy.
     * </p>
     *
     * @param describeAdjustmentTypesRequest Container for the necessary
     *           parameters to execute the DescribeAdjustmentTypes operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAdjustmentTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            final DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest,
            final AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAdjustmentTypesResult>() {
            public DescribeAdjustmentTypesResult call() throws Exception {
              DescribeAdjustmentTypesResult result;
                try {
                result = describeAdjustmentTypes(describeAdjustmentTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAdjustmentTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the actions scheduled for your Auto Scaling group that haven't
     * been executed. To list the actions that were already executed, use
     * DescribeScalingActivities.
     * </p>
     *
     * @param describeScheduledActionsRequest Container for the necessary
     *           parameters to execute the DescribeScheduledActions operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScheduledActions service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(final DescribeScheduledActionsRequest describeScheduledActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScheduledActionsResult>() {
            public DescribeScheduledActionsResult call() throws Exception {
                return describeScheduledActions(describeScheduledActionsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the actions scheduled for your Auto Scaling group that haven't
     * been executed. To list the actions that were already executed, use
     * DescribeScalingActivities.
     * </p>
     *
     * @param describeScheduledActionsRequest Container for the necessary
     *           parameters to execute the DescribeScheduledActions operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScheduledActions service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            final DescribeScheduledActionsRequest describeScheduledActionsRequest,
            final AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScheduledActionsResult>() {
            public DescribeScheduledActionsResult call() throws Exception {
              DescribeScheduledActionsResult result;
                try {
                result = describeScheduledActions(describeScheduledActionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeScheduledActionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with a
     * specific token. This extends the timeout by the length of time defined
     * by the <code>HeartbeatTimeout</code> parameter of PutLifecycleHook.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li> <b>If necessary, record the lifecycle action heartbeat to keep
     * the instance in a pending state.</b> </li>
     * <li>Complete the lifecycle action.</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param recordLifecycleActionHeartbeatRequest Container for the
     *           necessary parameters to execute the RecordLifecycleActionHeartbeat
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         RecordLifecycleActionHeartbeat service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(final RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RecordLifecycleActionHeartbeatResult>() {
            public RecordLifecycleActionHeartbeatResult call() throws Exception {
                return recordLifecycleActionHeartbeat(recordLifecycleActionHeartbeatRequest);
        }
    });
    }

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with a
     * specific token. This extends the timeout by the length of time defined
     * by the <code>HeartbeatTimeout</code> parameter of PutLifecycleHook.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li> <b>If necessary, record the lifecycle action heartbeat to keep
     * the instance in a pending state.</b> </li>
     * <li>Complete the lifecycle action.</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param recordLifecycleActionHeartbeatRequest Container for the
     *           necessary parameters to execute the RecordLifecycleActionHeartbeat
     *           operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RecordLifecycleActionHeartbeat service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            final RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest,
            final AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RecordLifecycleActionHeartbeatResult>() {
            public RecordLifecycleActionHeartbeatResult call() throws Exception {
              RecordLifecycleActionHeartbeatResult result;
                try {
                result = recordLifecycleActionHeartbeat(recordLifecycleActionHeartbeatRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(recordLifecycleActionHeartbeatRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling
     * group. When updating a scheduled scaling action, if you leave a
     * parameter unspecified, the corresponding value remains unchanged in
     * the affected Auto Scaling group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html"> Scheduled Scaling </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Auto Scaling supports the date and time expressed in
     * "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only.
     * </p>
     *
     * @param putScheduledUpdateGroupActionRequest Container for the
     *           necessary parameters to execute the PutScheduledUpdateGroupAction
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutScheduledUpdateGroupAction service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putScheduledUpdateGroupActionAsync(final PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putScheduledUpdateGroupAction(putScheduledUpdateGroupActionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling
     * group. When updating a scheduled scaling action, if you leave a
     * parameter unspecified, the corresponding value remains unchanged in
     * the affected Auto Scaling group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html"> Scheduled Scaling </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Auto Scaling supports the date and time expressed in
     * "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only.
     * </p>
     *
     * @param putScheduledUpdateGroupActionRequest Container for the
     *           necessary parameters to execute the PutScheduledUpdateGroupAction
     *           operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutScheduledUpdateGroupAction service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putScheduledUpdateGroupActionAsync(
            final PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest,
            final AsyncHandler<PutScheduledUpdateGroupActionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putScheduledUpdateGroupAction(putScheduledUpdateGroupActionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putScheduledUpdateGroupActionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of metrics and a corresponding list of granularities
     * for each metric.
     * </p>
     * <p>
     * <b>NOTE:</b> The GroupStandbyInstances metric is not returned by
     * default. You must explicitly request it when calling
     * EnableMetricsCollection.
     * </p>
     *
     * @param describeMetricCollectionTypesRequest Container for the
     *           necessary parameters to execute the DescribeMetricCollectionTypes
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMetricCollectionTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(final DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricCollectionTypesResult>() {
            public DescribeMetricCollectionTypesResult call() throws Exception {
                return describeMetricCollectionTypes(describeMetricCollectionTypesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of metrics and a corresponding list of granularities
     * for each metric.
     * </p>
     * <p>
     * <b>NOTE:</b> The GroupStandbyInstances metric is not returned by
     * default. You must explicitly request it when calling
     * EnableMetricsCollection.
     * </p>
     *
     * @param describeMetricCollectionTypesRequest Container for the
     *           necessary parameters to execute the DescribeMetricCollectionTypes
     *           operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMetricCollectionTypes service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            final DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest,
            final AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricCollectionTypesResult>() {
            public DescribeMetricCollectionTypesResult call() throws Exception {
              DescribeMetricCollectionTypesResult result;
                try {
                result = describeMetricCollectionTypes(describeMetricCollectionTypesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeMetricCollectionTypesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Sets the size of the specified AutoScalingGroup.
     * </p>
     *
     * @param setDesiredCapacityRequest Container for the necessary
     *           parameters to execute the SetDesiredCapacity operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SetDesiredCapacity service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setDesiredCapacityAsync(final SetDesiredCapacityRequest setDesiredCapacityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setDesiredCapacity(setDesiredCapacityRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Sets the size of the specified AutoScalingGroup.
     * </p>
     *
     * @param setDesiredCapacityRequest Container for the necessary
     *           parameters to execute the SetDesiredCapacity operation on
     *           AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetDesiredCapacity service method, as returned by AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setDesiredCapacityAsync(
            final SetDesiredCapacityRequest setDesiredCapacityRequest,
            final AsyncHandler<SetDesiredCapacityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setDesiredCapacity(setDesiredCapacityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setDesiredCapacityRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired
     * group size.
     * </p>
     * <p>
     * <b>NOTE:</b>This call simply makes a termination request. The
     * instances is not terminated immediately.
     * </p>
     *
     * @param terminateInstanceInAutoScalingGroupRequest Container for the
     *           necessary parameters to execute the
     *           TerminateInstanceInAutoScalingGroup operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstanceInAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(final TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateInstanceInAutoScalingGroupResult>() {
            public TerminateInstanceInAutoScalingGroupResult call() throws Exception {
                return terminateInstanceInAutoScalingGroup(terminateInstanceInAutoScalingGroupRequest);
        }
    });
    }

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired
     * group size.
     * </p>
     * <p>
     * <b>NOTE:</b>This call simply makes a termination request. The
     * instances is not terminated immediately.
     * </p>
     *
     * @param terminateInstanceInAutoScalingGroupRequest Container for the
     *           necessary parameters to execute the
     *           TerminateInstanceInAutoScalingGroup operation on AmazonAutoScaling.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstanceInAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            final TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest,
            final AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateInstanceInAutoScalingGroupResult>() {
            public TerminateInstanceInAutoScalingGroupResult call() throws Exception {
              TerminateInstanceInAutoScalingGroupResult result;
                try {
                result = terminateInstanceInAutoScalingGroup(terminateInstanceInAutoScalingGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(terminateInstanceInAutoScalingGroupRequest, result);
                 return result;
        }
    });
    }
    
}
        