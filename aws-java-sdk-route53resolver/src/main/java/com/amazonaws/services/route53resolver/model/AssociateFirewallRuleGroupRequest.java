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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateFirewallRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateFirewallRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     */
    private String firewallRuleGroupId;
    /**
     * <p>
     * The unique identifier of the VPC that you want to associate with the rule group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that you associate with
     * the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to
     * insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * <p>
     * The allowed values for <code>Priority</code> are between 100 and 9900.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * A name that lets you identify the association, to manage and use it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections. When you create the association, the default setting is
     * <code>DISABLED</code>.
     * </p>
     */
    private String mutationProtection;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group association.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed requests to be retried without the
     *         risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example,
     *         a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC that you want to associate with the rule group.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC that you want to associate with the rule group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC that you want to associate with the rule group.
     * </p>
     * 
     * @return The unique identifier of the VPC that you want to associate with the rule group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC that you want to associate with the rule group.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC that you want to associate with the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that you associate with
     * the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to
     * insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * <p>
     * The allowed values for <code>Priority</code> are between 100 and 9900.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that you
     *        associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *        lowest numeric priority setting. </p>
     *        <p>
     *        You must specify a unique priority for each rule group that you associate with a single VPC. To make it
     *        easier to insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on.
     *        You can change the priority setting for a rule group association after you create it.
     *        </p>
     *        <p>
     *        The allowed values for <code>Priority</code> are between 100 and 9900.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that you associate with
     * the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to
     * insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * <p>
     * The allowed values for <code>Priority</code> are between 100 and 9900.
     * </p>
     * 
     * @return The setting that determines the processing order of the rule group among the rule groups that you
     *         associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *         lowest numeric priority setting. </p>
     *         <p>
     *         You must specify a unique priority for each rule group that you associate with a single VPC. To make it
     *         easier to insert rule groups later, leave space between the numbers, for example, use 101, 200, and so
     *         on. You can change the priority setting for a rule group association after you create it.
     *         </p>
     *         <p>
     *         The allowed values for <code>Priority</code> are between 100 and 9900.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that you associate with
     * the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to
     * insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * <p>
     * The allowed values for <code>Priority</code> are between 100 and 9900.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that you
     *        associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *        lowest numeric priority setting. </p>
     *        <p>
     *        You must specify a unique priority for each rule group that you associate with a single VPC. To make it
     *        easier to insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on.
     *        You can change the priority setting for a rule group association after you create it.
     *        </p>
     *        <p>
     *        The allowed values for <code>Priority</code> are between 100 and 9900.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * A name that lets you identify the association, to manage and use it.
     * </p>
     * 
     * @param name
     *        A name that lets you identify the association, to manage and use it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name that lets you identify the association, to manage and use it.
     * </p>
     * 
     * @return A name that lets you identify the association, to manage and use it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name that lets you identify the association, to manage and use it.
     * </p>
     * 
     * @param name
     *        A name that lets you identify the association, to manage and use it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections. When you create the association, the default setting is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections. When you create the association, the default setting is
     *        <code>DISABLED</code>.
     * @see MutationProtectionStatus
     */

    public void setMutationProtection(String mutationProtection) {
        this.mutationProtection = mutationProtection;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections. When you create the association, the default setting is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return If enabled, this setting disallows modification or removal of the association, to help prevent against
     *         accidentally altering DNS firewall protections. When you create the association, the default setting is
     *         <code>DISABLED</code>.
     * @see MutationProtectionStatus
     */

    public String getMutationProtection() {
        return this.mutationProtection;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections. When you create the association, the default setting is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections. When you create the association, the default setting is
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MutationProtectionStatus
     */

    public AssociateFirewallRuleGroupRequest withMutationProtection(String mutationProtection) {
        setMutationProtection(mutationProtection);
        return this;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections. When you create the association, the default setting is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections. When you create the association, the default setting is
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MutationProtectionStatus
     */

    public AssociateFirewallRuleGroupRequest withMutationProtection(MutationProtectionStatus mutationProtection) {
        this.mutationProtection = mutationProtection.toString();
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group association.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to associate with the rule group association.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group association.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the rule group association.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the rule group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group association.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the rule group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallRuleGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getFirewallRuleGroupId() != null)
            sb.append("FirewallRuleGroupId: ").append(getFirewallRuleGroupId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMutationProtection() != null)
            sb.append("MutationProtection: ").append(getMutationProtection()).append(",");
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

        if (obj instanceof AssociateFirewallRuleGroupRequest == false)
            return false;
        AssociateFirewallRuleGroupRequest other = (AssociateFirewallRuleGroupRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMutationProtection() == null ^ this.getMutationProtection() == null)
            return false;
        if (other.getMutationProtection() != null && other.getMutationProtection().equals(this.getMutationProtection()) == false)
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

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getFirewallRuleGroupId() == null) ? 0 : getFirewallRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMutationProtection() == null) ? 0 : getMutationProtection().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssociateFirewallRuleGroupRequest clone() {
        return (AssociateFirewallRuleGroupRequest) super.clone();
    }

}
