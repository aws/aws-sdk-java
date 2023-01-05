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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDeviceJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The device's ARN.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The device's name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The device's type.
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * For an OTA job, the target version of the device software.
     * </p>
     */
    private String imageVersion;
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
     * The job's status.
     * </p>
     */
    private String status;

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

    public DescribeDeviceJobResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param deviceArn
     *        The device's ARN.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @return The device's ARN.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param deviceArn
     *        The device's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceJobResult withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @return The device's ID.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceJobResult withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param deviceName
     *        The device's name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @return The device's name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param deviceName
     *        The device's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceJobResult withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @param deviceType
     *        The device's type.
     * @see DeviceType
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @return The device's type.
     * @see DeviceType
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @param deviceType
     *        The device's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public DescribeDeviceJobResult withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @param deviceType
     *        The device's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public DescribeDeviceJobResult withDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType.toString();
        return this;
    }

    /**
     * <p>
     * For an OTA job, the target version of the device software.
     * </p>
     * 
     * @param imageVersion
     *        For an OTA job, the target version of the device software.
     */

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    /**
     * <p>
     * For an OTA job, the target version of the device software.
     * </p>
     * 
     * @return For an OTA job, the target version of the device software.
     */

    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * <p>
     * For an OTA job, the target version of the device software.
     * </p>
     * 
     * @param imageVersion
     *        For an OTA job, the target version of the device software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceJobResult withImageVersion(String imageVersion) {
        setImageVersion(imageVersion);
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

    public DescribeDeviceJobResult withJobId(String jobId) {
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

    public DescribeDeviceJobResult withJobType(String jobType) {
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

    public DescribeDeviceJobResult withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @see UpdateProgress
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @return The job's status.
     * @see UpdateProgress
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateProgress
     */

    public DescribeDeviceJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateProgress
     */

    public DescribeDeviceJobResult withStatus(UpdateProgress status) {
        this.status = status.toString();
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getImageVersion() != null)
            sb.append("ImageVersion: ").append(getImageVersion()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceJobResult == false)
            return false;
        DescribeDeviceJobResult other = (DescribeDeviceJobResult) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getImageVersion() == null ^ this.getImageVersion() == null)
            return false;
        if (other.getImageVersion() != null && other.getImageVersion().equals(this.getImageVersion()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getImageVersion() == null) ? 0 : getImageVersion().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceJobResult clone() {
        try {
            return (DescribeDeviceJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
