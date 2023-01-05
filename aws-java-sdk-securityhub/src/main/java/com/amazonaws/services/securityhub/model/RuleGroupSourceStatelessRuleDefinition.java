/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of the stateless rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatelessRuleDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatelessRuleDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or <code>aws:forward_to_sfe</code>). You
     * can then add custom actions.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     * </p>
     */
    private RuleGroupSourceStatelessRuleMatchAttributes matchAttributes;

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or <code>aws:forward_to_sfe</code>). You
     * can then add custom actions.
     * </p>
     * 
     * @return The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *         must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or
     *         <code>aws:forward_to_sfe</code>). You can then add custom actions.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or <code>aws:forward_to_sfe</code>). You
     * can then add custom actions.
     * </p>
     * 
     * @param actions
     *        The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *        must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>). You can then add custom actions.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or <code>aws:forward_to_sfe</code>). You
     * can then add custom actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *        must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>). You can then add custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleDefinition withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or <code>aws:forward_to_sfe</code>). You
     * can then add custom actions.
     * </p>
     * 
     * @param actions
     *        The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *        must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>). You can then add custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleDefinition withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     * </p>
     * 
     * @param matchAttributes
     *        The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     */

    public void setMatchAttributes(RuleGroupSourceStatelessRuleMatchAttributes matchAttributes) {
        this.matchAttributes = matchAttributes;
    }

    /**
     * <p>
     * The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     * </p>
     * 
     * @return The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes getMatchAttributes() {
        return this.matchAttributes;
    }

    /**
     * <p>
     * The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     * </p>
     * 
     * @param matchAttributes
     *        The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleDefinition withMatchAttributes(RuleGroupSourceStatelessRuleMatchAttributes matchAttributes) {
        setMatchAttributes(matchAttributes);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getMatchAttributes() != null)
            sb.append("MatchAttributes: ").append(getMatchAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatelessRuleDefinition == false)
            return false;
        RuleGroupSourceStatelessRuleDefinition other = (RuleGroupSourceStatelessRuleDefinition) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getMatchAttributes() == null ^ this.getMatchAttributes() == null)
            return false;
        if (other.getMatchAttributes() != null && other.getMatchAttributes().equals(this.getMatchAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getMatchAttributes() == null) ? 0 : getMatchAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatelessRuleDefinition clone() {
        try {
            return (RuleGroupSourceStatelessRuleDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatelessRuleDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
