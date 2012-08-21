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

import com.amazonaws.*;
import com.amazonaws.services.sns.model.*;


/**
 * Interface for accessing AmazonSNS.
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
public interface AmazonSNS {

    /**
     * Overrides the default endpoint for this client ("https://sns.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sns.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://sns.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "sns.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://sns.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
    public ListSubscriptionsResult listSubscriptions() throws AmazonServiceException, AmazonClientException;
    
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
    public ListTopicsResult listTopics() throws AmazonServiceException, AmazonClientException;
    
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
        