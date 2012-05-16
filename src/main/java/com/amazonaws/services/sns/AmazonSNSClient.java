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
package com.amazonaws.services.sns;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.services.sns.model.transform.*;


/**
 * Client for accessing AmazonSNS.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon Simple Notification Service <p>
 * This is the <i>Amazon Simple Notification Service (Amazon SNS) API Reference</i> . This guide provides detailed information about Amazon SNS actions,
 * data types, parameters, and errors. For detailed information about Amazon SNS features and their associated API calls, go to the <a
 * href="http://docs.amazonwebservices.com/sns/latest/gsg/"> Amazon SNS Getting Started Guide </a> .
 * </p>
 * <p>
 * Amazon Simple Notification Service is a web service that enables you to build distributed web-enabled applications. Applications can use Amazon SNS to
 * easily push real-time notification messages to interested subscribers over multiple delivery protocols. For more information about this product go to
 * <a href="http://aws.amazon.com/sns/"> http://aws.amazon.com/sns </a> .
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon Simple Notification Service API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/API_Operations.html"> Actions </a> : An alphabetical list of all Amazon SNS
 * actions.</li>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/API_Types.html"> Data Types </a> : An alphabetical list of all Amazon SNS data
 * types.</li>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/CommonParameters.html"> Common Parameters </a> : Parameters that all Query actions can
 * use.</li>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/CommonErrors.html"> Common Errors </a> : Client and server errors that all actions can
 * return.</li>
 * <li> <a href="http://docs.amazonwebservices.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a> : Itemized regions and endpoints
 * for all AWS products.</li>
 * <li> <a href="http://sns.us-east-1.amazonaws.com/doc/2010-03-31/SimpleNotificationService.wsdl"> WSDL Location </a> :
 * http://sns.us-east-1.amazonaws.com/doc/2010-03-31/SimpleNotificationService.wsdl</li>
 * 
 * </ul>
 */
