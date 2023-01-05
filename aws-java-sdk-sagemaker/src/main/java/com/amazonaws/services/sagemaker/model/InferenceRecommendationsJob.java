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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains a list of recommendation jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceRecommendationsJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceRecommendationsJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job description.
     * </p>
     */
    private String jobDescription;
    /**
     * <p>
     * The recommendation job type.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The status of the job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @return The name of the job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job description.
     * </p>
     * 
     * @param jobDescription
     *        The job description.
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * <p>
     * The job description.
     * </p>
     * 
     * @return The job description.
     */

    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * <p>
     * The job description.
     * </p>
     * 
     * @param jobDescription
     *        The job description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withJobDescription(String jobDescription) {
        setJobDescription(jobDescription);
        return this;
    }

    /**
     * <p>
     * The recommendation job type.
     * </p>
     * 
     * @param jobType
     *        The recommendation job type.
     * @see RecommendationJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The recommendation job type.
     * </p>
     * 
     * @return The recommendation job type.
     * @see RecommendationJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The recommendation job type.
     * </p>
     * 
     * @param jobType
     *        The recommendation job type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobType
     */

    public InferenceRecommendationsJob withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The recommendation job type.
     * </p>
     * 
     * @param jobType
     *        The recommendation job type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobType
     */

    public InferenceRecommendationsJob withJobType(RecommendationJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the recommendation job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommendation job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the recommendation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param status
     *        The status of the job.
     * @see RecommendationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @return The status of the job.
     * @see RecommendationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param status
     *        The status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public InferenceRecommendationsJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param status
     *        The status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public InferenceRecommendationsJob withStatus(RecommendationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @return A timestamp that shows when the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * 
     * @return A timestamp that shows when the job completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your
     *         behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     * 
     * @return A timestamp that shows when the job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     * 
     * @param failureReason
     *        If the job fails, provides information why the job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     * 
     * @return If the job fails, provides information why the job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     * 
     * @param failureReason
     *        If the job fails, provides information why the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJob withFailureReason(String failureReason) {
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobDescription() != null)
            sb.append("JobDescription: ").append(getJobDescription()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof InferenceRecommendationsJob == false)
            return false;
        InferenceRecommendationsJob other = (InferenceRecommendationsJob) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobDescription() == null ^ this.getJobDescription() == null)
            return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public InferenceRecommendationsJob clone() {
        try {
            return (InferenceRecommendationsJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceRecommendationsJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
