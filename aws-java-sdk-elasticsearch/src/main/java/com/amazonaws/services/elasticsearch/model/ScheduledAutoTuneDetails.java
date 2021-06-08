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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies details of the scheduled Auto-Tune action. See the <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
 * target="_blank">Developer Guide</a> for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledAutoTuneDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies timestamp for the Auto-Tune action scheduled for the domain.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * Specifies Auto-Tune action description.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * Specifies timestamp for the Auto-Tune action scheduled for the domain.
     * </p>
     * 
     * @param date
     *        Specifies timestamp for the Auto-Tune action scheduled for the domain.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * Specifies timestamp for the Auto-Tune action scheduled for the domain.
     * </p>
     * 
     * @return Specifies timestamp for the Auto-Tune action scheduled for the domain.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * Specifies timestamp for the Auto-Tune action scheduled for the domain.
     * </p>
     * 
     * @param date
     *        Specifies timestamp for the Auto-Tune action scheduled for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAutoTuneDetails withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * </p>
     * 
     * @param actionType
     *        Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * @see ScheduledAutoTuneActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * </p>
     * 
     * @return Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * @see ScheduledAutoTuneActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * </p>
     * 
     * @param actionType
     *        Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneActionType
     */

    public ScheduledAutoTuneDetails withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * </p>
     * 
     * @param actionType
     *        Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneActionType
     */

    public ScheduledAutoTuneDetails withActionType(ScheduledAutoTuneActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies Auto-Tune action description.
     * </p>
     * 
     * @param action
     *        Specifies Auto-Tune action description.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies Auto-Tune action description.
     * </p>
     * 
     * @return Specifies Auto-Tune action description.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies Auto-Tune action description.
     * </p>
     * 
     * @param action
     *        Specifies Auto-Tune action description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAutoTuneDetails withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * </p>
     * 
     * @param severity
     *        Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * @see ScheduledAutoTuneSeverityType
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * </p>
     * 
     * @return Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * @see ScheduledAutoTuneSeverityType
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * </p>
     * 
     * @param severity
     *        Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledAutoTuneSeverityType
     */

    public ScheduledAutoTuneDetails withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
     * </p>
     * 
     * @param severity
     *        Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
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
        com.amazonaws.services.elasticsearch.model.transform.ScheduledAutoTuneDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
