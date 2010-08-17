/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.security.SignatureException;

import com.amazonaws.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWS3Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpRequest;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.services.sqs.model.transform.*;


/**
 * Client for accessing AmazonSQS.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
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
public class AmazonSQSClient extends AmazonWebServiceClient implements AmazonSQS {

    /**
     * The AWS credentials (access key ID and secret key) to use when
     * authenticating with AWS services.
     */
    private AWSCredentials awsCredentials;

    /**
     * List of exception unmarshallers for all AmazonSQS exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    /** Low level client for sending requests to AWS services. */
    protected final HttpClient client;

    /** Optional request handlers for additional request processing. */
    private List<RequestHandler> requestHandlers = new ArrayList<RequestHandler>();
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonSQSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSQS using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSQS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSQSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentials = awsCredentials;

        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        exceptionUnmarshallers.add(new QueueDeletedRecentlyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueNameExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAttributeNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReceiptHandleIsInvalidExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidMessageContentsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("queue.amazonaws.com");

        signer = new QueryStringSigner(awsCredentials);

        requestHandlers = new HandlerChainFactory().newRequestHandlerChain(
                "/com/amazonaws/services/sqs/request.handlers");
        client = new HttpClient(clientConfiguration);
    }

    
    /**
     * <p>
     * The ListQueues action returns a list of your queues.
     * </p>
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListQueuesRequest> request = new ListQueuesRequestMarshaller().marshall(listQueuesRequest);
        return invoke(request, new ListQueuesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Sets an attribute of a queue. Currently, you can set only the
     * VisibilityTimeout attribute for a queue.
     * </p>
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
            throws AmazonServiceException, AmazonClientException {
        Request<SetQueueAttributesRequest> request = new SetQueueAttributesRequestMarshaller().marshall(setQueueAttributesRequest);
        invoke(request, null);
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
     *           parameters to execute the ChangeMessageVisibility service method on
     *           AmazonSQS.
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
    public void changeMessageVisibility(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ChangeMessageVisibilityRequest> request = new ChangeMessageVisibilityRequestMarshaller().marshall(changeMessageVisibilityRequest);
        invoke(request, null);
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateQueueRequest> request = new CreateQueueRequestMarshaller().marshall(createQueueRequest);
        return invoke(request, new CreateQueueResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The RemovePermission action revokes any permissions in the queue
     * policy that matches the specified <i>Label</i> parameter. Only the
     * owner of the queue can remove permissions.
     * </p>
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
            throws AmazonServiceException, AmazonClientException {
        Request<RemovePermissionRequest> request = new RemovePermissionRequestMarshaller().marshall(removePermissionRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Gets one or all attributes of a queue. Queues currently have two
     * attributes you can get: ApproximateNumberOfMessages and
     * VisibilityTimeout.
     * </p>
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetQueueAttributesRequest> request = new GetQueueAttributesRequestMarshaller().marshall(getQueueAttributesRequest);
        return invoke(request, new GetQueueAttributesResultStaxUnmarshaller());
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
     *           execute the AddPermission service method on AmazonSQS.
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
    public void addPermission(AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AddPermissionRequest> request = new AddPermissionRequestMarshaller().marshall(addPermissionRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * This action unconditionally deletes the queue specified by the queue
     * URL. Use this operation WITH CARE! The queue is deleted even if it is
     * NOT empty.
     * </p>
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteQueueRequest> request = new DeleteQueueRequestMarshaller().marshall(deleteQueueRequest);
        invoke(request, null);
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
     *           execute the DeleteMessage service method on AmazonSQS.
     * 
     * @throws ReceiptHandleIsInvalidException
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteMessageRequest> request = new DeleteMessageRequestMarshaller().marshall(deleteMessageRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The SendMessage action delivers a message to the specified queue.
     * </p>
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
            throws AmazonServiceException, AmazonClientException {
        Request<SendMessageRequest> request = new SendMessageRequestMarshaller().marshall(sendMessageRequest);
        return invoke(request, new SendMessageResultStaxUnmarshaller());
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
     *           execute the ReceiveMessage service method on AmazonSQS.
     * 
     * @return The response from the ReceiveMessage service method, as
     *         returned by AmazonSQS.
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
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReceiveMessageRequest> request = new ReceiveMessageRequestMarshaller().marshall(receiveMessageRequest);
        return invoke(request, new ReceiveMessageResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The ListQueues action returns a list of your queues.
     * </p>
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
    public ListQueuesResult listQueues() throws AmazonServiceException, AmazonClientException {
        return listQueues(new ListQueuesRequest());
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        // Apply any additional service specific request handlers that need to be run
        if (requestHandlers != null) {
            for (RequestHandler requestHandler : requestHandlers) {
                request = requestHandler.handleRequest(request);
            }
        }

        try {
            signer.sign(request);
        } catch (SignatureException e) {
            throw new AmazonServiceException("Unable to sign request", e);
        }

        HttpRequest httpRequest = convertToHttpRequest(request, HttpMethodName.POST);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(httpRequest, responseHandler, errorResponseHandler);
    }
}
        