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
package com.amazonaws.services.logs;

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

import com.amazonaws.services.logs.model.*;

/**
 * Asynchronous client for accessing AWSLogs.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon CloudWatch Logs Service API Reference <p>
 * This is the <i>Amazon CloudWatch Logs API Reference</i> . Amazon
 * CloudWatch Logs is a managed service for real time monitoring and
 * archival of application logs. This guide provides detailed information
 * about Amazon CloudWatch Logs actions, data types, parameters, and
 * errors. For detailed information about Amazon CloudWatch Logs features
 * and their associated API calls, go to the
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/DeveloperGuide"> Amazon CloudWatch Logs Developer Guide </a>
 * .
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon CloudWatch
 * Logs API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Operations.html"> Actions </a>
 * : An alphabetical list of all Amazon CloudWatch Logs actions.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Types.html"> Data Types </a>
 * : An alphabetical list of all Amazon CloudWatch Logs data types.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonParameters.html"> Common Parameters </a>
 * : Parameters that all Query actions can use.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonErrors.html"> Common Errors </a>
 * : Client and server errors that all actions can return.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a>
 * : Itemized regions and endpoints for all AWS products.</li>
 * 
 * </ul>
 * <p>
 * In addition to using the Amazon CloudWatch Logs API, you can also use
 * the following SDKs and third-party libraries to access Amazon
 * CloudWatch Logs programmatically.
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforjava/"> AWS SDK for Java Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkfornet/"> AWS SDK for .NET Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforphp/"> AWS SDK for PHP Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforruby/"> AWS SDK for Ruby Documentation </a>
 * </li>
 * 
 * </ul>
 * <p>
 * Developers in the AWS developer community also provide their own
 * libraries, which you can find at the following AWS developer centers:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://aws.amazon.com/java/"> AWS Java Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/php/"> AWS PHP Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/python/"> AWS Python Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/ruby/"> AWS Ruby Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/net/"> AWS Windows and .NET Developer Center </a>
 * </li>
 * 
 * </ul>
 */
