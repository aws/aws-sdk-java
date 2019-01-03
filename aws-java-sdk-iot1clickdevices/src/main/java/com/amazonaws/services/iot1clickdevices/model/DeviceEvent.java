/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DeviceEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object representing the device associated with the event.
     * </p>
     */
    private Device device;
    /**
     * <p>
     * A serialized JSON object representing the device-type specific event.
     * </p>
     */
    private String stdEvent;

    /**
     * <p>
     * An object representing the device associated with the event.
     * </p>
     * 
     * @param device
     *        An object representing the device associated with the event.
     */

    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * <p>
     * An object representing the device associated with the event.
     * </p>
     * 
     * @return An object representing the device associated with the event.
     */

    public Device getDevice() {
        return this.device;
    }

    /**
     * <p>
     * An object representing the device associated with the event.
     * </p>
     * 
     * @param device
     *        An object representing the device associated with the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceEvent withDevice(Device device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * A serialized JSON object representing the device-type specific event.
     * </p>
     * 
     * @param stdEvent
     *        A serialized JSON object representing the device-type specific event.
     */

    public void setStdEvent(String stdEvent) {
        this.stdEvent = stdEvent;
    }

    /**
     * <p>
     * A serialized JSON object representing the device-type specific event.
     * </p>
     * 
     * @return A serialized JSON object representing the device-type specific event.
     */

    public String getStdEvent() {
        return this.stdEvent;
    }

    /**
     * <p>
     * A serialized JSON object representing the device-type specific event.
     * </p>
     * 
     * @param stdEvent
     *        A serialized JSON object representing the device-type specific event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceEvent withStdEvent(String stdEvent) {
        setStdEvent(stdEvent);
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
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getStdEvent() != null)
            sb.append("StdEvent: ").append(getStdEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceEvent == false)
            return false;
        DeviceEvent other = (DeviceEvent) obj;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getStdEvent() == null ^ this.getStdEvent() == null)
            return false;
        if (other.getStdEvent() != null && other.getStdEvent().equals(this.getStdEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getStdEvent() == null) ? 0 : getStdEvent().hashCode());
        return hashCode;
    }

    @Override
    public DeviceEvent clone() {
        try {
            return (DeviceEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot1clickdevices.model.transform.DeviceEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
