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
 * Describes a cached storage volume.
 * </p>
 */
public class CachediSCSIVolume {

    /**
     * The Amazon Resource Name (ARN) of the storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The unique identifier of the storage volume, e.g. vol-1122AABB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String volumeId;

    /**
     * A value describing the type of volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI, CACHED iSCSI
     */
    private String volumeType;

    /**
     * A value that indicates the state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED, UPLOAD BUFFER NOT CONFIGURED
     */
    private String volumeStatus;

    /**
     * The size of the volume in bytes that was specified in the
     * <a>API_CreateCachediSCSIVolume</a> operation.
     */
    private Long volumeSizeInBytes;

    /**
     * The percentage complete if the volume is restoring or bootstrapping
     * that represents the percent of data transferred. This field does not
     * appear in the response if the stored volume is not restoring or
     * bootstrapping.
     */
    private Double volumeProgress;

    /**
     * If the cached volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     * included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     */
    private String sourceSnapshotId;

    /**
     * Lists iSCSI information about a volume.
     */
    private VolumeiSCSIAttributes volumeiSCSIAttributes;

    /**
     * The Amazon Resource Name (ARN) of the storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the storage volume.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the storage volume.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the storage volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the storage volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachediSCSIVolume withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The unique identifier of the storage volume, e.g. vol-1122AABB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return The unique identifier of the storage volume, e.g. vol-1122AABB.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The unique identifier of the storage volume, e.g. vol-1122AABB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId The unique identifier of the storage volume, e.g. vol-1122AABB.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The unique identifier of the storage volume, e.g. vol-1122AABB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId The unique identifier of the storage volume, e.g. vol-1122AABB.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachediSCSIVolume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * A value describing the type of volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI, CACHED iSCSI
     *
     * @return A value describing the type of volume.
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * A value describing the type of volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI, CACHED iSCSI
     *
     * @param volumeType A value describing the type of volume.
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * A value describing the type of volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI, CACHED iSCSI
     *
     * @param volumeType A value describing the type of volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public CachediSCSIVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    
    
    /**
     * A value describing the type of volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI, CACHED iSCSI
     *
     * @param volumeType A value describing the type of volume.
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * A value describing the type of volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI, CACHED iSCSI
     *
     * @param volumeType A value describing the type of volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public CachediSCSIVolume withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }
    
    /**
     * A value that indicates the state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED, UPLOAD BUFFER NOT CONFIGURED
     *
     * @return A value that indicates the state of the volume.
     *
     * @see VolumeStatus
     */
    public String getVolumeStatus() {
        return volumeStatus;
    }
    
