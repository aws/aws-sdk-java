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
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * </p>
     */
    private String autoAcceptSharedAttachments;
    /**
     * <p>
     * Enable or disable automatic association with the default association route table. The default is
     * <code>enable</code>.
     * </p>
     */
    private String defaultRouteTableAssociation;
    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. The default is
     * <code>enable</code>.
     * </p>
     */
    private String defaultRouteTablePropagation;
    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support.
     * </p>
     */
    private String vpnEcmpSupport;
    /**
     * <p>
     * Enable or disable DNS support.
     * </p>
     */
    private String dnsSupport;

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534
     *        for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     * 
     * @return A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to
     *         65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for
     * 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * </p>
     * 
     * @param amazonSideAsn
     *        A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534
     *        for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRequestOptions withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * </p>
     * 
     * @return Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public TransitGatewayRequestOptions withAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        setAutoAcceptSharedAttachments(autoAcceptSharedAttachments);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests. The default is <code>disable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public TransitGatewayRequestOptions withAutoAcceptSharedAttachments(AutoAcceptSharedAttachmentsValue autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table. The default is
     *        <code>enable</code>.
     * @see DefaultRouteTableAssociationValue
     */

    public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @return Enable or disable automatic association with the default association route table. The default is
     *         <code>enable</code>.
     * @see DefaultRouteTableAssociationValue
     */

    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table. The default is
     *        <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        setDefaultRouteTableAssociation(defaultRouteTableAssociation);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table. The default is
     *        <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTableAssociation(DefaultRouteTableAssociationValue defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table. The default is
     *        <code>enable</code>.
     * @see DefaultRouteTablePropagationValue
     */

    public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @return Enable or disable automatic propagation of routes to the default propagation route table. The default is
     *         <code>enable</code>.
     * @see DefaultRouteTablePropagationValue
     */

    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table. The default is
     *        <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        setDefaultRouteTablePropagation(defaultRouteTablePropagation);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table. The default is
     * <code>enable</code>.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table. The default is
     *        <code>enable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public TransitGatewayRequestOptions withDefaultRouteTablePropagation(DefaultRouteTablePropagationValue defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Enable or disable Equal Cost Multipath Protocol support.
     * @see VpnEcmpSupportValue
     */

    public void setVpnEcmpSupport(String vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support.
     * </p>
     * 
     * @return Enable or disable Equal Cost Multipath Protocol support.
     * @see VpnEcmpSupportValue
     */

    public String getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Enable or disable Equal Cost Multipath Protocol support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnEcmpSupportValue
     */

    public TransitGatewayRequestOptions withVpnEcmpSupport(String vpnEcmpSupport) {
        setVpnEcmpSupport(vpnEcmpSupport);
        return this;
    }

    /**
     * <p>
     * Enable or disable Equal Cost Multipath Protocol support.
     * </p>
     * 
     * @param vpnEcmpSupport
     *        Enable or disable Equal Cost Multipath Protocol support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnEcmpSupportValue
     */

    public TransitGatewayRequestOptions withVpnEcmpSupport(VpnEcmpSupportValue vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable DNS support.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support.
     * @see DnsSupportValue
     */

    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Enable or disable DNS support.
     * </p>
     * 
     * @return Enable or disable DNS support.
     * @see DnsSupportValue
     */

    public String getDnsSupport() {
        return this.dnsSupport;
    }

    /**
     * <p>
     * Enable or disable DNS support.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayRequestOptions withDnsSupport(String dnsSupport) {
        setDnsSupport(dnsSupport);
        return this;
    }

    /**
     * <p>
     * Enable or disable DNS support.
     * </p>
     * 
     * @param dnsSupport
     *        Enable or disable DNS support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsSupportValue
     */

    public TransitGatewayRequestOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
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
            sb.append("DnsSupport: ").append(getDnsSupport());
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
