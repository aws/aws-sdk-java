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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AttachVolumeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachVolume(AttachVolumeRequest) AttachVolume operation}.
 * <p>
 * Attach a previously created volume to a running instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachVolume(AttachVolumeRequest)
 */
public class AttachVolumeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AttachVolumeRequest> {

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
     * Specifies how the device is exposed to the instance (e.g.,
     * <code>/dev/sdh</code>).
     */
    private String device;

    /**
     * Default constructor for a new AttachVolumeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttachVolumeRequest() {}
    
    /**
     * Constructs a new AttachVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeId The ID of the Amazon EBS volume. The volume and
     * instance must be within the same Availability Zone and the instance
     * must be running.
     * @param instanceId The ID of the instance to which the volume attaches.
     * The volume and instance must be within the same Availability Zone and
     * the instance must be running.
     * @param device Specifies how the device is exposed to the instance
     * (e.g., <code>/dev/sdh</code>).
     */
    public AttachVolumeRequest(String volumeId, String instanceId, String device) {
        setVolumeId(volumeId);
        setInstanceId(instanceId);
        setDevice(device);
    }

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
     * Specifies how the device is exposed to the instance (e.g.,
     * <code>/dev/sdh</code>).
     *
     * @return Specifies how the device is exposed to the instance (e.g.,
     *         <code>/dev/sdh</code>).
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * Specifies how the device is exposed to the instance (e.g.,
     * <code>/dev/sdh</code>).
     *
     * @param device Specifies how the device is exposed to the instance (e.g.,
     *         <code>/dev/sdh</code>).
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * Specifies how the device is exposed to the instance (e.g.,
     * <code>/dev/sdh</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device Specifies how the device is exposed to the instance (e.g.,
     *         <code>/dev/sdh</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachVolumeRequest withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AttachVolumeRequest> getDryRunRequest() {
        Request<AttachVolumeRequest> request = new AttachVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDevice() != null) sb.append("Device: " + getDevice() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachVolumeRequest == false) return false;
        AttachVolumeRequest other = (AttachVolumeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getDevice() == null ^ this.getDevice() == null) return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false) return false; 
        return true;
    }
    
}
    