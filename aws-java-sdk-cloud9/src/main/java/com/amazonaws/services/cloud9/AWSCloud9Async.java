/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloud9;

import javax.annotation.Generated;

import com.amazonaws.services.cloud9.model.*;

/**
 * Interface for accessing AWS Cloud9 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloud9.AbstractAWSCloud9Async} instead.
 * </p>
 * <p>
 * <fullname>AWS Cloud9</fullname>
 * <p>
 * AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
 * cloud.
 * </p>
 * <p>
 * For more information about AWS Cloud9, see the <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide">AWS
 * Cloud9 User Guide</a>.
 * </p>
 * <p>
 * AWS Cloud9 supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEnvironmentEC2</code>: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
 * and then connects from the instance to the environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateEnvironmentMembership</code>: Adds an environment member to an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironment</code>: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
 * also terminates the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironmentMembership</code>: Deletes an environment member from an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentMemberships</code>: Gets information about environment members for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironments</code>: Gets information about environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentStatus</code>: Gets status information for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListEnvironments</code>: Gets a list of environment identifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironment</code>: Changes the settings of an existing environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironmentMembership</code>: Changes the settings of an existing environment member for an environment.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloud9Async extends AWSCloud9 {

    /**
     * <p>
     * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
     * and then connects from the instance to the environment.
     * </p>
     * 
     * @param createEnvironmentEC2Request
     * @return A Java Future containing the result of the CreateEnvironmentEC2 operation returned by the service.
     * @sample AWSCloud9Async.CreateEnvironmentEC2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentEC2" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentEC2Result> createEnvironmentEC2Async(CreateEnvironmentEC2Request createEnvironmentEC2Request);

    /**
     * <p>
     * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
     * and then connects from the instance to the environment.
     * </p>
     * 
     * @param createEnvironmentEC2Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironmentEC2 operation returned by the service.
     * @sample AWSCloud9AsyncHandler.CreateEnvironmentEC2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentEC2" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentEC2Result> createEnvironmentEC2Async(CreateEnvironmentEC2Request createEnvironmentEC2Request,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentEC2Request, CreateEnvironmentEC2Result> asyncHandler);

    /**
     * <p>
     * Adds an environment member to an AWS Cloud9 development environment.
     * </p>
     * 
     * @param createEnvironmentMembershipRequest
     * @return A Java Future containing the result of the CreateEnvironmentMembership operation returned by the service.
     * @sample AWSCloud9Async.CreateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentMembershipResult> createEnvironmentMembershipAsync(
            CreateEnvironmentMembershipRequest createEnvironmentMembershipRequest);

    /**
     * <p>
     * Adds an environment member to an AWS Cloud9 development environment.
     * </p>
     * 
     * @param createEnvironmentMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironmentMembership operation returned by the service.
     * @sample AWSCloud9AsyncHandler.CreateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentMembershipResult> createEnvironmentMembershipAsync(
            CreateEnvironmentMembershipRequest createEnvironmentMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentMembershipRequest, CreateEnvironmentMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
     * terminates the instance.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSCloud9Async.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
     * terminates the instance.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSCloud9AsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes an environment member from an AWS Cloud9 development environment.
     * </p>
     * 
     * @param deleteEnvironmentMembershipRequest
     * @return A Java Future containing the result of the DeleteEnvironmentMembership operation returned by the service.
     * @sample AWSCloud9Async.DeleteEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentMembershipResult> deleteEnvironmentMembershipAsync(
            DeleteEnvironmentMembershipRequest deleteEnvironmentMembershipRequest);

    /**
     * <p>
     * Deletes an environment member from an AWS Cloud9 development environment.
     * </p>
     * 
     * @param deleteEnvironmentMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentMembership operation returned by the service.
     * @sample AWSCloud9AsyncHandler.DeleteEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentMembershipResult> deleteEnvironmentMembershipAsync(
            DeleteEnvironmentMembershipRequest deleteEnvironmentMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentMembershipRequest, DeleteEnvironmentMembershipResult> asyncHandler);

    /**
     * <p>
     * Gets information about environment members for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentMembershipsRequest
     * @return A Java Future containing the result of the DescribeEnvironmentMemberships operation returned by the
     *         service.
     * @sample AWSCloud9Async.DescribeEnvironmentMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEnvironmentMembershipsResult> describeEnvironmentMembershipsAsync(
            DescribeEnvironmentMembershipsRequest describeEnvironmentMembershipsRequest);

    /**
     * <p>
     * Gets information about environment members for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironmentMemberships operation returned by the
     *         service.
     * @sample AWSCloud9AsyncHandler.DescribeEnvironmentMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEnvironmentMembershipsResult> describeEnvironmentMembershipsAsync(
            DescribeEnvironmentMembershipsRequest describeEnvironmentMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentMembershipsRequest, DescribeEnvironmentMembershipsResult> asyncHandler);

    /**
     * <p>
     * Gets status information for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentStatusRequest
     * @return A Java Future containing the result of the DescribeEnvironmentStatus operation returned by the service.
     * @sample AWSCloud9Async.DescribeEnvironmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEnvironmentStatusResult> describeEnvironmentStatusAsync(
            DescribeEnvironmentStatusRequest describeEnvironmentStatusRequest);

    /**
     * <p>
     * Gets status information for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironmentStatus operation returned by the service.
     * @sample AWSCloud9AsyncHandler.DescribeEnvironmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEnvironmentStatusResult> describeEnvironmentStatusAsync(
            DescribeEnvironmentStatusRequest describeEnvironmentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentStatusRequest, DescribeEnvironmentStatusResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS Cloud9 development environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     * @return A Java Future containing the result of the DescribeEnvironments operation returned by the service.
     * @sample AWSCloud9Async.DescribeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest describeEnvironmentsRequest);

    /**
     * <p>
     * Gets information about AWS Cloud9 development environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironments operation returned by the service.
     * @sample AWSCloud9AsyncHandler.DescribeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest describeEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of AWS Cloud9 development environment identifiers.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSCloud9Async.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Gets a list of AWS Cloud9 development environment identifiers.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSCloud9AsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Changes the settings of an existing AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSCloud9Async.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Changes the settings of an existing AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSCloud9AsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentMembershipRequest
     * @return A Java Future containing the result of the UpdateEnvironmentMembership operation returned by the service.
     * @sample AWSCloud9Async.UpdateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentMembershipResult> updateEnvironmentMembershipAsync(
            UpdateEnvironmentMembershipRequest updateEnvironmentMembershipRequest);

    /**
     * <p>
     * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironmentMembership operation returned by the service.
     * @sample AWSCloud9AsyncHandler.UpdateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentMembershipResult> updateEnvironmentMembershipAsync(
            UpdateEnvironmentMembershipRequest updateEnvironmentMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentMembershipRequest, UpdateEnvironmentMembershipResult> asyncHandler);

}
