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
 * <p>
 * Describes a network interface attachment.
 * </p>
 */
public class InstanceNetworkInterfaceAttachment implements Serializable {

    /**
     * The ID of the network interface attachment.
     */
    private String attachmentId;

    /**
     * The index of the device on the instance for the network interface
     * attachment.
     */
    private Integer deviceIndex;

    /**
     * The attachment state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     */
    private String status;

    /**
     * The time stamp when the attachment initiated.
     */
    private java.util.Date attachTime;

    /**
     * Indicates whether the network interface is deleted when the instance
     * is terminated.
     */
    private Boolean deleteOnTermination;

    /**
     * The ID of the network interface attachment.
     *
     * @return The ID of the network interface attachment.
     */
    public String getAttachmentId() {
        return attachmentId;
    }
    
    /**
     * The ID of the network interface attachment.
     *
     * @param attachmentId The ID of the network interface attachment.
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
    
    /**
     * The ID of the network interface attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentId The ID of the network interface attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterfaceAttachment withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * The index of the device on the instance for the network interface
     * attachment.
     *
     * @return The index of the device on the instance for the network interface
     *         attachment.
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }
    
    /**
     * The index of the device on the instance for the network interface
     * attachment.
     *
     * @param deviceIndex The index of the device on the instance for the network interface
     *         attachment.
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }
    
    /**
     * The index of the device on the instance for the network interface
     * attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceIndex The index of the device on the instance for the network interface
     *         attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterfaceAttachment withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * The attachment state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @return The attachment state.
     *
     * @see AttachmentStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The attachment state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The attachment state.
     *
     * @see AttachmentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The attachment state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The attachment state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AttachmentStatus
     */
    public InstanceNetworkInterfaceAttachment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The attachment state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The attachment state.
     *
     * @see AttachmentStatus
     */
    public void setStatus(AttachmentStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The attachment state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status The attachment state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AttachmentStatus
     */
    public InstanceNetworkInterfaceAttachment withStatus(AttachmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The time stamp when the attachment initiated.
     *
     * @return The time stamp when the attachment initiated.
     */
    public java.util.Date getAttachTime() {
        return attachTime;
    }
    
    /**
     * The time stamp when the attachment initiated.
     *
     * @param attachTime The time stamp when the attachment initiated.
     */
    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }
    
    /**
     * The time stamp when the attachment initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachTime The time stamp when the attachment initiated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterfaceAttachment withAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    /**
     * Indicates whether the network interface is deleted when the instance
     * is terminated.
     *
     * @return Indicates whether the network interface is deleted when the instance
     *         is terminated.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether the network interface is deleted when the instance
     * is terminated.
     *
     * @param deleteOnTermination Indicates whether the network interface is deleted when the instance
     *         is terminated.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether the network interface is deleted when the instance
     * is terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether the network interface is deleted when the instance
     *         is terminated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterfaceAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Indicates whether the network interface is deleted when the instance
     * is terminated.
     *
     * @return Indicates whether the network interface is deleted when the instance
     *         is terminated.
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
        if (getAttachmentId() != null) sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (getDeviceIndex() != null) sb.append("DeviceIndex: " + getDeviceIndex() + ",");
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
        
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceNetworkInterfaceAttachment == false) return false;
        InstanceNetworkInterfaceAttachment other = (InstanceNetworkInterfaceAttachment)obj;
        
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null) return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false) return false; 
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null) return false;
        if (other.getDeviceIndex() != null && other.getDeviceIndex().equals(this.getDeviceIndex()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getAttachTime() == null ^ this.getAttachTime() == null) return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
}
    