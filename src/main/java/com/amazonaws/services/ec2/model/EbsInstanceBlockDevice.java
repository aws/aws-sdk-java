/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An EBS volume backed block device which is attached to an instance.
 * </p>
 */
public class EbsInstanceBlockDevice {

    /**
     * The ID of the EBS volume.
     */
    private String volumeId;

    /**
     * The status of the EBS volume.
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
     *
     * @return The status of the EBS volume.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the EBS volume.
     *
     * @param status The status of the EBS volume.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EbsInstanceBlockDevice withStatus(String status) {
        this.status = status;
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
        sb.append("VolumeId: " + volumeId + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("AttachTime: " + attachTime + ", ");
        sb.append("DeleteOnTermination: " + deleteOnTermination + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    