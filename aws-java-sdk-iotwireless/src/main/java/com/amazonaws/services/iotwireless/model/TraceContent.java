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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Trace content for your wireless gateway and wireless device resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TraceContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TraceContent implements Serializable, Cloneable, StructuredPojo {

    private String wirelessDeviceFrameInfo;

    private String logLevel;

    /**
     * @param wirelessDeviceFrameInfo
     * @see WirelessDeviceFrameInfo
     */

    public void setWirelessDeviceFrameInfo(String wirelessDeviceFrameInfo) {
        this.wirelessDeviceFrameInfo = wirelessDeviceFrameInfo;
    }

    /**
     * @return
     * @see WirelessDeviceFrameInfo
     */

    public String getWirelessDeviceFrameInfo() {
        return this.wirelessDeviceFrameInfo;
    }

    /**
     * @param wirelessDeviceFrameInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceFrameInfo
     */

    public TraceContent withWirelessDeviceFrameInfo(String wirelessDeviceFrameInfo) {
        setWirelessDeviceFrameInfo(wirelessDeviceFrameInfo);
        return this;
    }

    /**
     * @param wirelessDeviceFrameInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceFrameInfo
     */

    public TraceContent withWirelessDeviceFrameInfo(WirelessDeviceFrameInfo wirelessDeviceFrameInfo) {
        this.wirelessDeviceFrameInfo = wirelessDeviceFrameInfo.toString();
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

    public TraceContent withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * @param logLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public TraceContent withLogLevel(LogLevel logLevel) {
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
        if (getWirelessDeviceFrameInfo() != null)
            sb.append("WirelessDeviceFrameInfo: ").append(getWirelessDeviceFrameInfo()).append(",");
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

        if (obj instanceof TraceContent == false)
            return false;
        TraceContent other = (TraceContent) obj;
        if (other.getWirelessDeviceFrameInfo() == null ^ this.getWirelessDeviceFrameInfo() == null)
            return false;
        if (other.getWirelessDeviceFrameInfo() != null && other.getWirelessDeviceFrameInfo().equals(this.getWirelessDeviceFrameInfo()) == false)
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

        hashCode = prime * hashCode + ((getWirelessDeviceFrameInfo() == null) ? 0 : getWirelessDeviceFrameInfo().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public TraceContent clone() {
        try {
            return (TraceContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.TraceContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
