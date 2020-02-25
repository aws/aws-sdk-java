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
package com.amazonaws.services.datasync;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.datasync.model.*;

/**
 * Interface for accessing DataSync.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.datasync.AbstractAWSDataSync} instead.
 * </p>
 * <p>
 * <fullname>AWS DataSync</fullname>
 * <p>
 * AWS DataSync is a managed data transfer service that makes it simpler for you to automate moving data between
 * on-premises storage and Amazon Simple Storage Service (Amazon S3) or Amazon Elastic File System (Amazon EFS).
 * </p>
 * <p>
 * This API interface reference for AWS DataSync contains documentation for a programming interface that you can use to
 * manage AWS DataSync.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDataSync {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "datasync";

    /**
     * <p>
     * Cancels execution of a task.
     * </p>
     * <p>
     * When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that
     * are transferred to the destination might be incomplete or inconsistent with the source files. However, if you
     * start a new task execution on the same task and you allow the task execution to complete, file content on the
     * destination is complete and consistent. This applies to other unexpected failures that interrupt a task
     * execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task
     * execution.
     * </p>
     * 
     * @param cancelTaskExecutionRequest
     *        CancelTaskExecutionRequest
     * @return Result of the CancelTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CancelTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CancelTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    CancelTaskExecutionResult cancelTaskExecution(CancelTaskExecutionRequest cancelTaskExecutionRequest);

    /**
     * <p>
     * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent
     * with your account. In the activation process, you specify information such as the AWS Region that you want to
     * activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or
     * Amazon EFS) reside. Your tasks are created in this AWS Region.
     * </p>
     * <p>
     * You can activate the agent in a VPC (Virtual private Cloud) or provide the agent access to a VPC endpoint so you
     * can run tasks without going over the public Internet.
     * </p>
     * <p>
     * You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
     * AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
     * must be AVAILABLE for the task to run.
     * </p>
     * <p>
     * Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption
     * to your tasks.
     * </p>
     * <p/>
     * 
     * @param createAgentRequest
     *        CreateAgentRequest
     * @return Result of the CreateAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAgentResult createAgent(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon EFS file system.
     * </p>
     * 
     * @param createLocationEfsRequest
     *        CreateLocationEfsRequest
     * @return Result of the CreateLocationEfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationEfsResult createLocationEfs(CreateLocationEfsRequest createLocationEfsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Windows file system.
     * </p>
     * 
     * @param createLocationFsxWindowsRequest
     * @return Result of the CreateLocationFsxWindows operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationFsxWindowsResult createLocationFsxWindows(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest);

    /**
     * <p>
     * Defines a file system on a Network File System (NFS) server that can be read from or written to
     * </p>
     * 
     * @param createLocationNfsRequest
     *        CreateLocationNfsRequest
     * @return Result of the CreateLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationNfsResult createLocationNfs(CreateLocationNfsRequest createLocationNfsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon S3 bucket.
     * </p>
     * <p>
     * For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role
     * that has the required permissions. You can set up the required permissions by creating an IAM policy that grants
     * the required permissions and attaching the policy to the role. An example of such a policy is shown in the
     * examples section.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location in the
     * <i>AWS DataSync User Guide.</i>
     * </p>
     * 
     * @param createLocationS3Request
     *        CreateLocationS3Request
     * @return Result of the CreateLocationS3 operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationS3Result createLocationS3(CreateLocationS3Request createLocationS3Request);

    /**
     * <p>
     * Defines a file system on an Server Message Block (SMB) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationSmbRequest
     *        CreateLocationSmbRequest
     * @return Result of the CreateLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationSmbResult createLocationSmb(CreateLocationSmbRequest createLocationSmbRequest);

    /**
     * <p>
     * Creates a task. A task is a set of two locations (source and destination) and a set of Options that you use to
     * control the behavior of a task. If you don't specify Options when you create a task, AWS DataSync populates them
     * with service defaults.
     * </p>
     * <p>
     * When you create a task, it first enters the CREATING state. During CREATING AWS DataSync attempts to mount the
     * on-premises Network File System (NFS) location. The task transitions to the AVAILABLE state without waiting for
     * the AWS location to become mounted. If required, AWS DataSync mounts the AWS location before each task execution.
     * </p>
     * <p>
     * If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE
     * status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your
     * agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail.
     * Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
     * </p>
     * 
     * @param createTaskRequest
     *        CreateTaskRequest
     * @return Result of the CreateTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTaskResult createTask(CreateTaskRequest createTaskRequest);

    /**
     * <p>
     * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
     * request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent
     * virtual machine (VM) from your on-premises environment.
     * </p>
     * 
     * @param deleteAgentRequest
     *        DeleteAgentRequest
     * @return Result of the DeleteAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAgentResult deleteAgent(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes the configuration of a location used by AWS DataSync.
     * </p>
     * 
     * @param deleteLocationRequest
     *        DeleteLocation
     * @return Result of the DeleteLocation operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLocationResult deleteLocation(DeleteLocationRequest deleteLocationRequest);

    /**
     * <p>
     * Deletes a task.
     * </p>
     * 
     * @param deleteTaskRequest
     *        DeleteTask
     * @return Result of the DeleteTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DeleteTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteTask" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTaskResult deleteTask(DeleteTaskRequest deleteTaskRequest);

    /**
     * <p>
     * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
     * or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
     * request.
     * </p>
     * 
     * @param describeAgentRequest
     *        DescribeAgent
     * @return Result of the DescribeAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeAgent" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAgentResult describeAgent(DescribeAgentRequest describeAgentRequest);

    /**
     * <p>
     * Returns metadata, such as the path information about an Amazon EFS location.
     * </p>
     * 
     * @param describeLocationEfsRequest
     *        DescribeLocationEfsRequest
     * @return Result of the DescribeLocationEfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationEfs" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationEfsResult describeLocationEfs(DescribeLocationEfsRequest describeLocationEfsRequest);

    /**
     * <p>
     * Returns metadata, such as the path information about an Amazon FSx for Windows location.
     * </p>
     * 
     * @param describeLocationFsxWindowsRequest
     * @return Result of the DescribeLocationFsxWindows operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationFsxWindowsResult describeLocationFsxWindows(DescribeLocationFsxWindowsRequest describeLocationFsxWindowsRequest);

    /**
     * <p>
     * Returns metadata, such as the path information, about a NFS location.
     * </p>
     * 
     * @param describeLocationNfsRequest
     *        DescribeLocationNfsRequest
     * @return Result of the DescribeLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationNfs" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationNfsResult describeLocationNfs(DescribeLocationNfsRequest describeLocationNfsRequest);

    /**
     * <p>
     * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
     * </p>
     * 
     * @param describeLocationS3Request
     *        DescribeLocationS3Request
     * @return Result of the DescribeLocationS3 operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationS3Result describeLocationS3(DescribeLocationS3Request describeLocationS3Request);

    /**
     * <p>
     * Returns metadata, such as the path and user information about a SMB location.
     * </p>
     * 
     * @param describeLocationSmbRequest
     *        DescribeLocationSmbRequest
     * @return Result of the DescribeLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationSmb" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationSmbResult describeLocationSmb(DescribeLocationSmbRequest describeLocationSmbRequest);

    /**
     * <p>
     * Returns metadata about a task.
     * </p>
     * 
     * @param describeTaskRequest
     *        DescribeTaskRequest
     * @return Result of the DescribeTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTask" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTaskResult describeTask(DescribeTaskRequest describeTaskRequest);

    /**
     * <p>
     * Returns detailed metadata about a task that is being executed.
     * </p>
     * 
     * @param describeTaskExecutionRequest
     *        DescribeTaskExecutionRequest
     * @return Result of the DescribeTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.DescribeTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTaskExecutionResult describeTaskExecution(DescribeTaskExecutionRequest describeTaskExecutionRequest);

    /**
     * <p>
     * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is
     * ordered by agent Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you
     * to optionally reduce the number of agents returned in a response.
     * </p>
     * <p>
     * If you have more agents than are returned in a response (that is, the response returns only a truncated list of
     * your agents), the response contains a marker that you can specify in your next request to fetch the next page of
     * agents.
     * </p>
     * 
     * @param listAgentsRequest
     *        ListAgentsRequest
     * @return Result of the ListAgents operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    ListAgentsResult listAgents(ListAgentsRequest listAgentsRequest);

    /**
     * <p>
     * Returns a lists of source and destination locations.
     * </p>
     * <p>
     * If you have more locations than are returned in a response (that is, the response returns only a truncated list
     * of your agents), the response contains a token that you can specify in your next request to fetch the next page
     * of locations.
     * </p>
     * 
     * @param listLocationsRequest
     *        ListLocationsRequest
     * @return Result of the ListLocations operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    ListLocationsResult listLocations(ListLocationsRequest listLocationsRequest);

    /**
     * <p>
     * Returns all the tags associated with a specified resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of executed tasks.
     * </p>
     * 
     * @param listTaskExecutionsRequest
     *        ListTaskExecutions
     * @return Result of the ListTaskExecutions operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.ListTaskExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    ListTaskExecutionsResult listTaskExecutions(ListTaskExecutionsRequest listTaskExecutionsRequest);

    /**
     * <p>
     * Returns a list of all the tasks.
     * </p>
     * 
     * @param listTasksRequest
     *        ListTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    ListTasksResult listTasks(ListTasksRequest listTasksRequest);

    /**
     * <p>
     * Starts a specific invocation of a task. A <code>TaskExecution</code> value represents an individual run of a
     * task. Each task can have at most one <code>TaskExecution</code> at a time.
     * </p>
     * <p>
     * <code>TaskExecution</code> has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING |
     * VERIFYING | SUCCESS/FAILURE.
     * </p>
     * <p>
     * For detailed information, see the Task Execution section in the Components and Terminology topic in the <i>AWS
     * DataSync User Guide</i>.
     * </p>
     * 
     * @param startTaskExecutionRequest
     *        StartTaskExecutionRequest
     * @return Result of the StartTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.StartTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StartTaskExecutionResult startTaskExecution(StartTaskExecutionRequest startTaskExecutionRequest);

    /**
     * <p>
     * Applies a key-value pair to an AWS resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from an AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the name of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     *        UpdateAgentRequest
     * @return Result of the UpdateAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAgentResult updateAgent(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates the metadata associated with a task.
     * </p>
     * 
     * @param updateTaskRequest
     *        UpdateTaskResponse
     * @return Result of the UpdateTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the AWS DataSync service.
     * @sample AWSDataSync.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTaskResult updateTask(UpdateTaskRequest updateTaskRequest);

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
