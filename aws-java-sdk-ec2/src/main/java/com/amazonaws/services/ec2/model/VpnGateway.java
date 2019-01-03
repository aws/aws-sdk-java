/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a virtual private gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or
     * not returned.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcAttachment> vpcAttachments;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String vpnGatewayId;
    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * Any tags assigned to the virtual private gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or
     * not returned.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the virtual private gateway was created, if applicable. This field may be
     *        empty or not returned.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or
     * not returned.
     * </p>
     * 
     * @return The Availability Zone where the virtual private gateway was created, if applicable. This field may be
     *         empty or not returned.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or
     * not returned.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the virtual private gateway was created, if applicable. This field may be
     *        empty or not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * 
     * @param state
     *        The current state of the virtual private gateway.
     * @see VpnState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * 
     * @return The current state of the virtual private gateway.
     * @see VpnState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * 
     * @param state
     *        The current state of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnState
     */

    public VpnGateway withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * 
     * @param state
     *        The current state of the virtual private gateway.
     * @see VpnState
     */

    public void setState(VpnState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * 
     * @param state
     *        The current state of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnState
     */

    public VpnGateway withState(VpnState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection the virtual private gateway supports.
     * @see GatewayType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * 
     * @return The type of VPN connection the virtual private gateway supports.
     * @see GatewayType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection the virtual private gateway supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public VpnGateway withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection the virtual private gateway supports.
     * @see GatewayType
     */

    public void setType(GatewayType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection the virtual private gateway supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public VpnGateway withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     * 
     * @return Any VPCs attached to the virtual private gateway.
     */

    public java.util.List<VpcAttachment> getVpcAttachments() {
        if (vpcAttachments == null) {
            vpcAttachments = new com.amazonaws.internal.SdkInternalList<VpcAttachment>();
        }
        return vpcAttachments;
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     * 
     * @param vpcAttachments
     *        Any VPCs attached to the virtual private gateway.
     */

    public void setVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        if (vpcAttachments == null) {
            this.vpcAttachments = null;
            return;
        }

        this.vpcAttachments = new com.amazonaws.internal.SdkInternalList<VpcAttachment>(vpcAttachments);
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcAttachments(java.util.Collection)} or {@link #withVpcAttachments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcAttachments
     *        Any VPCs attached to the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withVpcAttachments(VpcAttachment... vpcAttachments) {
        if (this.vpcAttachments == null) {
            setVpcAttachments(new com.amazonaws.internal.SdkInternalList<VpcAttachment>(vpcAttachments.length));
        }
        for (VpcAttachment ele : vpcAttachments) {
            this.vpcAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     * 
     * @param vpcAttachments
     *        Any VPCs attached to the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        setVpcAttachments(vpcAttachments);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     * 
     * @param amazonSideAsn
     *        The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     * 
     * @return The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     * 
     * @param amazonSideAsn
     *        The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the virtual private gateway.
     * </p>
     * 
     * @return Any tags assigned to the virtual private gateway.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the virtual private gateway.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the virtual private gateway.
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
     * Any tags assigned to the virtual private gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withTags(Tag... tags) {
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
     * Any tags assigned to the virtual private gateway.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnGateway withTags(java.util.Collection<Tag> tags) {
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpcAttachments() != null)
            sb.append("VpcAttachments: ").append(getVpcAttachments()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId()).append(",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn()).append(",");
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

        if (obj instanceof VpnGateway == false)
            return false;
        VpnGateway other = (VpnGateway) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpcAttachments() == null ^ this.getVpcAttachments() == null)
            return false;
        if (other.getVpcAttachments() != null && other.getVpcAttachments().equals(this.getVpcAttachments()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
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

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpcAttachments() == null) ? 0 : getVpcAttachments().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public VpnGateway clone() {
        try {
            return (VpnGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
