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
 * Specifies the details of a how an EC2 EBS volume is attached to an
 * instance.
 * </p>
 */
public class VolumeAttachment {

    /**
     * 
     */
    private String volumeId;

    /**
     * 
     */
    private String instanceId;

    /**
     * How the device is exposed to the instance (e.g., /dev/sdh).
     */
    private String device;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     */
    private String state;

    /**
     * Timestamp when this attachment initiated.
     */
    private java.util.Date attachTime;

    /**
     * ` <p> Whether this volume will be deleted or not when the associated
     * instance is terminated.
     */
    private Boolean deleteOnTermination;

    /**
     * 
     *
     * @return 
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * 
     *
     * @param volumeId 
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeAttachment withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * 
     *
     * @param instanceId 
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeAttachment withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * How the device is exposed to the instance (e.g., /dev/sdh).
     *
     * @return How the device is exposed to the instance (e.g., /dev/sdh).
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * How the device is exposed to the instance (e.g., /dev/sdh).
     *
     * @param device How the device is exposed to the instance (e.g., /dev/sdh).
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * How the device is exposed to the instance (e.g., /dev/sdh).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device How the device is exposed to the instance (e.g., /dev/sdh).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeAttachment withDevice(String device) {
        this.device = device;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @return 
     *
     * @see VolumeAttachmentState
     */
    public String getState() {
        return state;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param state 
     *
     * @see VolumeAttachmentState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param state 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeAttachmentState
     */
    public VolumeAttachment withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Timestamp when this attachment initiated.
     *
     * @return Timestamp when this attachment initiated.
     */
    public java.util.Date getAttachTime() {
        return attachTime;
    }
    
    /**
     * Timestamp when this attachment initiated.
     *
     * @param attachTime Timestamp when this attachment initiated.
     */
    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }
    
    /**
     * Timestamp when this attachment initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachTime Timestamp when this attachment initiated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeAttachment withAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
        return this;
    }
    
    
    /**
     * ` <p> Whether this volume will be deleted or not when the associated
     * instance is terminated.
     *
     * @return ` <p> Whether this volume will be deleted or not when the associated
     *         instance is terminated.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * ` <p> Whether this volume will be deleted or not when the associated
     * instance is terminated.
     *
     * @param deleteOnTermination ` <p> Whether this volume will be deleted or not when the associated
     *         instance is terminated.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * ` <p> Whether this volume will be deleted or not when the associated
     * instance is terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination ` <p> Whether this volume will be deleted or not when the associated
     *         instance is terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VolumeAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }
    
    
    /**
     * ` <p> Whether this volume will be deleted or not when the associated
     * instance is terminated.
     *
     * @return ` <p> Whether this volume will be deleted or not when the associated
     *         instance is terminated.
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("Device: " + device + ", ");
        sb.append("State: " + state + ", ");
        sb.append("AttachTime: " + attachTime + ", ");
        sb.append("DeleteOnTermination: " + deleteOnTermination + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    