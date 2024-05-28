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
public interface AWSDataSyncAsync extends AWSDataSync {

    /**
     * <p>
     * Creates an Amazon Web Services resource for an on-premises storage system that you want DataSync Discovery to
     * collect information about.
     * </p>
     * 
     * @param addStorageSystemRequest
     * @return A Java Future containing the result of the AddStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsync.AddStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AddStorageSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddStorageSystemResult> addStorageSystemAsync(AddStorageSystemRequest addStorageSystemRequest);

    /**
     * <p>
     * Creates an Amazon Web Services resource for an on-premises storage system that you want DataSync Discovery to
     * collect information about.
     * </p>
     * 
     * @param addStorageSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.AddStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AddStorageSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddStorageSystemResult> addStorageSystemAsync(AddStorageSystemRequest addStorageSystemRequest,
            com.amazonaws.handlers.AsyncHandler<AddStorageSystemRequest, AddStorageSystemResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSDataSyncAsync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest);

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
     * @return A Java Future containing the result of the CreateLocationAzureBlob operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationAzureBlobResult> createLocationAzureBlobAsync(CreateLocationAzureBlobRequest createLocationAzureBlobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocationAzureBlob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.CreateLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationAzureBlobResult> createLocationAzureBlobAsync(CreateLocationAzureBlobRequest createLocationAzureBlobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationAzureBlobRequest, CreateLocationAzureBlobResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLocationEfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(CreateLocationEfsRequest createLocationEfsRequest);

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
     * @return A Java Future containing the result of the CreateLocationFsxLustre operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxLustreResult> createLocationFsxLustreAsync(CreateLocationFsxLustreRequest createLocationFsxLustreRequest);

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
     * @return A Java Future containing the result of the CreateLocationFsxOntap operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxOntapResult> createLocationFsxOntapAsync(CreateLocationFsxOntapRequest createLocationFsxOntapRequest);

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
     * @return A Java Future containing the result of the CreateLocationFsxOpenZfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxOpenZfsResult> createLocationFsxOpenZfsAsync(CreateLocationFsxOpenZfsRequest createLocationFsxOpenZfsRequest);

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
     * @return A Java Future containing the result of the CreateLocationFsxWindows operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationFsxWindowsResult> createLocationFsxWindowsAsync(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest);

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
     * @return A Java Future containing the result of the CreateLocationHdfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationHdfsResult> createLocationHdfsAsync(CreateLocationHdfsRequest createLocationHdfsRequest);

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
     * @return A Java Future containing the result of the CreateLocationNfs operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(CreateLocationNfsRequest createLocationNfsRequest);

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
     * @return A Java Future containing the result of the CreateLocationObjectStorage operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationObjectStorageResult> createLocationObjectStorageAsync(
            CreateLocationObjectStorageRequest createLocationObjectStorageRequest);

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
     * @return A Java Future containing the result of the CreateLocationS3 operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(CreateLocationS3Request createLocationS3Request);

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
     * @return A Java Future containing the result of the CreateLocationSmb operation returned by the service.
     * @sample AWSDataSyncAsync.CreateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationSmbResult> createLocationSmbAsync(CreateLocationSmbRequest createLocationSmbRequest);

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
     * @return A Java Future containing the result of the CreateTask operation returned by the service.
     * @sample AWSDataSyncAsync.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest createTaskRequest);

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
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSDataSyncAsync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest);

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
     * Deletes a transfer location resource from DataSync.
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
     * Deletes a transfer location resource from DataSync.
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
     * Deletes a transfer task resource from DataSync.
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
     * Deletes a transfer task resource from DataSync.
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
     * Returns information about an DataSync agent, such as its name, service endpoint type, and status.
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
     * Returns information about an DataSync agent, such as its name, service endpoint type, and status.
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
     * Returns information about a DataSync discovery job.
     * </p>
     * 
     * @param describeDiscoveryJobRequest
     * @return A Java Future containing the result of the DescribeDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeDiscoveryJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDiscoveryJobResult> describeDiscoveryJobAsync(DescribeDiscoveryJobRequest describeDiscoveryJobRequest);

    /**
     * <p>
     * Returns information about a DataSync discovery job.
     * </p>
     * 
     * @param describeDiscoveryJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeDiscoveryJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDiscoveryJobResult> describeDiscoveryJobAsync(DescribeDiscoveryJobRequest describeDiscoveryJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDiscoveryJobRequest, DescribeDiscoveryJobResult> asyncHandler);

    /**
     * <p>
     * Provides details about how an DataSync transfer location for Microsoft Azure Blob Storage is configured.
     * </p>
     * 
     * @param describeLocationAzureBlobRequest
     * @return A Java Future containing the result of the DescribeLocationAzureBlob operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationAzureBlobResult> describeLocationAzureBlobAsync(
            DescribeLocationAzureBlobRequest describeLocationAzureBlobRequest);

    /**
     * <p>
     * Provides details about how an DataSync transfer location for Microsoft Azure Blob Storage is configured.
     * </p>
     * 
     * @param describeLocationAzureBlobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLocationAzureBlob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationAzureBlobResult> describeLocationAzureBlobAsync(
            DescribeLocationAzureBlobRequest describeLocationAzureBlobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationAzureBlobRequest, DescribeLocationAzureBlobResult> asyncHandler);

    /**
     * <p>
     * Provides details about how an DataSync transfer location for an Amazon EFS file system is configured.
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
     * Provides details about how an DataSync transfer location for an Amazon EFS file system is configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for Lustre file system is configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for Lustre file system is configured.
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
     * @return A Java Future containing the result of the DescribeLocationFsxOntap operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxOntapResult> describeLocationFsxOntapAsync(DescribeLocationFsxOntapRequest describeLocationFsxOntapRequest);

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
     * @return A Java Future containing the result of the DescribeLocationFsxOpenZfs operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLocationFsxOpenZfsResult> describeLocationFsxOpenZfsAsync(
            DescribeLocationFsxOpenZfsRequest describeLocationFsxOpenZfsRequest);

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
     * Provides details about how an DataSync transfer location for an Amazon FSx for Windows File Server file system is
     * configured.
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
     * Provides details about how an DataSync transfer location for an Amazon FSx for Windows File Server file system is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Hadoop Distributed File System (HDFS) is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Hadoop Distributed File System (HDFS) is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Network File System (NFS) file server is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Network File System (NFS) file server is
     * configured.
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
     * Provides details about how an DataSync transfer location for an object storage system is configured.
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
     * Provides details about how an DataSync transfer location for an object storage system is configured.
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
     * Provides details about how an DataSync transfer location for an S3 bucket is configured.
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
     * Provides details about how an DataSync transfer location for an S3 bucket is configured.
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
     * Provides details about how an DataSync transfer location for a Server Message Block (SMB) file server is
     * configured.
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
     * Provides details about how an DataSync transfer location for a Server Message Block (SMB) file server is
     * configured.
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
     * Returns information about an on-premises storage system that you're using with DataSync Discovery.
     * </p>
     * 
     * @param describeStorageSystemRequest
     * @return A Java Future containing the result of the DescribeStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsync.DescribeStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageSystemResult> describeStorageSystemAsync(DescribeStorageSystemRequest describeStorageSystemRequest);

    /**
     * <p>
     * Returns information about an on-premises storage system that you're using with DataSync Discovery.
     * </p>
     * 
     * @param describeStorageSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.DescribeStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageSystemResult> describeStorageSystemAsync(DescribeStorageSystemRequest describeStorageSystemRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageSystemRequest, DescribeStorageSystemResult> asyncHandler);

    /**
     * <p>
     * Returns information, including performance data and capacity usage, which DataSync Discovery collects about a
     * specific resource in your-premises storage system.
     * </p>
     * 
     * @param describeStorageSystemResourceMetricsRequest
     * @return A Java Future containing the result of the DescribeStorageSystemResourceMetrics operation returned by the
     *         service.
     * @sample AWSDataSyncAsync.DescribeStorageSystemResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResourceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageSystemResourceMetricsResult> describeStorageSystemResourceMetricsAsync(
            DescribeStorageSystemResourceMetricsRequest describeStorageSystemResourceMetricsRequest);

    /**
     * <p>
     * Returns information, including performance data and capacity usage, which DataSync Discovery collects about a
     * specific resource in your-premises storage system.
     * </p>
     * 
     * @param describeStorageSystemResourceMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStorageSystemResourceMetrics operation returned by the
     *         service.
     * @sample AWSDataSyncAsyncHandler.DescribeStorageSystemResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResourceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageSystemResourceMetricsResult> describeStorageSystemResourceMetricsAsync(
            DescribeStorageSystemResourceMetricsRequest describeStorageSystemResourceMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageSystemResourceMetricsRequest, DescribeStorageSystemResourceMetricsResult> asyncHandler);

    /**
     * <p>
     * Returns information that DataSync Discovery collects about resources in your on-premises storage system.
     * </p>
     * 
     * @param describeStorageSystemResourcesRequest
     * @return A Java Future containing the result of the DescribeStorageSystemResources operation returned by the
     *         service.
     * @sample AWSDataSyncAsync.DescribeStorageSystemResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageSystemResourcesResult> describeStorageSystemResourcesAsync(
            DescribeStorageSystemResourcesRequest describeStorageSystemResourcesRequest);

    /**
     * <p>
     * Returns information that DataSync Discovery collects about resources in your on-premises storage system.
     * </p>
     * 
     * @param describeStorageSystemResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStorageSystemResources operation returned by the
     *         service.
     * @sample AWSDataSyncAsyncHandler.DescribeStorageSystemResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageSystemResourcesResult> describeStorageSystemResourcesAsync(
            DescribeStorageSystemResourcesRequest describeStorageSystemResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageSystemResourcesRequest, DescribeStorageSystemResourcesResult> asyncHandler);

    /**
     * <p>
     * Provides information about a <i>task</i>, which defines where and how DataSync transfers your data.
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
     * Provides information about a <i>task</i>, which defines where and how DataSync transfers your data.
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
     * Provides information about an execution of your DataSync task. You can use this operation to help monitor the
     * progress of an ongoing transfer or check the results of the transfer.
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
     * Provides information about an execution of your DataSync task. You can use this operation to help monitor the
     * progress of an ongoing transfer or check the results of the transfer.
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
     * @return A Java Future containing the result of the GenerateRecommendations operation returned by the service.
     * @sample AWSDataSyncAsync.GenerateRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/GenerateRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateRecommendationsResult> generateRecommendationsAsync(GenerateRecommendationsRequest generateRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateRecommendations operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.GenerateRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/GenerateRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateRecommendationsResult> generateRecommendationsAsync(GenerateRecommendationsRequest generateRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateRecommendationsRequest, GenerateRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSDataSyncAsync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest);

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
     * Provides a list of the existing discovery jobs in the Amazon Web Services Region and Amazon Web Services account
     * where you're using DataSync Discovery.
     * </p>
     * 
     * @param listDiscoveryJobsRequest
     * @return A Java Future containing the result of the ListDiscoveryJobs operation returned by the service.
     * @sample AWSDataSyncAsync.ListDiscoveryJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListDiscoveryJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveryJobsResult> listDiscoveryJobsAsync(ListDiscoveryJobsRequest listDiscoveryJobsRequest);

    /**
     * <p>
     * Provides a list of the existing discovery jobs in the Amazon Web Services Region and Amazon Web Services account
     * where you're using DataSync Discovery.
     * </p>
     * 
     * @param listDiscoveryJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDiscoveryJobs operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListDiscoveryJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListDiscoveryJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveryJobsResult> listDiscoveryJobsAsync(ListDiscoveryJobsRequest listDiscoveryJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveryJobsRequest, ListDiscoveryJobsResult> asyncHandler);

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
     * Lists the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * 
     * @param listStorageSystemsRequest
     * @return A Java Future containing the result of the ListStorageSystems operation returned by the service.
     * @sample AWSDataSyncAsync.ListStorageSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListStorageSystems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageSystemsResult> listStorageSystemsAsync(ListStorageSystemsRequest listStorageSystemsRequest);

    /**
     * <p>
     * Lists the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * 
     * @param listStorageSystemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStorageSystems operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.ListStorageSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListStorageSystems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageSystemsResult> listStorageSystemsAsync(ListStorageSystemsRequest listStorageSystemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStorageSystemsRequest, ListStorageSystemsResult> asyncHandler);

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
     * Returns a list of executions for an DataSync transfer task.
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
     * Returns a list of executions for an DataSync transfer task.
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
     * Permanently removes a storage system resource from DataSync Discovery, including the associated discovery jobs,
     * collected data, and recommendations.
     * </p>
     * 
     * @param removeStorageSystemRequest
     * @return A Java Future containing the result of the RemoveStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsync.RemoveStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/RemoveStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveStorageSystemResult> removeStorageSystemAsync(RemoveStorageSystemRequest removeStorageSystemRequest);

    /**
     * <p>
     * Permanently removes a storage system resource from DataSync Discovery, including the associated discovery jobs,
     * collected data, and recommendations.
     * </p>
     * 
     * @param removeStorageSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.RemoveStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/RemoveStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveStorageSystemResult> removeStorageSystemAsync(RemoveStorageSystemRequest removeStorageSystemRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveStorageSystemRequest, RemoveStorageSystemResult> asyncHandler);

    /**
     * <p>
     * Runs a DataSync discovery job on your on-premises storage system. If you haven't added the storage system to
     * DataSync Discovery yet, do this first by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_AddStorageSystem.html">AddStorageSystem</a>
     * operation.
     * </p>
     * 
     * @param startDiscoveryJobRequest
     * @return A Java Future containing the result of the StartDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsync.StartDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartDiscoveryJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDiscoveryJobResult> startDiscoveryJobAsync(StartDiscoveryJobRequest startDiscoveryJobRequest);

    /**
     * <p>
     * Runs a DataSync discovery job on your on-premises storage system. If you haven't added the storage system to
     * DataSync Discovery yet, do this first by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_AddStorageSystem.html">AddStorageSystem</a>
     * operation.
     * </p>
     * 
     * @param startDiscoveryJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.StartDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartDiscoveryJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDiscoveryJobResult> startDiscoveryJobAsync(StartDiscoveryJobRequest startDiscoveryJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDiscoveryJobRequest, StartDiscoveryJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsync.StartTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(StartTaskExecutionRequest startTaskExecutionRequest);

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
     * @return A Java Future containing the result of the StopDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsync.StopDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StopDiscoveryJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopDiscoveryJobResult> stopDiscoveryJobAsync(StopDiscoveryJobRequest stopDiscoveryJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.StopDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StopDiscoveryJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopDiscoveryJobResult> stopDiscoveryJobAsync(StopDiscoveryJobRequest stopDiscoveryJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopDiscoveryJobRequest, StopDiscoveryJobResult> asyncHandler);

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
     * Updates the name of an DataSync agent.
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
     * Updates the name of an DataSync agent.
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
     * Edits a DataSync discovery job configuration.
     * </p>
     * 
     * @param updateDiscoveryJobRequest
     * @return A Java Future containing the result of the UpdateDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateDiscoveryJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDiscoveryJobResult> updateDiscoveryJobAsync(UpdateDiscoveryJobRequest updateDiscoveryJobRequest);

    /**
     * <p>
     * Edits a DataSync discovery job configuration.
     * </p>
     * 
     * @param updateDiscoveryJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDiscoveryJob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateDiscoveryJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateDiscoveryJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDiscoveryJobResult> updateDiscoveryJobAsync(UpdateDiscoveryJobRequest updateDiscoveryJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDiscoveryJobRequest, UpdateDiscoveryJobResult> asyncHandler);

    /**
     * <p>
     * Modifies some configurations of the Microsoft Azure Blob Storage transfer location that you're using with
     * DataSync.
     * </p>
     * 
     * @param updateLocationAzureBlobRequest
     * @return A Java Future containing the result of the UpdateLocationAzureBlob operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationAzureBlobResult> updateLocationAzureBlobAsync(UpdateLocationAzureBlobRequest updateLocationAzureBlobRequest);

    /**
     * <p>
     * Modifies some configurations of the Microsoft Azure Blob Storage transfer location that you're using with
     * DataSync.
     * </p>
     * 
     * @param updateLocationAzureBlobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLocationAzureBlob operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateLocationAzureBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationAzureBlob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLocationAzureBlobResult> updateLocationAzureBlobAsync(UpdateLocationAzureBlobRequest updateLocationAzureBlobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLocationAzureBlobRequest, UpdateLocationAzureBlobResult> asyncHandler);

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
     * Modifies some configurations of the Network File System (NFS) transfer location that you're using with DataSync.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Configuring transfers to or
     * from an NFS file server</a>.
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
     * Modifies some configurations of the Network File System (NFS) transfer location that you're using with DataSync.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Configuring transfers to or
     * from an NFS file server</a>.
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
     * Updates some parameters of an existing DataSync location for an object storage system.
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
     * Updates some parameters of an existing DataSync location for an object storage system.
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
     * Updates some of the parameters of a Server Message Block (SMB) file server location that you can use for DataSync
     * transfers.
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
     * Updates some of the parameters of a Server Message Block (SMB) file server location that you can use for DataSync
     * transfers.
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
     * Modifies some configurations of an on-premises storage system resource that you're using with DataSync Discovery.
     * </p>
     * 
     * @param updateStorageSystemRequest
     * @return A Java Future containing the result of the UpdateStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageSystemResult> updateStorageSystemAsync(UpdateStorageSystemRequest updateStorageSystemRequest);

    /**
     * <p>
     * Modifies some configurations of an on-premises storage system resource that you're using with DataSync Discovery.
     * </p>
     * 
     * @param updateStorageSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStorageSystem operation returned by the service.
     * @sample AWSDataSyncAsyncHandler.UpdateStorageSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateStorageSystem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageSystemResult> updateStorageSystemAsync(UpdateStorageSystemRequest updateStorageSystemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStorageSystemRequest, UpdateStorageSystemResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of a <i>task</i>, which defines where and how DataSync transfers your data.
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
     * Updates the configuration of a <i>task</i>, which defines where and how DataSync transfers your data.
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
     * @return A Java Future containing the result of the UpdateTaskExecution operation returned by the service.
     * @sample AWSDataSyncAsync.UpdateTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskExecutionResult> updateTaskExecutionAsync(UpdateTaskExecutionRequest updateTaskExecutionRequest);

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
