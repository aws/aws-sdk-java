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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the Connect peer details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayConnectPeerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnectPeerConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The Connect peer IP address on the transit gateway side of the tunnel.
     * </p>
     */
    private String transitGatewayAddress;
    /**
     * <p>
     * The Connect peer IP address on the appliance side of the tunnel.
     * </p>
     */
    private String peerAddress;
    /**
     * <p>
     * The range of interior BGP peer IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insideCidrBlocks;
    /**
     * <p>
     * The tunnel protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The BGP configuration details.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayAttachmentBgpConfiguration> bgpConfigurations;

    /**
     * <p>
     * The Connect peer IP address on the transit gateway side of the tunnel.
     * </p>
     * 
     * @param transitGatewayAddress
     *        The Connect peer IP address on the transit gateway side of the tunnel.
     */

    public void setTransitGatewayAddress(String transitGatewayAddress) {
        this.transitGatewayAddress = transitGatewayAddress;
    }

    /**
     * <p>
     * The Connect peer IP address on the transit gateway side of the tunnel.
     * </p>
     * 
     * @return The Connect peer IP address on the transit gateway side of the tunnel.
     */

    public String getTransitGatewayAddress() {
        return this.transitGatewayAddress;
    }

    /**
     * <p>
     * The Connect peer IP address on the transit gateway side of the tunnel.
     * </p>
     * 
     * @param transitGatewayAddress
     *        The Connect peer IP address on the transit gateway side of the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerConfiguration withTransitGatewayAddress(String transitGatewayAddress) {
        setTransitGatewayAddress(transitGatewayAddress);
        return this;
    }

    /**
     * <p>
     * The Connect peer IP address on the appliance side of the tunnel.
     * </p>
     * 
     * @param peerAddress
     *        The Connect peer IP address on the appliance side of the tunnel.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The Connect peer IP address on the appliance side of the tunnel.
     * </p>
     * 
     * @return The Connect peer IP address on the appliance side of the tunnel.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The Connect peer IP address on the appliance side of the tunnel.
     * </p>
     * 
     * @param peerAddress
     *        The Connect peer IP address on the appliance side of the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerConfiguration withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
        return this;
    }

    /**
     * <p>
     * The range of interior BGP peer IP addresses.
     * </p>
     * 
     * @return The range of interior BGP peer IP addresses.
     */

    public java.util.List<String> getInsideCidrBlocks() {
        if (insideCidrBlocks == null) {
            insideCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return insideCidrBlocks;
    }

    /**
     * <p>
     * The range of interior BGP peer IP addresses.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The range of interior BGP peer IP addresses.
     */

    public void setInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        if (insideCidrBlocks == null) {
            this.insideCidrBlocks = null;
            return;
        }

        this.insideCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>(insideCidrBlocks);
    }

    /**
     * <p>
     * The range of interior BGP peer IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsideCidrBlocks(java.util.Collection)} or {@link #withInsideCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The range of interior BGP peer IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerConfiguration withInsideCidrBlocks(String... insideCidrBlocks) {
        if (this.insideCidrBlocks == null) {
            setInsideCidrBlocks(new com.amazonaws.internal.SdkInternalList<String>(insideCidrBlocks.length));
        }
        for (String ele : insideCidrBlocks) {
            this.insideCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The range of interior BGP peer IP addresses.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The range of interior BGP peer IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerConfiguration withInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        setInsideCidrBlocks(insideCidrBlocks);
        return this;
    }

    /**
     * <p>
     * The tunnel protocol.
     * </p>
     * 
     * @param protocol
     *        The tunnel protocol.
     * @see ProtocolValue
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The tunnel protocol.
     * </p>
     * 
     * @return The tunnel protocol.
     * @see ProtocolValue
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The tunnel protocol.
     * </p>
     * 
     * @param protocol
     *        The tunnel protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolValue
     */

    public TransitGatewayConnectPeerConfiguration withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The tunnel protocol.
     * </p>
     * 
     * @param protocol
     *        The tunnel protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolValue
     */

    public TransitGatewayConnectPeerConfiguration withProtocol(ProtocolValue protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The BGP configuration details.
     * </p>
     * 
     * @return The BGP configuration details.
     */

    public java.util.List<TransitGatewayAttachmentBgpConfiguration> getBgpConfigurations() {
        if (bgpConfigurations == null) {
            bgpConfigurations = new com.amazonaws.internal.SdkInternalList<TransitGatewayAttachmentBgpConfiguration>();
        }
        return bgpConfigurations;
    }

    /**
     * <p>
     * The BGP configuration details.
     * </p>
     * 
     * @param bgpConfigurations
     *        The BGP configuration details.
     */

    public void setBgpConfigurations(java.util.Collection<TransitGatewayAttachmentBgpConfiguration> bgpConfigurations) {
        if (bgpConfigurations == null) {
            this.bgpConfigurations = null;
            return;
        }

        this.bgpConfigurations = new com.amazonaws.internal.SdkInternalList<TransitGatewayAttachmentBgpConfiguration>(bgpConfigurations);
    }

    /**
     * <p>
     * The BGP configuration details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBgpConfigurations(java.util.Collection)} or {@link #withBgpConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param bgpConfigurations
     *        The BGP configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerConfiguration withBgpConfigurations(TransitGatewayAttachmentBgpConfiguration... bgpConfigurations) {
        if (this.bgpConfigurations == null) {
            setBgpConfigurations(new com.amazonaws.internal.SdkInternalList<TransitGatewayAttachmentBgpConfiguration>(bgpConfigurations.length));
        }
        for (TransitGatewayAttachmentBgpConfiguration ele : bgpConfigurations) {
            this.bgpConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BGP configuration details.
     * </p>
     * 
     * @param bgpConfigurations
     *        The BGP configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerConfiguration withBgpConfigurations(java.util.Collection<TransitGatewayAttachmentBgpConfiguration> bgpConfigurations) {
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
        if (getTransitGatewayAddress() != null)
            sb.append("TransitGatewayAddress: ").append(getTransitGatewayAddress()).append(",");
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

        if (obj instanceof TransitGatewayConnectPeerConfiguration == false)
            return false;
        TransitGatewayConnectPeerConfiguration other = (TransitGatewayConnectPeerConfiguration) obj;
        if (other.getTransitGatewayAddress() == null ^ this.getTransitGatewayAddress() == null)
            return false;
        if (other.getTransitGatewayAddress() != null && other.getTransitGatewayAddress().equals(this.getTransitGatewayAddress()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayAddress() == null) ? 0 : getTransitGatewayAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode + ((getInsideCidrBlocks() == null) ? 0 : getInsideCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getBgpConfigurations() == null) ? 0 : getBgpConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayConnectPeerConfiguration clone() {
        try {
            return (TransitGatewayConnectPeerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
