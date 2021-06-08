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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A SageMaker Model Building Pipeline instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Pipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Pipeline implements Serializable, Cloneable, StructuredPojo {

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
     * The description of the pipeline.
     * </p>
     */
    private String pipelineDescription;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that created the pipeline.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the pipeline.
     * </p>
     */
    private String pipelineStatus;
    /**
     * <p>
     * The creation time of the pipeline.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that the pipeline was last modified.
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
     * A list of tags that apply to the pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public Pipeline withPipelineArn(String pipelineArn) {
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

    public Pipeline withPipelineName(String pipelineName) {
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

    public Pipeline withPipelineDisplayName(String pipelineDisplayName) {
        setPipelineDisplayName(pipelineDisplayName);
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

    public Pipeline withPipelineDescription(String pipelineDescription) {
        setPipelineDescription(pipelineDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that created the pipeline.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that created the pipeline.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that created the pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that created the pipeline.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that created the pipeline.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that created the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline.
     * </p>
     * 
     * @param pipelineStatus
     *        The status of the pipeline.
     * @see PipelineStatus
     */

    public void setPipelineStatus(String pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
    }

    /**
     * <p>
     * The status of the pipeline.
     * </p>
     * 
     * @return The status of the pipeline.
     * @see PipelineStatus
     */

    public String getPipelineStatus() {
        return this.pipelineStatus;
    }

    /**
     * <p>
     * The status of the pipeline.
     * </p>
     * 
     * @param pipelineStatus
     *        The status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public Pipeline withPipelineStatus(String pipelineStatus) {
        setPipelineStatus(pipelineStatus);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline.
     * </p>
     * 
     * @param pipelineStatus
     *        The status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public Pipeline withPipelineStatus(PipelineStatus pipelineStatus) {
        this.pipelineStatus = pipelineStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the pipeline.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the pipeline.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the pipeline.
     * </p>
     * 
     * @return The creation time of the pipeline.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the pipeline.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that the pipeline was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that the pipeline was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time that the pipeline was last modified.
     * </p>
     * 
     * @return The time that the pipeline was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time that the pipeline was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that the pipeline was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withLastModifiedTime(java.util.Date lastModifiedTime) {
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

    public Pipeline withLastRunTime(java.util.Date lastRunTime) {
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

    public Pipeline withCreatedBy(UserContext createdBy) {
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

    public Pipeline withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * A list of tags that apply to the pipeline.
     * </p>
     * 
     * @return A list of tags that apply to the pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that apply to the pipeline.
     * </p>
     * 
     * @param tags
     *        A list of tags that apply to the pipeline.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that apply to the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that apply to the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that apply to the pipeline.
     * </p>
     * 
     * @param tags
     *        A list of tags that apply to the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
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

        if (obj instanceof Pipeline == false)
            return false;
        Pipeline other = (Pipeline) obj;
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

        hashCode = prime * hashCode + ((getPipelineArn() == null) ? 0 : getPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDisplayName() == null) ? 0 : getPipelineDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDescription() == null) ? 0 : getPipelineDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineStatus() == null) ? 0 : getPipelineStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastRunTime() == null) ? 0 : getLastRunTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Pipeline clone() {
        try {
            return (Pipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
