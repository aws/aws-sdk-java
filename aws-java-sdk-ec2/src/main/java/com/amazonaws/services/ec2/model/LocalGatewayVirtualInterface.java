/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a local gateway virtual interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LocalGatewayVirtualInterface" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayVirtualInterface implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String localGatewayVirtualInterfaceId;
    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;
    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;
    /**
     * <p>
     * The local address.
     * </p>
     */
    private String localAddress;
    /**
     * <p>
     * The peer address.
     * </p>
     */
    private String peerAddress;
    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     * </p>
     */
    private Integer localBgpAsn;
    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     */
    private Integer peerBgpAsn;
    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceId
     *        The ID of the virtual interface.
     */

    public void setLocalGatewayVirtualInterfaceId(String localGatewayVirtualInterfaceId) {
        this.localGatewayVirtualInterfaceId = localGatewayVirtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @return The ID of the virtual interface.
     */

    public String getLocalGatewayVirtualInterfaceId() {
        return this.localGatewayVirtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceId
     *        The ID of the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withLocalGatewayVirtualInterfaceId(String localGatewayVirtualInterfaceId) {
        setLocalGatewayVirtualInterfaceId(localGatewayVirtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     */

    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @return The ID of the local gateway.
     */

    public String getLocalGatewayId() {
        return this.localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withLocalGatewayId(String localGatewayId) {
        setLocalGatewayId(localGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @return The ID of the VLAN.
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * <p>
     * The local address.
     * </p>
     * 
     * @param localAddress
     *        The local address.
     */

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    /**
     * <p>
     * The local address.
     * </p>
     * 
     * @return The local address.
     */

    public String getLocalAddress() {
        return this.localAddress;
    }

    /**
     * <p>
     * The local address.
     * </p>
     * 
     * @param localAddress
     *        The local address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withLocalAddress(String localAddress) {
        setLocalAddress(localAddress);
        return this;
    }

    /**
     * <p>
     * The peer address.
     * </p>
     * 
     * @param peerAddress
     *        The peer address.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The peer address.
     * </p>
     * 
     * @return The peer address.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The peer address.
     * </p>
     * 
     * @param peerAddress
     *        The peer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
        return this;
    }

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     * </p>
     * 
     * @param localBgpAsn
     *        The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     */

    public void setLocalBgpAsn(Integer localBgpAsn) {
        this.localBgpAsn = localBgpAsn;
    }

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     * </p>
     * 
     * @return The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     */

    public Integer getLocalBgpAsn() {
        return this.localBgpAsn;
    }

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     * </p>
     * 
     * @param localBgpAsn
     *        The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withLocalBgpAsn(Integer localBgpAsn) {
        setLocalBgpAsn(localBgpAsn);
        return this;
    }

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     * 
     * @param peerBgpAsn
     *        The peer BGP ASN.
     */

    public void setPeerBgpAsn(Integer peerBgpAsn) {
        this.peerBgpAsn = peerBgpAsn;
    }

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     * 
     * @return The peer BGP ASN.
     */

    public Integer getPeerBgpAsn() {
        return this.peerBgpAsn;
    }

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     * 
     * @param peerBgpAsn
     *        The peer BGP ASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withPeerBgpAsn(Integer peerBgpAsn) {
        setPeerBgpAsn(peerBgpAsn);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     * 
     * @return The tags assigned to the virtual interface.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual interface.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterface withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getLocalGatewayVirtualInterfaceId() != null)
            sb.append("LocalGatewayVirtualInterfaceId: ").append(getLocalGatewayVirtualInterfaceId()).append(",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: ").append(getLocalGatewayId()).append(",");
        if (getVlan() != null)
            sb.append("Vlan: ").append(getVlan()).append(",");
        if (getLocalAddress() != null)
            sb.append("LocalAddress: ").append(getLocalAddress()).append(",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: ").append(getPeerAddress()).append(",");
        if (getLocalBgpAsn() != null)
            sb.append("LocalBgpAsn: ").append(getLocalBgpAsn()).append(",");
        if (getPeerBgpAsn() != null)
            sb.append("PeerBgpAsn: ").append(getPeerBgpAsn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGatewayVirtualInterface == false)
            return false;
        LocalGatewayVirtualInterface other = (LocalGatewayVirtualInterface) obj;
        if (other.getLocalGatewayVirtualInterfaceId() == null ^ this.getLocalGatewayVirtualInterfaceId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceId() != null
                && other.getLocalGatewayVirtualInterfaceId().equals(this.getLocalGatewayVirtualInterfaceId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getLocalAddress() == null ^ this.getLocalAddress() == null)
            return false;
        if (other.getLocalAddress() != null && other.getLocalAddress().equals(this.getLocalAddress()) == false)
            return false;
        if (other.getPeerAddress() == null ^ this.getPeerAddress() == null)
            return false;
        if (other.getPeerAddress() != null && other.getPeerAddress().equals(this.getPeerAddress()) == false)
            return false;
        if (other.getLocalBgpAsn() == null ^ this.getLocalBgpAsn() == null)
            return false;
        if (other.getLocalBgpAsn() != null && other.getLocalBgpAsn().equals(this.getLocalBgpAsn()) == false)
            return false;
        if (other.getPeerBgpAsn() == null ^ this.getPeerBgpAsn() == null)
            return false;
        if (other.getPeerBgpAsn() != null && other.getPeerBgpAsn().equals(this.getPeerBgpAsn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceId() == null) ? 0 : getLocalGatewayVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getLocalAddress() == null) ? 0 : getLocalAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode + ((getLocalBgpAsn() == null) ? 0 : getLocalBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getPeerBgpAsn() == null) ? 0 : getPeerBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LocalGatewayVirtualInterface clone() {
        try {
            return (LocalGatewayVirtualInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