public class AmazonSNSClient extends AmazonWebServiceClient implements AmazonSNS {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonSNS exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
    
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonSNSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSNS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSNSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }
    
    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSNS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() { 
        exceptionUnmarshallers.add(new AuthorizationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TopicLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("sns.us-east-1.amazonaws.com");

        signer = new QueryStringSigner();
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/sns/request.handlers"));
    }
    
    
    /**
     * <p>
     * The ConfirmSubscription action verifies an endpoint owner's intent to
     * receive messages by validating the token sent to the endpoint by an
     * earlier Subscribe action. If the token is valid, the action creates a
     * new subscription and returns its Amazon Resource Name (ARN). This call
     * requires an AWS signature only when the AuthenticateOnUnsubscribe flag
     * is set to "true".
     * </p>
     *
     * @param confirmSubscriptionRequest Container for the necessary
     *           parameters to execute the ConfirmSubscription service method on
     *           AmazonSNS.
     * 
     * @return The response from the ConfirmSubscription service method, as
     *         returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmSubscriptionResult confirmSubscription(ConfirmSubscriptionRequest confirmSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ConfirmSubscriptionRequest> request = new ConfirmSubscriptionRequestMarshaller().marshall(confirmSubscriptionRequest);
        return invoke(request, new ConfirmSubscriptionResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The GetTopicAttribtues action returns all of the properties of a topic
     * customers have created. Topic properties returned might differ based
     * on the authorization of the user.
     * </p>
     *
     * @param getTopicAttributesRequest Container for the necessary
     *           parameters to execute the GetTopicAttributes service method on
     *           AmazonSNS.
     * 
     * @return The response from the GetTopicAttributes service method, as
     *         returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTopicAttributesResult getTopicAttributes(GetTopicAttributesRequest getTopicAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetTopicAttributesRequest> request = new GetTopicAttributesRequestMarshaller().marshall(getTopicAttributesRequest);
        return invoke(request, new GetTopicAttributesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The Subscribe action prepares to subscribe an endpoint by sending the
     * endpoint a confirmation message. To actually create a subscription,
     * the endpoint owner must call the ConfirmSubscription action with the
     * token from the confirmation message. Confirmation tokens are valid for
     * three days.
     * </p>
     *
     * @param subscribeRequest Container for the necessary parameters to
     *           execute the Subscribe service method on AmazonSNS.
     * 
     * @return The response from the Subscribe service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubscribeResult subscribe(SubscribeRequest subscribeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<SubscribeRequest> request = new SubscribeRequestMarshaller().marshall(subscribeRequest);
        return invoke(request, new SubscribeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The SetTopicAttributes action allows a topic owner to set an attribute
     * of the topic to a new value.
     * </p>
     *
     * @param setTopicAttributesRequest Container for the necessary
     *           parameters to execute the SetTopicAttributes service method on
     *           AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTopicAttributes(SetTopicAttributesRequest setTopicAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<SetTopicAttributesRequest> request = new SetTopicAttributesRequestMarshaller().marshall(setTopicAttributesRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The DeleteTopic action deletes a topic and all its subscriptions.
     * Deleting a topic might prevent some messages previously sent to the
     * topic from being delivered to subscribers. This action is idempotent,
     * so deleting a topic that does not exist will not result in an error.
     * </p>
     *
     * @param deleteTopicRequest Container for the necessary parameters to
     *           execute the DeleteTopic service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTopic(DeleteTopicRequest deleteTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteTopicRequest> request = new DeleteTopicRequestMarshaller().marshall(deleteTopicRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The RemovePermission action removes a statement from a topic's access
     * control policy.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removePermission(RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RemovePermissionRequest> request = new RemovePermissionRequestMarshaller().marshall(removePermissionRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The ListSubscriptions action returns a list of the requester's
     * subscriptions. Each call returns a limited list of subscriptions, up
     * to 100. If there are more subscriptions, a NextToken is also returned.
     * Use the NextToken parameter in a new ListSubscriptions call to get
     * further results.
     * </p>
     *
     * @param listSubscriptionsRequest Container for the necessary parameters
     *           to execute the ListSubscriptions service method on AmazonSNS.
     * 
     * @return The response from the ListSubscriptions service method, as
     *         returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListSubscriptionsRequest> request = new ListSubscriptionsRequestMarshaller().marshall(listSubscriptionsRequest);
        return invoke(request, new ListSubscriptionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The SetSubscriptionAttributes action allows a subscription owner to
     * set an attribute of the topic to a new value.
     * </p>
     *
     * @param setSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the SetSubscriptionAttributes service method on
     *           AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setSubscriptionAttributes(SetSubscriptionAttributesRequest setSubscriptionAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<SetSubscriptionAttributesRequest> request = new SetSubscriptionAttributesRequestMarshaller().marshall(setSubscriptionAttributesRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The AddPermission action adds a statement to a topic's access control
     * policy, granting access for the specified AWS accounts to the
     * specified actions.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addPermission(AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AddPermissionRequest> request = new AddPermissionRequestMarshaller().marshall(addPermissionRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The CreateTopic action creates a topic to which notifications can be
     * published. Users can create at most 25 topics. This action is
     * idempotent, so if the requester already owns a topic with the
     * specified name, that topic's ARN will be returned without creating a
     * new topic.
     * </p>
     *
     * @param createTopicRequest Container for the necessary parameters to
     *           execute the CreateTopic service method on AmazonSNS.
     * 
     * @return The response from the CreateTopic service method, as returned
     *         by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTopicResult createTopic(CreateTopicRequest createTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateTopicRequest> request = new CreateTopicRequestMarshaller().marshall(createTopicRequest);
        return invoke(request, new CreateTopicResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The GetSubscriptionAttribtues action returns all of the properties of
     * a subscription.
     * </p>
     *
     * @param getSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the GetSubscriptionAttributes service method on
     *           AmazonSNS.
     * 
     * @return The response from the GetSubscriptionAttributes service
     *         method, as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSubscriptionAttributesResult getSubscriptionAttributes(GetSubscriptionAttributesRequest getSubscriptionAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetSubscriptionAttributesRequest> request = new GetSubscriptionAttributesRequestMarshaller().marshall(getSubscriptionAttributesRequest);
        return invoke(request, new GetSubscriptionAttributesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The ListTopics action returns a list of the requester's topics. Each
     * call returns a limited list of topics, up to 100. If there are more
     * topics, a NextToken is also returned. Use the NextToken parameter in a
     * new ListTopics call to get further results.
     * </p>
     *
     * @param listTopicsRequest Container for the necessary parameters to
     *           execute the ListTopics service method on AmazonSNS.
     * 
     * @return The response from the ListTopics service method, as returned
     *         by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics(ListTopicsRequest listTopicsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListTopicsRequest> request = new ListTopicsRequestMarshaller().marshall(listTopicsRequest);
        return invoke(request, new ListTopicsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The Unsubscribe action deletes a subscription. If the subscription
     * requires authentication for deletion, only the owner of the
     * subscription or the its topic's owner can unsubscribe, and an AWS
     * signature is required. If the Unsubscribe call does not require
     * authentication and the requester is not the subscription owner, a
     * final cancellation message is delivered to the endpoint, so that the
     * endpoint owner can easily resubscribe to the topic if the Unsubscribe
     * request was unintended.
     * </p>
     *
     * @param unsubscribeRequest Container for the necessary parameters to
     *           execute the Unsubscribe service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void unsubscribe(UnsubscribeRequest unsubscribeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UnsubscribeRequest> request = new UnsubscribeRequestMarshaller().marshall(unsubscribeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The ListSubscriptionsByTopic action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a NextToken
     * is also returned. Use the NextToken parameter in a new
     * ListSubscriptionsByTopic call to get further results.
     * </p>
     *
     * @param listSubscriptionsByTopicRequest Container for the necessary
     *           parameters to execute the ListSubscriptionsByTopic service method on
     *           AmazonSNS.
     * 
     * @return The response from the ListSubscriptionsByTopic service method,
     *         as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListSubscriptionsByTopicRequest> request = new ListSubscriptionsByTopicRequestMarshaller().marshall(listSubscriptionsByTopicRequest);
        return invoke(request, new ListSubscriptionsByTopicResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The Publish action sends a message to all of a topic's subscribed
     * endpoints. When a messageId is returned, the message has been saved
     * and Amazon SNS will attempt to deliver it to the topic's subscribers
     * shortly. The format of the outgoing message to each subscribed
     * endpoint depends on the notification protocol selected.
     * </p>
     *
     * @param publishRequest Container for the necessary parameters to
     *           execute the Publish service method on AmazonSNS.
     * 
     * @return The response from the Publish service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PublishResult publish(PublishRequest publishRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<PublishRequest> request = new PublishRequestMarshaller().marshall(publishRequest);
        return invoke(request, new PublishResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The ListSubscriptions action returns a list of the requester's
     * subscriptions. Each call returns a limited list of subscriptions, up
     * to 100. If there are more subscriptions, a NextToken is also returned.
     * Use the NextToken parameter in a new ListSubscriptions call to get
     * further results.
     * </p>
     * 
     * @return The response from the ListSubscriptions service method, as
     *         returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions() throws AmazonServiceException, AmazonClientException {
        return listSubscriptions(new ListSubscriptionsRequest());
    }
    
    /**
     * <p>
     * The ListTopics action returns a list of the requester's topics. Each
     * call returns a limited list of topics, up to 100. If there are more
     * topics, a NextToken is also returned. Use the NextToken parameter in a
     * new ListTopics call to get further results.
     * </p>
     * 
     * @return The response from the ListTopics service method, as returned
     *         by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics() throws AmazonServiceException, AmazonClientException {
        return listTopics(new ListTopicsRequest());
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

        AWSCredentials credentials = awsCredentialsProvider.getCredentials(); 
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        