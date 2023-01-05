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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about an Amazon Braket job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/JobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Provides summary information about the primary device used by an Amazon Braket job.
     * </p>
     */
    private String device;
    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the Amazon Braket job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     * 
     * @return The date and time that the Amazon Braket job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the Amazon Braket job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Provides summary information about the primary device used by an Amazon Braket job.
     * </p>
     * 
     * @param device
     *        Provides summary information about the primary device used by an Amazon Braket job.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * Provides summary information about the primary device used by an Amazon Braket job.
     * </p>
     * 
     * @return Provides summary information about the primary device used by an Amazon Braket job.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * Provides summary information about the primary device used by an Amazon Braket job.
     * </p>
     * 
     * @param device
     *        Provides summary information about the primary device used by an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     * 
     * @param endedAt
     *        The date and time that the Amazon Braket job ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     * 
     * @return The date and time that the Amazon Braket job ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     * 
     * @param endedAt
     *        The date and time that the Amazon Braket job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the Amazon Braket job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @return The ARN of the Amazon Braket job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     * 
     * @param jobName
     *        The name of the Amazon Braket job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     * 
     * @return The name of the Amazon Braket job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     * 
     * @param jobName
     *        The name of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     * 
     * @param startedAt
     *        The date and time that the Amazon Braket job was started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     * 
     * @return The date and time that the Amazon Braket job was started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     * 
     * @param startedAt
     *        The date and time that the Amazon Braket job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Braket job.
     * @see JobPrimaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @return The status of the Amazon Braket job.
     * @see JobPrimaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobPrimaryStatus
     */

    public JobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobPrimaryStatus
     */

    public JobSummary withStatus(JobPrimaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     * 
     * @return A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket
     *         resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     * 
     * @param tags
     *        A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket
     *        resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     * 
     * @param tags
     *        A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see JobSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary clearTagsEntries() {
        this.tags = null;
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public JobSummary clone() {
        try {
            return (JobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.JobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
