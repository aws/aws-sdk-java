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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of an alarm model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AlarmModelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the alarm model.
     * </p>
     */
    private String alarmModelDescription;
    /**
     * <p>
     * The name of the alarm model.
     * </p>
     */
    private String alarmModelName;

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm model was created, in the Unix epoch format.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm model was created, in the Unix epoch format.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm model was created, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmModelSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the alarm model.
     * </p>
     * 
     * @param alarmModelDescription
     *        The description of the alarm model.
     */

    public void setAlarmModelDescription(String alarmModelDescription) {
        this.alarmModelDescription = alarmModelDescription;
    }

    /**
     * <p>
     * The description of the alarm model.
     * </p>
     * 
     * @return The description of the alarm model.
     */

    public String getAlarmModelDescription() {
        return this.alarmModelDescription;
    }

    /**
     * <p>
     * The description of the alarm model.
     * </p>
     * 
     * @param alarmModelDescription
     *        The description of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmModelSummary withAlarmModelDescription(String alarmModelDescription) {
        setAlarmModelDescription(alarmModelDescription);
        return this;
    }

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

    public AlarmModelSummary withAlarmModelName(String alarmModelName) {
        setAlarmModelName(alarmModelName);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getAlarmModelDescription() != null)
            sb.append("AlarmModelDescription: ").append(getAlarmModelDescription()).append(",");
        if (getAlarmModelName() != null)
            sb.append("AlarmModelName: ").append(getAlarmModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmModelSummary == false)
            return false;
        AlarmModelSummary other = (AlarmModelSummary) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getAlarmModelDescription() == null ^ this.getAlarmModelDescription() == null)
            return false;
        if (other.getAlarmModelDescription() != null && other.getAlarmModelDescription().equals(this.getAlarmModelDescription()) == false)
            return false;
        if (other.getAlarmModelName() == null ^ this.getAlarmModelName() == null)
            return false;
        if (other.getAlarmModelName() != null && other.getAlarmModelName().equals(this.getAlarmModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelDescription() == null) ? 0 : getAlarmModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelName() == null) ? 0 : getAlarmModelName().hashCode());
        return hashCode;
    }

    @Override
    public AlarmModelSummary clone() {
        try {
            return (AlarmModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AlarmModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
