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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#detachVolume(DetachVolumeRequest) DetachVolume operation}.
 * <p>
 * Detach a previously attached volume from a running instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#detachVolume(DetachVolumeRequest)
 */
public class DetachVolumeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the volume to detach.
     */
    private String volumeId;

    /**
     * The ID of the instance from which to detach the the specified volume.
     */
    private String instanceId;

    /**
     * The device name to which the volume is attached on the specified
     * instance.
     */
    private String device;

    /**
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (logging into an instance, unmounting the volume, and
     * detaching normally). <p> This option can lead to data loss or a
     * corrupted file system. Use this option only as a last resort to detach
     * a volume from a failed instance. The instance will not have an
     * opportunity to flush file system caches nor file system meta data. If
     * you use this option, you must perform file system check and repair
     * procedures.
     */
    private Boolean force;

    /**
     * Default constructor for a new DetachVolumeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DetachVolumeRequest() {}
    
    /**
     * Constructs a new DetachVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeId The ID of the volume to detach.
     */
    public DetachVolumeRequest(String volumeId) {
        this.volumeId = volumeId;
    }

    
    
    /**
     * The ID of the volume to detach.
     *
     * @return The ID of the volume to detach.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume to detach.
     *
     * @param volumeId The ID of the volume to detach.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume to detach.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume to detach.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * The ID of the instance from which to detach the the specified volume.
     *
     * @return The ID of the instance from which to detach the the specified volume.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance from which to detach the the specified volume.
     *
     * @param instanceId The ID of the instance from which to detach the the specified volume.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance from which to detach the the specified volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance from which to detach the the specified volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVolumeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The device name to which the volume is attached on the specified
     * instance.
     *
     * @return The device name to which the volume is attached on the specified
     *         instance.
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * The device name to which the volume is attached on the specified
     * instance.
     *
     * @param device The device name to which the volume is attached on the specified
     *         instance.
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * The device name to which the volume is attached on the specified
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device The device name to which the volume is attached on the specified
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVolumeRequest withDevice(String device) {
        this.device = device;
        return this;
    }
    
    
    /**
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (logging into an instance, unmounting the volume, and
     * detaching normally). <p> This option can lead to data loss or a
     * corrupted file system. Use this option only as a last resort to detach
     * a volume from a failed instance. The instance will not have an
     * opportunity to flush file system caches nor file system meta data. If
     * you use this option, you must perform file system check and repair
     * procedures.
     *
     * @return Forces detachment if the previous detachment attempt did not occur
     *         cleanly (logging into an instance, unmounting the volume, and
     *         detaching normally). <p> This option can lead to data loss or a
     *         corrupted file system. Use this option only as a last resort to detach
     *         a volume from a failed instance. The instance will not have an
     *         opportunity to flush file system caches nor file system meta data. If
     *         you use this option, you must perform file system check and repair
     *         procedures.
     */
    public Boolean isForce() {
        return force;
    }
    
    /**
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (logging into an instance, unmounting the volume, and
     * detaching normally). <p> This option can lead to data loss or a
     * corrupted file system. Use this option only as a last resort to detach
     * a volume from a failed instance. The instance will not have an
     * opportunity to flush file system caches nor file system meta data. If
     * you use this option, you must perform file system check and repair
     * procedures.
     *
     * @param force Forces detachment if the previous detachment attempt did not occur
     *         cleanly (logging into an instance, unmounting the volume, and
     *         detaching normally). <p> This option can lead to data loss or a
     *         corrupted file system. Use this option only as a last resort to detach
     *         a volume from a failed instance. The instance will not have an
     *         opportunity to flush file system caches nor file system meta data. If
     *         you use this option, you must perform file system check and repair
     *         procedures.
     */
    public void setForce(Boolean force) {
        this.force = force;
    }
    
    /**
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (logging into an instance, unmounting the volume, and
     * detaching normally). <p> This option can lead to data loss or a
     * corrupted file system. Use this option only as a last resort to detach
     * a volume from a failed instance. The instance will not have an
     * opportunity to flush file system caches nor file system meta data. If
     * you use this option, you must perform file system check and repair
     * procedures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force Forces detachment if the previous detachment attempt did not occur
     *         cleanly (logging into an instance, unmounting the volume, and
     *         detaching normally). <p> This option can lead to data loss or a
     *         corrupted file system. Use this option only as a last resort to detach
     *         a volume from a failed instance. The instance will not have an
     *         opportunity to flush file system caches nor file system meta data. If
     *         you use this option, you must perform file system check and repair
     *         procedures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVolumeRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }
    
    
    /**
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (logging into an instance, unmounting the volume, and
     * detaching normally). <p> This option can lead to data loss or a
     * corrupted file system. Use this option only as a last resort to detach
     * a volume from a failed instance. The instance will not have an
     * opportunity to flush file system caches nor file system meta data. If
     * you use this option, you must perform file system check and repair
     * procedures.
     *
     * @return Forces detachment if the previous detachment attempt did not occur
     *         cleanly (logging into an instance, unmounting the volume, and
     *         detaching normally). <p> This option can lead to data loss or a
     *         corrupted file system. Use this option only as a last resort to detach
     *         a volume from a failed instance. The instance will not have an
     *         opportunity to flush file system caches nor file system meta data. If
     *         you use this option, you must perform file system check and repair
     *         procedures.
     */
    public Boolean getForce() {
        return force;
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
        if (volumeId != null) sb.append("VolumeId: " + volumeId + ", ");
        if (instanceId != null) sb.append("InstanceId: " + instanceId + ", ");
        if (device != null) sb.append("Device: " + device + ", ");
        if (force != null) sb.append("Force: " + force + ", ");
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
        hashCode = prime * hashCode + ((isForce() == null) ? 0 : isForce().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DetachVolumeRequest == false) return false;
        DetachVolumeRequest other = (DetachVolumeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getDevice() == null ^ this.getDevice() == null) return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false) return false; 
        if (other.isForce() == null ^ this.isForce() == null) return false;
        if (other.isForce() != null && other.isForce().equals(this.isForce()) == false) return false; 
        return true;
    }
    
}
    