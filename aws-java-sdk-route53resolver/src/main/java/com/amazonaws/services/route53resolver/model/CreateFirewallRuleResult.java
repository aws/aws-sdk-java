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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFirewallRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The firewall rule that you just created.
     * </p>
     */
    private FirewallRule firewallRule;

    /**
     * <p>
     * The firewall rule that you just created.
     * </p>
     * 
     * @param firewallRule
     *        The firewall rule that you just created.
     */

    public void setFirewallRule(FirewallRule firewallRule) {
        this.firewallRule = firewallRule;
    }

    /**
     * <p>
     * The firewall rule that you just created.
     * </p>
     * 
     * @return The firewall rule that you just created.
     */

    public FirewallRule getFirewallRule() {
        return this.firewallRule;
    }

    /**
     * <p>
     * The firewall rule that you just created.
     * </p>
     * 
     * @param firewallRule
     *        The firewall rule that you just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleResult withFirewallRule(FirewallRule firewallRule) {
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

        if (obj instanceof CreateFirewallRuleResult == false)
            return false;
        CreateFirewallRuleResult other = (CreateFirewallRuleResult) obj;
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
    public CreateFirewallRuleResult clone() {
        try {
            return (CreateFirewallRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
