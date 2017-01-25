/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.stepfunctions.model.*;

/**
 * Interface for accessing AWS SFN.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.stepfunctions.AbstractAWSStepFunctions} instead.
 * </p>
 * <p>
 * <fullname>AWS Step Functions</fullname>
 * <p>
 * AWS Step Functions is a web service that enables you to coordinate the components of distributed applications and
 * microservices using visual workflows. You build applications from individual components that each perform a discrete
 * function, or <i>task</i>, allowing you to scale and change applications quickly. Step Functions provides a graphical
 * console to visualize the components of your application as a series of steps. It automatically triggers and tracks
 * each step, and retries when there are errors, so your application executes in order and as expected, every time. Step
 * Functions logs the state of each step, so when things do go wrong, you can diagnose and debug problems quickly.
 * </p>
 * <p>
 * Step Functions manages the operations and underlying infrastructure for you to ensure your application is available
 * at any scale. You can run tasks on the AWS cloud, on your own servers, or an any system that has access to AWS. Step
 * Functions can be accessed and used with the Step Functions console, the AWS SDKs (included with your Beta release
 * invitation email), or an HTTP API (the subject of this document).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSStepFunctions {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "states";

    /**
     * Overrides the default endpoint for this client ("states.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "states.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "states.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "states.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "states.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSStepFunctions#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Creates an activity.
     * </p>
     * 
     * @param createActivityRequest
     * @return Result of the CreateActivity operation returned by the service.
     * @throws ActivityLimitExceededException
     *         The maximum number of activities has been reached. Existing activities must be deleted before a new
     *         activity can be created.
     * @throws InvalidNameException
     *         The provided name is invalid.
     * @sample AWSStepFunctions.CreateActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateActivity" target="_top">AWS API
     *      Documentation</a>
     */
    CreateActivityResult createActivity(CreateActivityRequest createActivityRequest);

    /**
     * <p>
     * Creates a state machine.
     * </p>
     * 
     * @param createStateMachineRequest
     * @return Result of the CreateStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidDefinitionException
     *         The provided Amazon States Language definition is invalid.
     * @throws InvalidNameException
     *         The provided name is invalid.
     * @throws StateMachineAlreadyExistsException
     *         A state machine with the same name but a different definition or role ARN already exists.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws StateMachineLimitExceededException
     *         The maximum number of state machines has been reached. Existing state machines must be deleted before a
     *         new state machine can be created.
     * @sample AWSStepFunctions.CreateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStateMachineResult createStateMachine(CreateStateMachineRequest createStateMachineRequest);

    /**
     * <p>
     * Deletes an activity.
     * </p>
     * 
     * @param deleteActivityRequest
     * @return Result of the DeleteActivity operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DeleteActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteActivity" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteActivityResult deleteActivity(DeleteActivityRequest deleteActivityRequest);

    /**
     * <p>
     * Deletes a state machine. This is an asynchronous operation-- it sets the state machine's status to "DELETING" and
     * begins the delete process.
     * </p>
     * 
     * @param deleteStateMachineRequest
     * @return Result of the DeleteStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DeleteStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStateMachineResult deleteStateMachine(DeleteStateMachineRequest deleteStateMachineRequest);

    /**
     * <p>
     * Describes an activity.
     * </p>
     * 
     * @param describeActivityRequest
     * @return Result of the DescribeActivity operation returned by the service.
     * @throws ActivityDoesNotExistException
     *         The specified activity does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DescribeActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeActivity" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeActivityResult describeActivity(DescribeActivityRequest describeActivityRequest);

    /**
     * <p>
     * Describes an execution.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeExecutionResult describeExecution(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * Describes a state machine.
     * </p>
     * 
     * @param describeStateMachineRequest
     * @return Result of the DescribeStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @sample AWSStepFunctions.DescribeStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachine" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeStateMachineResult describeStateMachine(DescribeStateMachineRequest describeStateMachineRequest);

    /**
     * <p>
     * Used by workers to retrieve a task (with the specified activity ARN) scheduled for execution by a running state
     * machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a
     * task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds
     * on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll will
     * return an empty result, that is, the <code>taskToken</code> returned is an empty string.
     * </p>
     * <important>
     * <p>
     * Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum
     * time the service may hold the poll request).
     * </p>
     * </important>
     * 
     * @param getActivityTaskRequest
     * @return Result of the GetActivityTask operation returned by the service.
     * @throws ActivityDoesNotExistException
     *         The specified activity does not exist.
     * @throws ActivityWorkerLimitExceededException
     *         The maximum number of workers concurrently polling for activity tasks has been reached.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.GetActivityTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetActivityTask" target="_top">AWS API
     *      Documentation</a>
     */
    GetActivityTaskResult getActivityTask(GetActivityTaskRequest getActivityTaskRequest);

    /**
     * <p>
     * Returns the history of the specified execution as a list of events. By default, the results are returned in
     * ascending order of the <code>timeStamp</code> of the events. Use the <code>reverseOrder</code> parameter to get
     * the latest events first. The results may be split into multiple pages. To retrieve subsequent pages, make the
     * call again using the <code>nextToken</code> returned by the previous call.
     * </p>
     * 
     * @param getExecutionHistoryRequest
     * @return Result of the GetExecutionHistory operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @sample AWSStepFunctions.GetExecutionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetExecutionHistory" target="_top">AWS API
     *      Documentation</a>
     */
    GetExecutionHistoryResult getExecutionHistory(GetExecutionHistoryRequest getExecutionHistoryRequest);

    /**
     * <p>
     * Lists the existing activities. The results may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the <code>nextToken</code> returned by the previous call.
     * </p>
     * 
     * @param listActivitiesRequest
     * @return Result of the ListActivities operation returned by the service.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @sample AWSStepFunctions.ListActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListActivities" target="_top">AWS API
     *      Documentation</a>
     */
    ListActivitiesResult listActivities(ListActivitiesRequest listActivitiesRequest);

    /**
     * <p>
     * Lists the executions of a state machine that meet the filtering criteria. The results may be split into multiple
     * pages. To retrieve subsequent pages, make the call again using the <code>nextToken</code> returned by the
     * previous call.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @sample AWSStepFunctions.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    ListExecutionsResult listExecutions(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Lists the existing state machines. The results may be split into multiple pages. To retrieve subsequent pages,
     * make the call again using the <code>nextToken</code> returned by the previous call.
     * </p>
     * 
     * @param listStateMachinesRequest
     * @return Result of the ListStateMachines operation returned by the service.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @sample AWSStepFunctions.ListStateMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachines" target="_top">AWS API
     *      Documentation</a>
     */
    ListStateMachinesResult listStateMachines(ListStateMachinesRequest listStateMachinesRequest);

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> failed.
     * </p>
     * 
     * @param sendTaskFailureRequest
     * @return Result of the SendTaskFailure operation returned by the service.
     * @throws TaskDoesNotExistException
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws TaskTimedOutException
     * @sample AWSStepFunctions.SendTaskFailure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskFailure" target="_top">AWS API
     *      Documentation</a>
     */
    SendTaskFailureResult sendTaskFailure(SendTaskFailureRequest sendTaskFailureRequest);

    /**
     * <p>
     * Used by workers to report to the service that the task represented by the specified <code>taskToken</code> is
     * still making progress. This action resets the <code>Heartbeat</code> clock. The <code>Heartbeat</code> threshold
     * is specified in the state machine's Amazon States Language definition. This action does not in itself create an
     * event in the execution history. However, if the task times out, the execution history will contain an
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
     * @return Result of the SendTaskHeartbeat operation returned by the service.
     * @throws TaskDoesNotExistException
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws TaskTimedOutException
     * @sample AWSStepFunctions.SendTaskHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskHeartbeat" target="_top">AWS API
     *      Documentation</a>
     */
    SendTaskHeartbeatResult sendTaskHeartbeat(SendTaskHeartbeatRequest sendTaskHeartbeatRequest);

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> completed successfully.
     * </p>
     * 
     * @param sendTaskSuccessRequest
     * @return Result of the SendTaskSuccess operation returned by the service.
     * @throws TaskDoesNotExistException
     * @throws InvalidOutputException
     *         The provided JSON output data is invalid.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws TaskTimedOutException
     * @sample AWSStepFunctions.SendTaskSuccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskSuccess" target="_top">AWS API
     *      Documentation</a>
     */
    SendTaskSuccessResult sendTaskSuccess(SendTaskSuccessRequest sendTaskSuccessRequest);

    /**
     * <p>
     * Starts a state machine execution.
     * </p>
     * 
     * @param startExecutionRequest
     * @return Result of the StartExecution operation returned by the service.
     * @throws ExecutionLimitExceededException
     *         The maximum number of running executions has been reached. Running executions must end or be stopped
     *         before a new execution can be started.
     * @throws ExecutionAlreadyExistsException
     *         An execution with the same name already exists.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidExecutionInputException
     *         The provided JSON input data is invalid.
     * @throws InvalidNameException
     *         The provided name is invalid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @sample AWSStepFunctions.StartExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartExecution" target="_top">AWS API
     *      Documentation</a>
     */
    StartExecutionResult startExecution(StartExecutionRequest startExecutionRequest);

    /**
     * <p>
     * Stops an execution.
     * </p>
     * 
     * @param stopExecutionRequest
     * @return Result of the StopExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.StopExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StopExecution" target="_top">AWS API
     *      Documentation</a>
     */
    StopExecutionResult stopExecution(StopExecutionRequest stopExecutionRequest);

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
