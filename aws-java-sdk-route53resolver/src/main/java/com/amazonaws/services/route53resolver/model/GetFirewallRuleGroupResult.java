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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFirewallRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of rules used to filter DNS network traffic.
     * </p>
     */
    private FirewallRuleGroup firewallRuleGroup;

    /**
     * <p>
     * A collection of rules used to filter DNS network traffic.
     * </p>
     * 
     * @param firewallRuleGroup
     *        A collection of rules used to filter DNS network traffic.
     */

    public void setFirewallRuleGroup(FirewallRuleGroup firewallRuleGroup) {
        this.firewallRuleGroup = firewallRuleGroup;
    }

    /**
     * <p>
     * A collection of rules used to filter DNS network traffic.
     * </p>
     * 
     * @return A collection of rules used to filter DNS network traffic.
     */

    public FirewallRuleGroup getFirewallRuleGroup() {
        return this.firewallRuleGroup;
    }

    /**
     * <p>
     * A collection of rules used to filter DNS network traffic.
     * </p>
     * 
     * @param firewallRuleGroup
     *        A collection of rules used to filter DNS network traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFirewallRuleGroupResult withFirewallRuleGroup(FirewallRuleGroup firewallRuleGroup) {
        setFirewallRuleGroup(firewallRuleGroup);
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
        if (getFirewallRuleGroup() != null)
            sb.append("FirewallRuleGroup: ").append(getFirewallRuleGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFirewallRuleGroupResult == false)
            return false;
        GetFirewallRuleGroupResult other = (GetFirewallRuleGroupResult) obj;
        if (other.getFirewallRuleGroup() == null ^ this.getFirewallRuleGroup() == null)
            return false;
        if (other.getFirewallRuleGroup() != null && other.getFirewallRuleGroup().equals(this.getFirewallRuleGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRuleGroup() == null) ? 0 : getFirewallRuleGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetFirewallRuleGroupResult clone() {
        try {
            return (GetFirewallRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
