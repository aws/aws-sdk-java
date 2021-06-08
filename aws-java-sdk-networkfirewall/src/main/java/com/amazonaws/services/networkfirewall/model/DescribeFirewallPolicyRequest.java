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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFirewallPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String firewallPolicyName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String firewallPolicyArn;

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setFirewallPolicyName(String firewallPolicyName) {
        this.firewallPolicyName = firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *         create it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFirewallPolicyRequest withFirewallPolicyName(String firewallPolicyName) {
        setFirewallPolicyName(firewallPolicyName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall policy.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFirewallPolicyRequest withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
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
        if (getFirewallPolicyName() != null)
            sb.append("FirewallPolicyName: ").append(getFirewallPolicyName()).append(",");
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFirewallPolicyRequest == false)
            return false;
        DescribeFirewallPolicyRequest other = (DescribeFirewallPolicyRequest) obj;
        if (other.getFirewallPolicyName() == null ^ this.getFirewallPolicyName() == null)
            return false;
        if (other.getFirewallPolicyName() != null && other.getFirewallPolicyName().equals(this.getFirewallPolicyName()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallPolicyName() == null) ? 0 : getFirewallPolicyName().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFirewallPolicyRequest clone() {
        return (DescribeFirewallPolicyRequest) super.clone();
    }

}
