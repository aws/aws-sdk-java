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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * An EBS volume backed block device which is attached to an instance.
 * </p>
 */
public class EbsInstanceBlockDevice implements Serializable {

    /**
     * The ID of the EBS volume.
     */
    private String volumeId;

    /**
     * The status of the EBS volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     */
    private String status;

    /**
     * The time at which the EBS volume was attached to the associated
     * instance.
     */
    private java.util.Date attachTime;

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     */
    private Boolean deleteOnTermination;

    /**
     * The ID of the EBS volume.
     *
     * @return The ID of the EBS volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the EBS volume.
     *
     * @param volumeId The ID of the EBS volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsInstanceBlockDevice withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The status of the EBS volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @return The status of the EBS volume.
     *
     * @see AttachmentStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the EBS volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The status of the EBS volume.
     *
     * @see AttachmentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The status of the EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AttachmentStatus
     */
    public EbsInstanceBlockDevice withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the EBS volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The status of the EBS volume.
     *
     * @see AttachmentStatus
     */
    public void setStatus(AttachmentStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The status of the EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AttachmentStatus
     */
    public EbsInstanceBlockDevice withStatus(AttachmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The time at which the EBS volume was attached to the associated
     * instance.
     *
     * @return The time at which the EBS volume was attached to the associated
     *         instance.
     */
    public java.util.Date getAttachTime() {
        return attachTime;
    }
    
    /**
     * The time at which the EBS volume was attached to the associated
     * instance.
     *
     * @param attachTime The time at which the EBS volume was attached to the associated
     *         instance.
     */
    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }
    
    /**
     * The time at which the EBS volume was attached to the associated
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachTime The time at which the EBS volume was attached to the associated
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsInstanceBlockDevice withAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @param deleteOnTermination Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsInstanceBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getAttachTime() != null) sb.append("AttachTime: " + getAttachTime() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EbsInstanceBlockDevice == false) return false;
        EbsInstanceBlockDevice other = (EbsInstanceBlockDevice)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getAttachTime() == null ^ this.getAttachTime() == null) return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
}
    