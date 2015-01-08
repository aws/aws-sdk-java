/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class EbsInstanceBlockDeviceSpecification implements Serializable {

    /**
     * The ID of the Amazon EBS volume.
     */
    private String volumeId;

    /**
     * Indicates whether the volume is deleted on instance termination.
     */
    private Boolean deleteOnTermination;

    /**
     * The ID of the Amazon EBS volume.
     *
     * @return The ID of the Amazon EBS volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume.
     *
     * @param volumeId The ID of the Amazon EBS volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the Amazon EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EbsInstanceBlockDeviceSpecification withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * Indicates whether the volume is deleted on instance termination.
     *
     * @return Indicates whether the volume is deleted on instance termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether the volume is deleted on instance termination.
     *
     * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether the volume is deleted on instance termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EbsInstanceBlockDeviceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Indicates whether the volume is deleted on instance termination.
     *
     * @return Indicates whether the volume is deleted on instance termination.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EbsInstanceBlockDeviceSpecification == false) return false;
        EbsInstanceBlockDeviceSpecification other = (EbsInstanceBlockDeviceSpecification)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
}
    