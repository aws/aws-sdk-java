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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A truncated version of the <a>BatchInferenceJob</a> datatype. The <a>ListBatchInferenceJobs</a> operation returns a
 * list of batch inference job summaries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/BatchInferenceJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchInferenceJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     */
    private String batchInferenceJobArn;
    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * 
     * @param batchInferenceJobArn
     *        The Amazon Resource Name (ARN) of the batch inference job.
     */

    public void setBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the batch inference job.
     */

    public String getBatchInferenceJobArn() {
        return this.batchInferenceJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * 
     * @param batchInferenceJobArn
     *        The Amazon Resource Name (ARN) of the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobSummary withBatchInferenceJobArn(String batchInferenceJobArn) {
        setBatchInferenceJobArn(batchInferenceJobArn);
        return this;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * 
     * @param jobName
     *        The name of the batch inference job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * 
     * @return The name of the batch inference job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * 
     * @param jobName
     *        The name of the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the batch inference job. The status is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the batch inference job. The status is one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the batch inference job. The status is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time at which the batch inference job was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * 
     * @return The time at which the batch inference job was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time at which the batch inference job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The time at which the batch inference job was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * 
     * @return The time at which the batch inference job was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The time at which the batch inference job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If the batch inference job failed, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * 
     * @return If the batch inference job failed, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If the batch inference job failed, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobSummary withFailureReason(String failureReason) {
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
        if (getBatchInferenceJobArn() != null)
            sb.append("BatchInferenceJobArn: ").append(getBatchInferenceJobArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
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

        if (obj instanceof BatchInferenceJobSummary == false)
            return false;
        BatchInferenceJobSummary other = (BatchInferenceJobSummary) obj;
        if (other.getBatchInferenceJobArn() == null ^ this.getBatchInferenceJobArn() == null)
            return false;
        if (other.getBatchInferenceJobArn() != null && other.getBatchInferenceJobArn().equals(this.getBatchInferenceJobArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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

        hashCode = prime * hashCode + ((getBatchInferenceJobArn() == null) ? 0 : getBatchInferenceJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public BatchInferenceJobSummary clone() {
        try {
            return (BatchInferenceJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.BatchInferenceJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
