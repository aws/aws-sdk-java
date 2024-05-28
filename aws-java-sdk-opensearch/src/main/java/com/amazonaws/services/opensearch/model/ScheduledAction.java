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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a scheduled configuration change for an OpenSearch Service domain. This actions can be a <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">service software
 * update</a> or a <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html#auto-tune-types">blue/green
 * Auto-Tune enhancement</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the scheduled action.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of action that will be taken on the domain.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The severity of the action.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The time when the change is scheduled to happen.
     * </p>
     */
    private Long scheduledTime;
    /**
     * <p>
     * A description of the action to be taken.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     * <code>SYSTEM</code>).
     * </p>
     */
    private String scheduledBy;
    /**
     * <p>
     * The current status of the scheduled action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Whether the action is required or optional.
     * </p>
     */
    private Boolean mandatory;
    /**
     * <p>
     * Whether or not the scheduled action is cancellable.
     * </p>
     */
    private Boolean cancellable;

    /**
     * <p>
     * The unique identifier of the scheduled action.
     * </p>
     * 
     * @param id
     *        The unique identifier of the scheduled action.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the scheduled action.
     * </p>
     * 
     * @return The unique identifier of the scheduled action.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the scheduled action.
     * </p>
     * 
     * @param id
     *        The unique identifier of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAction withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of action that will be taken on the domain.
     * </p>
     * 
     * @param type
     *        The type of action that will be taken on the domain.
     * @see ActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of action that will be taken on the domain.
     * </p>
     * 
     * @return The type of action that will be taken on the domain.
     * @see ActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of action that will be taken on the domain.
     * </p>
     * 
     * @param type
     *        The type of action that will be taken on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ScheduledAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of action that will be taken on the domain.
     * </p>
     * 
     * @param type
     *        The type of action that will be taken on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ScheduledAction withType(ActionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The severity of the action.
     * </p>
     * 
     * @param severity
     *        The severity of the action.
     * @see ActionSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the action.
     * </p>
     * 
     * @return The severity of the action.
     * @see ActionSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the action.
     * </p>
     * 
     * @param severity
     *        The severity of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionSeverity
     */

    public ScheduledAction withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the action.
     * </p>
     * 
     * @param severity
     *        The severity of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionSeverity
     */

    public ScheduledAction withSeverity(ActionSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The time when the change is scheduled to happen.
     * </p>
     * 
     * @param scheduledTime
     *        The time when the change is scheduled to happen.
     */

    public void setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The time when the change is scheduled to happen.
     * </p>
     * 
     * @return The time when the change is scheduled to happen.
     */

    public Long getScheduledTime() {
        return this.scheduledTime;
    }

    /**
     * <p>
     * The time when the change is scheduled to happen.
     * </p>
     * 
     * @param scheduledTime
     *        The time when the change is scheduled to happen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAction withScheduledTime(Long scheduledTime) {
        setScheduledTime(scheduledTime);
        return this;
    }

    /**
     * <p>
     * A description of the action to be taken.
     * </p>
     * 
     * @param description
     *        A description of the action to be taken.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the action to be taken.
     * </p>
     * 
     * @return A description of the action to be taken.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the action to be taken.
     * </p>
     * 
     * @param description
     *        A description of the action to be taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     * <code>SYSTEM</code>).
     * </p>
     * 
     * @param scheduledBy
     *        Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     *        <code>SYSTEM</code>).
     * @see ScheduledBy
     */

    public void setScheduledBy(String scheduledBy) {
        this.scheduledBy = scheduledBy;
    }

    /**
     * <p>
     * Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     * <code>SYSTEM</code>).
     * </p>
     * 
     * @return Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically
     *         (<code>SYSTEM</code>).
     * @see ScheduledBy
     */

    public String getScheduledBy() {
        return this.scheduledBy;
    }

    /**
     * <p>
     * Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     * <code>SYSTEM</code>).
     * </p>
     * 
     * @param scheduledBy
     *        Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     *        <code>SYSTEM</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledBy
     */

    public ScheduledAction withScheduledBy(String scheduledBy) {
        setScheduledBy(scheduledBy);
        return this;
    }

    /**
     * <p>
     * Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     * <code>SYSTEM</code>).
     * </p>
     * 
     * @param scheduledBy
     *        Whether the action was scheduled manually (<code>CUSTOMER</code>, or by OpenSearch Service automatically (
     *        <code>SYSTEM</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledBy
     */

    public ScheduledAction withScheduledBy(ScheduledBy scheduledBy) {
        this.scheduledBy = scheduledBy.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the scheduled action.
     * </p>
     * 
     * @param status
     *        The current status of the scheduled action.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the scheduled action.
     * </p>
     * 
     * @return The current status of the scheduled action.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the scheduled action.
     * </p>
     * 
     * @param status
     *        The current status of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public ScheduledAction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the scheduled action.
     * </p>
     * 
     * @param status
     *        The current status of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public ScheduledAction withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Whether the action is required or optional.
     * </p>
     * 
     * @param mandatory
     *        Whether the action is required or optional.
     */

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    /**
     * <p>
     * Whether the action is required or optional.
     * </p>
     * 
     * @return Whether the action is required or optional.
     */

    public Boolean getMandatory() {
        return this.mandatory;
    }

    /**
     * <p>
     * Whether the action is required or optional.
     * </p>
     * 
     * @param mandatory
     *        Whether the action is required or optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAction withMandatory(Boolean mandatory) {
        setMandatory(mandatory);
        return this;
    }

    /**
     * <p>
     * Whether the action is required or optional.
     * </p>
     * 
     * @return Whether the action is required or optional.
     */

    public Boolean isMandatory() {
        return this.mandatory;
    }

    /**
     * <p>
     * Whether or not the scheduled action is cancellable.
     * </p>
     * 
     * @param cancellable
     *        Whether or not the scheduled action is cancellable.
     */

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    /**
     * <p>
     * Whether or not the scheduled action is cancellable.
     * </p>
     * 
     * @return Whether or not the scheduled action is cancellable.
     */

    public Boolean getCancellable() {
        return this.cancellable;
    }

    /**
     * <p>
     * Whether or not the scheduled action is cancellable.
     * </p>
     * 
     * @param cancellable
     *        Whether or not the scheduled action is cancellable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAction withCancellable(Boolean cancellable) {
        setCancellable(cancellable);
        return this;
    }

    /**
     * <p>
     * Whether or not the scheduled action is cancellable.
     * </p>
     * 
     * @return Whether or not the scheduled action is cancellable.
     */

    public Boolean isCancellable() {
        return this.cancellable;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: ").append(getScheduledTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getScheduledBy() != null)
            sb.append("ScheduledBy: ").append(getScheduledBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMandatory() != null)
            sb.append("Mandatory: ").append(getMandatory()).append(",");
        if (getCancellable() != null)
            sb.append("Cancellable: ").append(getCancellable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledAction == false)
            return false;
        ScheduledAction other = (ScheduledAction) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScheduledBy() == null ^ this.getScheduledBy() == null)
            return false;
        if (other.getScheduledBy() != null && other.getScheduledBy().equals(this.getScheduledBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMandatory() == null ^ this.getMandatory() == null)
            return false;
        if (other.getMandatory() != null && other.getMandatory().equals(this.getMandatory()) == false)
            return false;
        if (other.getCancellable() == null ^ this.getCancellable() == null)
            return false;
        if (other.getCancellable() != null && other.getCancellable().equals(this.getCancellable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScheduledBy() == null) ? 0 : getScheduledBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMandatory() == null) ? 0 : getMandatory().hashCode());
        hashCode = prime * hashCode + ((getCancellable() == null) ? 0 : getCancellable().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledAction clone() {
        try {
            return (ScheduledAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ScheduledActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
