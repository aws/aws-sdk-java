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
 * The transit gateway options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTransitGatewayOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a
     * size /64 CIDR block or larger for IPv6.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addTransitGatewayCidrBlocks;
    /**
     * <p>
     * Removes CIDR blocks for the transit gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeTransitGatewayCidrBlocks;
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
     * Enable or disable automatic acceptance of attachment requests.
     * </p>
     */
    private String autoAcceptSharedAttachments;
    /**
     * <p>
     * Enable or disable automatic association with the default association route table.
     * </p>
     */
    private String defaultRouteTableAssociation;
    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     */
    private String associationDefaultRouteTableId;
    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table.
     * </p>
     */
    private String defaultRouteTablePropagation;
    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     */
    private String propagationDefaultRouteTableId;

    /**
     * <p>
     * Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a
     * size /64 CIDR block or larger for IPv6.
     * </p>
     * 
     * @return Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     *         or a size /64 CIDR block or larger for IPv6.
     */

    public java.util.List<String> getAddTransitGatewayCidrBlocks() {
        if (addTransitGatewayCidrBlocks == null) {
            addTransitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addTransitGatewayCidrBlocks;
    }

    /**
     * <p>
     * Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a
     * size /64 CIDR block or larger for IPv6.
     * </p>
     * 
     * @param addTransitGatewayCidrBlocks
     *        Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     *        or a size /64 CIDR block or larger for IPv6.
     */

    public void setAddTransitGatewayCidrBlocks(java.util.Collection<String> addTransitGatewayCidrBlocks) {
        if (addTransitGatewayCidrBlocks == null) {
            this.addTransitGatewayCidrBlocks = null;
            return;
        }

        this.addTransitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>(addTransitGatewayCidrBlocks);
    }

    /**
     * <p>
     * Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a
     * size /64 CIDR block or larger for IPv6.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddTransitGatewayCidrBlocks(java.util.Collection)} or
     * {@link #withAddTransitGatewayCidrBlocks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addTransitGatewayCidrBlocks
     *        Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     *        or a size /64 CIDR block or larger for IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayOptions withAddTransitGatewayCidrBlocks(String... addTransitGatewayCidrBlocks) {
        if (this.addTransitGatewayCidrBlocks == null) {
            setAddTransitGatewayCidrBlocks(new com.amazonaws.internal.SdkInternalList<String>(addTransitGatewayCidrBlocks.length));
        }
        for (String ele : addTransitGatewayCidrBlocks) {
            this.addTransitGatewayCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a
     * size /64 CIDR block or larger for IPv6.
     * </p>
     * 
     * @param addTransitGatewayCidrBlocks
     *        Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4,
     *        or a size /64 CIDR block or larger for IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayOptions withAddTransitGatewayCidrBlocks(java.util.Collection<String> addTransitGatewayCidrBlocks) {
        setAddTransitGatewayCidrBlocks(addTransitGatewayCidrBlocks);
        return this;
    }

    /**
     * <p>
     * Removes CIDR blocks for the transit gateway.
     * </p>
     * 
     * @return Removes CIDR blocks for the transit gateway.
     */

    public java.util.List<String> getRemoveTransitGatewayCidrBlocks() {
        if (removeTransitGatewayCidrBlocks == null) {
            removeTransitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeTransitGatewayCidrBlocks;
    }

    /**
     * <p>
     * Removes CIDR blocks for the transit gateway.
     * </p>
     * 
     * @param removeTransitGatewayCidrBlocks
     *        Removes CIDR blocks for the transit gateway.
     */

    public void setRemoveTransitGatewayCidrBlocks(java.util.Collection<String> removeTransitGatewayCidrBlocks) {
        if (removeTransitGatewayCidrBlocks == null) {
            this.removeTransitGatewayCidrBlocks = null;
            return;
        }

        this.removeTransitGatewayCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>(removeTransitGatewayCidrBlocks);
    }

    /**
     * <p>
     * Removes CIDR blocks for the transit gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveTransitGatewayCidrBlocks(java.util.Collection)} or
     * {@link #withRemoveTransitGatewayCidrBlocks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeTransitGatewayCidrBlocks
     *        Removes CIDR blocks for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayOptions withRemoveTransitGatewayCidrBlocks(String... removeTransitGatewayCidrBlocks) {
        if (this.removeTransitGatewayCidrBlocks == null) {
            setRemoveTransitGatewayCidrBlocks(new com.amazonaws.internal.SdkInternalList<String>(removeTransitGatewayCidrBlocks.length));
        }
        for (String ele : removeTransitGatewayCidrBlocks) {
            this.removeTransitGatewayCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Removes CIDR blocks for the transit gateway.
     * </p>
     * 
     * @param removeTransitGatewayCidrBlocks
     *        Removes CIDR blocks for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayOptions withRemoveTransitGatewayCidrBlocks(java.util.Collection<String> removeTransitGatewayCidrBlocks) {
        setRemoveTransitGatewayCidrBlocks(removeTransitGatewayCidrBlocks);
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

    public ModifyTransitGatewayOptions withVpnEcmpSupport(String vpnEcmpSupport) {
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

    public ModifyTransitGatewayOptions withVpnEcmpSupport(VpnEcmpSupportValue vpnEcmpSupport) {
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

    public ModifyTransitGatewayOptions withDnsSupport(String dnsSupport) {
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

    public ModifyTransitGatewayOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests.
     * </p>
     * 
     * @return Enable or disable automatic acceptance of attachment requests.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public ModifyTransitGatewayOptions withAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        setAutoAcceptSharedAttachments(autoAcceptSharedAttachments);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic acceptance of attachment requests.
     * </p>
     * 
     * @param autoAcceptSharedAttachments
     *        Enable or disable automatic acceptance of attachment requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */

    public ModifyTransitGatewayOptions withAutoAcceptSharedAttachments(AutoAcceptSharedAttachmentsValue autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments.toString();
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table.
     * @see DefaultRouteTableAssociationValue
     */

    public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table.
     * </p>
     * 
     * @return Enable or disable automatic association with the default association route table.
     * @see DefaultRouteTableAssociationValue
     */

    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public ModifyTransitGatewayOptions withDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        setDefaultRouteTableAssociation(defaultRouteTableAssociation);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic association with the default association route table.
     * </p>
     * 
     * @param defaultRouteTableAssociation
     *        Enable or disable automatic association with the default association route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTableAssociationValue
     */

    public ModifyTransitGatewayOptions withDefaultRouteTableAssociation(DefaultRouteTableAssociationValue defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation.toString();
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

    public ModifyTransitGatewayOptions withAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
        setAssociationDefaultRouteTableId(associationDefaultRouteTableId);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table.
     * @see DefaultRouteTablePropagationValue
     */

    public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @return Enable or disable automatic propagation of routes to the default propagation route table.
     * @see DefaultRouteTablePropagationValue
     */

    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public ModifyTransitGatewayOptions withDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        setDefaultRouteTablePropagation(defaultRouteTablePropagation);
        return this;
    }

    /**
     * <p>
     * Enable or disable automatic propagation of routes to the default propagation route table.
     * </p>
     * 
     * @param defaultRouteTablePropagation
     *        Enable or disable automatic propagation of routes to the default propagation route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultRouteTablePropagationValue
     */

    public ModifyTransitGatewayOptions withDefaultRouteTablePropagation(DefaultRouteTablePropagationValue defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation.toString();
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

    public ModifyTransitGatewayOptions withPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
        setPropagationDefaultRouteTableId(propagationDefaultRouteTableId);
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
        if (getAddTransitGatewayCidrBlocks() != null)
            sb.append("AddTransitGatewayCidrBlocks: ").append(getAddTransitGatewayCidrBlocks()).append(",");
        if (getRemoveTransitGatewayCidrBlocks() != null)
            sb.append("RemoveTransitGatewayCidrBlocks: ").append(getRemoveTransitGatewayCidrBlocks()).append(",");
        if (getVpnEcmpSupport() != null)
            sb.append("VpnEcmpSupport: ").append(getVpnEcmpSupport()).append(",");
        if (getDnsSupport() != null)
            sb.append("DnsSupport: ").append(getDnsSupport()).append(",");
        if (getAutoAcceptSharedAttachments() != null)
            sb.append("AutoAcceptSharedAttachments: ").append(getAutoAcceptSharedAttachments()).append(",");
        if (getDefaultRouteTableAssociation() != null)
            sb.append("DefaultRouteTableAssociation: ").append(getDefaultRouteTableAssociation()).append(",");
        if (getAssociationDefaultRouteTableId() != null)
            sb.append("AssociationDefaultRouteTableId: ").append(getAssociationDefaultRouteTableId()).append(",");
        if (getDefaultRouteTablePropagation() != null)
            sb.append("DefaultRouteTablePropagation: ").append(getDefaultRouteTablePropagation()).append(",");
        if (getPropagationDefaultRouteTableId() != null)
            sb.append("PropagationDefaultRouteTableId: ").append(getPropagationDefaultRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTransitGatewayOptions == false)
            return false;
        ModifyTransitGatewayOptions other = (ModifyTransitGatewayOptions) obj;
        if (other.getAddTransitGatewayCidrBlocks() == null ^ this.getAddTransitGatewayCidrBlocks() == null)
            return false;
        if (other.getAddTransitGatewayCidrBlocks() != null && other.getAddTransitGatewayCidrBlocks().equals(this.getAddTransitGatewayCidrBlocks()) == false)
            return false;
        if (other.getRemoveTransitGatewayCidrBlocks() == null ^ this.getRemoveTransitGatewayCidrBlocks() == null)
            return false;
        if (other.getRemoveTransitGatewayCidrBlocks() != null
                && other.getRemoveTransitGatewayCidrBlocks().equals(this.getRemoveTransitGatewayCidrBlocks()) == false)
            return false;
        if (other.getVpnEcmpSupport() == null ^ this.getVpnEcmpSupport() == null)
            return false;
        if (other.getVpnEcmpSupport() != null && other.getVpnEcmpSupport().equals(this.getVpnEcmpSupport()) == false)
            return false;
        if (other.getDnsSupport() == null ^ this.getDnsSupport() == null)
            return false;
        if (other.getDnsSupport() != null && other.getDnsSupport().equals(this.getDnsSupport()) == false)
            return false;
        if (other.getAutoAcceptSharedAttachments() == null ^ this.getAutoAcceptSharedAttachments() == null)
            return false;
        if (other.getAutoAcceptSharedAttachments() != null && other.getAutoAcceptSharedAttachments().equals(this.getAutoAcceptSharedAttachments()) == false)
            return false;
        if (other.getDefaultRouteTableAssociation() == null ^ this.getDefaultRouteTableAssociation() == null)
            return false;
        if (other.getDefaultRouteTableAssociation() != null && other.getDefaultRouteTableAssociation().equals(this.getDefaultRouteTableAssociation()) == false)
            return false;
        if (other.getAssociationDefaultRouteTableId() == null ^ this.getAssociationDefaultRouteTableId() == null)
            return false;
        if (other.getAssociationDefaultRouteTableId() != null
                && other.getAssociationDefaultRouteTableId().equals(this.getAssociationDefaultRouteTableId()) == false)
            return false;
        if (other.getDefaultRouteTablePropagation() == null ^ this.getDefaultRouteTablePropagation() == null)
            return false;
        if (other.getDefaultRouteTablePropagation() != null && other.getDefaultRouteTablePropagation().equals(this.getDefaultRouteTablePropagation()) == false)
            return false;
        if (other.getPropagationDefaultRouteTableId() == null ^ this.getPropagationDefaultRouteTableId() == null)
            return false;
        if (other.getPropagationDefaultRouteTableId() != null
                && other.getPropagationDefaultRouteTableId().equals(this.getPropagationDefaultRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddTransitGatewayCidrBlocks() == null) ? 0 : getAddTransitGatewayCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getRemoveTransitGatewayCidrBlocks() == null) ? 0 : getRemoveTransitGatewayCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getVpnEcmpSupport() == null) ? 0 : getVpnEcmpSupport().hashCode());
        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getAutoAcceptSharedAttachments() == null) ? 0 : getAutoAcceptSharedAttachments().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTableAssociation() == null) ? 0 : getDefaultRouteTableAssociation().hashCode());
        hashCode = prime * hashCode + ((getAssociationDefaultRouteTableId() == null) ? 0 : getAssociationDefaultRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteTablePropagation() == null) ? 0 : getDefaultRouteTablePropagation().hashCode());
        hashCode = prime * hashCode + ((getPropagationDefaultRouteTableId() == null) ? 0 : getPropagationDefaultRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTransitGatewayOptions clone() {
        try {
            return (ModifyTransitGatewayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