public class AWSLogsAsyncClient extends AWSLogsClient
        implements AWSLogsAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs.  A credentials provider chain will be used
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
    public AWSLogsAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs.  A credentials provider chain will be used
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
     *                       client connects to AWSLogs
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSLogsAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials.
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
    public AWSLogsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials
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
    public AWSLogsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials,
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
    public AWSLogsAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials provider.
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
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials provider
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
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials
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
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLogs using the specified AWS account credentials
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
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Sets the retention of the specified log group. A retention policy
     * allows you to configure the number of days you want to retain log
     * events in the specified log group.
     * </p>
     *
     * @param putRetentionPolicyRequest Container for the necessary
     *           parameters to execute the PutRetentionPolicy operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         PutRetentionPolicy service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putRetentionPolicyAsync(final PutRetentionPolicyRequest putRetentionPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putRetentionPolicy(putRetentionPolicyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy
     * allows you to configure the number of days you want to retain log
     * events in the specified log group.
     * </p>
     *
     * @param putRetentionPolicyRequest Container for the necessary
     *           parameters to execute the PutRetentionPolicy operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutRetentionPolicy service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putRetentionPolicyAsync(
            final PutRetentionPolicyRequest putRetentionPolicyRequest,
            final AsyncHandler<PutRetentionPolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putRetentionPolicy(putRetentionPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putRetentionPolicyRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns all the metrics filters associated with the specified log
     * group. The list returned in the response is ASCII-sorted by filter
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there
     * are more metric filters to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of metric filters returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeMetricFiltersRequest Container for the necessary
     *           parameters to execute the DescribeMetricFilters operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMetricFilters service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(final DescribeMetricFiltersRequest describeMetricFiltersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricFiltersResult>() {
            public DescribeMetricFiltersResult call() throws Exception {
                return describeMetricFilters(describeMetricFiltersRequest);
        }
    });
    }

    /**
     * <p>
     * Returns all the metrics filters associated with the specified log
     * group. The list returned in the response is ASCII-sorted by filter
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there
     * are more metric filters to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of metric filters returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeMetricFiltersRequest Container for the necessary
     *           parameters to execute the DescribeMetricFilters operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMetricFilters service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(
            final DescribeMetricFiltersRequest describeMetricFiltersRequest,
            final AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricFiltersResult>() {
            public DescribeMetricFiltersResult call() throws Exception {
              DescribeMetricFiltersResult result;
                try {
                result = describeMetricFilters(describeMetricFiltersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeMetricFiltersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns all the log streams that are associated with the specified
     * log group. The list returned in the response is ASCII-sorted by log
     * stream name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are
     * more log streams to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log streams returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogStreamsRequest Container for the necessary
     *           parameters to execute the DescribeLogStreams operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLogStreams service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLogStreamsResult> describeLogStreamsAsync(final DescribeLogStreamsRequest describeLogStreamsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLogStreamsResult>() {
            public DescribeLogStreamsResult call() throws Exception {
                return describeLogStreams(describeLogStreamsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns all the log streams that are associated with the specified
     * log group. The list returned in the response is ASCII-sorted by log
     * stream name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are
     * more log streams to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log streams returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogStreamsRequest Container for the necessary
     *           parameters to execute the DescribeLogStreams operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLogStreams service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLogStreamsResult> describeLogStreamsAsync(
            final DescribeLogStreamsRequest describeLogStreamsRequest,
            final AsyncHandler<DescribeLogStreamsRequest, DescribeLogStreamsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLogStreamsResult>() {
            public DescribeLogStreamsResult call() throws Exception {
              DescribeLogStreamsResult result;
                try {
                result = describeLogStreams(describeLogStreamsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLogStreamsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes
     * all the archived log events associated with it.
     * </p>
     *
     * @param deleteLogGroupRequest Container for the necessary parameters to
     *           execute the DeleteLogGroup operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLogGroup service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLogGroupAsync(final DeleteLogGroupRequest deleteLogGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLogGroup(deleteLogGroupRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes
     * all the archived log events associated with it.
     * </p>
     *
     * @param deleteLogGroupRequest Container for the necessary parameters to
     *           execute the DeleteLogGroup operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLogGroup service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLogGroupAsync(
            final DeleteLogGroupRequest deleteLogGroupRequest,
            final AsyncHandler<DeleteLogGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteLogGroup(deleteLogGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLogGroupRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log
     * group must be unique within a region for an AWS account. You can
     * create up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * <ul>
     * <li>Log group names can be between 1 and 512 characters long.</li>
     * <li>Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogGroupRequest Container for the necessary parameters to
     *           execute the CreateLogGroup operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLogGroup service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLogGroupAsync(final CreateLogGroupRequest createLogGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createLogGroup(createLogGroupRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log
     * group must be unique within a region for an AWS account. You can
     * create up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * <ul>
     * <li>Log group names can be between 1 and 512 characters long.</li>
     * <li>Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogGroupRequest Container for the necessary parameters to
     *           execute the CreateLogGroup operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLogGroup service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLogGroupAsync(
            final CreateLogGroupRequest createLogGroupRequest,
            final AsyncHandler<CreateLogGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createLogGroup(createLogGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLogGroupRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates or updates a metric filter and associates it with the
     * specified log group. Metric filters allow you to configure rules to
     * extract metric data from log events ingested through
     * <code>PutLogEvents</code> requests.
     * </p>
     *
     * @param putMetricFilterRequest Container for the necessary parameters
     *           to execute the PutMetricFilter operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         PutMetricFilter service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putMetricFilterAsync(final PutMetricFilterRequest putMetricFilterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putMetricFilter(putMetricFilterRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the
     * specified log group. Metric filters allow you to configure rules to
     * extract metric data from log events ingested through
     * <code>PutLogEvents</code> requests.
     * </p>
     *
     * @param putMetricFilterRequest Container for the necessary parameters
     *           to execute the PutMetricFilter operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutMetricFilter service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putMetricFilterAsync(
            final PutMetricFilterRequest putMetricFilterRequest,
            final AsyncHandler<PutMetricFilterRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putMetricFilter(putMetricFilterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putMetricFilterRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     *
     * @param deleteMetricFilterRequest Container for the necessary
     *           parameters to execute the DeleteMetricFilter operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMetricFilter service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteMetricFilterAsync(final DeleteMetricFilterRequest deleteMetricFilterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteMetricFilter(deleteMetricFilterRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     *
     * @param deleteMetricFilterRequest Container for the necessary
     *           parameters to execute the DeleteMetricFilter operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMetricFilter service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteMetricFilterAsync(
            final DeleteMetricFilterRequest deleteMetricFilterRequest,
            final AsyncHandler<DeleteMetricFilterRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteMetricFilter(deleteMetricFilterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteMetricFilterRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log
     * event messages. You can use this operation to validate the correctness
     * of a metric filter pattern.
     * </p>
     *
     * @param testMetricFilterRequest Container for the necessary parameters
     *           to execute the TestMetricFilter operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         TestMetricFilter service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TestMetricFilterResult> testMetricFilterAsync(final TestMetricFilterRequest testMetricFilterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TestMetricFilterResult>() {
            public TestMetricFilterResult call() throws Exception {
                return testMetricFilter(testMetricFilterRequest);
        }
    });
    }

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log
     * event messages. You can use this operation to validate the correctness
     * of a metric filter pattern.
     * </p>
     *
     * @param testMetricFilterRequest Container for the necessary parameters
     *           to execute the TestMetricFilter operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TestMetricFilter service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TestMetricFilterResult> testMetricFilterAsync(
            final TestMetricFilterRequest testMetricFilterRequest,
            final AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TestMetricFilterResult>() {
            public TestMetricFilterResult call() throws Exception {
              TestMetricFilterResult result;
                try {
                result = testMetricFilter(testMetricFilterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(testMetricFilterRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the
     * <code>sequenceToken</code> obtained from the response of the previous
     * request. An upload in a newly created log stream does not require a
     * <code>sequenceToken</code> .
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * <ul>
     * <li>The maximum batch size is 32,768 bytes, and this size is
     * calculated as the sum of all event messages in UTF-8, plus 26 bytes
     * for each log event.</li>
     * <li>None of the log events in the batch can be more than 2 hours in
     * the future.</li>
     * <li>None of the log events in the batch can be older than 14 days or
     * the retention period of the log group.</li>
     * <li>The log events in the batch must be in chronological ordered by
     * their <code>timestamp</code> .</li>
     * <li>The maximum number of log events in a batch is 1,000.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putLogEventsRequest Container for the necessary parameters to
     *           execute the PutLogEvents operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         PutLogEvents service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutLogEventsResult> putLogEventsAsync(final PutLogEventsRequest putLogEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutLogEventsResult>() {
            public PutLogEventsResult call() throws Exception {
                return putLogEvents(putLogEventsRequest);
        }
    });
    }

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the
     * <code>sequenceToken</code> obtained from the response of the previous
     * request. An upload in a newly created log stream does not require a
     * <code>sequenceToken</code> .
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * <ul>
     * <li>The maximum batch size is 32,768 bytes, and this size is
     * calculated as the sum of all event messages in UTF-8, plus 26 bytes
     * for each log event.</li>
     * <li>None of the log events in the batch can be more than 2 hours in
     * the future.</li>
     * <li>None of the log events in the batch can be older than 14 days or
     * the retention period of the log group.</li>
     * <li>The log events in the batch must be in chronological ordered by
     * their <code>timestamp</code> .</li>
     * <li>The maximum number of log events in a batch is 1,000.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putLogEventsRequest Container for the necessary parameters to
     *           execute the PutLogEvents operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutLogEvents service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutLogEventsResult> putLogEventsAsync(
            final PutLogEventsRequest putLogEventsRequest,
            final AsyncHandler<PutLogEventsRequest, PutLogEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutLogEventsResult>() {
            public PutLogEventsResult call() throws Exception {
              PutLogEventsResult result;
                try {
                result = putLogEvents(putLogEventsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putLogEventsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events
     * would not expire if they belong to log groups without a retention
     * policy.
     * </p>
     *
     * @param deleteRetentionPolicyRequest Container for the necessary
     *           parameters to execute the DeleteRetentionPolicy operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRetentionPolicy service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteRetentionPolicyAsync(final DeleteRetentionPolicyRequest deleteRetentionPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteRetentionPolicy(deleteRetentionPolicyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events
     * would not expire if they belong to log groups without a retention
     * policy.
     * </p>
     *
     * @param deleteRetentionPolicyRequest Container for the necessary
     *           parameters to execute the DeleteRetentionPolicy operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRetentionPolicy service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteRetentionPolicyAsync(
            final DeleteRetentionPolicyRequest deleteRetentionPolicyRequest,
            final AsyncHandler<DeleteRetentionPolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteRetentionPolicy(deleteRetentionPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteRetentionPolicyRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide
     * an optional time range to filter the results on the event
     * <code>timestamp</code> .
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a
     * response size of 1MB, up to 10,000 log events. The response will
     * always include a <code>nextForwardToken</code> and a
     * <code>nextBackwardToken</code> in the response body. You can use any
     * of these tokens in subsequent <code>GetLogEvents</code> requests to
     * paginate through events in either forward or backward direction. You
     * can also limit the number of log events returned in the response by
     * specifying the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param getLogEventsRequest Container for the necessary parameters to
     *           execute the GetLogEvents operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         GetLogEvents service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetLogEventsResult> getLogEventsAsync(final GetLogEventsRequest getLogEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetLogEventsResult>() {
            public GetLogEventsResult call() throws Exception {
                return getLogEvents(getLogEventsRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide
     * an optional time range to filter the results on the event
     * <code>timestamp</code> .
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a
     * response size of 1MB, up to 10,000 log events. The response will
     * always include a <code>nextForwardToken</code> and a
     * <code>nextBackwardToken</code> in the response body. You can use any
     * of these tokens in subsequent <code>GetLogEvents</code> requests to
     * paginate through events in either forward or backward direction. You
     * can also limit the number of log events returned in the response by
     * specifying the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param getLogEventsRequest Container for the necessary parameters to
     *           execute the GetLogEvents operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetLogEvents service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetLogEventsResult> getLogEventsAsync(
            final GetLogEventsRequest getLogEventsRequest,
            final AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetLogEventsResult>() {
            public GetLogEventsResult call() throws Exception {
              GetLogEventsResult result;
                try {
                result = getLogEvents(getLogEventsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getLogEventsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the
     * log stream must be unique within the log group. There is no limit on
     * the number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * <ul>
     * <li>Log stream names can be between 1 and 512 characters long.</li>
     * <li>The ':' colon character is not allowed.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogStreamRequest Container for the necessary parameters
     *           to execute the CreateLogStream operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLogStream service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLogStreamAsync(final CreateLogStreamRequest createLogStreamRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createLogStream(createLogStreamRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the
     * log stream must be unique within the log group. There is no limit on
     * the number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * <ul>
     * <li>Log stream names can be between 1 and 512 characters long.</li>
     * <li>The ':' colon character is not allowed.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogStreamRequest Container for the necessary parameters
     *           to execute the CreateLogStream operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLogStream service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLogStreamAsync(
            final CreateLogStreamRequest createLogStreamRequest,
            final AsyncHandler<CreateLogStreamRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createLogStream(createLogStreamRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLogStreamRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log
     * events associated with it.
     * </p>
     *
     * @param deleteLogStreamRequest Container for the necessary parameters
     *           to execute the DeleteLogStream operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLogStream service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLogStreamAsync(final DeleteLogStreamRequest deleteLogStreamRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLogStream(deleteLogStreamRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log
     * events associated with it.
     * </p>
     *
     * @param deleteLogStreamRequest Container for the necessary parameters
     *           to execute the DeleteLogStream operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLogStream service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLogStreamAsync(
            final DeleteLogStreamRequest deleteLogStreamRequest,
            final AsyncHandler<DeleteLogStreamRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteLogStream(deleteLogStreamRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLogStreamRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are
     * more log groups to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log groups returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogGroupsRequest Container for the necessary parameters
     *           to execute the DescribeLogGroups operation on AWSLogs.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLogGroups service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLogGroupsResult> describeLogGroupsAsync(final DescribeLogGroupsRequest describeLogGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLogGroupsResult>() {
            public DescribeLogGroupsResult call() throws Exception {
                return describeLogGroups(describeLogGroupsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are
     * more log groups to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log groups returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogGroupsRequest Container for the necessary parameters
     *           to execute the DescribeLogGroups operation on AWSLogs.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLogGroups service method, as returned by AWSLogs.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            final DescribeLogGroupsRequest describeLogGroupsRequest,
            final AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLogGroupsResult>() {
            public DescribeLogGroupsResult call() throws Exception {
              DescribeLogGroupsResult result;
                try {
                result = describeLogGroups(describeLogGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLogGroupsRequest, result);
                 return result;
        }
    });
    }
    
}
        