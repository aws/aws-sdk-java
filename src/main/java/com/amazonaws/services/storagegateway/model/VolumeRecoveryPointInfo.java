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
 * Lists information about the recovery points of a cached volume.
 * </p>
 */
public class VolumeRecoveryPointInfo {

    /**
     * The Amazon Resource Name (ARN) of the volume associated with the
     * recovery point.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The size, in bytes, of the volume to which the recovery point is
     * associated.
     */
    private Long volumeSizeInBytes;

    /**
     * The size, in bytes, of the volume in use at the time of the recovery
     * point.
     */
    private Long volumeUsageInBytes;

    /**
     * The time of the recovery point. The format of the time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */
    private String volumeRecoveryPointTime;

    /**
     * The Amazon Resource Name (ARN) of the volume associated with the
     * recovery point.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the volume associated with the
     *         recovery point.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume associated with the
     * recovery point.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume associated with the
     *         recovery point.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume associated with the
     * recovery point.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume associated with the
     *         recovery point.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeRecoveryPointInfo withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The size, in bytes, of the volume to which the recovery point is
     * associated.
     *
     * @return The size, in bytes, of the volume to which the recovery point is
     *         associated.
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }
    
    /**
     * The size, in bytes, of the volume to which the recovery point is
     * associated.
     *
     * @param volumeSizeInBytes The size, in bytes, of the volume to which the recovery point is
     *         associated.
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }
    
    /**
     * The size, in bytes, of the volume to which the recovery point is
     * associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSizeInBytes The size, in bytes, of the volume to which the recovery point is
     *         associated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeRecoveryPointInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }
    
    
    /**
     * The size, in bytes, of the volume in use at the time of the recovery
     * point.
     *
     * @return The size, in bytes, of the volume in use at the time of the recovery
     *         point.
     */
    public Long getVolumeUsageInBytes() {
        return volumeUsageInBytes;
    }
    
    /**
     * The size, in bytes, of the volume in use at the time of the recovery
     * point.
     *
     * @param volumeUsageInBytes The size, in bytes, of the volume in use at the time of the recovery
     *         point.
     */
    public void setVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
    }
    
    /**
     * The size, in bytes, of the volume in use at the time of the recovery
     * point.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeUsageInBytes The size, in bytes, of the volume in use at the time of the recovery
     *         point.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeRecoveryPointInfo withVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
        return this;
    }
    
    
    /**
     * The time of the recovery point. The format of the time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *
     * @return The time of the recovery point. The format of the time is in the
     *         ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */
    public String getVolumeRecoveryPointTime() {
        return volumeRecoveryPointTime;
    }
    
    /**
     * The time of the recovery point. The format of the time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *
     * @param volumeRecoveryPointTime The time of the recovery point. The format of the time is in the
     *         ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */
    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }
    
    /**
     * The time of the recovery point. The format of the time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeRecoveryPointTime The time of the recovery point. The format of the time is in the
     *         ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeRecoveryPointInfo withVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
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
        if (volumeSizeInBytes != null) sb.append("VolumeSizeInBytes: " + volumeSizeInBytes + ", ");
        if (volumeUsageInBytes != null) sb.append("VolumeUsageInBytes: " + volumeUsageInBytes + ", ");
        if (volumeRecoveryPointTime != null) sb.append("VolumeRecoveryPointTime: " + volumeRecoveryPointTime + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeUsageInBytes() == null) ? 0 : getVolumeUsageInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof VolumeRecoveryPointInfo == false) return false;
        VolumeRecoveryPointInfo other = (VolumeRecoveryPointInfo)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null) return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false) return false; 
        if (other.getVolumeUsageInBytes() == null ^ this.getVolumeUsageInBytes() == null) return false;
        if (other.getVolumeUsageInBytes() != null && other.getVolumeUsageInBytes().equals(this.getVolumeUsageInBytes()) == false) return false; 
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null) return false;
        if (other.getVolumeRecoveryPointTime() != null && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false) return false; 
        return true;
    }
    
}
    