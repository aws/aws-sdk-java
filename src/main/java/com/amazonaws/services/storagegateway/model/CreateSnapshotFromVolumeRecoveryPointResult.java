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
 * Create Snapshot From Volume Recovery Point Result
 */
public class CreateSnapshotFromVolumeRecoveryPointResult implements Serializable {

    private String snapshotId;

    private String volumeARN;

    private String volumeRecoveryPointTime;

    /**
     * Returns the value of the SnapshotId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return The value of the SnapshotId property for this object.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * Sets the value of the SnapshotId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The new value for the SnapshotId property for this object.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * Sets the value of the SnapshotId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The new value for the SnapshotId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

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
    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
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
    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeARN() != null) sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeRecoveryPointTime() != null) sb.append("VolumeRecoveryPointTime: " + getVolumeRecoveryPointTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSnapshotFromVolumeRecoveryPointResult == false) return false;
        CreateSnapshotFromVolumeRecoveryPointResult other = (CreateSnapshotFromVolumeRecoveryPointResult)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null) return false;
        if (other.getVolumeRecoveryPointTime() != null && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false) return false; 
        return true;
    }
    
}
    