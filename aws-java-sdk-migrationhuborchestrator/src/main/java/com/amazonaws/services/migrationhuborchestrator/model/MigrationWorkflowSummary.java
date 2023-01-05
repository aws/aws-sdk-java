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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of a migration workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/MigrationWorkflowSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationWorkflowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     */
    private String adsApplicationConfigurationName;
    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The steps completed in the migration workflow.
     * </p>
     */
    private Integer completedSteps;
    /**
     * <p>
     * All the steps in a migration workflow.
     * </p>
     */
    private Integer totalSteps;

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @return The ID of the migration workflow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @return The name of the migration workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @return The ID of the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationConfigurationName
     *        The name of the application configured in Application Discovery Service.
     */

    public void setAdsApplicationConfigurationName(String adsApplicationConfigurationName) {
        this.adsApplicationConfigurationName = adsApplicationConfigurationName;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @return The name of the application configured in Application Discovery Service.
     */

    public String getAdsApplicationConfigurationName() {
        return this.adsApplicationConfigurationName;
    }

    /**
     * <p>
     * The name of the application configured in Application Discovery Service.
     * </p>
     * 
     * @param adsApplicationConfigurationName
     *        The name of the application configured in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withAdsApplicationConfigurationName(String adsApplicationConfigurationName) {
        setAdsApplicationConfigurationName(adsApplicationConfigurationName);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @return The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public MigrationWorkflowSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public MigrationWorkflowSummary withStatus(MigrationWorkflowStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the migration workflow was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     * 
     * @return The time at which the migration workflow was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the migration workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the migration workflow ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     * 
     * @return The time at which the migration workflow ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the migration workflow ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the migration workflow ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @return The status message of the migration workflow.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The steps completed in the migration workflow.
     * </p>
     * 
     * @param completedSteps
     *        The steps completed in the migration workflow.
     */

    public void setCompletedSteps(Integer completedSteps) {
        this.completedSteps = completedSteps;
    }

    /**
     * <p>
     * The steps completed in the migration workflow.
     * </p>
     * 
     * @return The steps completed in the migration workflow.
     */

    public Integer getCompletedSteps() {
        return this.completedSteps;
    }

    /**
     * <p>
     * The steps completed in the migration workflow.
     * </p>
     * 
     * @param completedSteps
     *        The steps completed in the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withCompletedSteps(Integer completedSteps) {
        setCompletedSteps(completedSteps);
        return this;
    }

    /**
     * <p>
     * All the steps in a migration workflow.
     * </p>
     * 
     * @param totalSteps
     *        All the steps in a migration workflow.
     */

    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    /**
     * <p>
     * All the steps in a migration workflow.
     * </p>
     * 
     * @return All the steps in a migration workflow.
     */

    public Integer getTotalSteps() {
        return this.totalSteps;
    }

    /**
     * <p>
     * All the steps in a migration workflow.
     * </p>
     * 
     * @param totalSteps
     *        All the steps in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationWorkflowSummary withTotalSteps(Integer totalSteps) {
        setTotalSteps(totalSteps);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getAdsApplicationConfigurationName() != null)
            sb.append("AdsApplicationConfigurationName: ").append(getAdsApplicationConfigurationName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCompletedSteps() != null)
            sb.append("CompletedSteps: ").append(getCompletedSteps()).append(",");
        if (getTotalSteps() != null)
            sb.append("TotalSteps: ").append(getTotalSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrationWorkflowSummary == false)
            return false;
        MigrationWorkflowSummary other = (MigrationWorkflowSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getAdsApplicationConfigurationName() == null ^ this.getAdsApplicationConfigurationName() == null)
            return false;
        if (other.getAdsApplicationConfigurationName() != null
                && other.getAdsApplicationConfigurationName().equals(this.getAdsApplicationConfigurationName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCompletedSteps() == null ^ this.getCompletedSteps() == null)
            return false;
        if (other.getCompletedSteps() != null && other.getCompletedSteps().equals(this.getCompletedSteps()) == false)
            return false;
        if (other.getTotalSteps() == null ^ this.getTotalSteps() == null)
            return false;
        if (other.getTotalSteps() != null && other.getTotalSteps().equals(this.getTotalSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAdsApplicationConfigurationName() == null) ? 0 : getAdsApplicationConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCompletedSteps() == null) ? 0 : getCompletedSteps().hashCode());
        hashCode = prime * hashCode + ((getTotalSteps() == null) ? 0 : getTotalSteps().hashCode());
        return hashCode;
    }

    @Override
    public MigrationWorkflowSummary clone() {
        try {
            return (MigrationWorkflowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.MigrationWorkflowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
