/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class StorediSCSIVolume implements Serializable, Cloneable {

    private String volumeARN;

    private String volumeId;

    private String volumeType;

    private String volumeStatus;

    private Long volumeSizeInBytes;

    private Double volumeProgress;

    private String volumeDiskId;

    private String sourceSnapshotId;

    private Boolean preservedExistingData;

    private VolumeiSCSIAttributes volumeiSCSIAttributes;

    /**
     * @param volumeARN
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * @return
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * @param volumeARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * @param volumeId
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * @return
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * @param volumeId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * @param volumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * @return
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * @param volumeType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * @param volumeStatus
     */

    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    /**
     * @return
     */

    public String getVolumeStatus() {
        return this.volumeStatus;
    }

    /**
     * @param volumeStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeStatus(String volumeStatus) {
        setVolumeStatus(volumeStatus);
        return this;
    }

    /**
     * @param volumeSizeInBytes
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * @return
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * @param volumeSizeInBytes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
        return this;
    }

    /**
     * @param volumeProgress
     */

    public void setVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
    }

    /**
     * @return
     */

    public Double getVolumeProgress() {
        return this.volumeProgress;
    }

    /**
     * @param volumeProgress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeProgress(Double volumeProgress) {
        setVolumeProgress(volumeProgress);
        return this;
    }

    /**
     * @param volumeDiskId
     */

    public void setVolumeDiskId(String volumeDiskId) {
        this.volumeDiskId = volumeDiskId;
    }

    /**
     * @return
     */

    public String getVolumeDiskId() {
        return this.volumeDiskId;
    }

    /**
     * @param volumeDiskId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeDiskId(String volumeDiskId) {
        setVolumeDiskId(volumeDiskId);
        return this;
    }

    /**
     * @param sourceSnapshotId
     */

    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    /**
     * @return
     */

    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    /**
     * @param sourceSnapshotId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withSourceSnapshotId(String sourceSnapshotId) {
        setSourceSnapshotId(sourceSnapshotId);
        return this;
    }

    /**
     * @param preservedExistingData
     */

    public void setPreservedExistingData(Boolean preservedExistingData) {
        this.preservedExistingData = preservedExistingData;
    }

    /**
     * @return
     */

    public Boolean getPreservedExistingData() {
        return this.preservedExistingData;
    }

    /**
     * @param preservedExistingData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withPreservedExistingData(Boolean preservedExistingData) {
        setPreservedExistingData(preservedExistingData);
        return this;
    }

    /**
     * @return
     */

    public Boolean isPreservedExistingData() {
        return this.preservedExistingData;
    }

    /**
     * @param volumeiSCSIAttributes
     */

    public void setVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
    }

    /**
     * @return
     */

    public VolumeiSCSIAttributes getVolumeiSCSIAttributes() {
        return this.volumeiSCSIAttributes;
    }

    /**
     * @param volumeiSCSIAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorediSCSIVolume withVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        setVolumeiSCSIAttributes(volumeiSCSIAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getVolumeStatus() != null)
            sb.append("VolumeStatus: " + getVolumeStatus() + ",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getVolumeProgress() != null)
            sb.append("VolumeProgress: " + getVolumeProgress() + ",");
        if (getVolumeDiskId() != null)
            sb.append("VolumeDiskId: " + getVolumeDiskId() + ",");
        if (getSourceSnapshotId() != null)
            sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getPreservedExistingData() != null)
            sb.append("PreservedExistingData: " + getPreservedExistingData() + ",");
        if (getVolumeiSCSIAttributes() != null)
            sb.append("VolumeiSCSIAttributes: " + getVolumeiSCSIAttributes());
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
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeProgress() == null) ? 0 : getVolumeProgress().hashCode());
        hashCode = prime * hashCode + ((getVolumeDiskId() == null) ? 0 : getVolumeDiskId().hashCode());
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getPreservedExistingData() == null) ? 0 : getPreservedExistingData().hashCode());
        hashCode = prime * hashCode + ((getVolumeiSCSIAttributes() == null) ? 0 : getVolumeiSCSIAttributes().hashCode());
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
}
