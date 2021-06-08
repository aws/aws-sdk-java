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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the device configuration for an AWS Snowcone job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/SnowconeDeviceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowconeDeviceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     */
    private WirelessConnection wirelessConnection;

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     * 
     * @param wirelessConnection
     *        Configures the wireless connection for the AWS Snowcone device.
     */

    public void setWirelessConnection(WirelessConnection wirelessConnection) {
        this.wirelessConnection = wirelessConnection;
    }

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     * 
     * @return Configures the wireless connection for the AWS Snowcone device.
     */

    public WirelessConnection getWirelessConnection() {
        return this.wirelessConnection;
    }

    /**
     * <p>
     * Configures the wireless connection for the AWS Snowcone device.
     * </p>
     * 
     * @param wirelessConnection
     *        Configures the wireless connection for the AWS Snowcone device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowconeDeviceConfiguration withWirelessConnection(WirelessConnection wirelessConnection) {
        setWirelessConnection(wirelessConnection);
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
        if (getWirelessConnection() != null)
            sb.append("WirelessConnection: ").append(getWirelessConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowconeDeviceConfiguration == false)
            return false;
        SnowconeDeviceConfiguration other = (SnowconeDeviceConfiguration) obj;
        if (other.getWirelessConnection() == null ^ this.getWirelessConnection() == null)
            return false;
        if (other.getWirelessConnection() != null && other.getWirelessConnection().equals(this.getWirelessConnection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWirelessConnection() == null) ? 0 : getWirelessConnection().hashCode());
        return hashCode;
    }

    @Override
    public SnowconeDeviceConfiguration clone() {
        try {
            return (SnowconeDeviceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.SnowconeDeviceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
