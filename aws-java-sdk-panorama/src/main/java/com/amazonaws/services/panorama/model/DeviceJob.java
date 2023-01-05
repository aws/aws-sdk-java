/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A job that runs on a device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeviceJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The ID of the target device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The name of the target device
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The job's ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The job's type.
     * </p>
     */
    private String jobType;

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param createdTime
     *        When the job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @return When the job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param createdTime
     *        When the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceJob withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ID of the target device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the target device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the target device.
     * </p>
     * 
     * @return The ID of the target device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the target device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the target device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceJob withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The name of the target device
     * </p>
     * 
     * @param deviceName
     *        The name of the target device
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the target device
     * </p>
     * 
     * @return The name of the target device
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the target device
     * </p>
     * 
     * @param deviceName
     *        The name of the target device
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceJob withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param jobId
     *        The job's ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @return The job's ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param jobId
     *        The job's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceJob withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @param jobType
     *        The job's type.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @return The job's type.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @param jobType
     *        The job's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public DeviceJob withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @param jobType
     *        The job's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public DeviceJob withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceJob == false)
            return false;
        DeviceJob other = (DeviceJob) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        return hashCode;
    }

    @Override
    public DeviceJob clone() {
        try {
            return (DeviceJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.DeviceJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
