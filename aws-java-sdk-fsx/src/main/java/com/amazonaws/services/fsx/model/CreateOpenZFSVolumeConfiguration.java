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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration of the Amazon FSx for OpenZFS volume that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateOpenZFSVolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOpenZFSVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the volume to use as the parent volume of the volume that you are creating.
     * </p>
     */
    private String parentVolumeId;
    /**
     * <p>
     * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     * <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the parent
     * volume will always be available for the volume. You can't reserve more storage than the parent volume has. To
     * <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or <code>-1</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     */
    private Integer storageCapacityReservationGiB;
    /**
     * <p>
     * Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger than the
     * storage on the parent volume. A volume quota limits the amount of storage that the volume can consume to the
     * configured amount, but does not guarantee the space will be available on the parent volume. To guarantee quota
     * space, you must also set <code>StorageCapacityReservationGiB</code>. To <i>not</i> specify a storage capacity
     * quota, set this to <code>-1</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     */
    private Integer storageCapacityQuotaGiB;
    /**
     * <p>
     * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4, 8, 16,
     * 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting for the
     * majority of use cases. Generally, workloads that write in fixed small or large record sizes may benefit from
     * setting a custom record size, like database workloads (small record size) or media streaming workloads (large
     * record size). For additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS Record
     * size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     */
    private Integer recordSizeKiB;
    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. ZSTD
     * compression provides a higher level of data compression and higher read throughput performance than LZ4
     * compression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     * provides a lower level of compression and higher write throughput performance than ZSTD compression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about volume compression types and the performance of your Amazon FSx for OpenZFS file
     * system, see <a href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs">
     * Tips for maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     * Guide</i>.
     * </p>
     */
    private String dataCompressionType;
    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToSnapshots;
    /**
     * <p>
     * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     * </p>
     */
    private CreateOpenZFSOriginSnapshotConfiguration originSnapshot;
    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     */
    private java.util.List<OpenZFSNfsExport> nfsExports;
    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     */
    private java.util.List<OpenZFSUserOrGroupQuota> userAndGroupQuotas;

    /**
     * <p>
     * The ID of the volume to use as the parent volume of the volume that you are creating.
     * </p>
     * 
     * @param parentVolumeId
     *        The ID of the volume to use as the parent volume of the volume that you are creating.
     */

    public void setParentVolumeId(String parentVolumeId) {
        this.parentVolumeId = parentVolumeId;
    }

    /**
     * <p>
     * The ID of the volume to use as the parent volume of the volume that you are creating.
     * </p>
     * 
     * @return The ID of the volume to use as the parent volume of the volume that you are creating.
     */

    public String getParentVolumeId() {
        return this.parentVolumeId;
    }

    /**
     * <p>
     * The ID of the volume to use as the parent volume of the volume that you are creating.
     * </p>
     * 
     * @param parentVolumeId
     *        The ID of the volume to use as the parent volume of the volume that you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withParentVolumeId(String parentVolumeId) {
        setParentVolumeId(parentVolumeId);
        return this;
    }

    /**
     * <p>
     * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     * <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the parent
     * volume will always be available for the volume. You can't reserve more storage than the parent volume has. To
     * <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or <code>-1</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param storageCapacityReservationGiB
     *        Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     *        <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the
     *        parent volume will always be available for the volume. You can't reserve more storage than the parent
     *        volume has. To <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or
     *        <code>-1</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     *        properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public void setStorageCapacityReservationGiB(Integer storageCapacityReservationGiB) {
        this.storageCapacityReservationGiB = storageCapacityReservationGiB;
    }

    /**
     * <p>
     * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     * <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the parent
     * volume will always be available for the volume. You can't reserve more storage than the parent volume has. To
     * <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or <code>-1</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     *         <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the
     *         parent volume will always be available for the volume. You can't reserve more storage than the parent
     *         volume has. To <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or
     *         <code>-1</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     *         properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public Integer getStorageCapacityReservationGiB() {
        return this.storageCapacityReservationGiB;
    }

    /**
     * <p>
     * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     * <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the parent
     * volume will always be available for the volume. You can't reserve more storage than the parent volume has. To
     * <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or <code>-1</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param storageCapacityReservationGiB
     *        Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting
     *        <code>StorageCapacityReservationGiB</code> guarantees that the specified amount of storage space on the
     *        parent volume will always be available for the volume. You can't reserve more storage than the parent
     *        volume has. To <i>not</i> specify a storage capacity reservation, set this to <code>0</code> or
     *        <code>-1</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     *        properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withStorageCapacityReservationGiB(Integer storageCapacityReservationGiB) {
        setStorageCapacityReservationGiB(storageCapacityReservationGiB);
        return this;
    }

    /**
     * <p>
     * Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger than the
     * storage on the parent volume. A volume quota limits the amount of storage that the volume can consume to the
     * configured amount, but does not guarantee the space will be available on the parent volume. To guarantee quota
     * space, you must also set <code>StorageCapacityReservationGiB</code>. To <i>not</i> specify a storage capacity
     * quota, set this to <code>-1</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger
     *        than the storage on the parent volume. A volume quota limits the amount of storage that the volume can
     *        consume to the configured amount, but does not guarantee the space will be available on the parent volume.
     *        To guarantee quota space, you must also set <code>StorageCapacityReservationGiB</code>. To <i>not</i>
     *        specify a storage capacity quota, set this to <code>-1</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     *        properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public void setStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        this.storageCapacityQuotaGiB = storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger than the
     * storage on the parent volume. A volume quota limits the amount of storage that the volume can consume to the
     * configured amount, but does not guarantee the space will be available on the parent volume. To guarantee quota
     * space, you must also set <code>StorageCapacityReservationGiB</code>. To <i>not</i> specify a storage capacity
     * quota, set this to <code>-1</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger
     *         than the storage on the parent volume. A volume quota limits the amount of storage that the volume can
     *         consume to the configured amount, but does not guarantee the space will be available on the parent
     *         volume. To guarantee quota space, you must also set <code>StorageCapacityReservationGiB</code>. To
     *         <i>not</i> specify a storage capacity quota, set this to <code>-1</code>. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     *         properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public Integer getStorageCapacityQuotaGiB() {
        return this.storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger than the
     * storage on the parent volume. A volume quota limits the amount of storage that the volume can consume to the
     * configured amount, but does not guarantee the space will be available on the parent volume. To guarantee quota
     * space, you must also set <code>StorageCapacityReservationGiB</code>. To <i>not</i> specify a storage capacity
     * quota, set this to <code>-1</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     * properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger
     *        than the storage on the parent volume. A volume quota limits the amount of storage that the volume can
     *        consume to the configured amount, but does not guarantee the space will be available on the parent volume.
     *        To guarantee quota space, you must also set <code>StorageCapacityReservationGiB</code>. To <i>not</i>
     *        specify a storage capacity quota, set this to <code>-1</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties">Volume
     *        properties</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        setStorageCapacityQuotaGiB(storageCapacityQuotaGiB);
        return this;
    }

    /**
     * <p>
     * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4, 8, 16,
     * 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting for the
     * majority of use cases. Generally, workloads that write in fixed small or large record sizes may benefit from
     * setting a custom record size, like database workloads (small record size) or media streaming workloads (large
     * record size). For additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS Record
     * size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4,
     *        8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting
     *        for the majority of use cases. Generally, workloads that write in fixed small or large record sizes may
     *        benefit from setting a custom record size, like database workloads (small record size) or media streaming
     *        workloads (large record size). For additional guidance on when to set a custom record size, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS
     *        Record size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public void setRecordSizeKiB(Integer recordSizeKiB) {
        this.recordSizeKiB = recordSizeKiB;
    }

    /**
     * <p>
     * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4, 8, 16,
     * 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting for the
     * majority of use cases. Generally, workloads that write in fixed small or large record sizes may benefit from
     * setting a custom record size, like database workloads (small record size) or media streaming workloads (large
     * record size). For additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS Record
     * size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4,
     *         8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting
     *         for the majority of use cases. Generally, workloads that write in fixed small or large record sizes may
     *         benefit from setting a custom record size, like database workloads (small record size) or media streaming
     *         workloads (large record size). For additional guidance on when to set a custom record size, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS
     *         Record size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public Integer getRecordSizeKiB() {
        return this.recordSizeKiB;
    }

    /**
     * <p>
     * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4, 8, 16,
     * 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting for the
     * majority of use cases. Generally, workloads that write in fixed small or large record sizes may benefit from
     * setting a custom record size, like database workloads (small record size) or media streaming workloads (large
     * record size). For additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS Record
     * size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4,
     *        8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting
     *        for the majority of use cases. Generally, workloads that write in fixed small or large record sizes may
     *        benefit from setting a custom record size, like database workloads (small record size) or media streaming
     *        workloads (large record size). For additional guidance on when to set a custom record size, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance"> ZFS
     *        Record size</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withRecordSizeKiB(Integer recordSizeKiB) {
        setRecordSizeKiB(recordSizeKiB);
        return this;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. ZSTD
     * compression provides a higher level of data compression and higher read throughput performance than LZ4
     * compression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     * provides a lower level of compression and higher write throughput performance than ZSTD compression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about volume compression types and the performance of your Amazon FSx for OpenZFS file
     * system, see <a href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs">
     * Tips for maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     * Guide</i>.
     * </p>
     * 
     * @param dataCompressionType
     *        Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *        ZSTD compression provides a higher level of data compression and higher read throughput performance than
     *        LZ4 compression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     *        provides a lower level of compression and higher write throughput performance than ZSTD compression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about volume compression types and the performance of your Amazon FSx for OpenZFS
     *        file system, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     *        Guide</i>.
     * @see OpenZFSDataCompressionType
     */

    public void setDataCompressionType(String dataCompressionType) {
        this.dataCompressionType = dataCompressionType;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. ZSTD
     * compression provides a higher level of data compression and higher read throughput performance than LZ4
     * compression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     * provides a lower level of compression and higher write throughput performance than ZSTD compression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about volume compression types and the performance of your Amazon FSx for OpenZFS file
     * system, see <a href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs">
     * Tips for maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     * Guide</i>.
     * </p>
     * 
     * @return Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code>
     *         by default.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *         ZSTD compression provides a higher level of data compression and higher read throughput performance than
     *         LZ4 compression.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     *         provides a lower level of compression and higher write throughput performance than ZSTD compression.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about volume compression types and the performance of your Amazon FSx for OpenZFS
     *         file system, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips
     *         for maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     *         Guide</i>.
     * @see OpenZFSDataCompressionType
     */

    public String getDataCompressionType() {
        return this.dataCompressionType;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. ZSTD
     * compression provides a higher level of data compression and higher read throughput performance than LZ4
     * compression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     * provides a lower level of compression and higher write throughput performance than ZSTD compression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about volume compression types and the performance of your Amazon FSx for OpenZFS file
     * system, see <a href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs">
     * Tips for maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     * Guide</i>.
     * </p>
     * 
     * @param dataCompressionType
     *        Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *        ZSTD compression provides a higher level of data compression and higher read throughput performance than
     *        LZ4 compression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     *        provides a lower level of compression and higher write throughput performance than ZSTD compression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about volume compression types and the performance of your Amazon FSx for OpenZFS
     *        file system, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDataCompressionType
     */

    public CreateOpenZFSVolumeConfiguration withDataCompressionType(String dataCompressionType) {
        setDataCompressionType(dataCompressionType);
        return this;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. ZSTD
     * compression provides a higher level of data compression and higher read throughput performance than LZ4
     * compression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     * provides a lower level of compression and higher write throughput performance than ZSTD compression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about volume compression types and the performance of your Amazon FSx for OpenZFS file
     * system, see <a href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs">
     * Tips for maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     * Guide</i>.
     * </p>
     * 
     * @param dataCompressionType
     *        Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *        ZSTD compression provides a higher level of data compression and higher read throughput performance than
     *        LZ4 compression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression
     *        provides a lower level of compression and higher write throughput performance than ZSTD compression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about volume compression types and the performance of your Amazon FSx for OpenZFS
     *        file system, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> File system and volume settings in the <i>Amazon FSx for OpenZFS User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDataCompressionType
     */

    public CreateOpenZFSVolumeConfiguration withDataCompressionType(OpenZFSDataCompressionType dataCompressionType) {
        this.dataCompressionType = dataCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToSnapshots
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *        to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *        where the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags,
     *        only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *        snapshot, no tags are copied from the volume, regardless of this value.
     */

    public void setCopyTagsToSnapshots(Boolean copyTagsToSnapshots) {
        this.copyTagsToSnapshots = copyTagsToSnapshots;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *         to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *         where the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more
     *         tags, only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *         snapshot, no tags are copied from the volume, regardless of this value.
     */

    public Boolean getCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToSnapshots
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *        to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *        where the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags,
     *        only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *        snapshot, no tags are copied from the volume, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withCopyTagsToSnapshots(Boolean copyTagsToSnapshots) {
        setCopyTagsToSnapshots(copyTagsToSnapshots);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *         to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *         where the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more
     *         tags, only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *         snapshot, no tags are copied from the volume, regardless of this value.
     */

    public Boolean isCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots;
    }

    /**
     * <p>
     * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     * </p>
     * 
     * @param originSnapshot
     *        The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     */

    public void setOriginSnapshot(CreateOpenZFSOriginSnapshotConfiguration originSnapshot) {
        this.originSnapshot = originSnapshot;
    }

    /**
     * <p>
     * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     * </p>
     * 
     * @return The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     */

    public CreateOpenZFSOriginSnapshotConfiguration getOriginSnapshot() {
        return this.originSnapshot;
    }

    /**
     * <p>
     * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     * </p>
     * 
     * @param originSnapshot
     *        The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withOriginSnapshot(CreateOpenZFSOriginSnapshotConfiguration originSnapshot) {
        setOriginSnapshot(originSnapshot);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @param readOnly
     *        A Boolean value indicating whether the volume is read-only.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @return A Boolean value indicating whether the volume is read-only.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @param readOnly
     *        A Boolean value indicating whether the volume is read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @return A Boolean value indicating whether the volume is read-only.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * 
     * @return The configuration object for mounting a Network File System (NFS) file system.
     */

    public java.util.List<OpenZFSNfsExport> getNfsExports() {
        return nfsExports;
    }

    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a Network File System (NFS) file system.
     */

    public void setNfsExports(java.util.Collection<OpenZFSNfsExport> nfsExports) {
        if (nfsExports == null) {
            this.nfsExports = null;
            return;
        }

        this.nfsExports = new java.util.ArrayList<OpenZFSNfsExport>(nfsExports);
    }

    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNfsExports(java.util.Collection)} or {@link #withNfsExports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a Network File System (NFS) file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withNfsExports(OpenZFSNfsExport... nfsExports) {
        if (this.nfsExports == null) {
            setNfsExports(new java.util.ArrayList<OpenZFSNfsExport>(nfsExports.length));
        }
        for (OpenZFSNfsExport ele : nfsExports) {
            this.nfsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a Network File System (NFS) file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withNfsExports(java.util.Collection<OpenZFSNfsExport> nfsExports) {
        setNfsExports(nfsExports);
        return this;
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * 
     * @return An object specifying how much storage users or groups can use on the volume.
     */

    public java.util.List<OpenZFSUserOrGroupQuota> getUserAndGroupQuotas() {
        return userAndGroupQuotas;
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * 
     * @param userAndGroupQuotas
     *        An object specifying how much storage users or groups can use on the volume.
     */

    public void setUserAndGroupQuotas(java.util.Collection<OpenZFSUserOrGroupQuota> userAndGroupQuotas) {
        if (userAndGroupQuotas == null) {
            this.userAndGroupQuotas = null;
            return;
        }

        this.userAndGroupQuotas = new java.util.ArrayList<OpenZFSUserOrGroupQuota>(userAndGroupQuotas);
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAndGroupQuotas(java.util.Collection)} or {@link #withUserAndGroupQuotas(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userAndGroupQuotas
     *        An object specifying how much storage users or groups can use on the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withUserAndGroupQuotas(OpenZFSUserOrGroupQuota... userAndGroupQuotas) {
        if (this.userAndGroupQuotas == null) {
            setUserAndGroupQuotas(new java.util.ArrayList<OpenZFSUserOrGroupQuota>(userAndGroupQuotas.length));
        }
        for (OpenZFSUserOrGroupQuota ele : userAndGroupQuotas) {
            this.userAndGroupQuotas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * 
     * @param userAndGroupQuotas
     *        An object specifying how much storage users or groups can use on the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSVolumeConfiguration withUserAndGroupQuotas(java.util.Collection<OpenZFSUserOrGroupQuota> userAndGroupQuotas) {
        setUserAndGroupQuotas(userAndGroupQuotas);
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
        if (getParentVolumeId() != null)
            sb.append("ParentVolumeId: ").append(getParentVolumeId()).append(",");
        if (getStorageCapacityReservationGiB() != null)
            sb.append("StorageCapacityReservationGiB: ").append(getStorageCapacityReservationGiB()).append(",");
        if (getStorageCapacityQuotaGiB() != null)
            sb.append("StorageCapacityQuotaGiB: ").append(getStorageCapacityQuotaGiB()).append(",");
        if (getRecordSizeKiB() != null)
            sb.append("RecordSizeKiB: ").append(getRecordSizeKiB()).append(",");
        if (getDataCompressionType() != null)
            sb.append("DataCompressionType: ").append(getDataCompressionType()).append(",");
        if (getCopyTagsToSnapshots() != null)
            sb.append("CopyTagsToSnapshots: ").append(getCopyTagsToSnapshots()).append(",");
        if (getOriginSnapshot() != null)
            sb.append("OriginSnapshot: ").append(getOriginSnapshot()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getNfsExports() != null)
            sb.append("NfsExports: ").append(getNfsExports()).append(",");
        if (getUserAndGroupQuotas() != null)
            sb.append("UserAndGroupQuotas: ").append(getUserAndGroupQuotas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOpenZFSVolumeConfiguration == false)
            return false;
        CreateOpenZFSVolumeConfiguration other = (CreateOpenZFSVolumeConfiguration) obj;
        if (other.getParentVolumeId() == null ^ this.getParentVolumeId() == null)
            return false;
        if (other.getParentVolumeId() != null && other.getParentVolumeId().equals(this.getParentVolumeId()) == false)
            return false;
        if (other.getStorageCapacityReservationGiB() == null ^ this.getStorageCapacityReservationGiB() == null)
            return false;
        if (other.getStorageCapacityReservationGiB() != null
                && other.getStorageCapacityReservationGiB().equals(this.getStorageCapacityReservationGiB()) == false)
            return false;
        if (other.getStorageCapacityQuotaGiB() == null ^ this.getStorageCapacityQuotaGiB() == null)
            return false;
        if (other.getStorageCapacityQuotaGiB() != null && other.getStorageCapacityQuotaGiB().equals(this.getStorageCapacityQuotaGiB()) == false)
            return false;
        if (other.getRecordSizeKiB() == null ^ this.getRecordSizeKiB() == null)
            return false;
        if (other.getRecordSizeKiB() != null && other.getRecordSizeKiB().equals(this.getRecordSizeKiB()) == false)
            return false;
        if (other.getDataCompressionType() == null ^ this.getDataCompressionType() == null)
            return false;
        if (other.getDataCompressionType() != null && other.getDataCompressionType().equals(this.getDataCompressionType()) == false)
            return false;
        if (other.getCopyTagsToSnapshots() == null ^ this.getCopyTagsToSnapshots() == null)
            return false;
        if (other.getCopyTagsToSnapshots() != null && other.getCopyTagsToSnapshots().equals(this.getCopyTagsToSnapshots()) == false)
            return false;
        if (other.getOriginSnapshot() == null ^ this.getOriginSnapshot() == null)
            return false;
        if (other.getOriginSnapshot() != null && other.getOriginSnapshot().equals(this.getOriginSnapshot()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getNfsExports() == null ^ this.getNfsExports() == null)
            return false;
        if (other.getNfsExports() != null && other.getNfsExports().equals(this.getNfsExports()) == false)
            return false;
        if (other.getUserAndGroupQuotas() == null ^ this.getUserAndGroupQuotas() == null)
            return false;
        if (other.getUserAndGroupQuotas() != null && other.getUserAndGroupQuotas().equals(this.getUserAndGroupQuotas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentVolumeId() == null) ? 0 : getParentVolumeId().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacityReservationGiB() == null) ? 0 : getStorageCapacityReservationGiB().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacityQuotaGiB() == null) ? 0 : getStorageCapacityQuotaGiB().hashCode());
        hashCode = prime * hashCode + ((getRecordSizeKiB() == null) ? 0 : getRecordSizeKiB().hashCode());
        hashCode = prime * hashCode + ((getDataCompressionType() == null) ? 0 : getDataCompressionType().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshots() == null) ? 0 : getCopyTagsToSnapshots().hashCode());
        hashCode = prime * hashCode + ((getOriginSnapshot() == null) ? 0 : getOriginSnapshot().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getNfsExports() == null) ? 0 : getNfsExports().hashCode());
        hashCode = prime * hashCode + ((getUserAndGroupQuotas() == null) ? 0 : getUserAndGroupQuotas().hashCode());
        return hashCode;
    }

    @Override
    public CreateOpenZFSVolumeConfiguration clone() {
        try {
            return (CreateOpenZFSVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateOpenZFSVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
