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
 * Provides information about the audience export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceExportJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceExportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that was exported.
     * </p>
     */
    private String audienceGenerationJobArn;

    private AudienceSize audienceSize;
    /**
     * <p>
     * The time at which the audience export job was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the audience export job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the audience export job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon S3 bucket where the audience export is stored.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * The status of the audience export job.
     * </p>
     */
    private String status;

    private StatusDetails statusDetails;
    /**
     * <p>
     * The most recent time at which the audience export job was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that was exported.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job that was exported.
     */

    public void setAudienceGenerationJobArn(String audienceGenerationJobArn) {
        this.audienceGenerationJobArn = audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that was exported.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience generation job that was exported.
     */

    public String getAudienceGenerationJobArn() {
        return this.audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that was exported.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job that was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withAudienceGenerationJobArn(String audienceGenerationJobArn) {
        setAudienceGenerationJobArn(audienceGenerationJobArn);
        return this;
    }

    /**
     * @param audienceSize
     */

    public void setAudienceSize(AudienceSize audienceSize) {
        this.audienceSize = audienceSize;
    }

    /**
     * @return
     */

    public AudienceSize getAudienceSize() {
        return this.audienceSize;
    }

    /**
     * @param audienceSize
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withAudienceSize(AudienceSize audienceSize) {
        setAudienceSize(audienceSize);
        return this;
    }

    /**
     * <p>
     * The time at which the audience export job was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience export job was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the audience export job was created.
     * </p>
     * 
     * @return The time at which the audience export job was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the audience export job was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the audience export job.
     * </p>
     * 
     * @param description
     *        The description of the audience export job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience export job.
     * </p>
     * 
     * @return The description of the audience export job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience export job.
     * </p>
     * 
     * @param description
     *        The description of the audience export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the audience export job.
     * </p>
     * 
     * @param name
     *        The name of the audience export job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience export job.
     * </p>
     * 
     * @return The name of the audience export job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience export job.
     * </p>
     * 
     * @param name
     *        The name of the audience export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the audience export is stored.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 bucket where the audience export is stored.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the audience export is stored.
     * </p>
     * 
     * @return The Amazon S3 bucket where the audience export is stored.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the audience export is stored.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 bucket where the audience export is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The status of the audience export job.
     * </p>
     * 
     * @param status
     *        The status of the audience export job.
     * @see AudienceExportJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the audience export job.
     * </p>
     * 
     * @return The status of the audience export job.
     * @see AudienceExportJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the audience export job.
     * </p>
     * 
     * @param status
     *        The status of the audience export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceExportJobStatus
     */

    public AudienceExportJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the audience export job.
     * </p>
     * 
     * @param status
     *        The status of the audience export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceExportJobStatus
     */

    public AudienceExportJobSummary withStatus(AudienceExportJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param statusDetails
     */

    public void setStatusDetails(StatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * @return
     */

    public StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * @param statusDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withStatusDetails(StatusDetails statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the audience export job was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience export job was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience export job was updated.
     * </p>
     * 
     * @return The most recent time at which the audience export job was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience export job was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience export job was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceExportJobSummary withUpdateTime(java.util.Date updateTime) {
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
        if (getAudienceSize() != null)
            sb.append("AudienceSize: ").append(getAudienceSize()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
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

        if (obj instanceof AudienceExportJobSummary == false)
            return false;
        AudienceExportJobSummary other = (AudienceExportJobSummary) obj;
        if (other.getAudienceGenerationJobArn() == null ^ this.getAudienceGenerationJobArn() == null)
            return false;
        if (other.getAudienceGenerationJobArn() != null && other.getAudienceGenerationJobArn().equals(this.getAudienceGenerationJobArn()) == false)
            return false;
        if (other.getAudienceSize() == null ^ this.getAudienceSize() == null)
            return false;
        if (other.getAudienceSize() != null && other.getAudienceSize().equals(this.getAudienceSize()) == false)
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
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
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
        hashCode = prime * hashCode + ((getAudienceSize() == null) ? 0 : getAudienceSize().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public AudienceExportJobSummary clone() {
        try {
            return (AudienceExportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceExportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
