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
package com.amazonaws.services.sqs;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.sqs.model.*;

/**
 * Interface for accessing AmazonSQS asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon Simple Queue Service <p>
 * Amazon Simple Queue Service (Amazon SQS) offers a reliable, highly scalable, hosted queue for storing messages as they travel between computers. By
 * using Amazon SQS, developers can simply move data between distributed components of their applications that perform different tasks, without losing
 * messages or requiring each component to be always available. Amazon SQS makes it easy to build an automated workflow, working in close conjunction
 * with the Amazon Elastic Compute Cloud (Amazon EC2) and the other AWS infrastructure web services.
 * </p>
 * <p>
 * Amazon SQS works by exposing Amazon's web-scale messaging infrastructure as a web service. Any computer on the Internet can add or read messages
 * without any installed software or special firewall configurations. Components of applications using Amazon SQS can run independently, and do not need
 * to be on the same network, developed with the same technologies, or running at the same time.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/sqs/"> http://aws.amazon.com/sqs/ </a> for more information.
 * </p>
 */
public interface AmazonSQSAsync extends AmazonSQS {
    /**
     * <p>
     * Sets the value of one or more queue attributes. Valid attributes that
     * can be set are [VisibilityTimeout, Policy, MaximumMessageSize,
     * MessageRetentionPeriod, ReceiveMessageWaitTimeSeconds].
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
    public Future<Void> setQueueAttributesAsync(SetQueueAttributesRequest setQueueAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the value of one or more queue attributes. Valid attributes that
     * can be set are [VisibilityTimeout, Policy, MaximumMessageSize,
     * MessageRetentionPeriod, ReceiveMessageWaitTimeSeconds].
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
    public Future<Void> setQueueAttributesAsync(SetQueueAttributesRequest setQueueAttributesRequest,
            AsyncHandler<SetQueueAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This is a batch version of ChangeMessageVisibility. It takes multiple
     * receipt handles and performs the operation on each of the them. The
     * result of the operation on each message is reported individually in
     * the response.
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
    public Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This is a batch version of ChangeMessageVisibility. It takes multiple
     * receipt handles and performs the operation on each of the them. The
     * result of the operation on each message is reported individually in
     * the response.
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
    public Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest,
            AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ChangeMessageVisibility</code> action changes the visibility
     * timeout of a specified message in a queue to a new value. The maximum
     * allowed timeout value you can set the value to is 12 hours. This means
     * you can't extend the timeout of a message in an existing queue to more
     * than a total visibility timeout of 12 hours. (For more information
     * visibility timeout, see <a
     * azon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html">
     * Visibility Timeout </a> in the Amazon SQS Developer Guide.)
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
    public Future<Void> changeMessageVisibilityAsync(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ChangeMessageVisibility</code> action changes the visibility
     * timeout of a specified message in a queue to a new value. The maximum
     * allowed timeout value you can set the value to is 12 hours. This means
     * you can't extend the timeout of a message in an existing queue to more
     * than a total visibility timeout of 12 hours. (For more information
     * visibility timeout, see <a
     * azon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html">
     * Visibility Timeout </a> in the Amazon SQS Developer Guide.)
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
    public Future<Void> changeMessageVisibilityAsync(ChangeMessageVisibilityRequest changeMessageVisibilityRequest,
            AsyncHandler<ChangeMessageVisibilityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>GetQueueUrl</code> action returns the URL of an existing
     * queue.
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
    public Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest getQueueUrlRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>GetQueueUrl</code> action returns the URL of an existing
     * queue.
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
    public Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest getQueueUrlRequest,
            AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>RemovePermission</code> action revokes any permissions in
     * the queue policy that matches the specified <code>Label</code>
     * parameter. Only the owner of the queue can remove permissions.
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
    public Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>RemovePermission</code> action revokes any permissions in
     * the queue policy that matches the specified <code>Label</code>
     * parameter. Only the owner of the queue can remove permissions.
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
    public Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets attributes for the specified queue. The following attributes are
     * supported:
     * <ul>
     * <li> <code>All</code> - returns all values.</li>
     * <li> <code>ApproximateNumberOfMessages</code> - returns the
     * approximate number of visible messages in a queue. For more
     * information, see Resources Required to Process Messages in the Amazon
     * SQS Developer Guide.</li>
     * <li> <code>ApproximateNumberOfMessagesNotVisible</code> - returns the
     * approximate number of messages that are not timed-out and not deleted.
     * For more information, see Resources Required to Process Messages in
     * the Amazon SQS Developer Guide.</li>
     * <li> <code>VisibilityTimeout</code> - returns the visibility timeout
     * for the queue. For more information about visibility timeout, see
     * Visibility Timeout in the Amazon SQS Developer Guide.</li>
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
     * 
     * </ul>
     * 
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
    public Future<GetQueueAttributesResult> getQueueAttributesAsync(GetQueueAttributesRequest getQueueAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets attributes for the specified queue. The following attributes are
     * supported:
     * <ul>
     * <li> <code>All</code> - returns all values.</li>
     * <li> <code>ApproximateNumberOfMessages</code> - returns the
     * approximate number of visible messages in a queue. For more
     * information, see Resources Required to Process Messages in the Amazon
     * SQS Developer Guide.</li>
     * <li> <code>ApproximateNumberOfMessagesNotVisible</code> - returns the
     * approximate number of messages that are not timed-out and not deleted.
     * For more information, see Resources Required to Process Messages in
     * the Amazon SQS Developer Guide.</li>
     * <li> <code>VisibilityTimeout</code> - returns the visibility timeout
     * for the queue. For more information about visibility timeout, see
     * Visibility Timeout in the Amazon SQS Developer Guide.</li>
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
     * 
     * </ul>
     * 
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
    public Future<GetQueueAttributesResult> getQueueAttributesAsync(GetQueueAttributesRequest getQueueAttributesRequest,
            AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This is a batch version of SendMessage. It takes multiple messages and
     * adds each of them to the queue. The result of each add operation is
     * reported individually in the response.
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
    public Future<SendMessageBatchResult> sendMessageBatchAsync(SendMessageBatchRequest sendMessageBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This is a batch version of SendMessage. It takes multiple messages and
     * adds each of them to the queue. The result of each add operation is
     * reported individually in the response.
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
    public Future<SendMessageBatchResult> sendMessageBatchAsync(SendMessageBatchRequest sendMessageBatchRequest,
            AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action unconditionally deletes the queue specified by the queue
     * URL. Use this operation WITH CARE! The queue is deleted even if it is
     * NOT empty.
     * </p>
     * <p>
     * Once a queue has been deleted, the queue name is unavailable for use
     * with new queues for 60 seconds.
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
    public Future<Void> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action unconditionally deletes the queue specified by the queue
     * URL. Use this operation WITH CARE! The queue is deleted even if it is
     * NOT empty.
     * </p>
     * <p>
     * Once a queue has been deleted, the queue name is unavailable for use
     * with new queues for 60 seconds.
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
    public Future<Void> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest,
            AsyncHandler<DeleteQueueRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>SendMessage</code> action delivers a message to the
     * specified queue.
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
    public Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>SendMessage</code> action delivers a message to the
     * specified queue.
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
    public Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest,
            AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves one or more messages from the specified queue, including the
     * message body and message ID of each message. Messages returned by this
     * action stay in the queue until you delete them. However, once a
     * message is returned to a <code>ReceiveMessage</code> request, it is
     * not returned on subsequent <code>ReceiveMessage</code> requests for
     * the duration of the <code>VisibilityTimeout</code> . If you do not
     * specify a <code>VisibilityTimeout</code> in the request, the overall
     * visibility timeout for the queue is used for the returned messages.
     * </p>
     * <p>
     * If a message is available in the queue, the call will return
     * immediately. Otherwise, it will wait up to
     * <code>WaitTimeSeconds</code> for a message to arrive. If you do not
     * specify <code>WaitTimeSeconds</code> in the request, the queue
     * attribute ReceiveMessageWaitTimeSeconds is used to determine how long
     * to wait.
     * </p>
     * <p>
     * You could ask for additional information about each message through
     * the attributes. Attributes that can be requested are <code>[SenderId,
     * ApproximateFirstReceiveTimestamp, ApproximateReceiveCount,
     * SentTimestamp]</code> .
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
    public Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest receiveMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves one or more messages from the specified queue, including the
     * message body and message ID of each message. Messages returned by this
     * action stay in the queue until you delete them. However, once a
     * message is returned to a <code>ReceiveMessage</code> request, it is
     * not returned on subsequent <code>ReceiveMessage</code> requests for
     * the duration of the <code>VisibilityTimeout</code> . If you do not
     * specify a <code>VisibilityTimeout</code> in the request, the overall
     * visibility timeout for the queue is used for the returned messages.
     * </p>
     * <p>
     * If a message is available in the queue, the call will return
     * immediately. Otherwise, it will wait up to
     * <code>WaitTimeSeconds</code> for a message to arrive. If you do not
     * specify <code>WaitTimeSeconds</code> in the request, the queue
     * attribute ReceiveMessageWaitTimeSeconds is used to determine how long
     * to wait.
     * </p>
     * <p>
     * You could ask for additional information about each message through
     * the attributes. Attributes that can be requested are <code>[SenderId,
     * ApproximateFirstReceiveTimestamp, ApproximateReceiveCount,
     * SentTimestamp]</code> .
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
    public Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest receiveMessageRequest,
            AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your queues.
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
    public Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your queues.
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
    public Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This is a batch version of DeleteMessage. It takes multiple receipt
     * handles and deletes each one of the messages. The result of the delete
     * operation on each message is reported individually in the response.
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
    public Future<DeleteMessageBatchResult> deleteMessageBatchAsync(DeleteMessageBatchRequest deleteMessageBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This is a batch version of DeleteMessage. It takes multiple receipt
     * handles and deletes each one of the messages. The result of the delete
     * operation on each message is reported individually in the response.
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
    public Future<DeleteMessageBatchResult> deleteMessageBatchAsync(DeleteMessageBatchRequest deleteMessageBatchRequest,
            AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>CreateQueue</code> action creates a new queue, or returns
     * the URL of an existing one. When you request <code>CreateQueue</code>
     * , you provide a name for the queue. To successfully create a new
     * queue, you must provide a name that is unique within the scope of your
     * own queues.
     * </p>
     * <p>
     * You may pass one or more attributes in the request. If you do not
     * provide a value for any attribute, the queue will have the default
     * value for that attribute. Permitted attributes are the same that can
     * be set using SetQueueAttributes.
     * </p>
     * <p>
     * If you provide the name of an existing queue, a new queue isn't
     * created. If the values of attributes provided with the request match
     * up with those on the existing queue, the queue URL is returned.
     * Otherwise, a <code>QueueNameExists</code> error is returned.
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
    public Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>CreateQueue</code> action creates a new queue, or returns
     * the URL of an existing one. When you request <code>CreateQueue</code>
     * , you provide a name for the queue. To successfully create a new
     * queue, you must provide a name that is unique within the scope of your
     * own queues.
     * </p>
     * <p>
     * You may pass one or more attributes in the request. If you do not
     * provide a value for any attribute, the queue will have the default
     * value for that attribute. Permitted attributes are the same that can
     * be set using SetQueueAttributes.
     * </p>
     * <p>
     * If you provide the name of an existing queue, a new queue isn't
     * created. If the values of attributes provided with the request match
     * up with those on the existing queue, the queue URL is returned.
     * Otherwise, a <code>QueueNameExists</code> error is returned.
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
    public Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest,
            AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The AddPermission action adds a permission to a queue for a specific
     * <a
     * s.amazon.com/AWSSimpleQueueService/latest/APIReference/Glossary.html">
     * principal </a> . This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions
     * to the queue. For more information about these permissions, see <a
     * om/AWSSimpleQueueService/latest/SQSDeveloperGuide/?acp-overview.html">
     * Shared Queues </a> in the Amazon SQS Developer Guide.
     * </p>
     * <p>
     * <code>AddPermission</code> writes an SQS-generated policy. If you
     * want to write your own policy, use SetQueueAttributes to upload your
     * policy. For more information about writing your own policy, see <a
     * mpleQueueService/latest/SQSDeveloperGuide/?AccessPolicyLanguage.html">
     * Appendix: The Access Policy Language </a> in the Amazon SQS Developer
     * Guide.
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
    public Future<Void> addPermissionAsync(AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The AddPermission action adds a permission to a queue for a specific
     * <a
     * s.amazon.com/AWSSimpleQueueService/latest/APIReference/Glossary.html">
     * principal </a> . This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions
     * to the queue. For more information about these permissions, see <a
     * om/AWSSimpleQueueService/latest/SQSDeveloperGuide/?acp-overview.html">
     * Shared Queues </a> in the Amazon SQS Developer Guide.
     * </p>
     * <p>
     * <code>AddPermission</code> writes an SQS-generated policy. If you
     * want to write your own policy, use SetQueueAttributes to upload your
     * policy. For more information about writing your own policy, see <a
     * mpleQueueService/latest/SQSDeveloperGuide/?AccessPolicyLanguage.html">
     * Appendix: The Access Policy Language </a> in the Amazon SQS Developer
     * Guide.
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
    public Future<Void> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            AsyncHandler<AddPermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>DeleteMessage</code> action unconditionally removes the
     * specified message from the specified queue. Even if the message is
     * locked by another reader due to the visibility timeout setting, it is
     * still deleted from the queue.
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
    public Future<Void> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>DeleteMessage</code> action unconditionally removes the
     * specified message from the specified queue. Even if the message is
     * locked by another reader due to the visibility timeout setting, it is
     * still deleted from the queue.
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
    public Future<Void> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest,
            AsyncHandler<DeleteMessageRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        