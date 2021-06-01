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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The log option for wireless devices. Can be used to set log level for a specific type of wireless device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WirelessDeviceLogOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessDeviceLogOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The wireless device type.
     * </p>
     */
    private String type;

    private String logLevel;

    private java.util.List<WirelessDeviceEventLogOption> events;

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @see WirelessDeviceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @return The wireless device type.
     * @see WirelessDeviceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public WirelessDeviceLogOption withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public WirelessDeviceLogOption withType(WirelessDeviceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param logLevel
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * @return
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * @param logLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public WirelessDeviceLogOption withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * @param logLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public WirelessDeviceLogOption withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<WirelessDeviceEventLogOption> getEvents() {
        return events;
    }

    /**
     * @param events
     */

    public void setEvents(java.util.Collection<WirelessDeviceEventLogOption> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<WirelessDeviceEventLogOption>(events);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceLogOption withEvents(WirelessDeviceEventLogOption... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<WirelessDeviceEventLogOption>(events.length));
        }
        for (WirelessDeviceEventLogOption ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * @param events
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceLogOption withEvents(java.util.Collection<WirelessDeviceEventLogOption> events) {
        setEvents(events);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessDeviceLogOption == false)
            return false;
        WirelessDeviceLogOption other = (WirelessDeviceLogOption) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public WirelessDeviceLogOption clone() {
        try {
            return (WirelessDeviceLogOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WirelessDeviceLogOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
