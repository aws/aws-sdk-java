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
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIdentityStoreAsync extends AWSIdentityStore {

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
     * Retrieves the user metadata and attributes from <code>UserId</code> in an identity store.
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
     * Retrieves the user metadata and attributes from <code>UserId</code> in an identity store.
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
     * Lists the attribute name and value of the group that you specified in the search. We only support
     * <code>DisplayName</code> as a valid filter attribute path currently, and filter is required. This API returns
     * minimum attributes, including <code>GroupId</code> and group <code>DisplayName</code> in the response.
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
     * Lists the attribute name and value of the group that you specified in the search. We only support
     * <code>DisplayName</code> as a valid filter attribute path currently, and filter is required. This API returns
     * minimum attributes, including <code>GroupId</code> and group <code>DisplayName</code> in the response.
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
     * Lists the attribute name and value of the user that you specified in the search. We only support
     * <code>UserName</code> as a valid filter attribute path currently, and filter is required. This API returns
     * minimum attributes, including <code>UserId</code> and <code>UserName</code> in the response.
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
     * Lists the attribute name and value of the user that you specified in the search. We only support
     * <code>UserName</code> as a valid filter attribute path currently, and filter is required. This API returns
     * minimum attributes, including <code>UserId</code> and <code>UserName</code> in the response.
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

}
