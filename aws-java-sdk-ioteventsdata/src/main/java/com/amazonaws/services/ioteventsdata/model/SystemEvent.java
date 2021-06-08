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
 * Contains information about alarm state changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/SystemEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm state
     * changes.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     */
    private StateChangeConfiguration stateChangeConfiguration;

    /**
     * <p>
     * The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm state
     * changes.
     * </p>
     * 
     * @param eventType
     *        The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm
     *        state changes.
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm state
     * changes.
     * </p>
     * 
     * @return The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm
     *         state changes.
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm state
     * changes.
     * </p>
     * 
     * @param eventType
     *        The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm
     *        state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public SystemEvent withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm state
     * changes.
     * </p>
     * 
     * @param eventType
     *        The event type. If the value is <code>STATE_CHANGE</code>, the event contains information about alarm
     *        state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public SystemEvent withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     * 
     * @param stateChangeConfiguration
     *        Contains the configuration information of alarm state changes.
     */

    public void setStateChangeConfiguration(StateChangeConfiguration stateChangeConfiguration) {
        this.stateChangeConfiguration = stateChangeConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     * 
     * @return Contains the configuration information of alarm state changes.
     */

    public StateChangeConfiguration getStateChangeConfiguration() {
        return this.stateChangeConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of alarm state changes.
     * </p>
     * 
     * @param stateChangeConfiguration
     *        Contains the configuration information of alarm state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemEvent withStateChangeConfiguration(StateChangeConfiguration stateChangeConfiguration) {
        setStateChangeConfiguration(stateChangeConfiguration);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getStateChangeConfiguration() != null)
            sb.append("StateChangeConfiguration: ").append(getStateChangeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemEvent == false)
            return false;
        SystemEvent other = (SystemEvent) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getStateChangeConfiguration() == null ^ this.getStateChangeConfiguration() == null)
            return false;
        if (other.getStateChangeConfiguration() != null && other.getStateChangeConfiguration().equals(this.getStateChangeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getStateChangeConfiguration() == null) ? 0 : getStateChangeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SystemEvent clone() {
        try {
            return (SystemEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.SystemEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
