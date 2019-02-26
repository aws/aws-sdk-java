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
package com.amazonaws.services.stepfunctions;

import javax.annotation.Generated;

import com.amazonaws.services.stepfunctions.model.*;

/**
 * Interface for accessing AWS SFN asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.stepfunctions.AbstractAWSStepFunctionsAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Step Functions</fullname>
 * <p>
 * AWS Step Functions is a service that lets you coordinate the components of distributed applications and microservices
 * using visual workflows.
 * </p>
 * <p>
 * You can use Step Functions to build applications from individual components, each of which performs a discrete
 * function, or <i>task</i>, allowing you to scale and change applications quickly. Step Functions provides a console
 * that helps visualize the components of your application as a series of steps. Step Functions automatically triggers
 * and tracks each step, and retries steps when there are errors, so your application executes predictably and in the
 * right order every time. Step Functions logs the state of each step, so you can quickly diagnose and debug any issues.
 * </p>
 * <p>
 * Step Functions manages operations and underlying infrastructure to ensure your application is available at any scale.
 * You can run tasks on AWS, your own servers, or any system that has access to AWS. You can access and use Step
 * Functions using the console, the AWS SDKs, or an HTTP API. For more information about Step Functions, see the <i> <a
 * href="https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html">AWS Step Functions Developer Guide</a> </i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSStepFunctionsAsync extends AWSStepFunctions {

    /**
     * <p>
     * Creates an activity. An activity is a task that you write in any programming language and host on any machine
     * that has access to AWS Step Functions. Activities must poll Step Functions using the <code>GetActivityTask</code>
     * API action and respond using <code>SendTask*</code> API actions. This function lets Step Functions know the
     * existence of your activity and returns an identifier for use in a state machine and when polling from the
     * activity.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param createActivityRequest
     * @return A Java Future containing the result of the CreateActivity operation returned by the service.
     * @sample AWSStepFunctionsAsync.CreateActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateActivity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateActivityResult> createActivityAsync(CreateActivityRequest createActivityRequest);

    /**
     * <p>
     * Creates an activity. An activity is a task that you write in any programming language and host on any machine
     * that has access to AWS Step Functions. Activities must poll Step Functions using the <code>GetActivityTask</code>
     * API action and respond using <code>SendTask*</code> API actions. This function lets Step Functions know the
     * existence of your activity and returns an identifier for use in a state machine and when polling from the
     * activity.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param createActivityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateActivity operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.CreateActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateActivity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateActivityResult> createActivityAsync(CreateActivityRequest createActivityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateActivityRequest, CreateActivityResult> asyncHandler);

    /**
     * <p>
     * Creates a state machine. A state machine consists of a collection of states that can do work (<code>Task</code>
     * states), determine to which states to transition next (<code>Choice</code> states), stop an execution with an
     * error (<code>Fail</code> states), and so on. State machines are specified using a JSON-based, structured
     * language.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param createStateMachineRequest
     * @return A Java Future containing the result of the CreateStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsync.CreateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(CreateStateMachineRequest createStateMachineRequest);

    /**
     * <p>
     * Creates a state machine. A state machine consists of a collection of states that can do work (<code>Task</code>
     * states), determine to which states to transition next (<code>Choice</code> states), stop an execution with an
     * error (<code>Fail</code> states), and so on. State machines are specified using a JSON-based, structured
     * language.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param createStateMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.CreateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(CreateStateMachineRequest createStateMachineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStateMachineRequest, CreateStateMachineResult> asyncHandler);

    /**
     * <p>
     * Deletes an activity.
     * </p>
     * 
     * @param deleteActivityRequest
     * @return A Java Future containing the result of the DeleteActivity operation returned by the service.
     * @sample AWSStepFunctionsAsync.DeleteActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteActivity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(DeleteActivityRequest deleteActivityRequest);

    /**
     * <p>
     * Deletes an activity.
     * </p>
     * 
     * @param deleteActivityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteActivity operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.DeleteActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteActivity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(DeleteActivityRequest deleteActivityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteActivityRequest, DeleteActivityResult> asyncHandler);

    /**
     * <p>
     * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to
     * <code>DELETING</code> and begins the deletion process. Each state machine execution is deleted the next time it
     * makes a state transition.
     * </p>
     * <note>
     * <p>
     * The state machine itself is deleted after all executions are completed or deleted.
     * </p>
     * </note>
     * 
     * @param deleteStateMachineRequest
     * @return A Java Future containing the result of the DeleteStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsync.DeleteStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(DeleteStateMachineRequest deleteStateMachineRequest);

    /**
     * <p>
     * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to
     * <code>DELETING</code> and begins the deletion process. Each state machine execution is deleted the next time it
     * makes a state transition.
     * </p>
     * <note>
     * <p>
     * The state machine itself is deleted after all executions are completed or deleted.
     * </p>
     * </note>
     * 
     * @param deleteStateMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.DeleteStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(DeleteStateMachineRequest deleteStateMachineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStateMachineRequest, DeleteStateMachineResult> asyncHandler);

    /**
     * <p>
     * Describes an activity.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeActivityRequest
     * @return A Java Future containing the result of the DescribeActivity operation returned by the service.
     * @sample AWSStepFunctionsAsync.DescribeActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeActivity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(DescribeActivityRequest describeActivityRequest);

    /**
     * <p>
     * Describes an activity.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeActivityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActivity operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.DescribeActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeActivity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(DescribeActivityRequest describeActivityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActivityRequest, DescribeActivityResult> asyncHandler);

    /**
     * <p>
     * Describes an execution.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeExecutionRequest
     * @return A Java Future containing the result of the DescribeExecution operation returned by the service.
     * @sample AWSStepFunctionsAsync.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * Describes an execution.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExecution operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest describeExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler);

    /**
     * <p>
     * Describes a state machine.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeStateMachineRequest
     * @return A Java Future containing the result of the DescribeStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsync.DescribeStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachine" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(DescribeStateMachineRequest describeStateMachineRequest);

    /**
     * <p>
     * Describes a state machine.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeStateMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.DescribeStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachine" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(DescribeStateMachineRequest describeStateMachineRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStateMachineRequest, DescribeStateMachineResult> asyncHandler);

    /**
     * <p>
     * Describes the state machine associated with a specific execution.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeStateMachineForExecutionRequest
     * @return A Java Future containing the result of the DescribeStateMachineForExecution operation returned by the
     *         service.
     * @sample AWSStepFunctionsAsync.DescribeStateMachineForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachineForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStateMachineForExecutionResult> describeStateMachineForExecutionAsync(
            DescribeStateMachineForExecutionRequest describeStateMachineForExecutionRequest);

    /**
     * <p>
     * Describes the state machine associated with a specific execution.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeStateMachineForExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStateMachineForExecution operation returned by the
     *         service.
     * @sample AWSStepFunctionsAsyncHandler.DescribeStateMachineForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachineForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStateMachineForExecutionResult> describeStateMachineForExecutionAsync(
            DescribeStateMachineForExecutionRequest describeStateMachineForExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStateMachineForExecutionRequest, DescribeStateMachineForExecutionResult> asyncHandler);

    /**
     * <p>
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a
     * running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds
     * as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the
     * service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the
     * poll returns a <code>taskToken</code> with a null string.
     * </p>
     * <important>
     * <p>
     * Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum
     * time the service may hold the poll request).
     * </p>
     * <p>
     * Polling with <code>GetActivityTask</code> can cause latency in some implementations. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/bp-activity-pollers.html">Avoid Latency When Polling
     * for Activity Tasks</a> in the Step Functions Developer Guide.
     * </p>
     * </important>
     * 
     * @param getActivityTaskRequest
     * @return A Java Future containing the result of the GetActivityTask operation returned by the service.
     * @sample AWSStepFunctionsAsync.GetActivityTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetActivityTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(GetActivityTaskRequest getActivityTaskRequest);

    /**
     * <p>
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a
     * running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds
     * as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the
     * service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the
     * poll returns a <code>taskToken</code> with a null string.
     * </p>
     * <important>
     * <p>
     * Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum
     * time the service may hold the poll request).
     * </p>
     * <p>
     * Polling with <code>GetActivityTask</code> can cause latency in some implementations. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/bp-activity-pollers.html">Avoid Latency When Polling
     * for Activity Tasks</a> in the Step Functions Developer Guide.
     * </p>
     * </important>
     * 
     * @param getActivityTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetActivityTask operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.GetActivityTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetActivityTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(GetActivityTaskRequest getActivityTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetActivityTaskRequest, GetActivityTaskResult> asyncHandler);

    /**
     * <p>
     * Returns the history of the specified execution as a list of events. By default, the results are returned in
     * ascending order of the <code>timeStamp</code> of the events. Use the <code>reverseOrder</code> parameter to get
     * the latest events first.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param getExecutionHistoryRequest
     * @return A Java Future containing the result of the GetExecutionHistory operation returned by the service.
     * @sample AWSStepFunctionsAsync.GetExecutionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetExecutionHistory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(GetExecutionHistoryRequest getExecutionHistoryRequest);

    /**
     * <p>
     * Returns the history of the specified execution as a list of events. By default, the results are returned in
     * ascending order of the <code>timeStamp</code> of the events. Use the <code>reverseOrder</code> parameter to get
     * the latest events first.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param getExecutionHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExecutionHistory operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.GetExecutionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetExecutionHistory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(GetExecutionHistoryRequest getExecutionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetExecutionHistoryRequest, GetExecutionHistoryResult> asyncHandler);

    /**
     * <p>
     * Lists the existing activities.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listActivitiesRequest
     * @return A Java Future containing the result of the ListActivities operation returned by the service.
     * @sample AWSStepFunctionsAsync.ListActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListActivities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(ListActivitiesRequest listActivitiesRequest);

    /**
     * <p>
     * Lists the existing activities.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActivities operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.ListActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListActivities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(ListActivitiesRequest listActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListActivitiesRequest, ListActivitiesResult> asyncHandler);

    /**
     * <p>
     * Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the
     * most recent execution first.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listExecutionsRequest
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSStepFunctionsAsync.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the
     * most recent execution first.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists the existing state machines.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listStateMachinesRequest
     * @return A Java Future containing the result of the ListStateMachines operation returned by the service.
     * @sample AWSStepFunctionsAsync.ListStateMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(ListStateMachinesRequest listStateMachinesRequest);

    /**
     * <p>
     * Lists the existing state machines.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listStateMachinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStateMachines operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.ListStateMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(ListStateMachinesRequest listStateMachinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStateMachinesRequest, ListStateMachinesResult> asyncHandler);

    /**
     * <p>
     * List tags for a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSStepFunctionsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags for a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> failed.
     * </p>
     * 
     * @param sendTaskFailureRequest
     * @return A Java Future containing the result of the SendTaskFailure operation returned by the service.
     * @sample AWSStepFunctionsAsync.SendTaskFailure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskFailure" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(SendTaskFailureRequest sendTaskFailureRequest);

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> failed.
     * </p>
     * 
     * @param sendTaskFailureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendTaskFailure operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.SendTaskFailure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskFailure" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(SendTaskFailureRequest sendTaskFailureRequest,
            com.amazonaws.handlers.AsyncHandler<SendTaskFailureRequest, SendTaskFailureResult> asyncHandler);

    /**
     * <p>
     * Used by workers to report to the service that the task represented by the specified <code>taskToken</code> is
     * still making progress. This action resets the <code>Heartbeat</code> clock. The <code>Heartbeat</code> threshold
     * is specified in the state machine's Amazon States Language definition. This action does not in itself create an
     * event in the execution history. However, if the task times out, the execution history contains an
     * <code>ActivityTimedOut</code> event.
     * </p>
     * <note>
     * <p>
     * The <code>Timeout</code> of a task, defined in the state machine's Amazon States Language definition, is its
     * maximum allowed duration, regardless of the number of <a>SendTaskHeartbeat</a> requests received.
     * </p>
     * </note> <note>
     * <p>
     * This operation is only useful for long-lived tasks to report the liveliness of the task.
     * </p>
     * </note>
     * 
     * @param sendTaskHeartbeatRequest
     * @return A Java Future containing the result of the SendTaskHeartbeat operation returned by the service.
     * @sample AWSStepFunctionsAsync.SendTaskHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskHeartbeat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(SendTaskHeartbeatRequest sendTaskHeartbeatRequest);

    /**
     * <p>
     * Used by workers to report to the service that the task represented by the specified <code>taskToken</code> is
     * still making progress. This action resets the <code>Heartbeat</code> clock. The <code>Heartbeat</code> threshold
     * is specified in the state machine's Amazon States Language definition. This action does not in itself create an
     * event in the execution history. However, if the task times out, the execution history contains an
     * <code>ActivityTimedOut</code> event.
     * </p>
     * <note>
     * <p>
     * The <code>Timeout</code> of a task, defined in the state machine's Amazon States Language definition, is its
     * maximum allowed duration, regardless of the number of <a>SendTaskHeartbeat</a> requests received.
     * </p>
     * </note> <note>
     * <p>
     * This operation is only useful for long-lived tasks to report the liveliness of the task.
     * </p>
     * </note>
     * 
     * @param sendTaskHeartbeatRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendTaskHeartbeat operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.SendTaskHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskHeartbeat" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(SendTaskHeartbeatRequest sendTaskHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<SendTaskHeartbeatRequest, SendTaskHeartbeatResult> asyncHandler);

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> completed successfully.
     * </p>
     * 
     * @param sendTaskSuccessRequest
     * @return A Java Future containing the result of the SendTaskSuccess operation returned by the service.
     * @sample AWSStepFunctionsAsync.SendTaskSuccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskSuccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(SendTaskSuccessRequest sendTaskSuccessRequest);

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> completed successfully.
     * </p>
     * 
     * @param sendTaskSuccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendTaskSuccess operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.SendTaskSuccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskSuccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(SendTaskSuccessRequest sendTaskSuccessRequest,
            com.amazonaws.handlers.AsyncHandler<SendTaskSuccessRequest, SendTaskSuccessResult> asyncHandler);

    /**
     * <p>
     * Starts a state machine execution.
     * </p>
     * <note>
     * <p>
     * <code>StartExecution</code> is idempotent. If <code>StartExecution</code> is called with the same name and input
     * as a running execution, the call will succeed and return the same response as the original request. If the
     * execution is closed or if the input is different, it will return a 400 <code>ExecutionAlreadyExists</code> error.
     * Names can be reused after 90 days.
     * </p>
     * </note>
     * 
     * @param startExecutionRequest
     * @return A Java Future containing the result of the StartExecution operation returned by the service.
     * @sample AWSStepFunctionsAsync.StartExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(StartExecutionRequest startExecutionRequest);

    /**
     * <p>
     * Starts a state machine execution.
     * </p>
     * <note>
     * <p>
     * <code>StartExecution</code> is idempotent. If <code>StartExecution</code> is called with the same name and input
     * as a running execution, the call will succeed and return the same response as the original request. If the
     * execution is closed or if the input is different, it will return a 400 <code>ExecutionAlreadyExists</code> error.
     * Names can be reused after 90 days.
     * </p>
     * </note>
     * 
     * @param startExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExecution operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.StartExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(StartExecutionRequest startExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartExecutionRequest, StartExecutionResult> asyncHandler);

    /**
     * <p>
     * Stops an execution.
     * </p>
     * 
     * @param stopExecutionRequest
     * @return A Java Future containing the result of the StopExecution operation returned by the service.
     * @sample AWSStepFunctionsAsync.StopExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StopExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(StopExecutionRequest stopExecutionRequest);

    /**
     * <p>
     * Stops an execution.
     * </p>
     * 
     * @param stopExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopExecution operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.StopExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StopExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(StopExecutionRequest stopExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StopExecutionRequest, StopExecutionResult> asyncHandler);

    /**
     * <p>
     * Add a tag to a Step Functions resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSStepFunctionsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add a tag to a Step Functions resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove a tag from a Step Functions resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSStepFunctionsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove a tag from a Step Functions resource
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing state machine by modifying its <code>definition</code> and/or <code>roleArn</code>. Running
     * executions will continue to use the previous <code>definition</code> and <code>roleArn</code>. You must include
     * at least one of <code>definition</code> or <code>roleArn</code> or you will receive a
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <note>
     * <p>
     * All <code>StartExecution</code> calls within a few seconds will use the updated <code>definition</code> and
     * <code>roleArn</code>. Executions started immediately after calling <code>UpdateStateMachine</code> may use the
     * previous state machine <code>definition</code> and <code>roleArn</code>.
     * </p>
     * </note>
     * 
     * @param updateStateMachineRequest
     * @return A Java Future containing the result of the UpdateStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsync.UpdateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStateMachineResult> updateStateMachineAsync(UpdateStateMachineRequest updateStateMachineRequest);

    /**
     * <p>
     * Updates an existing state machine by modifying its <code>definition</code> and/or <code>roleArn</code>. Running
     * executions will continue to use the previous <code>definition</code> and <code>roleArn</code>. You must include
     * at least one of <code>definition</code> or <code>roleArn</code> or you will receive a
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <note>
     * <p>
     * All <code>StartExecution</code> calls within a few seconds will use the updated <code>definition</code> and
     * <code>roleArn</code>. Executions started immediately after calling <code>UpdateStateMachine</code> may use the
     * previous state machine <code>definition</code> and <code>roleArn</code>.
     * </p>
     * </note>
     * 
     * @param updateStateMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStateMachine operation returned by the service.
     * @sample AWSStepFunctionsAsyncHandler.UpdateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStateMachineResult> updateStateMachineAsync(UpdateStateMachineRequest updateStateMachineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStateMachineRequest, UpdateStateMachineResult> asyncHandler);

}
