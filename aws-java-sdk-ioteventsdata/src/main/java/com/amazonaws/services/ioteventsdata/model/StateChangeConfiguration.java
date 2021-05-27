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
 * Contains the configuration information of alarm state changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/StateChangeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StateChangeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     * automatically changes to the <code>NORMAL</code> state.
     * </p>
     */
    private String triggerType;

    /**
     * <p>
     * The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     * automatically changes to the <code>NORMAL</code> state.
     * </p>
     * 
     * @param triggerType
     *        The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     *        automatically changes to the <code>NORMAL</code> state.
     * @see TriggerType
     */

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * <p>
     * The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     * automatically changes to the <code>NORMAL</code> state.
     * </p>
     * 
     * @return The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     *         automatically changes to the <code>NORMAL</code> state.
     * @see TriggerType
     */

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * <p>
     * The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     * automatically changes to the <code>NORMAL</code> state.
     * </p>
     * 
     * @param triggerType
     *        The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     *        automatically changes to the <code>NORMAL</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public StateChangeConfiguration withTriggerType(String triggerType) {
        setTriggerType(triggerType);
        return this;
    }

    /**
     * <p>
     * The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     * automatically changes to the <code>NORMAL</code> state.
     * </p>
     * 
     * @param triggerType
     *        The trigger type. If the value is <code>SNOOZE_TIMEOUT</code>, the snooze duration ends and the alarm
     *        automatically changes to the <code>NORMAL</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public StateChangeConfiguration withTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType.toString();
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
        if (getTriggerType() != null)
            sb.append("TriggerType: ").append(getTriggerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StateChangeConfiguration == false)
            return false;
        StateChangeConfiguration other = (StateChangeConfiguration) obj;
        if (other.getTriggerType() == null ^ this.getTriggerType() == null)
            return false;
        if (other.getTriggerType() != null && other.getTriggerType().equals(this.getTriggerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        return hashCode;
    }

    @Override
    public StateChangeConfiguration clone() {
        try {
            return (StateChangeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.StateChangeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
