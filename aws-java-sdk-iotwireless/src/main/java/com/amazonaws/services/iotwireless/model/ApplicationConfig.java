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
 * LoRaWAN application configuration, which can be used to perform geolocation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ApplicationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationConfig implements Serializable, Cloneable, StructuredPojo {

    private Integer fPort;
    /**
     * <p>
     * Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the position data destination that describes the AWS IoT rule that processes the device's position
     * data for use by AWS IoT Core for LoRaWAN.
     * </p>
     */
    private String destinationName;

    /**
     * @param fPort
     */

    public void setFPort(Integer fPort) {
        this.fPort = fPort;
    }

    /**
     * @return
     */

    public Integer getFPort() {
        return this.fPort;
    }

    /**
     * @param fPort
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfig withFPort(Integer fPort) {
        setFPort(fPort);
        return this;
    }

    /**
     * <p>
     * Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * </p>
     * 
     * @param type
     *        Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * @see ApplicationConfigType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * </p>
     * 
     * @return Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * @see ApplicationConfigType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * </p>
     * 
     * @param type
     *        Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationConfigType
     */

    public ApplicationConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * </p>
     * 
     * @param type
     *        Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationConfigType
     */

    public ApplicationConfig withType(ApplicationConfigType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the position data destination that describes the AWS IoT rule that processes the device's position
     * data for use by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @param destinationName
     *        The name of the position data destination that describes the AWS IoT rule that processes the device's
     *        position data for use by AWS IoT Core for LoRaWAN.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the position data destination that describes the AWS IoT rule that processes the device's position
     * data for use by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @return The name of the position data destination that describes the AWS IoT rule that processes the device's
     *         position data for use by AWS IoT Core for LoRaWAN.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the position data destination that describes the AWS IoT rule that processes the device's position
     * data for use by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @param destinationName
     *        The name of the position data destination that describes the AWS IoT rule that processes the device's
     *        position data for use by AWS IoT Core for LoRaWAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfig withDestinationName(String destinationName) {
        setDestinationName(destinationName);
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
            sb.append("FPort: ").append(getFPort()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationConfig == false)
            return false;
        ApplicationConfig other = (ApplicationConfig) obj;
        if (other.getFPort() == null ^ this.getFPort() == null)
            return false;
        if (other.getFPort() != null && other.getFPort().equals(this.getFPort()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFPort() == null) ? 0 : getFPort().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationConfig clone() {
        try {
            return (ApplicationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.ApplicationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
