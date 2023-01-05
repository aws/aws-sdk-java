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
 * <fullname>DataSync</fullname>
 * <p>
 * DataSync is a managed data transfer service that makes it simpler for you to automate moving data between on-premises
 * storage and Amazon Web Services storage services. You also can use DataSync to transfer data between other cloud
 * providers and Amazon Web Services storage services.
 * </p>
 * <p>
 * This API interface reference includes documentation for using DataSync programmatically. For complete information,
 * see the <i> <a href="https://docs.aws.amazon.com/datasync/latest/userguide/what-is-datasync.html">DataSync User
 * Guide</a> </i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDataSyncAsync extends AWSDataSync {

    /**
     * <p>
     * Stops an DataSync task execution that's in progress. The transfer of some files are abruptly interrupted. File
     * contents that're transferred to the destination might be incomplete or inconsistent with the source files.
     * </p>
     * <p>
     * However, if you start a new task execution using the same task and allow it to finish, file content on the
     * destination will be complete and consistent. This applies to other unexpected failures that interrupt a task
     * execution. In all of these cases, DataSync successfully completes the transfer when you start the next task
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
     * Stops an DataSync task execution that's in progress. The transfer of some files are abruptly interrupted. File
     * contents that're transferred to the destination might be incomplete or inconsistent with the source files.
     * </p>
     * <p>
     * However, if you start a new task execution using the same task and allow it to finish, file content on the
     * destination will be complete and consistent. This applies to other unexpected failures that interrupt a task
     * execution. In all of these cases, DataSync successfully completes the transfer when you start the next task
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
     * Activates an DataSync agent that you have deployed in your storage environment. The activation process associates
     * your agent with your account. In the activation process, you specify information such as the Amazon Web Services
     * Region that you want to activate the agent in. You activate the agent in the Amazon Web Services Region where
     * your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this Amazon Web Services
     * Region.
     * </p>
     * <p>
     * You can activate the agent in a VPC (virtual private cloud) or provide the agent access to a VPC endpoint so you
     * can run tasks without going over the public internet.
     * </p>
     * <p>
     * You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
     * AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
     * must be AVAILABLE for the task to run.
     * </p>
     * <p>
     * Agents are automatically updated by Amazon Web Services on a regular basis, using a mechanism that ensures
     * minimal interruption to your tasks.
     * </p>
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
     * Activates an DataSync agent that you have deployed in your storage environment. The activation process associates
     * your agent with your account. In the activation process, you specify information such as the Amazon Web Services
     * Region that you want to activate the agent in. You activate the agent in the Amazon Web Services Region where
     * your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this Amazon Web Services
     * Region.
     * </p>
     * <p>
     * You can activate the agent in a VPC (virtual private cloud) or provide the agent access to a VPC endpoint so you
     * can run tasks without going over the public internet.
     * </p>
     * <p>
     * You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
     * AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
     * must be AVAILABLE for the task to run.
     * </p>
     * <p>
     * Agents are automatically updated by Amazon Web Services on a regular basis, using a mechanism that ensures
     * minimal interruption to your tasks.
     * </p>
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
     * Creates an endpoint for an Amazon EFS file system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html">Creating a location
     * for Amazon EFS</a>.
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
     * Creates an endpoint for an Amazon EFS file system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html">Creating a location
     * for Amazon EFS</a>.
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
     * Creates an endpoint for an Amazon FSx for Lustre file system.
     * </p>
     * 
     * @param createLocationFsxLustreRequest
     * @return A Java Future containing the result of the CreateLocationFsxLustre operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxLustreResult> createLocationFsxLustreAsync(CreateLocationFsxLustreRequest createLocationFsxLustreRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Lustre file system.
     * </p>
     * 
     * @param createLocationFsxLustreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationFsxLustre operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxLustreResult> createLocationFsxLustreAsync(CreateLocationFsxLustreRequest createLocationFsxLustreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationFsxLustreRequest, CreateLocationFsxLustreResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for NetApp ONTAP file system that DataSync can access for a transfer. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html">Creating a location for
     * FSx for ONTAP</a>.
     * </p>
     * 
     * @param createLocationFsxOntapRequest
     * @return A Java Future containing the result of the CreateLocationFsxOntap operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxOntapResult> createLocationFsxOntapAsync(CreateLocationFsxOntapRequest createLocationFsxOntapRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for NetApp ONTAP file system that DataSync can access for a transfer. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html">Creating a location for
     * FSx for ONTAP</a>.
     * </p>
     * 
     * @param createLocationFsxOntapRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationFsxOntap operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxOntapResult> createLocationFsxOntapAsync(CreateLocationFsxOntapRequest createLocationFsxOntapRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationFsxOntapRequest, CreateLocationFsxOntapResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for OpenZFS file system that DataSync can access for a transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-openzfs-location.html">Creating a location for
     * FSx for OpenZFS</a>.
     * </p>
     * <note>
     * <p>
     * Request parameters related to <code>SMB</code> aren't supported with the <code>CreateLocationFsxOpenZfs</code>
     * operation.
     * </p>
     * </note>
     * 
     * @param createLocationFsxOpenZfsRequest
     * @return A Java Future containing the result of the CreateLocationFsxOpenZfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxOpenZfsResult> createLocationFsxOpenZfsAsync(CreateLocationFsxOpenZfsRequest createLocationFsxOpenZfsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for OpenZFS file system that DataSync can access for a transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-openzfs-location.html">Creating a location for
     * FSx for OpenZFS</a>.
     * </p>
     * <note>
     * <p>
     * Request parameters related to <code>SMB</code> aren't supported with the <code>CreateLocationFsxOpenZfs</code>
     * operation.
     * </p>
     * </note>
     * 
     * @param createLocationFsxOpenZfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationFsxOpenZfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxOpenZfsResult> createLocationFsxOpenZfsAsync(CreateLocationFsxOpenZfsRequest createLocationFsxOpenZfsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationFsxOpenZfsRequest, CreateLocationFsxOpenZfsResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param createLocationFsxWindowsRequest
     * @return A Java Future containing the result of the CreateLocationFsxWindows operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxWindowsResult> createLocationFsxWindowsAsync(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param createLocationFsxWindowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationFsxWindows operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxWindowsResult> createLocationFsxWindowsAsync(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationFsxWindowsRequest, CreateLocationFsxWindowsResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for a Hadoop Distributed File System (HDFS).
     * </p>
     * 
     * @param createLocationHdfsRequest
     * @return A Java Future containing the result of the CreateLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationHdfsResult> createLocationHdfsAsync(CreateLocationHdfsRequest createLocationHdfsRequest);

    /**
     * <p>
     * Creates an endpoint for a Hadoop Distributed File System (HDFS).
     * </p>
     * 
     * @param createLocationHdfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationHdfsResult> createLocationHdfsAsync(CreateLocationHdfsRequest createLocationHdfsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationHdfsRequest, CreateLocationHdfsResult> asyncHandler);

    /**
     * <p>
     * Defines a file system on a Network File System (NFS) server that can be read from or written to.
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
     * Defines a file system on a Network File System (NFS) server that can be read from or written to.
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
     * Creates an endpoint for an object storage system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a
     * location for object storage</a>.
     * </p>
     * 
     * @param createLocationObjectStorageRequest
     *        CreateLocationObjectStorageRequest
     * @return A Java Future containing the result of the CreateLocationObjectStorage operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationObjectStorageResult> createLocationObjectStorageAsync(
            CreateLocationObjectStorageRequest createLocationObjectStorageRequest);

    /**
     * <p>
     * Creates an endpoint for an object storage system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a
     * location for object storage</a>.
     * </p>
     * 
     * @param createLocationObjectStorageRequest
     *        CreateLocationObjectStorageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationObjectStorage operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationObjectStorageResult> createLocationObjectStorageAsync(
            CreateLocationObjectStorageRequest createLocationObjectStorageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationObjectStorageRequest, CreateLocationObjectStorageResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint for an Amazon S3 bucket that DataSync can access for a transfer.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-locations-cli.html#create-location-s3-cli"
     * >Create an Amazon S3 location</a> in the <i>DataSync User Guide</i>.
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
     * Creates an endpoint for an Amazon S3 bucket that DataSync can access for a transfer.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-locations-cli.html#create-location-s3-cli"
     * >Create an Amazon S3 location</a> in the <i>DataSync User Guide</i>.
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
     * Defines a file system on a Server Message Block (SMB) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationSmbRequest
     *        CreateLocationSmbRequest
     * @return A Java Future containing the result of the CreateLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationSmbResult> createLocationSmbAsync(CreateLocationSmbRequest createLocationSmbRequest);

    /**
     * <p>
     * Defines a file system on a Server Message Block (SMB) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationSmbRequest
     *        CreateLocationSmbRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationSmbResult> createLocationSmbAsync(CreateLocationSmbRequest createLocationSmbRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationSmbRequest, CreateLocationSmbResult> asyncHandler);

    /**
     * <p>
     * Configures a task, which defines where and how DataSync transfers your data.
     * </p>
     * <p>
     * A task includes a source location, a destination location, and the preferences for how and when you want to
     * transfer your data (such as bandwidth limits, scheduling, among other options).
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
     * Configures a task, which defines where and how DataSync transfers your data.
     * </p>
     * <p>
     * A task includes a source location, a destination location, and the preferences for how and when you want to
     * transfer your data (such as bandwidth limits, scheduling, among other options).
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
     * request. The operation disassociates the agent from your Amazon Web Services account. However, it doesn't delete
     * the agent virtual machine (VM) from your on-premises environment.
     * </p>
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
     * request. The operation disassociates the agent from your Amazon Web Services account. However, it doesn't delete
     * the agent virtual machine (VM) from your on-premises environment.
     * </p>
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
     * Deletes the configuration of a location used by DataSync.
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
     * Deletes the configuration of a location used by DataSync.
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
     * Deletes an DataSync task.
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
     * Deletes an DataSync task.
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
     * Returns metadata about your DataSync location for an Amazon EFS file system.
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
     * Returns metadata about your DataSync location for an Amazon EFS file system.
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
     * Provides details about how an DataSync location for an Amazon FSx for Lustre file system is configured.
     * </p>
     * 
     * @param describeLocationFsxLustreRequest
     * @return A Java Future containing the result of the DescribeLocationFsxLustre operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxLustreResult> describeLocationFsxLustreAsync(
            DescribeLocationFsxLustreRequest describeLocationFsxLustreRequest);

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for Lustre file system is configured.
     * </p>
     * 
     * @param describeLocationFsxLustreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationFsxLustre operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxLustreResult> describeLocationFsxLustreAsync(
            DescribeLocationFsxLustreRequest describeLocationFsxLustreRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationFsxLustreRequest, DescribeLocationFsxLustreResult> asyncHandler);

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for NetApp ONTAP file system is configured.
     * </p>
     * <note>
     * <p>
     * If your location uses SMB, the <code>DescribeLocationFsxOntap</code> operation doesn't actually return a
     * <code>Password</code>.
     * </p>
     * </note>
     * 
     * @param describeLocationFsxOntapRequest
     * @return A Java Future containing the result of the DescribeLocationFsxOntap operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxOntapResult> describeLocationFsxOntapAsync(DescribeLocationFsxOntapRequest describeLocationFsxOntapRequest);

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for NetApp ONTAP file system is configured.
     * </p>
     * <note>
     * <p>
     * If your location uses SMB, the <code>DescribeLocationFsxOntap</code> operation doesn't actually return a
     * <code>Password</code>.
     * </p>
     * </note>
     * 
     * @param describeLocationFsxOntapRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationFsxOntap operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxOntapResult> describeLocationFsxOntapAsync(DescribeLocationFsxOntapRequest describeLocationFsxOntapRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationFsxOntapRequest, DescribeLocationFsxOntapResult> asyncHandler);

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for OpenZFS file system is configured.
     * </p>
     * <note>
     * <p>
     * Response elements related to <code>SMB</code> aren't supported with the <code>DescribeLocationFsxOpenZfs</code>
     * operation.
     * </p>
     * </note>
     * 
     * @param describeLocationFsxOpenZfsRequest
     * @return A Java Future containing the result of the DescribeLocationFsxOpenZfs operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxOpenZfsResult> describeLocationFsxOpenZfsAsync(
            DescribeLocationFsxOpenZfsRequest describeLocationFsxOpenZfsRequest);

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for OpenZFS file system is configured.
     * </p>
     * <note>
     * <p>
     * Response elements related to <code>SMB</code> aren't supported with the <code>DescribeLocationFsxOpenZfs</code>
     * operation.
     * </p>
     * </note>
     * 
     * @param describeLocationFsxOpenZfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationFsxOpenZfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxOpenZfsResult> describeLocationFsxOpenZfsAsync(
            DescribeLocationFsxOpenZfsRequest describeLocationFsxOpenZfsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationFsxOpenZfsRequest, DescribeLocationFsxOpenZfsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about an Amazon FSx for Windows File Server location, such as information about its path.
     * </p>
     * 
     * @param describeLocationFsxWindowsRequest
     * @return A Java Future containing the result of the DescribeLocationFsxWindows operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxWindowsResult> describeLocationFsxWindowsAsync(
            DescribeLocationFsxWindowsRequest describeLocationFsxWindowsRequest);

    /**
     * <p>
     * Returns metadata about an Amazon FSx for Windows File Server location, such as information about its path.
     * </p>
     * 
     * @param describeLocationFsxWindowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationFsxWindows operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxWindowsResult> describeLocationFsxWindowsAsync(
            DescribeLocationFsxWindowsRequest describeLocationFsxWindowsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationFsxWindowsRequest, DescribeLocationFsxWindowsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata, such as the authentication information about the Hadoop Distributed File System (HDFS)
     * location.
     * </p>
     * 
     * @param describeLocationHdfsRequest
     * @return A Java Future containing the result of the DescribeLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationHdfsResult> describeLocationHdfsAsync(DescribeLocationHdfsRequest describeLocationHdfsRequest);

    /**
     * <p>
     * Returns metadata, such as the authentication information about the Hadoop Distributed File System (HDFS)
     * location.
     * </p>
     * 
     * @param describeLocationHdfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationHdfsResult> describeLocationHdfsAsync(DescribeLocationHdfsRequest describeLocationHdfsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationHdfsRequest, DescribeLocationHdfsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata, such as the path information, about an NFS location.
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
     * Returns metadata, such as the path information, about an NFS location.
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
     * Returns metadata about your DataSync location for an object storage system.
     * </p>
     * 
     * @param describeLocationObjectStorageRequest
     *        DescribeLocationObjectStorageRequest
     * @return A Java Future containing the result of the DescribeLocationObjectStorage operation returned by the
     *         service.
     * @sample AWSDataSyncAsync.DescribeLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationObjectStorageResult> describeLocationObjectStorageAsync(
            DescribeLocationObjectStorageRequest describeLocationObjectStorageRequest);

    /**
     * <p>
     * Returns metadata about your DataSync location for an object storage system.
     * </p>
     * 
     * @param describeLocationObjectStorageRequest
     *        DescribeLocationObjectStorageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationObjectStorage operation returned by the
     *         service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationObjectStorageResult> describeLocationObjectStorageAsync(
            DescribeLocationObjectStorageRequest describeLocationObjectStorageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationObjectStorageRequest, DescribeLocationObjectStorageResult> asyncHandler);

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
     * Returns metadata, such as the path and user information about an SMB location.
     * </p>
     * 
     * @param describeLocationSmbRequest
     *        DescribeLocationSmbRequest
     * @return A Java Future containing the result of the DescribeLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationSmb" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationSmbResult> describeLocationSmbAsync(DescribeLocationSmbRequest describeLocationSmbRequest);

    /**
     * <p>
     * Returns metadata, such as the path and user information about an SMB location.
     * </p>
     * 
     * @param describeLocationSmbRequest
     *        DescribeLocationSmbRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationSmb" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationSmbResult> describeLocationSmbAsync(DescribeLocationSmbRequest describeLocationSmbRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationSmbRequest, DescribeLocationSmbResult> asyncHandler);

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
     * Returns a list of agents owned by an Amazon Web Services account in the Amazon Web Services Region specified in
     * the request. The returned list is ordered by agent Amazon Resource Name (ARN).
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
     * Returns a list of agents owned by an Amazon Web Services account in the Amazon Web Services Region specified in
     * the request. The returned list is ordered by agent Amazon Resource Name (ARN).
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
     * Returns a list of source and destination locations.
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
     * Returns a list of source and destination locations.
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
     * Returns all the tags associated with an Amazon Web Services resource.
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
     * Returns all the tags associated with an Amazon Web Services resource.
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
     * Returns a list of the DataSync tasks you created.
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
     * Returns a list of the DataSync tasks you created.
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
     * Starts an DataSync task. For each task, you can only run one task execution at a time.
     * </p>
     * <p>
     * There are several phases to a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
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
     * Starts an DataSync task. For each task, you can only run one task execution at a time.
     * </p>
     * <p>
     * There are several phases to a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
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
     * Applies a <i>tag</i> to an Amazon Web Services resource. Tags are key-value pairs that can help you manage,
     * filter, and search for your resources.
     * </p>
     * <p>
     * These include DataSync resources, such as locations, tasks, and task executions.
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
     * Applies a <i>tag</i> to an Amazon Web Services resource. Tags are key-value pairs that can help you manage,
     * filter, and search for your resources.
     * </p>
     * <p>
     * These include DataSync resources, such as locations, tasks, and task executions.
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
     * Removes tags from an Amazon Web Services resource.
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
     * Removes tags from an Amazon Web Services resource.
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
     * Updates some parameters of a previously created location for a Hadoop Distributed File System cluster.
     * </p>
     * 
     * @param updateLocationHdfsRequest
     * @return A Java Future containing the result of the UpdateLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationHdfsResult> updateLocationHdfsAsync(UpdateLocationHdfsRequest updateLocationHdfsRequest);

    /**
     * <p>
     * Updates some parameters of a previously created location for a Hadoop Distributed File System cluster.
     * </p>
     * 
     * @param updateLocationHdfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationHdfsResult> updateLocationHdfsAsync(UpdateLocationHdfsRequest updateLocationHdfsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLocationHdfsRequest, UpdateLocationHdfsResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Network File System (NFS) access. For
     * information about creating an NFS location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Creating a location for
     * NFS</a>.
     * </p>
     * 
     * @param updateLocationNfsRequest
     * @return A Java Future containing the result of the UpdateLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationNfsResult> updateLocationNfsAsync(UpdateLocationNfsRequest updateLocationNfsRequest);

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Network File System (NFS) access. For
     * information about creating an NFS location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Creating a location for
     * NFS</a>.
     * </p>
     * 
     * @param updateLocationNfsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationNfsResult> updateLocationNfsAsync(UpdateLocationNfsRequest updateLocationNfsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLocationNfsRequest, UpdateLocationNfsResult> asyncHandler);

    /**
     * <p>
     * Updates some parameters of an existing object storage location that DataSync accesses for a transfer. For
     * information about creating a self-managed object storage location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a location for
     * object storage</a>.
     * </p>
     * 
     * @param updateLocationObjectStorageRequest
     * @return A Java Future containing the result of the UpdateLocationObjectStorage operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationObjectStorageResult> updateLocationObjectStorageAsync(
            UpdateLocationObjectStorageRequest updateLocationObjectStorageRequest);

    /**
     * <p>
     * Updates some parameters of an existing object storage location that DataSync accesses for a transfer. For
     * information about creating a self-managed object storage location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a location for
     * object storage</a>.
     * </p>
     * 
     * @param updateLocationObjectStorageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLocationObjectStorage operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationObjectStorageResult> updateLocationObjectStorageAsync(
            UpdateLocationObjectStorageRequest updateLocationObjectStorageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLocationObjectStorageRequest, UpdateLocationObjectStorageResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Server Message Block (SMB) file system
     * access. For information about creating an SMB location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html">Creating a location for
     * SMB</a>.
     * </p>
     * 
     * @param updateLocationSmbRequest
     * @return A Java Future containing the result of the UpdateLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationSmbResult> updateLocationSmbAsync(UpdateLocationSmbRequest updateLocationSmbRequest);

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Server Message Block (SMB) file system
     * access. For information about creating an SMB location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html">Creating a location for
     * SMB</a>.
     * </p>
     * 
     * @param updateLocationSmbRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationSmbResult> updateLocationSmbAsync(UpdateLocationSmbRequest updateLocationSmbRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLocationSmbRequest, UpdateLocationSmbResult> asyncHandler);

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

    /**
     * <p>
     * Updates execution of a task.
     * </p>
     * <p>
     * You can modify bandwidth throttling for a task execution that is running or queued. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#adjust-bandwidth-throttling"
     * >Adjusting Bandwidth Throttling for a Task Execution</a>.
     * </p>
     * <note>
     * <p>
     * The only <code>Option</code> that can be modified by <code>UpdateTaskExecution</code> is
     * <code> <a href="https://docs.aws.amazon.com/datasync/latest/userguide/API_Options.html#DataSync-Type-Options-BytesPerSecond">BytesPerSecond</a> </code>
     * .
     * </p>
     * </note>
     * 
     * @param updateTaskExecutionRequest
     * @return A Java Future containing the result of the UpdateTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskExecutionResult> updateTaskExecutionAsync(UpdateTaskExecutionRequest updateTaskExecutionRequest);

    /**
     * <p>
     * Updates execution of a task.
     * </p>
     * <p>
     * You can modify bandwidth throttling for a task execution that is running or queued. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#adjust-bandwidth-throttling"
     * >Adjusting Bandwidth Throttling for a Task Execution</a>.
     * </p>
     * <note>
     * <p>
     * The only <code>Option</code> that can be modified by <code>UpdateTaskExecution</code> is
     * <code> <a href="https://docs.aws.amazon.com/datasync/latest/userguide/API_Options.html#DataSync-Type-Options-BytesPerSecond">BytesPerSecond</a> </code>
     * .
     * </p>
     * </note>
     * 
     * @param updateTaskExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskExecutionResult> updateTaskExecutionAsync(UpdateTaskExecutionRequest updateTaskExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTaskExecutionRequest, UpdateTaskExecutionResult> asyncHandler);

}