    /**
     * A value that indicates the state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED, UPLOAD BUFFER NOT CONFIGURED
     *
     * @param volumeStatus A value that indicates the state of the volume.
     *
     * @see VolumeStatus
     */
    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }
    
    /**
     * A value that indicates the state of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED, UPLOAD BUFFER NOT CONFIGURED
     *
     * @param volumeStatus A value that indicates the state of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeStatus
     */
    public CachediSCSIVolume withVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }
    
    
    /**
     * A value that indicates the state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED, UPLOAD BUFFER NOT CONFIGURED
     *
     * @param volumeStatus A value that indicates the state of the volume.
     *
     * @see VolumeStatus
     */
    public void setVolumeStatus(VolumeStatus volumeStatus) {
        this.volumeStatus = volumeStatus.toString();
    }
    
    /**
     * A value that indicates the state of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, AVAILABLE, RESTORING, BOOTSTRAPPING, IRRECOVERABLE, PASS THROUGH, RESTORE AND PASS THROUGH, DELETED, WORKING STORAGE NOT CONFIGURED, UPLOAD BUFFER NOT CONFIGURED
     *
     * @param volumeStatus A value that indicates the state of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeStatus
     */
    public CachediSCSIVolume withVolumeStatus(VolumeStatus volumeStatus) {
        this.volumeStatus = volumeStatus.toString();
        return this;
    }
    
    /**
     * The size of the volume in bytes that was specified in the
     * <a>API_CreateCachediSCSIVolume</a> operation.
     *
     * @return The size of the volume in bytes that was specified in the
     *         <a>API_CreateCachediSCSIVolume</a> operation.
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }
    
    /**
     * The size of the volume in bytes that was specified in the
     * <a>API_CreateCachediSCSIVolume</a> operation.
     *
     * @param volumeSizeInBytes The size of the volume in bytes that was specified in the
     *         <a>API_CreateCachediSCSIVolume</a> operation.
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }
    
    /**
     * The size of the volume in bytes that was specified in the
     * <a>API_CreateCachediSCSIVolume</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSizeInBytes The size of the volume in bytes that was specified in the
     *         <a>API_CreateCachediSCSIVolume</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachediSCSIVolume withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }
    
    
    /**
     * The percentage complete if the volume is restoring or bootstrapping
     * that represents the percent of data transferred. This field does not
     * appear in the response if the stored volume is not restoring or
     * bootstrapping.
     *
     * @return The percentage complete if the volume is restoring or bootstrapping
     *         that represents the percent of data transferred. This field does not
     *         appear in the response if the stored volume is not restoring or
     *         bootstrapping.
     */
    public Double getVolumeProgress() {
        return volumeProgress;
    }
    
    /**
     * The percentage complete if the volume is restoring or bootstrapping
     * that represents the percent of data transferred. This field does not
     * appear in the response if the stored volume is not restoring or
     * bootstrapping.
     *
     * @param volumeProgress The percentage complete if the volume is restoring or bootstrapping
     *         that represents the percent of data transferred. This field does not
     *         appear in the response if the stored volume is not restoring or
     *         bootstrapping.
     */
    public void setVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
    }
    
    /**
     * The percentage complete if the volume is restoring or bootstrapping
     * that represents the percent of data transferred. This field does not
     * appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeProgress The percentage complete if the volume is restoring or bootstrapping
     *         that represents the percent of data transferred. This field does not
     *         appear in the response if the stored volume is not restoring or
     *         bootstrapping.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachediSCSIVolume withVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
        return this;
    }
    
    
    /**
     * If the cached volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     * included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return If the cached volume was created from a snapshot, this field contains
     *         the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     *         included.
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }
    
    /**
     * If the cached volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     * included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param sourceSnapshotId If the cached volume was created from a snapshot, this field contains
     *         the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     *         included.
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }
    
    /**
     * If the cached volume was created from a snapshot, this field contains
     * the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     * included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param sourceSnapshotId If the cached volume was created from a snapshot, this field contains
     *         the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not
     *         included.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachediSCSIVolume withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }
    
    
    /**
     * Lists iSCSI information about a volume.
     *
     * @return Lists iSCSI information about a volume.
     */
    public VolumeiSCSIAttributes getVolumeiSCSIAttributes() {
        return volumeiSCSIAttributes;
    }
    
    /**
     * Lists iSCSI information about a volume.
     *
     * @param volumeiSCSIAttributes Lists iSCSI information about a volume.
     */
    public void setVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
    }
    
    /**
     * Lists iSCSI information about a volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeiSCSIAttributes Lists iSCSI information about a volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachediSCSIVolume withVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
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
        if (sourceSnapshotId != null) sb.append("SourceSnapshotId: " + sourceSnapshotId + ", ");
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
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeiSCSIAttributes() == null) ? 0 : getVolumeiSCSIAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CachediSCSIVolume == false) return false;
        CachediSCSIVolume other = (CachediSCSIVolume)obj;
        
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
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null) return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false) return false; 
        if (other.getVolumeiSCSIAttributes() == null ^ this.getVolumeiSCSIAttributes() == null) return false;
        if (other.getVolumeiSCSIAttributes() != null && other.getVolumeiSCSIAttributes().equals(this.getVolumeiSCSIAttributes()) == false) return false; 
        return true;
    }
    
}
    