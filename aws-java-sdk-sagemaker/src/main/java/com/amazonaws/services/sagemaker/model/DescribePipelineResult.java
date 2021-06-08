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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     */
    private String pipelineArn;
    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     */
    private String pipelineDisplayName;
    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     */
    private String pipelineDefinition;
    /**
     * <p>
     * The description of the pipeline.
     * </p>
     */
    private String pipelineDescription;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     */
    private String pipelineStatus;
    /**
     * <p>
     * The time when the pipeline was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the pipeline was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The time when the pipeline was last run.
     * </p>
     */
    private java.util.Date lastRunTime;

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

    public DescribePipelineResult withPipelineArn(String pipelineArn) {
        setPipelineArn(pipelineArn);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @param pipelineDisplayName
     *        The display name of the pipeline.
     */

    public void setPipelineDisplayName(String pipelineDisplayName) {
        this.pipelineDisplayName = pipelineDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @return The display name of the pipeline.
     */

    public String getPipelineDisplayName() {
        return this.pipelineDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @param pipelineDisplayName
     *        The display name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withPipelineDisplayName(String pipelineDisplayName) {
        setPipelineDisplayName(pipelineDisplayName);
        return this;
    }

    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     * 
     * @param pipelineDefinition
     *        The JSON pipeline definition.
     */

    public void setPipelineDefinition(String pipelineDefinition) {
        this.pipelineDefinition = pipelineDefinition;
    }

    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     * 
     * @return The JSON pipeline definition.
     */

    public String getPipelineDefinition() {
        return this.pipelineDefinition;
    }

    /**
     * <p>
     * The JSON pipeline definition.
     * </p>
     * 
     * @param pipelineDefinition
     *        The JSON pipeline definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withPipelineDefinition(String pipelineDefinition) {
        setPipelineDefinition(pipelineDefinition);
        return this;
    }

    /**
     * <p>
     * The description of the pipeline.
     * </p>
     * 
     * @param pipelineDescription
     *        The description of the pipeline.
     */

    public void setPipelineDescription(String pipelineDescription) {
        this.pipelineDescription = pipelineDescription;
    }

    /**
     * <p>
     * The description of the pipeline.
     * </p>
     * 
     * @return The description of the pipeline.
     */

    public String getPipelineDescription() {
        return this.pipelineDescription;
    }

    /**
     * <p>
     * The description of the pipeline.
     * </p>
     * 
     * @param pipelineDescription
     *        The description of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withPipelineDescription(String pipelineDescription) {
        setPipelineDescription(pipelineDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that the pipeline uses to execute.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that the pipeline uses to execute.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that the pipeline uses to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @param pipelineStatus
     *        The status of the pipeline execution.
     * @see PipelineStatus
     */

    public void setPipelineStatus(String pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @return The status of the pipeline execution.
     * @see PipelineStatus
     */

    public String getPipelineStatus() {
        return this.pipelineStatus;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @param pipelineStatus
     *        The status of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public DescribePipelineResult withPipelineStatus(String pipelineStatus) {
        setPipelineStatus(pipelineStatus);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * 
     * @param pipelineStatus
     *        The status of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public DescribePipelineResult withPipelineStatus(PipelineStatus pipelineStatus) {
        this.pipelineStatus = pipelineStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the pipeline was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the pipeline was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the pipeline was created.
     * </p>
     * 
     * @return The time when the pipeline was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the pipeline was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the pipeline was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the pipeline was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the pipeline was last modified.
     * </p>
     * 
     * @return The time when the pipeline was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the pipeline was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the pipeline was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The time when the pipeline was last run.
     * </p>
     * 
     * @param lastRunTime
     *        The time when the pipeline was last run.
     */

    public void setLastRunTime(java.util.Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    /**
     * <p>
     * The time when the pipeline was last run.
     * </p>
     * 
     * @return The time when the pipeline was last run.
     */

    public java.util.Date getLastRunTime() {
        return this.lastRunTime;
    }

    /**
     * <p>
     * The time when the pipeline was last run.
     * </p>
     * 
     * @param lastRunTime
     *        The time when the pipeline was last run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelineResult withLastRunTime(java.util.Date lastRunTime) {
        setLastRunTime(lastRunTime);
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

    public DescribePipelineResult withCreatedBy(UserContext createdBy) {
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

    public DescribePipelineResult withLastModifiedBy(UserContext lastModifiedBy) {
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineDisplayName() != null)
            sb.append("PipelineDisplayName: ").append(getPipelineDisplayName()).append(",");
        if (getPipelineDefinition() != null)
            sb.append("PipelineDefinition: ").append(getPipelineDefinition()).append(",");
        if (getPipelineDescription() != null)
            sb.append("PipelineDescription: ").append(getPipelineDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getPipelineStatus() != null)
            sb.append("PipelineStatus: ").append(getPipelineStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastRunTime() != null)
            sb.append("LastRunTime: ").append(getLastRunTime()).append(",");
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

        if (obj instanceof DescribePipelineResult == false)
            return false;
        DescribePipelineResult other = (DescribePipelineResult) obj;
        if (other.getPipelineArn() == null ^ this.getPipelineArn() == null)
            return false;
        if (other.getPipelineArn() != null && other.getPipelineArn().equals(this.getPipelineArn()) == false)
            return false;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineDisplayName() == null ^ this.getPipelineDisplayName() == null)
            return false;
        if (other.getPipelineDisplayName() != null && other.getPipelineDisplayName().equals(this.getPipelineDisplayName()) == false)
            return false;
        if (other.getPipelineDefinition() == null ^ this.getPipelineDefinition() == null)
            return false;
        if (other.getPipelineDefinition() != null && other.getPipelineDefinition().equals(this.getPipelineDefinition()) == false)
            return false;
        if (other.getPipelineDescription() == null ^ this.getPipelineDescription() == null)
            return false;
        if (other.getPipelineDescription() != null && other.getPipelineDescription().equals(this.getPipelineDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPipelineStatus() == null ^ this.getPipelineStatus() == null)
            return false;
        if (other.getPipelineStatus() != null && other.getPipelineStatus().equals(this.getPipelineStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastRunTime() == null ^ this.getLastRunTime() == null)
            return false;
        if (other.getLastRunTime() != null && other.getLastRunTime().equals(this.getLastRunTime()) == false)
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
        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDisplayName() == null) ? 0 : getPipelineDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDefinition() == null) ? 0 : getPipelineDefinition().hashCode());
        hashCode = prime * hashCode + ((getPipelineDescription() == null) ? 0 : getPipelineDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineStatus() == null) ? 0 : getPipelineStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastRunTime() == null) ? 0 : getLastRunTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public DescribePipelineResult clone() {
        try {
            return (DescribePipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
