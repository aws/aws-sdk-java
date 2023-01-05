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
package com.amazonaws.services.identitystore;

import javax.annotation.Generated;

import com.amazonaws.services.identitystore.model.*;

/**
 * Interface for accessing IdentityStore asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.identitystore.AbstractAWSIdentityStoreAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Identity Store service used by AWS IAM Identity Center (successor to AWS Single Sign-On) provides a single place
 * to retrieve all of your identities (users and groups). For more information, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">IAM Identity Center User Guide</a>.
 * </p>
 * 
 * <pre>
 * <code> &lt;note&gt; &lt;p&gt;Although AWS Single Sign-On was renamed, the &lt;code&gt;sso&lt;/code&gt; and &lt;code&gt;identitystore&lt;/code&gt; API namespaces will continue to retain their original name for backward compatibility purposes. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed&quot;&gt;IAM Identity Center rename&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;This reference guide describes the identity store operations that you can call programatically and includes detailed information on data types and errors.&lt;/p&gt; </code>
 * </pre>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIdentityStoreAsync extends AWSIdentityStore {

    /**
     * <p>
     * Creates a group within the specified identity store.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSIdentityStoreAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a group within the specified identity store.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a relationship between a member and a group. The following identifiers must be specified:
     * <code>GroupId</code>, <code>IdentityStoreId</code>, and <code>MemberId</code>.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return A Java Future containing the result of the CreateGroupMembership operation returned by the service.
     * @sample AWSIdentityStoreAsync.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest createGroupMembershipRequest);

    /**
     * <p>
     * Creates a relationship between a member and a group. The following identifiers must be specified:
     * <code>GroupId</code>, <code>IdentityStoreId</code>, and <code>MemberId</code>.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroupMembership operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest createGroupMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupMembershipRequest, CreateGroupMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates a new user within the specified identity store.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSIdentityStoreAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new user within the specified identity store.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Delete a group within an identity store given <code>GroupId</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSIdentityStoreAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Delete a group within an identity store given <code>GroupId</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Delete a membership within a group given <code>MembershipId</code>.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return A Java Future containing the result of the DeleteGroupMembership operation returned by the service.
     * @sample AWSIdentityStoreAsync.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest deleteGroupMembershipRequest);

    /**
     * <p>
     * Delete a membership within a group given <code>MembershipId</code>.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroupMembership operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest deleteGroupMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupMembershipRequest, DeleteGroupMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes a user within an identity store given <code>UserId</code>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSIdentityStoreAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user within an identity store given <code>UserId</code>.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Retrieves the group metadata and attributes from <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupRequest
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AWSIdentityStoreAsync.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest);

    /**
     * <p>
     * Retrieves the group metadata and attributes from <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves membership metadata and attributes from <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupMembershipRequest
     * @return A Java Future containing the result of the DescribeGroupMembership operation returned by the service.
     * @sample AWSIdentityStoreAsync.DescribeGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupMembershipResult> describeGroupMembershipAsync(DescribeGroupMembershipRequest describeGroupMembershipRequest);

    /**
     * <p>
     * Retrieves membership metadata and attributes from <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroupMembership operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.DescribeGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupMembershipResult> describeGroupMembershipAsync(DescribeGroupMembershipRequest describeGroupMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupMembershipRequest, DescribeGroupMembershipResult> asyncHandler);

    /**
     * <p>
     * Retrieves the user metadata and attributes from the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AWSIdentityStoreAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Retrieves the user metadata and attributes from the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * <p>
     * Retrieves <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param getGroupIdRequest
     * @return A Java Future containing the result of the GetGroupId operation returned by the service.
     * @sample AWSIdentityStoreAsync.GetGroupId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupId" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupIdResult> getGroupIdAsync(GetGroupIdRequest getGroupIdRequest);

    /**
     * <p>
     * Retrieves <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param getGroupIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupId operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.GetGroupId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupId" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupIdResult> getGroupIdAsync(GetGroupIdRequest getGroupIdRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupIdRequest, GetGroupIdResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param getGroupMembershipIdRequest
     * @return A Java Future containing the result of the GetGroupMembershipId operation returned by the service.
     * @sample AWSIdentityStoreAsync.GetGroupMembershipId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupMembershipId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupMembershipIdResult> getGroupMembershipIdAsync(GetGroupMembershipIdRequest getGroupMembershipIdRequest);

    /**
     * <p>
     * Retrieves the <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param getGroupMembershipIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupMembershipId operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.GetGroupMembershipId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupMembershipId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupMembershipIdResult> getGroupMembershipIdAsync(GetGroupMembershipIdRequest getGroupMembershipIdRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupMembershipIdRequest, GetGroupMembershipIdResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param getUserIdRequest
     * @return A Java Future containing the result of the GetUserId operation returned by the service.
     * @sample AWSIdentityStoreAsync.GetUserId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetUserId" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserIdResult> getUserIdAsync(GetUserIdRequest getUserIdRequest);

    /**
     * <p>
     * Retrieves the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param getUserIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserId operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.GetUserId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetUserId" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserIdResult> getUserIdAsync(GetUserIdRequest getUserIdRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserIdRequest, GetUserIdResult> asyncHandler);

    /**
     * <p>
     * Checks the user's membership in all requested groups and returns if the member exists in all queried groups.
     * </p>
     * 
     * @param isMemberInGroupsRequest
     * @return A Java Future containing the result of the IsMemberInGroups operation returned by the service.
     * @sample AWSIdentityStoreAsync.IsMemberInGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/IsMemberInGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<IsMemberInGroupsResult> isMemberInGroupsAsync(IsMemberInGroupsRequest isMemberInGroupsRequest);

    /**
     * <p>
     * Checks the user's membership in all requested groups and returns if the member exists in all queried groups.
     * </p>
     * 
     * @param isMemberInGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IsMemberInGroups operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.IsMemberInGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/IsMemberInGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<IsMemberInGroupsResult> isMemberInGroupsAsync(IsMemberInGroupsRequest isMemberInGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<IsMemberInGroupsRequest, IsMemberInGroupsResult> asyncHandler);

    /**
     * <p>
     * For the specified group in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return A Java Future containing the result of the ListGroupMemberships operation returned by the service.
     * @sample AWSIdentityStoreAsync.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest listGroupMembershipsRequest);

    /**
     * <p>
     * For the specified group in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupMemberships operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest listGroupMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsRequest, ListGroupMembershipsResult> asyncHandler);

    /**
     * <p>
     * For the specified member in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsForMemberRequest
     * @return A Java Future containing the result of the ListGroupMembershipsForMember operation returned by the
     *         service.
     * @sample AWSIdentityStoreAsync.ListGroupMembershipsForMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMembershipsForMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembershipsForMemberResult> listGroupMembershipsForMemberAsync(
            ListGroupMembershipsForMemberRequest listGroupMembershipsForMemberRequest);

    /**
     * <p>
     * For the specified member in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsForMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupMembershipsForMember operation returned by the
     *         service.
     * @sample AWSIdentityStoreAsyncHandler.ListGroupMembershipsForMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMembershipsForMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembershipsForMemberResult> listGroupMembershipsForMemberAsync(
            ListGroupMembershipsForMemberRequest listGroupMembershipsForMemberRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResult> asyncHandler);

    /**
     * <p>
     * Lists all groups in the identity store. Returns a paginated list of complete <code>Group</code> objects.
     * Filtering for a <code>Group</code> by the <code>DisplayName</code> attribute is deprecated. Instead, use the
     * <code>GetGroupId</code> API action.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSIdentityStoreAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists all groups in the identity store. Returns a paginated list of complete <code>Group</code> objects.
     * Filtering for a <code>Group</code> by the <code>DisplayName</code> attribute is deprecated. Instead, use the
     * <code>GetGroupId</code> API action.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists all users in the identity store. Returns a paginated list of complete <code>User</code> objects. Filtering
     * for a <code>User</code> by the <code>UserName</code> attribute is deprecated. Instead, use the
     * <code>GetUserId</code> API action.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSIdentityStoreAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists all users in the identity store. Returns a paginated list of complete <code>User</code> objects. Filtering
     * for a <code>User</code> by the <code>UserName</code> attribute is deprecated. Instead, use the
     * <code>GetUserId</code> API action.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * For the specified group in the specified identity store, updates the group metadata and attributes.
     * </p>
     * 
     * @param updateGroupRequest
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSIdentityStoreAsync.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * For the specified group in the specified identity store, updates the group metadata and attributes.
     * </p>
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler);

    /**
     * <p>
     * For the specified user in the specified identity store, updates the user metadata and attributes.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSIdentityStoreAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * For the specified user in the specified identity store, updates the user metadata and attributes.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSIdentityStoreAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

}
