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
 * Summary of information about a processing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the processing job.
     * </p>
     */
    private String processingJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     */
    private String processingJobArn;
    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     */
    private java.util.Date processingEndTime;
    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The status of the processing job.
     * </p>
     */
    private String processingJobStatus;
    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     */
    private String exitMessage;

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job.
     */

    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * 
     * @return The name of the processing job.
     */

    public String getProcessingJobName() {
        return this.processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withProcessingJobName(String processingJobName) {
        setProcessingJobName(processingJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the processing job..
     */

    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the processing job..
     */

    public String getProcessingJobArn() {
        return this.processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the processing job..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withProcessingJobArn(String processingJobArn) {
        setProcessingJobArn(processingJobArn);
        return this;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the processing job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * 
     * @return The time at which the processing job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the processing job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * 
     * @param processingEndTime
     *        The time at which the processing job completed.
     */

    public void setProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * 
     * @return The time at which the processing job completed.
     */

    public java.util.Date getProcessingEndTime() {
        return this.processingEndTime;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * 
     * @param processingEndTime
     *        The time at which the processing job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withProcessingEndTime(java.util.Date processingEndTime) {
        setProcessingEndTime(processingEndTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates the last time the processing job was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     * 
     * @return A timestamp that indicates the last time the processing job was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates the last time the processing job was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        The status of the processing job.
     * @see ProcessingJobStatus
     */

    public void setProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @return The status of the processing job.
     * @see ProcessingJobStatus
     */

    public String getProcessingJobStatus() {
        return this.processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        The status of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingJobStatus
     */

    public ProcessingJobSummary withProcessingJobStatus(String processingJobStatus) {
        setProcessingJobStatus(processingJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        The status of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingJobStatus
     */

    public ProcessingJobSummary withProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     * 
     * @return A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     * 
     * @param exitMessage
     *        An optional string, up to one KB in size, that contains metadata from the processing container when the
     *        processing job exits.
     */

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     * 
     * @return An optional string, up to one KB in size, that contains metadata from the processing container when the
     *         processing job exits.
     */

    public String getExitMessage() {
        return this.exitMessage;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     * 
     * @param exitMessage
     *        An optional string, up to one KB in size, that contains metadata from the processing container when the
     *        processing job exits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJobSummary withExitMessage(String exitMessage) {
        setExitMessage(exitMessage);
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
        if (getProcessingJobName() != null)
            sb.append("ProcessingJobName: ").append(getProcessingJobName()).append(",");
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: ").append(getProcessingJobArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getProcessingEndTime() != null)
            sb.append("ProcessingEndTime: ").append(getProcessingEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getProcessingJobStatus() != null)
            sb.append("ProcessingJobStatus: ").append(getProcessingJobStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getExitMessage() != null)
            sb.append("ExitMessage: ").append(getExitMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingJobSummary == false)
            return false;
        ProcessingJobSummary other = (ProcessingJobSummary) obj;
        if (other.getProcessingJobName() == null ^ this.getProcessingJobName() == null)
            return false;
        if (other.getProcessingJobName() != null && other.getProcessingJobName().equals(this.getProcessingJobName()) == false)
            return false;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getProcessingEndTime() == null ^ this.getProcessingEndTime() == null)
            return false;
        if (other.getProcessingEndTime() != null && other.getProcessingEndTime().equals(this.getProcessingEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getProcessingJobStatus() == null ^ this.getProcessingJobStatus() == null)
            return false;
        if (other.getProcessingJobStatus() != null && other.getProcessingJobStatus().equals(this.getProcessingJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getExitMessage() == null ^ this.getExitMessage() == null)
            return false;
        if (other.getExitMessage() != null && other.getExitMessage().equals(this.getExitMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingJobName() == null) ? 0 : getProcessingJobName().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getProcessingEndTime() == null) ? 0 : getProcessingEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobStatus() == null) ? 0 : getProcessingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getExitMessage() == null) ? 0 : getExitMessage().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingJobSummary clone() {
        try {
            return (ProcessingJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
