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
 * The BGP configuration information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayAttachmentBgpConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayAttachmentBgpConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The transit gateway Autonomous System Number (ASN).
     * </p>
     */
    private Long transitGatewayAsn;
    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     */
    private Long peerAsn;
    /**
     * <p>
     * The interior BGP peer IP address for the transit gateway.
     * </p>
     */
    private String transitGatewayAddress;
    /**
     * <p>
     * The interior BGP peer IP address for the appliance.
     * </p>
     */
    private String peerAddress;
    /**
     * <p>
     * The BGP status.
     * </p>
     */
    private String bgpStatus;

    /**
     * <p>
     * The transit gateway Autonomous System Number (ASN).
     * </p>
     * 
     * @param transitGatewayAsn
     *        The transit gateway Autonomous System Number (ASN).
     */

    public void setTransitGatewayAsn(Long transitGatewayAsn) {
        this.transitGatewayAsn = transitGatewayAsn;
    }

    /**
     * <p>
     * The transit gateway Autonomous System Number (ASN).
     * </p>
     * 
     * @return The transit gateway Autonomous System Number (ASN).
     */

    public Long getTransitGatewayAsn() {
        return this.transitGatewayAsn;
    }

    /**
     * <p>
     * The transit gateway Autonomous System Number (ASN).
     * </p>
     * 
     * @param transitGatewayAsn
     *        The transit gateway Autonomous System Number (ASN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayAttachmentBgpConfiguration withTransitGatewayAsn(Long transitGatewayAsn) {
        setTransitGatewayAsn(transitGatewayAsn);
        return this;
    }

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     * 
     * @param peerAsn
     *        The peer Autonomous System Number (ASN).
     */

    public void setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
    }

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     * 
     * @return The peer Autonomous System Number (ASN).
     */

    public Long getPeerAsn() {
        return this.peerAsn;
    }

    /**
     * <p>
     * The peer Autonomous System Number (ASN).
     * </p>
     * 
     * @param peerAsn
     *        The peer Autonomous System Number (ASN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayAttachmentBgpConfiguration withPeerAsn(Long peerAsn) {
        setPeerAsn(peerAsn);
        return this;
    }

    /**
     * <p>
     * The interior BGP peer IP address for the transit gateway.
     * </p>
     * 
     * @param transitGatewayAddress
     *        The interior BGP peer IP address for the transit gateway.
     */

    public void setTransitGatewayAddress(String transitGatewayAddress) {
        this.transitGatewayAddress = transitGatewayAddress;
    }

    /**
     * <p>
     * The interior BGP peer IP address for the transit gateway.
     * </p>
     * 
     * @return The interior BGP peer IP address for the transit gateway.
     */

    public String getTransitGatewayAddress() {
        return this.transitGatewayAddress;
    }

    /**
     * <p>
     * The interior BGP peer IP address for the transit gateway.
     * </p>
     * 
     * @param transitGatewayAddress
     *        The interior BGP peer IP address for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayAttachmentBgpConfiguration withTransitGatewayAddress(String transitGatewayAddress) {
        setTransitGatewayAddress(transitGatewayAddress);
        return this;
    }

    /**
     * <p>
     * The interior BGP peer IP address for the appliance.
     * </p>
     * 
     * @param peerAddress
     *        The interior BGP peer IP address for the appliance.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The interior BGP peer IP address for the appliance.
     * </p>
     * 
     * @return The interior BGP peer IP address for the appliance.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The interior BGP peer IP address for the appliance.
     * </p>
     * 
     * @param peerAddress
     *        The interior BGP peer IP address for the appliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayAttachmentBgpConfiguration withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
        return this;
    }

    /**
     * <p>
     * The BGP status.
     * </p>
     * 
     * @param bgpStatus
     *        The BGP status.
     * @see BgpStatus
     */

    public void setBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
    }

    /**
     * <p>
     * The BGP status.
     * </p>
     * 
     * @return The BGP status.
     * @see BgpStatus
     */

    public String getBgpStatus() {
        return this.bgpStatus;
    }

    /**
     * <p>
     * The BGP status.
     * </p>
     * 
     * @param bgpStatus
     *        The BGP status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BgpStatus
     */

    public TransitGatewayAttachmentBgpConfiguration withBgpStatus(String bgpStatus) {
        setBgpStatus(bgpStatus);
        return this;
    }

    /**
     * <p>
     * The BGP status.
     * </p>
     * 
     * @param bgpStatus
     *        The BGP status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BgpStatus
     */

    public TransitGatewayAttachmentBgpConfiguration withBgpStatus(BgpStatus bgpStatus) {
        this.bgpStatus = bgpStatus.toString();
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
        if (getTransitGatewayAsn() != null)
            sb.append("TransitGatewayAsn: ").append(getTransitGatewayAsn()).append(",");
        if (getPeerAsn() != null)
            sb.append("PeerAsn: ").append(getPeerAsn()).append(",");
        if (getTransitGatewayAddress() != null)
            sb.append("TransitGatewayAddress: ").append(getTransitGatewayAddress()).append(",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: ").append(getPeerAddress()).append(",");
        if (getBgpStatus() != null)
            sb.append("BgpStatus: ").append(getBgpStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayAttachmentBgpConfiguration == false)
            return false;
        TransitGatewayAttachmentBgpConfiguration other = (TransitGatewayAttachmentBgpConfiguration) obj;
        if (other.getTransitGatewayAsn() == null ^ this.getTransitGatewayAsn() == null)
            return false;
        if (other.getTransitGatewayAsn() != null && other.getTransitGatewayAsn().equals(this.getTransitGatewayAsn()) == false)
            return false;
        if (other.getPeerAsn() == null ^ this.getPeerAsn() == null)
            return false;
        if (other.getPeerAsn() != null && other.getPeerAsn().equals(this.getPeerAsn()) == false)
            return false;
        if (other.getTransitGatewayAddress() == null ^ this.getTransitGatewayAddress() == null)
            return false;
        if (other.getTransitGatewayAddress() != null && other.getTransitGatewayAddress().equals(this.getTransitGatewayAddress()) == false)
            return false;
        if (other.getPeerAddress() == null ^ this.getPeerAddress() == null)
            return false;
        if (other.getPeerAddress() != null && other.getPeerAddress().equals(this.getPeerAddress()) == false)
            return false;
        if (other.getBgpStatus() == null ^ this.getBgpStatus() == null)
            return false;
        if (other.getBgpStatus() != null && other.getBgpStatus().equals(this.getBgpStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayAsn() == null) ? 0 : getTransitGatewayAsn().hashCode());
        hashCode = prime * hashCode + ((getPeerAsn() == null) ? 0 : getPeerAsn().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAddress() == null) ? 0 : getTransitGatewayAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode + ((getBgpStatus() == null) ? 0 : getBgpStatus().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayAttachmentBgpConfiguration clone() {
        try {
            return (TransitGatewayAttachmentBgpConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
