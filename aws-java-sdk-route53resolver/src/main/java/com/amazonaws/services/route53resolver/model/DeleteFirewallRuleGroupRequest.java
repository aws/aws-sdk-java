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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete.
     * </p>
     */
    private String firewallRuleGroupId;

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to delete.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group that you want to delete.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallRuleGroupRequest withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
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
        if (getFirewallRuleGroupId() != null)
            sb.append("FirewallRuleGroupId: ").append(getFirewallRuleGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallRuleGroupRequest == false)
            return false;
        DeleteFirewallRuleGroupRequest other = (DeleteFirewallRuleGroupRequest) obj;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRuleGroupId() == null) ? 0 : getFirewallRuleGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallRuleGroupRequest clone() {
        return (DeleteFirewallRuleGroupRequest) super.clone();
    }

}
