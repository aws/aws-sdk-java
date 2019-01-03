/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DetachVolumeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DetachVolume.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DetachVolumeRequest> {

    /**
     * <p>
     * The device name.
     * </p>
     */
    private String device;
    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     * instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file
     * system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have
     * an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file
     * system check and repair procedures.
     * </p>
     */
    private Boolean force;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * Default constructor for DetachVolumeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DetachVolumeRequest() {
    }

    /**
     * Constructs a new DetachVolumeRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeId
     *        The ID of the volume.
     */
    public DetachVolumeRequest(String volumeId) {
        setVolumeId(volumeId);
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param device
     *        The device name.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @return The device name.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param device
     *        The device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVolumeRequest withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     * instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file
     * system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have
     * an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file
     * system check and repair procedures.
     * </p>
     * 
     * @param force
     *        Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     *        instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted
     *        file system. Use this option only as a last resort to detach a volume from a failed instance. The instance
     *        won't have an opportunity to flush file system caches or file system metadata. If you use this option, you
     *        must perform file system check and repair procedures.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     * instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file
     * system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have
     * an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file
     * system check and repair procedures.
     * </p>
     * 
     * @return Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     *         instance, unmounting the volume, and detaching normally). This option can lead to data loss or a
     *         corrupted file system. Use this option only as a last resort to detach a volume from a failed instance.
     *         The instance won't have an opportunity to flush file system caches or file system metadata. If you use
     *         this option, you must perform file system check and repair procedures.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     * instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file
     * system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have
     * an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file
     * system check and repair procedures.
     * </p>
     * 
     * @param force
     *        Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     *        instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted
     *        file system. Use this option only as a last resort to detach a volume from a failed instance. The instance
     *        won't have an opportunity to flush file system caches or file system metadata. If you use this option, you
     *        must perform file system check and repair procedures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVolumeRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     * instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file
     * system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have
     * an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file
     * system check and repair procedures.
     * </p>
     * 
     * @return Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an
     *         instance, unmounting the volume, and detaching normally). This option can lead to data loss or a
     *         corrupted file system. Use this option only as a last resort to detach a volume from a failed instance.
     *         The instance won't have an opportunity to flush file system caches or file system metadata. If you use
     *         this option, you must perform file system check and repair procedures.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVolumeRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DetachVolumeRequest> getDryRunRequest() {
        Request<DetachVolumeRequest> request = new DetachVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachVolumeRequest == false)
            return false;
        DetachVolumeRequest other = (DetachVolumeRequest) obj;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public DetachVolumeRequest clone() {
        return (DetachVolumeRequest) super.clone();
    }
}
