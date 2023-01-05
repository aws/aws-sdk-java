/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connect.AbstractAmazonConnectAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that you use to set up and manage a customer contact center
 * and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to optimize contact routing. You can also
 * resolve customer issues more efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create. There are also limits to the number
 * of requests that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an Amazon Web Services service by using an endpoint. For a list of Amazon Connect
 * endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect
 * Endpoints</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectAsync extends AmazonConnect {

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return A Java Future containing the result of the AssociateApprovedOrigin operation returned by the service.
     * @sample AmazonConnectAsync.AssociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateApprovedOriginResult> associateApprovedOriginAsync(AssociateApprovedOriginRequest associateApprovedOriginRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateApprovedOrigin operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateApprovedOriginResult> associateApprovedOriginAsync(AssociateApprovedOriginRequest associateApprovedOriginRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateApprovedOriginRequest, AssociateApprovedOriginResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @return A Java Future containing the result of the AssociateBot operation returned by the service.
     * @sample AmazonConnectAsync.AssociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateBotResult> associateBotAsync(AssociateBotRequest associateBotRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateBot operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateBotResult> associateBotAsync(AssociateBotRequest associateBotRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateBotRequest, AssociateBotResult> asyncHandler);

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon Connect uses the vocabulary in
     * post-call and real-time analysis sessions for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return A Java Future containing the result of the AssociateDefaultVocabulary operation returned by the service.
     * @sample AmazonConnectAsync.AssociateDefaultVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateDefaultVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(
            AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest);

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon Connect uses the vocabulary in
     * post-call and real-time analysis sessions for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDefaultVocabulary operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateDefaultVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateDefaultVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(
            AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDefaultVocabularyRequest, AssociateDefaultVocabularyResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only associate one type of storage configuration
     * in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing
     * chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the
     * resource being specified in the storage configuration, like an S3 bucket, exists when being used for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return A Java Future containing the result of the AssociateInstanceStorageConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsync.AssociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only associate one type of storage configuration
     * in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing
     * chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the
     * resource being specified in the storage configuration, like an S3 bucket, exists when being used for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateInstanceStorageConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.AssociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateInstanceStorageConfigRequest, AssociateInstanceStorageConfigResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return A Java Future containing the result of the AssociateLambdaFunction operation returned by the service.
     * @sample AmazonConnectAsync.AssociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateLambdaFunctionResult> associateLambdaFunctionAsync(AssociateLambdaFunctionRequest associateLambdaFunctionRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateLambdaFunction operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateLambdaFunctionResult> associateLambdaFunctionAsync(AssociateLambdaFunctionRequest associateLambdaFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateLambdaFunctionRequest, AssociateLambdaFunctionResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return A Java Future containing the result of the AssociateLexBot operation returned by the service.
     * @sample AmazonConnectAsync.AssociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateLexBotResult> associateLexBotAsync(AssociateLexBotRequest associateLexBotRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param associateLexBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateLexBot operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateLexBotResult> associateLexBotAsync(AssociateLexBotRequest associateLexBotRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateLexBotRequest, AssociateLexBotResult> asyncHandler);

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @return A Java Future containing the result of the AssociatePhoneNumberContactFlow operation returned by the
     *         service.
     * @sample AmazonConnectAsync.AssociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumberContactFlowResult> associatePhoneNumberContactFlowAsync(
            AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest);

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePhoneNumberContactFlow operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.AssociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumberContactFlowResult> associatePhoneNumberContactFlowAsync(
            AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumberContactFlowRequest, AssociatePhoneNumberContactFlowResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @return A Java Future containing the result of the AssociateQueueQuickConnects operation returned by the service.
     * @sample AmazonConnectAsync.AssociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateQueueQuickConnectsResult> associateQueueQuickConnectsAsync(
            AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateQueueQuickConnects operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateQueueQuickConnectsResult> associateQueueQuickConnectsAsync(
            AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateQueueQuickConnectsRequest, AssociateQueueQuickConnectsResult> asyncHandler);

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return A Java Future containing the result of the AssociateRoutingProfileQueues operation returned by the
     *         service.
     * @sample AmazonConnectAsync.AssociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(
            AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateRoutingProfileQueues operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.AssociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(
            AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateRoutingProfileQueuesRequest, AssociateRoutingProfileQueuesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return A Java Future containing the result of the AssociateSecurityKey operation returned by the service.
     * @sample AmazonConnectAsync.AssociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateSecurityKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(AssociateSecurityKeyRequest associateSecurityKeyRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSecurityKey operation returned by the service.
     * @sample AmazonConnectAsyncHandler.AssociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateSecurityKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(AssociateSecurityKeyRequest associateSecurityKeyRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSecurityKeyRequest, AssociateSecurityKeyResult> asyncHandler);

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or traffic distribution group. You can call this
     * API only in the same Amazon Web Services Region where the Amazon Connect instance or traffic distribution group
     * was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html">Claim a phone number in your
     * country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you can claim. Call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html">ClaimPhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * 
     * @param claimPhoneNumberRequest
     * @return A Java Future containing the result of the ClaimPhoneNumber operation returned by the service.
     * @sample AmazonConnectAsync.ClaimPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(ClaimPhoneNumberRequest claimPhoneNumberRequest);

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or traffic distribution group. You can call this
     * API only in the same Amazon Web Services Region where the Amazon Connect instance or traffic distribution group
     * was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html">Claim a phone number in your
     * country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you can claim. Call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html">ClaimPhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * 
     * @param claimPhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ClaimPhoneNumber operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ClaimPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(ClaimPhoneNumberRequest claimPhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<ClaimPhoneNumberRequest, ClaimPhoneNumberResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @return A Java Future containing the result of the CreateAgentStatus operation returned by the service.
     * @sample AmazonConnectAsync.CreateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentStatusResult> createAgentStatusAsync(CreateAgentStatusRequest createAgentStatusRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgentStatus operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentStatusResult> createAgentStatusAsync(CreateAgentStatusRequest createAgentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentStatusRequest, CreateAgentStatusResult> asyncHandler);

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return A Java Future containing the result of the CreateContactFlow operation returned by the service.
     * @sample AmazonConnectAsync.CreateContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(CreateContactFlowRequest createContactFlowRequest);

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContactFlow operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(CreateContactFlowRequest createContactFlowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContactFlowRequest, CreateContactFlowResult> asyncHandler);

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return A Java Future containing the result of the CreateContactFlowModule operation returned by the service.
     * @sample AmazonConnectAsync.CreateContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(CreateContactFlowModuleRequest createContactFlowModuleRequest);

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContactFlowModule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(CreateContactFlowModuleRequest createContactFlowModuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContactFlowModuleRequest, CreateContactFlowModuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @return A Java Future containing the result of the CreateHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsync.CreateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(CreateHoursOfOperationRequest createHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(CreateHoursOfOperationRequest createHoursOfOperationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHoursOfOperationRequest, CreateHoursOfOperationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage,
     * such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @return A Java Future containing the result of the CreateInstance operation returned by the service.
     * @sample AmazonConnectAsync.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage,
     * such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstance operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return A Java Future containing the result of the CreateIntegrationAssociation operation returned by the
     *         service.
     * @sample AmazonConnectAsync.CreateIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(
            CreateIntegrationAssociationRequest createIntegrationAssociationRequest);

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIntegrationAssociation operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.CreateIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(
            CreateIntegrationAssociationRequest createIntegrationAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIntegrationAssociationRequest, CreateIntegrationAssociationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic distribution group, and you are calling this API
     * using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use
     * either a full phone number ARN or UUID value for the <code>OutboundCallerIdNumberId</code> value of the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig">OutboundCallerConfig</a>
     * request body parameter. However, if the number is claimed to a traffic distribution group and you are calling
     * this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution
     * group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param createQueueRequest
     * @return A Java Future containing the result of the CreateQueue operation returned by the service.
     * @sample AmazonConnectAsync.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic distribution group, and you are calling this API
     * using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use
     * either a full phone number ARN or UUID value for the <code>OutboundCallerIdNumberId</code> value of the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig">OutboundCallerConfig</a>
     * request body parameter. However, if the number is claimed to a traffic distribution group and you are calling
     * this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution
     * group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param createQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueue operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler);

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return A Java Future containing the result of the CreateQuickConnect operation returned by the service.
     * @sample AmazonConnectAsync.CreateQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQuickConnectResult> createQuickConnectAsync(CreateQuickConnectRequest createQuickConnectRequest);

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQuickConnect operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQuickConnectResult> createQuickConnectAsync(CreateQuickConnectRequest createQuickConnectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQuickConnectRequest, CreateQuickConnectResult> asyncHandler);

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return A Java Future containing the result of the CreateRoutingProfile operation returned by the service.
     * @sample AmazonConnectAsync.CreateRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(CreateRoutingProfileRequest createRoutingProfileRequest);

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoutingProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(CreateRoutingProfileRequest createRoutingProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoutingProfileRequest, CreateRoutingProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonConnectAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return A Java Future containing the result of the CreateSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsync.CreateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityProfileResult> createSecurityProfileAsync(CreateSecurityProfileRequest createSecurityProfileRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityProfileResult> createSecurityProfileAsync(CreateSecurityProfileRequest createSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityProfileRequest, CreateSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @return A Java Future containing the result of the CreateTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsync.CreateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskTemplateResult> createTaskTemplateAsync(CreateTaskTemplateRequest createTaskTemplateRequest);

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskTemplateResult> createTaskTemplateAsync(CreateTaskTemplateRequest createTaskTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTaskTemplateRequest, CreateTaskTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance that has been replicated.
     * </p>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html">Set up
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @return A Java Future containing the result of the CreateTrafficDistributionGroup operation returned by the
     *         service.
     * @sample AmazonConnectAsync.CreateTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest);

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance that has been replicated.
     * </p>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html">Set up
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficDistributionGroup operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.CreateTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficDistributionGroupRequest, CreateTrafficDistributionGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return A Java Future containing the result of the CreateUseCase operation returned by the service.
     * @sample AmazonConnectAsync.CreateUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUseCaseResult> createUseCaseAsync(CreateUseCaseRequest createUseCaseRequest);

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUseCase operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUseCaseResult> createUseCaseAsync(CreateUseCaseRequest createUseCaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUseCaseRequest, CreateUseCaseResult> asyncHandler);

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about how to create user accounts using the Amazon Connect console, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html">Add Users</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonConnectAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about how to create user accounts using the Amazon Connect console, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html">Add Users</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return A Java Future containing the result of the CreateUserHierarchyGroup operation returned by the service.
     * @sample AmazonConnectAsync.CreateUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest);

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserHierarchyGroup operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserHierarchyGroupRequest, CreateUserHierarchyGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance. You can set a custom vocabulary to be
     * your default vocabulary for a given language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future containing the result of the CreateVocabulary operation returned by the service.
     * @sample AmazonConnectAsync.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest createVocabularyRequest);

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance. You can set a custom vocabulary to be
     * your default vocabulary for a given language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVocabulary operation returned by the service.
     * @sample AmazonConnectAsyncHandler.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest createVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler);

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @return A Java Future containing the result of the DeleteContactFlow operation returned by the service.
     * @sample AmazonConnectAsync.DeleteContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactFlowResult> deleteContactFlowAsync(DeleteContactFlowRequest deleteContactFlowRequest);

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContactFlow operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactFlowResult> deleteContactFlowAsync(DeleteContactFlowRequest deleteContactFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContactFlowRequest, DeleteContactFlowResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return A Java Future containing the result of the DeleteContactFlowModule operation returned by the service.
     * @sample AmazonConnectAsync.DeleteContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(DeleteContactFlowModuleRequest deleteContactFlowModuleRequest);

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContactFlowModule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(DeleteContactFlowModuleRequest deleteContactFlowModuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContactFlowModuleRequest, DeleteContactFlowModuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @return A Java Future containing the result of the DeleteHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsync.DeleteHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHoursOfOperationResult> deleteHoursOfOperationAsync(DeleteHoursOfOperationRequest deleteHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHoursOfOperationResult> deleteHoursOfOperationAsync(DeleteHoursOfOperationRequest deleteHoursOfOperationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHoursOfOperationRequest, DeleteHoursOfOperationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonConnectAsync.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon Connect instance. The association must not
     * have any use cases associated with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @return A Java Future containing the result of the DeleteIntegrationAssociation operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DeleteIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntegrationAssociationResult> deleteIntegrationAssociationAsync(
            DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon Connect instance. The association must not
     * have any use cases associated with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegrationAssociation operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DeleteIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntegrationAssociationResult> deleteIntegrationAssociationAsync(
            DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationAssociationRequest, DeleteIntegrationAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
     * @return A Java Future containing the result of the DeleteQuickConnect operation returned by the service.
     * @sample AmazonConnectAsync.DeleteQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteQuickConnectResult> deleteQuickConnectAsync(DeleteQuickConnectRequest deleteQuickConnectRequest);

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQuickConnect operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteQuickConnectResult> deleteQuickConnectAsync(DeleteQuickConnectRequest deleteQuickConnectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQuickConnectRequest, DeleteQuickConnectResult> asyncHandler);

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonConnectAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return A Java Future containing the result of the DeleteSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsync.DeleteSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityProfileResult> deleteSecurityProfileAsync(DeleteSecurityProfileRequest deleteSecurityProfileRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityProfileResult> deleteSecurityProfileAsync(DeleteSecurityProfileRequest deleteSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityProfileRequest, DeleteSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @return A Java Future containing the result of the DeleteTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsync.DeleteTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(DeleteTaskTemplateRequest deleteTaskTemplateRequest);

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(DeleteTaskTemplateRequest deleteTaskTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTaskTemplateRequest, DeleteTaskTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the Region where the traffic distribution
     * group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html">Delete
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @return A Java Future containing the result of the DeleteTrafficDistributionGroup operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DeleteTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest);

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the Region where the traffic distribution
     * group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html">Delete
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrafficDistributionGroup operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DeleteTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficDistributionGroupRequest, DeleteTrafficDistributionGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @return A Java Future containing the result of the DeleteUseCase operation returned by the service.
     * @sample AmazonConnectAsync.DeleteUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUseCaseResult> deleteUseCaseAsync(DeleteUseCaseRequest deleteUseCaseRequest);

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUseCase operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUseCaseResult> deleteUseCaseAsync(DeleteUseCaseRequest deleteUseCaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUseCaseRequest, DeleteUseCaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is deleted, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html">Delete Users from Your Amazon
     * Connect Instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonConnectAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is deleted, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html">Delete Users from Your Amazon
     * Connect Instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child
     * groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return A Java Future containing the result of the DeleteUserHierarchyGroup operation returned by the service.
     * @sample AmazonConnectAsync.DeleteUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest);

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child
     * groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserHierarchyGroup operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserHierarchyGroupRequest, DeleteUserHierarchyGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future containing the result of the DeleteVocabulary operation returned by the service.
     * @sample AmazonConnectAsync.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest deleteVocabularyRequest);

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVocabulary operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest deleteVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @return A Java Future containing the result of the DescribeAgentStatus operation returned by the service.
     * @sample AmazonConnectAsync.DescribeAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeAgentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgentStatusResult> describeAgentStatusAsync(DescribeAgentStatusRequest describeAgentStatusRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgentStatus operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeAgentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgentStatusResult> describeAgentStatusAsync(DescribeAgentStatusRequest describeAgentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentStatusRequest, DescribeAgentStatusResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months, and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @return A Java Future containing the result of the DescribeContact operation returned by the service.
     * @sample AmazonConnectAsync.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest describeContactRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months, and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest describeContactRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler);

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return A Java Future containing the result of the DescribeContactFlow operation returned by the service.
     * @sample AmazonConnectAsync.DescribeContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(DescribeContactFlowRequest describeContactFlowRequest);

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContactFlow operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(DescribeContactFlowRequest describeContactFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContactFlowRequest, DescribeContactFlowResult> asyncHandler);

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return A Java Future containing the result of the DescribeContactFlowModule operation returned by the service.
     * @sample AmazonConnectAsync.DescribeContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(
            DescribeContactFlowModuleRequest describeContactFlowModuleRequest);

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContactFlowModule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(
            DescribeContactFlowModuleRequest describeContactFlowModuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContactFlowModuleRequest, DescribeContactFlowModuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @return A Java Future containing the result of the DescribeHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsync.DescribeHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(DescribeHoursOfOperationRequest describeHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(DescribeHoursOfOperationRequest describeHoursOfOperationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHoursOfOperationRequest, DescribeHoursOfOperationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks the instance while it is being created
     * and returns an error status, if applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason field returns details relevant to the
     * reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return A Java Future containing the result of the DescribeInstance operation returned by the service.
     * @sample AmazonConnectAsync.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest describeInstanceRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks the instance while it is being created
     * and returns an error status, if applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason field returns details relevant to the
     * reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstance operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest describeInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return A Java Future containing the result of the DescribeInstanceAttribute operation returned by the service.
     * @sample AmazonConnectAsync.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceAttribute operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return A Java Future containing the result of the DescribeInstanceStorageConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DescribeInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceStorageConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DescribeInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceStorageConfigRequest, DescribeInstanceStorageConfigResult> asyncHandler);

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a phone number ARN or UUID value for the
     * <code>PhoneNumberId</code> URI request parameter. However, if the number is claimed to a traffic distribution
     * group and you are calling this API in the alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will
     * receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @return A Java Future containing the result of the DescribePhoneNumber operation returned by the service.
     * @sample AmazonConnectAsync.DescribePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePhoneNumberResult> describePhoneNumberAsync(DescribePhoneNumberRequest describePhoneNumberRequest);

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a phone number ARN or UUID value for the
     * <code>PhoneNumberId</code> URI request parameter. However, if the number is claimed to a traffic distribution
     * group and you are calling this API in the alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will
     * receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePhoneNumber operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePhoneNumberResult> describePhoneNumberAsync(DescribePhoneNumberRequest describePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePhoneNumberRequest, DescribePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @return A Java Future containing the result of the DescribeQueue operation returned by the service.
     * @sample AmazonConnectAsync.DescribeQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeQueueResult> describeQueueAsync(DescribeQueueRequest describeQueueRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeQueue operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeQueueResult> describeQueueAsync(DescribeQueueRequest describeQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeQueueRequest, DescribeQueueResult> asyncHandler);

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return A Java Future containing the result of the DescribeQuickConnect operation returned by the service.
     * @sample AmazonConnectAsync.DescribeQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQuickConnect" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeQuickConnectResult> describeQuickConnectAsync(DescribeQuickConnectRequest describeQuickConnectRequest);

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeQuickConnect operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQuickConnect" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeQuickConnectResult> describeQuickConnectAsync(DescribeQuickConnectRequest describeQuickConnectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeQuickConnectRequest, DescribeQuickConnectResult> asyncHandler);

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return A Java Future containing the result of the DescribeRoutingProfile operation returned by the service.
     * @sample AmazonConnectAsync.DescribeRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(DescribeRoutingProfileRequest describeRoutingProfileRequest);

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRoutingProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(DescribeRoutingProfileRequest describeRoutingProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRoutingProfileRequest, DescribeRoutingProfileResult> asyncHandler);

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonConnectAsync.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest);

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return A Java Future containing the result of the DescribeSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsync.DescribeSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeSecurityProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(DescribeSecurityProfileRequest describeSecurityProfileRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeSecurityProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(DescribeSecurityProfileRequest describeSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityProfileRequest, DescribeSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @return A Java Future containing the result of the DescribeTrafficDistributionGroup operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DescribeTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest);

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrafficDistributionGroup operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DescribeTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrafficDistributionGroupRequest, DescribeTrafficDistributionGroupResult> asyncHandler);

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the
     * ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonConnectAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the
     * ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return A Java Future containing the result of the DescribeUserHierarchyGroup operation returned by the service.
     * @sample AmazonConnectAsync.DescribeUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest);

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserHierarchyGroup operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler);

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return A Java Future containing the result of the DescribeUserHierarchyStructure operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DescribeUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest);

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserHierarchyStructure operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DescribeUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler);

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return A Java Future containing the result of the DescribeVocabulary operation returned by the service.
     * @sample AmazonConnectAsync.DescribeVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVocabularyResult> describeVocabularyAsync(DescribeVocabularyRequest describeVocabularyRequest);

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVocabulary operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DescribeVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVocabularyResult> describeVocabularyAsync(DescribeVocabularyRequest describeVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVocabularyRequest, DescribeVocabularyResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return A Java Future containing the result of the DisassociateApprovedOrigin operation returned by the service.
     * @sample AmazonConnectAsync.DisassociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApprovedOriginResult> disassociateApprovedOriginAsync(
            DisassociateApprovedOriginRequest disassociateApprovedOriginRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateApprovedOrigin operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DisassociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApprovedOriginResult> disassociateApprovedOriginAsync(
            DisassociateApprovedOriginRequest disassociateApprovedOriginRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateApprovedOriginRequest, DisassociateApprovedOriginResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @return A Java Future containing the result of the DisassociateBot operation returned by the service.
     * @sample AmazonConnectAsync.DisassociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateBotResult> disassociateBotAsync(DisassociateBotRequest disassociateBotRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateBot operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DisassociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateBotResult> disassociateBotAsync(DisassociateBotRequest disassociateBotRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateBotRequest, DisassociateBotResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return A Java Future containing the result of the DisassociateInstanceStorageConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DisassociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateInstanceStorageConfigResult> disassociateInstanceStorageConfigAsync(
            DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateInstanceStorageConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DisassociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateInstanceStorageConfigResult> disassociateInstanceStorageConfigAsync(
            DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateInstanceStorageConfigRequest, DisassociateInstanceStorageConfigResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return A Java Future containing the result of the DisassociateLambdaFunction operation returned by the service.
     * @sample AmazonConnectAsync.DisassociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLambdaFunctionResult> disassociateLambdaFunctionAsync(
            DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateLambdaFunction operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DisassociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLambdaFunctionResult> disassociateLambdaFunctionAsync(
            DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateLambdaFunctionRequest, DisassociateLambdaFunctionResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return A Java Future containing the result of the DisassociateLexBot operation returned by the service.
     * @sample AmazonConnectAsync.DisassociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLexBotResult> disassociateLexBotAsync(DisassociateLexBotRequest disassociateLexBotRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateLexBot operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DisassociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLexBotResult> disassociateLexBotAsync(DisassociateLexBotRequest disassociateLexBotRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateLexBotRequest, DisassociateLexBotResult> asyncHandler);

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @return A Java Future containing the result of the DisassociatePhoneNumberContactFlow operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DisassociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumberContactFlowResult> disassociatePhoneNumberContactFlowAsync(
            DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest);

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePhoneNumberContactFlow operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DisassociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumberContactFlowResult> disassociatePhoneNumberContactFlowAsync(
            DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumberContactFlowRequest, DisassociatePhoneNumberContactFlowResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @return A Java Future containing the result of the DisassociateQueueQuickConnects operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DisassociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateQueueQuickConnectsResult> disassociateQueueQuickConnectsAsync(
            DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateQueueQuickConnects operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DisassociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateQueueQuickConnectsResult> disassociateQueueQuickConnectsAsync(
            DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateQueueQuickConnectsRequest, DisassociateQueueQuickConnectsResult> asyncHandler);

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return A Java Future containing the result of the DisassociateRoutingProfileQueues operation returned by the
     *         service.
     * @sample AmazonConnectAsync.DisassociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateRoutingProfileQueues operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.DisassociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateRoutingProfileQueuesRequest, DisassociateRoutingProfileQueuesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return A Java Future containing the result of the DisassociateSecurityKey operation returned by the service.
     * @sample AmazonConnectAsync.DisassociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateSecurityKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSecurityKeyResult> disassociateSecurityKeyAsync(DisassociateSecurityKeyRequest disassociateSecurityKeyRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSecurityKey operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DisassociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateSecurityKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSecurityKeyResult> disassociateSecurityKeyAsync(DisassociateSecurityKeyRequest disassociateSecurityKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSecurityKeyRequest, DisassociateSecurityKeyResult> asyncHandler);

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an available state, which allows the agent to
     * receive a new routed contact. Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @return A Java Future containing the result of the DismissUserContact operation returned by the service.
     * @sample AmazonConnectAsync.DismissUserContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DismissUserContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DismissUserContactResult> dismissUserContactAsync(DismissUserContactRequest dismissUserContactRequest);

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an available state, which allows the agent to
     * receive a new routed contact. Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DismissUserContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.DismissUserContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DismissUserContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DismissUserContactResult> dismissUserContactAsync(DismissUserContactRequest dismissUserContactRequest,
            com.amazonaws.handlers.AsyncHandler<DismissUserContactRequest, DismissUserContactResult> asyncHandler);

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return A Java Future containing the result of the GetContactAttributes operation returned by the service.
     * @sample AmazonConnectAsync.GetContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetContactAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(GetContactAttributesRequest getContactAttributesRequest);

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContactAttributes operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetContactAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(GetContactAttributesRequest getContactAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler);

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html">Real-time Metrics
     * Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return A Java Future containing the result of the GetCurrentMetricData operation returned by the service.
     * @sample AmazonConnectAsync.GetCurrentMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(GetCurrentMetricDataRequest getCurrentMetricDataRequest);

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html">Real-time Metrics
     * Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCurrentMetricData operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetCurrentMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(GetCurrentMetricDataRequest getCurrentMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler);

    /**
     * <p>
     * Gets the real-time active user data from the specified Amazon Connect instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @return A Java Future containing the result of the GetCurrentUserData operation returned by the service.
     * @sample AmazonConnectAsync.GetCurrentUserData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentUserData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCurrentUserDataResult> getCurrentUserDataAsync(GetCurrentUserDataRequest getCurrentUserDataRequest);

    /**
     * <p>
     * Gets the real-time active user data from the specified Amazon Connect instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCurrentUserData operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetCurrentUserData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentUserData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCurrentUserDataResult> getCurrentUserDataAsync(GetCurrentUserDataRequest getCurrentUserDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetCurrentUserDataRequest, GetCurrentUserDataResult> asyncHandler);

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke GetFederationToken with root credentials, an error
     * message similar to the following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
     * 
     * @param getFederationTokenRequest
     * @return A Java Future containing the result of the GetFederationToken operation returned by the service.
     * @sample AmazonConnectAsync.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest getFederationTokenRequest);

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke GetFederationToken with root credentials, an error
     * message similar to the following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
     * 
     * @param getFederationTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFederationToken operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest getFederationTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler);

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * Metrics Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return A Java Future containing the result of the GetMetricData operation returned by the service.
     * @sample AmazonConnectAsync.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest);

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * Metrics Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricData operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler);

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @return A Java Future containing the result of the GetTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsync.GetTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTaskTemplateResult> getTaskTemplateAsync(GetTaskTemplateRequest getTaskTemplateRequest);

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTaskTemplateResult> getTaskTemplateAsync(GetTaskTemplateRequest getTaskTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTaskTemplateRequest, GetTaskTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @return A Java Future containing the result of the GetTrafficDistribution operation returned by the service.
     * @sample AmazonConnectAsync.GetTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTrafficDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficDistributionResult> getTrafficDistributionAsync(GetTrafficDistributionRequest getTrafficDistributionRequest);

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficDistribution operation returned by the service.
     * @sample AmazonConnectAsyncHandler.GetTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTrafficDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficDistributionResult> getTrafficDistributionAsync(GetTrafficDistributionRequest getTrafficDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficDistributionRequest, GetTrafficDistributionResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @return A Java Future containing the result of the ListAgentStatuses operation returned by the service.
     * @sample AmazonConnectAsync.ListAgentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAgentStatuses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentStatusesResult> listAgentStatusesAsync(ListAgentStatusesRequest listAgentStatusesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentStatuses operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListAgentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAgentStatuses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentStatusesResult> listAgentStatusesAsync(ListAgentStatusesRequest listAgentStatusesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentStatusesRequest, ListAgentStatusesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return A Java Future containing the result of the ListApprovedOrigins operation returned by the service.
     * @sample AmazonConnectAsync.ListApprovedOrigins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListApprovedOrigins" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApprovedOriginsResult> listApprovedOriginsAsync(ListApprovedOriginsRequest listApprovedOriginsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApprovedOrigins operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListApprovedOrigins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListApprovedOrigins" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApprovedOriginsResult> listApprovedOriginsAsync(ListApprovedOriginsRequest listApprovedOriginsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApprovedOriginsRequest, ListApprovedOriginsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all the Amazon Lex bots currently associated
     * with the instance. Use this API to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return A Java Future containing the result of the ListBots operation returned by the service.
     * @sample AmazonConnectAsync.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all the Amazon Lex bots currently associated
     * with the instance. Use this API to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBots operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler);

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return A Java Future containing the result of the ListContactFlowModules operation returned by the service.
     * @sample AmazonConnectAsync.ListContactFlowModules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlowModules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListContactFlowModulesResult> listContactFlowModulesAsync(ListContactFlowModulesRequest listContactFlowModulesRequest);

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContactFlowModules operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListContactFlowModules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlowModules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListContactFlowModulesResult> listContactFlowModulesAsync(ListContactFlowModulesRequest listContactFlowModulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListContactFlowModulesRequest, ListContactFlowModulesResult> asyncHandler);

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Flows</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return A Java Future containing the result of the ListContactFlows operation returned by the service.
     * @sample AmazonConnectAsync.ListContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(ListContactFlowsRequest listContactFlowsRequest);

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Flows</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContactFlows operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(ListContactFlowsRequest listContactFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of references associated with the contact.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @return A Java Future containing the result of the ListContactReferences operation returned by the service.
     * @sample AmazonConnectAsync.ListContactReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactReferences" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListContactReferencesResult> listContactReferencesAsync(ListContactReferencesRequest listContactReferencesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of references associated with the contact.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContactReferences operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListContactReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactReferences" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListContactReferencesResult> listContactReferencesAsync(ListContactReferencesRequest listContactReferencesRequest,
            com.amazonaws.handlers.AsyncHandler<ListContactReferencesRequest, ListContactReferencesResult> asyncHandler);

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return A Java Future containing the result of the ListDefaultVocabularies operation returned by the service.
     * @sample AmazonConnectAsync.ListDefaultVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListDefaultVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(ListDefaultVocabulariesRequest listDefaultVocabulariesRequest);

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDefaultVocabularies operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListDefaultVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListDefaultVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(ListDefaultVocabulariesRequest listDefaultVocabulariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDefaultVocabulariesRequest, ListDefaultVocabulariesResult> asyncHandler);

    /**
     * <p>
     * Provides information about the hours of operation for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html">Set the Hours of Operation
     * for a Queue</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return A Java Future containing the result of the ListHoursOfOperations operation returned by the service.
     * @sample AmazonConnectAsync.ListHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListHoursOfOperations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(ListHoursOfOperationsRequest listHoursOfOperationsRequest);

    /**
     * <p>
     * Provides information about the hours of operation for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html">Set the Hours of Operation
     * for a Queue</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHoursOfOperations operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListHoursOfOperations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(ListHoursOfOperationsRequest listHoursOfOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return A Java Future containing the result of the ListInstanceAttributes operation returned by the service.
     * @sample AmazonConnectAsync.ListInstanceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceAttributesResult> listInstanceAttributesAsync(ListInstanceAttributesRequest listInstanceAttributesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceAttributes operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListInstanceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceAttributesResult> listInstanceAttributesAsync(ListInstanceAttributesRequest listInstanceAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceAttributesRequest, ListInstanceAttributesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return A Java Future containing the result of the ListInstanceStorageConfigs operation returned by the service.
     * @sample AmazonConnectAsync.ListInstanceStorageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceStorageConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(
            ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceStorageConfigs operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListInstanceStorageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceStorageConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(
            ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceStorageConfigsRequest, ListInstanceStorageConfigsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances
     * that aren't successfully created (they are in a failed state) are returned only for 24 hours after the
     * CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AmazonConnectAsync.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances
     * that aren't successfully created (they are in a failed state) are returned only for 24 hours after the
     * CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler);

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource associations for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return A Java Future containing the result of the ListIntegrationAssociations operation returned by the service.
     * @sample AmazonConnectAsync.ListIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(
            ListIntegrationAssociationsRequest listIntegrationAssociationsRequest);

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource associations for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIntegrationAssociations operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(
            ListIntegrationAssociationsRequest listIntegrationAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIntegrationAssociationsRequest, ListIntegrationAssociationsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant flow
     * blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return A Java Future containing the result of the ListLambdaFunctions operation returned by the service.
     * @sample AmazonConnectAsync.ListLambdaFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLambdaFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(ListLambdaFunctionsRequest listLambdaFunctionsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant flow
     * blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLambdaFunctions operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListLambdaFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLambdaFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(ListLambdaFunctionsRequest listLambdaFunctionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLambdaFunctionsRequest, ListLambdaFunctionsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently associated with the instance. To return both
     * Amazon Lex V1 and V2 bots, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html">ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return A Java Future containing the result of the ListLexBots operation returned by the service.
     * @sample AmazonConnectAsync.ListLexBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLexBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLexBotsResult> listLexBotsAsync(ListLexBotsRequest listLexBotsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently associated with the instance. To return both
     * Amazon Lex V1 and V2 bots, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html">ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLexBots operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListLexBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLexBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLexBotsResult> listLexBotsAsync(ListLexBotsRequest listLexBotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLexBotsRequest, ListLexBotsResult> asyncHandler);

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources. It will fail with a
     * <code>ResourceNotFoundException</code>. Instead, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API. It returns the new phone number ARN that can be used to tag phone number resources.
     * </p>
     * </important>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonConnectAsync.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources. It will fail with a
     * <code>ResourceNotFoundException</code>. Instead, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API. It returns the new phone number ARN that can be used to tag phone number resources.
     * </p>
     * </important>
     * 
     * @param listPhoneNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler);

    /**
     * <p>
     * Lists phone numbers claimed to your Amazon Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this API in both Amazon Web Services Regions
     * associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listPhoneNumbersV2Request
     * @return A Java Future containing the result of the ListPhoneNumbersV2 operation returned by the service.
     * @sample AmazonConnectAsync.ListPhoneNumbersV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersV2" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(ListPhoneNumbersV2Request listPhoneNumbersV2Request);

    /**
     * <p>
     * Lists phone numbers claimed to your Amazon Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this API in both Amazon Web Services Regions
     * associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listPhoneNumbersV2Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumbersV2 operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListPhoneNumbersV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersV2" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(ListPhoneNumbersV2Request listPhoneNumbersV2Request,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersV2Request, ListPhoneNumbersV2Result> asyncHandler);

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return A Java Future containing the result of the ListPrompts operation returned by the service.
     * @sample AmazonConnectAsync.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest listPromptsRequest);

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrompts operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest listPromptsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @return A Java Future containing the result of the ListQueueQuickConnects operation returned by the service.
     * @sample AmazonConnectAsync.ListQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueueQuickConnects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(ListQueueQuickConnectsRequest listQueueQuickConnectsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueueQuickConnects operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueueQuickConnects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(ListQueueQuickConnectsRequest listQueueQuickConnectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueueQuickConnectsRequest, ListQueueQuickConnectsResult> asyncHandler);

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard and agent queues are returned. This
     * might cause an unexpected truncation of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html">Queues:
     * Standard and Agent</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future containing the result of the ListQueues operation returned by the service.
     * @sample AmazonConnectAsync.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest);

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard and agent queues are returned. This
     * might cause an unexpected truncation of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html">Queues:
     * Standard and Agent</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueues operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler);

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return A Java Future containing the result of the ListQuickConnects operation returned by the service.
     * @sample AmazonConnectAsync.ListQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQuickConnects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQuickConnectsResult> listQuickConnectsAsync(ListQuickConnectsRequest listQuickConnectsRequest);

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQuickConnects operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQuickConnects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQuickConnectsResult> listQuickConnectsAsync(ListQuickConnectsRequest listQuickConnectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQuickConnectsRequest, ListQuickConnectsResult> asyncHandler);

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return A Java Future containing the result of the ListRoutingProfileQueues operation returned by the service.
     * @sample AmazonConnectAsync.ListRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest);

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoutingProfileQueues operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoutingProfileQueuesRequest, ListRoutingProfileQueuesResult> asyncHandler);

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html">Routing Profiles</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html">Create a Routing Profile</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return A Java Future containing the result of the ListRoutingProfiles operation returned by the service.
     * @sample AmazonConnectAsync.ListRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(ListRoutingProfilesRequest listRoutingProfilesRequest);

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html">Routing Profiles</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html">Create a Routing Profile</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoutingProfiles operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(ListRoutingProfilesRequest listRoutingProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler);

    /**
     * <p>
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonConnectAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return A Java Future containing the result of the ListSecurityKeys operation returned by the service.
     * @sample AmazonConnectAsync.ListSecurityKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityKeysResult> listSecurityKeysAsync(ListSecurityKeysRequest listSecurityKeysRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityKeys operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListSecurityKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityKeysResult> listSecurityKeysAsync(ListSecurityKeysRequest listSecurityKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityKeysRequest, ListSecurityKeysResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @return A Java Future containing the result of the ListSecurityProfilePermissions operation returned by the
     *         service.
     * @sample AmazonConnectAsync.ListSecurityProfilePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfilePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityProfilePermissions operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.ListSecurityProfilePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfilePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityProfilePermissionsRequest, ListSecurityProfilePermissionsResult> asyncHandler);

    /**
     * <p>
     * Provides summary information about the security profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html">Security Profiles</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return A Java Future containing the result of the ListSecurityProfiles operation returned by the service.
     * @sample AmazonConnectAsync.ListSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest listSecurityProfilesRequest);

    /**
     * <p>
     * Provides summary information about the security profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html">Security Profiles</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityProfiles operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest listSecurityProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @return A Java Future containing the result of the ListTaskTemplates operation returned by the service.
     * @sample AmazonConnectAsync.ListTaskTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTaskTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTaskTemplatesResult> listTaskTemplatesAsync(ListTaskTemplatesRequest listTaskTemplatesRequest);

    /**
     * <p>
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTaskTemplates operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListTaskTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTaskTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTaskTemplatesResult> listTaskTemplatesAsync(ListTaskTemplatesRequest listTaskTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTaskTemplatesRequest, ListTaskTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @return A Java Future containing the result of the ListTrafficDistributionGroups operation returned by the
     *         service.
     * @sample AmazonConnectAsync.ListTrafficDistributionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTrafficDistributionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest);

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficDistributionGroups operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.ListTrafficDistributionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTrafficDistributionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficDistributionGroupsRequest, ListTrafficDistributionGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest
     *        Provides summary information about the use cases for the specified integration association.
     * @return A Java Future containing the result of the ListUseCases operation returned by the service.
     * @sample AmazonConnectAsync.ListUseCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUseCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest listUseCasesRequest);

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest
     *        Provides summary information about the use cases for the specified integration association.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUseCases operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListUseCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUseCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest listUseCasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListUseCasesRequest, ListUseCasesResult> asyncHandler);

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html">Set Up Agent Hierarchies</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return A Java Future containing the result of the ListUserHierarchyGroups operation returned by the service.
     * @sample AmazonConnectAsync.ListUserHierarchyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserHierarchyGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest);

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html">Set Up Agent Hierarchies</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserHierarchyGroups operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListUserHierarchyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserHierarchyGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler);

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonConnectAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP) of the user specified by <i>userId</i>
     * will be set to silent monitoring mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @return A Java Future containing the result of the MonitorContact operation returned by the service.
     * @sample AmazonConnectAsync.MonitorContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MonitorContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MonitorContactResult> monitorContactAsync(MonitorContactRequest monitorContactRequest);

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP) of the user specified by <i>userId</i>
     * will be set to silent monitoring mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MonitorContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.MonitorContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MonitorContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MonitorContactResult> monitorContactAsync(MonitorContactRequest monitorContactRequest,
            com.amazonaws.handlers.AsyncHandler<MonitorContactRequest, MonitorContactResult> asyncHandler);

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the agent is currently handling a contact,
     * this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html">Agent status</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html">Set your next status</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @return A Java Future containing the result of the PutUserStatus operation returned by the service.
     * @sample AmazonConnectAsync.PutUserStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PutUserStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutUserStatusResult> putUserStatusAsync(PutUserStatusRequest putUserStatusRequest);

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the agent is currently handling a contact,
     * this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html">Agent status</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html">Set your next status</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutUserStatus operation returned by the service.
     * @sample AmazonConnectAsyncHandler.PutUserStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PutUserStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutUserStatusResult> putUserStatusAsync(PutUserStatusRequest putUserStatusRequest,
            com.amazonaws.handlers.AsyncHandler<PutUserStatusRequest, PutUserStatusResult> asyncHandler);

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance or traffic distribution group. You can
     * call this API only in the Amazon Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the <code>ReleasePhoneNumber</code> API, not the
     * Amazon Connect console.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown period of 30 days. It cannot be searched
     * for or claimed again until the period has ended. If you accidentally release a phone number, contact Amazon Web
     * Services Support.
     * </p>
     * </important>
     * 
     * @param releasePhoneNumberRequest
     * @return A Java Future containing the result of the ReleasePhoneNumber operation returned by the service.
     * @sample AmazonConnectAsync.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReleasePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest releasePhoneNumberRequest);

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance or traffic distribution group. You can
     * call this API only in the Amazon Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the <code>ReleasePhoneNumber</code> API, not the
     * Amazon Connect console.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown period of 30 days. It cannot be searched
     * for or claimed again until the period has ended. If you accidentally release a phone number, contact Amazon Web
     * Services Support.
     * </p>
     * </important>
     * 
     * @param releasePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleasePhoneNumber operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReleasePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest releasePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<ReleasePhoneNumberRequest, ReleasePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web Services Region.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html">Create a
     * replica of your existing Amazon Connect instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @return A Java Future containing the result of the ReplicateInstance operation returned by the service.
     * @sample AmazonConnectAsync.ReplicateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReplicateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplicateInstanceResult> replicateInstanceAsync(ReplicateInstanceRequest replicateInstanceRequest);

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web Services Region.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html">Create a
     * replica of your existing Amazon Connect instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplicateInstance operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ReplicateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReplicateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReplicateInstanceResult> replicateInstanceAsync(ReplicateInstanceRequest replicateInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<ReplicateInstanceRequest, ReplicateInstanceResult> asyncHandler);

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API
     * resumes recording the call.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return A Java Future containing the result of the ResumeContactRecording operation returned by the service.
     * @sample AmazonConnectAsync.ResumeContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(ResumeContactRecordingRequest resumeContactRecordingRequest);

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API
     * resumes recording the call.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeContactRecording operation returned by the service.
     * @sample AmazonConnectAsyncHandler.ResumeContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(ResumeContactRecordingRequest resumeContactRecordingRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeContactRecordingRequest, ResumeContactRecordingResult> asyncHandler);

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group. If the provided <code>TargetArn</code> is a traffic distribution group, you can call this API in both
     * Amazon Web Services Regions associated with the traffic distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonConnectAsync.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group. If the provided <code>TargetArn</code> is a traffic distribution group, you can call this API in both
     * Amazon Web Services Regions associated with the traffic distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @return A Java Future containing the result of the SearchQueues operation returned by the service.
     * @sample AmazonConnectAsync.SearchQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchQueuesResult> searchQueuesAsync(SearchQueuesRequest searchQueuesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchQueues operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SearchQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchQueuesResult> searchQueuesAsync(SearchQueuesRequest searchQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchQueuesRequest, SearchQueuesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @return A Java Future containing the result of the SearchRoutingProfiles operation returned by the service.
     * @sample AmazonConnectAsync.SearchRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(SearchRoutingProfilesRequest searchRoutingProfilesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchRoutingProfiles operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SearchRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(SearchRoutingProfilesRequest searchRoutingProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRoutingProfilesRequest, SearchRoutingProfilesResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @return A Java Future containing the result of the SearchSecurityProfiles operation returned by the service.
     * @sample AmazonConnectAsync.SearchSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(SearchSecurityProfilesRequest searchSecurityProfilesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSecurityProfiles operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SearchSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(SearchSecurityProfilesRequest searchSecurityProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSecurityProfilesRequest, SearchSecurityProfilesResult> asyncHandler);

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @return A Java Future containing the result of the SearchUsers operation returned by the service.
     * @sample AmazonConnectAsync.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest searchUsersRequest);

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchUsers operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest searchUsersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchUsersRequest, SearchUsersResult> asyncHandler);

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using <code>State</code>,
     * <code>NameStartsWith</code>, and <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return A Java Future containing the result of the SearchVocabularies operation returned by the service.
     * @sample AmazonConnectAsync.SearchVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchVocabularies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchVocabulariesResult> searchVocabulariesAsync(SearchVocabulariesRequest searchVocabulariesRequest);

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using <code>State</code>,
     * <code>NameStartsWith</code>, and <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchVocabularies operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SearchVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchVocabularies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchVocabulariesResult> searchVocabulariesAsync(SearchVocabulariesRequest searchVocabulariesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchVocabulariesRequest, SearchVocabulariesResult> asyncHandler);

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this API provides a token required to obtain
     * credentials from the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe to the participant’s connection for the
     * created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">quota for
     * concurrent active chats</a> is exceeded. Active chat throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a 400 error, your account may not support
     * the ability to configure custom chat durations. For more information, contact Amazon Web Services Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html">Chat</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return A Java Future containing the result of the StartChatContact operation returned by the service.
     * @sample AmazonConnectAsync.StartChatContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(StartChatContactRequest startChatContactRequest);

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this API provides a token required to obtain
     * credentials from the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe to the participant’s connection for the
     * created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">quota for
     * concurrent active chats</a> is exceeded. Active chat throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a 400 error, your account may not support
     * the ability to configure custom chat durations. For more information, contact Amazon Web Services Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html">Chat</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartChatContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StartChatContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(StartChatContactRequest startChatContactRequest,
            com.amazonaws.handlers.AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler);

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an
     * ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started
     * and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card
     * number), use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html">Set recording
     * behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return A Java Future containing the result of the StartContactRecording operation returned by the service.
     * @sample AmazonConnectAsync.StartContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(StartContactRecordingRequest startContactRecordingRequest);

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an
     * ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started
     * and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card
     * number), use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html">Set recording
     * behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartContactRecording operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StartContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(StartContactRecordingRequest startContactRecordingRequest,
            com.amazonaws.handlers.AsyncHandler<StartContactRecordingRequest, StartContactRecordingResult> asyncHandler);

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html">Enable real-time chat
     * message streaming</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @return A Java Future containing the result of the StartContactStreaming operation returned by the service.
     * @sample AmazonConnectAsync.StartContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartContactStreamingResult> startContactStreamingAsync(StartContactStreamingRequest startContactStreamingRequest);

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html">Enable real-time chat
     * message streaming</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartContactStreaming operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StartContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartContactStreamingResult> startContactStreamingAsync(StartContactStreamingRequest startContactStreamingRequest,
            com.amazonaws.handlers.AsyncHandler<StartContactStreamingRequest, StartContactStreamingResult> asyncHandler);

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It performs the actions in the flow that's
     * specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not dial the contact. If the flow places an
     * outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent, like any
     * other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must
     * submit a service quota increase request. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call with <code>TrafficType</code> =
     * <code>CAMPAIGN</code>, you must submit a service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @return A Java Future containing the result of the StartOutboundVoiceContact operation returned by the service.
     * @sample AmazonConnectAsync.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest);

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It performs the actions in the flow that's
     * specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not dial the contact. If the flow places an
     * outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent, like any
     * other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must
     * submit a service quota increase request. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call with <code>TrafficType</code> =
     * <code>CAMPAIGN</code>, you must submit a service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOutboundVoiceContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest,
            com.amazonaws.handlers.AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler);

    /**
     * <p>
     * Initiates a flow to start a new task.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return A Java Future containing the result of the StartTaskContact operation returned by the service.
     * @sample AmazonConnectAsync.StartTaskContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartTaskContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTaskContactResult> startTaskContactAsync(StartTaskContactRequest startTaskContactRequest);

    /**
     * <p>
     * Initiates a flow to start a new task.
     * </p>
     * 
     * @param startTaskContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTaskContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StartTaskContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartTaskContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTaskContactResult> startTaskContactAsync(StartTaskContactRequest startTaskContactRequest,
            com.amazonaws.handlers.AsyncHandler<StartTaskContactRequest, StartTaskContactResult> asyncHandler);

    /**
     * <p>
     * Ends the specified contact. This call does not work for the following initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopContactRequest
     * @return A Java Future containing the result of the StopContact operation returned by the service.
     * @sample AmazonConnectAsync.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest);

    /**
     * <p>
     * Ends the specified contact. This call does not work for the following initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest,
            com.amazonaws.handlers.AsyncHandler<StopContactRequest, StopContactResult> asyncHandler);

    /**
     * <p>
     * Stops recording a call when a contact is being recorded. StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For
     * scenarios where the recording has started and you want to suspend it for sensitive information (for example, to
     * collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return A Java Future containing the result of the StopContactRecording operation returned by the service.
     * @sample AmazonConnectAsync.StopContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(StopContactRecordingRequest stopContactRecordingRequest);

    /**
     * <p>
     * Stops recording a call when a contact is being recorded. StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For
     * scenarios where the recording has started and you want to suspend it for sensitive information (for example, to
     * collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopContactRecording operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StopContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(StopContactRecordingRequest stopContactRecordingRequest,
            com.amazonaws.handlers.AsyncHandler<StopContactRecordingRequest, StopContactRecordingResult> asyncHandler);

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message streaming on that contact, call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return A Java Future containing the result of the StopContactStreaming operation returned by the service.
     * @sample AmazonConnectAsync.StopContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopContactStreamingResult> stopContactStreamingAsync(StopContactStreamingRequest stopContactStreamingRequest);

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message streaming on that contact, call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopContactStreaming operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StopContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopContactStreamingResult> stopContactStreamingAsync(StopContactStreamingRequest stopContactStreamingRequest,
            com.amazonaws.handlers.AsyncHandler<StopContactStreamingRequest, StopContactStreamingResult> asyncHandler);

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call
     * recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording
     * to restart recording.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence in the final recording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return A Java Future containing the result of the SuspendContactRecording operation returned by the service.
     * @sample AmazonConnectAsync.SuspendContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SuspendContactRecording"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(SuspendContactRecordingRequest suspendContactRecordingRequest);

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call
     * recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording
     * to restart recording.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence in the final recording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SuspendContactRecording operation returned by the service.
     * @sample AmazonConnectAsyncHandler.SuspendContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SuspendContactRecording"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(SuspendContactRecordingRequest suspendContactRecordingRequest,
            com.amazonaws.handlers.AsyncHandler<SuspendContactRecordingRequest, SuspendContactRecordingResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles, queues, quick connects, contact flows, agent
     * statuses, hours of operation, phone numbers, security profiles, and task templates. For a complete list, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html">Tagging resources in Amazon
     * Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles, queues, quick connects, contact flows, agent
     * statuses, hours of operation, phone numbers, security profiles, and task templates. For a complete list, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html">Tagging resources in Amazon
     * Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Transfers contacts from one agent or queue to another agent or queue at any point after a contact is created. You
     * can transfer a contact to another queue by providing the flow which orchestrates the contact to the destination
     * queue. This gives you more control over contact handling and helps you adhere to the service level agreement
     * (SLA) guaranteed to your customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @return A Java Future containing the result of the TransferContact operation returned by the service.
     * @sample AmazonConnectAsync.TransferContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TransferContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TransferContactResult> transferContactAsync(TransferContactRequest transferContactRequest);

    /**
     * <p>
     * Transfers contacts from one agent or queue to another agent or queue at any point after a contact is created. You
     * can transfer a contact to another queue by providing the flow which orchestrates the contact to the destination
     * queue. This gives you more control over contact handling and helps you adhere to the service level agreement
     * (SLA) guaranteed to your customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransferContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.TransferContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TransferContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TransferContactResult> transferContactAsync(TransferContactRequest transferContactRequest,
            com.amazonaws.handlers.AsyncHandler<TransferContactRequest, TransferContactResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConnectAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @return A Java Future containing the result of the UpdateAgentStatus operation returned by the service.
     * @sample AmazonConnectAsync.UpdateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentStatusResult> updateAgentStatusAsync(UpdateAgentStatusRequest updateAgentStatusRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentStatus operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentStatusResult> updateAgentStatusAsync(UpdateAgentStatusRequest updateAgentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentStatusRequest, UpdateAgentStatusResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the specified contact. At least one field to be
     * updated must be present in the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @return A Java Future containing the result of the UpdateContact operation returned by the service.
     * @sample AmazonConnectAsync.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the specified contact. At least one field to be
     * updated must be present in the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler);

    /**
     * <p>
     * Creates or updates user-defined contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and completed contacts. For example, while the
     * call is active, you can update the customer's name or the reason the customer called. You can add notes about
     * steps that the agent took during the call that display to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about
     * contact record retention and the maximum size of the contact record attributes section, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return A Java Future containing the result of the UpdateContactAttributes operation returned by the service.
     * @sample AmazonConnectAsync.UpdateContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(UpdateContactAttributesRequest updateContactAttributesRequest);

    /**
     * <p>
     * Creates or updates user-defined contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and completed contacts. For example, while the
     * call is active, you can update the customer's name or the reason the customer called. You can add notes about
     * steps that the agent took during the call that display to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about
     * contact record retention and the maximum size of the contact record attributes section, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactAttributes operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(UpdateContactAttributesRequest updateContactAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return A Java Future containing the result of the UpdateContactFlowContent operation returned by the service.
     * @sample AmazonConnectAsync.UpdateContactFlowContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(UpdateContactFlowContentRequest updateContactFlowContentRequest);

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactFlowContent operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateContactFlowContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(UpdateContactFlowContentRequest updateContactFlowContentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactFlowContentRequest, UpdateContactFlowContentResult> asyncHandler);

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @return A Java Future containing the result of the UpdateContactFlowMetadata operation returned by the service.
     * @sample AmazonConnectAsync.UpdateContactFlowMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(
            UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest);

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactFlowMetadata operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateContactFlowMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(
            UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactFlowMetadataRequest, UpdateContactFlowMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return A Java Future containing the result of the UpdateContactFlowModuleContent operation returned by the
     *         service.
     * @sample AmazonConnectAsync.UpdateContactFlowModuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest);

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactFlowModuleContent operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.UpdateContactFlowModuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactFlowModuleContentRequest, UpdateContactFlowModuleContentResult> asyncHandler);

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return A Java Future containing the result of the UpdateContactFlowModuleMetadata operation returned by the
     *         service.
     * @sample AmazonConnectAsync.UpdateContactFlowModuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest);

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactFlowModuleMetadata operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.UpdateContactFlowModuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactFlowModuleMetadataRequest, UpdateContactFlowModuleMetadataResult> asyncHandler);

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return A Java Future containing the result of the UpdateContactFlowName operation returned by the service.
     * @sample AmazonConnectAsync.UpdateContactFlowName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowName" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(UpdateContactFlowNameRequest updateContactFlowNameRequest);

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactFlowName operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateContactFlowName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowName" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(UpdateContactFlowNameRequest updateContactFlowNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactFlowNameRequest, UpdateContactFlowNameResult> asyncHandler);

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return A Java Future containing the result of the UpdateContactSchedule operation returned by the service.
     * @sample AmazonConnectAsync.UpdateContactSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactScheduleResult> updateContactScheduleAsync(UpdateContactScheduleRequest updateContactScheduleRequest);

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactSchedule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateContactSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactScheduleResult> updateContactScheduleAsync(UpdateContactScheduleRequest updateContactScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactScheduleRequest, UpdateContactScheduleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @return A Java Future containing the result of the UpdateHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsync.UpdateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHoursOfOperationResult> updateHoursOfOperationAsync(UpdateHoursOfOperationRequest updateHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHoursOfOperationResult> updateHoursOfOperationAsync(UpdateHoursOfOperationRequest updateHoursOfOperationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHoursOfOperationRequest, UpdateHoursOfOperationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return A Java Future containing the result of the UpdateInstanceAttribute operation returned by the service.
     * @sample AmazonConnectAsync.UpdateInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceAttributeResult> updateInstanceAttributeAsync(UpdateInstanceAttributeRequest updateInstanceAttributeRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstanceAttribute operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceAttributeResult> updateInstanceAttributeAsync(UpdateInstanceAttributeRequest updateInstanceAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceAttributeRequest, UpdateInstanceAttributeResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return A Java Future containing the result of the UpdateInstanceStorageConfig operation returned by the service.
     * @sample AmazonConnectAsync.UpdateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceStorageConfigResult> updateInstanceStorageConfigAsync(
            UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstanceStorageConfig operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceStorageConfigResult> updateInstanceStorageConfigAsync(
            UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceStorageConfigRequest, UpdateInstanceStorageConfigResult> asyncHandler);

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered idle, and when agents are automatically
     * disconnected from a chat due to idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html">Set up chat timeouts for
     * human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @return A Java Future containing the result of the UpdateParticipantRoleConfig operation returned by the service.
     * @sample AmazonConnectAsync.UpdateParticipantRoleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateParticipantRoleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(
            UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest);

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered idle, and when agents are automatically
     * disconnected from a chat due to idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html">Set up chat timeouts for
     * human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateParticipantRoleConfig operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateParticipantRoleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateParticipantRoleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(
            UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateParticipantRoleConfigRequest, UpdateParticipantRoleConfigResult> asyncHandler);

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect instance or traffic distribution group to
     * another Amazon Connect instance or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html">DescribePhoneNumber
     * </a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonConnectAsync.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect instance or traffic distribution group to
     * another Amazon Connect instance or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html">DescribePhoneNumber
     * </a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @return A Java Future containing the result of the UpdateQueueHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsync.UpdateQueueHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueHoursOfOperationResult> updateQueueHoursOfOperationAsync(
            UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueHoursOfOperation operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateQueueHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueHoursOfOperationResult> updateQueueHoursOfOperationAsync(
            UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueHoursOfOperationRequest, UpdateQueueHoursOfOperationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @return A Java Future containing the result of the UpdateQueueMaxContacts operation returned by the service.
     * @sample AmazonConnectAsync.UpdateQueueMaxContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueMaxContacts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueMaxContactsResult> updateQueueMaxContactsAsync(UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueMaxContacts operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateQueueMaxContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueMaxContacts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueMaxContactsResult> updateQueueMaxContactsAsync(UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueMaxContactsRequest, UpdateQueueMaxContactsResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code> or <code>Description</code> must be
     * provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @return A Java Future containing the result of the UpdateQueueName operation returned by the service.
     * @sample AmazonConnectAsync.UpdateQueueName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueNameResult> updateQueueNameAsync(UpdateQueueNameRequest updateQueueNameRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code> or <code>Description</code> must be
     * provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueName operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateQueueName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueNameResult> updateQueueNameAsync(UpdateQueueNameRequest updateQueueNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueNameRequest, UpdateQueueNameResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow for a specified queue.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic distribution group, and you are calling this API
     * using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use
     * either a full phone number ARN or UUID value for the <code>OutboundCallerIdNumberId</code> value of the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig">OutboundCallerConfig</a>
     * request body parameter. However, if the number is claimed to a traffic distribution group and you are calling
     * this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution
     * group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @return A Java Future containing the result of the UpdateQueueOutboundCallerConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsync.UpdateQueueOutboundCallerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueOutboundCallerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueOutboundCallerConfigResult> updateQueueOutboundCallerConfigAsync(
            UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow for a specified queue.
     * </p>
     * <important>
     * <p>
     * If the number being used in the input is claimed to a traffic distribution group, and you are calling this API
     * using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use
     * either a full phone number ARN or UUID value for the <code>OutboundCallerIdNumberId</code> value of the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_OutboundCallerConfig">OutboundCallerConfig</a>
     * request body parameter. However, if the number is claimed to a traffic distribution group and you are calling
     * this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution
     * group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueOutboundCallerConfig operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.UpdateQueueOutboundCallerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueOutboundCallerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueOutboundCallerConfigResult> updateQueueOutboundCallerConfigAsync(
            UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueOutboundCallerConfigRequest, UpdateQueueOutboundCallerConfigResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @return A Java Future containing the result of the UpdateQueueStatus operation returned by the service.
     * @sample AmazonConnectAsync.UpdateQueueStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueStatusResult> updateQueueStatusAsync(UpdateQueueStatusRequest updateQueueStatusRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueStatus operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateQueueStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueStatusResult> updateQueueStatusAsync(UpdateQueueStatusRequest updateQueueStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueStatusRequest, UpdateQueueStatusResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @return A Java Future containing the result of the UpdateQuickConnectConfig operation returned by the service.
     * @sample AmazonConnectAsync.UpdateQuickConnectConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuickConnectConfigResult> updateQuickConnectConfigAsync(UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest);

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQuickConnectConfig operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateQuickConnectConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuickConnectConfigResult> updateQuickConnectConfigAsync(UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQuickConnectConfigRequest, UpdateQuickConnectConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @return A Java Future containing the result of the UpdateQuickConnectName operation returned by the service.
     * @sample AmazonConnectAsync.UpdateQuickConnectName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectName" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuickConnectNameResult> updateQuickConnectNameAsync(UpdateQuickConnectNameRequest updateQuickConnectNameRequest);

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQuickConnectName operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateQuickConnectName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectName" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuickConnectNameResult> updateQuickConnectNameAsync(UpdateQuickConnectNameRequest updateQuickConnectNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQuickConnectNameRequest, UpdateQuickConnectNameResult> asyncHandler);

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return A Java Future containing the result of the UpdateRoutingProfileConcurrency operation returned by the
     *         service.
     * @sample AmazonConnectAsync.UpdateRoutingProfileConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest);

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingProfileConcurrency operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.UpdateRoutingProfileConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileConcurrencyRequest, UpdateRoutingProfileConcurrencyResult> asyncHandler);

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return A Java Future containing the result of the UpdateRoutingProfileDefaultOutboundQueue operation returned by
     *         the service.
     * @sample AmazonConnectAsync.UpdateRoutingProfileDefaultOutboundQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileDefaultOutboundQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest);

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingProfileDefaultOutboundQueue operation returned by
     *         the service.
     * @sample AmazonConnectAsyncHandler.UpdateRoutingProfileDefaultOutboundQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileDefaultOutboundQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileDefaultOutboundQueueRequest, UpdateRoutingProfileDefaultOutboundQueueResult> asyncHandler);

    /**
     * <p>
     * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return A Java Future containing the result of the UpdateRoutingProfileName operation returned by the service.
     * @sample AmazonConnectAsync.UpdateRoutingProfileName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest);

    /**
     * <p>
     * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingProfileName operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateRoutingProfileName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileNameRequest, UpdateRoutingProfileNameResult> asyncHandler);

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return A Java Future containing the result of the UpdateRoutingProfileQueues operation returned by the service.
     * @sample AmazonConnectAsync.UpdateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(
            UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingProfileQueues operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(
            UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileQueuesRequest, UpdateRoutingProfileQueuesResult> asyncHandler);

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AmazonConnectAsync.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest);

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return A Java Future containing the result of the UpdateSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsync.UpdateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityProfileResult> updateSecurityProfileAsync(UpdateSecurityProfileRequest updateSecurityProfileRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityProfileResult> updateSecurityProfileAsync(UpdateSecurityProfileRequest updateSecurityProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityProfileRequest, UpdateSecurityProfileResult> asyncHandler);

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon Connect instance. This operation does not
     * support partial updates. Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @return A Java Future containing the result of the UpdateTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsync.UpdateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(UpdateTaskTemplateRequest updateTaskTemplateRequest);

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon Connect instance. This operation does not
     * support partial updates. Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTaskTemplate operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(UpdateTaskTemplateRequest updateTaskTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTaskTemplateRequest, UpdateTaskTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html">Update
     * telephony traffic distribution across Amazon Web Services Regions </a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @return A Java Future containing the result of the UpdateTrafficDistribution operation returned by the service.
     * @sample AmazonConnectAsync.UpdateTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTrafficDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(
            UpdateTrafficDistributionRequest updateTrafficDistributionRequest);

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html">Update
     * telephony traffic distribution across Amazon Web Services Regions </a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrafficDistribution operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTrafficDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(
            UpdateTrafficDistributionRequest updateTrafficDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficDistributionRequest, UpdateTrafficDistributionResult> asyncHandler);

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return A Java Future containing the result of the UpdateUserHierarchy operation returned by the service.
     * @sample AmazonConnectAsync.UpdateUserHierarchy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(UpdateUserHierarchyRequest updateUserHierarchyRequest);

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserHierarchy operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateUserHierarchy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(UpdateUserHierarchyRequest updateUserHierarchyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyRequest, UpdateUserHierarchyResult> asyncHandler);

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return A Java Future containing the result of the UpdateUserHierarchyGroupName operation returned by the
     *         service.
     * @sample AmazonConnectAsync.UpdateUserHierarchyGroupName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyGroupName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(
            UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest);

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserHierarchyGroupName operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.UpdateUserHierarchyGroupName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyGroupName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(
            UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyGroupNameRequest, UpdateUserHierarchyGroupNameResult> asyncHandler);

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return A Java Future containing the result of the UpdateUserHierarchyStructure operation returned by the
     *         service.
     * @sample AmazonConnectAsync.UpdateUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(
            UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest);

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserHierarchyStructure operation returned by the
     *         service.
     * @sample AmazonConnectAsyncHandler.UpdateUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(
            UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyStructureRequest, UpdateUserHierarchyStructureResult> asyncHandler);

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke <code>UpdateUserIdentityInfo</code>. Someone with
     * that ability can change the login credentials of other users by changing their email address. This poses a
     * security risk to your organization. They can change the email address of a user to the attacker's email address,
     * and then reset the password through email. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best Practices
     * for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @return A Java Future containing the result of the UpdateUserIdentityInfo operation returned by the service.
     * @sample AmazonConnectAsync.UpdateUserIdentityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserIdentityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest);

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke <code>UpdateUserIdentityInfo</code>. Someone with
     * that ability can change the login credentials of other users by changing their email address. This poses a
     * security risk to your organization. They can change the email address of a user to the attacker's email address,
     * and then reset the password through email. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best Practices
     * for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserIdentityInfo operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateUserIdentityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserIdentityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserIdentityInfoRequest, UpdateUserIdentityInfoResult> asyncHandler);

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return A Java Future containing the result of the UpdateUserPhoneConfig operation returned by the service.
     * @sample AmazonConnectAsync.UpdateUserPhoneConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserPhoneConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest);

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserPhoneConfig operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateUserPhoneConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserPhoneConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPhoneConfigRequest, UpdateUserPhoneConfigResult> asyncHandler);

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return A Java Future containing the result of the UpdateUserRoutingProfile operation returned by the service.
     * @sample AmazonConnectAsync.UpdateUserRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserRoutingProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest);

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserRoutingProfile operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateUserRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserRoutingProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRoutingProfileRequest, UpdateUserRoutingProfileResult> asyncHandler);

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return A Java Future containing the result of the UpdateUserSecurityProfiles operation returned by the service.
     * @sample AmazonConnectAsync.UpdateUserSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserSecurityProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest);

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserSecurityProfiles operation returned by the service.
     * @sample AmazonConnectAsyncHandler.UpdateUserSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserSecurityProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserSecurityProfilesRequest, UpdateUserSecurityProfilesResult> asyncHandler);

}
