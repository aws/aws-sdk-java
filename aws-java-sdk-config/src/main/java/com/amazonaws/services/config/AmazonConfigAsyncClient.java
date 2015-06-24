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
package com.amazonaws.services.config;

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

import com.amazonaws.services.config.model.*;

/**
 * Asynchronous client for accessing AmazonConfig.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Config <p>
 * AWS Config provides a way to keep track of the configurations of all
 * the AWS resources associated with your AWS account. You can use AWS
 * Config to get the current and historical configurations of each AWS
 * resource and also to get information about the relationship between
 * the resources. An AWS resource can be an Amazon Compute Cloud (Amazon
 * EC2) instance, an Elastic Block Store (EBS) volume, an Elastic network
 * Interface (ENI), or a security group. For a complete list of resources
 * currently supported by AWS Config, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"> Supported AWS Resources </a>
 * .
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management
 * Console, the AWS Command Line Interface (AWS CLI), the AWS Config API,
 * or the AWS SDKs for AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and
 * the AWS CLI commands that you can use to manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing
 * requests. For more information about how to sign a request with this
 * protocol, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a>
 * .
 * </p>
 * <p>
 * For detailed information about AWS Config features and their
 * associated actions or commands, as well as how to work with AWS
 * Management Console, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html"> What Is AWS Config? </a>
 * in the <i>AWS Config Developer Guide</i> .
 * </p>
 */
