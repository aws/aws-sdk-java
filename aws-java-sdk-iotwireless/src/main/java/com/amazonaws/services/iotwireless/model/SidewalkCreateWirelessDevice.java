/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Sidewalk object for creating a wireless device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkCreateWirelessDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkCreateWirelessDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Sidewalk device profile.
     * </p>
     */
    private String deviceProfileId;

    /**
     * <p>
     * The ID of the Sidewalk device profile.
     * </p>
     * 
     * @param deviceProfileId
     *        The ID of the Sidewalk device profile.
     */

    public void setDeviceProfileId(String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }

    /**
     * <p>
     * The ID of the Sidewalk device profile.
     * </p>
     * 
     * @return The ID of the Sidewalk device profile.
     */

    public String getDeviceProfileId() {
        return this.deviceProfileId;
    }

    /**
     * <p>
     * The ID of the Sidewalk device profile.
     * </p>
     * 
     * @param deviceProfileId
     *        The ID of the Sidewalk device profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkCreateWirelessDevice withDeviceProfileId(String deviceProfileId) {
        setDeviceProfileId(deviceProfileId);
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
        if (getDeviceProfileId() != null)
            sb.append("DeviceProfileId: ").append(getDeviceProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkCreateWirelessDevice == false)
            return false;
        SidewalkCreateWirelessDevice other = (SidewalkCreateWirelessDevice) obj;
        if (other.getDeviceProfileId() == null ^ this.getDeviceProfileId() == null)
            return false;
        if (other.getDeviceProfileId() != null && other.getDeviceProfileId().equals(this.getDeviceProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceProfileId() == null) ? 0 : getDeviceProfileId().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkCreateWirelessDevice clone() {
        try {
            return (SidewalkCreateWirelessDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkCreateWirelessDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
