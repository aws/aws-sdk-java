/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

/**
 * <p>
 * Describes an iSCSI stored volume.
 * </p>
 */
public class StorediSCSIVolume {

    /**
     * The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     * Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String volumeId;

    /**
     * One of the <a>VolumeType</a> enumeration values describing the type of
     * the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     */
    private String volumeType;

    /**
     * One of the <a>VolumeStatus</a> values that indicates the state of the
     * storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED
     */
    private String volumeStatus;

    /**
     * The size of the volume in bytes.
     */
    private Long volumeSizeInBytes;

    /**
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This
     * field does not appear in the response if the stored volume is not
     * restoring or bootstrapping.
     */
    private Double volumeProgress;

    /**
     * The disk ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String volumeDiskId;

    /**
     * If the stored volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     */
    private String sourceSnapshotId;

    /**
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved. <p><i>Valid Values</i>: true,
     * false
     */
    private Boolean preservedExistingData;

    /**
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     */
    private VolumeiSCSIAttributes volumeiSCSIAttributes;

    /**
     * The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     * Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     *         Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     *         hyphens (-).
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     * Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     *         Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     *         hyphens (-).
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     * Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the storage volume. <p><i>Valid
     *         Values</i>: 50 to 500 lowercase letters, numbers, periods (.), and
     *         hyphens (-).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return The unique identifier of the volume, e.g. vol-AE4B946D.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId The unique identifier of the volume, e.g. vol-AE4B946D.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId The unique identifier of the volume, e.g. vol-AE4B946D.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * One of the <a>VolumeType</a> enumeration values describing the type of
     * the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @return One of the <a>VolumeType</a> enumeration values describing the type of
     *         the volume.
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * One of the <a>VolumeType</a> enumeration values describing the type of
     * the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the <a>VolumeType</a> enumeration values describing the type of
     *         the volume.
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * One of the <a>VolumeType</a> enumeration values describing the type of
     * the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the <a>VolumeType</a> enumeration values describing the type of
     *         the volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public StorediSCSIVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    
    
    /**
     * One of the <a>VolumeType</a> enumeration values describing the type of
     * the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the <a>VolumeType</a> enumeration values describing the type of
     *         the volume.
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * One of the <a>VolumeType</a> enumeration values describing the type of
     * the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the <a>VolumeType</a> enumeration values describing the type of
     *         the volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public StorediSCSIVolume withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }
    
    /**
     * One of the <a>VolumeStatus</a> values that indicates the state of the
     * storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED
     *
     * @return One of the <a>VolumeStatus</a> values that indicates the state of the
     *         storage volume.
     *
     * @see VolumeStatus
     */
    public String getVolumeStatus() {
        return volumeStatus;
    }
    