public class AmazonConfigAsyncClient extends AmazonConfigClient
        implements AmazonConfigAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig.  A credentials provider chain will be used
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
    public AmazonConfigAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig.  A credentials provider chain will be used
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
     *                       client connects to AmazonConfig
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonConfigAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials.
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
    public AmazonConfigAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials
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
    public AmazonConfigAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials,
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
    public AmazonConfigAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials provider.
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
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials provider
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
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials
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
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials
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
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelStatusRequest Container for the
     *           necessary parameters to execute the DescribeDeliveryChannelStatus
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannelStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(final DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeliveryChannelStatusResult>() {
            public DescribeDeliveryChannelStatusResult call() throws Exception {
                return describeDeliveryChannelStatus(describeDeliveryChannelStatusRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelStatusRequest Container for the
     *           necessary parameters to execute the DescribeDeliveryChannelStatus
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannelStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            final DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest,
            final AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeliveryChannelStatusResult>() {
            public DescribeDeliveryChannelStatusResult call() throws Exception {
              DescribeDeliveryChannelStatusResult result;
                try {
                result = describeDeliveryChannelStatus(describeDeliveryChannelStatusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDeliveryChannelStatusRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns the name of one or more specified configuration recorders.
     * If the recorder name is not specified, this action returns the names
     * of all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecordersRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationRecorders
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorders service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(final DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationRecordersResult>() {
            public DescribeConfigurationRecordersResult call() throws Exception {
                return describeConfigurationRecorders(describeConfigurationRecordersRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the name of one or more specified configuration recorders.
     * If the recorder name is not specified, this action returns the names
     * of all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecordersRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationRecorders
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorders service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            final DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest,
            final AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationRecordersResult>() {
            public DescribeConfigurationRecordersResult call() throws Exception {
              DescribeConfigurationRecordersResult result;
                try {
                result = describeConfigurationRecorders(describeConfigurationRecordersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeConfigurationRecordersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Starts recording configurations of the AWS resources you have
     * selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully
     * start the configuration recorder.
     * </p>
     *
     * @param startConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StartConfigurationRecorder operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         StartConfigurationRecorder service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startConfigurationRecorderAsync(final StartConfigurationRecorderRequest startConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                startConfigurationRecorder(startConfigurationRecorderRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have
     * selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully
     * start the configuration recorder.
     * </p>
     *
     * @param startConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StartConfigurationRecorder operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartConfigurationRecorder service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startConfigurationRecorderAsync(
            final StartConfigurationRecorderRequest startConfigurationRecorderRequest,
            final AsyncHandler<StartConfigurationRecorderRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                startConfigurationRecorder(startConfigurationRecorderRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(startConfigurationRecorderRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon
     * SNS topic of the existing delivery channel. To change the Amazon S3
     * bucket or an Amazon SNS topic, call this action and specify the
     * changed values for the S3 bucket and the SNS topic. If you specify a
     * different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param putDeliveryChannelRequest Container for the necessary
     *           parameters to execute the PutDeliveryChannel operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         PutDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putDeliveryChannelAsync(final PutDeliveryChannelRequest putDeliveryChannelRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putDeliveryChannel(putDeliveryChannelRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon
     * SNS topic of the existing delivery channel. To change the Amazon S3
     * bucket or an Amazon SNS topic, call this action and specify the
     * changed values for the S3 bucket and the SNS topic. If you specify a
     * different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param putDeliveryChannelRequest Container for the necessary
     *           parameters to execute the PutDeliveryChannel operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putDeliveryChannelAsync(
            final PutDeliveryChannelRequest putDeliveryChannelRequest,
            final AsyncHandler<PutDeliveryChannelRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putDeliveryChannel(putDeliveryChannelRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putDeliveryChannelRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery
     * channel and the configuration recorder is still running. To delete the
     * delivery channel, stop the running configuration recorder using the
     * StopConfigurationRecorder action.
     * </p>
     *
     * @param deleteDeliveryChannelRequest Container for the necessary
     *           parameters to execute the DeleteDeliveryChannel operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeliveryChannelAsync(final DeleteDeliveryChannelRequest deleteDeliveryChannelRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDeliveryChannel(deleteDeliveryChannelRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery
     * channel and the configuration recorder is still running. To delete the
     * delivery channel, stop the running configuration recorder using the
     * StopConfigurationRecorder action.
     * </p>
     *
     * @param deleteDeliveryChannelRequest Container for the necessary
     *           parameters to execute the DeleteDeliveryChannel operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeliveryChannelAsync(
            final DeleteDeliveryChannelRequest deleteDeliveryChannelRequest,
            final AsyncHandler<DeleteDeliveryChannelRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteDeliveryChannel(deleteDeliveryChannelRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDeliveryChannelRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected
     * to record in your AWS account.
     * </p>
     *
     * @param stopConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StopConfigurationRecorder operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         StopConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopConfigurationRecorderAsync(final StopConfigurationRecorderRequest stopConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                stopConfigurationRecorder(stopConfigurationRecorderRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected
     * to record in your AWS account.
     * </p>
     *
     * @param stopConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StopConfigurationRecorder operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopConfigurationRecorderAsync(
            final StopConfigurationRecorderRequest stopConfigurationRecorderRequest,
            final AsyncHandler<StopConfigurationRecorderRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                stopConfigurationRecorder(stopConfigurationRecorderRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(stopConfigurationRecorderRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3
     * bucket in the specified delivery channel. After the delivery has
     * started, AWS Config sends following notifications using an Amazon SNS
     * topic that you have specified.
     * </p>
     * 
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was
     * successfully completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to
     * complete.</li>
     * 
     * </ul>
     *
     * @param deliverConfigSnapshotRequest Container for the necessary
     *           parameters to execute the DeliverConfigSnapshot operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DeliverConfigSnapshot service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(final DeliverConfigSnapshotRequest deliverConfigSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeliverConfigSnapshotResult>() {
            public DeliverConfigSnapshotResult call() throws Exception {
                return deliverConfigSnapshot(deliverConfigSnapshotRequest);
        }
    });
    }

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3
     * bucket in the specified delivery channel. After the delivery has
     * started, AWS Config sends following notifications using an Amazon SNS
     * topic that you have specified.
     * </p>
     * 
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was
     * successfully completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to
     * complete.</li>
     * 
     * </ul>
     *
     * @param deliverConfigSnapshotRequest Container for the necessary
     *           parameters to execute the DeliverConfigSnapshot operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeliverConfigSnapshot service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(
            final DeliverConfigSnapshotRequest deliverConfigSnapshotRequest,
            final AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeliverConfigSnapshotResult>() {
            public DeliverConfigSnapshotResult call() throws Exception {
              DeliverConfigSnapshotResult result;
                try {
                result = deliverConfigSnapshot(deliverConfigSnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deliverConfigSnapshotRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code>
     * and/or the <code>recordingGroup</code> of an existing recorder. To
     * change the role, call the action on the existing configuration
     * recorder and specify a role.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account. If ConfigurationRecorder does not have the
     * recordingGroup parameter specified, the default is to record all
     * supported resource types.
     * </p>
     *
     * @param putConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the PutConfigurationRecorder operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         PutConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putConfigurationRecorderAsync(final PutConfigurationRecorderRequest putConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putConfigurationRecorder(putConfigurationRecorderRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code>
     * and/or the <code>recordingGroup</code> of an existing recorder. To
     * change the role, call the action on the existing configuration
     * recorder and specify a role.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account. If ConfigurationRecorder does not have the
     * recordingGroup parameter specified, the default is to record all
     * supported resource types.
     * </p>
     *
     * @param putConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the PutConfigurationRecorder operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putConfigurationRecorderAsync(
            final PutConfigurationRecorderRequest putConfigurationRecorderRequest,
            final AsyncHandler<PutConfigurationRecorderRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putConfigurationRecorder(putConfigurationRecorderRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putConfigurationRecorderRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval. You can specify a <code>limit</code> on the
     * number of results returned on the page. If a limit is specified, a
     * <code>nextToken</code> is returned as part of the result that you can
     * use to continue this request.
     * </p>
     * <p>
     * <b>NOTE:</b> Each call to the API is limited to span a duration of
     * seven days. It is likely that the number of records returned is
     * smaller than the specified limit. In such cases, you can make another
     * call, using the nextToken .
     * </p>
     *
     * @param getResourceConfigHistoryRequest Container for the necessary
     *           parameters to execute the GetResourceConfigHistory operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         GetResourceConfigHistory service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(final GetResourceConfigHistoryRequest getResourceConfigHistoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetResourceConfigHistoryResult>() {
            public GetResourceConfigHistoryResult call() throws Exception {
                return getResourceConfigHistory(getResourceConfigHistoryRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval. You can specify a <code>limit</code> on the
     * number of results returned on the page. If a limit is specified, a
     * <code>nextToken</code> is returned as part of the result that you can
     * use to continue this request.
     * </p>
     * <p>
     * <b>NOTE:</b> Each call to the API is limited to span a duration of
     * seven days. It is likely that the number of records returned is
     * smaller than the specified limit. In such cases, you can make another
     * call, using the nextToken .
     * </p>
     *
     * @param getResourceConfigHistoryRequest Container for the necessary
     *           parameters to execute the GetResourceConfigHistory operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetResourceConfigHistory service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(
            final GetResourceConfigHistoryRequest getResourceConfigHistoryRequest,
            final AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetResourceConfigHistoryResult>() {
            public GetResourceConfigHistoryResult call() throws Exception {
              GetResourceConfigHistoryResult result;
                try {
                result = getResourceConfigHistory(getResourceConfigHistoryRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getResourceConfigHistoryRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelsRequest Container for the necessary
     *           parameters to execute the DescribeDeliveryChannels operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannels service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(final DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeliveryChannelsResult>() {
            public DescribeDeliveryChannelsResult call() throws Exception {
                return describeDeliveryChannels(describeDeliveryChannelsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelsRequest Container for the necessary
     *           parameters to execute the DescribeDeliveryChannels operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannels service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            final DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest,
            final AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeliveryChannelsResult>() {
            public DescribeDeliveryChannelsResult call() throws Exception {
              DescribeDeliveryChannelsResult result;
                try {
                result = describeDeliveryChannels(describeDeliveryChannelsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDeliveryChannelsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecorderStatusRequest Container for the
     *           necessary parameters to execute the
     *           DescribeConfigurationRecorderStatus operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorderStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(final DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationRecorderStatusResult>() {
            public DescribeConfigurationRecorderStatusResult call() throws Exception {
                return describeConfigurationRecorderStatus(describeConfigurationRecorderStatusRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecorderStatusRequest Container for the
     *           necessary parameters to execute the
     *           DescribeConfigurationRecorderStatus operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorderStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            final DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest,
            final AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationRecorderStatusResult>() {
            public DescribeConfigurationRecorderStatusResult call() throws Exception {
              DescribeConfigurationRecorderStatusResult result;
                try {
                result = describeConfigurationRecorderStatus(describeConfigurationRecorderStatusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeConfigurationRecorderStatusRequest, result);
                 return result;
        }
    });
    }
    
}
        