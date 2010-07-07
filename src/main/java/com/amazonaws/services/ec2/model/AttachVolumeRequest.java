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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachVolume(AttachVolumeRequest) AttachVolume operation}.
 * <p>
 * Attach a previously created volume to a running instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachVolume(AttachVolumeRequest)
 */
public class AttachVolumeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone and the instance must be running.
     */
    private String volumeId;

    /**
     * The ID of the instance to which the volume attaches. The volume and
     * instance must be within the same Availability Zone and the instance
     * must be running.
     */
    private String instanceId;

    /**
     * Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     */
    private String device;

    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone and the instance must be running.
     *
     * @return The ID of the Amazon EBS volume. The volume and instance must be
     *         within the same Availability Zone and the instance must be running.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone and the instance must be running.
     *
     * @param volumeId The ID of the Amazon EBS volume. The volume and instance must be
     *         within the same Availability Zone and the instance must be running.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone and the instance must be running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the Amazon EBS volume. The volume and instance must be
     *         within the same Availability Zone and the instance must be running.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttachVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * The ID of the instance to which the volume attaches. The volume and
     * instance must be within the same Availability Zone and the instance
     * must be running.
     *
     * @return The ID of the instance to which the volume attaches. The volume and
     *         instance must be within the same Availability Zone and the instance
     *         must be running.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance to which the volume attaches. The volume and
     * instance must be within the same Availability Zone and the instance
     * must be running.
     *
     * @param instanceId The ID of the instance to which the volume attaches. The volume and
     *         instance must be within the same Availability Zone and the instance
     *         must be running.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance to which the volume attaches. The volume and
     * instance must be within the same Availability Zone and the instance
     * must be running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance to which the volume attaches. The volume and
     *         instance must be within the same Availability Zone and the instance
     *         must be running.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttachVolumeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     *
     * @return Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     *
     * @param device Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device Specifies how the device is exposed to the instance (e.g., /dev/sdh).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttachVolumeRequest withDevice(String device) {
        this.device = device;
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
        sb.append("VolumeId: " + volumeId + ", ");
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("Device: " + device + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    