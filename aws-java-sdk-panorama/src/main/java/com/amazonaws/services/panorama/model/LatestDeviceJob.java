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
 * Returns information about the latest device job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/LatestDeviceJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LatestDeviceJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target version of the device software.
     * </p>
     */
    private String imageVersion;
    /**
     * <p>
     * The job's type.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * Status of the latest device job.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The target version of the device software.
     * </p>
     * 
     * @param imageVersion
     *        The target version of the device software.
     */

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    /**
     * <p>
     * The target version of the device software.
     * </p>
     * 
     * @return The target version of the device software.
     */

    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * <p>
     * The target version of the device software.
     * </p>
     * 
     * @param imageVersion
     *        The target version of the device software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LatestDeviceJob withImageVersion(String imageVersion) {
        setImageVersion(imageVersion);
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

    public LatestDeviceJob withJobType(String jobType) {
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

    public LatestDeviceJob withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * Status of the latest device job.
     * </p>
     * 
     * @param status
     *        Status of the latest device job.
     * @see UpdateProgress
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the latest device job.
     * </p>
     * 
     * @return Status of the latest device job.
     * @see UpdateProgress
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the latest device job.
     * </p>
     * 
     * @param status
     *        Status of the latest device job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateProgress
     */

    public LatestDeviceJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the latest device job.
     * </p>
     * 
     * @param status
     *        Status of the latest device job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateProgress
     */

    public LatestDeviceJob withStatus(UpdateProgress status) {
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
        if (getImageVersion() != null)
            sb.append("ImageVersion: ").append(getImageVersion()).append(",");
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

        if (obj instanceof LatestDeviceJob == false)
            return false;
        LatestDeviceJob other = (LatestDeviceJob) obj;
        if (other.getImageVersion() == null ^ this.getImageVersion() == null)
            return false;
        if (other.getImageVersion() != null && other.getImageVersion().equals(this.getImageVersion()) == false)
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

        hashCode = prime * hashCode + ((getImageVersion() == null) ? 0 : getImageVersion().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LatestDeviceJob clone() {
        try {
            return (LatestDeviceJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.LatestDeviceJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
