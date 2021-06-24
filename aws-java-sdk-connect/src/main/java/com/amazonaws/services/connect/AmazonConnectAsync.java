/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You can connect programmatically to an AWS service by using an endpoint. For a list of Amazon Connect endpoints, see
 * <a href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect Endpoints</a>.
 * </p>
 * <note>
 * <p>
 * Working with contact flows? Check out the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
 * </p>
 * </note>
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
     * Creates a contact flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * Creates a contact flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * Create an AppIntegration association with an Amazon Connect instance.
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
     * Create an AppIntegration association with an Amazon Connect instance.
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
     * Creates a use case for an AppIntegration association.
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
     * Creates a use case for an AppIntegration association.
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
     * Deletes an AppIntegration association from an Amazon Connect instance. The association must not have any use
     * cases associated with it.
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
     * Deletes an AppIntegration association from an Amazon Connect instance. The association must not have any use
     * cases associated with it.
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
     * Deletes a use case from an AppIntegration association.
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
     * Deletes a use case from an AppIntegration association.
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
     * Describes the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * Describes the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * Remove the Lambda function from the dropdown options available in the relevant contact flow blocks.
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
     * Remove the Lambda function from the dropdown options available in the relevant contact flow blocks.
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
     * with the instance.
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
     * with the instance.
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
     * Provides information about the contact flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about contact flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Contact Flows</a> in the
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
     * Provides information about the contact flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about contact flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Contact Flows</a> in the
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
     * Provides summary information about the AppIntegration associations for the specified Amazon Connect instance.
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
     * Provides summary information about the AppIntegration associations for the specified Amazon Connect instance.
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
     * Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant contact
     * flow blocks.
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
     * Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant contact
     * flow blocks.
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
     * Returns a paginated list of all the Amazon Lex bots currently associated with the instance.
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
     * Returns a paginated list of all the Amazon Lex bots currently associated with the instance.
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
     * Lists the use cases.
     * </p>
     * 
     * @param listUseCasesRequest
     *        Provides summary information about the use cases for the specified Amazon Connect AppIntegration
     *        association.
     * @return A Java Future containing the result of the ListUseCases operation returned by the service.
     * @sample AmazonConnectAsync.ListUseCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUseCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest listUseCasesRequest);

    /**
     * <p>
     * Lists the use cases.
     * </p>
     * 
     * @param listUseCasesRequest
     *        Provides summary information about the use cases for the specified Amazon Connect AppIntegration
     *        association.
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
     * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to
     * obtain credentials from the <a
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
     * A 429 error occurs in two situations:
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
     * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to
     * obtain credentials from the <a
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
     * A 429 error occurs in two situations:
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
     * Starts recording the contact when the agent joins the call. StartContactRecording is a one-time action. For
     * example, if you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording
     * to restart it. For scenarios where the recording has started and you want to suspend and resume it, such as when
     * collecting sensitive information (for example, a credit card number), use SuspendContactRecording and
     * ResumeContactRecording.
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
     * Starts recording the contact when the agent joins the call. StartContactRecording is a one-time action. For
     * example, if you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording
     * to restart it. For scenarios where the recording has started and you want to suspend and resume it, such as when
     * collecting sensitive information (for example, a credit card number), use SuspendContactRecording and
     * ResumeContactRecording.
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
     * Places an outbound call to a contact, and then initiates the contact flow. It performs the actions in the contact
     * flow that's specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not dial the contact. If the contact flow
     * places an outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent,
     * like any other inbound case.
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
     * Places an outbound call to a contact, and then initiates the contact flow. It performs the actions in the contact
     * flow that's specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not dial the contact. If the contact flow
     * places an outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent,
     * like any other inbound case.
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
     * Initiates a contact flow to start a new task.
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
     * Initiates a contact flow to start a new task.
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
     * Ends the specified contact.
     * </p>
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
     * Ends the specified contact.
     * </p>
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
     * The supported resource types are users, routing profiles, queues, quick connects, and contact flows.
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
     * The supported resource types are users, routing profiles, queues, quick connects, and contact flows.
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
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about CTR
     * retention and the maximum size of the CTR attributes section, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for contacts that occurred prior to the
     * release of the API, which was September 12, 2018. You can update attributes only for contacts that started after
     * the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of
     * the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release
     * of the API but are still active in your instance.
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
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about CTR
     * retention and the maximum size of the CTR attributes section, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for contacts that occurred prior to the
     * release of the API, which was September 12, 2018. You can update attributes only for contacts that started after
     * the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of
     * the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release
     * of the API but are still active in your instance.
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
     * Updates the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * Updates the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * The name of the contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
     * The name of the contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
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
