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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.sqs.model.*;

/**
 * Interface for accessing AmazonSQS.
 * 
 */
public interface AmazonSQS {

    /**
     * Overrides the default endpoint for this client ("sqs.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sqs.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "sqs.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "sqs.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "sqs.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonSQS#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
	
    /**
     *
     * @param setQueueAttributesRequest Container for the necessary
     *           parameters to execute the SetQueueAttributes service method on
     *           AmazonSQS.
     * 
     * @throws InvalidAttributeNameException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param changeMessageVisibilityBatchRequest Container for the necessary
     *           parameters to execute the ChangeMessageVisibilityBatch service method
     *           on AmazonSQS.
     * 
     * @return The response from the ChangeMessageVisibilityBatch service
     *         method, as returned by AmazonSQS.
     * 
     * @throws BatchEntryIdsNotDistinctException
     * @throws TooManyEntriesInBatchRequestException
     * @throws InvalidBatchEntryIdException
     * @throws EmptyBatchRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param changeMessageVisibilityRequest Container for the necessary
     *           parameters to execute the ChangeMessageVisibility service method on
     *           AmazonSQS.
     * 
     * @throws ReceiptHandleIsInvalidException
     * @throws MessageNotInflightException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void changeMessageVisibility(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getQueueUrlRequest Container for the necessary parameters to
     *           execute the GetQueueUrl service method on AmazonSQS.
     * 
     * @return The response from the GetQueueUrl service method, as returned
     *         by AmazonSQS.
     * 
     * @throws QueueDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest getQueueUrlRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission service method on AmazonSQS.
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
    public void removePermission(RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getQueueAttributesRequest Container for the necessary
     *           parameters to execute the GetQueueAttributes service method on
     *           AmazonSQS.
     * 
     * @return The response from the GetQueueAttributes service method, as
     *         returned by AmazonSQS.
     * 
     * @throws InvalidAttributeNameException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetQueueAttributesResult getQueueAttributes(GetQueueAttributesRequest getQueueAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param sendMessageBatchRequest Container for the necessary parameters
     *           to execute the SendMessageBatch service method on AmazonSQS.
     * 
     * @return The response from the SendMessageBatch service method, as
     *         returned by AmazonSQS.
     * 
     * @throws BatchEntryIdsNotDistinctException
     * @throws TooManyEntriesInBatchRequestException
     * @throws BatchRequestTooLongException
     * @throws InvalidBatchEntryIdException
     * @throws EmptyBatchRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteQueueRequest Container for the necessary parameters to
     *           execute the DeleteQueue service method on AmazonSQS.
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
    public void deleteQueue(DeleteQueueRequest deleteQueueRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param sendMessageRequest Container for the necessary parameters to
     *           execute the SendMessage service method on AmazonSQS.
     * 
     * @return The response from the SendMessage service method, as returned
     *         by AmazonSQS.
     * 
     * @throws InvalidMessageContentsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendMessageResult sendMessage(SendMessageRequest sendMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param receiveMessageRequest Container for the necessary parameters to
     *           execute the ReceiveMessage service method on AmazonSQS.
     * 
     * @return The response from the ReceiveMessage service method, as
     *         returned by AmazonSQS.
     * 
     * @throws OverLimitException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listQueuesRequest Container for the necessary parameters to
     *           execute the ListQueues service method on AmazonSQS.
     * 
     * @return The response from the ListQueues service method, as returned
     *         by AmazonSQS.
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
    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteMessageBatchRequest Container for the necessary
     *           parameters to execute the DeleteMessageBatch service method on
     *           AmazonSQS.
     * 
     * @return The response from the DeleteMessageBatch service method, as
     *         returned by AmazonSQS.
     * 
     * @throws BatchEntryIdsNotDistinctException
     * @throws TooManyEntriesInBatchRequestException
     * @throws InvalidBatchEntryIdException
     * @throws EmptyBatchRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest deleteMessageBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param createQueueRequest Container for the necessary parameters to
     *           execute the CreateQueue service method on AmazonSQS.
     * 
     * @return The response from the CreateQueue service method, as returned
     *         by AmazonSQS.
     * 
     * @throws QueueNameExistsException
     * @throws QueueDeletedRecentlyException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateQueueResult createQueue(CreateQueueRequest createQueueRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission service method on AmazonSQS.
     * 
     * @throws OverLimitException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addPermission(AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteMessageRequest Container for the necessary parameters to
     *           execute the DeleteMessage service method on AmazonSQS.
     * 
     * @throws ReceiptHandleIsInvalidException
     * @throws InvalidIdFormatException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSQS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteMessage(DeleteMessageRequest deleteMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * 
     * @return The response from the ListQueues service method, as returned
     *         by AmazonSQS.
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
    public ListQueuesResult listQueues() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        