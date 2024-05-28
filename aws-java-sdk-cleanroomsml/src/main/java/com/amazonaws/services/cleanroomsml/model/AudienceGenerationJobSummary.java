/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the configured audience generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceGenerationJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceGenerationJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     */
    private String audienceGenerationJobArn;
    /**
     * <p>
     * The identifier of the collaboration that contains this audience generation job.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this audience generation job.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS Account that submitted the job.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job.
     */

    public void setAudienceGenerationJobArn(String audienceGenerationJobArn) {
        this.audienceGenerationJobArn = audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience generation job.
     */

    public String getAudienceGenerationJobArn() {
        return this.audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withAudienceGenerationJobArn(String audienceGenerationJobArn) {
        setAudienceGenerationJobArn(audienceGenerationJobArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the collaboration that contains this audience generation job.
     * </p>
     * 
     * @param collaborationId
     *        The identifier of the collaboration that contains this audience generation job.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The identifier of the collaboration that contains this audience generation job.
     * </p>
     * 
     * @return The identifier of the collaboration that contains this audience generation job.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The identifier of the collaboration that contains this audience generation job.
     * </p>
     * 
     * @param collaborationId
     *        The identifier of the collaboration that contains this audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this audience generation job.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that was used for this audience generation
     *        job.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this audience generation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model that was used for this audience
     *         generation job.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this audience generation job.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that was used for this audience generation
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience generation job was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     * 
     * @return The time at which the audience generation job was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience generation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @param description
     *        The description of the audience generation job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @return The description of the audience generation job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @param description
     *        The description of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @param name
     *        The name of the audience generation job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @return The name of the audience generation job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @param name
     *        The name of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS Account that submitted the job.
     * </p>
     * 
     * @param startedBy
     *        The AWS Account that submitted the job.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The AWS Account that submitted the job.
     * </p>
     * 
     * @return The AWS Account that submitted the job.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The AWS Account that submitted the job.
     * </p>
     * 
     * @param startedBy
     *        The AWS Account that submitted the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @param status
     *        The status of the audience generation job.
     * @see AudienceGenerationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @return The status of the audience generation job.
     * @see AudienceGenerationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @param status
     *        The status of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceGenerationJobStatus
     */

    public AudienceGenerationJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @param status
     *        The status of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceGenerationJobStatus
     */

    public AudienceGenerationJobSummary withStatus(AudienceGenerationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience generation job was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     * 
     * @return The most recent time at which the audience generation job was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience generation job was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getAudienceGenerationJobArn() != null)
            sb.append("AudienceGenerationJobArn: ").append(getAudienceGenerationJobArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudienceGenerationJobSummary == false)
            return false;
        AudienceGenerationJobSummary other = (AudienceGenerationJobSummary) obj;
        if (other.getAudienceGenerationJobArn() == null ^ this.getAudienceGenerationJobArn() == null)
            return false;
        if (other.getAudienceGenerationJobArn() != null && other.getAudienceGenerationJobArn().equals(this.getAudienceGenerationJobArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceGenerationJobArn() == null) ? 0 : getAudienceGenerationJobArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public AudienceGenerationJobSummary clone() {
        try {
            return (AudienceGenerationJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceGenerationJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
