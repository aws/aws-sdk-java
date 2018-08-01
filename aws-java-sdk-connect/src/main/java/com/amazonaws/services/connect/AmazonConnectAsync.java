/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon Connect API Reference provides descriptions, syntax, and usage examples for each of the Amazon Connect
 * actions, data types, parameters, and errors. Amazon Connect is a cloud-based contact center solution that makes it
 * easy to set up and manage a customer contact center and provide reliable customer engagement at any scale.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectAsync extends AmazonConnect {

    /**
     * <p>
     * Creates a new user account in your Amazon Connect instance.
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
     * Creates a new user account in your Amazon Connect instance.
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
     * Deletes a user account from Amazon Connect.
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
     * Deletes a user account from Amazon Connect.
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
     * Returns a <code>User</code> object that contains information about the user account specified by the
     * <code>UserId</code>.
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
     * Returns a <code>User</code> object that contains information about the user account specified by the
     * <code>UserId</code>.
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
     * Returns a <code>HierarchyGroup</code> object that includes information about a hierarchy group in your instance.
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
     * Returns a <code>HierarchyGroup</code> object that includes information about a hierarchy group in your instance.
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
     * Returns a <code>HiearchyGroupStructure</code> object, which contains data about the levels in the agent
     * hierarchy.
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
     * Returns a <code>HiearchyGroupStructure</code> object, which contains data about the levels in the agent
     * hierarchy.
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
     * Retrieves a token for federation.
     * </p>
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
     * Returns an array of <code>RoutingProfileSummary</code> objects that includes information about the routing
     * profiles in your instance.
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
     * Returns an array of <code>RoutingProfileSummary</code> objects that includes information about the routing
     * profiles in your instance.
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
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your
     * instance, including the ARN, Id, and Name of the security profile.
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
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your
     * instance, including the ARN, Id, and Name of the security profile.
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
     * Returns a <code>UserHierarchyGroupSummaryList</code>, which is an array of <code>HierarchyGroupSummary</code>
     * objects that contain information about the hierarchy groups in your instance.
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
     * Returns a <code>UserHierarchyGroupSummaryList</code>, which is an array of <code>HierarchyGroupSummary</code>
     * objects that contain information about the hierarchy groups in your instance.
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
     * Returns a <code>UserSummaryList</code>, which is an array of <code>UserSummary</code> objects.
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
     * Returns a <code>UserSummaryList</code>, which is an array of <code>UserSummary</code> objects.
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
     * The <code>StartOutboundVoiceContact</code> operation initiates a contact flow to place an outbound call to a
     * customer.
     * </p>
     * <p>
     * There is a throttling limit placed on usage of the API that includes a RateLimit of 2 per second, and a
     * BurstLimit of 5 per second.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:StartOutboundVoiceContact</code>
     * action.
     * </p>
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
     * The <code>StartOutboundVoiceContact</code> operation initiates a contact flow to place an outbound call to a
     * customer.
     * </p>
     * <p>
     * There is a throttling limit placed on usage of the API that includes a RateLimit of 2 per second, and a
     * BurstLimit of 5 per second.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:StartOutboundVoiceContact</code>
     * action.
     * </p>
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
     * Ends the contact initiated by the <code>StartOutboundVoiceContact</code> operation.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:StopContact</code> action.
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
     * Ends the contact initiated by the <code>StartOutboundVoiceContact</code> operation.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:StopContact</code> action.
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
     * Assigns the specified hierarchy group to the user.
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
     * Assigns the specified hierarchy group to the user.
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
     * Updates the identity information for the specified user in a <code>UserIdentityInfo</code> object, including
     * email, first name, and last name.
     * </p>
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
     * Updates the identity information for the specified user in a <code>UserIdentityInfo</code> object, including
     * email, first name, and last name.
     * </p>
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
     * Updates the phone configuration settings in the <code>UserPhoneConfig</code> object for the specified user.
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
     * Updates the phone configuration settings in the <code>UserPhoneConfig</code> object for the specified user.
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
     * Assigns the specified routing profile to a user.
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
     * Assigns the specified routing profile to a user.
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
     * Update the security profiles assigned to the user.
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
     * Update the security profiles assigned to the user.
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
