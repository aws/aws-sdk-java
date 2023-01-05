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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon Web Services Amazon EC2 Transit Gateway that interconnects virtual private clouds (VPCs)
 * and on-premises networks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2TransitGatewayDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2TransitGatewayDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Turn on or turn off automatic propagation of routes to the default propagation route table.
     * </p>
     */
    private String defaultRouteTablePropagation;
    /**
     * <p>
     * Turn on or turn off automatic acceptance of attachment requests.
     * </p>
     */
    private String autoAcceptSharedAttachments;
    /**
     * <p>
     * Turn on or turn off automatic association with the default association route table.
     * </p>
     */
    private String defaultRouteTableAssociation;
    /**
     * <p>
     * The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * </p>
     */
    private java.util.List<String> transitGatewayCidrBlocks;
    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     */
    private String associationDefaultRouteTableId;
    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     */
    private String propagationDefaultRouteTableId;
    /**
     * <p>
     * Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     * </p>
     */
    private String vpnEcmpSupport;
    /**
     * <p>
     * Turn on or turn off DNS support.
     * </p>
     */
    private String dnsSupport;
    /**
     * <p>
     * Indicates whether multicast is supported on the transit gateway.
     * </p>
     */
    private String multicastSupport;
    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     */
    private Integer amazonSideAsn;

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param id
     *        The ID of the transit gateway.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param id
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     * 
     * @param description
     *        The description of the transit gateway.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     * 
     * @return The description of the transit gateway.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     * 
     * @param description
     *        The description of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Turn on or turn off automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Turn on or turn off automatic propagation of routes to the default propagation route table.
     */

    public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Turn on or turn off automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @return Turn on or turn off automatic propagation of routes to the default propagation route table.
     */

    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Turn on or turn off automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Turn on or turn off automatic propagation of routes to the default propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        setDefaultRouteTablePropagation(defaultRouteTablePropagation);
        return this;
    }

    /**
     * <p>
     * Turn on or turn off automatic acceptance of attachment requests.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Turn on or turn off automatic acceptance of attachment requests.
     */

    public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Turn on or turn off automatic acceptance of attachment requests.
     * </p>
     * 
     * @return Turn on or turn off automatic acceptance of attachment requests.
     */

    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Turn on or turn off automatic acceptance of attachment requests.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Turn on or turn off automatic acceptance of attachment requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        setAutoAcceptSharedAttachments(autoAcceptSharedAttachments);
        return this;
    }

    /**
     * <p>
     * Turn on or turn off automatic association with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Turn on or turn off automatic association with the default association route table.
     */

    public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Turn on or turn off automatic association with the default association route table.
     * </p>
     * 
     * @return Turn on or turn off automatic association with the default association route table.
     */

    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Turn on or turn off automatic association with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Turn on or turn off automatic association with the default association route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        setDefaultRouteTableAssociation(defaultRouteTableAssociation);
        return this;
    }

    /**
     * <p>
     * The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * </p>
     * 
     * @return The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     */

    public java.util.List<String> getTransitGatewayCidrBlocks() {
        return transitGatewayCidrBlocks;
    }

    /**
     * <p>
     * The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     */

    public void setTransitGatewayCidrBlocks(java.util.Collection<String> transitGatewayCidrBlocks) {
        if (transitGatewayCidrBlocks == null) {
            this.transitGatewayCidrBlocks = null;
            return;
        }

        this.transitGatewayCidrBlocks = new java.util.ArrayList<String>(transitGatewayCidrBlocks);
    }

    /**
     * <p>
     * The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayCidrBlocks(java.util.Collection)} or
     * {@link #withTransitGatewayCidrBlocks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withTransitGatewayCidrBlocks(String... transitGatewayCidrBlocks) {
        if (this.transitGatewayCidrBlocks == null) {
            setTransitGatewayCidrBlocks(new java.util.ArrayList<String>(transitGatewayCidrBlocks.length));
        }
        for (String ele : transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        The transit gateway Classless Inter-Domain Routing (CIDR) blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withTransitGatewayCidrBlocks(java.util.Collection<String> transitGatewayCidrBlocks) {
        setTransitGatewayCidrBlocks(transitGatewayCidrBlocks);
        return this;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * 
     * @param associationDefaultRouteTableId
     *        The ID of the default association route table.
     */

    public void setAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * 
     * @return The ID of the default association route table.
     */

    public String getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * 
     * @param associationDefaultRouteTableId
     *        The ID of the default association route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
        setAssociationDefaultRouteTableId(associationDefaultRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * 
     * @param propagationDefaultRouteTableId
     *        The ID of the default propagation route table.
     */

    public void setPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * 
     * @return The ID of the default propagation route table.
     */

    public String getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * 
     * @param propagationDefaultRouteTableId
     *        The ID of the default propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
        setPropagationDefaultRouteTableId(propagationDefaultRouteTableId);
        return this;
    }

    /**
     * <p>
     * Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     */

    public void setVpnEcmpSupport(String vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * <p>
     * Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     * </p>
     * 
     * @return Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     */

    public String getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    /**
     * <p>
     * Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Turn on or turn off Equal Cost Multipath Protocol (ECMP) support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withVpnEcmpSupport(String vpnEcmpSupport) {
        setVpnEcmpSupport(vpnEcmpSupport);
        return this;
    }

    /**
     * <p>
     * Turn on or turn off DNS support.
     * </p>
     * 
     * @param dnsSupport
     *        Turn on or turn off DNS support.
     */

    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Turn on or turn off DNS support.
     * </p>
     * 
     * @return Turn on or turn off DNS support.
     */

    public String getDnsSupport() {
        return this.dnsSupport;
    }

    /**
     * <p>
     * Turn on or turn off DNS support.
     * </p>
     * 
     * @param dnsSupport
     *        Turn on or turn off DNS support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withDnsSupport(String dnsSupport) {
        setDnsSupport(dnsSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is supported on the transit gateway.
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is supported on the transit gateway.
     */

    public void setMulticastSupport(String multicastSupport) {
        this.multicastSupport = multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is supported on the transit gateway.
     * </p>
     * 
     * @return Indicates whether multicast is supported on the transit gateway.
     */

    public String getMulticastSupport() {
        return this.multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is supported on the transit gateway.
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is supported on the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withMulticastSupport(String multicastSupport) {
        setMulticastSupport(multicastSupport);
        return this;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     */

    public void setAmazonSideAsn(Integer amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     * 
     * @return A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     */

    public Integer getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2TransitGatewayDetails withAmazonSideAsn(Integer amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultRouteTablePropagation() != null)
            sb.append("DefaultRouteTablePropagation: ").append(getDefaultRouteTablePropagation()).append(",");
        if (getAutoAcceptSharedAttachments() != null)
            sb.append("AutoAcceptSharedAttachments: ").append(getAutoAcceptSharedAttachments()).append(",");
        if (getDefaultRouteTableAssociation() != null)
            sb.append("DefaultRouteTableAssociation: ").append(getDefaultRouteTableAssociation()).append(",");
        if (getTransitGatewayCidrBlocks() != null)
            sb.append("TransitGatewayCidrBlocks: ").append(getTransitGatewayCidrBlocks()).append(",");
        if (getAssociationDefaultRouteTableId() != null)
            sb.append("AssociationDefaultRouteTableId: ").append(getAssociationDefaultRouteTableId()).append(",");
        if (getPropagationDefaultRouteTableId() != null)
            sb.append("PropagationDefaultRouteTableId: ").append(getPropagationDefaultRouteTableId()).append(",");
        if (getVpnEcmpSupport() != null)
            sb.append("VpnEcmpSupport: ").append(getVpnEcmpSupport()).append(",");
        if (getDnsSupport() != null)
            sb.append("DnsSupport: ").append(getDnsSupport()).append(",");
        if (getMulticastSupport() != null)
            sb.append("MulticastSupport: ").append(getMulticastSupport()).append(",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2TransitGatewayDetails == false)
            return false;
        AwsEc2TransitGatewayDetails other = (AwsEc2TransitGatewayDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultRouteTablePropagation() == null ^ this.getDefaultRouteTablePropagation() == null)
            return false;
        if (other.getDefaultRouteTablePropagation() != null && other.getDefaultRouteTablePropagation().equals(this.getDefaultRouteTablePropagation()) == false)
            return false;
        if (other.getAutoAcceptSharedAttachments() == null ^ this.getAutoAcceptSharedAttachments() == null)
            return false;
        if (other.getAutoAcceptSharedAttachments() != null && other.getAutoAcceptSharedAttachments().equals(this.getAutoAcceptSharedAttachments()) == false)
            return false;
        if (other.getDefaultRouteTableAssociation() == null ^ this.getDefaultRouteTableAssociation() == null)
            return false;
        if (other.getDefaultRouteTableAssociation() != null && other.getDefaultRouteTableAssociation().equals(this.getDefaultRouteTableAssociation()) == false)
            return false;
        if (other.getTransitGatewayCidrBlocks() == null ^ this.getTransitGatewayCidrBlocks() == null)
            return false;
        if (other.getTransitGatewayCidrBlocks() != null && other.getTransitGatewayCidrBlocks().equals(this.getTransitGatewayCidrBlocks()) == false)
            return false;
        if (other.getAssociationDefaultRouteTableId() == null ^ this.getAssociationDefaultRouteTableId() == null)
            return false;
        if (other.getAssociationDefaultRouteTableId() != null
                && other.getAssociationDefaultRouteTableId().equals(this.getAssociationDefaultRouteTableId()) == false)
            return false;
        if (other.getPropagationDefaultRouteTableId() == null ^ this.getPropagationDefaultRouteTableId() == null)
            return false;
        if (other.getPropagationDefaultRouteTableId() != null
                && other.getPropagationDefaultRouteTableId().equals(this.getPropagationDefaultRouteTableId()) == false)
            return false;
        if (other.getVpnEcmpSupport() == null ^ this.getVpnEcmpSupport() == null)
            return false;
        if (other.getVpnEcmpSupport() != null && other.getVpnEcmpSupport().equals(this.getVpnEcmpSupport()) == false)
            return false;
        if (other.getDnsSupport() == null ^ this.getDnsSupport() == null)
            return false;
        if (other.getDnsSupport() != null && other.getDnsSupport().equals(this.getDnsSupport()) == false)
            return false;
        if (other.getMulticastSupport() == null ^ this.getMulticastSupport() == null)
            return false;
        if (other.getMulticastSupport() != null && other.getMulticastSupport().equals(this.getMulticastSupport()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTablePropagation() == null) ? 0 : getDefaultRouteTablePropagation().hashCode());
        hashCode = prime * hashCode + ((getAutoAcceptSharedAttachments() == null) ? 0 : getAutoAcceptSharedAttachments().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTableAssociation() == null) ? 0 : getDefaultRouteTableAssociation().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayCidrBlocks() == null) ? 0 : getTransitGatewayCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getAssociationDefaultRouteTableId() == null) ? 0 : getAssociationDefaultRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getPropagationDefaultRouteTableId() == null) ? 0 : getPropagationDefaultRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getVpnEcmpSupport() == null) ? 0 : getVpnEcmpSupport().hashCode());
        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getMulticastSupport() == null) ? 0 : getMulticastSupport().hashCode());
        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2TransitGatewayDetails clone() {
        try {
            return (AwsEc2TransitGatewayDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2TransitGatewayDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
