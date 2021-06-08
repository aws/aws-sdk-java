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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes how to interpret an application-defined timestamp value from an MQTT message payload and the precision of
 * that value.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamTimestamp implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The precision of the timestamp value that results from the expression described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     * <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     * 
     * @param value
     *        An expression that returns a long epoch time value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     * 
     * @return An expression that returns a long epoch time value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     * 
     * @param value
     *        An expression that returns a long epoch time value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamTimestamp withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The precision of the timestamp value that results from the expression described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     * <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @param unit
     *        The precision of the timestamp value that results from the expression described in <code>value</code>.</p>
     *        <p>
     *        Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     *        <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The precision of the timestamp value that results from the expression described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     * <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @return The precision of the timestamp value that results from the expression described in <code>value</code>
     *         .</p>
     *         <p>
     *         Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     *         <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The precision of the timestamp value that results from the expression described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     * <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @param unit
     *        The precision of the timestamp value that results from the expression described in <code>value</code>.</p>
     *        <p>
     *        Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> | <code>MICROSECONDS</code> |
     *        <code>NANOSECONDS</code>. The default is <code>MILLISECONDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamTimestamp withUnit(String unit) {
        setUnit(unit);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestreamTimestamp == false)
            return false;
        TimestreamTimestamp other = (TimestreamTimestamp) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamTimestamp clone() {
        try {
            return (TimestreamTimestamp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TimestreamTimestampMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
