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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object that defines the rules in a rule group. This, along with <a>RuleGroupResponse</a>, define the rule group.
 * You can retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
 * </p>
 * <p>
 * AWS Network Firewall uses a rule group to inspect and control network traffic. You define stateless rule groups to
 * inspect individual packets and you define stateful rule groups to inspect packets in the context of their traffic
 * flow.
 * </p>
 * <p>
 * To use a rule group, you include it by reference in an Network Firewall firewall policy, then you use the policy in a
 * firewall. You can reference a rule group from more than one firewall policy, and you can use a firewall policy in
 * more than one firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule
     * groups.
     * </p>
     */
    private RuleVariables ruleVariables;
    /**
     * <p>
     * The stateful rules or stateless rules for the rule group.
     * </p>
     */
    private RulesSource rulesSource;

    /**
     * <p>
     * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule
     * groups.
     * </p>
     * 
     * @param ruleVariables
     *        Settings that are available for use in the rules in the rule group. You can only use these for stateful
     *        rule groups.
     */

    public void setRuleVariables(RuleVariables ruleVariables) {
        this.ruleVariables = ruleVariables;
    }

    /**
     * <p>
     * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule
     * groups.
     * </p>
     * 
     * @return Settings that are available for use in the rules in the rule group. You can only use these for stateful
     *         rule groups.
     */

    public RuleVariables getRuleVariables() {
        return this.ruleVariables;
    }

    /**
     * <p>
     * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule
     * groups.
     * </p>
     * 
     * @param ruleVariables
     *        Settings that are available for use in the rules in the rule group. You can only use these for stateful
     *        rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withRuleVariables(RuleVariables ruleVariables) {
        setRuleVariables(ruleVariables);
        return this;
    }

    /**
     * <p>
     * The stateful rules or stateless rules for the rule group.
     * </p>
     * 
     * @param rulesSource
     *        The stateful rules or stateless rules for the rule group.
     */

    public void setRulesSource(RulesSource rulesSource) {
        this.rulesSource = rulesSource;
    }

    /**
     * <p>
     * The stateful rules or stateless rules for the rule group.
     * </p>
     * 
     * @return The stateful rules or stateless rules for the rule group.
     */

    public RulesSource getRulesSource() {
        return this.rulesSource;
    }

    /**
     * <p>
     * The stateful rules or stateless rules for the rule group.
     * </p>
     * 
     * @param rulesSource
     *        The stateful rules or stateless rules for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withRulesSource(RulesSource rulesSource) {
        setRulesSource(rulesSource);
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
        if (getRuleVariables() != null)
            sb.append("RuleVariables: ").append(getRuleVariables()).append(",");
        if (getRulesSource() != null)
            sb.append("RulesSource: ").append(getRulesSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroup == false)
            return false;
        RuleGroup other = (RuleGroup) obj;
        if (other.getRuleVariables() == null ^ this.getRuleVariables() == null)
            return false;
        if (other.getRuleVariables() != null && other.getRuleVariables().equals(this.getRuleVariables()) == false)
            return false;
        if (other.getRulesSource() == null ^ this.getRulesSource() == null)
            return false;
        if (other.getRulesSource() != null && other.getRulesSource().equals(this.getRulesSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleVariables() == null) ? 0 : getRuleVariables().hashCode());
        hashCode = prime * hashCode + ((getRulesSource() == null) ? 0 : getRulesSource().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroup clone() {
        try {
            return (RuleGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
