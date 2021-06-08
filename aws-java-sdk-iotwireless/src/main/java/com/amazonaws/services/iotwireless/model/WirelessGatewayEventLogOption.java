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
 * The log option for a wireless gateway event. Can be used to set log level for a specific wireless gateway event. For
 * a LoRaWAN gateway, the possible events for a log message are: CUPS_Request, Certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WirelessGatewayEventLogOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessGatewayEventLogOption implements Serializable, Cloneable, StructuredPojo {

    private String event;

    private String logLevel;

    /**
     * @param event
     * @see WirelessGatewayEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return
     * @see WirelessGatewayEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * @param event
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayEvent
     */

    public WirelessGatewayEventLogOption withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * @param event
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayEvent
     */

    public WirelessGatewayEventLogOption withEvent(WirelessGatewayEvent event) {
        this.event = event.toString();
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

    public WirelessGatewayEventLogOption withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * @param logLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public WirelessGatewayEventLogOption withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
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
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessGatewayEventLogOption == false)
            return false;
        WirelessGatewayEventLogOption other = (WirelessGatewayEventLogOption) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public WirelessGatewayEventLogOption clone() {
        try {
            return (WirelessGatewayEventLogOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WirelessGatewayEventLogOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
