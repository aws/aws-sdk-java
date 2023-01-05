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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network Connect peer configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ConnectPeerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectPeerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address of a core network.
     * </p>
     */
    private String coreNetworkAddress;
    /**
     * <p>
     * The IP address of the Connect peer.
     * </p>
     */
    private String peerAddress;
    /**
     * <p>
     * The inside IP addresses used for a Connect peer configuration.
     * </p>
     */
    private java.util.List<String> insideCidrBlocks;
    /**
     * <p>
     * The protocol used for a Connect peer configuration.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The Connect peer BGP configurations.
     * </p>
     */
    private java.util.List<ConnectPeerBgpConfiguration> bgpConfigurations;

    /**
     * <p>
     * The IP address of a core network.
     * </p>
     * 
     * @param coreNetworkAddress
     *        The IP address of a core network.
     */

    public void setCoreNetworkAddress(String coreNetworkAddress) {
        this.coreNetworkAddress = coreNetworkAddress;
    }

    /**
     * <p>
     * The IP address of a core network.
     * </p>
     * 
     * @return The IP address of a core network.
     */

    public String getCoreNetworkAddress() {
        return this.coreNetworkAddress;
    }

    /**
     * <p>
     * The IP address of a core network.
     * </p>
     * 
     * @param coreNetworkAddress
     *        The IP address of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerConfiguration withCoreNetworkAddress(String coreNetworkAddress) {
        setCoreNetworkAddress(coreNetworkAddress);
        return this;
    }

    /**
     * <p>
     * The IP address of the Connect peer.
     * </p>
     * 
     * @param peerAddress
     *        The IP address of the Connect peer.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The IP address of the Connect peer.
     * </p>
     * 
     * @return The IP address of the Connect peer.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The IP address of the Connect peer.
     * </p>
     * 
     * @param peerAddress
     *        The IP address of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerConfiguration withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for a Connect peer configuration.
     * </p>
     * 
     * @return The inside IP addresses used for a Connect peer configuration.
     */

    public java.util.List<String> getInsideCidrBlocks() {
        return insideCidrBlocks;
    }

    /**
     * <p>
     * The inside IP addresses used for a Connect peer configuration.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for a Connect peer configuration.
     */

    public void setInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        if (insideCidrBlocks == null) {
            this.insideCidrBlocks = null;
            return;
        }

        this.insideCidrBlocks = new java.util.ArrayList<String>(insideCidrBlocks);
    }

    /**
     * <p>
     * The inside IP addresses used for a Connect peer configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsideCidrBlocks(java.util.Collection)} or {@link #withInsideCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for a Connect peer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerConfiguration withInsideCidrBlocks(String... insideCidrBlocks) {
        if (this.insideCidrBlocks == null) {
            setInsideCidrBlocks(new java.util.ArrayList<String>(insideCidrBlocks.length));
        }
        for (String ele : insideCidrBlocks) {
            this.insideCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for a Connect peer configuration.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for a Connect peer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerConfiguration withInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        setInsideCidrBlocks(insideCidrBlocks);
        return this;
    }

    /**
     * <p>
     * The protocol used for a Connect peer configuration.
     * </p>
     * 
     * @param protocol
     *        The protocol used for a Connect peer configuration.
     * @see TunnelProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for a Connect peer configuration.
     * </p>
     * 
     * @return The protocol used for a Connect peer configuration.
     * @see TunnelProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for a Connect peer configuration.
     * </p>
     * 
     * @param protocol
     *        The protocol used for a Connect peer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelProtocol
     */

    public ConnectPeerConfiguration withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used for a Connect peer configuration.
     * </p>
     * 
     * @param protocol
     *        The protocol used for a Connect peer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelProtocol
     */

    public ConnectPeerConfiguration withProtocol(TunnelProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The Connect peer BGP configurations.
     * </p>
     * 
     * @return The Connect peer BGP configurations.
     */

    public java.util.List<ConnectPeerBgpConfiguration> getBgpConfigurations() {
        return bgpConfigurations;
    }

    /**
     * <p>
     * The Connect peer BGP configurations.
     * </p>
     * 
     * @param bgpConfigurations
     *        The Connect peer BGP configurations.
     */

    public void setBgpConfigurations(java.util.Collection<ConnectPeerBgpConfiguration> bgpConfigurations) {
        if (bgpConfigurations == null) {
            this.bgpConfigurations = null;
            return;
        }

        this.bgpConfigurations = new java.util.ArrayList<ConnectPeerBgpConfiguration>(bgpConfigurations);
    }

    /**
     * <p>
     * The Connect peer BGP configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBgpConfigurations(java.util.Collection)} or {@link #withBgpConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param bgpConfigurations
     *        The Connect peer BGP configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerConfiguration withBgpConfigurations(ConnectPeerBgpConfiguration... bgpConfigurations) {
        if (this.bgpConfigurations == null) {
            setBgpConfigurations(new java.util.ArrayList<ConnectPeerBgpConfiguration>(bgpConfigurations.length));
        }
        for (ConnectPeerBgpConfiguration ele : bgpConfigurations) {
            this.bgpConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Connect peer BGP configurations.
     * </p>
     * 
     * @param bgpConfigurations
     *        The Connect peer BGP configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerConfiguration withBgpConfigurations(java.util.Collection<ConnectPeerBgpConfiguration> bgpConfigurations) {
        setBgpConfigurations(bgpConfigurations);
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
        if (getCoreNetworkAddress() != null)
            sb.append("CoreNetworkAddress: ").append(getCoreNetworkAddress()).append(",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: ").append(getPeerAddress()).append(",");
        if (getInsideCidrBlocks() != null)
            sb.append("InsideCidrBlocks: ").append(getInsideCidrBlocks()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getBgpConfigurations() != null)
            sb.append("BgpConfigurations: ").append(getBgpConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectPeerConfiguration == false)
            return false;
        ConnectPeerConfiguration other = (ConnectPeerConfiguration) obj;
        if (other.getCoreNetworkAddress() == null ^ this.getCoreNetworkAddress() == null)
            return false;
        if (other.getCoreNetworkAddress() != null && other.getCoreNetworkAddress().equals(this.getCoreNetworkAddress()) == false)
            return false;
        if (other.getPeerAddress() == null ^ this.getPeerAddress() == null)
            return false;
        if (other.getPeerAddress() != null && other.getPeerAddress().equals(this.getPeerAddress()) == false)
            return false;
        if (other.getInsideCidrBlocks() == null ^ this.getInsideCidrBlocks() == null)
            return false;
        if (other.getInsideCidrBlocks() != null && other.getInsideCidrBlocks().equals(this.getInsideCidrBlocks()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getBgpConfigurations() == null ^ this.getBgpConfigurations() == null)
            return false;
        if (other.getBgpConfigurations() != null && other.getBgpConfigurations().equals(this.getBgpConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkAddress() == null) ? 0 : getCoreNetworkAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode + ((getInsideCidrBlocks() == null) ? 0 : getInsideCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getBgpConfigurations() == null) ? 0 : getBgpConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ConnectPeerConfiguration clone() {
        try {
            return (ConnectPeerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectPeerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
