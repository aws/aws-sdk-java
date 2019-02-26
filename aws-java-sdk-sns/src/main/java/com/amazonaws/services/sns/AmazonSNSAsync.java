/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns;

import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;

/**
 * Interface for accessing Amazon SNS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sns.AbstractAmazonSNSAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled
 * applications. Applications can use Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this product see <a
 * href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. For detailed information about Amazon SNS features
 * and their associated API calls, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain
 * functionality that automatically takes care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available SDKs, go to <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSNSAsync extends AmazonSNS {

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the
     * specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AmazonSNSAsync.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the
     * specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AmazonSNSAsyncHandler.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler);

    /**
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames);

    /**
     * Simplified method form for invoking the AddPermission operation with an AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames, com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler);

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your
     * account. You cannot send SMS messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest
     *        The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
     * @return A Java Future containing the result of the CheckIfPhoneNumberIsOptedOut operation returned by the
     *         service.
     * @sample AmazonSNSAsync.CheckIfPhoneNumberIsOptedOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CheckIfPhoneNumberIsOptedOut"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(
            CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest);

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your
     * account. You cannot send SMS messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest
     *        The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckIfPhoneNumberIsOptedOut operation returned by the
     *         service.
     * @sample AmazonSNSAsyncHandler.CheckIfPhoneNumberIsOptedOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CheckIfPhoneNumberIsOptedOut"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(
            CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest,
            com.amazonaws.handlers.AsyncHandler<CheckIfPhoneNumberIsOptedOutRequest, CheckIfPhoneNumberIsOptedOutResult> asyncHandler);

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an
     * earlier <code>Subscribe</code> action. If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest
     *        Input for ConfirmSubscription action.
     * @return A Java Future containing the result of the ConfirmSubscription operation returned by the service.
     * @sample AmazonSNSAsync.ConfirmSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ConfirmSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(ConfirmSubscriptionRequest confirmSubscriptionRequest);

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an
     * earlier <code>Subscribe</code> action. If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest
     *        Input for ConfirmSubscription action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmSubscription operation returned by the service.
     * @sample AmazonSNSAsyncHandler.ConfirmSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ConfirmSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(ConfirmSubscriptionRequest confirmSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler);

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token, String authenticateOnUnsubscribe);

    /**
     * Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token, String authenticateOnUnsubscribe,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler);

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token);

    /**
     * Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM,
     * to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code> action. The PlatformPrincipal is received from
     * the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM,
     * PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS,
     * PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key".
     * </p>
     * <p>
     * For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential
     * is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when
     * using <code>CreatePlatformApplication</code> is then used as an attribute for the
     * <code>CreatePlatformEndpoint</code> action. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of
     * the supported push notification services, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-apns.html">Getting Started with Apple Push
     * Notification Service</a>, <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-adm.html">Getting Started
     * with Amazon Device Messaging</a>, <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-baidu.html">Getting Started with Baidu Cloud Push</a>,
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-gcm.html">Getting Started with Google Cloud
     * Messaging for Android</a>, <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-mpns.html">Getting
     * Started with MPNS</a>, or <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-wns.html">Getting Started
     * with WNS</a>.
     * </p>
     * 
     * @param createPlatformApplicationRequest
     *        Input for CreatePlatformApplication action.
     * @return A Java Future containing the result of the CreatePlatformApplication operation returned by the service.
     * @sample AmazonSNSAsync.CreatePlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            CreatePlatformApplicationRequest createPlatformApplicationRequest);

    /**
     * <p>
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM,
     * to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code> action. The PlatformPrincipal is received from
     * the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM,
     * PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS,
     * PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key".
     * </p>
     * <p>
     * For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential
     * is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when
     * using <code>CreatePlatformApplication</code> is then used as an attribute for the
     * <code>CreatePlatformEndpoint</code> action. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of
     * the supported push notification services, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-apns.html">Getting Started with Apple Push
     * Notification Service</a>, <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-adm.html">Getting Started
     * with Amazon Device Messaging</a>, <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-baidu.html">Getting Started with Baidu Cloud Push</a>,
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-gcm.html">Getting Started with Google Cloud
     * Messaging for Android</a>, <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-mpns.html">Getting
     * Started with MPNS</a>, or <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-wns.html">Getting Started
     * with WNS</a>.
     * </p>
     * 
     * @param createPlatformApplicationRequest
     *        Input for CreatePlatformApplication action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlatformApplication operation returned by the service.
     * @sample AmazonSNSAsyncHandler.CreatePlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            CreatePlatformApplicationRequest createPlatformApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM
     * and APNS. <code>CreatePlatformEndpoint</code> requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code>. The EndpointArn that is returned when using
     * <code>CreatePlatformEndpoint</code> can then be used by the <code>Publish</code> action to send a message to a
     * mobile app or by the <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the requester already owns an endpoint with the
     * same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile
     * Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes must be provided: ChannelId and UserId.
     * The token field must also contain the ChannelId. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html">Creating an Amazon SNS Endpoint
     * for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest
     *        Input for CreatePlatformEndpoint action.
     * @return A Java Future containing the result of the CreatePlatformEndpoint operation returned by the service.
     * @sample AmazonSNSAsync.CreatePlatformEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(CreatePlatformEndpointRequest createPlatformEndpointRequest);

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM
     * and APNS. <code>CreatePlatformEndpoint</code> requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code>. The EndpointArn that is returned when using
     * <code>CreatePlatformEndpoint</code> can then be used by the <code>Publish</code> action to send a message to a
     * mobile app or by the <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the requester already owns an endpoint with the
     * same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile
     * Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes must be provided: ChannelId and UserId.
     * The token field must also contain the ChannelId. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html">Creating an Amazon SNS Endpoint
     * for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest
     *        Input for CreatePlatformEndpoint action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlatformEndpoint operation returned by the service.
     * @sample AmazonSNSAsyncHandler.CreatePlatformEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(CreatePlatformEndpointRequest createPlatformEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more
     * information, see <a href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. This action is idempotent,
     * so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a
     * new topic.
     * </p>
     * 
     * @param createTopicRequest
     *        Input for CreateTopic action.
     * @return A Java Future containing the result of the CreateTopic operation returned by the service.
     * @sample AmazonSNSAsync.CreateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest createTopicRequest);

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more
     * information, see <a href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. This action is idempotent,
     * so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a
     * new topic.
     * </p>
     * 
     * @param createTopicRequest
     *        Input for CreateTopic action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTopic operation returned by the service.
     * @sample AmazonSNSAsyncHandler.CreateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest createTopicRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateTopic operation.
     *
     * @see #createTopicAsync(CreateTopicRequest)
     */
    java.util.concurrent.Future<CreateTopicResult> createTopicAsync(String name);

    /**
     * Simplified method form for invoking the CreateTopic operation with an AsyncHandler.
     *
     * @see #createTopicAsync(CreateTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateTopicResult> createTopicAsync(String name,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler);

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile
     * Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from
     * the topic.
     * </p>
     * 
     * @param deleteEndpointRequest
     *        Input for DeleteEndpoint action.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSNSAsync.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile
     * Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from
     * the topic.
     * </p>
     * 
     * @param deleteEndpointRequest
     *        Input for DeleteEndpoint action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSNSAsyncHandler.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM.
     * For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS
     * Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest
     *        Input for DeletePlatformApplication action.
     * @return A Java Future containing the result of the DeletePlatformApplication operation returned by the service.
     * @sample AmazonSNSAsync.DeletePlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeletePlatformApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlatformApplicationResult> deletePlatformApplicationAsync(
            DeletePlatformApplicationRequest deletePlatformApplicationRequest);

    /**
     * <p>
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM.
     * For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS
     * Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest
     *        Input for DeletePlatformApplication action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlatformApplication operation returned by the service.
     * @sample AmazonSNSAsyncHandler.DeletePlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeletePlatformApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlatformApplicationResult> deletePlatformApplicationAsync(
            DeletePlatformApplicationRequest deletePlatformApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlatformApplicationRequest, DeletePlatformApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the
     * topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist
     * does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @return A Java Future containing the result of the DeleteTopic operation returned by the service.
     * @sample AmazonSNSAsync.DeleteTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest deleteTopicRequest);

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the
     * topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist
     * does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTopic operation returned by the service.
     * @sample AmazonSNSAsyncHandler.DeleteTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest deleteTopicRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteTopic operation.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest)
     */
    java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(String topicArn);

    /**
     * Simplified method form for invoking the DeleteTopic operation with an AsyncHandler.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler);

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM
     * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest
     *        Input for GetEndpointAttributes action.
     * @return A Java Future containing the result of the GetEndpointAttributes operation returned by the service.
     * @sample AmazonSNSAsync.GetEndpointAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetEndpointAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(GetEndpointAttributesRequest getEndpointAttributesRequest);

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM
     * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest
     *        Input for GetEndpointAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEndpointAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.GetEndpointAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetEndpointAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(GetEndpointAttributesRequest getEndpointAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the supported push notification services, such as
     * APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest
     *        Input for GetPlatformApplicationAttributes action.
     * @return A Java Future containing the result of the GetPlatformApplicationAttributes operation returned by the
     *         service.
     * @sample AmazonSNSAsync.GetPlatformApplicationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetPlatformApplicationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest);

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the supported push notification services, such as
     * APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest
     *        Input for GetPlatformApplicationAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlatformApplicationAttributes operation returned by the
     *         service.
     * @sample AmazonSNSAsyncHandler.GetPlatformApplicationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetPlatformApplicationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns the settings for sending SMS messages from your account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest
     *        The input for the <code>GetSMSAttributes</code> request.
     * @return A Java Future containing the result of the GetSMSAttributes operation returned by the service.
     * @sample AmazonSNSAsync.GetSMSAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSMSAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSMSAttributesResult> getSMSAttributesAsync(GetSMSAttributesRequest getSMSAttributesRequest);

    /**
     * <p>
     * Returns the settings for sending SMS messages from your account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest
     *        The input for the <code>GetSMSAttributes</code> request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSMSAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.GetSMSAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSMSAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSMSAttributesResult> getSMSAttributesAsync(GetSMSAttributesRequest getSMSAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSMSAttributesRequest, GetSMSAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest
     *        Input for GetSubscriptionAttributes.
     * @return A Java Future containing the result of the GetSubscriptionAttributes operation returned by the service.
     * @sample AmazonSNSAsync.GetSubscriptionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSubscriptionAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            GetSubscriptionAttributesRequest getSubscriptionAttributesRequest);

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest
     *        Input for GetSubscriptionAttributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.GetSubscriptionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSubscriptionAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            GetSubscriptionAttributesRequest getSubscriptionAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes operation.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest)
     */
    java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(String subscriptionArn);

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes operation with an AsyncHandler.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of
     * the user.
     * </p>
     * 
     * @param getTopicAttributesRequest
     *        Input for GetTopicAttributes action.
     * @return A Java Future containing the result of the GetTopicAttributes operation returned by the service.
     * @sample AmazonSNSAsync.GetTopicAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetTopicAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(GetTopicAttributesRequest getTopicAttributesRequest);

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of
     * the user.
     * </p>
     * 
     * @param getTopicAttributesRequest
     *        Input for GetTopicAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTopicAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.GetTopicAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetTopicAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(GetTopicAttributesRequest getTopicAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetTopicAttributes operation.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest)
     */
    java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(String topicArn);

    /**
     * Simplified method form for invoking the GetTopicAttributes operation with an AsyncHandler.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler);

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are paginated and return a limited list of
     * endpoints, up to 100. If additional records are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call <code>ListEndpointsByPlatformApplication</code> again using
     * the NextToken string received from the previous call. When there are no more records to return, NextToken will be
     * null. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest
     *        Input for ListEndpointsByPlatformApplication action.
     * @return A Java Future containing the result of the ListEndpointsByPlatformApplication operation returned by the
     *         service.
     * @sample AmazonSNSAsync.ListEndpointsByPlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListEndpointsByPlatformApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest);

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are paginated and return a limited list of
     * endpoints, up to 100. If additional records are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call <code>ListEndpointsByPlatformApplication</code> again using
     * the NextToken string received from the previous call. When there are no more records to return, NextToken will be
     * null. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest
     *        Input for ListEndpointsByPlatformApplication action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpointsByPlatformApplication operation returned by the
     *         service.
     * @sample AmazonSNSAsyncHandler.ListEndpointsByPlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListEndpointsByPlatformApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and each page returns up to 100 phone
     * numbers. If additional phone numbers are available after the first page of results, then a <code>NextToken</code>
     * string will be returned. To receive the next page, you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest
     *        The input for the <code>ListPhoneNumbersOptedOut</code> action.
     * @return A Java Future containing the result of the ListPhoneNumbersOptedOut operation returned by the service.
     * @sample AmazonSNSAsync.ListPhoneNumbersOptedOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPhoneNumbersOptedOut" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest);

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and each page returns up to 100 phone
     * numbers. If additional phone numbers are available after the first page of results, then a <code>NextToken</code>
     * string will be returned. To receive the next page, you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest
     *        The input for the <code>ListPhoneNumbersOptedOut</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumbersOptedOut operation returned by the service.
     * @sample AmazonSNSAsyncHandler.ListPhoneNumbersOptedOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPhoneNumbersOptedOut" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersOptedOutRequest, ListPhoneNumbersOptedOutResult> asyncHandler);

    /**
     * <p>
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The
     * results for <code>ListPlatformApplications</code> are paginated and return a limited list of applications, up to
     * 100. If additional records are available after the first page results, then a NextToken string will be returned.
     * To receive the next page, you call <code>ListPlatformApplications</code> using the NextToken string received from
     * the previous call. When there are no more records to return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest
     *        Input for ListPlatformApplications action.
     * @return A Java Future containing the result of the ListPlatformApplications operation returned by the service.
     * @sample AmazonSNSAsync.ListPlatformApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPlatformApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(ListPlatformApplicationsRequest listPlatformApplicationsRequest);

    /**
     * <p>
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The
     * results for <code>ListPlatformApplications</code> are paginated and return a limited list of applications, up to
     * 100. If additional records are available after the first page results, then a NextToken string will be returned.
     * To receive the next page, you call <code>ListPlatformApplications</code> using the NextToken string received from
     * the previous call. When there are no more records to return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest
     *        Input for ListPlatformApplications action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlatformApplications operation returned by the service.
     * @sample AmazonSNSAsyncHandler.ListPlatformApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPlatformApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(ListPlatformApplicationsRequest listPlatformApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPlatformApplications operation.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest)
     */
    java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync();

    /**
     * Simplified method form for invoking the ListPlatformApplications operation with an AsyncHandler.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If
     * there are more subscriptions, a <code>NextToken</code> is also returned. Use the <code>NextToken</code> parameter
     * in a new <code>ListSubscriptions</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest
     *        Input for ListSubscriptions action.
     * @return A Java Future containing the result of the ListSubscriptions operation returned by the service.
     * @sample AmazonSNSAsync.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest listSubscriptionsRequest);

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If
     * there are more subscriptions, a <code>NextToken</code> is also returned. Use the <code>NextToken</code> parameter
     * in a new <code>ListSubscriptions</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest
     *        Input for ListSubscriptions action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptions operation returned by the service.
     * @sample AmazonSNSAsyncHandler.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest listSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync();

    /**
     * Simplified method form for invoking the ListSubscriptions operation with an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(String nextToken);

    /**
     * Simplified method form for invoking the ListSubscriptions operation with an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to
     * 100. If there are more subscriptions, a <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest
     *        Input for ListSubscriptionsByTopic action.
     * @return A Java Future containing the result of the ListSubscriptionsByTopic operation returned by the service.
     * @sample AmazonSNSAsync.ListSubscriptionsByTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptionsByTopic" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest);

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to
     * 100. If there are more subscriptions, a <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest
     *        Input for ListSubscriptionsByTopic action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptionsByTopic operation returned by the service.
     * @sample AmazonSNSAsyncHandler.ListSubscriptionsByTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptionsByTopic" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn);

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn, String nextToken);

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn, String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are
     * more topics, a <code>NextToken</code> is also returned. Use the <code>NextToken</code> parameter in a new
     * <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @return A Java Future containing the result of the ListTopics operation returned by the service.
     * @sample AmazonSNSAsync.ListTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListTopics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest listTopicsRequest);

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are
     * more topics, a <code>NextToken</code> is also returned. Use the <code>NextToken</code> parameter in a new
     * <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopics operation returned by the service.
     * @sample AmazonSNSAsyncHandler.ListTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListTopics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest listTopicsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync();

    /**
     * Simplified method form for invoking the ListTopics operation with an AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(String nextToken);

    /**
     * Simplified method form for invoking the ListTopics operation with an AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler);

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to
     * the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest
     *        Input for the OptInPhoneNumber action.
     * @return A Java Future containing the result of the OptInPhoneNumber operation returned by the service.
     * @sample AmazonSNSAsync.OptInPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/OptInPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptInPhoneNumberResult> optInPhoneNumberAsync(OptInPhoneNumberRequest optInPhoneNumberRequest);

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to
     * the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest
     *        Input for the OptInPhoneNumber action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OptInPhoneNumber operation returned by the service.
     * @sample AmazonSNSAsyncHandler.OptInPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/OptInPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptInPhoneNumberResult> optInPhoneNumberAsync(OptInPhoneNumberRequest optInPhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<OptInPhoneNumberRequest, OptInPhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the
     * topic. The format of the message depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and Amazon SNS will attempt to deliver it
     * shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile endpoint, such as an app on a Kindle
     * device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned
     * when making a call with the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html">Send Custom Platform-Specific
     * Payloads in Messages to Mobile Devices</a>.
     * </p>
     * 
     * @param publishRequest
     *        Input for Publish action.
     * @return A Java Future containing the result of the Publish operation returned by the service.
     * @sample AmazonSNSAsync.Publish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Publish" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest publishRequest);

    /**
     * <p>
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the
     * topic. The format of the message depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and Amazon SNS will attempt to deliver it
     * shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile endpoint, such as an app on a Kindle
     * device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned
     * when making a call with the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html">Send Custom Platform-Specific
     * Payloads in Messages to Mobile Devices</a>.
     * </p>
     * 
     * @param publishRequest
     *        Input for Publish action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Publish operation returned by the service.
     * @sample AmazonSNSAsyncHandler.Publish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Publish" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest publishRequest,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler);

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message);

    /**
     * Simplified method form for invoking the Publish operation with an AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler);

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message, String subject);

    /**
     * Simplified method form for invoking the Publish operation with an AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message, String subject,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler);

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest
     *        Input for RemovePermission action.
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AmazonSNSAsync.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest
     *        Input for RemovePermission action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AmazonSNSAsyncHandler.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String topicArn, String label);

    /**
     * Simplified method form for invoking the RemovePermission operation with an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String topicArn, String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM
     * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest
     *        Input for SetEndpointAttributes action.
     * @return A Java Future containing the result of the SetEndpointAttributes operation returned by the service.
     * @sample AmazonSNSAsync.SetEndpointAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetEndpointAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetEndpointAttributesResult> setEndpointAttributesAsync(SetEndpointAttributesRequest setEndpointAttributesRequest);

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM
     * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest
     *        Input for SetEndpointAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetEndpointAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.SetEndpointAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetEndpointAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetEndpointAttributesResult> setEndpointAttributesAsync(SetEndpointAttributesRequest setEndpointAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<SetEndpointAttributesRequest, SetEndpointAttributesResult> asyncHandler);

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS
     * and GCM. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring attributes for message delivery status,
     * see <a href="http://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html">Using Amazon SNS Application
     * Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest
     *        Input for SetPlatformApplicationAttributes action.
     * @return A Java Future containing the result of the SetPlatformApplicationAttributes operation returned by the
     *         service.
     * @sample AmazonSNSAsync.SetPlatformApplicationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetPlatformApplicationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetPlatformApplicationAttributesResult> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest);

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS
     * and GCM. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring attributes for message delivery status,
     * see <a href="http://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html">Using Amazon SNS Application
     * Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest
     *        Input for SetPlatformApplicationAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetPlatformApplicationAttributes operation returned by the
     *         service.
     * @sample AmazonSNSAsyncHandler.SetPlatformApplicationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetPlatformApplicationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetPlatformApplicationAttributesResult> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<SetPlatformApplicationAttributesRequest, SetPlatformApplicationAttributesResult> asyncHandler);

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use the <code>Publish</code> action with
     * the <code>MessageAttributes.entry.N</code> parameter. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html">Sending an SMS Message</a> in the
     * <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param setSMSAttributesRequest
     *        The input for the SetSMSAttributes action.
     * @return A Java Future containing the result of the SetSMSAttributes operation returned by the service.
     * @sample AmazonSNSAsync.SetSMSAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSMSAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetSMSAttributesResult> setSMSAttributesAsync(SetSMSAttributesRequest setSMSAttributesRequest);

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use the <code>Publish</code> action with
     * the <code>MessageAttributes.entry.N</code> parameter. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html">Sending an SMS Message</a> in the
     * <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param setSMSAttributesRequest
     *        The input for the SetSMSAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSMSAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.SetSMSAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSMSAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetSMSAttributesResult> setSMSAttributesAsync(SetSMSAttributesRequest setSMSAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<SetSMSAttributesRequest, SetSMSAttributesResult> asyncHandler);

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest
     *        Input for SetSubscriptionAttributes action.
     * @return A Java Future containing the result of the SetSubscriptionAttributes operation returned by the service.
     * @sample AmazonSNSAsync.SetSubscriptionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSubscriptionAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(
            SetSubscriptionAttributesRequest setSubscriptionAttributesRequest);

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest
     *        Input for SetSubscriptionAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSubscriptionAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.SetSubscriptionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSubscriptionAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(
            SetSubscriptionAttributesRequest setSubscriptionAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, SetSubscriptionAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes operation.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest)
     */
    java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(String subscriptionArn, String attributeName,
            String attributeValue);

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes operation with an AsyncHandler.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(String subscriptionArn, String attributeName,
            String attributeValue, com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, SetSubscriptionAttributesResult> asyncHandler);

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest
     *        Input for SetTopicAttributes action.
     * @return A Java Future containing the result of the SetTopicAttributes operation returned by the service.
     * @sample AmazonSNSAsync.SetTopicAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetTopicAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(SetTopicAttributesRequest setTopicAttributesRequest);

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest
     *        Input for SetTopicAttributes action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetTopicAttributes operation returned by the service.
     * @sample AmazonSNSAsyncHandler.SetTopicAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetTopicAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(SetTopicAttributesRequest setTopicAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, SetTopicAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the SetTopicAttributes operation.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest)
     */
    java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(String topicArn, String attributeName, String attributeValue);

    /**
     * Simplified method form for invoking the SetTopicAttributes operation with an AsyncHandler.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(String topicArn, String attributeName, String attributeValue,
            com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, SetTopicAttributesResult> asyncHandler);

    /**
     * <p>
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest
     *        Input for Subscribe action.
     * @return A Java Future containing the result of the Subscribe operation returned by the service.
     * @sample AmazonSNSAsync.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Subscribe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest subscribeRequest);

    /**
     * <p>
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest
     *        Input for Subscribe action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Subscribe operation returned by the service.
     * @sample AmazonSNSAsyncHandler.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Subscribe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest subscribeRequest,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler);

    /**
     * Simplified method form for invoking the Subscribe operation.
     *
     * @see #subscribeAsync(SubscribeRequest)
     */
    java.util.concurrent.Future<SubscribeResult> subscribeAsync(String topicArn, String protocol, String endpoint);

    /**
     * Simplified method form for invoking the Subscribe operation with an AsyncHandler.
     *
     * @see #subscribeAsync(SubscribeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SubscribeResult> subscribeAsync(String topicArn, String protocol, String endpoint,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler);

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the
     * subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the requester is not the subscription owner, a
     * final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the
     * topic if the <code>Unsubscribe</code> request was unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest
     *        Input for Unsubscribe action.
     * @return A Java Future containing the result of the Unsubscribe operation returned by the service.
     * @sample AmazonSNSAsync.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Unsubscribe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest unsubscribeRequest);

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the
     * subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the requester is not the subscription owner, a
     * final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the
     * topic if the <code>Unsubscribe</code> request was unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest
     *        Input for Unsubscribe action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Unsubscribe operation returned by the service.
     * @sample AmazonSNSAsyncHandler.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Unsubscribe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest unsubscribeRequest,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler);

    /**
     * Simplified method form for invoking the Unsubscribe operation.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest)
     */
    java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(String subscriptionArn);

    /**
     * Simplified method form for invoking the Unsubscribe operation with an AsyncHandler.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler);

}
