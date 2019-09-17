/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an iSCSI stored volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/StorediSCSIVolume" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorediSCSIVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     */
    private String volumeStatus;
    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching
     * from a gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     */
    private String volumeAttachmentStatus;
    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     */
    private Long volumeSizeInBytes;
    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of
     * data transferred. This field does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     */
    private Double volumeProgress;
    /**
     * <p>
     * The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     */
    private String volumeDiskId;
    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663.
     * Otherwise, this field is not included.
     * </p>
     */
    private String sourceSnapshotId;
    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     */
    private Boolean preservedExistingData;
    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored volume.
     * </p>
     */
    private VolumeiSCSIAttributes volumeiSCSIAttributes;
    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that
     * are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns
     * but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is different from the compressed size
     * of the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     */
    private Long volumeUsedInBytes;

    private String kMSKey;
    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     */
    private String targetName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the storage volume.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the storage volume.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the storage volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * 
     * @param volumeId
     *        The unique identifier of the volume, e.g. vol-AE4B946D.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * 
     * @return The unique identifier of the volume, e.g. vol-AE4B946D.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * 
     * @param volumeId
     *        The unique identifier of the volume, e.g. vol-AE4B946D.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     * 
     * @param volumeType
     *        One of the VolumeType enumeration values describing the type of the volume.
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     * 
     * @return One of the VolumeType enumeration values describing the type of the volume.
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     * 
     * @param volumeType
     *        One of the VolumeType enumeration values describing the type of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     * 
     * @param volumeStatus
     *        One of the VolumeStatus values that indicates the state of the storage volume.
     */

    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     * 
     * @return One of the VolumeStatus values that indicates the state of the storage volume.
     */

    public String getVolumeStatus() {
        return this.volumeStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     * 
     * @param volumeStatus
     *        One of the VolumeStatus values that indicates the state of the storage volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeStatus(String volumeStatus) {
        setVolumeStatus(volumeStatus);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching
     * from a gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * 
     * @param volumeAttachmentStatus
     *        A value that indicates whether a storage volume is attached to, detached from, or is in the process of
     *        detaching from a gateway. For more information, see <a href=
     *        "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     *        >Moving Your Volumes to a Different Gateway</a>.
     */

    public void setVolumeAttachmentStatus(String volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
    }

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching
     * from a gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * 
     * @return A value that indicates whether a storage volume is attached to, detached from, or is in the process of
     *         detaching from a gateway. For more information, see <a href=
     *         "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     *         >Moving Your Volumes to a Different Gateway</a>.
     */

    public String getVolumeAttachmentStatus() {
        return this.volumeAttachmentStatus;
    }

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching
     * from a gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * 
     * @param volumeAttachmentStatus
     *        A value that indicates whether a storage volume is attached to, detached from, or is in the process of
     *        detaching from a gateway. For more information, see <a href=
     *        "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     *        >Moving Your Volumes to a Different Gateway</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeAttachmentStatus(String volumeAttachmentStatus) {
        setVolumeAttachmentStatus(volumeAttachmentStatus);
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @return The size of the volume in bytes.
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of
     * data transferred. This field does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     * 
     * @param volumeProgress
     *        Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent
     *        of data transferred. This field does not appear in the response if the stored volume is not restoring or
     *        bootstrapping.
     */

    public void setVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
    }

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of
     * data transferred. This field does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     * 
     * @return Represents the percentage complete if the volume is restoring or bootstrapping that represents the
     *         percent of data transferred. This field does not appear in the response if the stored volume is not
     *         restoring or bootstrapping.
     */

    public Double getVolumeProgress() {
        return this.volumeProgress;
    }

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of
     * data transferred. This field does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     * 
     * @param volumeProgress
     *        Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent
     *        of data transferred. This field does not appear in the response if the stored volume is not restoring or
     *        bootstrapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeProgress(Double volumeProgress) {
        setVolumeProgress(volumeProgress);
        return this;
    }

    /**
     * <p>
     * The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * 
     * @param volumeDiskId
     *        The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     */

    public void setVolumeDiskId(String volumeDiskId) {
        this.volumeDiskId = volumeDiskId;
    }

    /**
     * <p>
     * The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * 
     * @return The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     */

    public String getVolumeDiskId() {
        return this.volumeDiskId;
    }

    /**
     * <p>
     * The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * 
     * @param volumeDiskId
     *        The ID of the local disk that was specified in the <a>CreateStorediSCSIVolume</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeDiskId(String volumeDiskId) {
        setVolumeDiskId(volumeDiskId);
        return this;
    }

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663.
     * Otherwise, this field is not included.
     * </p>
     * 
     * @param sourceSnapshotId
     *        If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g.
     *        snap-78e22663. Otherwise, this field is not included.
     */

    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663.
     * Otherwise, this field is not included.
     * </p>
     * 
     * @return If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g.
     *         snap-78e22663. Otherwise, this field is not included.
     */

    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663.
     * Otherwise, this field is not included.
     * </p>
     * 
     * @param sourceSnapshotId
     *        If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g.
     *        snap-78e22663. Otherwise, this field is not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withSourceSnapshotId(String sourceSnapshotId) {
        setSourceSnapshotId(sourceSnapshotId);
        return this;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @param preservedExistingData
     *        Indicates if when the stored volume was created, existing data on the underlying local disk was
     *        preserved.</p>
     *        <p>
     *        Valid Values: true, false
     */

    public void setPreservedExistingData(Boolean preservedExistingData) {
        this.preservedExistingData = preservedExistingData;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @return Indicates if when the stored volume was created, existing data on the underlying local disk was
     *         preserved.</p>
     *         <p>
     *         Valid Values: true, false
     */

    public Boolean getPreservedExistingData() {
        return this.preservedExistingData;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @param preservedExistingData
     *        Indicates if when the stored volume was created, existing data on the underlying local disk was
     *        preserved.</p>
     *        <p>
     *        Valid Values: true, false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withPreservedExistingData(Boolean preservedExistingData) {
        setPreservedExistingData(preservedExistingData);
        return this;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @return Indicates if when the stored volume was created, existing data on the underlying local disk was
     *         preserved.</p>
     *         <p>
     *         Valid Values: true, false
     */

    public Boolean isPreservedExistingData() {
        return this.preservedExistingData;
    }

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored volume.
     * </p>
     * 
     * @param volumeiSCSIAttributes
     *        An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored
     *        volume.
     */

    public void setVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
    }

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored volume.
     * </p>
     * 
     * @return An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored
     *         volume.
     */

    public VolumeiSCSIAttributes getVolumeiSCSIAttributes() {
        return this.volumeiSCSIAttributes;
    }

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored volume.
     * </p>
     * 
     * @param volumeiSCSIAttributes
     *        An <a>VolumeiSCSIAttributes</a> object that represents a collection of iSCSI attributes for one stored
     *        volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        setVolumeiSCSIAttributes(volumeiSCSIAttributes);
        return this;
    }

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     * </p>
     * 
     * @param createdDate
     *        The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     * </p>
     * 
     * @return The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     * </p>
     * 
     * @param createdDate
     *        The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that
     * are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns
     * but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is different from the compressed size
     * of the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     * 
     * @param volumeUsedInBytes
     *        The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks
     *        that are touched, instead of the actual amount of data written. This value can be useful for sequential
     *        write patterns but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is different
     *        from the compressed size of the volume, which is the value that is used to calculate your bill.</p> <note>
     *        <p>
     *        This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     *        </p>
     */

    public void setVolumeUsedInBytes(Long volumeUsedInBytes) {
        this.volumeUsedInBytes = volumeUsedInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that
     * are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns
     * but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is different from the compressed size
     * of the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     * 
     * @return The size of the data stored on the volume in bytes. This value is calculated based on the number of
     *         blocks that are touched, instead of the actual amount of data written. This value can be useful for
     *         sequential write patterns but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is
     *         different from the compressed size of the volume, which is the value that is used to calculate your
     *         bill.</p> <note>
     *         <p>
     *         This value is not available for volumes created prior to May 13, 2015, until you store data on the
     *         volume.
     *         </p>
     */

    public Long getVolumeUsedInBytes() {
        return this.volumeUsedInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that
     * are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns
     * but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is different from the compressed size
     * of the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     * 
     * @param volumeUsedInBytes
     *        The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks
     *        that are touched, instead of the actual amount of data written. This value can be useful for sequential
     *        write patterns but less accurate for random write patterns. <code>VolumeUsedInBytes</code> is different
     *        from the compressed size of the volume, which is the value that is used to calculate your bill.</p> <note>
     *        <p>
     *        This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeUsedInBytes(Long volumeUsedInBytes) {
        setVolumeUsedInBytes(volumeUsedInBytes);
        return this;
    }

    /**
     * @param kMSKey
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * @return
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * @param kMSKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     * 
     * @param targetName
     *        The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the
     *        target ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *        of
     *        <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *        . The target name must be unique across all volumes on a gateway.</p>
     *        <p>
     *        If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as
     *        the new target name.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     * 
     * @return The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the
     *         target ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *         of
     *         <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *         . The target name must be unique across all volumes on a gateway.</p>
     *         <p>
     *         If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as
     *         the new target name.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     * 
     * @param targetName
     *        The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the
     *        target ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *        of
     *        <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *        . The target name must be unique across all volumes on a gateway.</p>
     *        <p>
     *        If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as
     *        the new target name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withTargetName(String targetName) {
        setTargetName(targetName);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getVolumeStatus() != null)
            sb.append("VolumeStatus: ").append(getVolumeStatus()).append(",");
        if (getVolumeAttachmentStatus() != null)
            sb.append("VolumeAttachmentStatus: ").append(getVolumeAttachmentStatus()).append(",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: ").append(getVolumeSizeInBytes()).append(",");
        if (getVolumeProgress() != null)
            sb.append("VolumeProgress: ").append(getVolumeProgress()).append(",");
        if (getVolumeDiskId() != null)
            sb.append("VolumeDiskId: ").append(getVolumeDiskId()).append(",");
        if (getSourceSnapshotId() != null)
            sb.append("SourceSnapshotId: ").append(getSourceSnapshotId()).append(",");
        if (getPreservedExistingData() != null)
            sb.append("PreservedExistingData: ").append(getPreservedExistingData()).append(",");
        if (getVolumeiSCSIAttributes() != null)
            sb.append("VolumeiSCSIAttributes: ").append(getVolumeiSCSIAttributes()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getVolumeUsedInBytes() != null)
            sb.append("VolumeUsedInBytes: ").append(getVolumeUsedInBytes()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorediSCSIVolume == false)
            return false;
        StorediSCSIVolume other = (StorediSCSIVolume) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeStatus() == null ^ this.getVolumeStatus() == null)
            return false;
        if (other.getVolumeStatus() != null && other.getVolumeStatus().equals(this.getVolumeStatus()) == false)
            return false;
        if (other.getVolumeAttachmentStatus() == null ^ this.getVolumeAttachmentStatus() == null)
            return false;
        if (other.getVolumeAttachmentStatus() != null && other.getVolumeAttachmentStatus().equals(this.getVolumeAttachmentStatus()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getVolumeProgress() == null ^ this.getVolumeProgress() == null)
            return false;
        if (other.getVolumeProgress() != null && other.getVolumeProgress().equals(this.getVolumeProgress()) == false)
            return false;
        if (other.getVolumeDiskId() == null ^ this.getVolumeDiskId() == null)
            return false;
        if (other.getVolumeDiskId() != null && other.getVolumeDiskId().equals(this.getVolumeDiskId()) == false)
            return false;
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null)
            return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false)
            return false;
        if (other.getPreservedExistingData() == null ^ this.getPreservedExistingData() == null)
            return false;
        if (other.getPreservedExistingData() != null && other.getPreservedExistingData().equals(this.getPreservedExistingData()) == false)
            return false;
        if (other.getVolumeiSCSIAttributes() == null ^ this.getVolumeiSCSIAttributes() == null)
            return false;
        if (other.getVolumeiSCSIAttributes() != null && other.getVolumeiSCSIAttributes().equals(this.getVolumeiSCSIAttributes()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVolumeUsedInBytes() == null ^ this.getVolumeUsedInBytes() == null)
            return false;
        if (other.getVolumeUsedInBytes() != null && other.getVolumeUsedInBytes().equals(this.getVolumeUsedInBytes()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeStatus() == null) ? 0 : getVolumeStatus().hashCode());
        hashCode = prime * hashCode + ((getVolumeAttachmentStatus() == null) ? 0 : getVolumeAttachmentStatus().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeProgress() == null) ? 0 : getVolumeProgress().hashCode());
        hashCode = prime * hashCode + ((getVolumeDiskId() == null) ? 0 : getVolumeDiskId().hashCode());
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getPreservedExistingData() == null) ? 0 : getPreservedExistingData().hashCode());
        hashCode = prime * hashCode + ((getVolumeiSCSIAttributes() == null) ? 0 : getVolumeiSCSIAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVolumeUsedInBytes() == null) ? 0 : getVolumeUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        return hashCode;
    }

    @Override
    public StorediSCSIVolume clone() {
        try {
            return (StorediSCSIVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.StorediSCSIVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
