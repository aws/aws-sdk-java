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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Update the network source of the bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeNetworkSourceRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeNetworkSourceRequest implements Serializable, Cloneable, StructuredPojo {

    /** The network source multicast IP. */
    private String multicastIp;
    /** The network source's gateway network name. */
    private String networkName;
    /** The network source port. */
    private Integer port;
    /** The network source protocol. */
    private String protocol;

    /**
     * The network source multicast IP.
     * 
     * @param multicastIp
     *        The network source multicast IP.
     */

    public void setMulticastIp(String multicastIp) {
        this.multicastIp = multicastIp;
    }

    /**
     * The network source multicast IP.
     * 
     * @return The network source multicast IP.
     */

    public String getMulticastIp() {
        return this.multicastIp;
    }

    /**
     * The network source multicast IP.
     * 
     * @param multicastIp
     *        The network source multicast IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeNetworkSourceRequest withMulticastIp(String multicastIp) {
        setMulticastIp(multicastIp);
        return this;
    }

    /**
     * The network source's gateway network name.
     * 
     * @param networkName
     *        The network source's gateway network name.
     */

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * The network source's gateway network name.
     * 
     * @return The network source's gateway network name.
     */

    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * The network source's gateway network name.
     * 
     * @param networkName
     *        The network source's gateway network name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeNetworkSourceRequest withNetworkName(String networkName) {
        setNetworkName(networkName);
        return this;
    }

    /**
     * The network source port.
     * 
     * @param port
     *        The network source port.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * The network source port.
     * 
     * @return The network source port.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * The network source port.
     * 
     * @param port
     *        The network source port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeNetworkSourceRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * The network source protocol.
     * 
     * @param protocol
     *        The network source protocol.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * The network source protocol.
     * 
     * @return The network source protocol.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The network source protocol.
     * 
     * @param protocol
     *        The network source protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateBridgeNetworkSourceRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The network source protocol.
     * 
     * @param protocol
     *        The network source protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateBridgeNetworkSourceRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
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
        if (getMulticastIp() != null)
            sb.append("MulticastIp: ").append(getMulticastIp()).append(",");
        if (getNetworkName() != null)
            sb.append("NetworkName: ").append(getNetworkName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBridgeNetworkSourceRequest == false)
            return false;
        UpdateBridgeNetworkSourceRequest other = (UpdateBridgeNetworkSourceRequest) obj;
        if (other.getMulticastIp() == null ^ this.getMulticastIp() == null)
            return false;
        if (other.getMulticastIp() != null && other.getMulticastIp().equals(this.getMulticastIp()) == false)
            return false;
        if (other.getNetworkName() == null ^ this.getNetworkName() == null)
            return false;
        if (other.getNetworkName() != null && other.getNetworkName().equals(this.getNetworkName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMulticastIp() == null) ? 0 : getMulticastIp().hashCode());
        hashCode = prime * hashCode + ((getNetworkName() == null) ? 0 : getNetworkName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBridgeNetworkSourceRequest clone() {
        try {
            return (UpdateBridgeNetworkSourceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.UpdateBridgeNetworkSourceRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
