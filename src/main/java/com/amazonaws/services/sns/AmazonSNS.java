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
package com.amazonaws.services.sns;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.sns.model.*;

/**
 * Interface for accessing AmazonSNS.
 * Amazon Simple Notification Service <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested subscribers over multiple delivery protocols. For more information about this
 * product see <a href="http://aws.amazon.com/sns/"> http://aws.amazon.com/sns </a> . For detailed information about Amazon SNS features and their
 * associated API calls, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/"> Amazon SNS Developer Guide </a> .
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain functionality that automatically
 * takes care of tasks such as: cryptographically signing your service requests, retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/"> Tools for Amazon Web Services </a> .
 * </p>
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
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
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
     * An alternative to {@link AmazonSNS#setEndpoint(String)}, sets the
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
     * <p>
     * The <code>ConfirmSubscription</code> action verifies an endpoint
     * owner's intent to receive messages by validating the token sent to the
     * endpoint by an earlier <code>Subscribe</code> action. If the token is
     * valid, the action creates a new subscription and returns its Amazon
     * Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
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
     * The <code>CreatePlatformApplication</code> action creates a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM, to which devices and mobile apps may
     * register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code>
     * action. The PlatformPrincipal is received from the notification
     * service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL
     * certificate". For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is "private key". For GCM, PlatformCredential is
     * "API key". For ADM, PlatformCredential is "client secret". The
     * PlatformApplicationArn that is returned when using
     * <code>CreatePlatformApplication</code> is then used as an attribute
     * for the <code>CreatePlatformEndpoint</code> action. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformApplicationRequest Container for the necessary
     *           parameters to execute the CreatePlatformApplication service method on
     *           AmazonSNS.
     * 
     * @return The response from the CreatePlatformApplication service
     *         method, as returned by AmazonSNS.
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
    public CreatePlatformApplicationResult createPlatformApplication(CreatePlatformApplicationRequest createPlatformApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>GetTopicAttributes</code> action returns all of the
     * properties of a topic. Topic properties returned might differ based on
     * the authorization of the user.
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
     * The <code>Subscribe</code> action prepares to subscribe an endpoint by
     * sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the
     * <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
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
     * The <code>DeleteEndpoint</code> action, which is idempotent, deletes
     * the endpoint from SNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deleteEndpointRequest Container for the necessary parameters to
     *           execute the DeleteEndpoint service method on AmazonSNS.
     * 
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
    public void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>SetTopicAttributes</code> action allows a topic owner to set
     * an attribute of the topic to a new value.
     * </p>
     *
     * @param setTopicAttributesRequest Container for the necessary
     *           parameters to execute the SetTopicAttributes service method on
     *           AmazonSNS.
     * 
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
     * The <code>RemovePermission</code> action removes a statement from a
     * topic's access control policy.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission service method on AmazonSNS.
     * 
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
     * The <code>GetEndpointAttributes</code> retrieves the endpoint
     * attributes for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getEndpointAttributesRequest Container for the necessary
     *           parameters to execute the GetEndpointAttributes service method on
     *           AmazonSNS.
     * 
     * @return The response from the GetEndpointAttributes service method, as
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
    public GetEndpointAttributesResult getEndpointAttributes(GetEndpointAttributesRequest getEndpointAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
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
     * The <code>CreatePlatformEndpoint</code> creates an endpoint for a
     * device and mobile app on one of the supported push notification
     * services, such as GCM and APNS. <code>CreatePlatformEndpoint</code>
     * requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code> . The EndpointArn that is
     * returned when using <code>CreatePlatformEndpoint</code> can then be
     * used by the <code>Publish</code> action to send a message to a mobile
     * app or by the <code>Subscribe</code> action for subscription to a
     * topic. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformEndpointRequest Container for the necessary
     *           parameters to execute the CreatePlatformEndpoint service method on
     *           AmazonSNS.
     * 
     * @return The response from the CreatePlatformEndpoint service method,
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
    public CreatePlatformEndpointResult createPlatformEndpoint(CreatePlatformEndpointRequest createPlatformEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>SetSubscriptionAttributes</code> action allows a
     * subscription owner to set an attribute of the topic to a new value.
     * </p>
     *
     * @param setSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the SetSubscriptionAttributes service method on
     *           AmazonSNS.
     * 
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
     * The <code>CreateTopic</code> action creates a topic to which
     * notifications can be published. Users can create at most 100 topics.
     * For more information, see <a href="http://aws.amazon.com/sns/">
     * http://aws.amazon.com/sns </a> . This action is idempotent, so if the
     * requester already owns a topic with the specified name, that topic's
     * ARN is returned without creating a new topic.
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
     * The <code>GetSubscriptionAttribtues</code> action returns all of the
     * properties of a subscription.
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
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
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
     * The <code>DeletePlatformApplication</code> action deletes a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deletePlatformApplicationRequest Container for the necessary
     *           parameters to execute the DeletePlatformApplication service method on
     *           AmazonSNS.
     * 
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
    public void deletePlatformApplication(DeletePlatformApplicationRequest deletePlatformApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ListPlatformApplications</code> action lists the platform
     * application objects for the supported push notification services, such
     * as APNS and GCM. The results for <code>ListPlatformApplications</code>
     * are paginated and return a limited list of applications, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string
     * received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listPlatformApplicationsRequest Container for the necessary
     *           parameters to execute the ListPlatformApplications service method on
     *           AmazonSNS.
     * 
     * @return The response from the ListPlatformApplications service method,
     *         as returned by AmazonSNS.
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
    public ListPlatformApplicationsResult listPlatformApplications(ListPlatformApplicationsRequest listPlatformApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>SetEndpointAttributes</code> action sets the attributes for
     * an endpoint for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setEndpointAttributesRequest Container for the necessary
     *           parameters to execute the SetEndpointAttributes service method on
     *           AmazonSNS.
     * 
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
    public void setEndpointAttributes(SetEndpointAttributesRequest setEndpointAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>Unsubscribe</code> action deletes a subscription. If the
     * subscription requires authentication for deletion, only the owner of
     * the subscription or the topic's owner can unsubscribe, and an AWS
     * signature is required. If the <code>Unsubscribe</code> call does not
     * require authentication and the requester is not the subscription
     * owner, a final cancellation message is delivered to the endpoint, so
     * that the endpoint owner can easily resubscribe to the topic if the
     * <code>Unsubscribe</code> request was unintended.
     * </p>
     *
     * @param unsubscribeRequest Container for the necessary parameters to
     *           execute the Unsubscribe service method on AmazonSNS.
     * 
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
     * The <code>DeleteTopic</code> action deletes a topic and all its
     * subscriptions. Deleting a topic might prevent some messages previously
     * sent to the topic from being delivered to subscribers. This action is
     * idempotent, so deleting a topic that does not exist does not result in
     * an error.
     * </p>
     *
     * @param deleteTopicRequest Container for the necessary parameters to
     *           execute the DeleteTopic service method on AmazonSNS.
     * 
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
     * The <code>GetPlatformApplicationAttributes</code> action retrieves the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the GetPlatformApplicationAttributes
     *           service method on AmazonSNS.
     * 
     * @return The response from the GetPlatformApplicationAttributes service
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
    public GetPlatformApplicationAttributesResult getPlatformApplicationAttributes(GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>SetPlatformApplicationAttributes</code> action sets the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the SetPlatformApplicationAttributes
     *           service method on AmazonSNS.
     * 
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
    public void setPlatformApplicationAttributes(SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>AddPermission</code> action adds a statement to a topic's
     * access control policy, granting access for the specified AWS accounts
     * to the specified actions.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission service method on AmazonSNS.
     * 
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
     * The <code>ListEndpointsByPlatformApplication</code> action lists the
     * endpoints and endpoint attributes for devices in a supported push
     * notification service, such as GCM and APNS. The results for
     * <code>ListEndpointsByPlatformApplication</code> are paginated and
     * return a limited list of endpoints, up to 100. If additional records
     * are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the
     * NextToken string received from the previous call. When there are no
     * more records to return, NextToken will be null. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listEndpointsByPlatformApplicationRequest Container for the
     *           necessary parameters to execute the ListEndpointsByPlatformApplication
     *           service method on AmazonSNS.
     * 
     * @return The response from the ListEndpointsByPlatformApplication
     *         service method, as returned by AmazonSNS.
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
    public ListEndpointsByPlatformApplicationResult listEndpointsByPlatformApplication(ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ListSubscriptionsByTopic</code> action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
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
     * The <code>Publish</code> action sends a message to all of a topic's
     * subscribed endpoints. When a <code>messageId</code> is returned, the
     * message has been saved and Amazon SNS will attempt to deliver it to
     * the topic's subscribers shortly. The format of the outgoing message to
     * each subscribed endpoint depends on the notification protocol
     * selected.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone,
     * you must specify the EndpointArn. The EndpointArn is returned when
     * making a call with the <code>CreatePlatformEndpoint</code> action. The
     * second example below shows a request and response for publishing to a
     * mobile endpoint.
     * </p>
     *
     * @param publishRequest Container for the necessary parameters to
     *           execute the Publish service method on AmazonSNS.
     * 
     * @return The response from the Publish service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws PlatformApplicationDisabledException
     * @throws EndpointDisabledException
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
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
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
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
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
     * <p>
     * The <code>ListPlatformApplications</code> action lists the platform
     * application objects for the supported push notification services, such
     * as APNS and GCM. The results for <code>ListPlatformApplications</code>
     * are paginated and return a limited list of applications, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string
     * received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     * 
     * @return The response from the ListPlatformApplications service method,
     *         as returned by AmazonSNS.
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
    public ListPlatformApplicationsResult listPlatformApplications() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>ConfirmSubscription</code> action verifies an endpoint
     * owner's intent to receive messages by validating the token sent to the
     * endpoint by an earlier <code>Subscribe</code> action. If the token is
     * valid, the action creates a new subscription and returns its Amazon
     * Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param topicArn The ARN of the topic for which you wish to confirm a
     * subscription.
     * @param token Short-lived token sent to an endpoint during the
     * <code>Subscribe</code> action.
     * @param authenticateOnUnsubscribe Disallows unauthenticated
     * unsubscribes of the subscription. If the value of this parameter is
     * <code>true</code> and the request has an AWS signature, then only the
     * topic owner and the subscription owner can unsubscribe the endpoint.
     * The unsubscribe action requires AWS authentication.
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
    public ConfirmSubscriptionResult confirmSubscription(String topicArn, String token, String authenticateOnUnsubscribe)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>ConfirmSubscription</code> action verifies an endpoint
     * owner's intent to receive messages by validating the token sent to the
     * endpoint by an earlier <code>Subscribe</code> action. If the token is
     * valid, the action creates a new subscription and returns its Amazon
     * Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param topicArn The ARN of the topic for which you wish to confirm a
     * subscription.
     * @param token Short-lived token sent to an endpoint during the
     * <code>Subscribe</code> action.
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
    public ConfirmSubscriptionResult confirmSubscription(String topicArn, String token)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>GetTopicAttributes</code> action returns all of the
     * properties of a topic. Topic properties returned might differ based on
     * the authorization of the user.
     * </p>
     * 
     * @param topicArn The ARN of the topic whose properties you want to get.
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
    public GetTopicAttributesResult getTopicAttributes(String topicArn)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>Subscribe</code> action prepares to subscribe an endpoint by
     * sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the
     * <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     * 
     * @param topicArn The ARN of the topic you want to subscribe to.
     * @param protocol The protocol you want to use. Supported protocols
     * include: <ul> <li><code>http</code> -- delivery of JSON-encoded
     * message via HTTP POST</li> <li><code>https</code> -- delivery of
     * JSON-encoded message via HTTPS POST</li> <li><code>email</code> --
     * delivery of message via SMTP</li> <li><code>email-json</code> --
     * delivery of JSON-encoded message via SMTP</li> <li><code>sms</code> --
     * delivery of message via SMS</li> <li><code>sqs</code> -- delivery of
     * JSON-encoded message to an Amazon SQS queue</li>
     * <li><code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.</li> </ul>
     * @param endpoint The endpoint that you want to receive notifications.
     * Endpoints vary by protocol: <ul> <li>For the <code>http</code>
     * protocol, the endpoint is an URL beginning with "http://"</li> <li>For
     * the <code>https</code> protocol, the endpoint is a URL beginning with
     * "https://"</li> <li>For the <code>email</code> protocol, the endpoint
     * is an email address</li> <li>For the <code>email-json</code> protocol,
     * the endpoint is an email address</li> <li>For the <code>sms</code>
     * protocol, the endpoint is a phone number of an SMS-enabled device</li>
     * <li>For the <code>sqs</code> protocol, the endpoint is the ARN of an
     * Amazon SQS queue</li> <li>For the <code>application</code> protocol,
     * the endpoint is the EndpointArn of a mobile app and device.</li> </ul>
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
    public SubscribeResult subscribe(String topicArn, String protocol, String endpoint)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>SetTopicAttributes</code> action allows a topic owner to set
     * an attribute of the topic to a new value.
     * </p>
     * 
     * @param topicArn The ARN of the topic to modify.
     * @param attributeName The name of the attribute you want to set. Only a
     * subset of the topic's attributes are mutable. <p>Valid values:
     * <code>Policy</code> | <code>DisplayName</code> |
     * <code>DeliveryPolicy</code>
     * @param attributeValue The new value for the attribute.
     * 
     * @return The response from the SetTopicAttributes service method, as
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
    public void setTopicAttributes(String topicArn, String attributeName, String attributeValue)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>RemovePermission</code> action removes a statement from a
     * topic's access control policy.
     * </p>
     * 
     * @param topicArn The ARN of the topic whose access control policy you
     * wish to modify.
     * @param label The unique label of the statement you want to remove.
     * 
     * @return The response from the RemovePermission service method, as
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
    public void removePermission(String topicArn, String label)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
     * </p>
     * 
     * @param nextToken Token returned by the previous
     * <code>ListSubscriptions</code> request.
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
    public ListSubscriptionsResult listSubscriptions(String nextToken)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>SetSubscriptionAttributes</code> action allows a
     * subscription owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param subscriptionArn The ARN of the subscription to modify.
     * @param attributeName The name of the attribute you want to set. Only a
     * subset of the subscriptions attributes are mutable. <p>Valid values:
     * <code>DeliveryPolicy</code>
     * @param attributeValue The new value for the attribute in JSON format.
     * 
     * @return The response from the SetSubscriptionAttributes service
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
    public void setSubscriptionAttributes(String subscriptionArn, String attributeName, String attributeValue)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>CreateTopic</code> action creates a topic to which
     * notifications can be published. Users can create at most 100 topics.
     * For more information, see <a href="http://aws.amazon.com/sns/">
     * http://aws.amazon.com/sns </a> . This action is idempotent, so if the
     * requester already owns a topic with the specified name, that topic's
     * ARN is returned without creating a new topic.
     * </p>
     * 
     * @param name The name of the topic you want to create. <p>Constraints:
     * Topic names must be made up of only uppercase and lowercase ASCII
     * letters, numbers, underscores, and hyphens, and must be between 1 and
     * 256 characters long.
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
    public CreateTopicResult createTopic(String name)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>GetSubscriptionAttribtues</code> action returns all of the
     * properties of a subscription.
     * </p>
     * 
     * @param subscriptionArn The ARN of the subscription whose properties
     * you want to get.
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
    public GetSubscriptionAttributesResult getSubscriptionAttributes(String subscriptionArn)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
     * </p>
     * 
     * @param nextToken Token returned by the previous
     * <code>ListTopics</code> request.
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
    public ListTopicsResult listTopics(String nextToken)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>Unsubscribe</code> action deletes a subscription. If the
     * subscription requires authentication for deletion, only the owner of
     * the subscription or the topic's owner can unsubscribe, and an AWS
     * signature is required. If the <code>Unsubscribe</code> call does not
     * require authentication and the requester is not the subscription
     * owner, a final cancellation message is delivered to the endpoint, so
     * that the endpoint owner can easily resubscribe to the topic if the
     * <code>Unsubscribe</code> request was unintended.
     * </p>
     * 
     * @param subscriptionArn The ARN of the subscription to be deleted.
     * 
     * @return The response from the Unsubscribe service method, as returned
     *         by AmazonSNS.
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
    public void unsubscribe(String subscriptionArn)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>DeleteTopic</code> action deletes a topic and all its
     * subscriptions. Deleting a topic might prevent some messages previously
     * sent to the topic from being delivered to subscribers. This action is
     * idempotent, so deleting a topic that does not exist does not result in
     * an error.
     * </p>
     * 
     * @param topicArn The ARN of the topic you want to delete. <examples>
     * <queryrequest> http://sns.us-east-1.amazonaws.com/
     * ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     * &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     * &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     * Key ID)
     * &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     * </queryrequest> <queryresponse> <DeleteTopicResponse
     * xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     * <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     * </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     * </examples>
     * 
     * @return The response from the DeleteTopic service method, as returned
     *         by AmazonSNS.
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
    public void deleteTopic(String topicArn)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>AddPermission</code> action adds a statement to a topic's
     * access control policy, granting access for the specified AWS accounts
     * to the specified actions.
     * </p>
     * 
     * @param topicArn The ARN of the topic whose access control policy you
     * wish to modify.
     * @param label A unique identifier for the new policy statement.
     * @param aWSAccountIds The AWS account IDs of the users (principals) who
     * will be given access to the specified actions. The users must have AWS
     * accounts, but do not need to be signed up for this service. <!--For
     * information about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * @param actionNames The action you want to allow for the specified
     * principal(s). <p>Valid values: any Amazon SNS action name.
     * 
     * @return The response from the AddPermission service method, as
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
    public void addPermission(String topicArn, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actionNames)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>ListSubscriptionsByTopic</code> action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * 
     * @param topicArn The ARN of the topic for which you wish to find
     * subscriptions.
     * @param nextToken Token returned by the previous
     * <code>ListSubscriptionsByTopic</code> request.
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
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(String topicArn, String nextToken)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>ListSubscriptionsByTopic</code> action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * 
     * @param topicArn The ARN of the topic for which you wish to find
     * subscriptions.
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
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(String topicArn)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>Publish</code> action sends a message to all of a topic's
     * subscribed endpoints. When a <code>messageId</code> is returned, the
     * message has been saved and Amazon SNS will attempt to deliver it to
     * the topic's subscribers shortly. The format of the outgoing message to
     * each subscribed endpoint depends on the notification protocol
     * selected.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone,
     * you must specify the EndpointArn. The EndpointArn is returned when
     * making a call with the <code>CreatePlatformEndpoint</code> action. The
     * second example below shows a request and response for publishing to a
     * mobile endpoint.
     * </p>
     * 
     * @param topicArn The topic you want to publish to.
     * @param message The message you want to send to the topic. <p>If you
     * want to send the same message to all transport protocols, include the
     * text of the message as a String value. <p>If you want to send
     * different messages for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     * 
     * @return The response from the Publish service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws PlatformApplicationDisabledException
     * @throws EndpointDisabledException
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
    public PublishResult publish(String topicArn, String message)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <code>Publish</code> action sends a message to all of a topic's
     * subscribed endpoints. When a <code>messageId</code> is returned, the
     * message has been saved and Amazon SNS will attempt to deliver it to
     * the topic's subscribers shortly. The format of the outgoing message to
     * each subscribed endpoint depends on the notification protocol
     * selected.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone,
     * you must specify the EndpointArn. The EndpointArn is returned when
     * making a call with the <code>CreatePlatformEndpoint</code> action. The
     * second example below shows a request and response for publishing to a
     * mobile endpoint.
     * </p>
     * 
     * @param topicArn The topic you want to publish to.
     * @param message The message you want to send to the topic. <p>If you
     * want to send the same message to all transport protocols, include the
     * text of the message as a String value. <p>If you want to send
     * different messages for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     * @param subject Optional parameter to be used as the "Subject" line
     * when the message is delivered to email endpoints. This field will also
     * be included, if present, in the standard JSON messages delivered to
     * other endpoints. <p>Constraints: Subjects must be ASCII text that
     * begins with a letter, number, or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100
     * characters long.
     * 
     * @return The response from the Publish service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws PlatformApplicationDisabledException
     * @throws EndpointDisabledException
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
    public PublishResult publish(String topicArn, String message, String subject)
             throws AmazonServiceException, AmazonClientException;
    
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
        