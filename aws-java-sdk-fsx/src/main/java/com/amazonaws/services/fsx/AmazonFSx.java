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
package com.amazonaws.services.fsx;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.fsx.model.*;

/**
 * Interface for accessing Amazon FSx.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fsx.AbstractAmazonFSx} instead.
 * </p>
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonFSx {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "fsx";

    /**
     * <p>
     * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows
     * File Server file system. A file system can have a maximum of 50 DNS aliases associated with it at any one time.
     * If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that
     * alias in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS Aliases</a>
     * and <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html">
     * Walkthrough 5: Using DNS aliases to access your file system</a>, including additional steps you must take to be
     * able to access your file system using a DNS alias.
     * </p>
     * <p>
     * The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use
     * the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param associateFileSystemAliasesRequest
     *        The request object specifying one or more DNS alias names to associate with an Amazon FSx for Windows File
     *        Server file system.
     * @return Result of the AssociateFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateFileSystemAliasesResult associateFileSystemAliases(AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest);

    /**
     * <p>
     * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the <code>PENDING</code>
     * or <code>EXECUTING</code> state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest
     *        Cancels a data repository task.
     * @return Result of the CancelDataRepositoryTask operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws DataRepositoryTaskNotFoundException
     *         The data repository task or tasks you specified could not be found.
     * @throws DataRepositoryTaskEndedException
     *         The data repository task could not be canceled because the task has already ended.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    CancelDataRepositoryTaskResult cancelDataRepositoryTask(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest);

    /**
     * <p>
     * Copies an existing backup within the same Amazon Web Services account to another Amazon Web Services Region
     * (cross-Region copy) or within the same Amazon Web Services Region (in-Region copy). You can have up to five
     * backup copy requests in progress to a single destination Region per account.
     * </p>
     * <p>
     * You can use cross-Region backup copies for cross-Region disaster recovery. You can periodically take backups and
     * copy them to another Region so that in the event of a disaster in the primary Region, you can restore from backup
     * and recover availability quickly in the other Region. You can make cross-Region copies only within your Amazon
     * Web Services partition. A partition is a grouping of Regions. Amazon Web Services currently has three partitions:
     * <code>aws</code> (Standard Regions), <code>aws-cn</code> (China Regions), and <code>aws-us-gov</code> (Amazon Web
     * Services GovCloud [US] Regions).
     * </p>
     * <p>
     * You can also use backup copies to clone your file dataset to another Region or within the same Region.
     * </p>
     * <p>
     * You can use the <code>SourceRegion</code> parameter to specify the Amazon Web Services Region from which the
     * backup will be copied. For example, if you make the call from the <code>us-west-1</code> Region and want to copy
     * a backup from the <code>us-east-2</code> Region, you specify <code>us-east-2</code> in the
     * <code>SourceRegion</code> parameter to make a cross-Region copy. If you don't specify a Region, the backup copy
     * is created in the same Region where the request is sent from (in-Region copy).
     * </p>
     * <p>
     * For more information about creating backup copies, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#copy-backups"> Copying backups</a>
     * in the <i>Amazon FSx for Windows User Guide</i>, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html#copy-backups">Copying backups</a>
     * in the <i>Amazon FSx for Lustre User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/using-backups.html#copy-backups">Copying backups</a> in
     * the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param copyBackupRequest
     * @return Result of the CopyBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws InvalidSourceKmsKeyException
     *         The Key Management Service (KMS) key of the source backup is not valid.
     * @throws InvalidDestinationKmsKeyException
     *         The Key Management Service (KMS) key of the destination backup is not valid.
     * @throws InvalidRegionException
     *         The Region provided for <code>SourceRegion</code> is not valid or is in a different Amazon Web Services
     *         partition.
     * @throws SourceBackupUnavailableException
     *         The request was rejected because the lifecycle status of the source backup isn't <code>AVAILABLE</code>.
     * @throws IncompatibleRegionForMultiAZException
     *         Amazon FSx doesn't support Multi-AZ Windows File Server copy backup in the destination Region, so the
     *         copied backup can't be restored.
     * @sample AmazonFSx.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    CopyBackupResult copyBackup(CopyBackupRequest copyBackupRequest);

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx for Windows File Server file system, Amazon FSx for Lustre file
     * system, Amazon FSx for NetApp ONTAP volume, or Amazon FSx for OpenZFS file system. We recommend creating regular
     * backups so that you can restore a file system or volume from a backup if an issue arises with the original file
     * system or volume.
     * </p>
     * <p>
     * For Amazon FSx for Lustre file systems, you can create a backup only for file systems that have the following
     * configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A Persistent deployment type
     * </p>
     * </li>
     * <li>
     * <p>
     * Are <i>not</i> linked to a data repository
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about backups, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon FSx for Lustre, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with FSx for Lustre
     * backups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for Windows, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html">Working with FSx for Windows
     * backups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for NetApp ONTAP, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/using-backups.html">Working with FSx for NetApp ONTAP
     * backups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for OpenZFS, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/using-backups.html">Working with FSx for OpenZFS
     * backups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a backup with the specified client request token exists and the parameters match, this operation returns the
     * description of the existing backup. If a backup with the specified client request token exists and the parameters
     * don't match, this operation returns <code>IncompatibleParameterError</code>. If a backup with the specified
     * client request token doesn't exist, <code>CreateBackup</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateBackup</code> operation without the risk of
     * creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a backup was created. If you use the same client request token and the initial call created a backup, the
     * operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateBackup</code> operation returns while the backup's lifecycle state is still <code>CREATING</code>
     * . You can check the backup creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeBackups.html">DescribeBackups</a>
     * operation, which returns the backup state along with other information.
     * </p>
     * 
     * @param createBackupRequest
     *        The request object for the <code>CreateBackup</code> operation.
     * @return Result of the CreateBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest);

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository association (DRA). A data repository association is a link
     * between a directory on the file system and an Amazon S3 bucket or prefix. You can have a maximum of 8 data
     * repository associations on a file system. Data repository associations are supported only for file systems with
     * the <code>Persistent_2</code> deployment type.
     * </p>
     * <p>
     * Each data repository association must have a unique Amazon FSx file system directory and a unique S3 bucket or
     * prefix associated with it. You can configure a data repository association for automatic import only, for
     * automatic export only, or for both. To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * <note>
     * <p>
     * <code>CreateDataRepositoryAssociation</code> isn't supported on Amazon File Cache resources. To create a DRA on
     * Amazon File Cache, use the <code>CreateFileCache</code> operation.
     * </p>
     * </note>
     * 
     * @param createDataRepositoryAssociationRequest
     * @return Result of the CreateDataRepositoryAssociation operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDataRepositoryAssociationResult createDataRepositoryAssociation(CreateDataRepositoryAssociationRequest createDataRepositoryAssociationRequest);

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations
     * between your Amazon FSx file system and its linked data repositories. An example of a data repository task is
     * exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links
     * (symlinks) from your FSx file system to a linked data repository. A <code>CreateDataRepositoryTask</code>
     * operation will fail if a data repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html">Data Repository Tasks</a>.
     * To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @return Result of the CreateDataRepositoryTask operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws DataRepositoryTaskExecutingException
     *         An existing data repository task is currently executing on the file system. Wait until the existing task
     *         has completed, then create the new task.
     * @sample AmazonFSx.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDataRepositoryTaskResult createDataRepositoryTask(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest);

    /**
     * <p>
     * Creates a new Amazon File Cache resource.
     * </p>
     * <p>
     * You can use this operation with a client request token in the request that Amazon File Cache uses to ensure
     * idempotent creation. If a cache with the specified client request token exists and the parameters match,
     * <code>CreateFileCache</code> returns the description of the existing cache. If a cache with the specified client
     * request token exists and the parameters don't match, this call returns <code>IncompatibleParameterError</code>.
     * If a file cache with the specified client request token doesn't exist, <code>CreateFileCache</code> does the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon File Cache resourcewith an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the cache in JSON format.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateFileCache</code> call returns while the cache's lifecycle state is still <code>CREATING</code>.
     * You can check the cache creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileCaches.html">DescribeFileCaches</a>
     * operation, which returns the cache state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileCacheRequest
     * @return Result of the CreateFileCache operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileCacheConfigurationException
     *         A cache configuration is required for this operation.
     * @sample AmazonFSx.CreateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFileCacheResult createFileCache(CreateFileCacheRequest createFileCacheRequest);

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system. You can create the following supported Amazon FSx file systems using
     * the <code>CreateFileSystem</code> API operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon FSx for Lustre
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for NetApp ONTAP
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for OpenZFS
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for Windows File Server
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation.
     * This means that calling the operation multiple times with the same client request token has no effect. By using
     * the idempotent operation, you can retry a <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether
     * a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a file system, the client receives success as
     * long as the parameters are the same.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match,
     * <code>CreateFileSystem</code> returns the description of the existing file system. If a file system with the
     * specified client request token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system in JSON format.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileSystems.html">DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest
     *        The request object used to create a new Amazon FSx file system.
     * @return Result of the CreateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidImportPathException
     *         The path provided for data repository import isn't valid.
     * @throws InvalidExportPathException
     *         The path provided for data repository export isn't valid.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @sample AmazonFSx.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFileSystemResult createFileSystem(CreateFileSystemRequest createFileSystemRequest);

    /**
     * <p>
     * Creates a new Amazon FSx for Lustre, Amazon FSx for Windows File Server, or Amazon FSx for OpenZFS file system
     * from an existing Amazon FSx backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match, this operation returns
     * the description of the file system. If a file system with the specified client request token exists but the
     * parameters don't match, this call returns <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like the Active Directory, default share name, automatic backup, and backup settings default to the
     * parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileSystemFromBackup</code> call without the risk
     * of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
     * unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call created a file system, the client
     * receives a success message as long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileSystems.html"> DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest
     *        The request object for the <code>CreateFileSystemFromBackup</code> operation.
     * @return Result of the CreateFileSystemFromBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @sample AmazonFSx.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFileSystemFromBackupResult createFileSystemFromBackup(CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest);

    /**
     * <p>
     * Creates a snapshot of an existing Amazon FSx for OpenZFS volume. With snapshots, you can easily undo file changes
     * and compare file versions by restoring the volume to a previous version.
     * </p>
     * <p>
     * If a snapshot with the specified client request token exists, and the parameters match, this operation returns
     * the description of the existing snapshot. If a snapshot with the specified client request token exists, and the
     * parameters don't match, this operation returns <code>IncompatibleParameterError</code>. If a snapshot with the
     * specified client request token doesn't exist, <code>CreateSnapshot</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new OpenZFS snapshot with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateSnapshot</code> operation without the risk of
     * creating an extra snapshot. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a snapshot was created. If you use the same client request token and the initial call created a snapshot,
     * the operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateSnapshot</code> operation returns while the snapshot's lifecycle state is still
     * <code>CREATING</code>. You can check the snapshot creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeSnapshots.html">DescribeSnapshots</a>
     * operation, which returns the snapshot state along with other information.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
     * </p>
     * 
     * @param createStorageVirtualMachineRequest
     * @return Result of the CreateStorageVirtualMachine operation returned by the service.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @sample AmazonFSx.CreateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    CreateStorageVirtualMachineResult createStorageVirtualMachine(CreateStorageVirtualMachineRequest createStorageVirtualMachineRequest);

    /**
     * <p>
     * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
     * </p>
     * 
     * @param createVolumeRequest
     * @return Result of the CreateVolume operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingVolumeConfigurationException
     *         A volume configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @sample AmazonFSx.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest);

    /**
     * <p>
     * Creates a new Amazon FSx for NetApp ONTAP volume from an existing Amazon FSx volume backup.
     * </p>
     * 
     * @param createVolumeFromBackupRequest
     * @return Result of the CreateVolumeFromBackup operation returned by the service.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingVolumeConfigurationException
     *         A volume configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @sample AmazonFSx.CreateVolumeFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolumeFromBackup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVolumeFromBackupResult createVolumeFromBackup(CreateVolumeFromBackupRequest createVolumeFromBackupRequest);

    /**
     * <p>
     * Deletes an Amazon FSx backup. After deletion, the backup no longer exists, and its data is gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup won't show up in later
     * <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest
     *        The request object for the <code>DeleteBackup</code> operation.
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws BackupRestoringException
     *         You can't delete a backup while it's being used to restore a file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws BackupBeingCopiedException
     *         You can't delete a backup while it's being copied.
     * @sample AmazonFSx.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes a data repository association on an Amazon FSx for Lustre file system. Deleting the data repository
     * association unlinks the file system from the Amazon S3 bucket. When deleting a data repository association, you
     * have the option of deleting the data in the file system that corresponds to the data repository association. Data
     * repository associations are supported only for file systems with the <code>Persistent_2</code> deployment type.
     * </p>
     * 
     * @param deleteDataRepositoryAssociationRequest
     * @return Result of the DeleteDataRepositoryAssociation operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws DataRepositoryAssociationNotFoundException
     *         No data repository associations were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDataRepositoryAssociationResult deleteDataRepositoryAssociation(DeleteDataRepositoryAssociationRequest deleteDataRepositoryAssociationRequest);

    /**
     * <p>
     * Deletes an Amazon File Cache resource. After deletion, the cache no longer exists, and its data is gone.
     * </p>
     * <p>
     * The <code>DeleteFileCache</code> operation returns while the cache has the <code>DELETING</code> status. You can
     * check the cache deletion status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileCaches.html">DescribeFileCaches</a>
     * operation, which returns a list of caches in your account. If you pass the cache ID for a deleted cache, the
     * <code>DescribeFileCaches</code> operation returns a <code>FileCacheNotFound</code> error.
     * </p>
     * <important>
     * <p>
     * The data in a deleted cache is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileCacheRequest
     * @return Result of the DeleteFileCache operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileCacheNotFoundException
     *         No caches were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFileCacheResult deleteFileCache(DeleteFileCacheRequest deleteFileCacheRequest);

    /**
     * <p>
     * Deletes a file system. After deletion, the file system no longer exists, and its data is gone. Any existing
     * automatic backups and snapshots are also deleted.
     * </p>
     * <p>
     * To delete an Amazon FSx for NetApp ONTAP file system, first delete all the volumes and storage virtual machines
     * (SVMs) on the file system. Then provide a <code>FileSystemId</code> value to the <code>DeleFileSystem</code>
     * operation.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
     * deletion. This final backup isn't subject to the file system's retention policy, and must be manually deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> operation returns while the file system has the <code>DELETING</code> status.
     * You can check the file system deletion status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileSystems.html">DescribeFileSystems</a>
     * operation, which returns a list of file systems in your account. If you pass the file system ID for a deleted
     * file system, the <code>DescribeFileSystems</code> operation returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * If a data repository task is in a <code>PENDING</code> or <code>EXECUTING</code> state, deleting an Amazon FSx
     * for Lustre file system will fail with an HTTP status code 400 (Bad Request).
     * </p>
     * </note> <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest
     *        The request object for <code>DeleteFileSystem</code> operation.
     * @return Result of the DeleteFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest);

    /**
     * <p>
     * Deletes an Amazon FSx for OpenZFS snapshot. After deletion, the snapshot no longer exists, and its data is gone.
     * Deleting a snapshot doesn't affect snapshots stored in a file system backup.
     * </p>
     * <p>
     * The <code>DeleteSnapshot</code> operation returns instantly. The snapshot appears with the lifecycle status of
     * <code>DELETING</code> until the deletion is complete.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws SnapshotNotFoundException
     *         No Amazon FSx snapshots were found based on the supplied parameters.
     * @sample AmazonFSx.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes an existing Amazon FSx for ONTAP storage virtual machine (SVM). Prior to deleting an SVM, you must delete
     * all non-root volumes in the SVM, otherwise the operation will fail.
     * </p>
     * 
     * @param deleteStorageVirtualMachineRequest
     * @return Result of the DeleteStorageVirtualMachine operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @sample AmazonFSx.DeleteStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteStorageVirtualMachineResult deleteStorageVirtualMachine(DeleteStorageVirtualMachineRequest deleteStorageVirtualMachineRequest);

    /**
     * <p>
     * Deletes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param deleteVolumeRequest
     * @return Result of the DeleteVolume operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest);

    /**
     * <p>
     * Returns the description of a specific Amazon FSx backup, if a <code>BackupIds</code> value is provided for that
     * backup. Otherwise, it returns all backups owned by your Amazon Web Services account in the Amazon Web Services
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the <code>MaxResults</code> parameter to limit the number
     * of backups in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in the
     * response. In this case, send a later request with the <code>NextToken</code> request parameter set to the value
     * of the <code>NextToken</code> value from the last response.
     * </p>
     * <p>
     * This operation is used in an iterative process to retrieve a list of your backups. <code>DescribeBackups</code>
     * is called first without a <code>NextToken</code> value. Then the operation continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code> value.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The operation might return fewer than the <code>MaxResults</code> value of backup descriptions while still
     * including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of the backups returned in the response of one <code>DescribeBackups</code> call and the order of the
     * backups returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest
     *        The request object for the <code>DescribeBackups</code> operation.
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository associations, if
     * one or more <code>AssociationIds</code> values are provided in the request, or if filters are used in the
     * request. Data repository associations are supported only for Amazon FSx for Lustre file systems with the
     * <code>Persistent_2</code> deployment type and for Amazon File Cache resources.
     * </p>
     * <p>
     * You can use filters to narrow the response to include just data repository associations for specific file systems
     * (use the <code>file-system-id</code> filter with the ID of the file system) or caches (use the
     * <code>file-cache-id</code> filter with the ID of the cache), or data repository associations for a specific
     * repository type (use the <code>data-repository-type</code> filter with a value of <code>S3</code> or
     * <code>NFS</code>). If you don't use filters, the response returns all data repository associations owned by your
     * Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all data repository associations, you can paginate the response by using the optional
     * <code>MaxResults</code> parameter to limit the number of data repository associations returned in a response. If
     * more data repository associations remain, a <code>NextToken</code> value is returned in the response. In this
     * case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryAssociationsRequest
     * @return Result of the DescribeDataRepositoryAssociations operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws DataRepositoryAssociationNotFoundException
     *         No data repository associations were found based upon the supplied parameters.
     * @throws InvalidDataRepositoryTypeException
     *         You have filtered the response to a data repository type that is not supported.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeDataRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDataRepositoryAssociationsResult describeDataRepositoryAssociations(
            DescribeDataRepositoryAssociationsRequest describeDataRepositoryAssociationsRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository tasks, if one or
     * more <code>TaskIds</code> values are provided in the request, or if filters are used in the request. You can use
     * filters to narrow the response to include just tasks for specific file systems or caches, or tasks in a specific
     * lifecycle state. Otherwise, it returns all data repository tasks owned by your Amazon Web Services account in the
     * Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the optional <code>MaxResults</code> parameter
     * to limit the number of tasks returned in a response. If more tasks remain, a <code>NextToken</code> value is
     * returned in the response. In this case, send a later request with the <code>NextToken</code> request parameter
     * set to the value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @return Result of the DescribeDataRepositoryTasks operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws DataRepositoryTaskNotFoundException
     *         The data repository task or tasks you specified could not be found.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDataRepositoryTasksResult describeDataRepositoryTasks(DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest);

    /**
     * <p>
     * Returns the description of a specific Amazon File Cache resource, if a <code>FileCacheIds</code> value is
     * provided for that cache. Otherwise, it returns descriptions of all caches owned by your Amazon Web Services
     * account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all cache descriptions, you can optionally specify the <code>MaxResults</code> parameter to limit
     * the number of descriptions in a response. If more cache descriptions remain, the operation returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This operation is used in an iterative process to retrieve a list of your cache descriptions.
     * <code>DescribeFileCaches</code> is called first without a <code>NextToken</code>value. Then the operation
     * continues to be called with the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> cache descriptions while still including a
     * <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of caches returned in the response of one <code>DescribeFileCaches</code> call and the order of caches
     * returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileCachesRequest
     * @return Result of the DescribeFileCaches operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileCacheNotFoundException
     *         No caches were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileCaches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileCaches" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFileCachesResult describeFileCaches(DescribeFileCachesRequest describeFileCachesRequest);

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @return Result of the DescribeFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFileSystemAliasesResult describeFileSystemAliases(DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a <code>FileSystemIds</code> value is provided
     * for that file system. Otherwise, it returns descriptions of all file systems owned by your Amazon Web Services
     * account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxResults</code> parameter to
     * limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This operation is used in an iterative process to retrieve a list of your file system descriptions.
     * <code>DescribeFileSystems</code> is called first without a <code>NextToken</code>value. Then the operation
     * continues to be called with the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest
     *        The request object for <code>DescribeFileSystems</code> operation.
     * @return Result of the DescribeFileSystems operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest describeFileSystemsRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx for OpenZFS snapshots, if a <code>SnapshotIds</code> value is
     * provided. Otherwise, this operation returns all snapshots owned by your Amazon Web Services account in the Amazon
     * Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all snapshots, you can optionally specify the <code>MaxResults</code> parameter to limit the
     * number of snapshots in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in
     * the response. In this case, send a later request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * Use this operation in an iterative process to retrieve a list of your snapshots. <code>DescribeSnapshots</code>
     * is called first without a <code>NextToken</code> value. Then the operation continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code> value.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The operation might return fewer than the <code>MaxResults</code> value of snapshot descriptions while still
     * including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of snapshots returned in the response of one <code>DescribeSnapshots</code> call and the order of
     * backups returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeSnapshotsRequest
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws SnapshotNotFoundException
     *         No Amazon FSx snapshots were found based on the supplied parameters.
     * @sample AmazonFSx.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP storage virtual machines (SVMs).
     * </p>
     * 
     * @param describeStorageVirtualMachinesRequest
     * @return Result of the DescribeStorageVirtualMachines operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @sample AmazonFSx.DescribeStorageVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeStorageVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStorageVirtualMachinesResult describeStorageVirtualMachines(DescribeStorageVirtualMachinesRequest describeStorageVirtualMachinesRequest);

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return Result of the DescribeVolumes operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest);

    /**
     * <p>
     * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for
     * Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file
     * system, Amazon FSx responds with a 400 Bad Request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS
     * Aliases</a>.
     * </p>
     * <p>
     * The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file
     * system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file
     * system.
     * </p>
     * 
     * @param disassociateFileSystemAliasesRequest
     *        The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
     * @return Result of the DisassociateFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFileSystemAliasesResult disassociateFileSystemAliases(DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest);

    /**
     * <p>
     * Lists tags for Amazon FSx resources.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the <code>MaxResults</code> parameter to limit the number of
     * tags in a response. If more tags remain, Amazon FSx returns a <code>NextToken</code> value in the response. In
     * this case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your tags. <code>ListTagsForResource</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one <code>ListTagsForResource</code> call and the order of tags
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     *        The request object for <code>ListTagsForResource</code> operation.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Releases the file system lock from an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param releaseFileSystemNfsV3LocksRequest
     * @return Result of the ReleaseFileSystemNfsV3Locks operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.ReleaseFileSystemNfsV3Locks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ReleaseFileSystemNfsV3Locks"
     *      target="_top">AWS API Documentation</a>
     */
    ReleaseFileSystemNfsV3LocksResult releaseFileSystemNfsV3Locks(ReleaseFileSystemNfsV3LocksRequest releaseFileSystemNfsV3LocksRequest);

    /**
     * <p>
     * Returns an Amazon FSx for OpenZFS volume to the state saved by the specified snapshot.
     * </p>
     * 
     * @param restoreVolumeFromSnapshotRequest
     * @return Result of the RestoreVolumeFromSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.RestoreVolumeFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RestoreVolumeFromSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    RestoreVolumeFromSnapshotResult restoreVolumeFromSnapshot(RestoreVolumeFromSnapshotRequest restoreVolumeFromSnapshotRequest);

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration of an existing data repository association on an Amazon FSx for Lustre file system.
     * Data repository associations are supported only for file systems with the <code>Persistent_2</code> deployment
     * type.
     * </p>
     * 
     * @param updateDataRepositoryAssociationRequest
     * @return Result of the UpdateDataRepositoryAssociation operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws DataRepositoryAssociationNotFoundException
     *         No data repository associations were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.UpdateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDataRepositoryAssociationResult updateDataRepositoryAssociation(UpdateDataRepositoryAssociationRequest updateDataRepositoryAssociationRequest);

    /**
     * <p>
     * Updates the configuration of an existing Amazon File Cache resource. You can update multiple properties in a
     * single request.
     * </p>
     * 
     * @param updateFileCacheRequest
     * @return Result of the UpdateFileCache operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws FileCacheNotFoundException
     *         No caches were found based upon supplied parameters.
     * @throws MissingFileCacheConfigurationException
     *         A cache configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @sample AmazonFSx.UpdateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFileCacheResult updateFileCache(UpdateFileCacheRequest updateFileCacheRequest);

    /**
     * <p>
     * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple
     * properties in a single request.
     * </p>
     * <p>
     * For Amazon FSx for Windows File Server file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AuditLogConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SelfManagedActiveDirectoryConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ThroughputCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for Lustre file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AutoImportPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCompressionType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LustreRootSquashConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for NetApp ONTAP file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DiskIopsConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FsxAdminPassword</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ThroughputCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the Amazon FSx for OpenZFS file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CopyTagsToBackups</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CopyTagsToVolumes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ThroughputCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFileSystemRequest
     *        The request object for the <code>UpdateFileSystem</code> operation.
     * @return Result of the UpdateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @sample AmazonFSx.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest updateFileSystemRequest);

    /**
     * <p>
     * Updates the name of an Amazon FSx for OpenZFS snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return Result of the UpdateSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws SnapshotNotFoundException
     *         No Amazon FSx snapshots were found based on the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSnapshotResult updateSnapshot(UpdateSnapshotRequest updateSnapshotRequest);

    /**
     * <p>
     * Updates an Amazon FSx for ONTAP storage virtual machine (SVM).
     * </p>
     * 
     * @param updateStorageVirtualMachineRequest
     * @return Result of the UpdateStorageVirtualMachine operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @sample AmazonFSx.UpdateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateStorageVirtualMachineResult updateStorageVirtualMachine(UpdateStorageVirtualMachineRequest updateStorageVirtualMachineRequest);

    /**
     * <p>
     * Updates the configuration of an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param updateVolumeRequest
     * @return Result of the UpdateVolume operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingVolumeConfigurationException
     *         A volume configuration is required for this operation.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateVolumeResult updateVolume(UpdateVolumeRequest updateVolumeRequest);

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
