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
     * @return Result of the CancelTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CancelTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CancelTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    CancelTaskExecutionResult cancelTaskExecution(CancelTaskExecutionRequest cancelTaskExecutionRequest);

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
     * @return Result of the CreateAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAgentResult createAgent(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon EFS file system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html">Creating a location
     * for Amazon EFS</a>.
     * </p>
     * 
     * @param createLocationEfsRequest
     *        CreateLocationEfsRequest
     * @return Result of the CreateLocationEfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationEfsResult createLocationEfs(CreateLocationEfsRequest createLocationEfsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Lustre file system.
     * </p>
     * 
     * @param createLocationFsxLustreRequest
     * @return Result of the CreateLocationFsxLustre operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationFsxLustreResult createLocationFsxLustre(CreateLocationFsxLustreRequest createLocationFsxLustreRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for NetApp ONTAP file system that DataSync can access for a transfer. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html">Creating a location for
     * FSx for ONTAP</a>.
     * </p>
     * 
     * @param createLocationFsxOntapRequest
     * @return Result of the CreateLocationFsxOntap operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationFsxOntapResult createLocationFsxOntap(CreateLocationFsxOntapRequest createLocationFsxOntapRequest);

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
     * @return Result of the CreateLocationFsxOpenZfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationFsxOpenZfsResult createLocationFsxOpenZfs(CreateLocationFsxOpenZfsRequest createLocationFsxOpenZfsRequest);

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param createLocationFsxWindowsRequest
     * @return Result of the CreateLocationFsxWindows operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationFsxWindowsResult createLocationFsxWindows(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest);

    /**
     * <p>
     * Creates an endpoint for a Hadoop Distributed File System (HDFS).
     * </p>
     * 
     * @param createLocationHdfsRequest
     * @return Result of the CreateLocationHdfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLocationHdfsResult createLocationHdfs(CreateLocationHdfsRequest createLocationHdfsRequest);

    /**
     * <p>
     * Defines a file system on a Network File System (NFS) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationNfsRequest
     *        CreateLocationNfsRequest
     * @return Result of the CreateLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationNfsResult createLocationNfs(CreateLocationNfsRequest createLocationNfsRequest);

    /**
     * <p>
     * Creates an endpoint for an object storage system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a
     * location for object storage</a>.
     * </p>
     * 
     * @param createLocationObjectStorageRequest
     *        CreateLocationObjectStorageRequest
     * @return Result of the CreateLocationObjectStorage operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationObjectStorageResult createLocationObjectStorage(CreateLocationObjectStorageRequest createLocationObjectStorageRequest);

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
     * @return Result of the CreateLocationS3 operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationS3Result createLocationS3(CreateLocationS3Request createLocationS3Request);

    /**
     * <p>
     * Defines a file system on a Server Message Block (SMB) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationSmbRequest
     *        CreateLocationSmbRequest
     * @return Result of the CreateLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationSmbResult createLocationSmb(CreateLocationSmbRequest createLocationSmbRequest);

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
     * @return Result of the CreateTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTaskResult createTask(CreateTaskRequest createTaskRequest);

    /**
     * <p>
     * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
     * request. The operation disassociates the agent from your Amazon Web Services account. However, it doesn't delete
     * the agent virtual machine (VM) from your on-premises environment.
     * </p>
     * 
     * @param deleteAgentRequest
     *        DeleteAgentRequest
     * @return Result of the DeleteAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAgentResult deleteAgent(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes the configuration of a location used by DataSync.
     * </p>
     * 
     * @param deleteLocationRequest
     *        DeleteLocation
     * @return Result of the DeleteLocation operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLocationResult deleteLocation(DeleteLocationRequest deleteLocationRequest);

    /**
     * <p>
     * Deletes an DataSync task.
     * </p>
     * 
     * @param deleteTaskRequest
     *        DeleteTask
     * @return Result of the DeleteTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
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
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeAgent" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAgentResult describeAgent(DescribeAgentRequest describeAgentRequest);

    /**
     * <p>
     * Returns metadata about your DataSync location for an Amazon EFS file system.
     * </p>
     * 
     * @param describeLocationEfsRequest
     *        DescribeLocationEfsRequest
     * @return Result of the DescribeLocationEfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationEfs" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationEfsResult describeLocationEfs(DescribeLocationEfsRequest describeLocationEfsRequest);

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for Lustre file system is configured.
     * </p>
     * 
     * @param describeLocationFsxLustreRequest
     * @return Result of the DescribeLocationFsxLustre operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationFsxLustreResult describeLocationFsxLustre(DescribeLocationFsxLustreRequest describeLocationFsxLustreRequest);

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
     * @return Result of the DescribeLocationFsxOntap operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationFsxOntapResult describeLocationFsxOntap(DescribeLocationFsxOntapRequest describeLocationFsxOntapRequest);

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
     * @return Result of the DescribeLocationFsxOpenZfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationFsxOpenZfsResult describeLocationFsxOpenZfs(DescribeLocationFsxOpenZfsRequest describeLocationFsxOpenZfsRequest);

    /**
     * <p>
     * Returns metadata about an Amazon FSx for Windows File Server location, such as information about its path.
     * </p>
     * 
     * @param describeLocationFsxWindowsRequest
     * @return Result of the DescribeLocationFsxWindows operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationFsxWindowsResult describeLocationFsxWindows(DescribeLocationFsxWindowsRequest describeLocationFsxWindowsRequest);

    /**
     * <p>
     * Returns metadata, such as the authentication information about the Hadoop Distributed File System (HDFS)
     * location.
     * </p>
     * 
     * @param describeLocationHdfsRequest
     * @return Result of the DescribeLocationHdfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationHdfsResult describeLocationHdfs(DescribeLocationHdfsRequest describeLocationHdfsRequest);

    /**
     * <p>
     * Returns metadata, such as the path information, about an NFS location.
     * </p>
     * 
     * @param describeLocationNfsRequest
     *        DescribeLocationNfsRequest
     * @return Result of the DescribeLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationNfs" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationNfsResult describeLocationNfs(DescribeLocationNfsRequest describeLocationNfsRequest);

    /**
     * <p>
     * Returns metadata about your DataSync location for an object storage system.
     * </p>
     * 
     * @param describeLocationObjectStorageRequest
     *        DescribeLocationObjectStorageRequest
     * @return Result of the DescribeLocationObjectStorage operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationObjectStorageResult describeLocationObjectStorage(DescribeLocationObjectStorageRequest describeLocationObjectStorageRequest);

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
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLocationS3Result describeLocationS3(DescribeLocationS3Request describeLocationS3Request);

    /**
     * <p>
     * Returns metadata, such as the path and user information about an SMB location.
     * </p>
     * 
     * @param describeLocationSmbRequest
     *        DescribeLocationSmbRequest
     * @return Result of the DescribeLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
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
     *         This exception is thrown when an error occurs in the DataSync service.
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
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTaskExecutionResult describeTaskExecution(DescribeTaskExecutionRequest describeTaskExecutionRequest);

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
     * @return Result of the ListAgents operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    ListAgentsResult listAgents(ListAgentsRequest listAgentsRequest);

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
     * @return Result of the ListLocations operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    ListLocationsResult listLocations(ListLocationsRequest listLocationsRequest);

    /**
     * <p>
     * Returns all the tags associated with an Amazon Web Services resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
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
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListTaskExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    ListTaskExecutionsResult listTaskExecutions(ListTaskExecutionsRequest listTaskExecutionsRequest);

    /**
     * <p>
     * Returns a list of the DataSync tasks you created.
     * </p>
     * 
     * @param listTasksRequest
     *        ListTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    ListTasksResult listTasks(ListTasksRequest listTasksRequest);

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
     * @return Result of the StartTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.StartTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StartTaskExecutionResult startTaskExecution(StartTaskExecutionRequest startTaskExecutionRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
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
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAgentResult updateAgent(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates some parameters of a previously created location for a Hadoop Distributed File System cluster.
     * </p>
     * 
     * @param updateLocationHdfsRequest
     * @return Result of the UpdateLocationHdfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateLocationHdfsResult updateLocationHdfs(UpdateLocationHdfsRequest updateLocationHdfsRequest);

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Network File System (NFS) access. For
     * information about creating an NFS location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Creating a location for
     * NFS</a>.
     * </p>
     * 
     * @param updateLocationNfsRequest
     * @return Result of the UpdateLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLocationNfsResult updateLocationNfs(UpdateLocationNfsRequest updateLocationNfsRequest);

    /**
     * <p>
     * Updates some parameters of an existing object storage location that DataSync accesses for a transfer. For
     * information about creating a self-managed object storage location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a location for
     * object storage</a>.
     * </p>
     * 
     * @param updateLocationObjectStorageRequest
     * @return Result of the UpdateLocationObjectStorage operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLocationObjectStorageResult updateLocationObjectStorage(UpdateLocationObjectStorageRequest updateLocationObjectStorageRequest);

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Server Message Block (SMB) file system
     * access. For information about creating an SMB location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html">Creating a location for
     * SMB</a>.
     * </p>
     * 
     * @param updateLocationSmbRequest
     * @return Result of the UpdateLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLocationSmbResult updateLocationSmb(UpdateLocationSmbRequest updateLocationSmbRequest);

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
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTaskResult updateTask(UpdateTaskRequest updateTaskRequest);

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
     * @return Result of the UpdateTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTaskExecutionResult updateTaskExecution(UpdateTaskExecutionRequest updateTaskExecutionRequest);

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
