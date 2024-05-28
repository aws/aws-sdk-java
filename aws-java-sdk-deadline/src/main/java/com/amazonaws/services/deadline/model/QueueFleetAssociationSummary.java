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
 * The details of a queue-fleet association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/QueueFleetAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueueFleetAssociationSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The fleet ID.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The queue ID.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The status of task scheduling in the queue-fleet association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–Association is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is completing
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is canceling
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>–Association has been stopped.
     * </p>
     * </li>
     * </ul>
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

    public QueueFleetAssociationSummary withCreatedAt(java.util.Date createdAt) {
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

    public QueueFleetAssociationSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @return The fleet ID.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueFleetAssociationSummary withFleetId(String fleetId) {
        setFleetId(fleetId);
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

    public QueueFleetAssociationSummary withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The status of task scheduling in the queue-fleet association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–Association is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is completing
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is canceling
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>–Association has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of task scheduling in the queue-fleet association.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–Association is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is
     *        completing current tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is
     *        canceling current tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>–Association has been stopped.
     *        </p>
     *        </li>
     * @see QueueFleetAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of task scheduling in the queue-fleet association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–Association is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is completing
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is canceling
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>–Association has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of task scheduling in the queue-fleet association.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>–Association is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is
     *         completing current tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is
     *         canceling current tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>–Association has been stopped.
     *         </p>
     *         </li>
     * @see QueueFleetAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of task scheduling in the queue-fleet association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–Association is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is completing
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is canceling
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>–Association has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of task scheduling in the queue-fleet association.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–Association is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is
     *        completing current tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is
     *        canceling current tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>–Association has been stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueFleetAssociationStatus
     */

    public QueueFleetAssociationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of task scheduling in the queue-fleet association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–Association is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is completing
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is canceling
     * current tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>–Association has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of task scheduling in the queue-fleet association.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–Association is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_SCHEDULING_AND_COMPLETE_TASKS</code>–Association has stopped scheduling new tasks and is
     *        completing current tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_SCHEDULING_AND_CANCEL_TASKS</code>–Association has stopped scheduling new tasks and is
     *        canceling current tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>–Association has been stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueFleetAssociationStatus
     */

    public QueueFleetAssociationSummary withStatus(QueueFleetAssociationStatus status) {
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

    public QueueFleetAssociationSummary withUpdatedAt(java.util.Date updatedAt) {
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

    public QueueFleetAssociationSummary withUpdatedBy(String updatedBy) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
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

        if (obj instanceof QueueFleetAssociationSummary == false)
            return false;
        QueueFleetAssociationSummary other = (QueueFleetAssociationSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public QueueFleetAssociationSummary clone() {
        try {
            return (QueueFleetAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.QueueFleetAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
