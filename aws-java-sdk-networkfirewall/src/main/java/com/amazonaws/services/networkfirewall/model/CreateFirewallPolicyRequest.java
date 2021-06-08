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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFirewallPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     */
    private String firewallPolicyName;
    /**
     * <p>
     * The rule groups and policy actions to use in the firewall policy.
     * </p>
     */
    private FirewallPolicy firewallPolicy;
    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.
     */

    public void setFirewallPolicyName(String firewallPolicyName) {
        this.firewallPolicyName = firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * 
     * @return The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *         create it.
     */

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallPolicyRequest withFirewallPolicyName(String firewallPolicyName) {
        setFirewallPolicyName(firewallPolicyName);
        return this;
    }

    /**
     * <p>
     * The rule groups and policy actions to use in the firewall policy.
     * </p>
     * 
     * @param firewallPolicy
     *        The rule groups and policy actions to use in the firewall policy.
     */

    public void setFirewallPolicy(FirewallPolicy firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    /**
     * <p>
     * The rule groups and policy actions to use in the firewall policy.
     * </p>
     * 
     * @return The rule groups and policy actions to use in the firewall policy.
     */

    public FirewallPolicy getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * <p>
     * The rule groups and policy actions to use in the firewall policy.
     * </p>
     * 
     * @param firewallPolicy
     *        The rule groups and policy actions to use in the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallPolicyRequest withFirewallPolicy(FirewallPolicy firewallPolicy) {
        setFirewallPolicy(firewallPolicy);
        return this;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @return A description of the firewall policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallPolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @return The key:value pairs to associate with the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
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
     * The key:value pairs to associate with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallPolicyRequest withTags(Tag... tags) {
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
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallPolicyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     *        request. </p>
     *        <p>
     *        If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     *        actually make the requested changes. The call returns the value that the request would return if you ran
     *        it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This
     *        option allows you to make sure that you have the required permissions to run the request and that your
     *        request parameters are valid.
     *        </p>
     *        <p>
     *        If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @return Indicates whether you want Network Firewall to just check the validity of the request, rather than run
     *         the request. </p>
     *         <p>
     *         If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but
     *         doesn't actually make the requested changes. The call returns the value that the request would return if
     *         you ran it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your
     *         resources. This option allows you to make sure that you have the required permissions to run the request
     *         and that your request parameters are valid.
     *         </p>
     *         <p>
     *         If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     *        request. </p>
     *        <p>
     *        If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     *        actually make the requested changes. The call returns the value that the request would return if you ran
     *        it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This
     *        option allows you to make sure that you have the required permissions to run the request and that your
     *        request parameters are valid.
     *        </p>
     *        <p>
     *        If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallPolicyRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @return Indicates whether you want Network Firewall to just check the validity of the request, rather than run
     *         the request. </p>
     *         <p>
     *         If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but
     *         doesn't actually make the requested changes. The call returns the value that the request would return if
     *         you ran it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your
     *         resources. This option allows you to make sure that you have the required permissions to run the request
     *         and that your request parameters are valid.
     *         </p>
     *         <p>
     *         If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getFirewallPolicyName() != null)
            sb.append("FirewallPolicyName: ").append(getFirewallPolicyName()).append(",");
        if (getFirewallPolicy() != null)
            sb.append("FirewallPolicy: ").append(getFirewallPolicy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFirewallPolicyRequest == false)
            return false;
        CreateFirewallPolicyRequest other = (CreateFirewallPolicyRequest) obj;
        if (other.getFirewallPolicyName() == null ^ this.getFirewallPolicyName() == null)
            return false;
        if (other.getFirewallPolicyName() != null && other.getFirewallPolicyName().equals(this.getFirewallPolicyName()) == false)
            return false;
        if (other.getFirewallPolicy() == null ^ this.getFirewallPolicy() == null)
            return false;
        if (other.getFirewallPolicy() != null && other.getFirewallPolicy().equals(this.getFirewallPolicy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallPolicyName() == null) ? 0 : getFirewallPolicyName().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicy() == null) ? 0 : getFirewallPolicy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public CreateFirewallPolicyRequest clone() {
        return (CreateFirewallPolicyRequest) super.clone();
    }

}
