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
 * LoRaWAN router info.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANSendDataToDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANSendDataToDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Fport value.
     * </p>
     */
    private Integer fPort;

    /**
     * <p>
     * The Fport value.
     * </p>
     * 
     * @param fPort
     *        The Fport value.
     */

    public void setFPort(Integer fPort) {
        this.fPort = fPort;
    }

    /**
     * <p>
     * The Fport value.
     * </p>
     * 
     * @return The Fport value.
     */

    public Integer getFPort() {
        return this.fPort;
    }

    /**
     * <p>
     * The Fport value.
     * </p>
     * 
     * @param fPort
     *        The Fport value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANSendDataToDevice withFPort(Integer fPort) {
        setFPort(fPort);
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
        if (getFPort() != null)
            sb.append("FPort: ").append(getFPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANSendDataToDevice == false)
            return false;
        LoRaWANSendDataToDevice other = (LoRaWANSendDataToDevice) obj;
        if (other.getFPort() == null ^ this.getFPort() == null)
            return false;
        if (other.getFPort() != null && other.getFPort().equals(this.getFPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFPort() == null) ? 0 : getFPort().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANSendDataToDevice clone() {
        try {
            return (LoRaWANSendDataToDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANSendDataToDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
