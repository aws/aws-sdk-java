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
 * Describes the options for a transit gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayRequestOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRequestOptions implements Serializable, Cloneable {

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * </p>
     */
    private String autoAcceptSharedAttachments;
    /**
     * <p>
     * Enable or disable automatic association with the default association route table. Enabled by default.
     * </p>
     */
    private String defaultRouteTableAssociation;
    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
     * </p>
     */
    private String defaultRouteTablePropagation;
    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * </p>
     */
    private String vpnEcmpSupport;
    /**
     * <p>
     * Enable or disable DNS support. Enabled by default.
     * </p>
     */
    private String dnsSupport;
    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     */
    private String multicastSupport;
    /**
     * <p>
     * One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     * or a size /64 CIDR block or larger for IPv6.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> transitGatewayCidrBlocks;

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534
     *        for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     * </p>
     * 
     * @return A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to
     *         65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534
     *        for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is <code>64512</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRequestOptions withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * </p>
     * 
     * @return Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public TransitGatewayRequestOptions withAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        setAutoAcceptSharedAttachments(autoAcceptSharedAttachments);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests. Disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public TransitGatewayRequestOptions withAutoAcceptSharedAttachments(AutoAcceptSharedAttachmentsValue autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. Enabled by default.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table. Enabled by default.
     * @see DefaultRouteTableAssociationValue
     */

    public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. Enabled by default.
     * </p>
     * 
     * @return Enable or disable automatic association with the default association route table. Enabled by default.
     * @see DefaultRouteTableAssociationValue
     */

    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. Enabled by default.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table. Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        setDefaultRouteTableAssociation(defaultRouteTableAssociation);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. Enabled by default.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table. Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTableAssociation(DefaultRouteTableAssociationValue defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table. Enabled by
     *        default.
     * @see DefaultRouteTablePropagationValue
     */

    public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
     * </p>
     * 
     * @return Enable or disable automatic propagation of routes to the default propagation route table. Enabled by
     *         default.
     * @see DefaultRouteTablePropagationValue
     */

    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table. Enabled by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        setDefaultRouteTablePropagation(defaultRouteTablePropagation);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table. Enabled by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTablePropagation(DefaultRouteTablePropagationValue defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * @see VpnEcmpSupportValue
     */

    public void setVpnEcmpSupport(String vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * </p>
     * 
     * @return Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * @see VpnEcmpSupportValue
     */

    public String getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnEcmpSupportValue
     */

    public TransitGatewayRequestOptions withVpnEcmpSupport(String vpnEcmpSupport) {
        setVpnEcmpSupport(vpnEcmpSupport);
        return this;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnEcmpSupportValue
     */

    public TransitGatewayRequestOptions withVpnEcmpSupport(VpnEcmpSupportValue vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable DNS support. Enabled by default.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support. Enabled by default.
     * @see DnsSupportValue
     */

    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Enable or disable DNS support. Enabled by default.
     * </p>
     * 
     * @return Enable or disable DNS support. Enabled by default.
     * @see DnsSupportValue
     */

    public String getDnsSupport() {
        return this.dnsSupport;
    }

    /**
     * <p>
     * Enable or disable DNS support. Enabled by default.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support. Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayRequestOptions withDnsSupport(String dnsSupport) {
        setDnsSupport(dnsSupport);
        return this;
    }

    /**
     * <p>
     * Enable or disable DNS support. Enabled by default.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support. Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayRequestOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is enabled on the transit gateway
     * @see MulticastSupportValue
     */

    public void setMulticastSupport(String multicastSupport) {
        this.multicastSupport = multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @return Indicates whether multicast is enabled on the transit gateway
     * @see MulticastSupportValue
     */

    public String getMulticastSupport() {
        return this.multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is enabled on the transit gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MulticastSupportValue
     */

    public TransitGatewayRequestOptions withMulticastSupport(String multicastSupport) {
        setMulticastSupport(multicastSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * 
     * @param multicastSupport
     *        Indicates whether multicast is enabled on the transit gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MulticastSupportValue
     */

    public TransitGatewayRequestOptions withMulticastSupport(MulticastSupportValue multicastSupport) {
        this.multicastSupport = multicastSupport.toString();
        return this;
    }

    /**
     * <p>
     * One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     * or a size /64 CIDR block or larger for IPv6.
     * </p>
     * 
     * @return One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for
     *         IPv4, or a size /64 CIDR block or larger for IPv6.
     */

    public java.util.List<String> getTransitGatewayCidrBlocks() {
        if (transitGatewayCidrBlocks == null) {
            transitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return transitGatewayCidrBlocks;
    }

    /**
     * <p>
     * One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     * or a size /64 CIDR block or larger for IPv6.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for
     *        IPv4, or a size /64 CIDR block or larger for IPv6.
     */

    public void setTransitGatewayCidrBlocks(java.util.Collection<String> transitGatewayCidrBlocks) {
        if (transitGatewayCidrBlocks == null) {
            this.transitGatewayCidrBlocks = null;
            return;
        }

        this.transitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>(transitGatewayCidrBlocks);
    }

    /**
     * <p>
     * One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     * or a size /64 CIDR block or larger for IPv6.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayCidrBlocks(java.util.Collection)} or
     * {@link #withTransitGatewayCidrBlocks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for
     *        IPv4, or a size /64 CIDR block or larger for IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRequestOptions withTransitGatewayCidrBlocks(String... transitGatewayCidrBlocks) {
        if (this.transitGatewayCidrBlocks == null) {
            setTransitGatewayCidrBlocks(new com.amazonaws.internal.SdkInternalList<String>(transitGatewayCidrBlocks.length));
        }
        for (String ele : transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     * or a size /64 CIDR block or larger for IPv6.
     * </p>
     * 
     * @param transitGatewayCidrBlocks
     *        One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for
     *        IPv4, or a size /64 CIDR block or larger for IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRequestOptions withTransitGatewayCidrBlocks(java.util.Collection<String> transitGatewayCidrBlocks) {
        setTransitGatewayCidrBlocks(transitGatewayCidrBlocks);
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
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn()).append(",");
        if (getAutoAcceptSharedAttachments() != null)
            sb.append("AutoAcceptSharedAttachments: ").append(getAutoAcceptSharedAttachments()).append(",");
        if (getDefaultRouteTableAssociation() != null)
            sb.append("DefaultRouteTableAssociation: ").append(getDefaultRouteTableAssociation()).append(",");
        if (getDefaultRouteTablePropagation() != null)
            sb.append("DefaultRouteTablePropagation: ").append(getDefaultRouteTablePropagation()).append(",");
        if (getVpnEcmpSupport() != null)
            sb.append("VpnEcmpSupport: ").append(getVpnEcmpSupport()).append(",");
        if (getDnsSupport() != null)
            sb.append("DnsSupport: ").append(getDnsSupport()).append(",");
        if (getMulticastSupport() != null)
            sb.append("MulticastSupport: ").append(getMulticastSupport()).append(",");
        if (getTransitGatewayCidrBlocks() != null)
            sb.append("TransitGatewayCidrBlocks: ").append(getTransitGatewayCidrBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayRequestOptions == false)
            return false;
        TransitGatewayRequestOptions other = (TransitGatewayRequestOptions) obj;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getAutoAcceptSharedAttachments() == null ^ this.getAutoAcceptSharedAttachments() == null)
            return false;
        if (other.getAutoAcceptSharedAttachments() != null && other.getAutoAcceptSharedAttachments().equals(this.getAutoAcceptSharedAttachments()) == false)
            return false;
        if (other.getDefaultRouteTableAssociation() == null ^ this.getDefaultRouteTableAssociation() == null)
            return false;
        if (other.getDefaultRouteTableAssociation() != null && other.getDefaultRouteTableAssociation().equals(this.getDefaultRouteTableAssociation()) == false)
            return false;
        if (other.getDefaultRouteTablePropagation() == null ^ this.getDefaultRouteTablePropagation() == null)
            return false;
        if (other.getDefaultRouteTablePropagation() != null && other.getDefaultRouteTablePropagation().equals(this.getDefaultRouteTablePropagation()) == false)
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
        if (other.getTransitGatewayCidrBlocks() == null ^ this.getTransitGatewayCidrBlocks() == null)
            return false;
        if (other.getTransitGatewayCidrBlocks() != null && other.getTransitGatewayCidrBlocks().equals(this.getTransitGatewayCidrBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getAutoAcceptSharedAttachments() == null) ? 0 : getAutoAcceptSharedAttachments().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTableAssociation() == null) ? 0 : getDefaultRouteTableAssociation().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTablePropagation() == null) ? 0 : getDefaultRouteTablePropagation().hashCode());
        hashCode = prime * hashCode + ((getVpnEcmpSupport() == null) ? 0 : getVpnEcmpSupport().hashCode());
        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getMulticastSupport() == null) ? 0 : getMulticastSupport().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayCidrBlocks() == null) ? 0 : getTransitGatewayCidrBlocks().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayRequestOptions clone() {
        try {
            return (TransitGatewayRequestOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
