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
 * The latest status of a stream's edge recording job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/LastRecorderStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastRecorderStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     */
    private String jobStatusDetails;
    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media stored to local disk.
     * </p>
     */
    private java.util.Date lastCollectedTime;
    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     */
    private String recorderStatus;

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     * 
     * @param jobStatusDetails
     *        A description of a recorder job’s latest status.
     */

    public void setJobStatusDetails(String jobStatusDetails) {
        this.jobStatusDetails = jobStatusDetails;
    }

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     * 
     * @return A description of a recorder job’s latest status.
     */

    public String getJobStatusDetails() {
        return this.jobStatusDetails;
    }

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     * 
     * @param jobStatusDetails
     *        A description of a recorder job’s latest status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastRecorderStatus withJobStatusDetails(String jobStatusDetails) {
        setJobStatusDetails(jobStatusDetails);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media stored to local disk.
     * </p>
     * 
     * @param lastCollectedTime
     *        The timestamp at which the recorder job was last executed and media stored to local disk.
     */

    public void setLastCollectedTime(java.util.Date lastCollectedTime) {
        this.lastCollectedTime = lastCollectedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media stored to local disk.
     * </p>
     * 
     * @return The timestamp at which the recorder job was last executed and media stored to local disk.
     */

    public java.util.Date getLastCollectedTime() {
        return this.lastCollectedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media stored to local disk.
     * </p>
     * 
     * @param lastCollectedTime
     *        The timestamp at which the recorder job was last executed and media stored to local disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastRecorderStatus withLastCollectedTime(java.util.Date lastCollectedTime) {
        setLastCollectedTime(lastCollectedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp at which the recorder status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     * 
     * @return The timestamp at which the recorder status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp at which the recorder status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastRecorderStatus withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * 
     * @param recorderStatus
     *        The status of the latest recorder job.
     * @see RecorderStatus
     */

    public void setRecorderStatus(String recorderStatus) {
        this.recorderStatus = recorderStatus;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * 
     * @return The status of the latest recorder job.
     * @see RecorderStatus
     */

    public String getRecorderStatus() {
        return this.recorderStatus;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * 
     * @param recorderStatus
     *        The status of the latest recorder job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecorderStatus
     */

    public LastRecorderStatus withRecorderStatus(String recorderStatus) {
        setRecorderStatus(recorderStatus);
        return this;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * 
     * @param recorderStatus
     *        The status of the latest recorder job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecorderStatus
     */

    public LastRecorderStatus withRecorderStatus(RecorderStatus recorderStatus) {
        this.recorderStatus = recorderStatus.toString();
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
        if (getRecorderStatus() != null)
            sb.append("RecorderStatus: ").append(getRecorderStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastRecorderStatus == false)
            return false;
        LastRecorderStatus other = (LastRecorderStatus) obj;
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
        if (other.getRecorderStatus() == null ^ this.getRecorderStatus() == null)
            return false;
        if (other.getRecorderStatus() != null && other.getRecorderStatus().equals(this.getRecorderStatus()) == false)
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
        hashCode = prime * hashCode + ((getRecorderStatus() == null) ? 0 : getRecorderStatus().hashCode());
        return hashCode;
    }

    @Override
    public LastRecorderStatus clone() {
        try {
            return (LastRecorderStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.LastRecorderStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
