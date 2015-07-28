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
package com.amazonaws.services.sqs;

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

import com.amazonaws.services.sqs.model.*;

/**
 * Asynchronous client for accessing AmazonSQS.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Simple Queue Service <p>
 * Welcome to the <i>Amazon Simple Queue Service API Reference</i> . This
 * section describes who should read this guide, how the guide is
 * organized, and other resources related to the Amazon Simple Queue
 * Service (Amazon SQS).
 * </p>
 * <p>
 * Amazon SQS offers reliable and scalable hosted queues for storing
 * messages as they travel between computers. By using Amazon SQS, you
 * can move data between distributed components of your applications that
 * perform different tasks without losing messages or requiring each
 * component to be always available.
 * </p>
 * <p>
 * Helpful Links:
 * <ul>
 * <li>
 * <a href="http://queue.amazonaws.com/doc/2012-11-05/QueueService.wsdl"> Current WSDL (2012-11-05) </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MakingRequestsArticle.html"> Making API Requests </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/sqs/"> Amazon SQS product page </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html"> Using Amazon SQS Message Attributes </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"> Using Amazon SQS Dead Letter Queues </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region"> Regions and Endpoints </a>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SQS from your
 * preferred programming language. The SDKs contain functionality that
 * automatically takes care of tasks such as:
 * </p>
 * <p>
 * 
 * <ul>
 * <li>Cryptographically signing your service requests</li>
 * <li>Retrying requests</li>
 * <li>Handling error responses</li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * For a list of available SDKs, go to
 * <a href="http://aws.amazon.com/tools/"> Tools for Amazon Web Services </a>
 * .
 * </p>
 */
