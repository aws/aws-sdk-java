/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;

import com.amazonaws.services.sqs.model.*;


/**
 * Client for accessing AmazonSQS.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * Amazon Simple Queue Service <p>
 * Amazon Simple Queue Service (Amazon SQS) offers a reliable, highly
 * scalable, hosted queue for storing messages as they travel between
 * computers. By using Amazon SQS, developers can simply move data
 * between distributed components of their applications that perform
 * different tasks, without losing messages or requiring each component
 * to be always available. Amazon SQS makes it easy to build an automated
 * workflow, working in close conjunction with the Amazon Elastic Compute
 * Cloud (Amazon EC2) and the other AWS infrastructure web services.
 * </p>
 * <p>
 * Amazon SQS works by exposing Amazon's web-scale messaging
 * infrastructure as a web service. Any computer on the Internet can add
 * or read messages without any installed software or special firewall
 * configurations. Components of applications using Amazon SQS can run
 * independently, and do not need to be on the same network, developed
 * with the same technologies, or running at the same time.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/sqs/">
 * http://aws.amazon.com/sqs/ </a> for more information.
 * </p> 
 */       
public class AmazonSQSAsyncClient extends AmazonSQSClient
        implements AmazonSQSAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonSQS using the specified AWS account credentials.
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
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
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
     * <p>
     * The ListQueues action returns a list of your queues.
     * </p>
     *
     * @param listQueuesRequest Container for the necessary parameters to
     *           execute the ListQueues operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ListQueues service method, as returned by AmazonSQS.
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
     * Sets an attribute of a queue. Currently, you can set only the
     * VisibilityTimeout attribute for a queue.
     * </p>
     *
     * @param setQueueAttributesRequest Container for the necessary
     *           parameters to execute the SetQueueAttributes operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         SetQueueAttributes service method, as returned by AmazonSQS.
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
     * The ChangeMessageVisibility action changes the visibility timeout of
     * a specified message in a queue to a new value. The maximum allowed
     * timeout value you can set the value to is 12 hours. This means you
     * can't extend the timeout of a message in an existing queue to more
     * than a total visibility timeout of 12 hours. (For more information
     * visibility timeout, see Visibility Timeout in the Amazon SQS Developer
     * Guide.)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 30 minutes. You could call
     * ChangeMessageVisiblity with a value of two hours and the effective
     * timeout would be two hours and 30 minutes. When that time comes near
     * you could again extend the time out by calling ChangeMessageVisiblity,
     * but this time the maximum allowed timeout would be 9 hours and 30
     * minutes.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If you attempt to set the VisibilityTimeout to an
     * amount more than the maximum time left, Amazon SQS returns an error.
     * It will not automatically recalculate and increase the timeout to the
     * maximum time remaining.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Unlike with a queue, when you change the visibility
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
     * The CreateQueue action creates a new queue, or returns the URL of an
     * existing one. When you request CreateQueue, you provide a name for the
     * queue. To successfully create a new queue, you must provide a name
     * that is unique within the scope of your own queues. If you provide the
     * name of an existing queue, a new queue isn't created and an error
     * isn't returned. Instead, the request succeeds and the queue URL for
     * the existing queue is returned.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If you provide a value for DefaultVisibilityTimeout
     * that is different from the value for the existing queue, you receive
     * an error.
     * </p>
     *
     * @param createQueueRequest Container for the necessary parameters to
     *           execute the CreateQueue operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateQueue service method, as returned by AmazonSQS.
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
     * The RemovePermission action revokes any permissions in the queue
     * policy that matches the specified <i>Label</i> parameter. Only the
     * owner of the queue can remove permissions.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AmazonSQS.
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
     * Gets one or all attributes of a queue. Queues currently have two
     * attributes you can get: ApproximateNumberOfMessages and
     * VisibilityTimeout.
     * </p>
     *
     * @param getQueueAttributesRequest Container for the necessary
     *           parameters to execute the GetQueueAttributes operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         GetQueueAttributes service method, as returned by AmazonSQS.
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
     * The AddPermission action adds a permission to a queue for a specific
     * principal. This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions
     * to the queue. For more information about these permissions, see Shared
     * Queues in the Amazon SQS Developer Guide.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AmazonSQS.
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
     * This action unconditionally deletes the queue specified by the queue
     * URL. Use this operation WITH CARE! The queue is deleted even if it is
     * NOT empty.
     * </p>
     *
     * @param deleteQueueRequest Container for the necessary parameters to
     *           execute the DeleteQueue operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteQueue service method, as returned by AmazonSQS.
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
     * The DeleteMessage action unconditionally removes the specified
     * message from the specified queue. Even if the message is locked by
     * another reader due to the visibility timeout setting, it is still
     * deleted from the queue.
     * </p>
     *
     * @param deleteMessageRequest Container for the necessary parameters to
     *           execute the DeleteMessage operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMessage service method, as returned by AmazonSQS.
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
     * The SendMessage action delivers a message to the specified queue.
     * </p>
     *
     * @param sendMessageRequest Container for the necessary parameters to
     *           execute the SendMessage operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         SendMessage service method, as returned by AmazonSQS.
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
     * Retrieves one or more messages from the specified queue, including
     * the message body and message ID of each message. Messages returned by
     * this action stay in the queue until you delete them. However, once a
     * message is returned to a ReceiveMessage request, it is not returned on
     * subsequent ReceiveMessage requests for the duration of the
     * VisibilityTimeout. If you do not specify a VisibilityTimeout in the
     * request, the overall visibility timeout for the queue is used for the
     * returned messages.
     * </p>
     *
     * @param receiveMessageRequest Container for the necessary parameters to
     *           execute the ReceiveMessage operation on AmazonSQS.
     * 
     * @return A Java Future object containing the response from the
     *         ReceiveMessage service method, as returned by AmazonSQS.
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
    
}
        