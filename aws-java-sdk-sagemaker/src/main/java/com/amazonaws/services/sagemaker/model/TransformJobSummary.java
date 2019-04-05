/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides a summary of a transform job. Multiple <code>TransformJobSummary</code> objects are returned as a list after
 * in response to a <a>ListTransformJobs</a> call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform job.
     * </p>
     */
    private String transformJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     */
    private String transformJobArn;
    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the
     * exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that
     * the job failed.
     * </p>
     */
    private java.util.Date transformEndTime;
    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The status of the transform job.
     * </p>
     */
    private String transformJobStatus;
    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job.
     */

    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * 
     * @return The name of the transform job.
     */

    public String getTransformJobName() {
        return this.transformJobName;
    }

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobSummary withTransformJobName(String transformJobName) {
        setTransformJobName(transformJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @param transformJobArn
     *        The Amazon Resource Name (ARN) of the transform job.
     */

    public void setTransformJobArn(String transformJobArn) {
        this.transformJobArn = transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transform job.
     */

    public String getTransformJobArn() {
        return this.transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @param transformJobArn
     *        The Amazon Resource Name (ARN) of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobSummary withTransformJobArn(String transformJobArn) {
        setTransformJobArn(transformJobArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the transform Job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * 
     * @return A timestamp that shows when the transform Job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the transform Job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the
     * exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that
     * the job failed.
     * </p>
     * 
     * @param transformEndTime
     *        Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is
     *        the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker
     *        detected that the job failed.
     */

    public void setTransformEndTime(java.util.Date transformEndTime) {
        this.transformEndTime = transformEndTime;
    }

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the
     * exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that
     * the job failed.
     * </p>
     * 
     * @return Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is
     *         the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker
     *         detected that the job failed.
     */

    public java.util.Date getTransformEndTime() {
        return this.transformEndTime;
    }

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the
     * exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that
     * the job failed.
     * </p>
     * 
     * @param transformEndTime
     *        Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is
     *        the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker
     *        detected that the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobSummary withTransformEndTime(java.util.Date transformEndTime) {
        setTransformEndTime(transformEndTime);
        return this;
    }

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Indicates when the transform job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     * 
     * @return Indicates when the transform job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Indicates when the transform job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * 
     * @param transformJobStatus
     *        The status of the transform job.
     * @see TransformJobStatus
     */

    public void setTransformJobStatus(String transformJobStatus) {
        this.transformJobStatus = transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * 
     * @return The status of the transform job.
     * @see TransformJobStatus
     */

    public String getTransformJobStatus() {
        return this.transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * 
     * @param transformJobStatus
     *        The status of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformJobStatus
     */

    public TransformJobSummary withTransformJobStatus(String transformJobStatus) {
        setTransformJobStatus(transformJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * 
     * @param transformJobStatus
     *        The status of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformJobStatus
     */

    public TransformJobSummary withTransformJobStatus(TransformJobStatus transformJobStatus) {
        this.transformJobStatus = transformJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the transform job failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * 
     * @return If the transform job failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the transform job failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobSummary withFailureReason(String failureReason) {
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
        if (getTransformJobName() != null)
            sb.append("TransformJobName: ").append(getTransformJobName()).append(",");
        if (getTransformJobArn() != null)
            sb.append("TransformJobArn: ").append(getTransformJobArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTransformEndTime() != null)
            sb.append("TransformEndTime: ").append(getTransformEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getTransformJobStatus() != null)
            sb.append("TransformJobStatus: ").append(getTransformJobStatus()).append(",");
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

        if (obj instanceof TransformJobSummary == false)
            return false;
        TransformJobSummary other = (TransformJobSummary) obj;
        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null && other.getTransformJobName().equals(this.getTransformJobName()) == false)
            return false;
        if (other.getTransformJobArn() == null ^ this.getTransformJobArn() == null)
            return false;
        if (other.getTransformJobArn() != null && other.getTransformJobArn().equals(this.getTransformJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTransformEndTime() == null ^ this.getTransformEndTime() == null)
            return false;
        if (other.getTransformEndTime() != null && other.getTransformEndTime().equals(this.getTransformEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getTransformJobStatus() == null ^ this.getTransformJobStatus() == null)
            return false;
        if (other.getTransformJobStatus() != null && other.getTransformJobStatus().equals(this.getTransformJobStatus()) == false)
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

        hashCode = prime * hashCode + ((getTransformJobName() == null) ? 0 : getTransformJobName().hashCode());
        hashCode = prime * hashCode + ((getTransformJobArn() == null) ? 0 : getTransformJobArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTransformEndTime() == null) ? 0 : getTransformEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getTransformJobStatus() == null) ? 0 : getTransformJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public TransformJobSummary clone() {
        try {
            return (TransformJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
