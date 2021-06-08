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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The firewall defines the configuration settings for an AWS Network Firewall firewall. These settings include the
 * firewall policy, the subnets in your VPC to use for the firewall endpoints, and any tags that are attached to the
 * firewall AWS resource.
 * </p>
 * <p>
 * The status of the firewall, for example whether it's ready to filter network traffic, is provided in the
 * corresponding <a>FirewallStatus</a>. You can retrieve both objects by calling <a>DescribeFirewall</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/Firewall" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Firewall implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     */
    private String firewallName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     */
    private String firewallArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy
     * association, and you can use the same firewall policy for multiple firewalls.
     * </p>
     */
    private String firewallPolicyArn;
    /**
     * <p>
     * The unique identifier of the VPC where the firewall is in use.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     */
    private java.util.List<SubnetMapping> subnetMappings;
    /**
     * <p>
     * A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates that
     * the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall
     * that is in use. When you create a firewall, the operation initializes this flag to <code>TRUE</code>.
     * </p>
     */
    private Boolean deleteProtection;
    /**
     * <p>
     * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this
     * setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you
     * create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     */
    private Boolean subnetChangeProtection;
    /**
     * <p>
     * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use
     * this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When
     * you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     */
    private Boolean firewallPolicyChangeProtection;
    /**
     * <p>
     * A description of the firewall.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the firewall.
     * </p>
     */
    private String firewallId;
    /** <p/> */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * 
     * @param firewallName
     *        The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     */

    public void setFirewallName(String firewallName) {
        this.firewallName = firewallName;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * 
     * @return The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     */

    public String getFirewallName() {
        return this.firewallName;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * 
     * @param firewallName
     *        The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withFirewallName(String firewallName) {
        setFirewallName(firewallName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * 
     * @param firewallArn
     *        The Amazon Resource Name (ARN) of the firewall.
     */

    public void setFirewallArn(String firewallArn) {
        this.firewallArn = firewallArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall.
     */

    public String getFirewallArn() {
        return this.firewallArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * 
     * @param firewallArn
     *        The Amazon Resource Name (ARN) of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withFirewallArn(String firewallArn) {
        setFirewallArn(firewallArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy
     * association, and you can use the same firewall policy for multiple firewalls.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p>
     *        <p>
     *        The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy
     *        association, and you can use the same firewall policy for multiple firewalls.
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy
     * association, and you can use the same firewall policy for multiple firewalls.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall policy.</p>
     *         <p>
     *         The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall
     *         policy association, and you can use the same firewall policy for multiple firewalls.
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy
     * association, and you can use the same firewall policy for multiple firewalls.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p>
     *        <p>
     *        The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy
     *        association, and you can use the same firewall policy for multiple firewalls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC where the firewall is in use.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC where the firewall is in use.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC where the firewall is in use.
     * </p>
     * 
     * @return The unique identifier of the VPC where the firewall is in use.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC where the firewall is in use.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC where the firewall is in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * 
     * @return The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a
     *         different Availability Zone.
     */

    public java.util.List<SubnetMapping> getSubnetMappings() {
        return subnetMappings;
    }

    /**
     * <p>
     * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * 
     * @param subnetMappings
     *        The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     *        Availability Zone.
     */

    public void setSubnetMappings(java.util.Collection<SubnetMapping> subnetMappings) {
        if (subnetMappings == null) {
            this.subnetMappings = null;
            return;
        }

        this.subnetMappings = new java.util.ArrayList<SubnetMapping>(subnetMappings);
    }

    /**
     * <p>
     * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetMappings(java.util.Collection)} or {@link #withSubnetMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subnetMappings
     *        The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     *        Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withSubnetMappings(SubnetMapping... subnetMappings) {
        if (this.subnetMappings == null) {
            setSubnetMappings(new java.util.ArrayList<SubnetMapping>(subnetMappings.length));
        }
        for (SubnetMapping ele : subnetMappings) {
            this.subnetMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     * Availability Zone.
     * </p>
     * 
     * @param subnetMappings
     *        The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different
     *        Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withSubnetMappings(java.util.Collection<SubnetMapping> subnetMappings) {
        setSubnetMappings(subnetMappings);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates that
     * the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall
     * that is in use. When you create a firewall, the operation initializes this flag to <code>TRUE</code>.
     * </p>
     * 
     * @param deleteProtection
     *        A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates
     *        that the firewall is protected against deletion. Use this setting to protect against accidentally deleting
     *        a firewall that is in use. When you create a firewall, the operation initializes this flag to
     *        <code>TRUE</code>.
     */

    public void setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
    }

    /**
     * <p>
     * A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates that
     * the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall
     * that is in use. When you create a firewall, the operation initializes this flag to <code>TRUE</code>.
     * </p>
     * 
     * @return A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates
     *         that the firewall is protected against deletion. Use this setting to protect against accidentally
     *         deleting a firewall that is in use. When you create a firewall, the operation initializes this flag to
     *         <code>TRUE</code>.
     */

    public Boolean getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * <p>
     * A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates that
     * the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall
     * that is in use. When you create a firewall, the operation initializes this flag to <code>TRUE</code>.
     * </p>
     * 
     * @param deleteProtection
     *        A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates
     *        that the firewall is protected against deletion. Use this setting to protect against accidentally deleting
     *        a firewall that is in use. When you create a firewall, the operation initializes this flag to
     *        <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withDeleteProtection(Boolean deleteProtection) {
        setDeleteProtection(deleteProtection);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates that
     * the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall
     * that is in use. When you create a firewall, the operation initializes this flag to <code>TRUE</code>.
     * </p>
     * 
     * @return A flag indicating whether it is possible to delete the firewall. A setting of <code>TRUE</code> indicates
     *         that the firewall is protected against deletion. Use this setting to protect against accidentally
     *         deleting a firewall that is in use. When you create a firewall, the operation initializes this flag to
     *         <code>TRUE</code>.
     */

    public Boolean isDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this
     * setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you
     * create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @param subnetChangeProtection
     *        A setting indicating whether the firewall is protected against changes to the subnet associations. Use
     *        this setting to protect against accidentally modifying the subnet associations for a firewall that is in
     *        use. When you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     */

    public void setSubnetChangeProtection(Boolean subnetChangeProtection) {
        this.subnetChangeProtection = subnetChangeProtection;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this
     * setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you
     * create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @return A setting indicating whether the firewall is protected against changes to the subnet associations. Use
     *         this setting to protect against accidentally modifying the subnet associations for a firewall that is in
     *         use. When you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     */

    public Boolean getSubnetChangeProtection() {
        return this.subnetChangeProtection;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this
     * setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you
     * create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @param subnetChangeProtection
     *        A setting indicating whether the firewall is protected against changes to the subnet associations. Use
     *        this setting to protect against accidentally modifying the subnet associations for a firewall that is in
     *        use. When you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withSubnetChangeProtection(Boolean subnetChangeProtection) {
        setSubnetChangeProtection(subnetChangeProtection);
        return this;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this
     * setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you
     * create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @return A setting indicating whether the firewall is protected against changes to the subnet associations. Use
     *         this setting to protect against accidentally modifying the subnet associations for a firewall that is in
     *         use. When you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     */

    public Boolean isSubnetChangeProtection() {
        return this.subnetChangeProtection;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use
     * this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When
     * you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @param firewallPolicyChangeProtection
     *        A setting indicating whether the firewall is protected against a change to the firewall policy
     *        association. Use this setting to protect against accidentally modifying the firewall policy for a firewall
     *        that is in use. When you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     */

    public void setFirewallPolicyChangeProtection(Boolean firewallPolicyChangeProtection) {
        this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use
     * this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When
     * you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @return A setting indicating whether the firewall is protected against a change to the firewall policy
     *         association. Use this setting to protect against accidentally modifying the firewall policy for a
     *         firewall that is in use. When you create a firewall, the operation initializes this setting to
     *         <code>TRUE</code>.
     */

    public Boolean getFirewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use
     * this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When
     * you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @param firewallPolicyChangeProtection
     *        A setting indicating whether the firewall is protected against a change to the firewall policy
     *        association. Use this setting to protect against accidentally modifying the firewall policy for a firewall
     *        that is in use. When you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withFirewallPolicyChangeProtection(Boolean firewallPolicyChangeProtection) {
        setFirewallPolicyChangeProtection(firewallPolicyChangeProtection);
        return this;
    }

    /**
     * <p>
     * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use
     * this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When
     * you create a firewall, the operation initializes this setting to <code>TRUE</code>.
     * </p>
     * 
     * @return A setting indicating whether the firewall is protected against a change to the firewall policy
     *         association. Use this setting to protect against accidentally modifying the firewall policy for a
     *         firewall that is in use. When you create a firewall, the operation initializes this setting to
     *         <code>TRUE</code>.
     */

    public Boolean isFirewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection;
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

    public Firewall withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the firewall.
     * </p>
     * 
     * @param firewallId
     *        The unique identifier for the firewall.
     */

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    /**
     * <p>
     * The unique identifier for the firewall.
     * </p>
     * 
     * @return The unique identifier for the firewall.
     */

    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * <p>
     * The unique identifier for the firewall.
     * </p>
     * 
     * @param firewallId
     *        The unique identifier for the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withFirewallId(String firewallId) {
        setFirewallId(firewallId);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p/>
     * 
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Firewall withTags(java.util.Collection<Tag> tags) {
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
        if (getFirewallName() != null)
            sb.append("FirewallName: ").append(getFirewallName()).append(",");
        if (getFirewallArn() != null)
            sb.append("FirewallArn: ").append(getFirewallArn()).append(",");
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetMappings() != null)
            sb.append("SubnetMappings: ").append(getSubnetMappings()).append(",");
        if (getDeleteProtection() != null)
            sb.append("DeleteProtection: ").append(getDeleteProtection()).append(",");
        if (getSubnetChangeProtection() != null)
            sb.append("SubnetChangeProtection: ").append(getSubnetChangeProtection()).append(",");
        if (getFirewallPolicyChangeProtection() != null)
            sb.append("FirewallPolicyChangeProtection: ").append(getFirewallPolicyChangeProtection()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFirewallId() != null)
            sb.append("FirewallId: ").append(getFirewallId()).append(",");
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

        if (obj instanceof Firewall == false)
            return false;
        Firewall other = (Firewall) obj;
        if (other.getFirewallName() == null ^ this.getFirewallName() == null)
            return false;
        if (other.getFirewallName() != null && other.getFirewallName().equals(this.getFirewallName()) == false)
            return false;
        if (other.getFirewallArn() == null ^ this.getFirewallArn() == null)
            return false;
        if (other.getFirewallArn() != null && other.getFirewallArn().equals(this.getFirewallArn()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetMappings() == null ^ this.getSubnetMappings() == null)
            return false;
        if (other.getSubnetMappings() != null && other.getSubnetMappings().equals(this.getSubnetMappings()) == false)
            return false;
        if (other.getDeleteProtection() == null ^ this.getDeleteProtection() == null)
            return false;
        if (other.getDeleteProtection() != null && other.getDeleteProtection().equals(this.getDeleteProtection()) == false)
            return false;
        if (other.getSubnetChangeProtection() == null ^ this.getSubnetChangeProtection() == null)
            return false;
        if (other.getSubnetChangeProtection() != null && other.getSubnetChangeProtection().equals(this.getSubnetChangeProtection()) == false)
            return false;
        if (other.getFirewallPolicyChangeProtection() == null ^ this.getFirewallPolicyChangeProtection() == null)
            return false;
        if (other.getFirewallPolicyChangeProtection() != null
                && other.getFirewallPolicyChangeProtection().equals(this.getFirewallPolicyChangeProtection()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFirewallId() == null ^ this.getFirewallId() == null)
            return false;
        if (other.getFirewallId() != null && other.getFirewallId().equals(this.getFirewallId()) == false)
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

        hashCode = prime * hashCode + ((getFirewallName() == null) ? 0 : getFirewallName().hashCode());
        hashCode = prime * hashCode + ((getFirewallArn() == null) ? 0 : getFirewallArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetMappings() == null) ? 0 : getSubnetMappings().hashCode());
        hashCode = prime * hashCode + ((getDeleteProtection() == null) ? 0 : getDeleteProtection().hashCode());
        hashCode = prime * hashCode + ((getSubnetChangeProtection() == null) ? 0 : getSubnetChangeProtection().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyChangeProtection() == null) ? 0 : getFirewallPolicyChangeProtection().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFirewallId() == null) ? 0 : getFirewallId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Firewall clone() {
        try {
            return (Firewall) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.FirewallMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
