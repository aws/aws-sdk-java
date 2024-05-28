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
package com.amazonaws.services.chimesdkidentity;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chimesdkidentity.model.*;

/**
 * Interface for accessing Amazon Chime SDK Identity.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkidentity.AbstractAmazonChimeSDKIdentity} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK Identity APIs in this section allow software developers to create and manage unique instances of
 * their messaging applications. These APIs provide the overarching framework for creating and sending messages. For
 * more information about the identity APIs, refer to <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Identity.html">Amazon
 * Chime SDK identity</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKIdentity {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "identity-chime";

    /**
     * <p>
     * Creates an Amazon Chime SDK messaging <code>AppInstance</code> under an AWS account. Only SDK messaging customers
     * use this API. <code>CreateAppInstance</code> supports idempotency behavior as described in the AWS API Standard.
     * </p>
     * <p>
     * identity
     * </p>
     * 
     * @param createAppInstanceRequest
     * @return Result of the CreateAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppInstanceResult createAppInstance(CreateAppInstanceRequest createAppInstanceRequest);

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> or <code>AppInstanceBot</code> to an <code>AppInstanceAdmin</code>. The
     * promoted entity can perform the following actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChannelModerator</code> actions across all channels in the <code>AppInstance</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteChannelMessage</code> actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only an <code>AppInstanceUser</code> and <code>AppInstanceBot</code> can be promoted to an
     * <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @return Result of the CreateAppInstanceAdmin operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppInstanceAdminResult createAppInstanceAdmin(CreateAppInstanceAdminRequest createAppInstanceAdminRequest);

    /**
     * <p>
     * Creates a bot under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>Configuration</code> and <code>Name</code> for that bot.
     * </p>
     * 
     * @param createAppInstanceBotRequest
     * @return Result of the CreateAppInstanceBot operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstanceBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceBot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppInstanceBotResult createAppInstanceBot(CreateAppInstanceBotRequest createAppInstanceBotRequest);

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>appInstanceUserId</code> and <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @return Result of the CreateAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppInstanceUserResult createAppInstanceUser(CreateAppInstanceUserRequest createAppInstanceUserRequest);

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @return Result of the DeleteAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppInstanceResult deleteAppInstance(DeleteAppInstanceRequest deleteAppInstanceRequest);

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an <code>AppInstanceUser</code> or <code>AppInstanceBot</code>. This
     * action does not delete the user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @return Result of the DeleteAppInstanceAdmin operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppInstanceAdminResult deleteAppInstanceAdmin(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest);

    /**
     * <p>
     * Deletes an <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param deleteAppInstanceBotRequest
     * @return Result of the DeleteAppInstanceBot operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstanceBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceBot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppInstanceBotResult deleteAppInstanceBot(DeleteAppInstanceBotRequest deleteAppInstanceBotRequest);

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @return Result of the DeleteAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppInstanceUserResult deleteAppInstanceUser(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest);

    /**
     * <p>
     * Deregisters an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param deregisterAppInstanceUserEndpointRequest
     * @return Result of the DeregisterAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeregisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeregisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterAppInstanceUserEndpointResult deregisterAppInstanceUserEndpoint(DeregisterAppInstanceUserEndpointRequest deregisterAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @return Result of the DescribeAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppInstanceResult describeAppInstance(DescribeAppInstanceRequest describeAppInstanceRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @return Result of the DescribeAppInstanceAdmin operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppInstanceAdminResult describeAppInstanceAdmin(DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest);

    /**
     * <p>
     * The <code>AppInstanceBot's</code> information.
     * </p>
     * 
     * @param describeAppInstanceBotRequest
     * @return Result of the DescribeAppInstanceBot operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceBot"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppInstanceBotResult describeAppInstanceBot(DescribeAppInstanceBotRequest describeAppInstanceBotRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @return Result of the DescribeAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppInstanceUserResult describeAppInstanceUser(DescribeAppInstanceUserRequest describeAppInstanceUserRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param describeAppInstanceUserEndpointRequest
     * @return Result of the DescribeAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppInstanceUserEndpointResult describeAppInstanceUserEndpoint(DescribeAppInstanceUserEndpointRequest describeAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @return Result of the GetAppInstanceRetentionSettings operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.GetAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/GetAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetAppInstanceRetentionSettingsResult getAppInstanceRetentionSettings(GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest);

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @return Result of the ListAppInstanceAdmins operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceAdmins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceAdmins"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppInstanceAdminsResult listAppInstanceAdmins(ListAppInstanceAdminsRequest listAppInstanceAdminsRequest);

    /**
     * <p>
     * Lists all <code>AppInstanceBots</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceBotsRequest
     * @return Result of the ListAppInstanceBots operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceBots"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppInstanceBotsResult listAppInstanceBots(ListAppInstanceBotsRequest listAppInstanceBotsRequest);

    /**
     * <p>
     * Lists all the <code>AppInstanceUserEndpoints</code> created under a single <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param listAppInstanceUserEndpointsRequest
     * @return Result of the ListAppInstanceUserEndpoints operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUserEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppInstanceUserEndpointsResult listAppInstanceUserEndpoints(ListAppInstanceUserEndpointsRequest listAppInstanceUserEndpointsRequest);

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @return Result of the ListAppInstanceUsers operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUsers"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppInstanceUsersResult listAppInstanceUsers(ListAppInstanceUsersRequest listAppInstanceUsersRequest);

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @return Result of the ListAppInstances operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppInstancesResult listAppInstances(ListAppInstancesRequest listAppInstancesRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Sets the amount of time in days that a given <code>AppInstance</code> retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @return Result of the PutAppInstanceRetentionSettings operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.PutAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/PutAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    PutAppInstanceRetentionSettingsResult putAppInstanceRetentionSettings(PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest);

    /**
     * <p>
     * Sets the number of days before the <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     * <note>
     * <p>
     * A background process deletes expired <code>AppInstanceUsers</code> within 6 hours of expiration. Actual deletion
     * times may vary.
     * </p>
     * <p>
     * Expired <code>AppInstanceUsers</code> that have not yet been deleted appear as active, and you can update their
     * expiration settings. The system honors the new settings.
     * </p>
     * </note>
     * 
     * @param putAppInstanceUserExpirationSettingsRequest
     * @return Result of the PutAppInstanceUserExpirationSettings operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.PutAppInstanceUserExpirationSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/PutAppInstanceUserExpirationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    PutAppInstanceUserExpirationSettingsResult putAppInstanceUserExpirationSettings(
            PutAppInstanceUserExpirationSettingsRequest putAppInstanceUserExpirationSettingsRequest);

    /**
     * <p>
     * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>. The endpoint receives messages for a
     * user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a
     * user.
     * </p>
     * 
     * @param registerAppInstanceUserEndpointRequest
     * @return Result of the RegisterAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.RegisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/RegisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterAppInstanceUserEndpointResult registerAppInstanceUserEndpoint(RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @return Result of the UpdateAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppInstanceResult updateAppInstance(UpdateAppInstanceRequest updateAppInstanceRequest);

    /**
     * <p>
     * Updates the name and metadata of an <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param updateAppInstanceBotRequest
     * @return Result of the UpdateAppInstanceBot operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstanceBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceBot"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppInstanceBotResult updateAppInstanceBot(UpdateAppInstanceBotRequest updateAppInstanceBotRequest);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @return Result of the UpdateAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppInstanceUserResult updateAppInstanceUser(UpdateAppInstanceUserRequest updateAppInstanceUserRequest);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can update the name and
     * <code>AllowMessage</code> values.
     * </p>
     * 
     * @param updateAppInstanceUserEndpointRequest
     * @return Result of the UpdateAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstanceUserEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppInstanceUserEndpointResult updateAppInstanceUserEndpoint(UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest);

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
