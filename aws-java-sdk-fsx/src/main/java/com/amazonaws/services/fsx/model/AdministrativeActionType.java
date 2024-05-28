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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * Describes the type of administrative action, as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated from the Amazon FSx console,
 * API (<code>UpdateFileSystem</code>), or CLI (<code>update-file-system</code>).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>THROUGHPUT_OPTIMIZATION</code> - After the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's
 * throughput capacity has been completed successfully, a <code>THROUGHPUT_OPTIMIZATION</code> task starts.
 * </p>
 * <p>
 * You can track the storage-optimization progress using the <code>ProgressPercent</code> property. When
 * <code>THROUGHPUT_OPTIMIZATION</code> has been completed successfully, the parent <code>FILE_SYSTEM_UPDATE</code>
 * action status changes to <code>COMPLETED</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing throughput
 * capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>STORAGE_OPTIMIZATION</code> - After the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's
 * storage capacity has been completed successfully, a <code>STORAGE_OPTIMIZATION</code> task starts.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For Windows and ONTAP, storage optimization is the process of migrating the file system data to newer larger disks.
 * </p>
 * </li>
 * <li>
 * <p>
 * For Lustre, storage optimization consists of rebalancing the data across the existing and newly added file servers.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can track the storage-optimization progress using the <code>ProgressPercent</code> property. When
 * <code>STORAGE_OPTIMIZATION</code> has been completed successfully, the parent <code>FILE_SYSTEM_UPDATE</code> action
 * status changes to <code>COMPLETED</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
 * capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>, <a
 * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage
 * capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>, and <a
 * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage capacity and
 * provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FILE_SYSTEM_ALIAS_ASSOCIATION</code> - A file system update to associate a new Domain Name System (DNS) alias
 * with the file system. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_AssociateFileSystemAliases.html">
 * AssociateFileSystemAliases</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FILE_SYSTEM_ALIAS_DISASSOCIATION</code> - A file system update to disassociate a DNS alias from the file
 * system. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DisassociateFileSystemAliases.html"
 * >DisassociateFileSystemAliases</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IOPS_OPTIMIZATION</code> - After the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's
 * throughput capacity has been completed successfully, a <code>IOPS_OPTIMIZATION</code> task starts.
 * </p>
 * <p>
 * You can track the storage-optimization progress using the <code>ProgressPercent</code> property. When
 * <code>IOPS_OPTIMIZATION</code> has been completed successfully, the parent <code>FILE_SYSTEM_UPDATE</code> action
 * status changes to <code>COMPLETED</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-provisioned-ssd-iops.html">Managing provisioned
 * SSD IOPS</a> in the Amazon FSx for Windows File Server User Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>STORAGE_TYPE_OPTIMIZATION</code> - After the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's
 * throughput capacity has been completed successfully, a <code>STORAGE_TYPE_OPTIMIZATION</code> task starts.
 * </p>
 * <p>
 * You can track the storage-optimization progress using the <code>ProgressPercent</code> property. When
 * <code>STORAGE_TYPE_OPTIMIZATION</code> has been completed successfully, the parent <code>FILE_SYSTEM_UPDATE</code>
 * action status changes to <code>COMPLETED</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>VOLUME_UPDATE</code> - A volume update to an Amazon FSx for OpenZFS volume initiated from the Amazon FSx
 * console, API (<code>UpdateVolume</code>), or CLI (<code>update-volume</code>).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>VOLUME_RESTORE</code> - An Amazon FSx for OpenZFS volume is returned to the state saved by the specified
 * snapshot, initiated from an API (<code>RestoreVolumeFromSnapshot</code>) or CLI (
 * <code>restore-volume-from-snapshot</code>).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SNAPSHOT_UPDATE</code> - A snapshot update to an Amazon FSx for OpenZFS volume initiated from the Amazon FSx
 * console, API (<code>UpdateSnapshot</code>), or CLI (<code>update-snapshot</code>).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RELEASE_NFS_V3_LOCKS</code> - Tracks the release of Network File System (NFS) V3 locks on an Amazon FSx for
 * OpenZFS file system.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>VOLUME_INITIALIZE_WITH_SNAPSHOT</code> - A volume is being created from a snapshot on a different FSx for
 * OpenZFS file system. You can initiate this from the Amazon FSx console, API (<code>CreateVolume</code>), or CLI (
 * <code>create-volume</code>) when using the using the <code>FULL_COPY</code> strategy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>VOLUME_UPDATE_WITH_SNAPSHOT</code> - A volume is being updated from a snapshot on a different FSx for OpenZFS
 * file system. You can initiate this from the Amazon FSx console, API (<code>CopySnapshotAndUpdateVolume</code>), or
 * CLI (<code>copy-snapshot-and-update-volume</code>).
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AdministrativeActionType {

    FILE_SYSTEM_UPDATE("FILE_SYSTEM_UPDATE"),
    STORAGE_OPTIMIZATION("STORAGE_OPTIMIZATION"),
    FILE_SYSTEM_ALIAS_ASSOCIATION("FILE_SYSTEM_ALIAS_ASSOCIATION"),
    FILE_SYSTEM_ALIAS_DISASSOCIATION("FILE_SYSTEM_ALIAS_DISASSOCIATION"),
    VOLUME_UPDATE("VOLUME_UPDATE"),
    SNAPSHOT_UPDATE("SNAPSHOT_UPDATE"),
    RELEASE_NFS_V3_LOCKS("RELEASE_NFS_V3_LOCKS"),
    VOLUME_RESTORE("VOLUME_RESTORE"),
    THROUGHPUT_OPTIMIZATION("THROUGHPUT_OPTIMIZATION"),
    IOPS_OPTIMIZATION("IOPS_OPTIMIZATION"),
    STORAGE_TYPE_OPTIMIZATION("STORAGE_TYPE_OPTIMIZATION"),
    MISCONFIGURED_STATE_RECOVERY("MISCONFIGURED_STATE_RECOVERY"),
    VOLUME_UPDATE_WITH_SNAPSHOT("VOLUME_UPDATE_WITH_SNAPSHOT"),
    VOLUME_INITIALIZE_WITH_SNAPSHOT("VOLUME_INITIALIZE_WITH_SNAPSHOT");

    private String value;

    private AdministrativeActionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return AdministrativeActionType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AdministrativeActionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AdministrativeActionType enumEntry : AdministrativeActionType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
