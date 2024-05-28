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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a queue summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/QueueSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueueSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason the queue is blocked, if applicable.
     * </p>
     */
    private String blockedReason;
    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The default action taken on a queue summary if a budget wasn't configured.
     * </p>
     */
    private String defaultBudgetAction;
    /**
     * <p>
     * The display name of the queue summary to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The queue ID.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * That status of the queue.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The reason the queue is blocked, if applicable.
     * </p>
     * 
     * @param blockedReason
     *        The reason the queue is blocked, if applicable.
     * @see QueueBlockedReason
     */

    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
    }

    /**
     * <p>
     * The reason the queue is blocked, if applicable.
     * </p>
     * 
     * @return The reason the queue is blocked, if applicable.
     * @see QueueBlockedReason
     */

    public String getBlockedReason() {
        return this.blockedReason;
    }

    /**
     * <p>
     * The reason the queue is blocked, if applicable.
     * </p>
     * 
     * @param blockedReason
     *        The reason the queue is blocked, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueBlockedReason
     */

    public QueueSummary withBlockedReason(String blockedReason) {
        setBlockedReason(blockedReason);
        return this;
    }

    /**
     * <p>
     * The reason the queue is blocked, if applicable.
     * </p>
     * 
     * @param blockedReason
     *        The reason the queue is blocked, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueBlockedReason
     */

    public QueueSummary withBlockedReason(QueueBlockedReason blockedReason) {
        this.blockedReason = blockedReason.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @return The user or system that created this resource.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The default action taken on a queue summary if a budget wasn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action taken on a queue summary if a budget wasn't configured.
     * @see DefaultQueueBudgetAction
     */

    public void setDefaultBudgetAction(String defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction;
    }

    /**
     * <p>
     * The default action taken on a queue summary if a budget wasn't configured.
     * </p>
     * 
     * @return The default action taken on a queue summary if a budget wasn't configured.
     * @see DefaultQueueBudgetAction
     */

    public String getDefaultBudgetAction() {
        return this.defaultBudgetAction;
    }

    /**
     * <p>
     * The default action taken on a queue summary if a budget wasn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action taken on a queue summary if a budget wasn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public QueueSummary withDefaultBudgetAction(String defaultBudgetAction) {
        setDefaultBudgetAction(defaultBudgetAction);
        return this;
    }

    /**
     * <p>
     * The default action taken on a queue summary if a budget wasn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action taken on a queue summary if a budget wasn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public QueueSummary withDefaultBudgetAction(DefaultQueueBudgetAction defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction.toString();
        return this;
    }

    /**
     * <p>
     * The display name of the queue summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the queue summary to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the queue summary to update.
     * </p>
     * 
     * @return The display name of the queue summary to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the queue summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the queue summary to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @param farmId
     *        The farm ID.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @return The farm ID.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @param farmId
     *        The farm ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @return The queue ID.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * That status of the queue.
     * </p>
     * 
     * @param status
     *        That status of the queue.
     * @see QueueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * That status of the queue.
     * </p>
     * 
     * @return That status of the queue.
     * @see QueueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * That status of the queue.
     * </p>
     * 
     * @param status
     *        That status of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public QueueSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * That status of the queue.
     * </p>
     * 
     * @param status
     *        That status of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public QueueSummary withStatus(QueueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueSummary withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getBlockedReason() != null)
            sb.append("BlockedReason: ").append(getBlockedReason()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDefaultBudgetAction() != null)
            sb.append("DefaultBudgetAction: ").append(getDefaultBudgetAction()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueSummary == false)
            return false;
        QueueSummary other = (QueueSummary) obj;
        if (other.getBlockedReason() == null ^ this.getBlockedReason() == null)
            return false;
        if (other.getBlockedReason() != null && other.getBlockedReason().equals(this.getBlockedReason()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDefaultBudgetAction() == null ^ this.getDefaultBudgetAction() == null)
            return false;
        if (other.getDefaultBudgetAction() != null && other.getDefaultBudgetAction().equals(this.getDefaultBudgetAction()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockedReason() == null) ? 0 : getBlockedReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDefaultBudgetAction() == null) ? 0 : getDefaultBudgetAction().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public QueueSummary clone() {
        try {
            return (QueueSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.QueueSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
