/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Connect is a cloud-based contact center solution that makes it easy to set up and manage a customer contact
 * center and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides rich metrics and real-time reporting that allow you to optimize contact routing. You can also
 * resolve customer issues more efficiently by putting customers in touch with the right agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create and limits to the number of requests
 * that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * To connect programmatically to an AWS service, you use an endpoint. For a list of Amazon Connect endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect Endpoints</a>.
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
     * Provides information about the queues for the specified Amazon Connect instance.
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
     * List the queues associated with a routing profile.
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
     * List the queues associated with a routing profile.
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
     * When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for
     * the created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in two situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception from the API
     * Gateway.
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
     * For more information about how chat works, see <a
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
     * When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for
     * the created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in two situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception from the API
     * Gateway.
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
     * For more information about how chat works, see <a
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
     * This API starts recording the contact when the agent joins the call. StartContactRecording is a one-time action.
     * For example, if you use StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and
     * resume it, such as when collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
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
     * This API starts recording the contact when the agent joins the call. StartContactRecording is a one-time action.
     * For example, if you use StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and
     * resume it, such as when collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
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
     * This API places an outbound call to a contact, and then initiates the contact flow. It performs the actions in
     * the contact flow that's specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents are not involved in initiating the outbound API (that is, dialing the contact). If the contact flow places
     * an outbound call to a contact, and then puts the contact in queue, that's when the call is routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
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
     * This API places an outbound call to a contact, and then initiates the contact flow. It performs the actions in
     * the contact flow that's specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents are not involved in initiating the outbound API (that is, dialing the contact). If the contact flow places
     * an outbound call to a contact, and then puts the contact in queue, that's when the call is routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
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
     * When a contact is being recorded, this API stops recording the call. StopContactRecording is a one-time action.
     * If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart
     * it. For scenarios where the recording has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use SuspendContactRecording and
     * ResumeContactRecording.
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
     * When a contact is being recorded, this API stops recording the call. StopContactRecording is a one-time action.
     * If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart
     * it. For scenarios where the recording has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use SuspendContactRecording and
     * ResumeContactRecording.
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
     * The supported resource types are users, routing profiles, and contact flows.
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
     * The supported resource types are users, routing profiles, and contact flows.
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
     * Creates or updates the contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts. For example, you can update the
     * customer's name or the reason the customer called while the call is active, or add notes about steps that the
     * agent took during the call that are displayed to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for contacts that occurred prior to the
     * release of the API, September 12, 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the
     * API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of
     * the API but are still active in your instance.
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
     * Creates or updates the contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts. For example, you can update the
     * customer's name or the reason the customer called while the call is active, or add notes about steps that the
     * agent took during the call that are displayed to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for contacts that occurred prior to the
     * release of the API, September 12, 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the
     * API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of
     * the API but are still active in your instance.
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
     * Someone with the ability to invoke <code>UpdateUserIndentityInfo</code> can change the login credentials of other
     * users by changing their email address. This poses a security risk to your organization. They can change the email
     * address of a user to the attacker's email address, and then reset the password through email. We strongly
     * recommend limiting who has the ability to invoke <code>UpdateUserIndentityInfo</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best
     * Practices for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * Someone with the ability to invoke <code>UpdateUserIndentityInfo</code> can change the login credentials of other
     * users by changing their email address. This poses a security risk to your organization. They can change the email
     * address of a user to the attacker's email address, and then reset the password through email. We strongly
     * recommend limiting who has the ability to invoke <code>UpdateUserIndentityInfo</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best
     * Practices for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
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
