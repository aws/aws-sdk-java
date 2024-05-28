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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates how your transfer task is configured. These options include how DataSync handles files, objects, and their
 * associated metadata during your transfer. You also can specify how to verify data integrity, set bandwidth limits for
 * your task, among other options.
 * </p>
 * <p>
 * Each option has a default value. Unless you need to, you don't have to configure any option before calling <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>.
 * </p>
 * <p>
 * You also can override your task options for each task execution. For example, you might want to adjust the
 * <code>LogLevel</code> for an individual execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Options" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Options implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire source
     * and destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * If you use a <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     * DataSync only scans and verifies what's listed in the manifest.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * </li>
     * </ul>
     */
    private String verifyMode;
    /**
     * <p>
     * Specifies whether DataSync should modify or preserve data at the destination location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data (including
     * metadata) has changed.
     * </p>
     * <p>
     * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes (for
     * example, for retrieval or early deletion). For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data has
     * changed. You can use this option to protect against overwriting changes made to files or objects in the
     * destination.
     * </p>
     * </li>
     * </ul>
     */
    private String overwriteMode;
    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to.
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code> attribute on
     * all source files (that is, the version before the <code>PREPARING</code> phase of the task execution). This
     * option is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Atime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to <code>PRESERVE</code>
     * .
     * </p>
     * <p>
     * If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     * </p>
     * </note>
     */
    private String atime;
    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time that a file was written to before the
     * <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a task more
     * than once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Mtime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to <code>BEST_EFFORT</code>
     * .
     * </p>
     * <p>
     * If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to <code>NONE</code>.
     * </p>
     * </note>
     */
    private String mtime;
    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     */
    private String gid;
    /**
     * <p>
     * Specifies whether files in the destination location that don't exist in the source should be preserved. This
     * option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage
     * duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to <code>ALL</code>.
     * When you transfer all data, DataSync doesn't scan your destination location and doesn't know what to delete.
     * </p>
     * </note>
     */
    private String preserveDeletedFiles;
    /**
     * <p>
     * Specifies whether DataSync should preserve the metadata of block and character devices in the source location and
     * recreate the files with that device name and metadata on the destination. DataSync copies only the name and
     * metadata of such devices.
     * </p>
     * <note>
     * <p>
     * DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> (default) - Ignores special devices (recommended).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
     * </li>
     * </ul>
     */
    private String preserveDevices;
    /**
     * <p>
     * Specifies which users or groups can access a file for a specific purpose such as reading, writing, or execution
     * of the file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores POSIX-style permissions.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     */
    private String posixPermissions;
    /**
     * <p>
     * Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB, set
     * this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     */
    private Long bytesPerSecond;
    /**
     * <p>
     * Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     * multiple tasks</a>. This is <code>ENABLED</code> by default.
     * </p>
     */
    private String taskQueueing;
    /**
     * <p>
     * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the log
     * group, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and performs
     * data-integrity checks on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF</code> - No logs are published.
     * </p>
     * </li>
     * </ul>
     */
    private String logLevel;
    /**
     * <p>
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the
     * destination location or transfers all the content from the source (without comparing what's in the destination).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content from the
     * source location to the destination location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - DataSync copies everything in the source to the destination without comparing differences
     * between the locations.
     * </p>
     * </li>
     * </ul>
     */
    private String transferMode;
    /**
     * <p>
     * Specifies which components of the SMB security descriptor are copied from source to destination objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or between two
     * FSx for Windows File Server locations. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     * metadata</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * <p>
     * DataSync won't copy NTFS system access control lists (SACLs) with this option.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SACLs, which are used by administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user with the right permissions, see required permissions for <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >SMB</a>, <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     * >FSx for Windows File Server</a>, or <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb">FSx
     * for ONTAP</a> (depending on the type of location in your transfer).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     * </li>
     * </ul>
     */
    private String securityDescriptorCopyFlags;
    /**
     * <p>
     * Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when transferring
     * between object storage systems. If you want your DataSync task to ignore object tags, specify the
     * <code>NONE</code> value.
     * </p>
     */
    private String objectTags;

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire source
     * and destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * If you use a <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     * DataSync only scans and verifies what's listed in the manifest.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyMode
     *        Specifies how and when DataSync checks the integrity of your data during a transfer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files
     *        and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *        the checksum calculated on those files at the destination.
     *        </p>
     *        <p>
     *        We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire
     *        source and destination to verify that both locations are fully synchronized.
     *        </p>
     *        <p>
     *        If you use a <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     *        DataSync only scans and verifies what's listed in the manifest.
     *        </p>
     *        <p>
     *        You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     *        transmissions are still integrity-checked with checksum verification during the transfer.
     *        </p>
     *        </li>
     * @see VerifyMode
     */

    public void setVerifyMode(String verifyMode) {
        this.verifyMode = verifyMode;
    }

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire source
     * and destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * If you use a <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     * DataSync only scans and verifies what's listed in the manifest.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how and when DataSync checks the integrity of your data during a transfer.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files
     *         and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *         the checksum calculated on those files at the destination.
     *         </p>
     *         <p>
     *         We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *         storage classes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Storage class considerations with Amazon S3 locations</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire
     *         source and destination to verify that both locations are fully synchronized.
     *         </p>
     *         <p>
     *         If you use a <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html"
     *         >manifest</a>, DataSync only scans and verifies what's listed in the manifest.
     *         </p>
     *         <p>
     *         You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *         storage classes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Storage class considerations with Amazon S3 locations</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     *         transmissions are still integrity-checked with checksum verification during the transfer.
     *         </p>
     *         </li>
     * @see VerifyMode
     */

    public String getVerifyMode() {
        return this.verifyMode;
    }

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire source
     * and destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * If you use a <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     * DataSync only scans and verifies what's listed in the manifest.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyMode
     *        Specifies how and when DataSync checks the integrity of your data during a transfer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files
     *        and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *        the checksum calculated on those files at the destination.
     *        </p>
     *        <p>
     *        We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire
     *        source and destination to verify that both locations are fully synchronized.
     *        </p>
     *        <p>
     *        If you use a <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     *        DataSync only scans and verifies what's listed in the manifest.
     *        </p>
     *        <p>
     *        You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     *        transmissions are still integrity-checked with checksum verification during the transfer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifyMode
     */

    public Options withVerifyMode(String verifyMode) {
        setVerifyMode(verifyMode);
        return this;
    }

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire source
     * and destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * If you use a <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     * DataSync only scans and verifies what's listed in the manifest.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyMode
     *        Specifies how and when DataSync checks the integrity of your data during a transfer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONLY_FILES_TRANSFERRED</code> (recommended) - DataSync calculates the checksum of transferred files
     *        and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *        the checksum calculated on those files at the destination.
     *        </p>
     *        <p>
     *        We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POINT_IN_TIME_CONSISTENT</code> (default) - At the end of the transfer, DataSync scans the entire
     *        source and destination to verify that both locations are fully synchronized.
     *        </p>
     *        <p>
     *        If you use a <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">manifest</a>,
     *        DataSync only scans and verifies what's listed in the manifest.
     *        </p>
     *        <p>
     *        You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - DataSync doesn't run additional verification at the end of the transfer. All data
     *        transmissions are still integrity-checked with checksum verification during the transfer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifyMode
     */

    public Options withVerifyMode(VerifyMode verifyMode) {
        this.verifyMode = verifyMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether DataSync should modify or preserve data at the destination location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data (including
     * metadata) has changed.
     * </p>
     * <p>
     * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes (for
     * example, for retrieval or early deletion). For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data has
     * changed. You can use this option to protect against overwriting changes made to files or objects in the
     * destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param overwriteMode
     *        Specifies whether DataSync should modify or preserve data at the destination location.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data
     *        (including metadata) has changed.
     *        </p>
     *        <p>
     *        If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes
     *        (for example, for retrieval or early deletion). For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 transfers</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data
     *        has changed. You can use this option to protect against overwriting changes made to files or objects in
     *        the destination.
     *        </p>
     *        </li>
     * @see OverwriteMode
     */

    public void setOverwriteMode(String overwriteMode) {
        this.overwriteMode = overwriteMode;
    }

    /**
     * <p>
     * Specifies whether DataSync should modify or preserve data at the destination location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data (including
     * metadata) has changed.
     * </p>
     * <p>
     * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes (for
     * example, for retrieval or early deletion). For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data has
     * changed. You can use this option to protect against overwriting changes made to files or objects in the
     * destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether DataSync should modify or preserve data at the destination location.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data
     *         (including metadata) has changed.
     *         </p>
     *         <p>
     *         If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes
     *         (for example, for retrieval or early deletion). For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Storage class considerations with Amazon S3 transfers</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data
     *         has changed. You can use this option to protect against overwriting changes made to files or objects in
     *         the destination.
     *         </p>
     *         </li>
     * @see OverwriteMode
     */

    public String getOverwriteMode() {
        return this.overwriteMode;
    }

    /**
     * <p>
     * Specifies whether DataSync should modify or preserve data at the destination location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data (including
     * metadata) has changed.
     * </p>
     * <p>
     * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes (for
     * example, for retrieval or early deletion). For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data has
     * changed. You can use this option to protect against overwriting changes made to files or objects in the
     * destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param overwriteMode
     *        Specifies whether DataSync should modify or preserve data at the destination location.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data
     *        (including metadata) has changed.
     *        </p>
     *        <p>
     *        If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes
     *        (for example, for retrieval or early deletion). For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 transfers</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data
     *        has changed. You can use this option to protect against overwriting changes made to files or objects in
     *        the destination.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteMode
     */

    public Options withOverwriteMode(String overwriteMode) {
        setOverwriteMode(overwriteMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether DataSync should modify or preserve data at the destination location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data (including
     * metadata) has changed.
     * </p>
     * <p>
     * If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes (for
     * example, for retrieval or early deletion). For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data has
     * changed. You can use this option to protect against overwriting changes made to files or objects in the
     * destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param overwriteMode
     *        Specifies whether DataSync should modify or preserve data at the destination location.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALWAYS</code> (default) - DataSync modifies data in the destination location when source data
     *        (including metadata) has changed.
     *        </p>
     *        <p>
     *        If DataSync overwrites objects, you might incur additional charges for certain Amazon S3 storage classes
     *        (for example, for retrieval or early deletion). For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 transfers</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEVER</code> - DataSync doesn't overwrite data in the destination location even if the source data
     *        has changed. You can use this option to protect against overwriting changes made to files or objects in
     *        the destination.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteMode
     */

    public Options withOverwriteMode(OverwriteMode overwriteMode) {
        this.overwriteMode = overwriteMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to.
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code> attribute on
     * all source files (that is, the version before the <code>PREPARING</code> phase of the task execution). This
     * option is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Atime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to <code>PRESERVE</code>
     * .
     * </p>
     * <p>
     * If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @param atime
     *        Specifies whether to preserve metadata indicating the last time a file was read or written to.</p> <note>
     *        <p>
     *        The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *        a best-effort basis.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code>
     *        attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     *        execution). This option is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores <code>Atime</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to
     *        <code>PRESERVE</code>.
     *        </p>
     *        <p>
     *        If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     *        </p>
     * @see Atime
     */

    public void setAtime(String atime) {
        this.atime = atime;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to.
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code> attribute on
     * all source files (that is, the version before the <code>PREPARING</code> phase of the task execution). This
     * option is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Atime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to <code>PRESERVE</code>
     * .
     * </p>
     * <p>
     * If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @return Specifies whether to preserve metadata indicating the last time a file was read or written to.</p> <note>
     *         <p>
     *         The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *         a best-effort basis.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code>
     *         attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     *         execution). This option is recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Ignores <code>Atime</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to
     *         <code>PRESERVE</code>.
     *         </p>
     *         <p>
     *         If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     *         </p>
     * @see Atime
     */

    public String getAtime() {
        return this.atime;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to.
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code> attribute on
     * all source files (that is, the version before the <code>PREPARING</code> phase of the task execution). This
     * option is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Atime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to <code>PRESERVE</code>
     * .
     * </p>
     * <p>
     * If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @param atime
     *        Specifies whether to preserve metadata indicating the last time a file was read or written to.</p> <note>
     *        <p>
     *        The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *        a best-effort basis.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code>
     *        attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     *        execution). This option is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores <code>Atime</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to
     *        <code>PRESERVE</code>.
     *        </p>
     *        <p>
     *        If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Atime
     */

    public Options withAtime(String atime) {
        setAtime(atime);
        return this;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to.
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code> attribute on
     * all source files (that is, the version before the <code>PREPARING</code> phase of the task execution). This
     * option is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Atime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to <code>PRESERVE</code>
     * .
     * </p>
     * <p>
     * If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @param atime
     *        Specifies whether to preserve metadata indicating the last time a file was read or written to.</p> <note>
     *        <p>
     *        The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *        a best-effort basis.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BEST_EFFORT</code> (default) - DataSync attempts to preserve the original <code>Atime</code>
     *        attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     *        execution). This option is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores <code>Atime</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If <code>Atime</code> is set to <code>BEST_EFFORT</code>, <code>Mtime</code> must be set to
     *        <code>PRESERVE</code>.
     *        </p>
     *        <p>
     *        If <code>Atime</code> is set to <code>NONE</code>, <code>Mtime</code> must also be <code>NONE</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Atime
     */

    public Options withAtime(Atime atime) {
        this.atime = atime.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time that a file was written to before the
     * <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a task more
     * than once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Mtime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to <code>BEST_EFFORT</code>
     * .
     * </p>
     * <p>
     * If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @param mtime
     *        Specifies whether to preserve metadata indicating the last time that a file was written to before the
     *        <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a
     *        task more than once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores <code>Mtime</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to
     *        <code>BEST_EFFORT</code>.
     *        </p>
     *        <p>
     *        If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to
     *        <code>NONE</code>.
     *        </p>
     * @see Mtime
     */

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time that a file was written to before the
     * <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a task more
     * than once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Mtime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to <code>BEST_EFFORT</code>
     * .
     * </p>
     * <p>
     * If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @return Specifies whether to preserve metadata indicating the last time that a file was written to before the
     *         <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a
     *         task more than once.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Ignores <code>Mtime</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to
     *         <code>BEST_EFFORT</code>.
     *         </p>
     *         <p>
     *         If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to
     *         <code>NONE</code>.
     *         </p>
     * @see Mtime
     */

    public String getMtime() {
        return this.mtime;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time that a file was written to before the
     * <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a task more
     * than once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Mtime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to <code>BEST_EFFORT</code>
     * .
     * </p>
     * <p>
     * If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @param mtime
     *        Specifies whether to preserve metadata indicating the last time that a file was written to before the
     *        <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a
     *        task more than once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores <code>Mtime</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to
     *        <code>BEST_EFFORT</code>.
     *        </p>
     *        <p>
     *        If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to
     *        <code>NONE</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mtime
     */

    public Options withMtime(String mtime) {
        setMtime(mtime);
        return this;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time that a file was written to before the
     * <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a task more
     * than once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores <code>Mtime</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to <code>BEST_EFFORT</code>
     * .
     * </p>
     * <p>
     * If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to <code>NONE</code>.
     * </p>
     * </note>
     * 
     * @param mtime
     *        Specifies whether to preserve metadata indicating the last time that a file was written to before the
     *        <code>PREPARING</code> phase of your task execution. This option is required when you need to run the a
     *        task more than once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Preserves original <code>Mtime</code>, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores <code>Mtime</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If <code>Mtime</code> is set to <code>PRESERVE</code>, <code>Atime</code> must be set to
     *        <code>BEST_EFFORT</code>.
     *        </p>
     *        <p>
     *        If <code>Mtime</code> is set to <code>NONE</code>, <code>Atime</code> must also be set to
     *        <code>NONE</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mtime
     */

    public Options withMtime(Mtime mtime) {
        this.mtime = mtime.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @param uid
     *        Specifies the POSIX user ID (UID) of the file's owner.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is
     *        recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores UID and GID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     * @see Uid
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @return Specifies the POSIX user ID (UID) of the file's owner.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is
     *         recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Ignores UID and GID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         copied by DataSync</a>.
     * @see Uid
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @param uid
     *        Specifies the POSIX user ID (UID) of the file's owner.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is
     *        recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores UID and GID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Uid
     */

    public Options withUid(String uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @param uid
     *        Specifies the POSIX user ID (UID) of the file's owner.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INT_VALUE</code> (default) - Preserves the integer value of UID and group ID (GID), which is
     *        recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores UID and GID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Uid
     */

    public Options withUid(Uid uid) {
        this.uid = uid.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @param gid
     *        Specifies the POSIX group ID (GID) of the file's owners.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is
     *        recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores UID and GID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     * @see Gid
     */

    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @return Specifies the POSIX group ID (GID) of the file's owners.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is
     *         recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Ignores UID and GID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         copied by DataSync</a>.
     * @see Gid
     */

    public String getGid() {
        return this.gid;
    }

    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @param gid
     *        Specifies the POSIX group ID (GID) of the file's owners.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is
     *        recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores UID and GID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gid
     */

    public Options withGid(String gid) {
        setGid(gid);
        return this;
    }

    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores UID and GID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * 
     * @param gid
     *        Specifies the POSIX group ID (GID) of the file's owners.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INT_VALUE</code> (default) - Preserves the integer value of user ID (UID) and GID, which is
     *        recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores UID and GID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gid
     */

    public Options withGid(Gid gid) {
        this.gid = gid.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether files in the destination location that don't exist in the source should be preserved. This
     * option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage
     * duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to <code>ALL</code>.
     * When you transfer all data, DataSync doesn't scan your destination location and doesn't know what to delete.
     * </p>
     * </note>
     * 
     * @param preserveDeletedFiles
     *        Specifies whether files in the destination location that don't exist in the source should be preserved.
     *        This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *        storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to
     *        <code>ALL</code>. When you transfer all data, DataSync doesn't scan your destination location and doesn't
     *        know what to delete.
     *        </p>
     * @see PreserveDeletedFiles
     */

    public void setPreserveDeletedFiles(String preserveDeletedFiles) {
        this.preserveDeletedFiles = preserveDeletedFiles;
    }

    /**
     * <p>
     * Specifies whether files in the destination location that don't exist in the source should be preserved. This
     * option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage
     * duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to <code>ALL</code>.
     * When you transfer all data, DataSync doesn't scan your destination location and doesn't know what to delete.
     * </p>
     * </note>
     * 
     * @return Specifies whether files in the destination location that don't exist in the source should be preserved.
     *         This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *         storage duration charges for certain storage classes. For detailed information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Considerations when working with Amazon S3 storage classes in DataSync</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to
     *         <code>ALL</code>. When you transfer all data, DataSync doesn't scan your destination location and doesn't
     *         know what to delete.
     *         </p>
     * @see PreserveDeletedFiles
     */

    public String getPreserveDeletedFiles() {
        return this.preserveDeletedFiles;
    }

    /**
     * <p>
     * Specifies whether files in the destination location that don't exist in the source should be preserved. This
     * option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage
     * duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to <code>ALL</code>.
     * When you transfer all data, DataSync doesn't scan your destination location and doesn't know what to delete.
     * </p>
     * </note>
     * 
     * @param preserveDeletedFiles
     *        Specifies whether files in the destination location that don't exist in the source should be preserved.
     *        This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *        storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to
     *        <code>ALL</code>. When you transfer all data, DataSync doesn't scan your destination location and doesn't
     *        know what to delete.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDeletedFiles
     */

    public Options withPreserveDeletedFiles(String preserveDeletedFiles) {
        setPreserveDeletedFiles(preserveDeletedFiles);
        return this;
    }

    /**
     * <p>
     * Specifies whether files in the destination location that don't exist in the source should be preserved. This
     * option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage
     * duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to <code>ALL</code>.
     * When you transfer all data, DataSync doesn't scan your destination location and doesn't know what to delete.
     * </p>
     * </note>
     * 
     * @param preserveDeletedFiles
     *        Specifies whether files in the destination location that don't exist in the source should be preserved.
     *        This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *        storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Ignores such destination files, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Deletes destination files that aren’t present in the source.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you set this parameter to <code>REMOVE</code>, you can't set <code>TransferMode</code> to
     *        <code>ALL</code>. When you transfer all data, DataSync doesn't scan your destination location and doesn't
     *        know what to delete.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDeletedFiles
     */

    public Options withPreserveDeletedFiles(PreserveDeletedFiles preserveDeletedFiles) {
        this.preserveDeletedFiles = preserveDeletedFiles.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether DataSync should preserve the metadata of block and character devices in the source location and
     * recreate the files with that device name and metadata on the destination. DataSync copies only the name and
     * metadata of such devices.
     * </p>
     * <note>
     * <p>
     * DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> (default) - Ignores special devices (recommended).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preserveDevices
     *        Specifies whether DataSync should preserve the metadata of block and character devices in the source
     *        location and recreate the files with that device name and metadata on the destination. DataSync copies
     *        only the name and metadata of such devices.</p> <note>
     *        <p>
     *        DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     *        end-of-file (EOF) marker.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> (default) - Ignores special devices (recommended).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't
     *        supported for Amazon EFS.
     *        </p>
     *        </li>
     * @see PreserveDevices
     */

    public void setPreserveDevices(String preserveDevices) {
        this.preserveDevices = preserveDevices;
    }

    /**
     * <p>
     * Specifies whether DataSync should preserve the metadata of block and character devices in the source location and
     * recreate the files with that device name and metadata on the destination. DataSync copies only the name and
     * metadata of such devices.
     * </p>
     * <note>
     * <p>
     * DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> (default) - Ignores special devices (recommended).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether DataSync should preserve the metadata of block and character devices in the source
     *         location and recreate the files with that device name and metadata on the destination. DataSync copies
     *         only the name and metadata of such devices.</p> <note>
     *         <p>
     *         DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     *         end-of-file (EOF) marker.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> (default) - Ignores special devices (recommended).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't
     *         supported for Amazon EFS.
     *         </p>
     *         </li>
     * @see PreserveDevices
     */

    public String getPreserveDevices() {
        return this.preserveDevices;
    }

    /**
     * <p>
     * Specifies whether DataSync should preserve the metadata of block and character devices in the source location and
     * recreate the files with that device name and metadata on the destination. DataSync copies only the name and
     * metadata of such devices.
     * </p>
     * <note>
     * <p>
     * DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> (default) - Ignores special devices (recommended).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preserveDevices
     *        Specifies whether DataSync should preserve the metadata of block and character devices in the source
     *        location and recreate the files with that device name and metadata on the destination. DataSync copies
     *        only the name and metadata of such devices.</p> <note>
     *        <p>
     *        DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     *        end-of-file (EOF) marker.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> (default) - Ignores special devices (recommended).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't
     *        supported for Amazon EFS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDevices
     */

    public Options withPreserveDevices(String preserveDevices) {
        setPreserveDevices(preserveDevices);
        return this;
    }

    /**
     * <p>
     * Specifies whether DataSync should preserve the metadata of block and character devices in the source location and
     * recreate the files with that device name and metadata on the destination. DataSync copies only the name and
     * metadata of such devices.
     * </p>
     * <note>
     * <p>
     * DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> (default) - Ignores special devices (recommended).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preserveDevices
     *        Specifies whether DataSync should preserve the metadata of block and character devices in the source
     *        location and recreate the files with that device name and metadata on the destination. DataSync copies
     *        only the name and metadata of such devices.</p> <note>
     *        <p>
     *        DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     *        end-of-file (EOF) marker.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> (default) - Ignores special devices (recommended).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> - Preserves character and block device metadata. This option currently isn't
     *        supported for Amazon EFS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDevices
     */

    public Options withPreserveDevices(PreserveDevices preserveDevices) {
        this.preserveDevices = preserveDevices.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which users or groups can access a file for a specific purpose such as reading, writing, or execution
     * of the file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores POSIX-style permissions.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @param posixPermissions
     *        Specifies which users or groups can access a file for a specific purpose such as reading, writing, or
     *        execution of the file.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores POSIX-style permissions.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        DataSync can preserve extant permissions of a source location.
     *        </p>
     * @see PosixPermissions
     */

    public void setPosixPermissions(String posixPermissions) {
        this.posixPermissions = posixPermissions;
    }

    /**
     * <p>
     * Specifies which users or groups can access a file for a specific purpose such as reading, writing, or execution
     * of the file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores POSIX-style permissions.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @return Specifies which users or groups can access a file for a specific purpose such as reading, writing, or
     *         execution of the file.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         copied by DataSync</a>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Ignores POSIX-style permissions.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         DataSync can preserve extant permissions of a source location.
     *         </p>
     * @see PosixPermissions
     */

    public String getPosixPermissions() {
        return this.posixPermissions;
    }

    /**
     * <p>
     * Specifies which users or groups can access a file for a specific purpose such as reading, writing, or execution
     * of the file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores POSIX-style permissions.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @param posixPermissions
     *        Specifies which users or groups can access a file for a specific purpose such as reading, writing, or
     *        execution of the file.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores POSIX-style permissions.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        DataSync can preserve extant permissions of a source location.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PosixPermissions
     */

    public Options withPosixPermissions(String posixPermissions) {
        setPosixPermissions(posixPermissions);
        return this;
    }

    /**
     * <p>
     * Specifies which users or groups can access a file for a specific purpose such as reading, writing, or execution
     * of the file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - Ignores POSIX-style permissions.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @param posixPermissions
     *        Specifies which users or groups can access a file for a specific purpose such as reading, writing, or
     *        execution of the file.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRESERVE</code> (default) - Preserves POSIX-style permissions, which is recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Ignores POSIX-style permissions.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        DataSync can preserve extant permissions of a source location.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PosixPermissions
     */

    public Options withPosixPermissions(PosixPermissions posixPermissions) {
        this.posixPermissions = posixPermissions.toString();
        return this;
    }

    /**
     * <p>
     * Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB, set
     * this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     * 
     * @param bytesPerSecond
     *        Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB,
     *        set this value to <code>1048576</code> (<code>=1024*1024</code>).
     */

    public void setBytesPerSecond(Long bytesPerSecond) {
        this.bytesPerSecond = bytesPerSecond;
    }

    /**
     * <p>
     * Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB, set
     * this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     * 
     * @return Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB,
     *         set this value to <code>1048576</code> (<code>=1024*1024</code>).
     */

    public Long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    /**
     * <p>
     * Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB, set
     * this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     * 
     * @param bytesPerSecond
     *        Limits the bandwidth used by a DataSync task. For example, if you want DataSync to use a maximum of 1 MB,
     *        set this value to <code>1048576</code> (<code>=1024*1024</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Options withBytesPerSecond(Long bytesPerSecond) {
        setBytesPerSecond(bytesPerSecond);
        return this;
    }

    /**
     * <p>
     * Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     * multiple tasks</a>. This is <code>ENABLED</code> by default.
     * </p>
     * 
     * @param taskQueueing
     *        Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     *        multiple tasks</a>. This is <code>ENABLED</code> by default.
     * @see TaskQueueing
     */

    public void setTaskQueueing(String taskQueueing) {
        this.taskQueueing = taskQueueing;
    }

    /**
     * <p>
     * Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     * multiple tasks</a>. This is <code>ENABLED</code> by default.
     * </p>
     * 
     * @return Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     *         multiple tasks</a>. This is <code>ENABLED</code> by default.
     * @see TaskQueueing
     */

    public String getTaskQueueing() {
        return this.taskQueueing;
    }

    /**
     * <p>
     * Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     * multiple tasks</a>. This is <code>ENABLED</code> by default.
     * </p>
     * 
     * @param taskQueueing
     *        Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     *        multiple tasks</a>. This is <code>ENABLED</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskQueueing
     */

    public Options withTaskQueueing(String taskQueueing) {
        setTaskQueueing(taskQueueing);
        return this;
    }

    /**
     * <p>
     * Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     * multiple tasks</a>. This is <code>ENABLED</code> by default.
     * </p>
     * 
     * @param taskQueueing
     *        Specifies whether your transfer tasks should be put into a queue during certain scenarios when <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks">running
     *        multiple tasks</a>. This is <code>ENABLED</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskQueueing
     */

    public Options withTaskQueueing(TaskQueueing taskQueueing) {
        this.taskQueueing = taskQueueing.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the log
     * group, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and performs
     * data-integrity checks on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF</code> - No logs are published.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logLevel
     *        Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *        log group, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and
     *        performs data-integrity checks on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFF</code> - No logs are published.
     *        </p>
     *        </li>
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the log
     * group, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and performs
     * data-integrity checks on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF</code> - No logs are published.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *         log group, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *         >CloudWatchLogGroupArn</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and
     *         performs data-integrity checks on.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OFF</code> - No logs are published.
     *         </p>
     *         </li>
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the log
     * group, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and performs
     * data-integrity checks on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF</code> - No logs are published.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logLevel
     *        Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *        log group, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and
     *        performs data-integrity checks on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFF</code> - No logs are published.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public Options withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the log
     * group, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and performs
     * data-integrity checks on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF</code> - No logs are published.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logLevel
     *        Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *        log group, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC</code> - Publishes logs with only basic information (such as transfer errors).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSFER</code> - Publishes logs for all files or objects that your DataSync task transfers and
     *        performs data-integrity checks on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFF</code> - No logs are published.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public Options withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the
     * destination location or transfers all the content from the source (without comparing what's in the destination).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content from the
     * source location to the destination location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - DataSync copies everything in the source to the destination without comparing differences
     * between the locations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferMode
     *        Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *        destination location or transfers all the content from the source (without comparing what's in the
     *        destination).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content
     *        from the source location to the destination location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - DataSync copies everything in the source to the destination without comparing
     *        differences between the locations.
     *        </p>
     *        </li>
     * @see TransferMode
     */

    public void setTransferMode(String transferMode) {
        this.transferMode = transferMode;
    }

    /**
     * <p>
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the
     * destination location or transfers all the content from the source (without comparing what's in the destination).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content from the
     * source location to the destination location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - DataSync copies everything in the source to the destination without comparing differences
     * between the locations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *         destination location or transfers all the content from the source (without comparing what's in the
     *         destination).</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content
     *         from the source location to the destination location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - DataSync copies everything in the source to the destination without comparing
     *         differences between the locations.
     *         </p>
     *         </li>
     * @see TransferMode
     */

    public String getTransferMode() {
        return this.transferMode;
    }

    /**
     * <p>
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the
     * destination location or transfers all the content from the source (without comparing what's in the destination).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content from the
     * source location to the destination location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - DataSync copies everything in the source to the destination without comparing differences
     * between the locations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferMode
     *        Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *        destination location or transfers all the content from the source (without comparing what's in the
     *        destination).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content
     *        from the source location to the destination location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - DataSync copies everything in the source to the destination without comparing
     *        differences between the locations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransferMode
     */

    public Options withTransferMode(String transferMode) {
        setTransferMode(transferMode);
        return this;
    }

    /**
     * <p>
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the
     * destination location or transfers all the content from the source (without comparing what's in the destination).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content from the
     * source location to the destination location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - DataSync copies everything in the source to the destination without comparing differences
     * between the locations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferMode
     *        Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *        destination location or transfers all the content from the source (without comparing what's in the
     *        destination).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> (default) - DataSync copies only data or metadata that is new or different content
     *        from the source location to the destination location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - DataSync copies everything in the source to the destination without comparing
     *        differences between the locations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransferMode
     */

    public Options withTransferMode(TransferMode transferMode) {
        this.transferMode = transferMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which components of the SMB security descriptor are copied from source to destination objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or between two
     * FSx for Windows File Server locations. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     * metadata</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * <p>
     * DataSync won't copy NTFS system access control lists (SACLs) with this option.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SACLs, which are used by administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user with the right permissions, see required permissions for <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >SMB</a>, <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     * >FSx for Windows File Server</a>, or <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb">FSx
     * for ONTAP</a> (depending on the type of location in your transfer).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param securityDescriptorCopyFlags
     *        Specifies which components of the SMB security descriptor are copied from source to destination objects.
     *        </p>
     *        <p>
     *        This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or
     *        between two FSx for Windows File Server locations. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     *        metadata</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        <p>
     *        DataSync won't copy NTFS system access control lists (SACLs) with this option.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SACLs, which are used by administrators to log attempts to access a secured object.
     *        </p>
     *        <p>
     *        Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *        your SMB location. For information about choosing a user with the right permissions, see required
     *        permissions for <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >SMB</a>, <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     *        >FSx for Windows File Server</a>, or <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *        >FSx for ONTAP</a> (depending on the type of location in your transfer).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are
     *        owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *        on the destination server’s configuration.
     *        </p>
     *        </li>
     * @see SmbSecurityDescriptorCopyFlags
     */

    public void setSecurityDescriptorCopyFlags(String securityDescriptorCopyFlags) {
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
    }

    /**
     * <p>
     * Specifies which components of the SMB security descriptor are copied from source to destination objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or between two
     * FSx for Windows File Server locations. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     * metadata</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * <p>
     * DataSync won't copy NTFS system access control lists (SACLs) with this option.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SACLs, which are used by administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user with the right permissions, see required permissions for <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >SMB</a>, <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     * >FSx for Windows File Server</a>, or <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb">FSx
     * for ONTAP</a> (depending on the type of location in your transfer).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies which components of the SMB security descriptor are copied from source to destination objects.
     *         </p>
     *         <p>
     *         This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or
     *         between two FSx for Windows File Server locations. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     *         metadata</a>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The object owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *         </p>
     *         <p>
     *         DataSync won't copy NTFS system access control lists (SACLs) with this option.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The object owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SACLs, which are used by administrators to log attempts to access a secured object.
     *         </p>
     *         <p>
     *         Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *         your SMB location. For information about choosing a user with the right permissions, see required
     *         permissions for <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *         >SMB</a>, <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     *         >FSx for Windows File Server</a>, or <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *         >FSx for ONTAP</a> (depending on the type of location in your transfer).
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are
     *         owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *         on the destination server’s configuration.
     *         </p>
     *         </li>
     * @see SmbSecurityDescriptorCopyFlags
     */

    public String getSecurityDescriptorCopyFlags() {
        return this.securityDescriptorCopyFlags;
    }

    /**
     * <p>
     * Specifies which components of the SMB security descriptor are copied from source to destination objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or between two
     * FSx for Windows File Server locations. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     * metadata</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * <p>
     * DataSync won't copy NTFS system access control lists (SACLs) with this option.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SACLs, which are used by administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user with the right permissions, see required permissions for <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >SMB</a>, <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     * >FSx for Windows File Server</a>, or <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb">FSx
     * for ONTAP</a> (depending on the type of location in your transfer).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param securityDescriptorCopyFlags
     *        Specifies which components of the SMB security descriptor are copied from source to destination objects.
     *        </p>
     *        <p>
     *        This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or
     *        between two FSx for Windows File Server locations. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     *        metadata</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        <p>
     *        DataSync won't copy NTFS system access control lists (SACLs) with this option.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SACLs, which are used by administrators to log attempts to access a secured object.
     *        </p>
     *        <p>
     *        Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *        your SMB location. For information about choosing a user with the right permissions, see required
     *        permissions for <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >SMB</a>, <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     *        >FSx for Windows File Server</a>, or <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *        >FSx for ONTAP</a> (depending on the type of location in your transfer).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are
     *        owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *        on the destination server’s configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public Options withSecurityDescriptorCopyFlags(String securityDescriptorCopyFlags) {
        setSecurityDescriptorCopyFlags(securityDescriptorCopyFlags);
        return this;
    }

    /**
     * <p>
     * Specifies which components of the SMB security descriptor are copied from source to destination objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or between two
     * FSx for Windows File Server locations. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     * metadata</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * <p>
     * DataSync won't copy NTFS system access control lists (SACLs) with this option.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SACLs, which are used by administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user with the right permissions, see required permissions for <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >SMB</a>, <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     * >FSx for Windows File Server</a>, or <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb">FSx
     * for ONTAP</a> (depending on the type of location in your transfer).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param securityDescriptorCopyFlags
     *        Specifies which components of the SMB security descriptor are copied from source to destination objects.
     *        </p>
     *        <p>
     *        This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or
     *        between two FSx for Windows File Server locations. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     *        metadata</a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OWNER_DACL</code> (default) - For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        <p>
     *        DataSync won't copy NTFS system access control lists (SACLs) with this option.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_DACL_SACL</code> - For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SACLs, which are used by administrators to log attempts to access a secured object.
     *        </p>
     *        <p>
     *        Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *        your SMB location. For information about choosing a user with the right permissions, see required
     *        permissions for <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >SMB</a>, <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-fsx-location.html#create-fsx-windows-location-permissions"
     *        >FSx for Windows File Server</a>, or <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *        >FSx for ONTAP</a> (depending on the type of location in your transfer).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - None of the SMB security descriptor components are copied. Destination objects are
     *        owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *        on the destination server’s configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public Options withSecurityDescriptorCopyFlags(SmbSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when transferring
     * between object storage systems. If you want your DataSync task to ignore object tags, specify the
     * <code>NONE</code> value.
     * </p>
     * 
     * @param objectTags
     *        Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when
     *        transferring between object storage systems. If you want your DataSync task to ignore object tags, specify
     *        the <code>NONE</code> value.
     * @see ObjectTags
     */

    public void setObjectTags(String objectTags) {
        this.objectTags = objectTags;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when transferring
     * between object storage systems. If you want your DataSync task to ignore object tags, specify the
     * <code>NONE</code> value.
     * </p>
     * 
     * @return Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when
     *         transferring between object storage systems. If you want your DataSync task to ignore object tags,
     *         specify the <code>NONE</code> value.
     * @see ObjectTags
     */

    public String getObjectTags() {
        return this.objectTags;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when transferring
     * between object storage systems. If you want your DataSync task to ignore object tags, specify the
     * <code>NONE</code> value.
     * </p>
     * 
     * @param objectTags
     *        Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when
     *        transferring between object storage systems. If you want your DataSync task to ignore object tags, specify
     *        the <code>NONE</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectTags
     */

    public Options withObjectTags(String objectTags) {
        setObjectTags(objectTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when transferring
     * between object storage systems. If you want your DataSync task to ignore object tags, specify the
     * <code>NONE</code> value.
     * </p>
     * 
     * @param objectTags
     *        Specifies whether you want DataSync to <code>PRESERVE</code> object tags (default behavior) when
     *        transferring between object storage systems. If you want your DataSync task to ignore object tags, specify
     *        the <code>NONE</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectTags
     */

    public Options withObjectTags(ObjectTags objectTags) {
        this.objectTags = objectTags.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVerifyMode() != null)
            sb.append("VerifyMode: ").append(getVerifyMode()).append(",");
        if (getOverwriteMode() != null)
            sb.append("OverwriteMode: ").append(getOverwriteMode()).append(",");
        if (getAtime() != null)
            sb.append("Atime: ").append(getAtime()).append(",");
        if (getMtime() != null)
            sb.append("Mtime: ").append(getMtime()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getGid() != null)
            sb.append("Gid: ").append(getGid()).append(",");
        if (getPreserveDeletedFiles() != null)
            sb.append("PreserveDeletedFiles: ").append(getPreserveDeletedFiles()).append(",");
        if (getPreserveDevices() != null)
            sb.append("PreserveDevices: ").append(getPreserveDevices()).append(",");
        if (getPosixPermissions() != null)
            sb.append("PosixPermissions: ").append(getPosixPermissions()).append(",");
        if (getBytesPerSecond() != null)
            sb.append("BytesPerSecond: ").append(getBytesPerSecond()).append(",");
        if (getTaskQueueing() != null)
            sb.append("TaskQueueing: ").append(getTaskQueueing()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getTransferMode() != null)
            sb.append("TransferMode: ").append(getTransferMode()).append(",");
        if (getSecurityDescriptorCopyFlags() != null)
            sb.append("SecurityDescriptorCopyFlags: ").append(getSecurityDescriptorCopyFlags()).append(",");
        if (getObjectTags() != null)
            sb.append("ObjectTags: ").append(getObjectTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Options == false)
            return false;
        Options other = (Options) obj;
        if (other.getVerifyMode() == null ^ this.getVerifyMode() == null)
            return false;
        if (other.getVerifyMode() != null && other.getVerifyMode().equals(this.getVerifyMode()) == false)
            return false;
        if (other.getOverwriteMode() == null ^ this.getOverwriteMode() == null)
            return false;
        if (other.getOverwriteMode() != null && other.getOverwriteMode().equals(this.getOverwriteMode()) == false)
            return false;
        if (other.getAtime() == null ^ this.getAtime() == null)
            return false;
        if (other.getAtime() != null && other.getAtime().equals(this.getAtime()) == false)
            return false;
        if (other.getMtime() == null ^ this.getMtime() == null)
            return false;
        if (other.getMtime() != null && other.getMtime().equals(this.getMtime()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        if (other.getPreserveDeletedFiles() == null ^ this.getPreserveDeletedFiles() == null)
            return false;
        if (other.getPreserveDeletedFiles() != null && other.getPreserveDeletedFiles().equals(this.getPreserveDeletedFiles()) == false)
            return false;
        if (other.getPreserveDevices() == null ^ this.getPreserveDevices() == null)
            return false;
        if (other.getPreserveDevices() != null && other.getPreserveDevices().equals(this.getPreserveDevices()) == false)
            return false;
        if (other.getPosixPermissions() == null ^ this.getPosixPermissions() == null)
            return false;
        if (other.getPosixPermissions() != null && other.getPosixPermissions().equals(this.getPosixPermissions()) == false)
            return false;
        if (other.getBytesPerSecond() == null ^ this.getBytesPerSecond() == null)
            return false;
        if (other.getBytesPerSecond() != null && other.getBytesPerSecond().equals(this.getBytesPerSecond()) == false)
            return false;
        if (other.getTaskQueueing() == null ^ this.getTaskQueueing() == null)
            return false;
        if (other.getTaskQueueing() != null && other.getTaskQueueing().equals(this.getTaskQueueing()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getTransferMode() == null ^ this.getTransferMode() == null)
            return false;
        if (other.getTransferMode() != null && other.getTransferMode().equals(this.getTransferMode()) == false)
            return false;
        if (other.getSecurityDescriptorCopyFlags() == null ^ this.getSecurityDescriptorCopyFlags() == null)
            return false;
        if (other.getSecurityDescriptorCopyFlags() != null && other.getSecurityDescriptorCopyFlags().equals(this.getSecurityDescriptorCopyFlags()) == false)
            return false;
        if (other.getObjectTags() == null ^ this.getObjectTags() == null)
            return false;
        if (other.getObjectTags() != null && other.getObjectTags().equals(this.getObjectTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifyMode() == null) ? 0 : getVerifyMode().hashCode());
        hashCode = prime * hashCode + ((getOverwriteMode() == null) ? 0 : getOverwriteMode().hashCode());
        hashCode = prime * hashCode + ((getAtime() == null) ? 0 : getAtime().hashCode());
        hashCode = prime * hashCode + ((getMtime() == null) ? 0 : getMtime().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        hashCode = prime * hashCode + ((getPreserveDeletedFiles() == null) ? 0 : getPreserveDeletedFiles().hashCode());
        hashCode = prime * hashCode + ((getPreserveDevices() == null) ? 0 : getPreserveDevices().hashCode());
        hashCode = prime * hashCode + ((getPosixPermissions() == null) ? 0 : getPosixPermissions().hashCode());
        hashCode = prime * hashCode + ((getBytesPerSecond() == null) ? 0 : getBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getTaskQueueing() == null) ? 0 : getTaskQueueing().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getTransferMode() == null) ? 0 : getTransferMode().hashCode());
        hashCode = prime * hashCode + ((getSecurityDescriptorCopyFlags() == null) ? 0 : getSecurityDescriptorCopyFlags().hashCode());
        hashCode = prime * hashCode + ((getObjectTags() == null) ? 0 : getObjectTags().hashCode());
        return hashCode;
    }

    @Override
    public Options clone() {
        try {
            return (Options) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.OptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
