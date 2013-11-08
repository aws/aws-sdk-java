/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * Cachedi S C S I Volume
 */
public class CachediSCSIVolume implements Serializable {

    private String volumeARN;

    private String volumeId;

    private String volumeType;

    private String volumeStatus;

    private Long volumeSizeInBytes;

    private Double volumeProgress;

    private String sourceSnapshotId;

    /**
     * Lists iSCSI information about a volume.
     */
    private VolumeiSCSIAttributes volumeiSCSIAttributes;

    /**
     * Returns the value of the VolumeARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The value of the VolumeARN property for this object.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * Sets the value of the VolumeARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The new value for the VolumeARN property for this object.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * Sets the value of the VolumeARN property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The new value for the VolumeARN property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CachediSCSIVolume withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * Returns the value of the VolumeId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return The value of the VolumeId property for this object.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * Sets the value of the VolumeId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId The new value for the VolumeId property for this object.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * Sets the value of the VolumeId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId The new value for the VolumeId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CachediSCSIVolume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * Returns the value of the VolumeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @return The value of the VolumeType property for this object.
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * Sets the value of the VolumeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param volumeType The new value for the VolumeType property for this object.
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * Sets the value of the VolumeType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param volumeType The new value for the VolumeType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CachediSCSIVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * Returns the value of the VolumeStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return The value of the VolumeStatus property for this object.
     */
    public String getVolumeStatus() {
        return volumeStatus;
    }
    
    /**
     * Sets the value of the VolumeStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeStatus The new value for the VolumeStatus property for this object.
     */
    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }
    
    /**
     * Sets the value of the VolumeStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeStatus The new value for the VolumeStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CachediSCSIVolume withVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }

    /**
     * Returns the value of the VolumeSizeInBytes property for this object.
     *
     * @return The value of the VolumeSizeInBytes property for this object.
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }
    
    /**
     * Sets the value of the VolumeSizeInBytes property for this object.
     *
     * @param volumeSizeInBytes The new value for the VolumeSizeInBytes property for this object.
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }
    
    /**
     * Sets the value of the VolumeSizeInBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSizeInBytes The new value for the VolumeSizeInBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CachediSCSIVolume withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * Returns the value of the VolumeProgress property for this object.
     *
     * @return The value of the VolumeProgress property for this object.
     */
    public Double getVolumeProgress() {
        return volumeProgress;
    }
    
    /**
     * Sets the value of the VolumeProgress property for this object.
     *
     * @param volumeProgress The new value for the VolumeProgress property for this object.
     */
    public void setVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
    }
    
    /**
     * Sets the value of the VolumeProgress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeProgress The new value for the VolumeProgress property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CachediSCSIVolume withVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
        return this;
    }

    /**
     * Returns the value of the SourceSnapshotId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return The value of the SourceSnapshotId property for this object.
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }
    
    /**
     * Sets the value of the SourceSnapshotId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param sourceSnapshotId The new value for the SourceSnapshotId property for this object.
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }
    
    /**
     * Sets the value of the SourceSnapshotId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param sourceSnapshotId The new value for the SourceSnapshotId property for this object.
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
        if (getVolumeARN() != null) sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (getVolumeStatus() != null) sb.append("VolumeStatus: " + getVolumeStatus() + ",");
        if (getVolumeSizeInBytes() != null) sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getVolumeProgress() != null) sb.append("VolumeProgress: " + getVolumeProgress() + ",");
        if (getSourceSnapshotId() != null) sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getVolumeiSCSIAttributes() != null) sb.append("VolumeiSCSIAttributes: " + getVolumeiSCSIAttributes() );
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
    