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
package com.amazonaws.services.chimesdkidentity;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkidentity.model.*;

/**
 * Interface for accessing Amazon Chime SDK Identity asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkidentity.AbstractAmazonChimeSDKIdentityAsync} instead.
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
public interface AmazonChimeSDKIdentityAsync extends AmazonChimeSDKIdentity {

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
     * @return A Java Future containing the result of the CreateAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.CreateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest createAppInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.CreateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest createAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceRequest, CreateAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> to an <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
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
     * Only an <code>AppInstanceUser</code> can be promoted to an <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @return A Java Future containing the result of the CreateAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.CreateAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest createAppInstanceAdminRequest);

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> to an <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
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
     * Only an <code>AppInstanceUser</code> can be promoted to an <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.CreateAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest createAppInstanceAdminRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceAdminRequest, CreateAppInstanceAdminResult> asyncHandler);

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>appInstanceUserId</code> and <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @return A Java Future containing the result of the CreateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.CreateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest createAppInstanceUserRequest);

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>appInstanceUserId</code> and <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.CreateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest createAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceUserRequest, CreateAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @return A Java Future containing the result of the DeleteAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.DeleteAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest deleteAppInstanceRequest);

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DeleteAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest deleteAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceRequest, DeleteAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an <code>AppInstanceUser</code>. This action does not delete the
     * user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @return A Java Future containing the result of the DeleteAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.DeleteAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest);

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an <code>AppInstanceUser</code>. This action does not delete the
     * user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DeleteAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceAdminRequest, DeleteAppInstanceAdminResult> asyncHandler);

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @return A Java Future containing the result of the DeleteAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.DeleteAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest);

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DeleteAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceUserRequest, DeleteAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Deregisters an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param deregisterAppInstanceUserEndpointRequest
     * @return A Java Future containing the result of the DeregisterAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.DeregisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeregisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterAppInstanceUserEndpointResult> deregisterAppInstanceUserEndpointAsync(
            DeregisterAppInstanceUserEndpointRequest deregisterAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Deregisters an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param deregisterAppInstanceUserEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DeregisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeregisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterAppInstanceUserEndpointResult> deregisterAppInstanceUserEndpointAsync(
            DeregisterAppInstanceUserEndpointRequest deregisterAppInstanceUserEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterAppInstanceUserEndpointRequest, DeregisterAppInstanceUserEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @return A Java Future containing the result of the DescribeAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.DescribeAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest describeAppInstanceRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DescribeAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest describeAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceRequest, DescribeAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @return A Java Future containing the result of the DescribeAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.DescribeAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DescribeAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceAdminRequest, DescribeAppInstanceAdminResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @return A Java Future containing the result of the DescribeAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.DescribeAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest describeAppInstanceUserRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DescribeAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest describeAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserRequest, DescribeAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param describeAppInstanceUserEndpointRequest
     * @return A Java Future containing the result of the DescribeAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.DescribeAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceUserEndpointResult> describeAppInstanceUserEndpointAsync(
            DescribeAppInstanceUserEndpointRequest describeAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param describeAppInstanceUserEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.DescribeAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceUserEndpointResult> describeAppInstanceUserEndpointAsync(
            DescribeAppInstanceUserEndpointRequest describeAppInstanceUserEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserEndpointRequest, DescribeAppInstanceUserEndpointResult> asyncHandler);

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @return A Java Future containing the result of the GetAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.GetAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/GetAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest);

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.GetAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/GetAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppInstanceRetentionSettingsRequest, GetAppInstanceRetentionSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @return A Java Future containing the result of the ListAppInstanceAdmins operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.ListAppInstanceAdmins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceAdmins"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest listAppInstanceAdminsRequest);

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstanceAdmins operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.ListAppInstanceAdmins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceAdmins"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest listAppInstanceAdminsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceAdminsRequest, ListAppInstanceAdminsResult> asyncHandler);

    /**
     * <p>
     * Lists all the <code>AppInstanceUserEndpoints</code> created under a single <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param listAppInstanceUserEndpointsRequest
     * @return A Java Future containing the result of the ListAppInstanceUserEndpoints operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.ListAppInstanceUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUserEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceUserEndpointsResult> listAppInstanceUserEndpointsAsync(
            ListAppInstanceUserEndpointsRequest listAppInstanceUserEndpointsRequest);

    /**
     * <p>
     * Lists all the <code>AppInstanceUserEndpoints</code> created under a single <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param listAppInstanceUserEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstanceUserEndpoints operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.ListAppInstanceUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUserEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceUserEndpointsResult> listAppInstanceUserEndpointsAsync(
            ListAppInstanceUserEndpointsRequest listAppInstanceUserEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceUserEndpointsRequest, ListAppInstanceUserEndpointsResult> asyncHandler);

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @return A Java Future containing the result of the ListAppInstanceUsers operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.ListAppInstanceUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest listAppInstanceUsersRequest);

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstanceUsers operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.ListAppInstanceUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest listAppInstanceUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceUsersRequest, ListAppInstanceUsersResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @return A Java Future containing the result of the ListAppInstances operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.ListAppInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest listAppInstancesRequest);

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstances operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.ListAppInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest listAppInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstancesRequest, ListAppInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sets the amount of time in days that a given <code>AppInstance</code> retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @return A Java Future containing the result of the PutAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.PutAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/PutAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest);

    /**
     * <p>
     * Sets the amount of time in days that a given <code>AppInstance</code> retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.PutAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/PutAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppInstanceRetentionSettingsRequest, PutAppInstanceRetentionSettingsResult> asyncHandler);

    /**
     * <p>
     * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>. The endpoint receives messages for a
     * user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a
     * user.
     * </p>
     * 
     * @param registerAppInstanceUserEndpointRequest
     * @return A Java Future containing the result of the RegisterAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.RegisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/RegisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAppInstanceUserEndpointResult> registerAppInstanceUserEndpointAsync(
            RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>. The endpoint receives messages for a
     * user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a
     * user.
     * </p>
     * 
     * @param registerAppInstanceUserEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.RegisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/RegisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAppInstanceUserEndpointResult> registerAppInstanceUserEndpointAsync(
            RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterAppInstanceUserEndpointRequest, RegisterAppInstanceUserEndpointResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @return A Java Future containing the result of the UpdateAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.UpdateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest updateAppInstanceRequest);

    /**
     * <p>
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppInstance operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.UpdateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest updateAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceRequest, UpdateAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @return A Java Future containing the result of the UpdateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsync.UpdateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest updateAppInstanceUserRequest);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.UpdateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest updateAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserRequest, UpdateAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can update the name and
     * <code>AllowMessage</code> values.
     * </p>
     * 
     * @param updateAppInstanceUserEndpointRequest
     * @return A Java Future containing the result of the UpdateAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsync.UpdateAppInstanceUserEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceUserEndpointResult> updateAppInstanceUserEndpointAsync(
            UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can update the name and
     * <code>AllowMessage</code> values.
     * </p>
     * 
     * @param updateAppInstanceUserEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppInstanceUserEndpoint operation returned by the
     *         service.
     * @sample AmazonChimeSDKIdentityAsyncHandler.UpdateAppInstanceUserEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceUserEndpointResult> updateAppInstanceUserEndpointAsync(
            UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserEndpointRequest, UpdateAppInstanceUserEndpointResult> asyncHandler);

}
