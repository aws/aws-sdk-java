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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connectivity status of the thing.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingConnectivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service; false if it is not connected.
     * </p>
     */
    private Boolean connected;
    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     * disconnected for more than a few weeks, the time value might be missing.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service; false if it is not connected.
     * </p>
     * 
     * @param connected
     *        True if the thing is connected to the AWS IoT service; false if it is not connected.
     */

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service; false if it is not connected.
     * </p>
     * 
     * @return True if the thing is connected to the AWS IoT service; false if it is not connected.
     */

    public Boolean getConnected() {
        return this.connected;
    }

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service; false if it is not connected.
     * </p>
     * 
     * @param connected
     *        True if the thing is connected to the AWS IoT service; false if it is not connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingConnectivity withConnected(Boolean connected) {
        setConnected(connected);
        return this;
    }

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service; false if it is not connected.
     * </p>
     * 
     * @return True if the thing is connected to the AWS IoT service; false if it is not connected.
     */

    public Boolean isConnected() {
        return this.connected;
    }

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     * disconnected for more than a few weeks, the time value might be missing.
     * </p>
     * 
     * @param timestamp
     *        The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     *        disconnected for more than a few weeks, the time value might be missing.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     * disconnected for more than a few weeks, the time value might be missing.
     * </p>
     * 
     * @return The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     *         disconnected for more than a few weeks, the time value might be missing.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     * disconnected for more than a few weeks, the time value might be missing.
     * </p>
     * 
     * @param timestamp
     *        The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been
     *        disconnected for more than a few weeks, the time value might be missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingConnectivity withTimestamp(Long timestamp) {
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
        if (getConnected() != null)
            sb.append("Connected: ").append(getConnected()).append(",");
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

        if (obj instanceof ThingConnectivity == false)
            return false;
        ThingConnectivity other = (ThingConnectivity) obj;
        if (other.getConnected() == null ^ this.getConnected() == null)
            return false;
        if (other.getConnected() != null && other.getConnected().equals(this.getConnected()) == false)
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

        hashCode = prime * hashCode + ((getConnected() == null) ? 0 : getConnected().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ThingConnectivity clone() {
        try {
            return (ThingConnectivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingConnectivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
