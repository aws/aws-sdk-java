/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DataSync is an online data movement and discovery service that simplifies data migration and helps you quickly,
 * easily, and securely transfer your file or object data to, from, and between Amazon Web Services storage services.
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
     * Creates an Amazon Web Services resource for an on-premises storage system that you want DataSync Discovery to
     * collect information about.
     * </p>
     * 
     * @param addStorageSystemRequest
     * @return Result of the AddStorageSystem operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.AddStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AddStorageSystem" target="_top">AWS API
     *      Documentation</a>
     */
    AddStorageSystemResult addStorageSystem(AddStorageSystemRequest addStorageSystemRequest);

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
     * Activates an DataSync agent that you've deployed in your storage environment. The activation process associates
     * the agent with your Amazon Web Services account.
     * </p>
     * <p>
     * If you haven't deployed an agent yet, see the following topics to learn more:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/agent-requirements.html">Agent requirements</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-agent.html">Create an agent</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you're transferring between Amazon Web Services storage services, you don't need a DataSync agent.
     * </p>
     * </note>
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
     * Creates a transfer <i>location</i> for a Microsoft Azure Blob Storage container. DataSync can use this location
     * as a transfer source or destination.
     * </p>
     * <p>
     * Before you begin, make sure you know <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access">how
     * DataSync accesses Azure Blob Storage</a> and works with <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >access tiers</a> and <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#blob-types">blob
     * types</a>. You also need a <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-creating-agent"
     * >DataSync agent</a> that can connect to your container.
     * </p>
     * 
     * @param createLocationAzureBlobRequest
     * @return Result of the CreateLocationAzureBlob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocationAzureBlobResult createLocationAzureBlob(CreateLocationAzureBlobRequest createLocationAzureBlobRequest);

    /**
     * <p>
     * Creates a transfer <i>location</i> for an Amazon EFS file system. DataSync can use this location as a source or
     * destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-access"
     * >accesses Amazon EFS file systems</a>.
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
     * Creates a transfer <i>location</i> for an Amazon FSx for Lustre file system. DataSync can use this location as a
     * source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-lustre-location.html#create-lustre-location-access"
     * >accesses FSx for Lustre file systems</a>.
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
     * Creates a transfer <i>location</i> for an Amazon FSx for NetApp ONTAP file system. DataSync can use this location
     * as a source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access"
     * >accesses FSx for ONTAP file systems</a>.
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
     * Creates a transfer <i>location</i> for an Amazon FSx for OpenZFS file system. DataSync can use this location as a
     * source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-openzfs-location.html#create-openzfs-access"
     * >accesses FSx for OpenZFS file systems</a>.
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
     * Creates a transfer <i>location</i> for an Amazon FSx for Windows File Server file system. DataSync can use this
     * location as a source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-location-access"
     * >accesses FSx for Windows File Server file systems</a>.
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
     * Creates a transfer <i>location</i> for a Hadoop Distributed File System (HDFS). DataSync can use this location as
     * a source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-hdfs-location.html#accessing-hdfs">accesses
     * HDFS clusters</a>.
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
     * Creates a transfer <i>location</i> for a Network File System (NFS) file server. DataSync can use this location as
     * a source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">accesses NFS
     * file servers</a>.
     * </p>
     * <note>
     * <p>
     * If you're copying data to or from an Snowcone device, you can also use <code>CreateLocationNfs</code> to create
     * your transfer location. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/nfs-on-snowcone.html">Configuring transfers with
     * Snowcone</a>.
     * </p>
     * </note>
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
     * Creates a transfer <i>location</i> for an object storage system. DataSync can use this location as a source or
     * destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand the <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html#create-object-location-prerequisites"
     * >prerequisites</a> for DataSync to work with object storage systems.
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
     * Creates a transfer <i>location</i> for an Amazon S3 bucket. DataSync can use this location as a source or
     * destination for transferring data.
     * </p>
     * <important>
     * <p>
     * Before you begin, make sure that you read the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes">
     * Storage class considerations with Amazon S3 locations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#create-s3-location-s3-requests"
     * >Evaluating S3 request costs when using DataSync</a>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html">Configuring transfers with
     * Amazon S3</a>.
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
     * Creates a transfer <i>location</i> for a Server Message Block (SMB) file server. DataSync can use this location
     * as a source or destination for transferring data.
     * </p>
     * <p>
     * Before you begin, make sure that you understand how DataSync <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb">accesses
     * SMB file servers</a>.
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
     * Configures a <i>task</i>, which defines where and how DataSync transfers your data.
     * </p>
     * <p>
     * A task includes a source location, destination location, and transfer options (such as bandwidth limits,
     * scheduling, and more).
     * </p>
     * <important>
     * <p>
     * If you're planning to transfer data to or from an Amazon S3 location, review <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#create-s3-location-s3-requests"
     * >how DataSync can affect your S3 request charges</a> and the <a
     * href="http://aws.amazon.com/datasync/pricing/">DataSync pricing page</a> before you begin.
     * </p>
     * </important>
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
     * Removes an DataSync agent resource from your Amazon Web Services account.
     * </p>
     * <p>
     * Keep in mind that this operation (which can't be undone) doesn't remove the agent's virtual machine (VM) or
     * Amazon EC2 instance from your storage environment. For next steps, you can delete the VM or instance from your
     * storage environment or reuse it to <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">activate a new agent</a>.
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
     * Deletes a transfer location resource from DataSync.
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
     * Deletes a transfer task resource from DataSync.
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
     * Returns information about an DataSync agent, such as its name, service endpoint type, and status.
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
     * Returns information about a DataSync discovery job.
     * </p>
     * 
     * @param describeDiscoveryJobRequest
     * @return Result of the DescribeDiscoveryJob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeDiscoveryJob" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDiscoveryJobResult describeDiscoveryJob(DescribeDiscoveryJobRequest describeDiscoveryJobRequest);

    /**
     * <p>
     * Provides details about how an DataSync transfer location for Microsoft Azure Blob Storage is configured.
     * </p>
     * 
     * @param describeLocationAzureBlobRequest
     * @return Result of the DescribeLocationAzureBlob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationAzureBlobResult describeLocationAzureBlob(DescribeLocationAzureBlobRequest describeLocationAzureBlobRequest);

    /**
     * <p>
     * Provides details about how an DataSync transfer location for an Amazon EFS file system is configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for Lustre file system is configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for NetApp ONTAP file system is
     * configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for OpenZFS file system is configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for Windows File Server file system is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Hadoop Distributed File System (HDFS) is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Network File System (NFS) file server is
     * configured.
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
     * Provides details about how an DataSync transfer location for an object storage system is configured.
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
     * Provides details about how an DataSync transfer location for an S3 bucket is configured.
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
     * Provides details about how an DataSync transfer location for a Server Message Block (SMB) file server is
     * configured.
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
     * Returns information about an on-premises storage system that you're using with DataSync Discovery.
     * </p>
     * 
     * @param describeStorageSystemRequest
     * @return Result of the DescribeStorageSystem operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeStorageSystemResult describeStorageSystem(DescribeStorageSystemRequest describeStorageSystemRequest);

    /**
     * <p>
     * Returns information, including performance data and capacity usage, which DataSync Discovery collects about a
     * specific resource in your-premises storage system.
     * </p>
     * 
     * @param describeStorageSystemResourceMetricsRequest
     * @return Result of the DescribeStorageSystemResourceMetrics operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeStorageSystemResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResourceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStorageSystemResourceMetricsResult describeStorageSystemResourceMetrics(
            DescribeStorageSystemResourceMetricsRequest describeStorageSystemResourceMetricsRequest);

    /**
     * <p>
     * Returns information that DataSync Discovery collects about resources in your on-premises storage system.
     * </p>
     * 
     * @param describeStorageSystemResourcesRequest
     * @return Result of the DescribeStorageSystemResources operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeStorageSystemResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResources"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStorageSystemResourcesResult describeStorageSystemResources(DescribeStorageSystemResourcesRequest describeStorageSystemResourcesRequest);

    /**
     * <p>
     * Provides information about a <i>task</i>, which defines where and how DataSync transfers your data.
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
     * Provides information about an execution of your DataSync task. You can use this operation to help monitor the
     * progress of an ongoing transfer or check the results of the transfer.
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
     * Creates recommendations about where to migrate your data to in Amazon Web Services. Recommendations are generated
     * based on information that DataSync Discovery collects about your on-premises storage system's resources. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >Recommendations provided by DataSync Discovery</a>.
     * </p>
     * <p>
     * Once generated, you can view your recommendations by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_DescribeStorageSystemResources.html"
     * >DescribeStorageSystemResources</a> operation.
     * </p>
     * 
     * @param generateRecommendationsRequest
     * @return Result of the GenerateRecommendations operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.GenerateRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/GenerateRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GenerateRecommendationsResult generateRecommendations(GenerateRecommendationsRequest generateRecommendationsRequest);

    /**
     * <p>
     * Returns a list of DataSync agents that belong to an Amazon Web Services account in the Amazon Web Services Region
     * specified in the request.
     * </p>
     * <p>
     * With pagination, you can reduce the number of agents returned in a response. If you get a truncated list of
     * agents in a response, the response contains a marker that you can specify in your next request to fetch the next
     * page of agents.
     * </p>
     * <p>
     * <code>ListAgents</code> is eventually consistent. This means the result of running the operation might not
     * reflect that you just created or deleted an agent. For example, if you create an agent with <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateAgent.html">CreateAgent</a> and then
     * immediately run <code>ListAgents</code>, that agent might not show up in the list right away. In situations like
     * this, you can always confirm whether an agent has been created (or deleted) by using <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_DescribeAgent.html">DescribeAgent</a>.
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
     * Provides a list of the existing discovery jobs in the Amazon Web Services Region and Amazon Web Services account
     * where you're using DataSync Discovery.
     * </p>
     * 
     * @param listDiscoveryJobsRequest
     * @return Result of the ListDiscoveryJobs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListDiscoveryJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListDiscoveryJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListDiscoveryJobsResult listDiscoveryJobs(ListDiscoveryJobsRequest listDiscoveryJobsRequest);

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
     * Lists the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * 
     * @param listStorageSystemsRequest
     * @return Result of the ListStorageSystems operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListStorageSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListStorageSystems" target="_top">AWS
     *      API Documentation</a>
     */
    ListStorageSystemsResult listStorageSystems(ListStorageSystemsRequest listStorageSystemsRequest);

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
     * Returns a list of executions for an DataSync transfer task.
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
     * Permanently removes a storage system resource from DataSync Discovery, including the associated discovery jobs,
     * collected data, and recommendations.
     * </p>
     * 
     * @param removeStorageSystemRequest
     * @return Result of the RemoveStorageSystem operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.RemoveStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/RemoveStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveStorageSystemResult removeStorageSystem(RemoveStorageSystemRequest removeStorageSystemRequest);

    /**
     * <p>
     * Runs a DataSync discovery job on your on-premises storage system. If you haven't added the storage system to
     * DataSync Discovery yet, do this first by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_AddStorageSystem.html">AddStorageSystem</a>
     * operation.
     * </p>
     * 
     * @param startDiscoveryJobRequest
     * @return Result of the StartDiscoveryJob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.StartDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartDiscoveryJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartDiscoveryJobResult startDiscoveryJob(StartDiscoveryJobRequest startDiscoveryJobRequest);

    /**
     * <p>
     * Starts an DataSync transfer task. For each task, you can only run one task execution at a time.
     * </p>
     * <p>
     * There are several phases to a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     * <important>
     * <p>
     * If you're planning to transfer data to or from an Amazon S3 location, review <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#create-s3-location-s3-requests"
     * >how DataSync can affect your S3 request charges</a> and the <a
     * href="http://aws.amazon.com/datasync/pricing/">DataSync pricing page</a> before you begin.
     * </p>
     * </important>
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
     * Stops a running DataSync discovery job.
     * </p>
     * <p>
     * You can stop a discovery job anytime. A job that's stopped before it's scheduled to end likely will provide you
     * some information about your on-premises storage system resources. To get recommendations for a stopped job, you
     * must use the <a href="https://docs.aws.amazon.com/datasync/latest/userguide/API_GenerateRecommendations.html">
     * GenerateRecommendations</a> operation.
     * </p>
     * 
     * @param stopDiscoveryJobRequest
     * @return Result of the StopDiscoveryJob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.StopDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StopDiscoveryJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopDiscoveryJobResult stopDiscoveryJob(StopDiscoveryJobRequest stopDiscoveryJobRequest);

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
     * Updates the name of an DataSync agent.
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
     * Edits a DataSync discovery job configuration.
     * </p>
     * 
     * @param updateDiscoveryJobRequest
     * @return Result of the UpdateDiscoveryJob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateDiscoveryJob" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDiscoveryJobResult updateDiscoveryJob(UpdateDiscoveryJobRequest updateDiscoveryJobRequest);

    /**
     * <p>
     * Modifies some configurations of the Microsoft Azure Blob Storage transfer location that you're using with
     * DataSync.
     * </p>
     * 
     * @param updateLocationAzureBlobRequest
     * @return Result of the UpdateLocationAzureBlob operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLocationAzureBlobResult updateLocationAzureBlob(UpdateLocationAzureBlobRequest updateLocationAzureBlobRequest);

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
     * Modifies some configurations of the Network File System (NFS) transfer location that you're using with DataSync.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Configuring transfers to or
     * from an NFS file server</a>.
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
     * Updates some parameters of an existing DataSync location for an object storage system.
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
     * Updates some of the parameters of a Server Message Block (SMB) file server location that you can use for DataSync
     * transfers.
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
     * Modifies some configurations of an on-premises storage system resource that you're using with DataSync Discovery.
     * </p>
     * 
     * @param updateStorageSystemRequest
     * @return Result of the UpdateStorageSystem operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateStorageSystemResult updateStorageSystem(UpdateStorageSystemRequest updateStorageSystemRequest);

    /**
     * <p>
     * Updates the configuration of a <i>task</i>, which defines where and how DataSync transfers your data.
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
     * Updates the configuration of a running DataSync task execution.
     * </p>
     * <note>
     * <p>
     * Currently, the only <code>Option</code> that you can modify with <code>UpdateTaskExecution</code> is
     * <code> <a href="https://docs.aws.amazon.com/datasync/latest/userguide/API_Options.html#DataSync-Type-Options-BytesPerSecond">BytesPerSecond</a> </code>
     * , which throttles bandwidth for a running or queued task execution.
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
