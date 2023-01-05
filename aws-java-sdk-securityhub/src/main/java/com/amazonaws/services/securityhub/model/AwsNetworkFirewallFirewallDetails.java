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
 * Details about an Network Firewall firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsNetworkFirewallFirewallDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsNetworkFirewallFirewallDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     * deleted.
     * </p>
     */
    private Boolean deleteProtection;
    /**
     * <p>
     * A description of the firewall.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the firewall.
     * </p>
     */
    private String firewallArn;
    /**
     * <p>
     * The identifier of the firewall.
     * </p>
     */
    private String firewallId;
    /**
     * <p>
     * A descriptive name of the firewall.
     * </p>
     */
    private String firewallName;
    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     */
    private String firewallPolicyArn;
    /**
     * <p>
     * Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you cannot
     * associate a different policy with the firewall.
     * </p>
     */
    private Boolean firewallPolicyChangeProtection;
    /**
     * <p>
     * Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>, you
     * cannot map different subnets to the firewall.
     * </p>
     */
    private Boolean subnetChangeProtection;
    /**
     * <p>
     * The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     */
    private java.util.List<AwsNetworkFirewallFirewallSubnetMappingsDetails> subnetMappings;
    /**
     * <p>
     * The identifier of the VPC where the firewall is used.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     * deleted.
     * </p>
     * 
     * @param deleteProtection
     *        Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     *        deleted.
     */

    public void setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     * deleted.
     * </p>
     * 
     * @return Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     *         deleted.
     */

    public Boolean getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     * deleted.
     * </p>
     * 
     * @param deleteProtection
     *        Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withDeleteProtection(Boolean deleteProtection) {
        setDeleteProtection(deleteProtection);
        return this;
    }

    /**
     * <p>
     * Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     * deleted.
     * </p>
     * 
     * @return Whether the firewall is protected from deletion. If set to <code>true</code>, then the firewall cannot be
     *         deleted.
     */

    public Boolean isDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * <p>
     * A description of the firewall.
     * </p>
     * 
     * @param description
     *        A description of the firewall.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the firewall.
     * </p>
     * 
     * @return A description of the firewall.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the firewall.
     * </p>
     * 
     * @param description
     *        A description of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the firewall.
     * </p>
     * 
     * @param firewallArn
     *        The ARN of the firewall.
     */

    public void setFirewallArn(String firewallArn) {
        this.firewallArn = firewallArn;
    }

    /**
     * <p>
     * The ARN of the firewall.
     * </p>
     * 
     * @return The ARN of the firewall.
     */

    public String getFirewallArn() {
        return this.firewallArn;
    }

    /**
     * <p>
     * The ARN of the firewall.
     * </p>
     * 
     * @param firewallArn
     *        The ARN of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withFirewallArn(String firewallArn) {
        setFirewallArn(firewallArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the firewall.
     * </p>
     * 
     * @param firewallId
     *        The identifier of the firewall.
     */

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    /**
     * <p>
     * The identifier of the firewall.
     * </p>
     * 
     * @return The identifier of the firewall.
     */

    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * <p>
     * The identifier of the firewall.
     * </p>
     * 
     * @param firewallId
     *        The identifier of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withFirewallId(String firewallId) {
        setFirewallId(firewallId);
        return this;
    }

    /**
     * <p>
     * A descriptive name of the firewall.
     * </p>
     * 
     * @param firewallName
     *        A descriptive name of the firewall.
     */

    public void setFirewallName(String firewallName) {
        this.firewallName = firewallName;
    }

    /**
     * <p>
     * A descriptive name of the firewall.
     * </p>
     * 
     * @return A descriptive name of the firewall.
     */

    public String getFirewallName() {
        return this.firewallName;
    }

    /**
     * <p>
     * A descriptive name of the firewall.
     * </p>
     * 
     * @param firewallName
     *        A descriptive name of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withFirewallName(String firewallName) {
        setFirewallName(firewallName);
        return this;
    }

    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The ARN of the firewall policy.
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     * 
     * @return The ARN of the firewall policy.
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The ARN of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
        return this;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you cannot
     * associate a different policy with the firewall.
     * </p>
     * 
     * @param firewallPolicyChangeProtection
     *        Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you
     *        cannot associate a different policy with the firewall.
     */

    public void setFirewallPolicyChangeProtection(Boolean firewallPolicyChangeProtection) {
        this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you cannot
     * associate a different policy with the firewall.
     * </p>
     * 
     * @return Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you
     *         cannot associate a different policy with the firewall.
     */

    public Boolean getFirewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you cannot
     * associate a different policy with the firewall.
     * </p>
     * 
     * @param firewallPolicyChangeProtection
     *        Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you
     *        cannot associate a different policy with the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withFirewallPolicyChangeProtection(Boolean firewallPolicyChangeProtection) {
        setFirewallPolicyChangeProtection(firewallPolicyChangeProtection);
        return this;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you cannot
     * associate a different policy with the firewall.
     * </p>
     * 
     * @return Whether the firewall is protected from a change to the firewall policy. If set to <code>true</code>, you
     *         cannot associate a different policy with the firewall.
     */

    public Boolean isFirewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>, you
     * cannot map different subnets to the firewall.
     * </p>
     * 
     * @param subnetChangeProtection
     *        Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>,
     *        you cannot map different subnets to the firewall.
     */

    public void setSubnetChangeProtection(Boolean subnetChangeProtection) {
        this.subnetChangeProtection = subnetChangeProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>, you
     * cannot map different subnets to the firewall.
     * </p>
     * 
     * @return Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>,
     *         you cannot map different subnets to the firewall.
     */

    public Boolean getSubnetChangeProtection() {
        return this.subnetChangeProtection;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>, you
     * cannot map different subnets to the firewall.
     * </p>
     * 
     * @param subnetChangeProtection
     *        Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>,
     *        you cannot map different subnets to the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withSubnetChangeProtection(Boolean subnetChangeProtection) {
        setSubnetChangeProtection(subnetChangeProtection);
        return this;
    }

    /**
     * <p>
     * Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>, you
     * cannot map different subnets to the firewall.
     * </p>
     * 
     * @return Whether the firewall is protected from a change to the subnet associations. If set to <code>true</code>,
     *         you cannot map different subnets to the firewall.
     */

    public Boolean isSubnetChangeProtection() {
        return this.subnetChangeProtection;
    }

    /**
     * <p>
     * The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * 
     * @return The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     *         Availability Zone.
     */

    public java.util.List<AwsNetworkFirewallFirewallSubnetMappingsDetails> getSubnetMappings() {
        return subnetMappings;
    }

    /**
     * <p>
     * The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * 
     * @param subnetMappings
     *        The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     *        Availability Zone.
     */

    public void setSubnetMappings(java.util.Collection<AwsNetworkFirewallFirewallSubnetMappingsDetails> subnetMappings) {
        if (subnetMappings == null) {
            this.subnetMappings = null;
            return;
        }

        this.subnetMappings = new java.util.ArrayList<AwsNetworkFirewallFirewallSubnetMappingsDetails>(subnetMappings);
    }

    /**
     * <p>
     * The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetMappings(java.util.Collection)} or {@link #withSubnetMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subnetMappings
     *        The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     *        Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withSubnetMappings(AwsNetworkFirewallFirewallSubnetMappingsDetails... subnetMappings) {
        if (this.subnetMappings == null) {
            setSubnetMappings(new java.util.ArrayList<AwsNetworkFirewallFirewallSubnetMappingsDetails>(subnetMappings.length));
        }
        for (AwsNetworkFirewallFirewallSubnetMappingsDetails ele : subnetMappings) {
            this.subnetMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * 
     * @param subnetMappings
     *        The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different
     *        Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withSubnetMappings(java.util.Collection<AwsNetworkFirewallFirewallSubnetMappingsDetails> subnetMappings) {
        setSubnetMappings(subnetMappings);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC where the firewall is used.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC where the firewall is used.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC where the firewall is used.
     * </p>
     * 
     * @return The identifier of the VPC where the firewall is used.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC where the firewall is used.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC where the firewall is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getDeleteProtection() != null)
            sb.append("DeleteProtection: ").append(getDeleteProtection()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFirewallArn() != null)
            sb.append("FirewallArn: ").append(getFirewallArn()).append(",");
        if (getFirewallId() != null)
            sb.append("FirewallId: ").append(getFirewallId()).append(",");
        if (getFirewallName() != null)
            sb.append("FirewallName: ").append(getFirewallName()).append(",");
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn()).append(",");
        if (getFirewallPolicyChangeProtection() != null)
            sb.append("FirewallPolicyChangeProtection: ").append(getFirewallPolicyChangeProtection()).append(",");
        if (getSubnetChangeProtection() != null)
            sb.append("SubnetChangeProtection: ").append(getSubnetChangeProtection()).append(",");
        if (getSubnetMappings() != null)
            sb.append("SubnetMappings: ").append(getSubnetMappings()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsNetworkFirewallFirewallDetails == false)
            return false;
        AwsNetworkFirewallFirewallDetails other = (AwsNetworkFirewallFirewallDetails) obj;
        if (other.getDeleteProtection() == null ^ this.getDeleteProtection() == null)
            return false;
        if (other.getDeleteProtection() != null && other.getDeleteProtection().equals(this.getDeleteProtection()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFirewallArn() == null ^ this.getFirewallArn() == null)
            return false;
        if (other.getFirewallArn() != null && other.getFirewallArn().equals(this.getFirewallArn()) == false)
            return false;
        if (other.getFirewallId() == null ^ this.getFirewallId() == null)
            return false;
        if (other.getFirewallId() != null && other.getFirewallId().equals(this.getFirewallId()) == false)
            return false;
        if (other.getFirewallName() == null ^ this.getFirewallName() == null)
            return false;
        if (other.getFirewallName() != null && other.getFirewallName().equals(this.getFirewallName()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        if (other.getFirewallPolicyChangeProtection() == null ^ this.getFirewallPolicyChangeProtection() == null)
            return false;
        if (other.getFirewallPolicyChangeProtection() != null
                && other.getFirewallPolicyChangeProtection().equals(this.getFirewallPolicyChangeProtection()) == false)
            return false;
        if (other.getSubnetChangeProtection() == null ^ this.getSubnetChangeProtection() == null)
            return false;
        if (other.getSubnetChangeProtection() != null && other.getSubnetChangeProtection().equals(this.getSubnetChangeProtection()) == false)
            return false;
        if (other.getSubnetMappings() == null ^ this.getSubnetMappings() == null)
            return false;
        if (other.getSubnetMappings() != null && other.getSubnetMappings().equals(this.getSubnetMappings()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteProtection() == null) ? 0 : getDeleteProtection().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFirewallArn() == null) ? 0 : getFirewallArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallId() == null) ? 0 : getFirewallId().hashCode());
        hashCode = prime * hashCode + ((getFirewallName() == null) ? 0 : getFirewallName().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyChangeProtection() == null) ? 0 : getFirewallPolicyChangeProtection().hashCode());
        hashCode = prime * hashCode + ((getSubnetChangeProtection() == null) ? 0 : getSubnetChangeProtection().hashCode());
        hashCode = prime * hashCode + ((getSubnetMappings() == null) ? 0 : getSubnetMappings().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AwsNetworkFirewallFirewallDetails clone() {
        try {
            return (AwsNetworkFirewallFirewallDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsNetworkFirewallFirewallDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
