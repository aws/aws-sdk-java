/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary about a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * The ARN of the job.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * The job's status.
     * </p>
     */
    private String autoMLJobStatus;
    /**
     * <p>
     * The job's secondary status.
     * </p>
     */
    private String autoMLJobSecondaryStatus;
    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * When the job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The failure reason.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * 
     * @param autoMLJobName
     *        The name of the object you are requesting.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * 
     * @return The name of the object you are requesting.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * 
     * @param autoMLJobName
     *        The name of the object you are requesting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobSummary withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The ARN of the job.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * 
     * @return The ARN of the job.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The ARN of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobSummary withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param autoMLJobStatus
     *        The job's status.
     * @see AutoMLJobStatus
     */

    public void setAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @return The job's status.
     * @see AutoMLJobStatus
     */

    public String getAutoMLJobStatus() {
        return this.autoMLJobStatus;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param autoMLJobStatus
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public AutoMLJobSummary withAutoMLJobStatus(String autoMLJobStatus) {
        setAutoMLJobStatus(autoMLJobStatus);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param autoMLJobStatus
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public AutoMLJobSummary withAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        The job's secondary status.
     * @see AutoMLJobSecondaryStatus
     */

    public void setAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * 
     * @return The job's secondary status.
     * @see AutoMLJobSecondaryStatus
     */

    public String getAutoMLJobSecondaryStatus() {
        return this.autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        The job's secondary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public AutoMLJobSummary withAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        setAutoMLJobSecondaryStatus(autoMLJobSecondaryStatus);
        return this;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        The job's secondary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public AutoMLJobSummary withAutoMLJobSecondaryStatus(AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param creationTime
     *        When the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @return When the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param creationTime
     *        When the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @param endTime
     *        The end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @return The end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @param endTime
     *        The end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * When the job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the job was last modified.
     * </p>
     * 
     * @return When the job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @return The failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: ").append(getAutoMLJobName()).append(",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: ").append(getAutoMLJobArn()).append(",");
        if (getAutoMLJobStatus() != null)
            sb.append("AutoMLJobStatus: ").append(getAutoMLJobStatus()).append(",");
        if (getAutoMLJobSecondaryStatus() != null)
            sb.append("AutoMLJobSecondaryStatus: ").append(getAutoMLJobSecondaryStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobSummary == false)
            return false;
        AutoMLJobSummary other = (AutoMLJobSummary) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getAutoMLJobStatus() == null ^ this.getAutoMLJobStatus() == null)
            return false;
        if (other.getAutoMLJobStatus() != null && other.getAutoMLJobStatus().equals(this.getAutoMLJobStatus()) == false)
            return false;
        if (other.getAutoMLJobSecondaryStatus() == null ^ this.getAutoMLJobSecondaryStatus() == null)
            return false;
        if (other.getAutoMLJobSecondaryStatus() != null && other.getAutoMLJobSecondaryStatus().equals(this.getAutoMLJobSecondaryStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobStatus() == null) ? 0 : getAutoMLJobStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobSecondaryStatus() == null) ? 0 : getAutoMLJobSecondaryStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobSummary clone() {
        try {
            return (AutoMLJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
