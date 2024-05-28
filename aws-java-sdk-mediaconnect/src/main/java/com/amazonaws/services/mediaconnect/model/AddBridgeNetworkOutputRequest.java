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
 * Add a network output to an existing bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddBridgeNetworkOutputRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddBridgeNetworkOutputRequest implements Serializable, Cloneable, StructuredPojo {

    /** The network output IP Address. */
    private String ipAddress;
    /**
     * The network output name. This name is used to reference the output and must be unique among outputs in this
     * bridge.
     */
    private String name;
    /** The network output's gateway network name. */
    private String networkName;
    /** The network output port. */
    private Integer port;
    /** The network output protocol. */
    private String protocol;
    /** The network output TTL. */
    private Integer ttl;

    /**
     * The network output IP Address.
     * 
     * @param ipAddress
     *        The network output IP Address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * The network output IP Address.
     * 
     * @return The network output IP Address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * The network output IP Address.
     * 
     * @param ipAddress
     *        The network output IP Address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeNetworkOutputRequest withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * The network output name. This name is used to reference the output and must be unique among outputs in this
     * bridge.
     * 
     * @param name
     *        The network output name. This name is used to reference the output and must be unique among outputs in
     *        this bridge.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The network output name. This name is used to reference the output and must be unique among outputs in this
     * bridge.
     * 
     * @return The network output name. This name is used to reference the output and must be unique among outputs in
     *         this bridge.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The network output name. This name is used to reference the output and must be unique among outputs in this
     * bridge.
     * 
     * @param name
     *        The network output name. This name is used to reference the output and must be unique among outputs in
     *        this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeNetworkOutputRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The network output's gateway network name.
     * 
     * @param networkName
     *        The network output's gateway network name.
     */

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * The network output's gateway network name.
     * 
     * @return The network output's gateway network name.
     */

    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * The network output's gateway network name.
     * 
     * @param networkName
     *        The network output's gateway network name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeNetworkOutputRequest withNetworkName(String networkName) {
        setNetworkName(networkName);
        return this;
    }

    /**
     * The network output port.
     * 
     * @param port
     *        The network output port.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * The network output port.
     * 
     * @return The network output port.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * The network output port.
     * 
     * @param port
     *        The network output port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeNetworkOutputRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * The network output protocol.
     * 
     * @param protocol
     *        The network output protocol.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * The network output protocol.
     * 
     * @return The network output protocol.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The network output protocol.
     * 
     * @param protocol
     *        The network output protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public AddBridgeNetworkOutputRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The network output protocol.
     * 
     * @param protocol
     *        The network output protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public AddBridgeNetworkOutputRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * The network output TTL.
     * 
     * @param ttl
     *        The network output TTL.
     */

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    /**
     * The network output TTL.
     * 
     * @return The network output TTL.
     */

    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * The network output TTL.
     * 
     * @param ttl
     *        The network output TTL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeNetworkOutputRequest withTtl(Integer ttl) {
        setTtl(ttl);
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkName() != null)
            sb.append("NetworkName: ").append(getNetworkName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddBridgeNetworkOutputRequest == false)
            return false;
        AddBridgeNetworkOutputRequest other = (AddBridgeNetworkOutputRequest) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkName() == null) ? 0 : getNetworkName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        return hashCode;
    }

    @Override
    public AddBridgeNetworkOutputRequest clone() {
        try {
            return (AddBridgeNetworkOutputRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.AddBridgeNetworkOutputRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
