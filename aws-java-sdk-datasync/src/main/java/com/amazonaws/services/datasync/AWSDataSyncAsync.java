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
package com.amazonaws.services.datasync;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;

/**
 * Interface for accessing DataSync asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.datasync.AbstractAWSDataSyncAsync} instead.
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
public interface AWSDataSyncAsync extends AWSDataSync {

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
     * @return A Java Future containing the result of the CancelTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsync.CancelTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CancelTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelTaskExecutionResult> cancelTaskExecutionAsync(CancelTaskExecutionRequest cancelTaskExecutionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CancelTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CancelTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelTaskExecutionResult> cancelTaskExecutionAsync(CancelTaskExecutionRequest cancelTaskExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelTaskExecutionRequest, CancelTaskExecutionResult> asyncHandler);

    /**
     * <p>
     * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent
     * with your account. In the activation process, you specify information such as the AWS Region that you want to
     * activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or
     * Amazon EFS) reside. Your tasks are created in this AWS Region.
     * </p>
     * <p>
     * You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
     * AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
     * must be AVAILABLE for the task to run. For more information, see <a href=
     * "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     * >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * </p>
     * <p>
     * Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption
     * to your tasks.
     * </p>
     * <p/>
     * 
     * @param createAgentRequest
     *        CreateAgentRequest
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSDataSyncAsync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent
     * with your account. In the activation process, you specify information such as the AWS Region that you want to
     * activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or
     * Amazon EFS) reside. Your tasks are created in this AWS Region.
     * </p>
     * <p>
     * You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
     * AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
     * must be AVAILABLE for the task to run. For more information, see <a href=
     * "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     * >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * </p>
     * <p>
     * Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption
     * to your tasks.
     * </p>
     * <p/>
     * 
     * @param createAgentRequest
     *        CreateAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentRequest, CreateAgentResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for an Amazon EFS file system.
     * </p>
     * 
     * @param createLocationEfsRequest
     *        CreateLocationEfsRequest
     * @return A Java Future containing the result of the CreateLocationEfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(CreateLocationEfsRequest createLocationEfsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon EFS file system.
     * </p>
     * 
     * @param createLocationEfsRequest
     *        CreateLocationEfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationEfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(CreateLocationEfsRequest createLocationEfsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationEfsRequest, CreateLocationEfsResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for a Network File System (NFS) file system.
     * </p>
     * 
     * @param createLocationNfsRequest
     *        CreateLocationNfsRequest
     * @return A Java Future containing the result of the CreateLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(CreateLocationNfsRequest createLocationNfsRequest);

    /**
     * <p>
     * Creates an endpoint for a Network File System (NFS) file system.
     * </p>
     * 
     * @param createLocationNfsRequest
     *        CreateLocationNfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(CreateLocationNfsRequest createLocationNfsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationNfsRequest, CreateLocationNfsResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for an Amazon S3 bucket.
     * </p>
     * <p>
     * For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role
     * that has the required permissions. You can set up the required permissions by creating an IAM policy that grants
     * the required permissions and attaching the policy to the role. An example of such a policy is shown in the
     * examples section. For more information, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/configuring-s3-locations.html">Configuring Amazon
     * S3 Location Settings</a> in the <i>AWS DataSync User Guide</i>.
     * </p>
     * 
     * @param createLocationS3Request
     *        CreateLocationS3Request
     * @return A Java Future containing the result of the CreateLocationS3 operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(CreateLocationS3Request createLocationS3Request);

    /**
     * <p>
     * Creates an endpoint for an Amazon S3 bucket.
     * </p>
     * <p>
     * For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role
     * that has the required permissions. You can set up the required permissions by creating an IAM policy that grants
     * the required permissions and attaching the policy to the role. An example of such a policy is shown in the
     * examples section. For more information, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/configuring-s3-locations.html">Configuring Amazon
     * S3 Location Settings</a> in the <i>AWS DataSync User Guide</i>.
     * </p>
     * 
     * @param createLocationS3Request
     *        CreateLocationS3Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationS3 operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(CreateLocationS3Request createLocationS3Request,
            com.amazonaws.handlers.AsyncHandler<CreateLocationS3Request, CreateLocationS3Result> asyncHandler);

    /**
     * <p>
     * Creates a task. A task is a set of two locations (source and destination) and a set of default
     * <code>OverrideOptions</code> that you use to control the behavior of a task. If you don't specify default values
     * for <code>Options</code> when you create a task, AWS DataSync populates them with safe service defaults.
     * </p>
     * <p>
     * When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING
     * status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the
     * AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a
     * destination before every task execution and then unmounts it after every task execution.
     * </p>
     * <p>
     * If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE
     * status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your
     * agent might be having trouble mounting the source NFS file system. Check the task's <code>ErrorCode</code> and
     * <code>ErrorDetail</code>. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS
     * server host name.
     * </p>
     * 
     * @param createTaskRequest
     *        CreateTaskRequest
     * @return A Java Future containing the result of the CreateTask operation returned by the service.
     * @sample AWSDataSyncAsync.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest createTaskRequest);

    /**
     * <p>
     * Creates a task. A task is a set of two locations (source and destination) and a set of default
     * <code>OverrideOptions</code> that you use to control the behavior of a task. If you don't specify default values
     * for <code>Options</code> when you create a task, AWS DataSync populates them with safe service defaults.
     * </p>
     * <p>
     * When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING
     * status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the
     * AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a
     * destination before every task execution and then unmounts it after every task execution.
     * </p>
     * <p>
     * If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE
     * status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your
     * agent might be having trouble mounting the source NFS file system. Check the task's <code>ErrorCode</code> and
     * <code>ErrorDetail</code>. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS
     * server host name.
     * </p>
     * 
     * @param createTaskRequest
     *        CreateTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTask operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest createTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTaskRequest, CreateTaskResult> asyncHandler);

    /**
     * <p>
     * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
     * request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent
     * virtual machine (VM) from your on-premises environment.
     * </p>
     * <note>
     * <p>
     * After you delete an agent, you can't reactivate it and you longer pay software charges for it.
     * </p>
     * </note>
     * 
     * @param deleteAgentRequest
     *        DeleteAgentRequest
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSDataSyncAsync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
     * request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent
     * virtual machine (VM) from your on-premises environment.
     * </p>
     * <note>
     * <p>
     * After you delete an agent, you can't reactivate it and you longer pay software charges for it.
     * </p>
     * </note>
     * 
     * @param deleteAgentRequest
     *        DeleteAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentRequest, DeleteAgentResult> asyncHandler);

    /**
     * <p>
     * Deletes the configuration of a location used by AWS DataSync.
     * </p>
     * 
     * @param deleteLocationRequest
     *        DeleteLocation
     * @return A Java Future containing the result of the DeleteLocation operation returned by the service.
     * @sample AWSDataSyncAsync.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest deleteLocationRequest);

    /**
     * <p>
     * Deletes the configuration of a location used by AWS DataSync.
     * </p>
     * 
     * @param deleteLocationRequest
     *        DeleteLocation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLocation operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest deleteLocationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLocationRequest, DeleteLocationResult> asyncHandler);

    /**
     * <p>
     * Deletes a task.
     * </p>
     * 
     * @param deleteTaskRequest
     *        DeleteTask
     * @return A Java Future containing the result of the DeleteTask operation returned by the service.
     * @sample AWSDataSyncAsync.DeleteTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTaskResult> deleteTaskAsync(DeleteTaskRequest deleteTaskRequest);

    /**
     * <p>
     * Deletes a task.
     * </p>
     * 
     * @param deleteTaskRequest
     *        DeleteTask
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTask operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DeleteTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTaskResult> deleteTaskAsync(DeleteTaskRequest deleteTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTaskRequest, DeleteTaskResult> asyncHandler);

    /**
     * <p>
     * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
     * or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
     * request.
     * </p>
     * 
     * @param describeAgentRequest
     *        DescribeAgent
     * @return A Java Future containing the result of the DescribeAgent operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgentResult> describeAgentAsync(DescribeAgentRequest describeAgentRequest);

    /**
     * <p>
     * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
     * or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
     * request.
     * </p>
     * 
     * @param describeAgentRequest
     *        DescribeAgent
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgent operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgentResult> describeAgentAsync(DescribeAgentRequest describeAgentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentRequest, DescribeAgentResult> asyncHandler);

    /**
     * <p>
     * Returns metadata, such as the path information about an Amazon EFS location.
     * </p>
     * 
     * @param describeLocationEfsRequest
     *        DescribeLocationEfsRequest
     * @return A Java Future containing the result of the DescribeLocationEfs operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationEfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationEfsResult> describeLocationEfsAsync(DescribeLocationEfsRequest describeLocationEfsRequest);

    /**
     * <p>
     * Returns metadata, such as the path information about an Amazon EFS location.
     * </p>
     * 
     * @param describeLocationEfsRequest
     *        DescribeLocationEfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationEfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationEfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationEfsResult> describeLocationEfsAsync(DescribeLocationEfsRequest describeLocationEfsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationEfsRequest, DescribeLocationEfsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata, such as the path information, about a NFS location.
     * </p>
     * 
     * @param describeLocationNfsRequest
     *        DescribeLocationNfsRequest
     * @return A Java Future containing the result of the DescribeLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationNfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationNfsResult> describeLocationNfsAsync(DescribeLocationNfsRequest describeLocationNfsRequest);

    /**
     * <p>
     * Returns metadata, such as the path information, about a NFS location.
     * </p>
     * 
     * @param describeLocationNfsRequest
     *        DescribeLocationNfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationNfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationNfsResult> describeLocationNfsAsync(DescribeLocationNfsRequest describeLocationNfsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationNfsRequest, DescribeLocationNfsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
     * </p>
     * 
     * @param describeLocationS3Request
     *        DescribeLocationS3Request
     * @return A Java Future containing the result of the DescribeLocationS3 operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationS3Result> describeLocationS3Async(DescribeLocationS3Request describeLocationS3Request);

    /**
     * <p>
     * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
     * </p>
     * 
     * @param describeLocationS3Request
     *        DescribeLocationS3Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationS3 operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationS3Result> describeLocationS3Async(DescribeLocationS3Request describeLocationS3Request,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationS3Request, DescribeLocationS3Result> asyncHandler);

    /**
     * <p>
     * Returns metadata about a task.
     * </p>
     * 
     * @param describeTaskRequest
     *        DescribeTaskRequest
     * @return A Java Future containing the result of the DescribeTask operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest describeTaskRequest);

    /**
     * <p>
     * Returns metadata about a task.
     * </p>
     * 
     * @param describeTaskRequest
     *        DescribeTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTask operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest describeTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskRequest, DescribeTaskResult> asyncHandler);

    /**
     * <p>
     * Returns detailed metadata about a task that is being executed.
     * </p>
     * 
     * @param describeTaskExecutionRequest
     *        DescribeTaskExecutionRequest
     * @return A Java Future containing the result of the DescribeTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTaskExecutionResult> describeTaskExecutionAsync(DescribeTaskExecutionRequest describeTaskExecutionRequest);

    /**
     * <p>
     * Returns detailed metadata about a task that is being executed.
     * </p>
     * 
     * @param describeTaskExecutionRequest
     *        DescribeTaskExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTaskExecutionResult> describeTaskExecutionAsync(DescribeTaskExecutionRequest describeTaskExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskExecutionRequest, DescribeTaskExecutionResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSDataSyncAsync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentsRequest, ListAgentsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListLocations operation returned by the service.
     * @sample AWSDataSyncAsync.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest listLocationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLocations operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest listLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLocationsRequest, ListLocationsResult> asyncHandler);

    /**
     * <p>
     * Returns all the tags associated with a specified resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDataSyncAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns all the tags associated with a specified resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of executed tasks.
     * </p>
     * 
     * @param listTaskExecutionsRequest
     *        ListTaskExecutions
     * @return A Java Future containing the result of the ListTaskExecutions operation returned by the service.
     * @sample AWSDataSyncAsync.ListTaskExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTaskExecutionsResult> listTaskExecutionsAsync(ListTaskExecutionsRequest listTaskExecutionsRequest);

    /**
     * <p>
     * Returns a list of executed tasks.
     * </p>
     * 
     * @param listTaskExecutionsRequest
     *        ListTaskExecutions
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTaskExecutions operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListTaskExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTaskExecutionsResult> listTaskExecutionsAsync(ListTaskExecutionsRequest listTaskExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTaskExecutionsRequest, ListTaskExecutionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the tasks.
     * </p>
     * 
     * @param listTasksRequest
     *        ListTasksRequest
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AWSDataSyncAsync.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest);

    /**
     * <p>
     * Returns a list of all the tasks.
     * </p>
     * 
     * @param listTasksRequest
     *        ListTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler);

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
     * For detailed information, see <i>Task Execution</i> in <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/how-awssync-works.html#terminology">Components
     * and Terminology</a> in the <i>AWS DataSync User Guide</i>.
     * </p>
     * 
     * @param startTaskExecutionRequest
     *        StartTaskExecutionRequest
     * @return A Java Future containing the result of the StartTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsync.StartTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(StartTaskExecutionRequest startTaskExecutionRequest);

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
     * For detailed information, see <i>Task Execution</i> in <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/how-awssync-works.html#terminology">Components
     * and Terminology</a> in the <i>AWS DataSync User Guide</i>.
     * </p>
     * 
     * @param startTaskExecutionRequest
     *        StartTaskExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.StartTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(StartTaskExecutionRequest startTaskExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartTaskExecutionRequest, StartTaskExecutionResult> asyncHandler);

    /**
     * <p>
     * Applies a key-value pair to an AWS resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSDataSyncAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies a key-value pair to an AWS resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from an AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSDataSyncAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from an AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the name of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     *        UpdateAgentRequest
     * @return A Java Future containing the result of the UpdateAgent operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates the name of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     *        UpdateAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgent operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest updateAgentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentRequest, UpdateAgentResult> asyncHandler);

    /**
     * <p>
     * Updates the metadata associated with a task.
     * </p>
     * 
     * @param updateTaskRequest
     *        UpdateTaskResponse
     * @return A Java Future containing the result of the UpdateTask operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest updateTaskRequest);

    /**
     * <p>
     * Updates the metadata associated with a task.
     * </p>
     * 
     * @param updateTaskRequest
     *        UpdateTaskResponse
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTask operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest updateTaskRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTaskRequest, UpdateTaskResult> asyncHandler);

}
