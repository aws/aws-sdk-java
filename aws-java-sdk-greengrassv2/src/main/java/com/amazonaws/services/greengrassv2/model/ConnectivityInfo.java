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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an endpoint and port where client devices can connect to an MQTT broker on a Greengrass
 * core device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ConnectivityInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectivityInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ID for the connectivity information.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core device.
     * </p>
     */
    private String hostAddress;
    /**
     * <p>
     * The port where the MQTT broker operates on the core device. This port is typically 8883, which is the default
     * port for the MQTT broker component that runs on core devices.
     * </p>
     */
    private Integer portNumber;
    /**
     * <p>
     * Additional metadata to provide to client devices that connect to this core device.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * An ID for the connectivity information.
     * </p>
     * 
     * @param id
     *        An ID for the connectivity information.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An ID for the connectivity information.
     * </p>
     * 
     * @return An ID for the connectivity information.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An ID for the connectivity information.
     * </p>
     * 
     * @param id
     *        An ID for the connectivity information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core device.
     * </p>
     * 
     * @param hostAddress
     *        The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core
     *        device.
     */

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    /**
     * <p>
     * The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core device.
     * </p>
     * 
     * @return The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core
     *         device.
     */

    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * <p>
     * The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core device.
     * </p>
     * 
     * @param hostAddress
     *        The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core
     *        device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withHostAddress(String hostAddress) {
        setHostAddress(hostAddress);
        return this;
    }

    /**
     * <p>
     * The port where the MQTT broker operates on the core device. This port is typically 8883, which is the default
     * port for the MQTT broker component that runs on core devices.
     * </p>
     * 
     * @param portNumber
     *        The port where the MQTT broker operates on the core device. This port is typically 8883, which is the
     *        default port for the MQTT broker component that runs on core devices.
     */

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    /**
     * <p>
     * The port where the MQTT broker operates on the core device. This port is typically 8883, which is the default
     * port for the MQTT broker component that runs on core devices.
     * </p>
     * 
     * @return The port where the MQTT broker operates on the core device. This port is typically 8883, which is the
     *         default port for the MQTT broker component that runs on core devices.
     */

    public Integer getPortNumber() {
        return this.portNumber;
    }

    /**
     * <p>
     * The port where the MQTT broker operates on the core device. This port is typically 8883, which is the default
     * port for the MQTT broker component that runs on core devices.
     * </p>
     * 
     * @param portNumber
     *        The port where the MQTT broker operates on the core device. This port is typically 8883, which is the
     *        default port for the MQTT broker component that runs on core devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withPortNumber(Integer portNumber) {
        setPortNumber(portNumber);
        return this;
    }

    /**
     * <p>
     * Additional metadata to provide to client devices that connect to this core device.
     * </p>
     * 
     * @param metadata
     *        Additional metadata to provide to client devices that connect to this core device.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Additional metadata to provide to client devices that connect to this core device.
     * </p>
     * 
     * @return Additional metadata to provide to client devices that connect to this core device.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Additional metadata to provide to client devices that connect to this core device.
     * </p>
     * 
     * @param metadata
     *        Additional metadata to provide to client devices that connect to this core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withMetadata(String metadata) {
        setMetadata(metadata);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getHostAddress() != null)
            sb.append("HostAddress: ").append(getHostAddress()).append(",");
        if (getPortNumber() != null)
            sb.append("PortNumber: ").append(getPortNumber()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectivityInfo == false)
            return false;
        ConnectivityInfo other = (ConnectivityInfo) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getHostAddress() == null ^ this.getHostAddress() == null)
            return false;
        if (other.getHostAddress() != null && other.getHostAddress().equals(this.getHostAddress()) == false)
            return false;
        if (other.getPortNumber() == null ^ this.getPortNumber() == null)
            return false;
        if (other.getPortNumber() != null && other.getPortNumber().equals(this.getPortNumber()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getHostAddress() == null) ? 0 : getHostAddress().hashCode());
        hashCode = prime * hashCode + ((getPortNumber() == null) ? 0 : getPortNumber().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ConnectivityInfo clone() {
        try {
            return (ConnectivityInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ConnectivityInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