public class AmazonSQSAsyncClient extends AmazonSQSClient
        implements AmazonSQSAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private final ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS.  A credentials provider chain will be used
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
    public AmazonSQSAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS.  A credentials provider chain will be used
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
     *                       client connects to AmazonSQS
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSQSAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials.
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
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials
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
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials,
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
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials provider.
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
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials provider
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
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials
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
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials
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
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Sets the value of one or more queue attributes. When you change a
     * queue's attributes, the change can take up to 60 seconds for most of
     * the attributes to propagate throughout the SQS system. Changes made to
     * the <code>MessageRetentionPeriod</code> attribute can take up to 15
     * minutes.
     * </p>
     * <p>
     * <b>NOTE:</b>Going forward, new attributes might be added. If you are
     * writing code that calls this action, we recommend that you structure
     * your code so that it can handle new attributes gracefully.
     * </p>
     *
     * @param setQueueAttributesRequest Container for the necessary
     *           parameters to execute the SetQueueAttributes operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         SetQueueAttributes service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setQueueAttributesAsync(final SetQueueAttributesRequest setQueueAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setQueueAttributes(setQueueAttributesRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Sets the value of one or more queue attributes. When you change a
     * queue's attributes, the change can take up to 60 seconds for most of
     * the attributes to propagate throughout the SQS system. Changes made to
     * the <code>MessageRetentionPeriod</code> attribute can take up to 15
     * minutes.
     * </p>
     * <p>
     * <b>NOTE:</b>Going forward, new attributes might be added. If you are
     * writing code that calls this action, we recommend that you structure
     * your code so that it can handle new attributes gracefully.
     * </p>
     *
     * @param setQueueAttributesRequest Container for the necessary
     *           parameters to execute the SetQueueAttributes operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetQueueAttributes service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setQueueAttributesAsync(
            final SetQueueAttributesRequest setQueueAttributesRequest,
            final AsyncHandler<SetQueueAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setQueueAttributes(setQueueAttributesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setQueueAttributesRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch
     * version of ChangeMessageVisibility. The result of the action on each
     * message is reported individually in the response. You can send up to
     * 10 ChangeMessageVisibility requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of
     * 200.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param changeMessageVisibilityBatchRequest Container for the necessary
     *           parameters to execute the ChangeMessageVisibilityBatch operation on
     *           AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibilityBatch service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(final ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ChangeMessageVisibilityBatchResult>() {
            public ChangeMessageVisibilityBatchResult call() throws Exception {
                return changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest);
        }
    });
    }

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch
     * version of ChangeMessageVisibility. The result of the action on each
     * message is reported individually in the response. You can send up to
     * 10 ChangeMessageVisibility requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of
     * 200.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param changeMessageVisibilityBatchRequest Container for the necessary
     *           parameters to execute the ChangeMessageVisibilityBatch operation on
     *           AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibilityBatch service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            final ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest,
            final AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ChangeMessageVisibilityBatchResult>() {
            public ChangeMessageVisibilityBatchResult call() throws Exception {
              ChangeMessageVisibilityBatchResult result;
                try {
                result = changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(changeMessageVisibilityBatchRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a
     * new value. The maximum allowed timeout value you can set the value to
     * is 12 hours. This means you can't extend the timeout of a message in
     * an existing queue to more than a total visibility timeout of 12 hours.
     * (For more information visibility timeout, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
     * in the <i>Amazon SQS Developer Guide</i> .)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 30 minutes. You could call
     * <code>ChangeMessageVisiblity</code> with a value of two hours and the
     * effective timeout would be two hours and 30 minutes. When that time
     * comes near you could again extend the time out by calling
     * ChangeMessageVisiblity, but this time the maximum allowed timeout
     * would be 9 hours and 30 minutes.
     * </p>
     * <p>
     * <b>NOTE:</b> There is a 120,000 limit for the number of inflight
     * messages per queue. Messages are inflight after they have been
     * received from the queue by a consuming component, but have not yet
     * been deleted from the queue. If you reach the 120,000 limit, you will
     * receive an OverLimit error message from Amazon SQS. To help avoid
     * reaching the limit, you should delete the messages from the queue
     * after they have been processed. You can also increase the number of
     * queues you use to process the messages.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you attempt to set the VisibilityTimeout to an
     * amount more than the maximum time left, Amazon SQS returns an error.
     * It will not automatically recalculate and increase the timeout to the
     * maximum time remaining.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Unlike with a queue, when you change the visibility
     * timeout for a specific message, that timeout value is applied
     * immediately but is not saved in memory for that message. If you don't
     * delete a message after it is received, the visibility timeout for the
     * message the next time it is received reverts to the original timeout
     * value, not the value you set with the ChangeMessageVisibility action.
     * </p>
     *
     * @param changeMessageVisibilityRequest Container for the necessary
     *           parameters to execute the ChangeMessageVisibility operation on
     *           AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibility service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> changeMessageVisibilityAsync(final ChangeMessageVisibilityRequest changeMessageVisibilityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                changeMessageVisibility(changeMessageVisibilityRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a
     * new value. The maximum allowed timeout value you can set the value to
     * is 12 hours. This means you can't extend the timeout of a message in
     * an existing queue to more than a total visibility timeout of 12 hours.
     * (For more information visibility timeout, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
     * in the <i>Amazon SQS Developer Guide</i> .)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 30 minutes. You could call
     * <code>ChangeMessageVisiblity</code> with a value of two hours and the
     * effective timeout would be two hours and 30 minutes. When that time
     * comes near you could again extend the time out by calling
     * ChangeMessageVisiblity, but this time the maximum allowed timeout
     * would be 9 hours and 30 minutes.
     * </p>
     * <p>
     * <b>NOTE:</b> There is a 120,000 limit for the number of inflight
     * messages per queue. Messages are inflight after they have been
     * received from the queue by a consuming component, but have not yet
     * been deleted from the queue. If you reach the 120,000 limit, you will
     * receive an OverLimit error message from Amazon SQS. To help avoid
     * reaching the limit, you should delete the messages from the queue
     * after they have been processed. You can also increase the number of
     * queues you use to process the messages.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you attempt to set the VisibilityTimeout to an
     * amount more than the maximum time left, Amazon SQS returns an error.
     * It will not automatically recalculate and increase the timeout to the
     * maximum time remaining.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Unlike with a queue, when you change the visibility
     * timeout for a specific message, that timeout value is applied
     * immediately but is not saved in memory for that message. If you don't
     * delete a message after it is received, the visibility timeout for the
     * message the next time it is received reverts to the original timeout
     * value, not the value you set with the ChangeMessageVisibility action.
     * </p>
     *
     * @param changeMessageVisibilityRequest Container for the necessary
     *           parameters to execute the ChangeMessageVisibility operation on
     *           AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibility service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> changeMessageVisibilityAsync(
            final ChangeMessageVisibilityRequest changeMessageVisibilityRequest,
            final AsyncHandler<ChangeMessageVisibilityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                changeMessageVisibility(changeMessageVisibilityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(changeMessageVisibilityRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple
     * way to retrieve the URL of an Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the
     * <code>QueueOwnerAWSAccountId</code> parameter to specify the account
     * ID of the queue's owner. The queue's owner must grant you permission
     * to access the queue. For more information about shared queue access,
     * see AddPermission or go to
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"> Shared Queues </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     *
     * @param getQueueUrlRequest Container for the necessary parameters to
     *           execute the GetQueueUrl operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         GetQueueUrl service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetQueueUrlResult> getQueueUrlAsync(final GetQueueUrlRequest getQueueUrlRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetQueueUrlResult>() {
            public GetQueueUrlResult call() throws Exception {
                return getQueueUrl(getQueueUrlRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple
     * way to retrieve the URL of an Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the
     * <code>QueueOwnerAWSAccountId</code> parameter to specify the account
     * ID of the queue's owner. The queue's owner must grant you permission
     * to access the queue. For more information about shared queue access,
     * see AddPermission or go to
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"> Shared Queues </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     *
     * @param getQueueUrlRequest Container for the necessary parameters to
     *           execute the GetQueueUrl operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetQueueUrl service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetQueueUrlResult> getQueueUrlAsync(
            final GetQueueUrlRequest getQueueUrlRequest,
            final AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetQueueUrlResult>() {
            public GetQueueUrlResult call() throws Exception {
              GetQueueUrlResult result;
                try {
                result = getQueueUrl(getQueueUrlRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getQueueUrlRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the
     * specified <code>Label</code> parameter. Only the owner of the queue
     * can remove permissions.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(final RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removePermission(removePermissionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the
     * specified <code>Label</code> parameter. Only the owner of the queue
     * can remove permissions.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(
            final RemovePermissionRequest removePermissionRequest,
            final AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                removePermission(removePermissionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(removePermissionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Gets attributes for the specified queue. The following attributes are
     * supported:
     * <ul>
     * <li> <code>All</code> - returns all values.</li>
     * <li> <code>ApproximateNumberOfMessages</code> - returns the
     * approximate number of visible messages in a queue. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"> Resources Required to Process Messages </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * <li> <code>ApproximateNumberOfMessagesNotVisible</code> - returns the
     * approximate number of messages that are not timed-out and not deleted.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"> Resources Required to Process Messages </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * <li> <code>VisibilityTimeout</code> - returns the visibility timeout
     * for the queue. For more information about visibility timeout, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * <li> <code>CreatedTimestamp</code> - returns the time when the queue
     * was created (epoch time in seconds).</li>
     * <li> <code>LastModifiedTimestamp</code> - returns the time when the
     * queue was last changed (epoch time in seconds).</li>
     * <li> <code>Policy</code> - returns the queue's policy.</li>
     * <li> <code>MaximumMessageSize</code> - returns the limit of how many
     * bytes a message can contain before Amazon SQS rejects it.</li>
     * <li> <code>MessageRetentionPeriod</code> - returns the number of
     * seconds Amazon SQS retains a message.</li>
     * <li> <code>QueueArn</code> - returns the queue's Amazon resource name
     * (ARN).</li>
     * <li> <code>ApproximateNumberOfMessagesDelayed</code> - returns the
     * approximate number of messages that are pending to be added to the
     * queue.</li>
     * <li> <code>DelaySeconds</code> - returns the default delay on the
     * queue in seconds.</li>
     * <li> <code>ReceiveMessageWaitTimeSeconds</code> - returns the time
     * for which a ReceiveMessage call will wait for a message to
     * arrive.</li>
     * <li> <code>RedrivePolicy</code> - returns the parameters for dead
     * letter queue functionality of the source queue. For more information
     * about RedrivePolicy and dead letter queues, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"> Using Amazon SQS Dead Letter Queues </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * <b>NOTE:</b>Going forward, new attributes might be added. If you are
     * writing code that calls this action, we recommend that you structure
     * your code so that it can handle new attributes gracefully.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param getQueueAttributesRequest Container for the necessary
     *           parameters to execute the GetQueueAttributes operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         GetQueueAttributes service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetQueueAttributesResult> getQueueAttributesAsync(final GetQueueAttributesRequest getQueueAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetQueueAttributesResult>() {
            public GetQueueAttributesResult call() throws Exception {
                return getQueueAttributes(getQueueAttributesRequest);
        }
    });
    }

    /**
     * <p>
     * Gets attributes for the specified queue. The following attributes are
     * supported:
     * <ul>
     * <li> <code>All</code> - returns all values.</li>
     * <li> <code>ApproximateNumberOfMessages</code> - returns the
     * approximate number of visible messages in a queue. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"> Resources Required to Process Messages </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * <li> <code>ApproximateNumberOfMessagesNotVisible</code> - returns the
     * approximate number of messages that are not timed-out and not deleted.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"> Resources Required to Process Messages </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * <li> <code>VisibilityTimeout</code> - returns the visibility timeout
     * for the queue. For more information about visibility timeout, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * <li> <code>CreatedTimestamp</code> - returns the time when the queue
     * was created (epoch time in seconds).</li>
     * <li> <code>LastModifiedTimestamp</code> - returns the time when the
     * queue was last changed (epoch time in seconds).</li>
     * <li> <code>Policy</code> - returns the queue's policy.</li>
     * <li> <code>MaximumMessageSize</code> - returns the limit of how many
     * bytes a message can contain before Amazon SQS rejects it.</li>
     * <li> <code>MessageRetentionPeriod</code> - returns the number of
     * seconds Amazon SQS retains a message.</li>
     * <li> <code>QueueArn</code> - returns the queue's Amazon resource name
     * (ARN).</li>
     * <li> <code>ApproximateNumberOfMessagesDelayed</code> - returns the
     * approximate number of messages that are pending to be added to the
     * queue.</li>
     * <li> <code>DelaySeconds</code> - returns the default delay on the
     * queue in seconds.</li>
     * <li> <code>ReceiveMessageWaitTimeSeconds</code> - returns the time
     * for which a ReceiveMessage call will wait for a message to
     * arrive.</li>
     * <li> <code>RedrivePolicy</code> - returns the parameters for dead
     * letter queue functionality of the source queue. For more information
     * about RedrivePolicy and dead letter queues, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"> Using Amazon SQS Dead Letter Queues </a>
     * in the <i>Amazon SQS Developer Guide</i> .</li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * <b>NOTE:</b>Going forward, new attributes might be added. If you are
     * writing code that calls this action, we recommend that you structure
     * your code so that it can handle new attributes gracefully.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param getQueueAttributesRequest Container for the necessary
     *           parameters to execute the GetQueueAttributes operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetQueueAttributes service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetQueueAttributesResult> getQueueAttributesAsync(
            final GetQueueAttributesRequest getQueueAttributesRequest,
            final AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetQueueAttributesResult>() {
            public GetQueueAttributesResult call() throws Exception {
              GetQueueAttributesResult result;
                try {
                result = getQueueAttributes(getQueueAttributesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getQueueAttributesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch
     * version of SendMessage. The result of the send action on each message
     * is reported individually in the response. The maximum allowed
     * individual message size is 256 KB (262,144 bytes).
     * </p>
     * <p>
     * The maximum total payload size (i.e., the sum of all a batch's
     * individual message lengths) is also 256 KB (262,144 bytes).
     * </p>
     * <p>
     * If the <code>DelaySeconds</code> parameter is not specified for an
     * entry, the default for the queue is used.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The following list shows the characters (in Unicode)
     * that are allowed in your message, according to the W3C XML
     * specification. For more information, go to
     * http://www.faqs.org/rfcs/rfc1321.html. If you send any characters that
     * are not included in the list, your request will be rejected. #x9 | #xA
     * | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of
     * 200.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param sendMessageBatchRequest Container for the necessary parameters
     *           to execute the SendMessageBatch operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         SendMessageBatch service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendMessageBatchResult> sendMessageBatchAsync(final SendMessageBatchRequest sendMessageBatchRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendMessageBatchResult>() {
            public SendMessageBatchResult call() throws Exception {
                return sendMessageBatch(sendMessageBatchRequest);
        }
    });
    }

    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch
     * version of SendMessage. The result of the send action on each message
     * is reported individually in the response. The maximum allowed
     * individual message size is 256 KB (262,144 bytes).
     * </p>
     * <p>
     * The maximum total payload size (i.e., the sum of all a batch's
     * individual message lengths) is also 256 KB (262,144 bytes).
     * </p>
     * <p>
     * If the <code>DelaySeconds</code> parameter is not specified for an
     * entry, the default for the queue is used.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The following list shows the characters (in Unicode)
     * that are allowed in your message, according to the W3C XML
     * specification. For more information, go to
     * http://www.faqs.org/rfcs/rfc1321.html. If you send any characters that
     * are not included in the list, your request will be rejected. #x9 | #xA
     * | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of
     * 200.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param sendMessageBatchRequest Container for the necessary parameters
     *           to execute the SendMessageBatch operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SendMessageBatch service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendMessageBatchResult> sendMessageBatchAsync(
            final SendMessageBatchRequest sendMessageBatchRequest,
            final AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendMessageBatchResult>() {
            public SendMessageBatchResult call() throws Exception {
              SendMessageBatchResult result;
                try {
                result = sendMessageBatch(sendMessageBatchRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(sendMessageBatchRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the messages in a queue specified by the <b>queue URL</b> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>When you use the PurgeQueue API, the deleted
     * messages in the queue cannot be retrieved.
     * </p>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60
     * seconds. All messages sent to the queue before calling
     * <code>PurgeQueue</code> will be deleted; messages sent to the queue
     * while it is being purged may be deleted. While the queue is being
     * purged, messages sent to the queue before <code>PurgeQueue</code> was
     * called may be received, but will be deleted within the next minute.
     * </p>
     *
     * @param purgeQueueRequest Container for the necessary parameters to
     *           execute the PurgeQueue operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         PurgeQueue service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> purgeQueueAsync(final PurgeQueueRequest purgeQueueRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                purgeQueue(purgeQueueRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the messages in a queue specified by the <b>queue URL</b> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>When you use the PurgeQueue API, the deleted
     * messages in the queue cannot be retrieved.
     * </p>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60
     * seconds. All messages sent to the queue before calling
     * <code>PurgeQueue</code> will be deleted; messages sent to the queue
     * while it is being purged may be deleted. While the queue is being
     * purged, messages sent to the queue before <code>PurgeQueue</code> was
     * called may be received, but will be deleted within the next minute.
     * </p>
     *
     * @param purgeQueueRequest Container for the necessary parameters to
     *           execute the PurgeQueue operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PurgeQueue service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> purgeQueueAsync(
            final PurgeQueueRequest purgeQueueRequest,
            final AsyncHandler<PurgeQueueRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                purgeQueue(purgeQueueRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(purgeQueueRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of your queues that have the RedrivePolicy queue
     * attribute configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"> Using Amazon SQS Dead Letter Queues </a>
     * .
     * </p>
     *
     * @param listDeadLetterSourceQueuesRequest Container for the necessary
     *           parameters to execute the ListDeadLetterSourceQueues operation on
     *           AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeadLetterSourceQueues service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(final ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeadLetterSourceQueuesResult>() {
            public ListDeadLetterSourceQueuesResult call() throws Exception {
                return listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of your queues that have the RedrivePolicy queue
     * attribute configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"> Using Amazon SQS Dead Letter Queues </a>
     * .
     * </p>
     *
     * @param listDeadLetterSourceQueuesRequest Container for the necessary
     *           parameters to execute the ListDeadLetterSourceQueues operation on
     *           AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeadLetterSourceQueues service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(
            final ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest,
            final AsyncHandler<ListDeadLetterSourceQueuesRequest, ListDeadLetterSourceQueuesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeadLetterSourceQueuesResult>() {
            public ListDeadLetterSourceQueuesResult call() throws Exception {
              ListDeadLetterSourceQueuesResult result;
                try {
                result = listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDeadLetterSourceQueuesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the queue specified by the <b>queue URL</b> , regardless of
     * whether the queue is empty. If the specified queue does not exist,
     * Amazon SQS returns a successful response.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Use DeleteQueue with care; once you delete your
     * queue, any messages in the queue are no longer available.
     * </p>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds.
     * Requests you send involving that queue during the 60 seconds might
     * succeed. For example, a SendMessage request might succeed, but after
     * the 60 seconds, the queue and that message you sent no longer exist.
     * Also, when you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for
     * more than 30 days. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"> How Amazon SQS Queues Work </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     *
     * @param deleteQueueRequest Container for the necessary parameters to
     *           execute the DeleteQueue operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteQueue service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteQueueAsync(final DeleteQueueRequest deleteQueueRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteQueue(deleteQueueRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the queue specified by the <b>queue URL</b> , regardless of
     * whether the queue is empty. If the specified queue does not exist,
     * Amazon SQS returns a successful response.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Use DeleteQueue with care; once you delete your
     * queue, any messages in the queue are no longer available.
     * </p>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds.
     * Requests you send involving that queue during the 60 seconds might
     * succeed. For example, a SendMessage request might succeed, but after
     * the 60 seconds, the queue and that message you sent no longer exist.
     * Also, when you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for
     * more than 30 days. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"> How Amazon SQS Queues Work </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     *
     * @param deleteQueueRequest Container for the necessary parameters to
     *           execute the DeleteQueue operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteQueue service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteQueueAsync(
            final DeleteQueueRequest deleteQueueRequest,
            final AsyncHandler<DeleteQueueRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteQueue(deleteQueueRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteQueueRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Delivers a message to the specified queue. With Amazon SQS, you now
     * have the ability to send large payload messages that are up to 256KB
     * (262,144 bytes) in size. To send large payloads, you must use an AWS
     * SDK that supports SigV4 signing. To verify whether SigV4 is supported
     * for an AWS SDK, check the SDK release notes.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The following list shows the characters (in
     * Unicode) allowed in your message, according to the W3C XML
     * specification. For more information, go to
     * http://www.w3.org/TR/REC-xml/#charsets If you send any characters not
     * included in the list, your request will be rejected. #x9 | #xA | #xD |
     * [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
     * </p>
     *
     * @param sendMessageRequest Container for the necessary parameters to
     *           execute the SendMessage operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         SendMessage service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendMessageResult> sendMessageAsync(final SendMessageRequest sendMessageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendMessageResult>() {
            public SendMessageResult call() throws Exception {
                return sendMessage(sendMessageRequest);
        }
    });
    }

    /**
     * <p>
     * Delivers a message to the specified queue. With Amazon SQS, you now
     * have the ability to send large payload messages that are up to 256KB
     * (262,144 bytes) in size. To send large payloads, you must use an AWS
     * SDK that supports SigV4 signing. To verify whether SigV4 is supported
     * for an AWS SDK, check the SDK release notes.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The following list shows the characters (in
     * Unicode) allowed in your message, according to the W3C XML
     * specification. For more information, go to
     * http://www.w3.org/TR/REC-xml/#charsets If you send any characters not
     * included in the list, your request will be rejected. #x9 | #xA | #xD |
     * [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
     * </p>
     *
     * @param sendMessageRequest Container for the necessary parameters to
     *           execute the SendMessage operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SendMessage service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendMessageResult> sendMessageAsync(
            final SendMessageRequest sendMessageRequest,
            final AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendMessageResult>() {
            public SendMessageResult call() throws Exception {
              SendMessageResult result;
                try {
                result = sendMessage(sendMessageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(sendMessageRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages,
     * from the specified queue. Long poll support is enabled by using the
     * <code>WaitTimeSeconds</code> parameter. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"> Amazon SQS Long Poll </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of
     * machines is sampled on a <code>ReceiveMessage</code> call. This means
     * only the messages on the sampled machines are returned. If the number
     * of messages in the queue is small (less than 1000), it is likely you
     * will get fewer messages than you requested per
     * <code>ReceiveMessage</code> call. If the number of messages in the
     * queue is extremely small, you might not receive any messages in a
     * particular <code>ReceiveMessage</code> response; in which case you
     * should repeat the request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Message body
     * </p>
     * </li>
     * <li> <p>
     * MD5 digest of the message body. For information about MD5, go to
     * <a href="http://www.faqs.org/rfcs/rfc1321.html"> http://www.faqs.org/rfcs/rfc1321.html </a>
     * .
     * </p>
     * </li>
     * <li> <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li> <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li> <p>
     * Message attributes.
     * </p>
     * </li>
     * <li> <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting
     * the message. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"> Queue and Message Identifiers </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your
     * request, which will be applied to the messages that Amazon SQS returns
     * in the response. If you do not include the parameter, the overall
     * visibility timeout for the queue is used for the returned messages.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Going forward, new attributes might be added. If you are
     * writing code that calls this action, we recommend that you structure
     * your code so that it can handle new attributes gracefully.
     * </p>
     *
     * @param receiveMessageRequest Container for the necessary parameters to
     *           execute the ReceiveMessage operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ReceiveMessage service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReceiveMessageResult> receiveMessageAsync(final ReceiveMessageRequest receiveMessageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReceiveMessageResult>() {
            public ReceiveMessageResult call() throws Exception {
                return receiveMessage(receiveMessageRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages,
     * from the specified queue. Long poll support is enabled by using the
     * <code>WaitTimeSeconds</code> parameter. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"> Amazon SQS Long Poll </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of
     * machines is sampled on a <code>ReceiveMessage</code> call. This means
     * only the messages on the sampled machines are returned. If the number
     * of messages in the queue is small (less than 1000), it is likely you
     * will get fewer messages than you requested per
     * <code>ReceiveMessage</code> call. If the number of messages in the
     * queue is extremely small, you might not receive any messages in a
     * particular <code>ReceiveMessage</code> response; in which case you
     * should repeat the request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Message body
     * </p>
     * </li>
     * <li> <p>
     * MD5 digest of the message body. For information about MD5, go to
     * <a href="http://www.faqs.org/rfcs/rfc1321.html"> http://www.faqs.org/rfcs/rfc1321.html </a>
     * .
     * </p>
     * </li>
     * <li> <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li> <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li> <p>
     * Message attributes.
     * </p>
     * </li>
     * <li> <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting
     * the message. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"> Queue and Message Identifiers </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your
     * request, which will be applied to the messages that Amazon SQS returns
     * in the response. If you do not include the parameter, the overall
     * visibility timeout for the queue is used for the returned messages.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Going forward, new attributes might be added. If you are
     * writing code that calls this action, we recommend that you structure
     * your code so that it can handle new attributes gracefully.
     * </p>
     *
     * @param receiveMessageRequest Container for the necessary parameters to
     *           execute the ReceiveMessage operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReceiveMessage service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReceiveMessageResult> receiveMessageAsync(
            final ReceiveMessageRequest receiveMessageRequest,
            final AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReceiveMessageResult>() {
            public ReceiveMessageResult call() throws Exception {
              ReceiveMessageResult result;
                try {
                result = receiveMessage(receiveMessageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(receiveMessageRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can
     * be returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name
     * beginning with the specified value are returned.
     * </p>
     *
     * @param listQueuesRequest Container for the necessary parameters to
     *           execute the ListQueues operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ListQueues service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest listQueuesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQueuesResult>() {
            public ListQueuesResult call() throws Exception {
                return listQueues(listQueuesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can
     * be returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name
     * beginning with the specified value are returned.
     * </p>
     *
     * @param listQueuesRequest Container for the necessary parameters to
     *           execute the ListQueues operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListQueues service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListQueuesResult> listQueuesAsync(
            final ListQueuesRequest listQueuesRequest,
            final AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQueuesResult>() {
            public ListQueuesResult call() throws Exception {
              ListQueuesResult result;
                try {
                result = listQueues(listQueuesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listQueuesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch
     * version of DeleteMessage. The result of the delete action on each
     * message is reported individually in the response.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of
     * 200.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param deleteMessageBatchRequest Container for the necessary
     *           parameters to execute the DeleteMessageBatch operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMessageBatch service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteMessageBatchResult> deleteMessageBatchAsync(final DeleteMessageBatchRequest deleteMessageBatchRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteMessageBatchResult>() {
            public DeleteMessageBatchResult call() throws Exception {
                return deleteMessageBatch(deleteMessageBatchRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch
     * version of DeleteMessage. The result of the delete action on each
     * message is reported individually in the response.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of
     * 200.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param deleteMessageBatchRequest Container for the necessary
     *           parameters to execute the DeleteMessageBatch operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMessageBatch service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            final DeleteMessageBatchRequest deleteMessageBatchRequest,
            final AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteMessageBatchResult>() {
            public DeleteMessageBatchResult call() throws Exception {
              DeleteMessageBatchResult result;
                try {
                result = deleteMessageBatch(deleteMessageBatchRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteMessageBatchRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new queue, or returns the URL of an existing one. When you
     * request <code>CreateQueue</code> , you provide a name for the queue.
     * To successfully create a new queue, you must provide a name that is
     * unique within the scope of your own queues.
     * </p>
     * <p>
     * <b>NOTE:</b> If you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * You may pass one or more attributes in the request. If you do not
     * provide a value for any attribute, the queue will have the default
     * value for that attribute. Permitted attributes are the same that can
     * be set using SetQueueAttributes.
     * </p>
     * <p>
     * <b>NOTE:</b> Use GetQueueUrl to get a queue's URL. GetQueueUrl
     * requires only the QueueName parameter.
     * </p>
     * <p>
     * If you provide the name of an existing queue, along with the exact
     * names and values of all the queue's attributes,
     * <code>CreateQueue</code> returns the queue URL for the existing queue.
     * If the queue name, attribute names, or attribute values do not match
     * an existing queue, <code>CreateQueue</code> returns an error.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param createQueueRequest Container for the necessary parameters to
     *           execute the CreateQueue operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateQueue service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest createQueueRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateQueueResult>() {
            public CreateQueueResult call() throws Exception {
                return createQueue(createQueueRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new queue, or returns the URL of an existing one. When you
     * request <code>CreateQueue</code> , you provide a name for the queue.
     * To successfully create a new queue, you must provide a name that is
     * unique within the scope of your own queues.
     * </p>
     * <p>
     * <b>NOTE:</b> If you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * You may pass one or more attributes in the request. If you do not
     * provide a value for any attribute, the queue will have the default
     * value for that attribute. Permitted attributes are the same that can
     * be set using SetQueueAttributes.
     * </p>
     * <p>
     * <b>NOTE:</b> Use GetQueueUrl to get a queue's URL. GetQueueUrl
     * requires only the QueueName parameter.
     * </p>
     * <p>
     * If you provide the name of an existing queue, along with the exact
     * names and values of all the queue's attributes,
     * <code>CreateQueue</code> returns the queue URL for the existing queue.
     * If the queue name, attribute names, or attribute values do not match
     * an existing queue, <code>CreateQueue</code> returns an error.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param createQueueRequest Container for the necessary parameters to
     *           execute the CreateQueue operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateQueue service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateQueueResult> createQueueAsync(
            final CreateQueueRequest createQueueRequest,
            final AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateQueueResult>() {
            public CreateQueueResult call() throws Exception {
              CreateQueueResult result;
                try {
                result = createQueue(createQueueRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createQueueRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Adds a permission to a queue for a specific
     * <a href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"> principal </a>
     * . This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions
     * to the queue. For more information about these permissions, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"> Shared Queues </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> AddPermission writes an Amazon SQS-generated policy. If
     * you want to write your own policy, use SetQueueAttributes to upload
     * your policy. For more information about writing your own policy, see
     * Using The Access Policy Language in the Amazon SQS Developer Guide.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(final AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                addPermission(addPermissionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Adds a permission to a queue for a specific
     * <a href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"> principal </a>
     * . This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions
     * to the queue. For more information about these permissions, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"> Shared Queues </a>
     * in the <i>Amazon SQS Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> AddPermission writes an Amazon SQS-generated policy. If
     * you want to write your own policy, use SetQueueAttributes to upload
     * your policy. For more information about writing your own policy, see
     * Using The Access Policy Language in the Amazon SQS Developer Guide.
     * </p>
     * <p>
     * <b>NOTE:</b>Some API actions take lists of parameters. These lists
     * are specified using the param.n notation. Values of n are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this:
     * </p>
     * <p>
     * <code>&Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&Attribute.2=that</code>
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(
            final AddPermissionRequest addPermissionRequest,
            final AsyncHandler<AddPermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                addPermission(addPermissionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(addPermissionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify
     * the message by using the message's <code>receipt handle</code> and not
     * the <code>message ID</code> you received when you sent the message.
     * Even if the message is locked by another reader due to the visibility
     * timeout setting, it is still deleted from the queue. If you leave a
     * message in the queue for longer than the queue's configured retention
     * period, Amazon SQS automatically deletes it.
     * </p>
     * <p>
     * <b>NOTE:</b> The receipt handle is associated with a specific
     * instance of receiving the message. If you receive a message more than
     * once, the receipt handle you get each time you receive the message is
     * different. When you request DeleteMessage, if you don't provide the
     * most recently received receipt handle for the message, the request
     * will still succeed, but the message might not be deleted.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> It is possible you will receive a message even
     * after you have deleted it. This might happen on rare occasions if one
     * of the servers storing a copy of the message is unavailable when you
     * request to delete the message. The copy remains on the server and
     * might be returned to you again on a subsequent receive request. You
     * should create your system to be idempotent so that receiving a
     * particular message more than once is not a problem.
     * </p>
     *
     * @param deleteMessageRequest Container for the necessary parameters to
     *           execute the DeleteMessage operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMessage service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteMessageAsync(final DeleteMessageRequest deleteMessageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteMessage(deleteMessageRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify
     * the message by using the message's <code>receipt handle</code> and not
     * the <code>message ID</code> you received when you sent the message.
     * Even if the message is locked by another reader due to the visibility
     * timeout setting, it is still deleted from the queue. If you leave a
     * message in the queue for longer than the queue's configured retention
     * period, Amazon SQS automatically deletes it.
     * </p>
     * <p>
     * <b>NOTE:</b> The receipt handle is associated with a specific
     * instance of receiving the message. If you receive a message more than
     * once, the receipt handle you get each time you receive the message is
     * different. When you request DeleteMessage, if you don't provide the
     * most recently received receipt handle for the message, the request
     * will still succeed, but the message might not be deleted.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> It is possible you will receive a message even
     * after you have deleted it. This might happen on rare occasions if one
     * of the servers storing a copy of the message is unavailable when you
     * request to delete the message. The copy remains on the server and
     * might be returned to you again on a subsequent receive request. You
     * should create your system to be idempotent so that receiving a
     * particular message more than once is not a problem.
     * </p>
     *
     * @param deleteMessageRequest Container for the necessary parameters to
     *           execute the DeleteMessage operation on AmazonSQS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMessage service method, as returned by AmazonSQS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteMessageAsync(
            final DeleteMessageRequest deleteMessageRequest,
            final AsyncHandler<DeleteMessageRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteMessage(deleteMessageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteMessageRequest, null);
                 return null;
        }
    });
    }
    
}
        