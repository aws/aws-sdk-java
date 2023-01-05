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

import com.amazonaws.services.fsx.model.*;

/**
 * Interface for accessing Amazon FSx asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fsx.AbstractAmazonFSxAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonFSxAsync extends AmazonFSx {

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
     * @return A Java Future containing the result of the AssociateFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsync.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(
            AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsyncHandler.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(
            AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateFileSystemAliasesRequest, AssociateFileSystemAliasesResult> asyncHandler);

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
     * @return A Java Future containing the result of the CancelDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsync.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelDataRepositoryTaskRequest, CancelDataRepositoryTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the CopyBackup operation returned by the service.
     * @sample AmazonFSxAsync.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest copyBackupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest copyBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CopyBackupRequest, CopyBackupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AmazonFSxAsync.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDataRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonFSxAsync.CreateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataRepositoryAssociationResult> createDataRepositoryAssociationAsync(
            CreateDataRepositoryAssociationRequest createDataRepositoryAssociationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.CreateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataRepositoryAssociationResult> createDataRepositoryAssociationAsync(
            CreateDataRepositoryAssociationRequest createDataRepositoryAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryAssociationRequest, CreateDataRepositoryAssociationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsync.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataRepositoryTask operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryTaskRequest, CreateDataRepositoryTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateFileCache operation returned by the service.
     * @sample AmazonFSxAsync.CreateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFileCacheResult> createFileCacheAsync(CreateFileCacheRequest createFileCacheRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileCache operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFileCacheResult> createFileCacheAsync(CreateFileCacheRequest createFileCacheRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileCacheRequest, CreateFileCacheResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateFileSystem operation returned by the service.
     * @sample AmazonFSxAsync.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest createFileSystemRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileSystem operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest createFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateFileSystemFromBackup operation returned by the service.
     * @sample AmazonFSxAsync.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(
            CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileSystemFromBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(
            CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemFromBackupRequest, CreateFileSystemFromBackupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonFSxAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
     * </p>
     * 
     * @param createStorageVirtualMachineRequest
     * @return A Java Future containing the result of the CreateStorageVirtualMachine operation returned by the service.
     * @sample AmazonFSxAsync.CreateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageVirtualMachineResult> createStorageVirtualMachineAsync(
            CreateStorageVirtualMachineRequest createStorageVirtualMachineRequest);

    /**
     * <p>
     * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
     * </p>
     * 
     * @param createStorageVirtualMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStorageVirtualMachine operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageVirtualMachineResult> createStorageVirtualMachineAsync(
            CreateStorageVirtualMachineRequest createStorageVirtualMachineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorageVirtualMachineRequest, CreateStorageVirtualMachineResult> asyncHandler);

    /**
     * <p>
     * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
     * </p>
     * 
     * @param createVolumeRequest
     * @return A Java Future containing the result of the CreateVolume operation returned by the service.
     * @sample AmazonFSxAsync.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest);

    /**
     * <p>
     * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
     * </p>
     * 
     * @param createVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVolume operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon FSx for NetApp ONTAP volume from an existing Amazon FSx volume backup.
     * </p>
     * 
     * @param createVolumeFromBackupRequest
     * @return A Java Future containing the result of the CreateVolumeFromBackup operation returned by the service.
     * @sample AmazonFSxAsync.CreateVolumeFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolumeFromBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVolumeFromBackupResult> createVolumeFromBackupAsync(CreateVolumeFromBackupRequest createVolumeFromBackupRequest);

    /**
     * <p>
     * Creates a new Amazon FSx for NetApp ONTAP volume from an existing Amazon FSx volume backup.
     * </p>
     * 
     * @param createVolumeFromBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVolumeFromBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.CreateVolumeFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolumeFromBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVolumeFromBackupResult> createVolumeFromBackupAsync(CreateVolumeFromBackupRequest createVolumeFromBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVolumeFromBackupRequest, CreateVolumeFromBackupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AmazonFSxAsync.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes a data repository association on an Amazon FSx for Lustre file system. Deleting the data repository
     * association unlinks the file system from the Amazon S3 bucket. When deleting a data repository association, you
     * have the option of deleting the data in the file system that corresponds to the data repository association. Data
     * repository associations are supported only for file systems with the <code>Persistent_2</code> deployment type.
     * </p>
     * 
     * @param deleteDataRepositoryAssociationRequest
     * @return A Java Future containing the result of the DeleteDataRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonFSxAsync.DeleteDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataRepositoryAssociationResult> deleteDataRepositoryAssociationAsync(
            DeleteDataRepositoryAssociationRequest deleteDataRepositoryAssociationRequest);

    /**
     * <p>
     * Deletes a data repository association on an Amazon FSx for Lustre file system. Deleting the data repository
     * association unlinks the file system from the Amazon S3 bucket. When deleting a data repository association, you
     * have the option of deleting the data in the file system that corresponds to the data repository association. Data
     * repository associations are supported only for file systems with the <code>Persistent_2</code> deployment type.
     * </p>
     * 
     * @param deleteDataRepositoryAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.DeleteDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataRepositoryAssociationResult> deleteDataRepositoryAssociationAsync(
            DeleteDataRepositoryAssociationRequest deleteDataRepositoryAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataRepositoryAssociationRequest, DeleteDataRepositoryAssociationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteFileCache operation returned by the service.
     * @sample AmazonFSxAsync.DeleteFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileCacheResult> deleteFileCacheAsync(DeleteFileCacheRequest deleteFileCacheRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFileCache operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileCacheResult> deleteFileCacheAsync(DeleteFileCacheRequest deleteFileCacheRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileCacheRequest, DeleteFileCacheResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteFileSystem operation returned by the service.
     * @sample AmazonFSxAsync.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest deleteFileSystemRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFileSystem operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest deleteFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonFSxAsync.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing Amazon FSx for ONTAP storage virtual machine (SVM). Prior to deleting an SVM, you must delete
     * all non-root volumes in the SVM, otherwise the operation will fail.
     * </p>
     * 
     * @param deleteStorageVirtualMachineRequest
     * @return A Java Future containing the result of the DeleteStorageVirtualMachine operation returned by the service.
     * @sample AmazonFSxAsync.DeleteStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageVirtualMachineResult> deleteStorageVirtualMachineAsync(
            DeleteStorageVirtualMachineRequest deleteStorageVirtualMachineRequest);

    /**
     * <p>
     * Deletes an existing Amazon FSx for ONTAP storage virtual machine (SVM). Prior to deleting an SVM, you must delete
     * all non-root volumes in the SVM, otherwise the operation will fail.
     * </p>
     * 
     * @param deleteStorageVirtualMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStorageVirtualMachine operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageVirtualMachineResult> deleteStorageVirtualMachineAsync(
            DeleteStorageVirtualMachineRequest deleteStorageVirtualMachineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageVirtualMachineRequest, DeleteStorageVirtualMachineResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param deleteVolumeRequest
     * @return A Java Future containing the result of the DeleteVolume operation returned by the service.
     * @sample AmazonFSxAsync.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest);

    /**
     * <p>
     * Deletes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param deleteVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVolume operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AmazonFSxAsync.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDataRepositoryAssociations operation returned by the
     *         service.
     * @sample AmazonFSxAsync.DescribeDataRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataRepositoryAssociationsResult> describeDataRepositoryAssociationsAsync(
            DescribeDataRepositoryAssociationsRequest describeDataRepositoryAssociationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataRepositoryAssociations operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.DescribeDataRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataRepositoryAssociationsResult> describeDataRepositoryAssociationsAsync(
            DescribeDataRepositoryAssociationsRequest describeDataRepositoryAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryAssociationsRequest, DescribeDataRepositoryAssociationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDataRepositoryTasks operation returned by the service.
     * @sample AmazonFSxAsync.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(
            DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataRepositoryTasks operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(
            DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryTasksRequest, DescribeDataRepositoryTasksResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeFileCaches operation returned by the service.
     * @sample AmazonFSxAsync.DescribeFileCaches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileCaches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileCachesResult> describeFileCachesAsync(DescribeFileCachesRequest describeFileCachesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileCaches operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeFileCaches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileCaches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileCachesResult> describeFileCachesAsync(DescribeFileCachesRequest describeFileCachesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileCachesRequest, DescribeFileCachesResult> asyncHandler);

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @return A Java Future containing the result of the DescribeFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsync.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(
            DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest);

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystemAliases operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(
            DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemAliasesRequest, DescribeFileSystemAliasesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeFileSystems operation returned by the service.
     * @sample AmazonFSxAsync.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest describeFileSystemsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystems operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest describeFileSystemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonFSxAsync.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP storage virtual machines (SVMs).
     * </p>
     * 
     * @param describeStorageVirtualMachinesRequest
     * @return A Java Future containing the result of the DescribeStorageVirtualMachines operation returned by the
     *         service.
     * @sample AmazonFSxAsync.DescribeStorageVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeStorageVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageVirtualMachinesResult> describeStorageVirtualMachinesAsync(
            DescribeStorageVirtualMachinesRequest describeStorageVirtualMachinesRequest);

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP storage virtual machines (SVMs).
     * </p>
     * 
     * @param describeStorageVirtualMachinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStorageVirtualMachines operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.DescribeStorageVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeStorageVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageVirtualMachinesResult> describeStorageVirtualMachinesAsync(
            DescribeStorageVirtualMachinesRequest describeStorageVirtualMachinesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageVirtualMachinesRequest, DescribeStorageVirtualMachinesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return A Java Future containing the result of the DescribeVolumes operation returned by the service.
     * @sample AmazonFSxAsync.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest);

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes.
     * </p>
     * 
     * @param describeVolumesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumes operation returned by the service.
     * @sample AmazonFSxAsyncHandler.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateFileSystemAliases operation returned by the
     *         service.
     * @sample AmazonFSxAsync.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(
            DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFileSystemAliases operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(
            DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFileSystemAliasesRequest, DisassociateFileSystemAliasesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonFSxAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonFSxAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Releases the file system lock from an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param releaseFileSystemNfsV3LocksRequest
     * @return A Java Future containing the result of the ReleaseFileSystemNfsV3Locks operation returned by the service.
     * @sample AmazonFSxAsync.ReleaseFileSystemNfsV3Locks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ReleaseFileSystemNfsV3Locks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReleaseFileSystemNfsV3LocksResult> releaseFileSystemNfsV3LocksAsync(
            ReleaseFileSystemNfsV3LocksRequest releaseFileSystemNfsV3LocksRequest);

    /**
     * <p>
     * Releases the file system lock from an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param releaseFileSystemNfsV3LocksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseFileSystemNfsV3Locks operation returned by the service.
     * @sample AmazonFSxAsyncHandler.ReleaseFileSystemNfsV3Locks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ReleaseFileSystemNfsV3Locks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReleaseFileSystemNfsV3LocksResult> releaseFileSystemNfsV3LocksAsync(
            ReleaseFileSystemNfsV3LocksRequest releaseFileSystemNfsV3LocksRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseFileSystemNfsV3LocksRequest, ReleaseFileSystemNfsV3LocksResult> asyncHandler);

    /**
     * <p>
     * Returns an Amazon FSx for OpenZFS volume to the state saved by the specified snapshot.
     * </p>
     * 
     * @param restoreVolumeFromSnapshotRequest
     * @return A Java Future containing the result of the RestoreVolumeFromSnapshot operation returned by the service.
     * @sample AmazonFSxAsync.RestoreVolumeFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RestoreVolumeFromSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreVolumeFromSnapshotResult> restoreVolumeFromSnapshotAsync(
            RestoreVolumeFromSnapshotRequest restoreVolumeFromSnapshotRequest);

    /**
     * <p>
     * Returns an Amazon FSx for OpenZFS volume to the state saved by the specified snapshot.
     * </p>
     * 
     * @param restoreVolumeFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreVolumeFromSnapshot operation returned by the service.
     * @sample AmazonFSxAsyncHandler.RestoreVolumeFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RestoreVolumeFromSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreVolumeFromSnapshotResult> restoreVolumeFromSnapshotAsync(
            RestoreVolumeFromSnapshotRequest restoreVolumeFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreVolumeFromSnapshotRequest, RestoreVolumeFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonFSxAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonFSxAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonFSxAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing data repository association on an Amazon FSx for Lustre file system.
     * Data repository associations are supported only for file systems with the <code>Persistent_2</code> deployment
     * type.
     * </p>
     * 
     * @param updateDataRepositoryAssociationRequest
     * @return A Java Future containing the result of the UpdateDataRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonFSxAsync.UpdateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataRepositoryAssociationResult> updateDataRepositoryAssociationAsync(
            UpdateDataRepositoryAssociationRequest updateDataRepositoryAssociationRequest);

    /**
     * <p>
     * Updates the configuration of an existing data repository association on an Amazon FSx for Lustre file system.
     * Data repository associations are supported only for file systems with the <code>Persistent_2</code> deployment
     * type.
     * </p>
     * 
     * @param updateDataRepositoryAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonFSxAsyncHandler.UpdateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataRepositoryAssociationResult> updateDataRepositoryAssociationAsync(
            UpdateDataRepositoryAssociationRequest updateDataRepositoryAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataRepositoryAssociationRequest, UpdateDataRepositoryAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing Amazon File Cache resource. You can update multiple properties in a
     * single request.
     * </p>
     * 
     * @param updateFileCacheRequest
     * @return A Java Future containing the result of the UpdateFileCache operation returned by the service.
     * @sample AmazonFSxAsync.UpdateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileCacheResult> updateFileCacheAsync(UpdateFileCacheRequest updateFileCacheRequest);

    /**
     * <p>
     * Updates the configuration of an existing Amazon File Cache resource. You can update multiple properties in a
     * single request.
     * </p>
     * 
     * @param updateFileCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFileCache operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UpdateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileCacheResult> updateFileCacheAsync(UpdateFileCacheRequest updateFileCacheRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFileCacheRequest, UpdateFileCacheResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateFileSystem operation returned by the service.
     * @sample AmazonFSxAsync.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest updateFileSystemRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFileSystem operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest updateFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler);

    /**
     * <p>
     * Updates the name of an Amazon FSx for OpenZFS snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return A Java Future containing the result of the UpdateSnapshot operation returned by the service.
     * @sample AmazonFSxAsync.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest updateSnapshotRequest);

    /**
     * <p>
     * Updates the name of an Amazon FSx for OpenZFS snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSnapshot operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest updateSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon FSx for ONTAP storage virtual machine (SVM).
     * </p>
     * 
     * @param updateStorageVirtualMachineRequest
     * @return A Java Future containing the result of the UpdateStorageVirtualMachine operation returned by the service.
     * @sample AmazonFSxAsync.UpdateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageVirtualMachineResult> updateStorageVirtualMachineAsync(
            UpdateStorageVirtualMachineRequest updateStorageVirtualMachineRequest);

    /**
     * <p>
     * Updates an Amazon FSx for ONTAP storage virtual machine (SVM).
     * </p>
     * 
     * @param updateStorageVirtualMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStorageVirtualMachine operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UpdateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageVirtualMachineResult> updateStorageVirtualMachineAsync(
            UpdateStorageVirtualMachineRequest updateStorageVirtualMachineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStorageVirtualMachineRequest, UpdateStorageVirtualMachineResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param updateVolumeRequest
     * @return A Java Future containing the result of the UpdateVolume operation returned by the service.
     * @sample AmazonFSxAsync.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest updateVolumeRequest);

    /**
     * <p>
     * Updates the configuration of an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param updateVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVolume operation returned by the service.
     * @sample AmazonFSxAsyncHandler.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest updateVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResult> asyncHandler);

}
