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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A timestamp, and a single numerical value, which together represent a measurement at a particular point in time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DataPoint" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in epoch format, associated with a particular <code>Value</code>.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The actual value associated with a particular <code>Timestamp</code>.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The time, in epoch format, associated with a particular <code>Value</code>.
     * </p>
     * 
     * @param timestamp
     *        The time, in epoch format, associated with a particular <code>Value</code>.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in epoch format, associated with a particular <code>Value</code>.
     * </p>
     * 
     * @return The time, in epoch format, associated with a particular <code>Value</code>.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time, in epoch format, associated with a particular <code>Value</code>.
     * </p>
     * 
     * @param timestamp
     *        The time, in epoch format, associated with a particular <code>Value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPoint withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The actual value associated with a particular <code>Timestamp</code>.
     * </p>
     * 
     * @param value
     *        The actual value associated with a particular <code>Timestamp</code>.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The actual value associated with a particular <code>Timestamp</code>.
     * </p>
     * 
     * @return The actual value associated with a particular <code>Timestamp</code>.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The actual value associated with a particular <code>Timestamp</code>.
     * </p>
     * 
     * @param value
     *        The actual value associated with a particular <code>Timestamp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPoint withValue(Double value) {
        setValue(value);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPoint == false)
            return false;
        DataPoint other = (DataPoint) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DataPoint clone() {
        try {
            return (DataPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DataPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
