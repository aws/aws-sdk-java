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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A device's Ethernet status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/EthernetStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EthernetStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device's connection status.
     * </p>
     */
    private String connectionStatus;
    /**
     * <p>
     * The device's physical address.
     * </p>
     */
    private String hwAddress;
    /**
     * <p>
     * The device's IP address.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @param connectionStatus
     *        The device's connection status.
     * @see NetworkConnectionStatus
     */

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @return The device's connection status.
     * @see NetworkConnectionStatus
     */

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @param connectionStatus
     *        The device's connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkConnectionStatus
     */

    public EthernetStatus withConnectionStatus(String connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @param connectionStatus
     *        The device's connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkConnectionStatus
     */

    public EthernetStatus withConnectionStatus(NetworkConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The device's physical address.
     * </p>
     * 
     * @param hwAddress
     *        The device's physical address.
     */

    public void setHwAddress(String hwAddress) {
        this.hwAddress = hwAddress;
    }

    /**
     * <p>
     * The device's physical address.
     * </p>
     * 
     * @return The device's physical address.
     */

    public String getHwAddress() {
        return this.hwAddress;
    }

    /**
     * <p>
     * The device's physical address.
     * </p>
     * 
     * @param hwAddress
     *        The device's physical address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EthernetStatus withHwAddress(String hwAddress) {
        setHwAddress(hwAddress);
        return this;
    }

    /**
     * <p>
     * The device's IP address.
     * </p>
     * 
     * @param ipAddress
     *        The device's IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The device's IP address.
     * </p>
     * 
     * @return The device's IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The device's IP address.
     * </p>
     * 
     * @param ipAddress
     *        The device's IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EthernetStatus withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
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
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus()).append(",");
        if (getHwAddress() != null)
            sb.append("HwAddress: ").append(getHwAddress()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EthernetStatus == false)
            return false;
        EthernetStatus other = (EthernetStatus) obj;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        if (other.getHwAddress() == null ^ this.getHwAddress() == null)
            return false;
        if (other.getHwAddress() != null && other.getHwAddress().equals(this.getHwAddress()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getHwAddress() == null) ? 0 : getHwAddress().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public EthernetStatus clone() {
        try {
            return (EthernetStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.EthernetStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
