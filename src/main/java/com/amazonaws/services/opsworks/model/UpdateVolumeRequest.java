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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#updateVolume(UpdateVolumeRequest) UpdateVolume operation}.
 * <p>
 * Updates an Amazon EBS volume's name or mount point. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#updateVolume(UpdateVolumeRequest)
 */
public class UpdateVolumeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The volume ID.
     */
    private String volumeId;

    /**
     * The new name.
     */
    private String name;

    /**
     * The new mount point.
     */
    private String mountPoint;

    /**
     * The volume ID.
     *
     * @return The volume ID.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The volume ID.
     *
     * @param volumeId The volume ID.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The volume ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The volume ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The new name.
     *
     * @return The new name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The new name.
     *
     * @param name The new name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The new name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateVolumeRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The new mount point.
     *
     * @return The new mount point.
     */
    public String getMountPoint() {
        return mountPoint;
    }
    
    /**
     * The new mount point.
     *
     * @param mountPoint The new mount point.
     */
    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }
    
    /**
     * The new mount point.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoint The new mount point.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateVolumeRequest withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getMountPoint() != null) sb.append("MountPoint: " + getMountPoint() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateVolumeRequest == false) return false;
        UpdateVolumeRequest other = (UpdateVolumeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getMountPoint() == null ^ this.getMountPoint() == null) return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false) return false; 
        return true;
    }
    
}
    