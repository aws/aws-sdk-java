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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFirewallRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The firewall rule that you just updated.
     * </p>
     */
    private FirewallRule firewallRule;

    /**
     * <p>
     * The firewall rule that you just updated.
     * </p>
     * 
     * @param firewallRule
     *        The firewall rule that you just updated.
     */

    public void setFirewallRule(FirewallRule firewallRule) {
        this.firewallRule = firewallRule;
    }

    /**
     * <p>
     * The firewall rule that you just updated.
     * </p>
     * 
     * @return The firewall rule that you just updated.
     */

    public FirewallRule getFirewallRule() {
        return this.firewallRule;
    }

    /**
     * <p>
     * The firewall rule that you just updated.
     * </p>
     * 
     * @param firewallRule
     *        The firewall rule that you just updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallRuleResult withFirewallRule(FirewallRule firewallRule) {
        setFirewallRule(firewallRule);
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
        if (getFirewallRule() != null)
            sb.append("FirewallRule: ").append(getFirewallRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFirewallRuleResult == false)
            return false;
        UpdateFirewallRuleResult other = (UpdateFirewallRuleResult) obj;
        if (other.getFirewallRule() == null ^ this.getFirewallRule() == null)
            return false;
        if (other.getFirewallRule() != null && other.getFirewallRule().equals(this.getFirewallRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRule() == null) ? 0 : getFirewallRule().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFirewallRuleResult clone() {
        try {
            return (UpdateFirewallRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
