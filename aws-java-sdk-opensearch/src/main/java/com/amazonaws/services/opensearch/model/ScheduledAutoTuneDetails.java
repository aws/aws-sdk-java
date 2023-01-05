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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies details about a scheduled Auto-Tune action. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
 * OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledAutoTuneDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time when the Auto-Tune action is scheduled for the domain.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * A description of the Auto-Tune action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     * <code>HIGH</code>.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The date and time when the Auto-Tune action is scheduled for the domain.
     * </p>
     * 
     * @param date
     *        The date and time when the Auto-Tune action is scheduled for the domain.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date and time when the Auto-Tune action is scheduled for the domain.
     * </p>
     * 
     * @return The date and time when the Auto-Tune action is scheduled for the domain.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date and time when the Auto-Tune action is scheduled for the domain.
     * </p>
     * 
     * @param date
     *        The date and time when the Auto-Tune action is scheduled for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAutoTuneDetails withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @param actionType
     *        The type of Auto-Tune action.
     * @see ScheduledAutoTuneActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @return The type of Auto-Tune action.
     * @see ScheduledAutoTuneActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @param actionType
     *        The type of Auto-Tune action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneActionType
     */

    public ScheduledAutoTuneDetails withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @param actionType
     *        The type of Auto-Tune action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneActionType
     */

    public ScheduledAutoTuneDetails withActionType(ScheduledAutoTuneActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the Auto-Tune action.
     * </p>
     * 
     * @param action
     *        A description of the Auto-Tune action.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * A description of the Auto-Tune action.
     * </p>
     * 
     * @return A description of the Auto-Tune action.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * A description of the Auto-Tune action.
     * </p>
     * 
     * @param action
     *        A description of the Auto-Tune action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAutoTuneDetails withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     * <code>HIGH</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     *        <code>HIGH</code>.
     * @see ScheduledAutoTuneSeverityType
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     * <code>HIGH</code>.
     * </p>
     * 
     * @return The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     *         <code>HIGH</code>.
     * @see ScheduledAutoTuneSeverityType
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     * <code>HIGH</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     *        <code>HIGH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneSeverityType
     */

    public ScheduledAutoTuneDetails withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     * <code>HIGH</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the Auto-Tune action. Valid values are <code>LOW</code>, <code>MEDIUM</code>, and
     *        <code>HIGH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneSeverityType
     */

    public ScheduledAutoTuneDetails withSeverity(ScheduledAutoTuneSeverityType severity) {
        this.severity = severity.toString();
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledAutoTuneDetails == false)
            return false;
        ScheduledAutoTuneDetails other = (ScheduledAutoTuneDetails) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledAutoTuneDetails clone() {
        try {
            return (ScheduledAutoTuneDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ScheduledAutoTuneDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
