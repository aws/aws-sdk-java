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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.identitystore.model.*;

/**
 * Interface for accessing IdentityStore.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.identitystore.AbstractAWSIdentityStore} instead.
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
public interface AWSIdentityStore {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "identitystore";

    /**
     * <p>
     * Creates a group within the specified identity store.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a relationship between a member and a group. The following identifiers must be specified:
     * <code>GroupId</code>, <code>IdentityStoreId</code>, and <code>MemberId</code>.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return Result of the CreateGroupMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGroupMembershipResult createGroupMembership(CreateGroupMembershipRequest createGroupMembershipRequest);

    /**
     * <p>
     * Creates a new user within the specified identity store.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Delete a group within an identity store given <code>GroupId</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Delete a membership within a group given <code>MembershipId</code>.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return Result of the DeleteGroupMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGroupMembershipResult deleteGroupMembership(DeleteGroupMembershipRequest deleteGroupMembershipRequest);

    /**
     * <p>
     * Deletes a user within an identity store given <code>UserId</code>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Retrieves the group metadata and attributes from <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupRequest
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest);

    /**
     * <p>
     * Retrieves membership metadata and attributes from <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupMembershipRequest
     * @return Result of the DescribeGroupMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DescribeGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGroupMembershipResult describeGroupMembership(DescribeGroupMembershipRequest describeGroupMembershipRequest);

    /**
     * <p>
     * Retrieves the user metadata and attributes from the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Retrieves <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param getGroupIdRequest
     * @return Result of the GetGroupId operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.GetGroupId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupId" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupIdResult getGroupId(GetGroupIdRequest getGroupIdRequest);

    /**
     * <p>
     * Retrieves the <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param getGroupMembershipIdRequest
     * @return Result of the GetGroupMembershipId operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.GetGroupMembershipId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupMembershipId"
     *      target="_top">AWS API Documentation</a>
     */
    GetGroupMembershipIdResult getGroupMembershipId(GetGroupMembershipIdRequest getGroupMembershipIdRequest);

    /**
     * <p>
     * Retrieves the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param getUserIdRequest
     * @return Result of the GetUserId operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.GetUserId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetUserId" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserIdResult getUserId(GetUserIdRequest getUserIdRequest);

    /**
     * <p>
     * Checks the user's membership in all requested groups and returns if the member exists in all queried groups.
     * </p>
     * 
     * @param isMemberInGroupsRequest
     * @return Result of the IsMemberInGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.IsMemberInGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/IsMemberInGroups" target="_top">AWS
     *      API Documentation</a>
     */
    IsMemberInGroupsResult isMemberInGroups(IsMemberInGroupsRequest isMemberInGroupsRequest);

    /**
     * <p>
     * For the specified group in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return Result of the ListGroupMemberships operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupMembershipsResult listGroupMemberships(ListGroupMembershipsRequest listGroupMembershipsRequest);

    /**
     * <p>
     * For the specified member in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsForMemberRequest
     * @return Result of the ListGroupMembershipsForMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListGroupMembershipsForMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMembershipsForMember"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupMembershipsForMemberResult listGroupMembershipsForMember(ListGroupMembershipsForMemberRequest listGroupMembershipsForMemberRequest);

    /**
     * <p>
     * Lists all groups in the identity store. Returns a paginated list of complete <code>Group</code> objects.
     * Filtering for a <code>Group</code> by the <code>DisplayName</code> attribute is deprecated. Instead, use the
     * <code>GetGroupId</code> API action.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists all users in the identity store. Returns a paginated list of complete <code>User</code> objects. Filtering
     * for a <code>User</code> by the <code>UserName</code> attribute is deprecated. Instead, use the
     * <code>GetUserId</code> API action.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * For the specified group in the specified identity store, updates the group metadata and attributes.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * For the specified user in the specified identity store, updates the user metadata and attributes.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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
