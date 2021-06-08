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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PutResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies with.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The AWS Identity and Access Management policy statement that lists the accounts that you want to share your rule
     * group or firewall policy with and the operations that you want the accounts to be able to perform.
     * </p>
     * <p>
     * For a rule group resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListRuleGroups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a firewall policy resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:AssociateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListFirewallPolicies
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies that you
     * want to share with the account that you specified in <code>Arn</code>.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies with.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies
     *        with.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies
     *         with.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies with.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies
     *        with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management policy statement that lists the accounts that you want to share your rule
     * group or firewall policy with and the operations that you want the accounts to be able to perform.
     * </p>
     * <p>
     * For a rule group resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListRuleGroups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a firewall policy resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:AssociateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListFirewallPolicies
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies that you
     * want to share with the account that you specified in <code>Arn</code>.
     * </p>
     * 
     * @param policy
     *        The AWS Identity and Access Management policy statement that lists the accounts that you want to share
     *        your rule group or firewall policy with and the operations that you want the accounts to be able to
     *        perform. </p>
     *        <p>
     *        For a rule group resource, you can specify the following operations in the Actions section of the
     *        statement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        network-firewall:CreateFirewallPolicy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:UpdateFirewallPolicy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:ListRuleGroups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a firewall policy resource, you can specify the following operations in the Actions section of the
     *        statement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        network-firewall:CreateFirewall
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:UpdateFirewall
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:AssociateFirewallPolicy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:ListFirewallPolicies
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies
     *        that you want to share with the account that you specified in <code>Arn</code>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The AWS Identity and Access Management policy statement that lists the accounts that you want to share your rule
     * group or firewall policy with and the operations that you want the accounts to be able to perform.
     * </p>
     * <p>
     * For a rule group resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListRuleGroups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a firewall policy resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:AssociateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListFirewallPolicies
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies that you
     * want to share with the account that you specified in <code>Arn</code>.
     * </p>
     * 
     * @return The AWS Identity and Access Management policy statement that lists the accounts that you want to share
     *         your rule group or firewall policy with and the operations that you want the accounts to be able to
     *         perform. </p>
     *         <p>
     *         For a rule group resource, you can specify the following operations in the Actions section of the
     *         statement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         network-firewall:CreateFirewallPolicy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         network-firewall:UpdateFirewallPolicy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         network-firewall:ListRuleGroups
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a firewall policy resource, you can specify the following operations in the Actions section of the
     *         statement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         network-firewall:CreateFirewall
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         network-firewall:UpdateFirewall
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         network-firewall:AssociateFirewallPolicy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         network-firewall:ListFirewallPolicies
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies
     *         that you want to share with the account that you specified in <code>Arn</code>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The AWS Identity and Access Management policy statement that lists the accounts that you want to share your rule
     * group or firewall policy with and the operations that you want the accounts to be able to perform.
     * </p>
     * <p>
     * For a rule group resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListRuleGroups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a firewall policy resource, you can specify the following operations in the Actions section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * network-firewall:CreateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:UpdateFirewall
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:AssociateFirewallPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * network-firewall:ListFirewallPolicies
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies that you
     * want to share with the account that you specified in <code>Arn</code>.
     * </p>
     * 
     * @param policy
     *        The AWS Identity and Access Management policy statement that lists the accounts that you want to share
     *        your rule group or firewall policy with and the operations that you want the accounts to be able to
     *        perform. </p>
     *        <p>
     *        For a rule group resource, you can specify the following operations in the Actions section of the
     *        statement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        network-firewall:CreateFirewallPolicy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:UpdateFirewallPolicy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:ListRuleGroups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a firewall policy resource, you can specify the following operations in the Actions section of the
     *        statement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        network-firewall:CreateFirewall
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:UpdateFirewall
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:AssociateFirewallPolicy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        network-firewall:ListFirewallPolicies
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies
     *        that you want to share with the account that you specified in <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
