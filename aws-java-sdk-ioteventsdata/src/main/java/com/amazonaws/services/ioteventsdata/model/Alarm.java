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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/Alarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alarm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     */
    private String alarmModelName;
    /**
     * <p>
     * The version of the alarm model.
     * </p>
     */
    private String alarmModelVersion;
    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     */
    private String keyValue;
    /**
     * <p>
     * Contains information about the current state of the alarm.
     * </p>
     */
    private AlarmState alarmState;
    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     */
    private Integer severity;
    /**
     * <p>
     * The time the alarm was created, in the Unix epoch format.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the alarm was last updated, in the Unix epoch format.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @param alarmModelName
     *        The name of the alarm model.
     */

    public void setAlarmModelName(String alarmModelName) {
        this.alarmModelName = alarmModelName;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @return The name of the alarm model.
     */

    public String getAlarmModelName() {
        return this.alarmModelName;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @param alarmModelName
     *        The name of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withAlarmModelName(String alarmModelName) {
        setAlarmModelName(alarmModelName);
        return this;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     */

    public void setAlarmModelVersion(String alarmModelVersion) {
        this.alarmModelVersion = alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @return The version of the alarm model.
     */

    public String getAlarmModelVersion() {
        return this.alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withAlarmModelVersion(String alarmModelVersion) {
        setAlarmModelVersion(alarmModelVersion);
        return this;
    }

    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     * 
     * @param keyValue
     *        The value of the key used as a filter to select only the alarms associated with the <a href=
     *        "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     *        >key</a>.
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     * 
     * @return The value of the key used as a filter to select only the alarms associated with the <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     *         >key</a>.
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     * 
     * @param keyValue
     *        The value of the key used as a filter to select only the alarms associated with the <a href=
     *        "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     *        >key</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withKeyValue(String keyValue) {
        setKeyValue(keyValue);
        return this;
    }

    /**
     * <p>
     * Contains information about the current state of the alarm.
     * </p>
     * 
     * @param alarmState
     *        Contains information about the current state of the alarm.
     */

    public void setAlarmState(AlarmState alarmState) {
        this.alarmState = alarmState;
    }

    /**
     * <p>
     * Contains information about the current state of the alarm.
     * </p>
     * 
     * @return Contains information about the current state of the alarm.
     */

    public AlarmState getAlarmState() {
        return this.alarmState;
    }

    /**
     * <p>
     * Contains information about the current state of the alarm.
     * </p>
     * 
     * @param alarmState
     *        Contains information about the current state of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withAlarmState(AlarmState alarmState) {
        setAlarmState(alarmState);
        return this;
    }

    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     * 
     * @param severity
     *        A non-negative integer that reflects the severity level of the alarm.
     */

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     * 
     * @return A non-negative integer that reflects the severity level of the alarm.
     */

    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * A non-negative integer that reflects the severity level of the alarm.
     * </p>
     * 
     * @param severity
     *        A non-negative integer that reflects the severity level of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withSeverity(Integer severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The time the alarm was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm was created, in the Unix epoch format.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the alarm was created, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm was created, in the Unix epoch format.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the alarm was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm was created, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the alarm was last updated, in the Unix epoch format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the alarm was last updated, in the Unix epoch format.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time the alarm was last updated, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm was last updated, in the Unix epoch format.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time the alarm was last updated, in the Unix epoch format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the alarm was last updated, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getAlarmModelName() != null)
            sb.append("AlarmModelName: ").append(getAlarmModelName()).append(",");
        if (getAlarmModelVersion() != null)
            sb.append("AlarmModelVersion: ").append(getAlarmModelVersion()).append(",");
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append(getKeyValue()).append(",");
        if (getAlarmState() != null)
            sb.append("AlarmState: ").append(getAlarmState()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alarm == false)
            return false;
        Alarm other = (Alarm) obj;
        if (other.getAlarmModelName() == null ^ this.getAlarmModelName() == null)
            return false;
        if (other.getAlarmModelName() != null && other.getAlarmModelName().equals(this.getAlarmModelName()) == false)
            return false;
        if (other.getAlarmModelVersion() == null ^ this.getAlarmModelVersion() == null)
            return false;
        if (other.getAlarmModelVersion() != null && other.getAlarmModelVersion().equals(this.getAlarmModelVersion()) == false)
            return false;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        if (other.getAlarmState() == null ^ this.getAlarmState() == null)
            return false;
        if (other.getAlarmState() != null && other.getAlarmState().equals(this.getAlarmState()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmModelName() == null) ? 0 : getAlarmModelName().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelVersion() == null) ? 0 : getAlarmModelVersion().hashCode());
        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        hashCode = prime * hashCode + ((getAlarmState() == null) ? 0 : getAlarmState().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public Alarm clone() {
        try {
            return (Alarm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.AlarmMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