    /**
     * One of the <a>VolumeStatus</a> values that indicates the state of the
     * storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED
     *
     * @param volumeStatus One of the <a>VolumeStatus</a> values that indicates the state of the
     *         storage volume.
     *
     * @see VolumeStatus
     */
    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }
    
    /**
     * One of the <a>VolumeStatus</a> values that indicates the state of the
     * storage volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED
     *
     * @param volumeStatus One of the <a>VolumeStatus</a> values that indicates the state of the
     *         storage volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeStatus
     */
    public StorediSCSIVolume withVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }
    
    
    /**
     * One of the <a>VolumeStatus</a> values that indicates the state of the
     * storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED
     *
     * @param volumeStatus One of the <a>VolumeStatus</a> values that indicates the state of the
     *         storage volume.
     *
     * @see VolumeStatus
     */
    public void setVolumeStatus(VolumeStatus volumeStatus) {
        this.volumeStatus = volumeStatus.toString();
    }
    
    /**
     * One of the <a>VolumeStatus</a> values that indicates the state of the
     * storage volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED
     *
     * @param volumeStatus One of the <a>VolumeStatus</a> values that indicates the state of the
     *         storage volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeStatus
     */
    public StorediSCSIVolume withVolumeStatus(VolumeStatus volumeStatus) {
        this.volumeStatus = volumeStatus.toString();
        return this;
    }
    
    /**
     * The size of the volume in bytes.
     *
     * @return The size of the volume in bytes.
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }
    
    /**
     * The size of the volume in bytes.
     *
     * @param volumeSizeInBytes The size of the volume in bytes.
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }
    
    /**
     * The size of the volume in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSizeInBytes The size of the volume in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }
    
    
    /**
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This
     * field does not appear in the response if the stored volume is not
     * restoring or bootstrapping.
     *
     * @return Represents the percentage complete if the volume is restoring or
     *         bootstrapping that represents the percent of data transferred. This
     *         field does not appear in the response if the stored volume is not
     *         restoring or bootstrapping.
     */
    public Double getVolumeProgress() {
        return volumeProgress;
    }
    
    /**
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This
     * field does not appear in the response if the stored volume is not
     * restoring or bootstrapping.
     *
     * @param volumeProgress Represents the percentage complete if the volume is restoring or
     *         bootstrapping that represents the percent of data transferred. This
     *         field does not appear in the response if the stored volume is not
     *         restoring or bootstrapping.
     */
    public void setVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
    }
    
    /**
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This
     * field does not appear in the response if the stored volume is not
     * restoring or bootstrapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeProgress Represents the percentage complete if the volume is restoring or
     *         bootstrapping that represents the percent of data transferred. This
     *         field does not appear in the response if the stored volume is not
     *         restoring or bootstrapping.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
        return this;
    }
    
    
    /**
     * The disk ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return The disk ID of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation.
     */
    public String getVolumeDiskId() {
        return volumeDiskId;
    }
    
    /**
     * The disk ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param volumeDiskId The disk ID of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation.
     */
    public void setVolumeDiskId(String volumeDiskId) {
        this.volumeDiskId = volumeDiskId;
    }
    
    /**
     * The disk ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param volumeDiskId The disk ID of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withVolumeDiskId(String volumeDiskId) {
        this.volumeDiskId = volumeDiskId;
        return this;
    }
    
    
    /**
     * If the stored volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return If the stored volume was created from a snapshot, this field contains
     *         the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     *         included.
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }
    
    /**
     * If the stored volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param sourceSnapshotId If the stored volume was created from a snapshot, this field contains
     *         the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     *         included.
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }
    
    /**
     * If the stored volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param sourceSnapshotId If the stored volume was created from a snapshot, this field contains
     *         the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     *         included.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }
    
    
    /**
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved. <p><i>Valid Values</i>: true,
     * false
     *
     * @return Indicates if when the stored volume was created, existing data on the
     *         underlying local disk was preserved. <p><i>Valid Values</i>: true,
     *         false
     */
    public Boolean isPreservedExistingData() {
        return preservedExistingData;
    }
    
    /**
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved. <p><i>Valid Values</i>: true,
     * false
     *
     * @param preservedExistingData Indicates if when the stored volume was created, existing data on the
     *         underlying local disk was preserved. <p><i>Valid Values</i>: true,
     *         false
     */
    public void setPreservedExistingData(Boolean preservedExistingData) {
        this.preservedExistingData = preservedExistingData;
    }
    
    /**
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved. <p><i>Valid Values</i>: true,
     * false
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preservedExistingData Indicates if when the stored volume was created, existing data on the
     *         underlying local disk was preserved. <p><i>Valid Values</i>: true,
     *         false
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withPreservedExistingData(Boolean preservedExistingData) {
        this.preservedExistingData = preservedExistingData;
        return this;
    }
    
    
    /**
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved. <p><i>Valid Values</i>: true,
     * false
     *
     * @return Indicates if when the stored volume was created, existing data on the
     *         underlying local disk was preserved. <p><i>Valid Values</i>: true,
     *         false
     */
    public Boolean getPreservedExistingData() {
        return preservedExistingData;
    }
    
    /**
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     *
     * @return An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     *         iSCSI attributes for one stored volume.
     */
    public VolumeiSCSIAttributes getVolumeiSCSIAttributes() {
        return volumeiSCSIAttributes;
    }
    
    /**
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     *
     * @param volumeiSCSIAttributes An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     *         iSCSI attributes for one stored volume.
     */
    public void setVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
    }
    
    /**
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeiSCSIAttributes An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     *         iSCSI attributes for one stored volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorediSCSIVolume withVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (volumeARN != null) sb.append("VolumeARN: " + volumeARN + ", ");
        if (volumeId != null) sb.append("VolumeId: " + volumeId + ", ");
        if (volumeType != null) sb.append("VolumeType: " + volumeType + ", ");
        if (volumeStatus != null) sb.append("VolumeStatus: " + volumeStatus + ", ");
        if (volumeSizeInBytes != null) sb.append("VolumeSizeInBytes: " + volumeSizeInBytes + ", ");
        if (volumeProgress != null) sb.append("VolumeProgress: " + volumeProgress + ", ");
        if (volumeDiskId != null) sb.append("VolumeDiskId: " + volumeDiskId + ", ");
        if (sourceSnapshotId != null) sb.append("SourceSnapshotId: " + sourceSnapshotId + ", ");
        if (preservedExistingData != null) sb.append("PreservedExistingData: " + preservedExistingData + ", ");
        if (volumeiSCSIAttributes != null) sb.append("VolumeiSCSIAttributes: " + volumeiSCSIAttributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeStatus() == null) ? 0 : getVolumeStatus().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeProgress() == null) ? 0 : getVolumeProgress().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeDiskId() == null) ? 0 : getVolumeDiskId().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((isPreservedExistingData() == null) ? 0 : isPreservedExistingData().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeiSCSIAttributes() == null) ? 0 : getVolumeiSCSIAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof StorediSCSIVolume == false) return false;
        StorediSCSIVolume other = (StorediSCSIVolume)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.getVolumeStatus() == null ^ this.getVolumeStatus() == null) return false;
        if (other.getVolumeStatus() != null && other.getVolumeStatus().equals(this.getVolumeStatus()) == false) return false; 
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null) return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false) return false; 
        if (other.getVolumeProgress() == null ^ this.getVolumeProgress() == null) return false;
        if (other.getVolumeProgress() != null && other.getVolumeProgress().equals(this.getVolumeProgress()) == false) return false; 
        if (other.getVolumeDiskId() == null ^ this.getVolumeDiskId() == null) return false;
        if (other.getVolumeDiskId() != null && other.getVolumeDiskId().equals(this.getVolumeDiskId()) == false) return false; 
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null) return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false) return false; 
        if (other.isPreservedExistingData() == null ^ this.isPreservedExistingData() == null) return false;
        if (other.isPreservedExistingData() != null && other.isPreservedExistingData().equals(this.isPreservedExistingData()) == false) return false; 
        if (other.getVolumeiSCSIAttributes() == null ^ this.getVolumeiSCSIAttributes() == null) return false;
        if (other.getVolumeiSCSIAttributes() != null && other.getVolumeiSCSIAttributes().equals(this.getVolumeiSCSIAttributes()) == false) return false; 
        return true;
    }
    
}
    