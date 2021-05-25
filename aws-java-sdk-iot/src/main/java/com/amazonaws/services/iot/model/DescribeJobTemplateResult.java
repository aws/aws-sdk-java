/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     */
    private String jobTemplateArn;
    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     */
    private String jobTemplateId;
    /**
     * <p>
     * A description of the job template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     */
    private String documentSource;
    /**
     * <p>
     * The job document.
     * </p>
     */
    private String document;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     */
    private java.util.Date createdAt;

    private PresignedUrlConfig presignedUrlConfig;

    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;

    private AbortConfig abortConfig;

    private TimeoutConfig timeoutConfig;

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @param jobTemplateArn
     *        The ARN of the job template.
     */

    public void setJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @return The ARN of the job template.
     */

    public String getJobTemplateArn() {
        return this.jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @param jobTemplateArn
     *        The ARN of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withJobTemplateArn(String jobTemplateArn) {
        setJobTemplateArn(jobTemplateArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * 
     * @param jobTemplateId
     *        The unique identifier of the job template.
     */

    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * 
     * @return The unique identifier of the job template.
     */

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * 
     * @param jobTemplateId
     *        The unique identifier of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withJobTemplateId(String jobTemplateId) {
        setJobTemplateId(jobTemplateId);
        return this;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * 
     * @param description
     *        A description of the job template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * 
     * @return A description of the job template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * 
     * @param description
     *        A description of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * 
     * @param documentSource
     *        An S3 link to the job document.
     */

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * 
     * @return An S3 link to the job document.
     */

    public String getDocumentSource() {
        return this.documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * 
     * @param documentSource
     *        An S3 link to the job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withDocumentSource(String documentSource) {
        setDocumentSource(documentSource);
        return this;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * 
     * @param document
     *        The job document.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * 
     * @return The job document.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * 
     * @param document
     *        The job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param presignedUrlConfig
     */

    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * @return
     */

    public PresignedUrlConfig getPresignedUrlConfig() {
        return this.presignedUrlConfig;
    }

    /**
     * @param presignedUrlConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        setPresignedUrlConfig(presignedUrlConfig);
        return this;
    }

    /**
     * @param jobExecutionsRolloutConfig
     */

    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * @return
     */

    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    /**
     * @param jobExecutionsRolloutConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        setJobExecutionsRolloutConfig(jobExecutionsRolloutConfig);
        return this;
    }

    /**
     * @param abortConfig
     */

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * @return
     */

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    /**
     * @param abortConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withAbortConfig(AbortConfig abortConfig) {
        setAbortConfig(abortConfig);
        return this;
    }

    /**
     * @param timeoutConfig
     */

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * @return
     */

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * @param timeoutConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withTimeoutConfig(TimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
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
        if (getJobTemplateArn() != null)
            sb.append("JobTemplateArn: ").append(getJobTemplateArn()).append(",");
        if (getJobTemplateId() != null)
            sb.append("JobTemplateId: ").append(getJobTemplateId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDocumentSource() != null)
            sb.append("DocumentSource: ").append(getDocumentSource()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPresignedUrlConfig() != null)
            sb.append("PresignedUrlConfig: ").append(getPresignedUrlConfig()).append(",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("JobExecutionsRolloutConfig: ").append(getJobExecutionsRolloutConfig()).append(",");
        if (getAbortConfig() != null)
            sb.append("AbortConfig: ").append(getAbortConfig()).append(",");
        if (getTimeoutConfig() != null)
            sb.append("TimeoutConfig: ").append(getTimeoutConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobTemplateResult == false)
            return false;
        DescribeJobTemplateResult other = (DescribeJobTemplateResult) obj;
        if (other.getJobTemplateArn() == null ^ this.getJobTemplateArn() == null)
            return false;
        if (other.getJobTemplateArn() != null && other.getJobTemplateArn().equals(this.getJobTemplateArn()) == false)
            return false;
        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDocumentSource() == null ^ this.getDocumentSource() == null)
            return false;
        if (other.getDocumentSource() != null && other.getDocumentSource().equals(this.getDocumentSource()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPresignedUrlConfig() == null ^ this.getPresignedUrlConfig() == null)
            return false;
        if (other.getPresignedUrlConfig() != null && other.getPresignedUrlConfig().equals(this.getPresignedUrlConfig()) == false)
            return false;
        if (other.getJobExecutionsRolloutConfig() == null ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null && other.getJobExecutionsRolloutConfig().equals(this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAbortConfig() == null ^ this.getAbortConfig() == null)
            return false;
        if (other.getAbortConfig() != null && other.getAbortConfig().equals(this.getAbortConfig()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTemplateArn() == null) ? 0 : getJobTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobTemplateResult clone() {
        try {
            return (DescribeJobTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
