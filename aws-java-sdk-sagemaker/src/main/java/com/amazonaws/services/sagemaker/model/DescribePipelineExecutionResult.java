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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipelineExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipelineExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     */
    private String pipelineArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionArn;
    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionDisplayName;
    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionStatus;
    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionDescription;

    private PipelineExperimentConfig pipelineExperimentConfig;
    /**
     * <p>
     * If the execution failed, a message describing why.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The time when the pipeline execution was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the pipeline execution was modified last.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext createdBy;

    private UserContext lastModifiedBy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     */

    public void setPipelineArn(String pipelineArn) {
        this.pipelineArn = pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline.
     */

    public String getPipelineArn() {
        return this.pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withPipelineArn(String pipelineArn) {
        setPipelineArn(pipelineArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public void setPipelineExecutionArn(String pipelineExecutionArn) {
        this.pipelineExecutionArn = pipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public String getPipelineExecutionArn() {
        return this.pipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withPipelineExecutionArn(String pipelineExecutionArn) {
        setPipelineExecutionArn(pipelineExecutionArn);
        return this;
    }

    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDisplayName
     *        The display name of the pipeline execution.
     */

    public void setPipelineExecutionDisplayName(String pipelineExecutionDisplayName) {
        this.pipelineExecutionDisplayName = pipelineExecutionDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     * 
     * @return The display name of the pipeline execution.
     */

    public String getPipelineExecutionDisplayName() {
        return this.pipelineExecutionDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDisplayName
     *        The display name of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withPipelineExecutionDisplayName(String pipelineExecutionDisplayName) {
        setPipelineExecutionDisplayName(pipelineExecutionDisplayName);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionStatus
     *        The status of the pipeline execution.
     * @see PipelineExecutionStatus
     */

    public void setPipelineExecutionStatus(String pipelineExecutionStatus) {
        this.pipelineExecutionStatus = pipelineExecutionStatus;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @return The status of the pipeline execution.
     * @see PipelineExecutionStatus
     */

    public String getPipelineExecutionStatus() {
        return this.pipelineExecutionStatus;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionStatus
     *        The status of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStatus
     */

    public DescribePipelineExecutionResult withPipelineExecutionStatus(String pipelineExecutionStatus) {
        setPipelineExecutionStatus(pipelineExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionStatus
     *        The status of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStatus
     */

    public DescribePipelineExecutionResult withPipelineExecutionStatus(PipelineExecutionStatus pipelineExecutionStatus) {
        this.pipelineExecutionStatus = pipelineExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDescription
     *        The description of the pipeline execution.
     */

    public void setPipelineExecutionDescription(String pipelineExecutionDescription) {
        this.pipelineExecutionDescription = pipelineExecutionDescription;
    }

    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     * 
     * @return The description of the pipeline execution.
     */

    public String getPipelineExecutionDescription() {
        return this.pipelineExecutionDescription;
    }

    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDescription
     *        The description of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withPipelineExecutionDescription(String pipelineExecutionDescription) {
        setPipelineExecutionDescription(pipelineExecutionDescription);
        return this;
    }

    /**
     * @param pipelineExperimentConfig
     */

    public void setPipelineExperimentConfig(PipelineExperimentConfig pipelineExperimentConfig) {
        this.pipelineExperimentConfig = pipelineExperimentConfig;
    }

    /**
     * @return
     */

    public PipelineExperimentConfig getPipelineExperimentConfig() {
        return this.pipelineExperimentConfig;
    }

    /**
     * @param pipelineExperimentConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withPipelineExperimentConfig(PipelineExperimentConfig pipelineExperimentConfig) {
        setPipelineExperimentConfig(pipelineExperimentConfig);
        return this;
    }

    /**
     * <p>
     * If the execution failed, a message describing why.
     * </p>
     * 
     * @param failureReason
     *        If the execution failed, a message describing why.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the execution failed, a message describing why.
     * </p>
     * 
     * @return If the execution failed, a message describing why.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the execution failed, a message describing why.
     * </p>
     * 
     * @param failureReason
     *        If the execution failed, a message describing why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The time when the pipeline execution was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the pipeline execution was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the pipeline execution was created.
     * </p>
     * 
     * @return The time when the pipeline execution was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the pipeline execution was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the pipeline execution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the pipeline execution was modified last.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the pipeline execution was modified last.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the pipeline execution was modified last.
     * </p>
     * 
     * @return The time when the pipeline execution was modified last.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the pipeline execution was modified last.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the pipeline execution was modified last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineExecutionResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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
        if (getPipelineArn() != null)
            sb.append("PipelineArn: ").append(getPipelineArn()).append(",");
        if (getPipelineExecutionArn() != null)
            sb.append("PipelineExecutionArn: ").append(getPipelineExecutionArn()).append(",");
        if (getPipelineExecutionDisplayName() != null)
            sb.append("PipelineExecutionDisplayName: ").append(getPipelineExecutionDisplayName()).append(",");
        if (getPipelineExecutionStatus() != null)
            sb.append("PipelineExecutionStatus: ").append(getPipelineExecutionStatus()).append(",");
        if (getPipelineExecutionDescription() != null)
            sb.append("PipelineExecutionDescription: ").append(getPipelineExecutionDescription()).append(",");
        if (getPipelineExperimentConfig() != null)
            sb.append("PipelineExperimentConfig: ").append(getPipelineExperimentConfig()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePipelineExecutionResult == false)
            return false;
        DescribePipelineExecutionResult other = (DescribePipelineExecutionResult) obj;
        if (other.getPipelineArn() == null ^ this.getPipelineArn() == null)
            return false;
        if (other.getPipelineArn() != null && other.getPipelineArn().equals(this.getPipelineArn()) == false)
            return false;
        if (other.getPipelineExecutionArn() == null ^ this.getPipelineExecutionArn() == null)
            return false;
        if (other.getPipelineExecutionArn() != null && other.getPipelineExecutionArn().equals(this.getPipelineExecutionArn()) == false)
            return false;
        if (other.getPipelineExecutionDisplayName() == null ^ this.getPipelineExecutionDisplayName() == null)
            return false;
        if (other.getPipelineExecutionDisplayName() != null && other.getPipelineExecutionDisplayName().equals(this.getPipelineExecutionDisplayName()) == false)
            return false;
        if (other.getPipelineExecutionStatus() == null ^ this.getPipelineExecutionStatus() == null)
            return false;
        if (other.getPipelineExecutionStatus() != null && other.getPipelineExecutionStatus().equals(this.getPipelineExecutionStatus()) == false)
            return false;
        if (other.getPipelineExecutionDescription() == null ^ this.getPipelineExecutionDescription() == null)
            return false;
        if (other.getPipelineExecutionDescription() != null && other.getPipelineExecutionDescription().equals(this.getPipelineExecutionDescription()) == false)
            return false;
        if (other.getPipelineExperimentConfig() == null ^ this.getPipelineExperimentConfig() == null)
            return false;
        if (other.getPipelineExperimentConfig() != null && other.getPipelineExperimentConfig().equals(this.getPipelineExperimentConfig()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineArn() == null) ? 0 : getPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionArn() == null) ? 0 : getPipelineExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionDisplayName() == null) ? 0 : getPipelineExecutionDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionStatus() == null) ? 0 : getPipelineExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionDescription() == null) ? 0 : getPipelineExecutionDescription().hashCode());
        hashCode = prime * hashCode + ((getPipelineExperimentConfig() == null) ? 0 : getPipelineExperimentConfig().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public DescribePipelineExecutionResult clone() {
        try {
            return (DescribePipelineExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
