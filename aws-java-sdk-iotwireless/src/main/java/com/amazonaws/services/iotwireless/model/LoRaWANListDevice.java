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
 * LoRaWAN object for list functions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANListDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANListDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DevEUI value.
     * </p>
     */
    private String devEui;

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @param devEui
     *        The DevEUI value.
     */

    public void setDevEui(String devEui) {
        this.devEui = devEui;
    }

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @return The DevEUI value.
     */

    public String getDevEui() {
        return this.devEui;
    }

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @param devEui
     *        The DevEUI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANListDevice withDevEui(String devEui) {
        setDevEui(devEui);
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
        if (getDevEui() != null)
            sb.append("DevEui: ").append(getDevEui());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANListDevice == false)
            return false;
        LoRaWANListDevice other = (LoRaWANListDevice) obj;
        if (other.getDevEui() == null ^ this.getDevEui() == null)
            return false;
        if (other.getDevEui() != null && other.getDevEui().equals(this.getDevEui()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEui() == null) ? 0 : getDevEui().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANListDevice clone() {
        try {
            return (LoRaWANListDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANListDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
