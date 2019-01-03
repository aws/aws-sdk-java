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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of device events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeviceEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of device event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of the event.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The type of device event.
     * </p>
     * 
     * @param type
     *        The type of device event.
     * @see DeviceEventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * 
     * @return The type of device event.
     * @see DeviceEventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * 
     * @param type
     *        The type of device event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceEventType
     */

    public DeviceEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * 
     * @param type
     *        The type of device event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceEventType
     */

    public DeviceEvent withType(DeviceEventType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of the event.
     * </p>
     * 
     * @param value
     *        The value of the event.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the event.
     * </p>
     * 
     * @return The value of the event.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the event.
     * </p>
     * 
     * @param value
     *        The value of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceEvent withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     * 
     * @param timestamp
     *        The time (in epoch) when the event occurred.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     * 
     * @return The time (in epoch) when the event occurred.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     * 
     * @param timestamp
     *        The time (in epoch) when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
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
        com.amazonaws.services.alexaforbusiness.model.transform.DeviceEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
