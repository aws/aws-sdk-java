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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chatbot.model.*;

/**
 * Interface for accessing AWS Chatbot.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chatbot.AbstractAWSChatbot} instead.
 * </p>
 * <p>
 * AWS Chatbot API
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSChatbot {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "chatbot";

    /**
     * Creates Chime Webhook Configuration
     * 
     * @param createChimeWebhookConfigurationRequest
     * @return Result of the CreateChimeWebhookConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws LimitExceededException
     *         You have exceeded a service limit for AWS Chatbot.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws CreateChimeWebhookConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ConflictException
     *         There was an issue processing your request.
     * @sample AWSChatbot.CreateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChimeWebhookConfigurationResult createChimeWebhookConfiguration(CreateChimeWebhookConfigurationRequest createChimeWebhookConfigurationRequest);

    /**
     * Creates MS Teams Channel Configuration
     * 
     * @param createMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the CreateMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws LimitExceededException
     *         You have exceeded a service limit for AWS Chatbot.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws CreateTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ConflictException
     *         There was an issue processing your request.
     * @sample AWSChatbot.CreateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMicrosoftTeamsChannelConfigurationResult createMicrosoftTeamsChannelConfiguration(
            CreateMicrosoftTeamsChannelConfigurationRequest createMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Creates Slack Channel Configuration
     * 
     * @param createSlackChannelConfigurationRequest
     * @return Result of the CreateSlackChannelConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws LimitExceededException
     *         You have exceeded a service limit for AWS Chatbot.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws CreateSlackChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ConflictException
     *         There was an issue processing your request.
     * @sample AWSChatbot.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSlackChannelConfigurationResult createSlackChannelConfiguration(CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest);

    /**
     * Deletes a Chime Webhook Configuration
     * 
     * @param deleteChimeWebhookConfigurationRequest
     * @return Result of the DeleteChimeWebhookConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteChimeWebhookConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChimeWebhookConfigurationResult deleteChimeWebhookConfiguration(DeleteChimeWebhookConfigurationRequest deleteChimeWebhookConfigurationRequest);

    /**
     * Deletes MS Teams Channel Configuration
     * 
     * @param deleteMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the DeleteMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMicrosoftTeamsChannelConfigurationResult deleteMicrosoftTeamsChannelConfiguration(
            DeleteMicrosoftTeamsChannelConfigurationRequest deleteMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Deletes the Microsoft Teams team authorization allowing for channels to be configured in that Microsoft Teams
     * team. Note that the Microsoft Teams team must have no channels configured to remove it.
     * 
     * @param deleteMicrosoftTeamsConfiguredTeamRequest
     * @return Result of the DeleteMicrosoftTeamsConfiguredTeam operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteTeamsConfiguredTeamException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteMicrosoftTeamsConfiguredTeam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsConfiguredTeam"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMicrosoftTeamsConfiguredTeamResult deleteMicrosoftTeamsConfiguredTeam(
            DeleteMicrosoftTeamsConfiguredTeamRequest deleteMicrosoftTeamsConfiguredTeamRequest);

    /**
     * Deletes a Teams user identity
     * 
     * @param deleteMicrosoftTeamsUserIdentityRequest
     * @return Result of the DeleteMicrosoftTeamsUserIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws DeleteMicrosoftTeamsUserIdentityException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteMicrosoftTeamsUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMicrosoftTeamsUserIdentityResult deleteMicrosoftTeamsUserIdentity(DeleteMicrosoftTeamsUserIdentityRequest deleteMicrosoftTeamsUserIdentityRequest);

    /**
     * Deletes Slack Channel Configuration
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @return Result of the DeleteSlackChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteSlackChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSlackChannelConfigurationResult deleteSlackChannelConfiguration(DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest);

    /**
     * Deletes a Slack user identity
     * 
     * @param deleteSlackUserIdentityRequest
     * @return Result of the DeleteSlackUserIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws DeleteSlackUserIdentityException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteSlackUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSlackUserIdentityResult deleteSlackUserIdentity(DeleteSlackUserIdentityRequest deleteSlackUserIdentityRequest);

    /**
     * Deletes the Slack workspace authorization that allows channels to be configured in that workspace. This requires
     * all configured channels in the workspace to be deleted.
     * 
     * @param deleteSlackWorkspaceAuthorizationRequest
     * @return Result of the DeleteSlackWorkspaceAuthorization operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteSlackWorkspaceAuthorizationException
     *         There was an issue deleting your Slack workspace.
     * @sample AWSChatbot.DeleteSlackWorkspaceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackWorkspaceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSlackWorkspaceAuthorizationResult deleteSlackWorkspaceAuthorization(DeleteSlackWorkspaceAuthorizationRequest deleteSlackWorkspaceAuthorizationRequest);

    /**
     * Lists Chime Webhook Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeChimeWebhookConfigurationsRequest
     * @return Result of the DescribeChimeWebhookConfigurations operation returned by the service.
     * @throws DescribeChimeWebhookConfigurationsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.DescribeChimeWebhookConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeChimeWebhookConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChimeWebhookConfigurationsResult describeChimeWebhookConfigurations(
            DescribeChimeWebhookConfigurationsRequest describeChimeWebhookConfigurationsRequest);

    /**
     * Lists Slack Channel Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeSlackChannelConfigurationsRequest
     * @return Result of the DescribeSlackChannelConfigurations operation returned by the service.
     * @throws DescribeSlackChannelConfigurationsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.DescribeSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSlackChannelConfigurationsResult describeSlackChannelConfigurations(
            DescribeSlackChannelConfigurationsRequest describeSlackChannelConfigurationsRequest);

    /**
     * Lists all Slack user identities with a mapped role.
     * 
     * @param describeSlackUserIdentitiesRequest
     * @return Result of the DescribeSlackUserIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DescribeSlackUserIdentitiesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DescribeSlackUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSlackUserIdentitiesResult describeSlackUserIdentities(DescribeSlackUserIdentitiesRequest describeSlackUserIdentitiesRequest);

    /**
     * Lists all authorized Slack Workspaces for AWS Account
     * 
     * @param describeSlackWorkspacesRequest
     * @return Result of the DescribeSlackWorkspaces operation returned by the service.
     * @throws DescribeSlackWorkspacesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.DescribeSlackWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackWorkspaces"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSlackWorkspacesResult describeSlackWorkspaces(DescribeSlackWorkspacesRequest describeSlackWorkspacesRequest);

    /**
     * Get Chatbot account level preferences
     * 
     * @param getAccountPreferencesRequest
     * @return Result of the GetAccountPreferences operation returned by the service.
     * @throws GetAccountPreferencesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.GetAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetAccountPreferences" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccountPreferencesResult getAccountPreferences(GetAccountPreferencesRequest getAccountPreferencesRequest);

    /**
     * Get a single MS Teams Channel Configurations
     * 
     * @param getMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the GetMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws GetTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.GetMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetMicrosoftTeamsChannelConfigurationResult getMicrosoftTeamsChannelConfiguration(
            GetMicrosoftTeamsChannelConfigurationRequest getMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Lists MS Teams Channel Configurations optionally filtered by TeamId
     * 
     * @param listMicrosoftTeamsChannelConfigurationsRequest
     * @return Result of the ListMicrosoftTeamsChannelConfigurations operation returned by the service.
     * @throws ListTeamsChannelConfigurationsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.ListMicrosoftTeamsChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListMicrosoftTeamsChannelConfigurationsResult listMicrosoftTeamsChannelConfigurations(
            ListMicrosoftTeamsChannelConfigurationsRequest listMicrosoftTeamsChannelConfigurationsRequest);

    /**
     * Lists all authorized MS teams for AWS Account
     * 
     * @param listMicrosoftTeamsConfiguredTeamsRequest
     * @return Result of the ListMicrosoftTeamsConfiguredTeams operation returned by the service.
     * @throws ListMicrosoftTeamsConfiguredTeamsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.ListMicrosoftTeamsConfiguredTeams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsConfiguredTeams"
     *      target="_top">AWS API Documentation</a>
     */
    ListMicrosoftTeamsConfiguredTeamsResult listMicrosoftTeamsConfiguredTeams(ListMicrosoftTeamsConfiguredTeamsRequest listMicrosoftTeamsConfiguredTeamsRequest);

    /**
     * Lists all Microsoft Teams user identities with a mapped role.
     * 
     * @param listMicrosoftTeamsUserIdentitiesRequest
     * @return Result of the ListMicrosoftTeamsUserIdentities operation returned by the service.
     * @throws ListMicrosoftTeamsUserIdentitiesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.ListMicrosoftTeamsUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    ListMicrosoftTeamsUserIdentitiesResult listMicrosoftTeamsUserIdentities(ListMicrosoftTeamsUserIdentitiesRequest listMicrosoftTeamsUserIdentitiesRequest);

    /**
     * Retrieves the list of tags applied to a configuration.
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         Customer/consumer-facing internal service exception.
     *         https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
     * @throws ServiceUnavailableException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @sample AWSChatbot.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Applies the supplied tags to a configuration.
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         Customer/consumer-facing internal service exception.
     *         https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
     * @throws ServiceUnavailableException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws TooManyTagsException
     *         The supplied list of tags contains too many tags.
     * @sample AWSChatbot.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * Removes the supplied tags from a configuration
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         Customer/consumer-facing internal service exception.
     *         https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
     * @throws ServiceUnavailableException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @sample AWSChatbot.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Update Chatbot account level preferences
     * 
     * @param updateAccountPreferencesRequest
     * @return Result of the UpdateAccountPreferences operation returned by the service.
     * @throws UpdateAccountPreferencesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.UpdateAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountPreferencesResult updateAccountPreferences(UpdateAccountPreferencesRequest updateAccountPreferencesRequest);

    /**
     * Updates a Chime Webhook Configuration
     * 
     * @param updateChimeWebhookConfigurationRequest
     * @return Result of the UpdateChimeWebhookConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws UpdateChimeWebhookConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.UpdateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChimeWebhookConfigurationResult updateChimeWebhookConfiguration(UpdateChimeWebhookConfigurationRequest updateChimeWebhookConfigurationRequest);

    /**
     * Updates MS Teams Channel Configuration
     * 
     * @param updateMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the UpdateMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws UpdateTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.UpdateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMicrosoftTeamsChannelConfigurationResult updateMicrosoftTeamsChannelConfiguration(
            UpdateMicrosoftTeamsChannelConfigurationRequest updateMicrosoftTeamsChannelConfigurationRequest);

    /**
     * Updates Slack Channel Configuration
     * 
     * @param updateSlackChannelConfigurationRequest
     * @return Result of the UpdateSlackChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws UpdateSlackChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSlackChannelConfigurationResult updateSlackChannelConfiguration(UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
