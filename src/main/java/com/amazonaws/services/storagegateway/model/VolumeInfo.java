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
 * Describes a storage volume.
 * </p>
 */
public class VolumeInfo {

    /**
     * The Amazon Resource Name (ARN) for the storage volume. For example,
     * the following is a valid ARN: <p>
     * ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     * <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     * (.), and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * One of the VolumeType values that indicates the configuration of the
     * storage volume, for example as a storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     */
    private String volumeType;

    /**
     * The Amazon Resource Name (ARN) for the storage volume. For example,
     * the following is a valid ARN: <p>
     * ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     * <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     * (.), and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) for the storage volume. For example,
     *         the following is a valid ARN: <p>
     *         ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     *         <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     *         (.), and hyphens (-).
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the storage volume. For example,
     * the following is a valid ARN: <p>
     * ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     * <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     * (.), and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) for the storage volume. For example,
     *         the following is a valid ARN: <p>
     *         ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     *         <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     *         (.), and hyphens (-).
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the storage volume. For example,
     * the following is a valid ARN: <p>
     * ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     * <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     * (.), and hyphens (-).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) for the storage volume. For example,
     *         the following is a valid ARN: <p>
     *         ay:us-east-1:111122223333:gateway/mygateway/volume/vol-1122AABB</code>
     *         <p><i>Valid Values</i>: 50 to 500 lowercase letters, numbers, periods
     *         (.), and hyphens (-).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeInfo withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * One of the VolumeType values that indicates the configuration of the
     * storage volume, for example as a storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @return One of the VolumeType values that indicates the configuration of the
     *         storage volume, for example as a storage volume.
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * One of the VolumeType values that indicates the configuration of the
     * storage volume, for example as a storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the VolumeType values that indicates the configuration of the
     *         storage volume, for example as a storage volume.
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * One of the VolumeType values that indicates the configuration of the
     * storage volume, for example as a storage volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the VolumeType values that indicates the configuration of the
     *         storage volume, for example as a storage volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public VolumeInfo withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    
    
    /**
     * One of the VolumeType values that indicates the configuration of the
     * storage volume, for example as a storage volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the VolumeType values that indicates the configuration of the
     *         storage volume, for example as a storage volume.
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * One of the VolumeType values that indicates the configuration of the
     * storage volume, for example as a storage volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI
     *
     * @param volumeType One of the VolumeType values that indicates the configuration of the
     *         storage volume, for example as a storage volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public VolumeInfo withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
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
        if (volumeType != null) sb.append("VolumeType: " + volumeType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof VolumeInfo == false) return false;
        VolumeInfo other = (VolumeInfo)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        return true;
    }
    
}
    