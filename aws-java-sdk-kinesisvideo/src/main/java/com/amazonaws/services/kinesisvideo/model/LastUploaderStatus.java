/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The latest status of a stream’s edge to cloud uploader job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/LastUploaderStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastUploaderStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of an uploader job’s latest status.
     * </p>
     */
    private String jobStatusDetails;
    /**
     * <p>
     * The timestamp at which the uploader job was last executed and media collected to the cloud.
     * </p>
     */
    private java.util.Date lastCollectedTime;
    /**
     * <p>
     * The timestamp at which the uploader status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The status of the latest uploader job.
     * </p>
     */
    private String uploaderStatus;

    /**
     * <p>
     * A description of an uploader job’s latest status.
     * </p>
     * 
     * @param jobStatusDetails
     *        A description of an uploader job’s latest status.
     */

    public void setJobStatusDetails(String jobStatusDetails) {
        this.jobStatusDetails = jobStatusDetails;
    }

    /**
     * <p>
     * A description of an uploader job’s latest status.
     * </p>
     * 
     * @return A description of an uploader job’s latest status.
     */

    public String getJobStatusDetails() {
        return this.jobStatusDetails;
    }

    /**
     * <p>
     * A description of an uploader job’s latest status.
     * </p>
     * 
     * @param jobStatusDetails
     *        A description of an uploader job’s latest status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastUploaderStatus withJobStatusDetails(String jobStatusDetails) {
        setJobStatusDetails(jobStatusDetails);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the uploader job was last executed and media collected to the cloud.
     * </p>
     * 
     * @param lastCollectedTime
     *        The timestamp at which the uploader job was last executed and media collected to the cloud.
     */

    public void setLastCollectedTime(java.util.Date lastCollectedTime) {
        this.lastCollectedTime = lastCollectedTime;
    }

    /**
     * <p>
     * The timestamp at which the uploader job was last executed and media collected to the cloud.
     * </p>
     * 
     * @return The timestamp at which the uploader job was last executed and media collected to the cloud.
     */

    public java.util.Date getLastCollectedTime() {
        return this.lastCollectedTime;
    }

    /**
     * <p>
     * The timestamp at which the uploader job was last executed and media collected to the cloud.
     * </p>
     * 
     * @param lastCollectedTime
     *        The timestamp at which the uploader job was last executed and media collected to the cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastUploaderStatus withLastCollectedTime(java.util.Date lastCollectedTime) {
        setLastCollectedTime(lastCollectedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the uploader status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp at which the uploader status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which the uploader status was last updated.
     * </p>
     * 
     * @return The timestamp at which the uploader status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which the uploader status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp at which the uploader status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastUploaderStatus withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The status of the latest uploader job.
     * </p>
     * 
     * @param uploaderStatus
     *        The status of the latest uploader job.
     * @see UploaderStatus
     */

    public void setUploaderStatus(String uploaderStatus) {
        this.uploaderStatus = uploaderStatus;
    }

    /**
     * <p>
     * The status of the latest uploader job.
     * </p>
     * 
     * @return The status of the latest uploader job.
     * @see UploaderStatus
     */

    public String getUploaderStatus() {
        return this.uploaderStatus;
    }

    /**
     * <p>
     * The status of the latest uploader job.
     * </p>
     * 
     * @param uploaderStatus
     *        The status of the latest uploader job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploaderStatus
     */

    public LastUploaderStatus withUploaderStatus(String uploaderStatus) {
        setUploaderStatus(uploaderStatus);
        return this;
    }

    /**
     * <p>
     * The status of the latest uploader job.
     * </p>
     * 
     * @param uploaderStatus
     *        The status of the latest uploader job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploaderStatus
     */

    public LastUploaderStatus withUploaderStatus(UploaderStatus uploaderStatus) {
        this.uploaderStatus = uploaderStatus.toString();
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
        if (getJobStatusDetails() != null)
            sb.append("JobStatusDetails: ").append(getJobStatusDetails()).append(",");
        if (getLastCollectedTime() != null)
            sb.append("LastCollectedTime: ").append(getLastCollectedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getUploaderStatus() != null)
            sb.append("UploaderStatus: ").append(getUploaderStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastUploaderStatus == false)
            return false;
        LastUploaderStatus other = (LastUploaderStatus) obj;
        if (other.getJobStatusDetails() == null ^ this.getJobStatusDetails() == null)
            return false;
        if (other.getJobStatusDetails() != null && other.getJobStatusDetails().equals(this.getJobStatusDetails()) == false)
            return false;
        if (other.getLastCollectedTime() == null ^ this.getLastCollectedTime() == null)
            return false;
        if (other.getLastCollectedTime() != null && other.getLastCollectedTime().equals(this.getLastCollectedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getUploaderStatus() == null ^ this.getUploaderStatus() == null)
            return false;
        if (other.getUploaderStatus() != null && other.getUploaderStatus().equals(this.getUploaderStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatusDetails() == null) ? 0 : getJobStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getLastCollectedTime() == null) ? 0 : getLastCollectedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getUploaderStatus() == null) ? 0 : getUploaderStatus().hashCode());
        return hashCode;
    }

    @Override
    public LastUploaderStatus clone() {
        try {
            return (LastUploaderStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.LastUploaderStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
