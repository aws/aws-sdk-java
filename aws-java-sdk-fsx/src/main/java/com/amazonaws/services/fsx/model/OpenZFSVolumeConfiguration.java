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
 * The configuration of an Amazon FSx for OpenZFS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OpenZFSVolumeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the parent volume.
     * </p>
     */
    private String parentVolumeId;
    /**
     * <p>
     * The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     * </p>
     */
    private String volumePath;
    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved.
     * </p>
     */
    private Integer storageCapacityReservationGiB;
    /**
     * <p>
     * The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume.
     * </p>
     */
    private Integer storageCapacityQuotaGiB;
    /**
     * <p>
     * The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or
     * 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance on when to set
     * a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
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
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
     */
    private String dataCompressionType;
    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
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
    private OpenZFSOriginSnapshotConfiguration originSnapshot;
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
     * Specifies the ID of the snapshot to which the volume was restored.
     * </p>
     */
    private String restoreToSnapshot;
    /**
     * <p>
     * A Boolean value indicating whether snapshots between the current state and the specified snapshot should be
     * deleted when a volume is restored from snapshot.
     * </p>
     */
    private Boolean deleteIntermediateSnaphots;
    /**
     * <p>
     * A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be deleted
     * when a volume is restored from snapshot.
     * </p>
     */
    private Boolean deleteClonedVolumes;

    /**
     * <p>
     * The ID of the parent volume.
     * </p>
     * 
     * @param parentVolumeId
     *        The ID of the parent volume.
     */

    public void setParentVolumeId(String parentVolumeId) {
        this.parentVolumeId = parentVolumeId;
    }

    /**
     * <p>
     * The ID of the parent volume.
     * </p>
     * 
     * @return The ID of the parent volume.
     */

    public String getParentVolumeId() {
        return this.parentVolumeId;
    }

    /**
     * <p>
     * The ID of the parent volume.
     * </p>
     * 
     * @param parentVolumeId
     *        The ID of the parent volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withParentVolumeId(String parentVolumeId) {
        setParentVolumeId(parentVolumeId);
        return this;
    }

    /**
     * <p>
     * The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     * </p>
     * 
     * @param volumePath
     *        The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     */

    public void setVolumePath(String volumePath) {
        this.volumePath = volumePath;
    }

    /**
     * <p>
     * The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     * </p>
     * 
     * @return The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     */

    public String getVolumePath() {
        return this.volumePath;
    }

    /**
     * <p>
     * The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     * </p>
     * 
     * @param volumePath
     *        The path to the volume from the root volume. For example, <code>fsx/parentVolume/volume1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withVolumePath(String volumePath) {
        setVolumePath(volumePath);
        return this;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved.
     * </p>
     * 
     * @param storageCapacityReservationGiB
     *        The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage
     *        than the parent volume has reserved.
     */

    public void setStorageCapacityReservationGiB(Integer storageCapacityReservationGiB) {
        this.storageCapacityReservationGiB = storageCapacityReservationGiB;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved.
     * </p>
     * 
     * @return The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more
     *         storage than the parent volume has reserved.
     */

    public Integer getStorageCapacityReservationGiB() {
        return this.storageCapacityReservationGiB;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved.
     * </p>
     * 
     * @param storageCapacityReservationGiB
     *        The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage
     *        than the parent volume has reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withStorageCapacityReservationGiB(Integer storageCapacityReservationGiB) {
        setStorageCapacityReservationGiB(storageCapacityReservationGiB);
        return this;
    }

    /**
     * <p>
     * The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume.
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify
     *        a quota larger than the storage on the parent volume.
     */

    public void setStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        this.storageCapacityQuotaGiB = storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume.
     * </p>
     * 
     * @return The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify
     *         a quota larger than the storage on the parent volume.
     */

    public Integer getStorageCapacityQuotaGiB() {
        return this.storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume.
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify
     *        a quota larger than the storage on the parent volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        setStorageCapacityQuotaGiB(storageCapacityQuotaGiB);
        return this;
    }

    /**
     * <p>
     * The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or
     * 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance on when to set
     * a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     *        512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance
     *        on when to set a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public void setRecordSizeKiB(Integer recordSizeKiB) {
        this.recordSizeKiB = recordSizeKiB;
    }

    /**
     * <p>
     * The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or
     * 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance on when to set
     * a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     *         512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance
     *         on when to set a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public Integer getRecordSizeKiB() {
        return this.recordSizeKiB;
    }

    /**
     * <p>
     * The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or
     * 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance on when to set
     * a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     *        512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance
     *        on when to set a custom record size, see the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withRecordSizeKiB(Integer recordSizeKiB) {
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
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
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
     *        Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *        Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *        </p>
     *        </li>
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
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
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
     *         Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *         Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *         </p>
     *         </li>
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
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
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
     *        Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *        Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDataCompressionType
     */

    public OpenZFSVolumeConfiguration withDataCompressionType(String dataCompressionType) {
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
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
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
     *        Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *        Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDataCompressionType
     */

    public OpenZFSVolumeConfiguration withDataCompressionType(OpenZFSDataCompressionType dataCompressionType) {
        this.dataCompressionType = dataCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToSnapshots
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *        to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *        where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
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
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *         to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *         where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *         only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *         snapshot, no tags are copied from the volume, regardless of this value.
     */

    public Boolean getCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToSnapshots
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *        to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *        where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *        only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *        snapshot, no tags are copied from the volume, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withCopyTagsToSnapshots(Boolean copyTagsToSnapshots) {
        setCopyTagsToSnapshots(copyTagsToSnapshots);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *         to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *         where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *         only the specified tags are copied to snapshots. If you specify one or more tags when creating the
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

    public void setOriginSnapshot(OpenZFSOriginSnapshotConfiguration originSnapshot) {
        this.originSnapshot = originSnapshot;
    }

    /**
     * <p>
     * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     * </p>
     * 
     * @return The configuration object that specifies the snapshot to use as the origin of the data for the volume.
     */

    public OpenZFSOriginSnapshotConfiguration getOriginSnapshot() {
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

    public OpenZFSVolumeConfiguration withOriginSnapshot(OpenZFSOriginSnapshotConfiguration originSnapshot) {
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

    public OpenZFSVolumeConfiguration withReadOnly(Boolean readOnly) {
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

    public OpenZFSVolumeConfiguration withNfsExports(OpenZFSNfsExport... nfsExports) {
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

    public OpenZFSVolumeConfiguration withNfsExports(java.util.Collection<OpenZFSNfsExport> nfsExports) {
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

    public OpenZFSVolumeConfiguration withUserAndGroupQuotas(OpenZFSUserOrGroupQuota... userAndGroupQuotas) {
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

    public OpenZFSVolumeConfiguration withUserAndGroupQuotas(java.util.Collection<OpenZFSUserOrGroupQuota> userAndGroupQuotas) {
        setUserAndGroupQuotas(userAndGroupQuotas);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the snapshot to which the volume was restored.
     * </p>
     * 
     * @param restoreToSnapshot
     *        Specifies the ID of the snapshot to which the volume was restored.
     */

    public void setRestoreToSnapshot(String restoreToSnapshot) {
        this.restoreToSnapshot = restoreToSnapshot;
    }

    /**
     * <p>
     * Specifies the ID of the snapshot to which the volume was restored.
     * </p>
     * 
     * @return Specifies the ID of the snapshot to which the volume was restored.
     */

    public String getRestoreToSnapshot() {
        return this.restoreToSnapshot;
    }

    /**
     * <p>
     * Specifies the ID of the snapshot to which the volume was restored.
     * </p>
     * 
     * @param restoreToSnapshot
     *        Specifies the ID of the snapshot to which the volume was restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withRestoreToSnapshot(String restoreToSnapshot) {
        setRestoreToSnapshot(restoreToSnapshot);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether snapshots between the current state and the specified snapshot should be
     * deleted when a volume is restored from snapshot.
     * </p>
     * 
     * @param deleteIntermediateSnaphots
     *        A Boolean value indicating whether snapshots between the current state and the specified snapshot should
     *        be deleted when a volume is restored from snapshot.
     */

    public void setDeleteIntermediateSnaphots(Boolean deleteIntermediateSnaphots) {
        this.deleteIntermediateSnaphots = deleteIntermediateSnaphots;
    }

    /**
     * <p>
     * A Boolean value indicating whether snapshots between the current state and the specified snapshot should be
     * deleted when a volume is restored from snapshot.
     * </p>
     * 
     * @return A Boolean value indicating whether snapshots between the current state and the specified snapshot should
     *         be deleted when a volume is restored from snapshot.
     */

    public Boolean getDeleteIntermediateSnaphots() {
        return this.deleteIntermediateSnaphots;
    }

    /**
     * <p>
     * A Boolean value indicating whether snapshots between the current state and the specified snapshot should be
     * deleted when a volume is restored from snapshot.
     * </p>
     * 
     * @param deleteIntermediateSnaphots
     *        A Boolean value indicating whether snapshots between the current state and the specified snapshot should
     *        be deleted when a volume is restored from snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withDeleteIntermediateSnaphots(Boolean deleteIntermediateSnaphots) {
        setDeleteIntermediateSnaphots(deleteIntermediateSnaphots);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether snapshots between the current state and the specified snapshot should be
     * deleted when a volume is restored from snapshot.
     * </p>
     * 
     * @return A Boolean value indicating whether snapshots between the current state and the specified snapshot should
     *         be deleted when a volume is restored from snapshot.
     */

    public Boolean isDeleteIntermediateSnaphots() {
        return this.deleteIntermediateSnaphots;
    }

    /**
     * <p>
     * A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be deleted
     * when a volume is restored from snapshot.
     * </p>
     * 
     * @param deleteClonedVolumes
     *        A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be
     *        deleted when a volume is restored from snapshot.
     */

    public void setDeleteClonedVolumes(Boolean deleteClonedVolumes) {
        this.deleteClonedVolumes = deleteClonedVolumes;
    }

    /**
     * <p>
     * A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be deleted
     * when a volume is restored from snapshot.
     * </p>
     * 
     * @return A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be
     *         deleted when a volume is restored from snapshot.
     */

    public Boolean getDeleteClonedVolumes() {
        return this.deleteClonedVolumes;
    }

    /**
     * <p>
     * A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be deleted
     * when a volume is restored from snapshot.
     * </p>
     * 
     * @param deleteClonedVolumes
     *        A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be
     *        deleted when a volume is restored from snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSVolumeConfiguration withDeleteClonedVolumes(Boolean deleteClonedVolumes) {
        setDeleteClonedVolumes(deleteClonedVolumes);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be deleted
     * when a volume is restored from snapshot.
     * </p>
     * 
     * @return A Boolean value indicating whether dependent clone volumes created from intermediate snapshots should be
     *         deleted when a volume is restored from snapshot.
     */

    public Boolean isDeleteClonedVolumes() {
        return this.deleteClonedVolumes;
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
        if (getVolumePath() != null)
            sb.append("VolumePath: ").append(getVolumePath()).append(",");
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
            sb.append("UserAndGroupQuotas: ").append(getUserAndGroupQuotas()).append(",");
        if (getRestoreToSnapshot() != null)
            sb.append("RestoreToSnapshot: ").append(getRestoreToSnapshot()).append(",");
        if (getDeleteIntermediateSnaphots() != null)
            sb.append("DeleteIntermediateSnaphots: ").append(getDeleteIntermediateSnaphots()).append(",");
        if (getDeleteClonedVolumes() != null)
            sb.append("DeleteClonedVolumes: ").append(getDeleteClonedVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenZFSVolumeConfiguration == false)
            return false;
        OpenZFSVolumeConfiguration other = (OpenZFSVolumeConfiguration) obj;
        if (other.getParentVolumeId() == null ^ this.getParentVolumeId() == null)
            return false;
        if (other.getParentVolumeId() != null && other.getParentVolumeId().equals(this.getParentVolumeId()) == false)
            return false;
        if (other.getVolumePath() == null ^ this.getVolumePath() == null)
            return false;
        if (other.getVolumePath() != null && other.getVolumePath().equals(this.getVolumePath()) == false)
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
        if (other.getRestoreToSnapshot() == null ^ this.getRestoreToSnapshot() == null)
            return false;
        if (other.getRestoreToSnapshot() != null && other.getRestoreToSnapshot().equals(this.getRestoreToSnapshot()) == false)
            return false;
        if (other.getDeleteIntermediateSnaphots() == null ^ this.getDeleteIntermediateSnaphots() == null)
            return false;
        if (other.getDeleteIntermediateSnaphots() != null && other.getDeleteIntermediateSnaphots().equals(this.getDeleteIntermediateSnaphots()) == false)
            return false;
        if (other.getDeleteClonedVolumes() == null ^ this.getDeleteClonedVolumes() == null)
            return false;
        if (other.getDeleteClonedVolumes() != null && other.getDeleteClonedVolumes().equals(this.getDeleteClonedVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentVolumeId() == null) ? 0 : getParentVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumePath() == null) ? 0 : getVolumePath().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacityReservationGiB() == null) ? 0 : getStorageCapacityReservationGiB().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacityQuotaGiB() == null) ? 0 : getStorageCapacityQuotaGiB().hashCode());
        hashCode = prime * hashCode + ((getRecordSizeKiB() == null) ? 0 : getRecordSizeKiB().hashCode());
        hashCode = prime * hashCode + ((getDataCompressionType() == null) ? 0 : getDataCompressionType().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshots() == null) ? 0 : getCopyTagsToSnapshots().hashCode());
        hashCode = prime * hashCode + ((getOriginSnapshot() == null) ? 0 : getOriginSnapshot().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getNfsExports() == null) ? 0 : getNfsExports().hashCode());
        hashCode = prime * hashCode + ((getUserAndGroupQuotas() == null) ? 0 : getUserAndGroupQuotas().hashCode());
        hashCode = prime * hashCode + ((getRestoreToSnapshot() == null) ? 0 : getRestoreToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDeleteIntermediateSnaphots() == null) ? 0 : getDeleteIntermediateSnaphots().hashCode());
        hashCode = prime * hashCode + ((getDeleteClonedVolumes() == null) ? 0 : getDeleteClonedVolumes().hashCode());
        return hashCode;
    }

    @Override
    public OpenZFSVolumeConfiguration clone() {
        try {
            return (OpenZFSVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OpenZFSVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
