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
 * Volume Recovery Point Info
 */
public class VolumeRecoveryPointInfo implements Serializable {

    private String volumeARN;

    private Long volumeSizeInBytes;

    private Long volumeUsageInBytes;

    private String volumeRecoveryPointTime;

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
    public VolumeRecoveryPointInfo withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
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
    public VolumeRecoveryPointInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * Returns the value of the VolumeUsageInBytes property for this object.
     *
     * @return The value of the VolumeUsageInBytes property for this object.
     */
    public Long getVolumeUsageInBytes() {
        return volumeUsageInBytes;
    }
    
    /**
     * Sets the value of the VolumeUsageInBytes property for this object.
     *
     * @param volumeUsageInBytes The new value for the VolumeUsageInBytes property for this object.
     */
    public void setVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
    }
    
    /**
     * Sets the value of the VolumeUsageInBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeUsageInBytes The new value for the VolumeUsageInBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeRecoveryPointInfo withVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
        return this;
    }

    /**
     * Returns the value of the VolumeRecoveryPointTime property for this
     * object.
     *
     * @return The value of the VolumeRecoveryPointTime property for this object.
     */
    public String getVolumeRecoveryPointTime() {
        return volumeRecoveryPointTime;
    }
    
    /**
     * Sets the value of the VolumeRecoveryPointTime property for this
     * object.
     *
     * @param volumeRecoveryPointTime The new value for the VolumeRecoveryPointTime property for this
     *         object.
     */
    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }
    
    /**
     * Sets the value of the VolumeRecoveryPointTime property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeRecoveryPointTime The new value for the VolumeRecoveryPointTime property for this
     *         object.
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
        if (getVolumeARN() != null) sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeSizeInBytes() != null) sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getVolumeUsageInBytes() != null) sb.append("VolumeUsageInBytes: " + getVolumeUsageInBytes() + ",");
        if (getVolumeRecoveryPointTime() != null) sb.append("VolumeRecoveryPointTime: " + getVolumeRecoveryPointTime() );
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
    