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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures your DataSync task settings. These options include how DataSync handles files, objects, and their
 * associated metadata. You also can specify how DataSync verifies data integrity, set bandwidth limits for your task,
 * among other options.
 * </p>
 * <p>
 * Each task setting has a default value. Unless you need to, you don't have to configure any of these
 * <code>Options</code> before starting your task.
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
     * <p>
     * Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     * </p>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     * destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     */
    private String verifyMode;
    /**
     * <p>
     * Specifies whether data at the destination location should be overwritten or preserved. If set to
     * <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the destination
     * file differs from the source file). If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     */
    private String overwriteMode;
    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     * <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     * execution).
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <p>
     * Default value: <code>BEST_EFFORT</code>
     * </p>
     * <p>
     * <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Atime</code>.
     * </p>
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
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Mtime</code>.
     * </p>
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
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     */
    private String gid;
    /**
     * <p>
     * Specifies whether files in the destination location that don't exist in the source should be preserved. This
     * option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum storage
     * duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Ignore such destination files (recommended).
     * </p>
     * <p>
     * <code>REMOVE</code>: Delete destination files that aren’t present in the source.
     * </p>
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
     * <p>
     * Default value: <code>NONE</code>
     * </p>
     * <p>
     * <code>NONE</code>: Ignore special devices (recommended).
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
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
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore permissions.
     * </p>
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
     * Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>, which
     * means the tasks will be queued.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
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
     * <p>
     * If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs on
     * errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or object that is
     * transferred and integrity checked.
     * </p>
     */
    private String logLevel;
    /**
     * <p>
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the
     * destination location or transfers all the content from the source (without comparing what's in the destination).
     * </p>
     * <p>
     * <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the source
     * location to the destination location.
     * </p>
     * <p>
     * <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's in the
     * destination).
     * </p>
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
     * <p>
     * Default value: <code>OWNER_DACL</code>
     * </p>
     * <p>
     * <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     * <p>
     * <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     */
    private String securityDescriptorCopyFlags;
    /**
     * <p>
     * Specifies whether object tags are preserved when transferring between object storage systems. If you want your
     * DataSync task to ignore object tags, specify the <code>NONE</code> value.
     * </p>
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     */
    private String objectTags;

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <p>
     * Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     * </p>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     * destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @param verifyMode
     *        Specifies how and when DataSync checks the integrity of your data during a transfer. </p>
     *        <p>
     *        Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     *        </p>
     *        <p>
     *        <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files
     *        and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *        the checksum calculated on those files at the destination.
     *        </p>
     *        <p>
     *        We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        <p>
     *        <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     *        destination to verify that both locations are fully synchronized.
     *        </p>
     *        <p>
     *        You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        <p>
     *        <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     *        transmissions are still integrity-checked with checksum verification during the transfer.
     * @see VerifyMode
     */

    public void setVerifyMode(String verifyMode) {
        this.verifyMode = verifyMode;
    }

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <p>
     * Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     * </p>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     * destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @return Specifies how and when DataSync checks the integrity of your data during a transfer. </p>
     *         <p>
     *         Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     *         </p>
     *         <p>
     *         <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files
     *         and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *         the checksum calculated on those files at the destination.
     *         </p>
     *         <p>
     *         We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *         storage classes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Storage class considerations with Amazon S3 locations</a>.
     *         </p>
     *         <p>
     *         <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     *         destination to verify that both locations are fully synchronized.
     *         </p>
     *         <p>
     *         You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *         storage classes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Storage class considerations with Amazon S3 locations</a>.
     *         </p>
     *         <p>
     *         <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     *         transmissions are still integrity-checked with checksum verification during the transfer.
     * @see VerifyMode
     */

    public String getVerifyMode() {
        return this.verifyMode;
    }

    /**
     * <p>
     * Specifies how and when DataSync checks the integrity of your data during a transfer.
     * </p>
     * <p>
     * Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     * </p>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     * destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @param verifyMode
     *        Specifies how and when DataSync checks the integrity of your data during a transfer. </p>
     *        <p>
     *        Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     *        </p>
     *        <p>
     *        <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files
     *        and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *        the checksum calculated on those files at the destination.
     *        </p>
     *        <p>
     *        We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        <p>
     *        <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     *        destination to verify that both locations are fully synchronized.
     *        </p>
     *        <p>
     *        You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        <p>
     *        <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     *        transmissions are still integrity-checked with checksum verification during the transfer.
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
     * <p>
     * Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     * </p>
     * <p>
     * <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files and
     * metadata at the source location. At the end of the transfer, DataSync then compares this checksum to the checksum
     * calculated on those files at the destination.
     * </p>
     * <p>
     * We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     * destination to verify that both locations are fully synchronized.
     * </p>
     * <p>
     * You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage
     * classes. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 locations</a>.
     * </p>
     * <p>
     * <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     * transmissions are still integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @param verifyMode
     *        Specifies how and when DataSync checks the integrity of your data during a transfer. </p>
     *        <p>
     *        Default value: <code>POINT_IN_TIME_CONSISTENT</code>
     *        </p>
     *        <p>
     *        <code>ONLY_FILES_TRANSFERRED</code> (recommended): DataSync calculates the checksum of transferred files
     *        and metadata at the source location. At the end of the transfer, DataSync then compares this checksum to
     *        the checksum calculated on those files at the destination.
     *        </p>
     *        <p>
     *        We recommend this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        <p>
     *        <code>POINT_IN_TIME_CONSISTENT</code>: At the end of the transfer, DataSync scans the entire source and
     *        destination to verify that both locations are fully synchronized.
     *        </p>
     *        <p>
     *        You can't use this option when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive
     *        storage classes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 locations</a>.
     *        </p>
     *        <p>
     *        <code>NONE</code>: DataSync doesn't run additional verification at the end of the transfer. All data
     *        transmissions are still integrity-checked with checksum verification during the transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifyMode
     */

    public Options withVerifyMode(VerifyMode verifyMode) {
        this.verifyMode = verifyMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether data at the destination location should be overwritten or preserved. If set to
     * <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the destination
     * file differs from the source file). If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * 
     * @param overwriteMode
     *        Specifies whether data at the destination location should be overwritten or preserved. If set to
     *        <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the
     *        destination file differs from the source file). If you modify files in the destination and you sync the
     *        files, you can use this value to protect against overwriting those changes. </p>
     *        <p>
     *        Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * @see OverwriteMode
     */

    public void setOverwriteMode(String overwriteMode) {
        this.overwriteMode = overwriteMode;
    }

    /**
     * <p>
     * Specifies whether data at the destination location should be overwritten or preserved. If set to
     * <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the destination
     * file differs from the source file). If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * 
     * @return Specifies whether data at the destination location should be overwritten or preserved. If set to
     *         <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the
     *         destination file differs from the source file). If you modify files in the destination and you sync the
     *         files, you can use this value to protect against overwriting those changes. </p>
     *         <p>
     *         Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * @see OverwriteMode
     */

    public String getOverwriteMode() {
        return this.overwriteMode;
    }

    /**
     * <p>
     * Specifies whether data at the destination location should be overwritten or preserved. If set to
     * <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the destination
     * file differs from the source file). If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * 
     * @param overwriteMode
     *        Specifies whether data at the destination location should be overwritten or preserved. If set to
     *        <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the
     *        destination file differs from the source file). If you modify files in the destination and you sync the
     *        files, you can use this value to protect against overwriting those changes. </p>
     *        <p>
     *        Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteMode
     */

    public Options withOverwriteMode(String overwriteMode) {
        setOverwriteMode(overwriteMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether data at the destination location should be overwritten or preserved. If set to
     * <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the destination
     * file differs from the source file). If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * 
     * @param overwriteMode
     *        Specifies whether data at the destination location should be overwritten or preserved. If set to
     *        <code>NEVER</code>, a destination file for example will not be replaced by a source file (even if the
     *        destination file differs from the source file). If you modify files in the destination and you sync the
     *        files, you can use this value to protect against overwriting those changes. </p>
     *        <p>
     *        Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For detailed
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteMode
     */

    public Options withOverwriteMode(OverwriteMode overwriteMode) {
        this.overwriteMode = overwriteMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     * <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     * execution).
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <p>
     * Default value: <code>BEST_EFFORT</code>
     * </p>
     * <p>
     * <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Atime</code>.
     * </p>
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
     *        Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     *        <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original
     *        <code>Atime</code> attribute on all source files (that is, the version before the <code>PREPARING</code>
     *        phase of the task execution).</p> <note>
     *        <p>
     *        The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *        a best-effort basis.
     *        </p>
     *        </note>
     *        <p>
     *        Default value: <code>BEST_EFFORT</code>
     *        </p>
     *        <p>
     *        <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore <code>Atime</code>.
     *        </p>
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
     * Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     * <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     * execution).
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <p>
     * Default value: <code>BEST_EFFORT</code>
     * </p>
     * <p>
     * <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Atime</code>.
     * </p>
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
     * @return Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     *         <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original
     *         <code>Atime</code> attribute on all source files (that is, the version before the <code>PREPARING</code>
     *         phase of the task execution).</p> <note>
     *         <p>
     *         The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *         a best-effort basis.
     *         </p>
     *         </note>
     *         <p>
     *         Default value: <code>BEST_EFFORT</code>
     *         </p>
     *         <p>
     *         <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *         </p>
     *         <p>
     *         <code>NONE</code>: Ignore <code>Atime</code>.
     *         </p>
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
     * Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     * <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     * execution).
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <p>
     * Default value: <code>BEST_EFFORT</code>
     * </p>
     * <p>
     * <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Atime</code>.
     * </p>
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
     *        Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     *        <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original
     *        <code>Atime</code> attribute on all source files (that is, the version before the <code>PREPARING</code>
     *        phase of the task execution).</p> <note>
     *        <p>
     *        The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *        a best-effort basis.
     *        </p>
     *        </note>
     *        <p>
     *        Default value: <code>BEST_EFFORT</code>
     *        </p>
     *        <p>
     *        <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore <code>Atime</code>.
     *        </p>
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
     * Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     * <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the <code>PREPARING</code> phase of the task
     * execution).
     * </p>
     * <note>
     * <p>
     * The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on a
     * best-effort basis.
     * </p>
     * </note>
     * <p>
     * Default value: <code>BEST_EFFORT</code>
     * </p>
     * <p>
     * <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Atime</code>.
     * </p>
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
     *        Specifies whether to preserve metadata indicating the last time a file was read or written to. If you set
     *        <code>Atime</code> to <code>BEST_EFFORT</code>, DataSync attempts to preserve the original
     *        <code>Atime</code> attribute on all source files (that is, the version before the <code>PREPARING</code>
     *        phase of the task execution).</p> <note>
     *        <p>
     *        The behavior of <code>Atime</code> isn't fully standard across platforms, so DataSync can only do this on
     *        a best-effort basis.
     *        </p>
     *        </note>
     *        <p>
     *        Default value: <code>BEST_EFFORT</code>
     *        </p>
     *        <p>
     *        <code>BEST_EFFORT</code>: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore <code>Atime</code>.
     *        </p>
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
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Mtime</code>.
     * </p>
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
     *        <p>
     *        Default Value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore <code>Mtime</code>.
     *        </p>
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
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Mtime</code>.
     * </p>
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
     *         <p>
     *         Default Value: <code>PRESERVE</code>
     *         </p>
     *         <p>
     *         <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     *         </p>
     *         <p>
     *         <code>NONE</code>: Ignore <code>Mtime</code>.
     *         </p>
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
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Mtime</code>.
     * </p>
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
     *        <p>
     *        Default Value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore <code>Mtime</code>.
     *        </p>
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
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * <code>NONE</code>: Ignore <code>Mtime</code>.
     * </p>
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
     *        <p>
     *        Default Value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve original <code>Mtime</code> (recommended)
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore <code>Mtime</code>.
     *        </p>
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
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @param uid
     *        Specifies the POSIX user ID (UID) of the file's owner.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <p>
     *        Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore UID and GID.
     * @see Uid
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @return Specifies the POSIX user ID (UID) of the file's owner.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         copied by DataSync</a>.
     *         </p>
     *         <p>
     *         Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *         </p>
     *         <p>
     *         <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     *         </p>
     *         <p>
     *         <code>NONE</code>: Ignore UID and GID.
     * @see Uid
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * Specifies the POSIX user ID (UID) of the file's owner.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @param uid
     *        Specifies the POSIX user ID (UID) of the file's owner.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <p>
     *        Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore UID and GID.
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
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @param uid
     *        Specifies the POSIX user ID (UID) of the file's owner.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <p>
     *        Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        <code>INT_VALUE</code>: Preserve the integer value of UID and group ID (GID) (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore UID and GID.
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
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @param gid
     *        Specifies the POSIX group ID (GID) of the file's owners.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <p>
     *        Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore UID and GID.
     * @see Gid
     */

    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @return Specifies the POSIX group ID (GID) of the file's owners.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         copied by DataSync</a>.
     *         </p>
     *         <p>
     *         Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *         </p>
     *         <p>
     *         <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     *         </p>
     *         <p>
     *         <code>NONE</code>: Ignore UID and GID.
     * @see Gid
     */

    public String getGid() {
        return this.gid;
    }

    /**
     * <p>
     * Specifies the POSIX group ID (GID) of the file's owners.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @param gid
     *        Specifies the POSIX group ID (GID) of the file's owners.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <p>
     *        Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore UID and GID.
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
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     * </p>
     * <p>
     * <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore UID and GID.
     * </p>
     * 
     * @param gid
     *        Specifies the POSIX group ID (GID) of the file's owners.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        copied by DataSync</a>.
     *        </p>
     *        <p>
     *        Default value: <code>INT_VALUE</code>. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        <code>INT_VALUE</code>: Preserve the integer value of user ID (UID) and GID (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore UID and GID.
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
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Ignore such destination files (recommended).
     * </p>
     * <p>
     * <code>REMOVE</code>: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @param preserveDeletedFiles
     *        Specifies whether files in the destination location that don't exist in the source should be preserved.
     *        This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *        storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a>.</p>
     *        <p>
     *        Default value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Ignore such destination files (recommended).
     *        </p>
     *        <p>
     *        <code>REMOVE</code>: Delete destination files that aren’t present in the source.
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
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Ignore such destination files (recommended).
     * </p>
     * <p>
     * <code>REMOVE</code>: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @return Specifies whether files in the destination location that don't exist in the source should be preserved.
     *         This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *         storage duration charges for certain storage classes. For detailed information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Considerations when working with Amazon S3 storage classes in DataSync </a>.</p>
     *         <p>
     *         Default value: <code>PRESERVE</code>
     *         </p>
     *         <p>
     *         <code>PRESERVE</code>: Ignore such destination files (recommended).
     *         </p>
     *         <p>
     *         <code>REMOVE</code>: Delete destination files that aren’t present in the source.
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
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Ignore such destination files (recommended).
     * </p>
     * <p>
     * <code>REMOVE</code>: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @param preserveDeletedFiles
     *        Specifies whether files in the destination location that don't exist in the source should be preserved.
     *        This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *        storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a>.</p>
     *        <p>
     *        Default value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Ignore such destination files (recommended).
     *        </p>
     *        <p>
     *        <code>REMOVE</code>: Delete destination files that aren’t present in the source.
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
     * >Considerations when working with Amazon S3 storage classes in DataSync </a>.
     * </p>
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Ignore such destination files (recommended).
     * </p>
     * <p>
     * <code>REMOVE</code>: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @param preserveDeletedFiles
     *        Specifies whether files in the destination location that don't exist in the source should be preserved.
     *        This option can affect your Amazon S3 storage cost. If your task deletes objects, you might incur minimum
     *        storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a>.</p>
     *        <p>
     *        Default value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Ignore such destination files (recommended).
     *        </p>
     *        <p>
     *        <code>REMOVE</code>: Delete destination files that aren’t present in the source.
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
     * <p>
     * Default value: <code>NONE</code>
     * </p>
     * <p>
     * <code>NONE</code>: Ignore special devices (recommended).
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
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
     *        <p>
     *        Default value: <code>NONE</code>
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore special devices (recommended).
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported
     *        for Amazon EFS.
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
     * <p>
     * Default value: <code>NONE</code>
     * </p>
     * <p>
     * <code>NONE</code>: Ignore special devices (recommended).
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
     * 
     * @return Specifies whether DataSync should preserve the metadata of block and character devices in the source
     *         location and recreate the files with that device name and metadata on the destination. DataSync copies
     *         only the name and metadata of such devices.</p> <note>
     *         <p>
     *         DataSync can't copy the actual contents of these devices because they're nonterminal and don't return an
     *         end-of-file (EOF) marker.
     *         </p>
     *         </note>
     *         <p>
     *         Default value: <code>NONE</code>
     *         </p>
     *         <p>
     *         <code>NONE</code>: Ignore special devices (recommended).
     *         </p>
     *         <p>
     *         <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't
     *         supported for Amazon EFS.
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
     * <p>
     * Default value: <code>NONE</code>
     * </p>
     * <p>
     * <code>NONE</code>: Ignore special devices (recommended).
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
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
     *        <p>
     *        Default value: <code>NONE</code>
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore special devices (recommended).
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported
     *        for Amazon EFS.
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
     * <p>
     * Default value: <code>NONE</code>
     * </p>
     * <p>
     * <code>NONE</code>: Ignore special devices (recommended).
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported for
     * Amazon EFS.
     * </p>
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
     *        <p>
     *        Default value: <code>NONE</code>
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore special devices (recommended).
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve character and block device metadata. This option currently isn't supported
     *        for Amazon EFS.
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
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore permissions.
     * </p>
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
     *        <p>
     *        Default value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore permissions.
     *        </p>
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
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore permissions.
     * </p>
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
     *         <p>
     *         Default value: <code>PRESERVE</code>
     *         </p>
     *         <p>
     *         <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     *         </p>
     *         <p>
     *         <code>NONE</code>: Ignore permissions.
     *         </p>
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
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore permissions.
     * </p>
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
     *        <p>
     *        Default value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore permissions.
     *        </p>
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
     * <p>
     * Default value: <code>PRESERVE</code>
     * </p>
     * <p>
     * <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * <code>NONE</code>: Ignore permissions.
     * </p>
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
     *        <p>
     *        Default value: <code>PRESERVE</code>
     *        </p>
     *        <p>
     *        <code>PRESERVE</code>: Preserve POSIX-style permissions (recommended).
     *        </p>
     *        <p>
     *        <code>NONE</code>: Ignore permissions.
     *        </p>
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
     * Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>, which
     * means the tasks will be queued.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @param taskQueueing
     *        Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>,
     *        which means the tasks will be queued.</p>
     *        <p>
     *        If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *        task executions</a>.
     * @see TaskQueueing
     */

    public void setTaskQueueing(String taskQueueing) {
        this.taskQueueing = taskQueueing;
    }

    /**
     * <p>
     * Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>, which
     * means the tasks will be queued.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @return Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>,
     *         which means the tasks will be queued.</p>
     *         <p>
     *         If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *         task executions</a>.
     * @see TaskQueueing
     */

    public String getTaskQueueing() {
        return this.taskQueueing;
    }

    /**
     * <p>
     * Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>, which
     * means the tasks will be queued.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @param taskQueueing
     *        Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>,
     *        which means the tasks will be queued.</p>
     *        <p>
     *        If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *        task executions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskQueueing
     */

    public Options withTaskQueueing(String taskQueueing) {
        setTaskQueueing(taskQueueing);
        return this;
    }

    /**
     * <p>
     * Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>, which
     * means the tasks will be queued.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @param taskQueueing
     *        Specifies whether tasks should be queued before executing the tasks. The default is <code>ENABLED</code>,
     *        which means the tasks will be queued.</p>
     *        <p>
     *        If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *        task executions</a>.
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
     * <p>
     * If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs on
     * errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or object that is
     * transferred and integrity checked.
     * </p>
     * 
     * @param logLevel
     *        Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *        log group, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>.</p>
     *        <p>
     *        If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes
     *        logs on errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or
     *        object that is transferred and integrity checked.
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
     * <p>
     * If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs on
     * errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or object that is
     * transferred and integrity checked.
     * </p>
     * 
     * @return Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *         log group, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *         >CloudWatchLogGroupArn</a>.</p>
     *         <p>
     *         If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes
     *         logs on errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or
     *         object that is transferred and integrity checked.
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
     * <p>
     * If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs on
     * errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or object that is
     * transferred and integrity checked.
     * </p>
     * 
     * @param logLevel
     *        Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *        log group, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>.</p>
     *        <p>
     *        If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes
     *        logs on errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or
     *        object that is transferred and integrity checked.
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
     * <p>
     * If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs on
     * errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or object that is
     * transferred and integrity checked.
     * </p>
     * 
     * @param logLevel
     *        Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs log group. To specify the
     *        log group, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>.</p>
     *        <p>
     *        If you set <code>LogLevel</code> to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes
     *        logs on errors for individual files transferred. <code>TRANSFER</code> publishes logs for every file or
     *        object that is transferred and integrity checked.
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
     * <p>
     * <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the source
     * location to the destination location.
     * </p>
     * <p>
     * <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's in the
     * destination).
     * </p>
     * 
     * @param transferMode
     *        Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *        destination location or transfers all the content from the source (without comparing what's in the
     *        destination).</p>
     *        <p>
     *        <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the
     *        source location to the destination location.
     *        </p>
     *        <p>
     *        <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's
     *        in the destination).
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
     * <p>
     * <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the source
     * location to the destination location.
     * </p>
     * <p>
     * <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's in the
     * destination).
     * </p>
     * 
     * @return Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *         destination location or transfers all the content from the source (without comparing what's in the
     *         destination).</p>
     *         <p>
     *         <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the
     *         source location to the destination location.
     *         </p>
     *         <p>
     *         <code>ALL</code>: DataSync copies all source location content to the destination (without comparing
     *         what's in the destination).
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
     * <p>
     * <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the source
     * location to the destination location.
     * </p>
     * <p>
     * <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's in the
     * destination).
     * </p>
     * 
     * @param transferMode
     *        Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *        destination location or transfers all the content from the source (without comparing what's in the
     *        destination).</p>
     *        <p>
     *        <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the
     *        source location to the destination location.
     *        </p>
     *        <p>
     *        <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's
     *        in the destination).
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
     * <p>
     * <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the source
     * location to the destination location.
     * </p>
     * <p>
     * <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's in the
     * destination).
     * </p>
     * 
     * @param transferMode
     *        Determines whether DataSync transfers only the data and metadata that differ between the source and the
     *        destination location or transfers all the content from the source (without comparing what's in the
     *        destination).</p>
     *        <p>
     *        <code>CHANGED</code>: DataSync copies only data or metadata that is new or different content from the
     *        source location to the destination location.
     *        </p>
     *        <p>
     *        <code>ALL</code>: DataSync copies all source location content to the destination (without comparing what's
     *        in the destination).
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
     * <p>
     * Default value: <code>OWNER_DACL</code>
     * </p>
     * <p>
     * <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     * <p>
     * <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
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
     *        <p>
     *        Default value: <code>OWNER_DACL</code>
     *        </p>
     *        <p>
     *        <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     *        <p>
     *        <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     *        your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *        folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are
     *        owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *        on the destination server’s configuration.
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
     * <p>
     * Default value: <code>OWNER_DACL</code>
     * </p>
     * <p>
     * <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     * <p>
     * <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
     * 
     * @return Specifies which components of the SMB security descriptor are copied from source to destination objects.
     *         </p>
     *         <p>
     *         This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations or
     *         between two FSx for Windows File Server locations. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">how DataSync handles
     *         metadata</a>.
     *         </p>
     *         <p>
     *         Default value: <code>OWNER_DACL</code>
     *         </p>
     *         <p>
     *         <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     *         <p>
     *         <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     *         your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *         folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are
     *         owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *         on the destination server’s configuration.
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
     * <p>
     * Default value: <code>OWNER_DACL</code>
     * </p>
     * <p>
     * <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     * <p>
     * <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
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
     *        <p>
     *        Default value: <code>OWNER_DACL</code>
     *        </p>
     *        <p>
     *        <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     *        <p>
     *        <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     *        your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *        folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are
     *        owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *        on the destination server’s configuration.
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
     * <p>
     * Default value: <code>OWNER_DACL</code>
     * </p>
     * <p>
     * <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     * <p>
     * <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are owned by
     * the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     * destination server’s configuration.
     * </p>
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
     *        <p>
     *        Default value: <code>OWNER_DACL</code>
     *        </p>
     *        <p>
     *        <code>OWNER_DACL</code>: For each copied object, DataSync copies the following metadata:
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
     *        <p>
     *        <code>OWNER_DACL_SACL</code>: For each copied object, DataSync copies the following metadata:
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
     *        your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *        folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NONE</code>: None of the SMB security descriptor components are copied. Destination objects are
     *        owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based
     *        on the destination server’s configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public Options withSecurityDescriptorCopyFlags(SmbSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether object tags are preserved when transferring between object storage systems. If you want your
     * DataSync task to ignore object tags, specify the <code>NONE</code> value.
     * </p>
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * 
     * @param objectTags
     *        Specifies whether object tags are preserved when transferring between object storage systems. If you want
     *        your DataSync task to ignore object tags, specify the <code>NONE</code> value.</p>
     *        <p>
     *        Default Value: <code>PRESERVE</code>
     * @see ObjectTags
     */

    public void setObjectTags(String objectTags) {
        this.objectTags = objectTags;
    }

    /**
     * <p>
     * Specifies whether object tags are preserved when transferring between object storage systems. If you want your
     * DataSync task to ignore object tags, specify the <code>NONE</code> value.
     * </p>
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * 
     * @return Specifies whether object tags are preserved when transferring between object storage systems. If you want
     *         your DataSync task to ignore object tags, specify the <code>NONE</code> value.</p>
     *         <p>
     *         Default Value: <code>PRESERVE</code>
     * @see ObjectTags
     */

    public String getObjectTags() {
        return this.objectTags;
    }

    /**
     * <p>
     * Specifies whether object tags are preserved when transferring between object storage systems. If you want your
     * DataSync task to ignore object tags, specify the <code>NONE</code> value.
     * </p>
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * 
     * @param objectTags
     *        Specifies whether object tags are preserved when transferring between object storage systems. If you want
     *        your DataSync task to ignore object tags, specify the <code>NONE</code> value.</p>
     *        <p>
     *        Default Value: <code>PRESERVE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectTags
     */

    public Options withObjectTags(String objectTags) {
        setObjectTags(objectTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether object tags are preserved when transferring between object storage systems. If you want your
     * DataSync task to ignore object tags, specify the <code>NONE</code> value.
     * </p>
     * <p>
     * Default Value: <code>PRESERVE</code>
     * </p>
     * 
     * @param objectTags
     *        Specifies whether object tags are preserved when transferring between object storage systems. If you want
     *        your DataSync task to ignore object tags, specify the <code>NONE</code> value.</p>
     *        <p>
     *        Default Value: <code>PRESERVE</code>
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
