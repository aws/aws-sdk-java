/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chatbot;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;

/**
 * Interface for accessing AWS Chatbot asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chatbot.AbstractAWSChatbotAsync} instead.
 * </p>
 * <p>
 * AWS Chatbot API
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSChatbotAsync extends AWSChatbot {

    /**
     * Creates Chime Webhook Configuration
     * 
     * @param createChimeWebhookConfigurationRequest
     * @return A Java Future containing the result of the CreateChimeWebhookConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsync.CreateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChimeWebhookConfigurationResult> createChimeWebhookConfigurationAsync(
            CreateChimeWebhookConfigurationRequest createChimeWebhookConfigurationRequest);

    /**
     * Creates Chime Webhook Configuration
     * 
     * @param createChimeWebhookConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChimeWebhookConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.CreateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChimeWebhookConfigurationResult> createChimeWebhookConfigurationAsync(
            CreateChimeWebhookConfigurationRequest createChimeWebhookConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChimeWebhookConfigurationRequest, CreateChimeWebhookConfigurationResult> asyncHandler);

    /**
     * Creates MS Teams Channel Configuration
     * 
     * @param createMicrosoftTeamsChannelConfigurationRequest
     * @return A Java Future containing the result of the CreateMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsync.CreateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMicrosoftTeamsChannelConfigurationResult> createMicrosoftTeamsChannelConfigurationAsync(
            CreateMicrosoftTeamsChannelConfigurationRequest createMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Creates MS Teams Channel Configuration
     * 
     * @param createMicrosoftTeamsChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsyncHandler.CreateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMicrosoftTeamsChannelConfigurationResult> createMicrosoftTeamsChannelConfigurationAsync(
            CreateMicrosoftTeamsChannelConfigurationRequest createMicrosoftTeamsChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMicrosoftTeamsChannelConfigurationRequest, CreateMicrosoftTeamsChannelConfigurationResult> asyncHandler);

    /**
     * Creates Slack Channel Configuration
     * 
     * @param createSlackChannelConfigurationRequest
     * @return A Java Future containing the result of the CreateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsync.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest);

    /**
     * Creates Slack Channel Configuration
     * 
     * @param createSlackChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSlackChannelConfigurationRequest, CreateSlackChannelConfigurationResult> asyncHandler);

    /**
     * Deletes a Chime Webhook Configuration
     * 
     * @param deleteChimeWebhookConfigurationRequest
     * @return A Java Future containing the result of the DeleteChimeWebhookConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DeleteChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChimeWebhookConfigurationResult> deleteChimeWebhookConfigurationAsync(
            DeleteChimeWebhookConfigurationRequest deleteChimeWebhookConfigurationRequest);

    /**
     * Deletes a Chime Webhook Configuration
     * 
     * @param deleteChimeWebhookConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChimeWebhookConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DeleteChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChimeWebhookConfigurationResult> deleteChimeWebhookConfigurationAsync(
            DeleteChimeWebhookConfigurationRequest deleteChimeWebhookConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChimeWebhookConfigurationRequest, DeleteChimeWebhookConfigurationResult> asyncHandler);

    /**
     * Deletes MS Teams Channel Configuration
     * 
     * @param deleteMicrosoftTeamsChannelConfigurationRequest
     * @return A Java Future containing the result of the DeleteMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsync.DeleteMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMicrosoftTeamsChannelConfigurationResult> deleteMicrosoftTeamsChannelConfigurationAsync(
            DeleteMicrosoftTeamsChannelConfigurationRequest deleteMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Deletes MS Teams Channel Configuration
     * 
     * @param deleteMicrosoftTeamsChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsyncHandler.DeleteMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMicrosoftTeamsChannelConfigurationResult> deleteMicrosoftTeamsChannelConfigurationAsync(
            DeleteMicrosoftTeamsChannelConfigurationRequest deleteMicrosoftTeamsChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsChannelConfigurationRequest, DeleteMicrosoftTeamsChannelConfigurationResult> asyncHandler);

    /**
     * Deletes the Microsoft Teams team authorization allowing for channels to be configured in that Microsoft Teams
     * team. Note that the Microsoft Teams team must have no channels configured to remove it.
     * 
     * @param deleteMicrosoftTeamsConfiguredTeamRequest
     * @return A Java Future containing the result of the DeleteMicrosoftTeamsConfiguredTeam operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DeleteMicrosoftTeamsConfiguredTeam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsConfiguredTeam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMicrosoftTeamsConfiguredTeamResult> deleteMicrosoftTeamsConfiguredTeamAsync(
            DeleteMicrosoftTeamsConfiguredTeamRequest deleteMicrosoftTeamsConfiguredTeamRequest);

    /**
     * Deletes the Microsoft Teams team authorization allowing for channels to be configured in that Microsoft Teams
     * team. Note that the Microsoft Teams team must have no channels configured to remove it.
     * 
     * @param deleteMicrosoftTeamsConfiguredTeamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMicrosoftTeamsConfiguredTeam operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DeleteMicrosoftTeamsConfiguredTeam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsConfiguredTeam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMicrosoftTeamsConfiguredTeamResult> deleteMicrosoftTeamsConfiguredTeamAsync(
            DeleteMicrosoftTeamsConfiguredTeamRequest deleteMicrosoftTeamsConfiguredTeamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsConfiguredTeamRequest, DeleteMicrosoftTeamsConfiguredTeamResult> asyncHandler);

    /**
     * Deletes a Teams user identity
     * 
     * @param deleteMicrosoftTeamsUserIdentityRequest
     * @return A Java Future containing the result of the DeleteMicrosoftTeamsUserIdentity operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DeleteMicrosoftTeamsUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMicrosoftTeamsUserIdentityResult> deleteMicrosoftTeamsUserIdentityAsync(
            DeleteMicrosoftTeamsUserIdentityRequest deleteMicrosoftTeamsUserIdentityRequest);

    /**
     * Deletes a Teams user identity
     * 
     * @param deleteMicrosoftTeamsUserIdentityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMicrosoftTeamsUserIdentity operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DeleteMicrosoftTeamsUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMicrosoftTeamsUserIdentityResult> deleteMicrosoftTeamsUserIdentityAsync(
            DeleteMicrosoftTeamsUserIdentityRequest deleteMicrosoftTeamsUserIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsUserIdentityRequest, DeleteMicrosoftTeamsUserIdentityResult> asyncHandler);

    /**
     * Deletes Slack Channel Configuration
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @return A Java Future containing the result of the DeleteSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest);

    /**
     * Deletes Slack Channel Configuration
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackChannelConfigurationRequest, DeleteSlackChannelConfigurationResult> asyncHandler);

    /**
     * Deletes a Slack user identity
     * 
     * @param deleteSlackUserIdentityRequest
     * @return A Java Future containing the result of the DeleteSlackUserIdentity operation returned by the service.
     * @sample AWSChatbotAsync.DeleteSlackUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackUserIdentityResult> deleteSlackUserIdentityAsync(DeleteSlackUserIdentityRequest deleteSlackUserIdentityRequest);

    /**
     * Deletes a Slack user identity
     * 
     * @param deleteSlackUserIdentityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlackUserIdentity operation returned by the service.
     * @sample AWSChatbotAsyncHandler.DeleteSlackUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackUserIdentityResult> deleteSlackUserIdentityAsync(DeleteSlackUserIdentityRequest deleteSlackUserIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackUserIdentityRequest, DeleteSlackUserIdentityResult> asyncHandler);

    /**
     * Deletes the Slack workspace authorization that allows channels to be configured in that workspace. This requires
     * all configured channels in the workspace to be deleted.
     * 
     * @param deleteSlackWorkspaceAuthorizationRequest
     * @return A Java Future containing the result of the DeleteSlackWorkspaceAuthorization operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DeleteSlackWorkspaceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackWorkspaceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackWorkspaceAuthorizationResult> deleteSlackWorkspaceAuthorizationAsync(
            DeleteSlackWorkspaceAuthorizationRequest deleteSlackWorkspaceAuthorizationRequest);

    /**
     * Deletes the Slack workspace authorization that allows channels to be configured in that workspace. This requires
     * all configured channels in the workspace to be deleted.
     * 
     * @param deleteSlackWorkspaceAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlackWorkspaceAuthorization operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DeleteSlackWorkspaceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackWorkspaceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackWorkspaceAuthorizationResult> deleteSlackWorkspaceAuthorizationAsync(
            DeleteSlackWorkspaceAuthorizationRequest deleteSlackWorkspaceAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackWorkspaceAuthorizationRequest, DeleteSlackWorkspaceAuthorizationResult> asyncHandler);

    /**
     * Lists Chime Webhook Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeChimeWebhookConfigurationsRequest
     * @return A Java Future containing the result of the DescribeChimeWebhookConfigurations operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DescribeChimeWebhookConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeChimeWebhookConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChimeWebhookConfigurationsResult> describeChimeWebhookConfigurationsAsync(
            DescribeChimeWebhookConfigurationsRequest describeChimeWebhookConfigurationsRequest);

    /**
     * Lists Chime Webhook Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeChimeWebhookConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChimeWebhookConfigurations operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DescribeChimeWebhookConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeChimeWebhookConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChimeWebhookConfigurationsResult> describeChimeWebhookConfigurationsAsync(
            DescribeChimeWebhookConfigurationsRequest describeChimeWebhookConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChimeWebhookConfigurationsRequest, DescribeChimeWebhookConfigurationsResult> asyncHandler);

    /**
     * Lists Slack Channel Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeSlackChannelConfigurationsRequest
     * @return A Java Future containing the result of the DescribeSlackChannelConfigurations operation returned by the
     *         service.
     * @sample AWSChatbotAsync.DescribeSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlackChannelConfigurationsResult> describeSlackChannelConfigurationsAsync(
            DescribeSlackChannelConfigurationsRequest describeSlackChannelConfigurationsRequest);

    /**
     * Lists Slack Channel Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeSlackChannelConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSlackChannelConfigurations operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.DescribeSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlackChannelConfigurationsResult> describeSlackChannelConfigurationsAsync(
            DescribeSlackChannelConfigurationsRequest describeSlackChannelConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSlackChannelConfigurationsRequest, DescribeSlackChannelConfigurationsResult> asyncHandler);

    /**
     * Lists all Slack user identities with a mapped role.
     * 
     * @param describeSlackUserIdentitiesRequest
     * @return A Java Future containing the result of the DescribeSlackUserIdentities operation returned by the service.
     * @sample AWSChatbotAsync.DescribeSlackUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlackUserIdentitiesResult> describeSlackUserIdentitiesAsync(
            DescribeSlackUserIdentitiesRequest describeSlackUserIdentitiesRequest);

    /**
     * Lists all Slack user identities with a mapped role.
     * 
     * @param describeSlackUserIdentitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSlackUserIdentities operation returned by the service.
     * @sample AWSChatbotAsyncHandler.DescribeSlackUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlackUserIdentitiesResult> describeSlackUserIdentitiesAsync(
            DescribeSlackUserIdentitiesRequest describeSlackUserIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSlackUserIdentitiesRequest, DescribeSlackUserIdentitiesResult> asyncHandler);

    /**
     * Lists all authorized Slack Workspaces for AWS Account
     * 
     * @param describeSlackWorkspacesRequest
     * @return A Java Future containing the result of the DescribeSlackWorkspaces operation returned by the service.
     * @sample AWSChatbotAsync.DescribeSlackWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackWorkspaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlackWorkspacesResult> describeSlackWorkspacesAsync(DescribeSlackWorkspacesRequest describeSlackWorkspacesRequest);

    /**
     * Lists all authorized Slack Workspaces for AWS Account
     * 
     * @param describeSlackWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSlackWorkspaces operation returned by the service.
     * @sample AWSChatbotAsyncHandler.DescribeSlackWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackWorkspaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlackWorkspacesResult> describeSlackWorkspacesAsync(DescribeSlackWorkspacesRequest describeSlackWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSlackWorkspacesRequest, DescribeSlackWorkspacesResult> asyncHandler);

    /**
     * Get Chatbot account level preferences
     * 
     * @param getAccountPreferencesRequest
     * @return A Java Future containing the result of the GetAccountPreferences operation returned by the service.
     * @sample AWSChatbotAsync.GetAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetAccountPreferences" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountPreferencesResult> getAccountPreferencesAsync(GetAccountPreferencesRequest getAccountPreferencesRequest);

    /**
     * Get Chatbot account level preferences
     * 
     * @param getAccountPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountPreferences operation returned by the service.
     * @sample AWSChatbotAsyncHandler.GetAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetAccountPreferences" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountPreferencesResult> getAccountPreferencesAsync(GetAccountPreferencesRequest getAccountPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountPreferencesRequest, GetAccountPreferencesResult> asyncHandler);

    /**
     * Get a single MS Teams Channel Configurations
     * 
     * @param getMicrosoftTeamsChannelConfigurationRequest
     * @return A Java Future containing the result of the GetMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsync.GetMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMicrosoftTeamsChannelConfigurationResult> getMicrosoftTeamsChannelConfigurationAsync(
            GetMicrosoftTeamsChannelConfigurationRequest getMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Get a single MS Teams Channel Configurations
     * 
     * @param getMicrosoftTeamsChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsyncHandler.GetMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMicrosoftTeamsChannelConfigurationResult> getMicrosoftTeamsChannelConfigurationAsync(
            GetMicrosoftTeamsChannelConfigurationRequest getMicrosoftTeamsChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetMicrosoftTeamsChannelConfigurationRequest, GetMicrosoftTeamsChannelConfigurationResult> asyncHandler);

    /**
     * Lists MS Teams Channel Configurations optionally filtered by TeamId
     * 
     * @param listMicrosoftTeamsChannelConfigurationsRequest
     * @return A Java Future containing the result of the ListMicrosoftTeamsChannelConfigurations operation returned by
     *         the service.
     * @sample AWSChatbotAsync.ListMicrosoftTeamsChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMicrosoftTeamsChannelConfigurationsResult> listMicrosoftTeamsChannelConfigurationsAsync(
            ListMicrosoftTeamsChannelConfigurationsRequest listMicrosoftTeamsChannelConfigurationsRequest);

    /**
     * Lists MS Teams Channel Configurations optionally filtered by TeamId
     * 
     * @param listMicrosoftTeamsChannelConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMicrosoftTeamsChannelConfigurations operation returned by
     *         the service.
     * @sample AWSChatbotAsyncHandler.ListMicrosoftTeamsChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMicrosoftTeamsChannelConfigurationsResult> listMicrosoftTeamsChannelConfigurationsAsync(
            ListMicrosoftTeamsChannelConfigurationsRequest listMicrosoftTeamsChannelConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsChannelConfigurationsRequest, ListMicrosoftTeamsChannelConfigurationsResult> asyncHandler);

    /**
     * Lists all authorized MS teams for AWS Account
     * 
     * @param listMicrosoftTeamsConfiguredTeamsRequest
     * @return A Java Future containing the result of the ListMicrosoftTeamsConfiguredTeams operation returned by the
     *         service.
     * @sample AWSChatbotAsync.ListMicrosoftTeamsConfiguredTeams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsConfiguredTeams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMicrosoftTeamsConfiguredTeamsResult> listMicrosoftTeamsConfiguredTeamsAsync(
            ListMicrosoftTeamsConfiguredTeamsRequest listMicrosoftTeamsConfiguredTeamsRequest);

    /**
     * Lists all authorized MS teams for AWS Account
     * 
     * @param listMicrosoftTeamsConfiguredTeamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMicrosoftTeamsConfiguredTeams operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.ListMicrosoftTeamsConfiguredTeams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsConfiguredTeams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMicrosoftTeamsConfiguredTeamsResult> listMicrosoftTeamsConfiguredTeamsAsync(
            ListMicrosoftTeamsConfiguredTeamsRequest listMicrosoftTeamsConfiguredTeamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsConfiguredTeamsRequest, ListMicrosoftTeamsConfiguredTeamsResult> asyncHandler);

    /**
     * Lists all Microsoft Teams user identities with a mapped role.
     * 
     * @param listMicrosoftTeamsUserIdentitiesRequest
     * @return A Java Future containing the result of the ListMicrosoftTeamsUserIdentities operation returned by the
     *         service.
     * @sample AWSChatbotAsync.ListMicrosoftTeamsUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMicrosoftTeamsUserIdentitiesResult> listMicrosoftTeamsUserIdentitiesAsync(
            ListMicrosoftTeamsUserIdentitiesRequest listMicrosoftTeamsUserIdentitiesRequest);

    /**
     * Lists all Microsoft Teams user identities with a mapped role.
     * 
     * @param listMicrosoftTeamsUserIdentitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMicrosoftTeamsUserIdentities operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.ListMicrosoftTeamsUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMicrosoftTeamsUserIdentitiesResult> listMicrosoftTeamsUserIdentitiesAsync(
            ListMicrosoftTeamsUserIdentitiesRequest listMicrosoftTeamsUserIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsUserIdentitiesRequest, ListMicrosoftTeamsUserIdentitiesResult> asyncHandler);

    /**
     * Retrieves the list of tags applied to a configuration.
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSChatbotAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Retrieves the list of tags applied to a configuration.
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSChatbotAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Applies the supplied tags to a configuration.
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSChatbotAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * Applies the supplied tags to a configuration.
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSChatbotAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * Removes the supplied tags from a configuration
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSChatbotAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * Removes the supplied tags from a configuration
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSChatbotAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Update Chatbot account level preferences
     * 
     * @param updateAccountPreferencesRequest
     * @return A Java Future containing the result of the UpdateAccountPreferences operation returned by the service.
     * @sample AWSChatbotAsync.UpdateAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountPreferencesResult> updateAccountPreferencesAsync(UpdateAccountPreferencesRequest updateAccountPreferencesRequest);

    /**
     * Update Chatbot account level preferences
     * 
     * @param updateAccountPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountPreferences operation returned by the service.
     * @sample AWSChatbotAsyncHandler.UpdateAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountPreferencesResult> updateAccountPreferencesAsync(UpdateAccountPreferencesRequest updateAccountPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountPreferencesRequest, UpdateAccountPreferencesResult> asyncHandler);

    /**
     * Updates a Chime Webhook Configuration
     * 
     * @param updateChimeWebhookConfigurationRequest
     * @return A Java Future containing the result of the UpdateChimeWebhookConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsync.UpdateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChimeWebhookConfigurationResult> updateChimeWebhookConfigurationAsync(
            UpdateChimeWebhookConfigurationRequest updateChimeWebhookConfigurationRequest);

    /**
     * Updates a Chime Webhook Configuration
     * 
     * @param updateChimeWebhookConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChimeWebhookConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.UpdateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChimeWebhookConfigurationResult> updateChimeWebhookConfigurationAsync(
            UpdateChimeWebhookConfigurationRequest updateChimeWebhookConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChimeWebhookConfigurationRequest, UpdateChimeWebhookConfigurationResult> asyncHandler);

    /**
     * Updates MS Teams Channel Configuration
     * 
     * @param updateMicrosoftTeamsChannelConfigurationRequest
     * @return A Java Future containing the result of the UpdateMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsync.UpdateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMicrosoftTeamsChannelConfigurationResult> updateMicrosoftTeamsChannelConfigurationAsync(
            UpdateMicrosoftTeamsChannelConfigurationRequest updateMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Updates MS Teams Channel Configuration
     * 
     * @param updateMicrosoftTeamsChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMicrosoftTeamsChannelConfiguration operation returned by
     *         the service.
     * @sample AWSChatbotAsyncHandler.UpdateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMicrosoftTeamsChannelConfigurationResult> updateMicrosoftTeamsChannelConfigurationAsync(
            UpdateMicrosoftTeamsChannelConfigurationRequest updateMicrosoftTeamsChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMicrosoftTeamsChannelConfigurationRequest, UpdateMicrosoftTeamsChannelConfigurationResult> asyncHandler);

    /**
     * Updates Slack Channel Configuration
     * 
     * @param updateSlackChannelConfigurationRequest
     * @return A Java Future containing the result of the UpdateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsync.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest);

    /**
     * Updates Slack Channel Configuration
     * 
     * @param updateSlackChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSChatbotAsyncHandler.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSlackChannelConfigurationRequest, UpdateSlackChannelConfigurationResult> asyncHandler);

}
