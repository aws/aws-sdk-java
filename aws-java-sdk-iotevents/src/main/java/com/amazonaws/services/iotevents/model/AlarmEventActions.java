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
 * Contains information about one or more alarm actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AlarmEventActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmEventActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies one or more supported actions to receive notifications when the alarm state changes.
     * </p>
     */
    private java.util.List<AlarmAction> alarmActions;

    /**
     * <p>
     * Specifies one or more supported actions to receive notifications when the alarm state changes.
     * </p>
     * 
     * @return Specifies one or more supported actions to receive notifications when the alarm state changes.
     */

    public java.util.List<AlarmAction> getAlarmActions() {
        return alarmActions;
    }

    /**
     * <p>
     * Specifies one or more supported actions to receive notifications when the alarm state changes.
     * </p>
     * 
     * @param alarmActions
     *        Specifies one or more supported actions to receive notifications when the alarm state changes.
     */

    public void setAlarmActions(java.util.Collection<AlarmAction> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new java.util.ArrayList<AlarmAction>(alarmActions);
    }

    /**
     * <p>
     * Specifies one or more supported actions to receive notifications when the alarm state changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmActions(java.util.Collection)} or {@link #withAlarmActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmActions
     *        Specifies one or more supported actions to receive notifications when the alarm state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmEventActions withAlarmActions(AlarmAction... alarmActions) {
        if (this.alarmActions == null) {
            setAlarmActions(new java.util.ArrayList<AlarmAction>(alarmActions.length));
        }
        for (AlarmAction ele : alarmActions) {
            this.alarmActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more supported actions to receive notifications when the alarm state changes.
     * </p>
     * 
     * @param alarmActions
     *        Specifies one or more supported actions to receive notifications when the alarm state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmEventActions withAlarmActions(java.util.Collection<AlarmAction> alarmActions) {
        setAlarmActions(alarmActions);
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
        if (getAlarmActions() != null)
            sb.append("AlarmActions: ").append(getAlarmActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmEventActions == false)
            return false;
        AlarmEventActions other = (AlarmEventActions) obj;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        return hashCode;
    }

    @Override
    public AlarmEventActions clone() {
        try {
            return (AlarmEventActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AlarmEventActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
