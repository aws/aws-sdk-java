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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateFirewallRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFirewallRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>FirewallRuleGroupAssociation</a>.
     * </p>
     */
    private String firewallRuleGroupAssociationId;

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

    public DisassociateFirewallRuleGroupRequest withFirewallRuleGroupAssociationId(String firewallRuleGroupAssociationId) {
        setFirewallRuleGroupAssociationId(firewallRuleGroupAssociationId);
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
            sb.append("FirewallRuleGroupAssociationId: ").append(getFirewallRuleGroupAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFirewallRuleGroupRequest == false)
            return false;
        DisassociateFirewallRuleGroupRequest other = (DisassociateFirewallRuleGroupRequest) obj;
        if (other.getFirewallRuleGroupAssociationId() == null ^ this.getFirewallRuleGroupAssociationId() == null)
            return false;
        if (other.getFirewallRuleGroupAssociationId() != null
                && other.getFirewallRuleGroupAssociationId().equals(this.getFirewallRuleGroupAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRuleGroupAssociationId() == null) ? 0 : getFirewallRuleGroupAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateFirewallRuleGroupRequest clone() {
        return (DisassociateFirewallRuleGroupRequest) super.clone();
    }

}
