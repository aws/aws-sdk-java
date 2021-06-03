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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRuleGroupAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFirewallRuleGroupAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>FirewallRuleGroupAssociation</a>.
     * </p>
     */
    private String firewallRuleGroupAssociationId;
    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that you associate with
     * the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to
     * insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     */
    private String mutationProtection;
    /**
     * <p>
     * The name of the rule group association.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier of the <a>FirewallRuleGroupAssociation</a>.
     * </p>
     * 
     * @param firewallRuleGroupAssociationId
     *        The identifier of the <a>FirewallRuleGroupAssociation</a>.
     */

    public void setFirewallRuleGroupAssociationId(String firewallRuleGroupAssociationId) {
        this.firewallRuleGroupAssociationId = firewallRuleGroupAssociationId;
    }

    /**
     * <p>
     * The identifier of the <a>FirewallRuleGroupAssociation</a>.
     * </p>
     * 
     * @return The identifier of the <a>FirewallRuleGroupAssociation</a>.
     */

    public String getFirewallRuleGroupAssociationId() {
        return this.firewallRuleGroupAssociationId;
    }

    /**
     * <p>
     * The identifier of the <a>FirewallRuleGroupAssociation</a>.
     * </p>
     * 
     * @param firewallRuleGroupAssociationId
     *        The identifier of the <a>FirewallRuleGroupAssociation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallRuleGroupAssociationRequest withFirewallRuleGroupAssociationId(String firewallRuleGroupAssociationId) {
        setFirewallRuleGroupAssociationId(firewallRuleGroupAssociationId);
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
     * insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that you
     *        associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *        lowest numeric priority setting. </p>
     *        <p>
     *        You must specify a unique priority for each rule group that you associate with a single VPC. To make it
     *        easier to insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on.
     *        You can change the priority setting for a rule group association after you create it.
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
     * insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * 
     * @return The setting that determines the processing order of the rule group among the rule groups that you
     *         associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *         lowest numeric priority setting. </p>
     *         <p>
     *         You must specify a unique priority for each rule group that you associate with a single VPC. To make it
     *         easier to insert rule groups later, leave space between the numbers, for example, use 100, 200, and so
     *         on. You can change the priority setting for a rule group association after you create it.
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
     * insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on. You can change
     * the priority setting for a rule group association after you create it.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that you
     *        associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *        lowest numeric priority setting. </p>
     *        <p>
     *        You must specify a unique priority for each rule group that you associate with a single VPC. To make it
     *        easier to insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on.
     *        You can change the priority setting for a rule group association after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallRuleGroupAssociationRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections.
     * @see MutationProtectionStatus
     */

    public void setMutationProtection(String mutationProtection) {
        this.mutationProtection = mutationProtection;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @return If enabled, this setting disallows modification or removal of the association, to help prevent against
     *         accidentally altering DNS firewall protections.
     * @see MutationProtectionStatus
     */

    public String getMutationProtection() {
        return this.mutationProtection;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MutationProtectionStatus
     */

    public UpdateFirewallRuleGroupAssociationRequest withMutationProtection(String mutationProtection) {
        setMutationProtection(mutationProtection);
        return this;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MutationProtectionStatus
     */

    public UpdateFirewallRuleGroupAssociationRequest withMutationProtection(MutationProtectionStatus mutationProtection) {
        this.mutationProtection = mutationProtection.toString();
        return this;
    }

    /**
     * <p>
     * The name of the rule group association.
     * </p>
     * 
     * @param name
     *        The name of the rule group association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule group association.
     * </p>
     * 
     * @return The name of the rule group association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule group association.
     * </p>
     * 
     * @param name
     *        The name of the rule group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallRuleGroupAssociationRequest withName(String name) {
        setName(name);
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
        if (getFirewallRuleGroupAssociationId() != null)
            sb.append("FirewallRuleGroupAssociationId: ").append(getFirewallRuleGroupAssociationId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getMutationProtection() != null)
            sb.append("MutationProtection: ").append(getMutationProtection()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFirewallRuleGroupAssociationRequest == false)
            return false;
        UpdateFirewallRuleGroupAssociationRequest other = (UpdateFirewallRuleGroupAssociationRequest) obj;
        if (other.getFirewallRuleGroupAssociationId() == null ^ this.getFirewallRuleGroupAssociationId() == null)
            return false;
        if (other.getFirewallRuleGroupAssociationId() != null
                && other.getFirewallRuleGroupAssociationId().equals(this.getFirewallRuleGroupAssociationId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getMutationProtection() == null ^ this.getMutationProtection() == null)
            return false;
        if (other.getMutationProtection() != null && other.getMutationProtection().equals(this.getMutationProtection()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRuleGroupAssociationId() == null) ? 0 : getFirewallRuleGroupAssociationId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMutationProtection() == null) ? 0 : getMutationProtection().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFirewallRuleGroupAssociationRequest clone() {
        return (UpdateFirewallRuleGroupAssociationRequest) super.clone();
    }

}
