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
 * A single stateless rule. This is used in <a>StatelessRulesAndCustomActions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatelessRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatelessRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the
     * criteria.
     * </p>
     */
    private RuleDefinition ruleDefinition;
    /**
     * <p>
     * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a
     * stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest priority
     * setting. You must ensure that the priority settings are unique for the rule group.
     * </p>
     * <p>
     * Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     * <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To ensure
     * unique priority settings for your rule groups, set unique priorities for the stateless rules that you define
     * inside any single <code>StatelessRules</code> object.
     * </p>
     * <p>
     * You can change the priority settings of your rules at any time. To make it easier to insert rules later, number
     * them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the
     * criteria.
     * </p>
     * 
     * @param ruleDefinition
     *        Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches
     *        the criteria.
     */

    public void setRuleDefinition(RuleDefinition ruleDefinition) {
        this.ruleDefinition = ruleDefinition;
    }

    /**
     * <p>
     * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the
     * criteria.
     * </p>
     * 
     * @return Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches
     *         the criteria.
     */

    public RuleDefinition getRuleDefinition() {
        return this.ruleDefinition;
    }

    /**
     * <p>
     * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the
     * criteria.
     * </p>
     * 
     * @param ruleDefinition
     *        Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches
     *        the criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRule withRuleDefinition(RuleDefinition ruleDefinition) {
        setRuleDefinition(ruleDefinition);
        return this;
    }

    /**
     * <p>
     * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a
     * stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest priority
     * setting. You must ensure that the priority settings are unique for the rule group.
     * </p>
     * <p>
     * Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     * <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To ensure
     * unique priority settings for your rule groups, set unique priorities for the stateless rules that you define
     * inside any single <code>StatelessRules</code> object.
     * </p>
     * <p>
     * You can change the priority settings of your rules at any time. To make it easier to insert rules later, number
     * them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     * 
     * @param priority
     *        A setting that indicates the order in which to run this rule relative to all of the rules that are defined
     *        for a stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest
     *        priority setting. You must ensure that the priority settings are unique for the rule group. </p>
     *        <p>
     *        Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     *        <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To
     *        ensure unique priority settings for your rule groups, set unique priorities for the stateless rules that
     *        you define inside any single <code>StatelessRules</code> object.
     *        </p>
     *        <p>
     *        You can change the priority settings of your rules at any time. To make it easier to insert rules later,
     *        number them so there's a wide range in between, for example use 100, 200, and so on.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a
     * stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest priority
     * setting. You must ensure that the priority settings are unique for the rule group.
     * </p>
     * <p>
     * Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     * <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To ensure
     * unique priority settings for your rule groups, set unique priorities for the stateless rules that you define
     * inside any single <code>StatelessRules</code> object.
     * </p>
     * <p>
     * You can change the priority settings of your rules at any time. To make it easier to insert rules later, number
     * them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     * 
     * @return A setting that indicates the order in which to run this rule relative to all of the rules that are
     *         defined for a stateless rule group. Network Firewall evaluates the rules in a rule group starting with
     *         the lowest priority setting. You must ensure that the priority settings are unique for the rule group.
     *         </p>
     *         <p>
     *         Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     *         <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To
     *         ensure unique priority settings for your rule groups, set unique priorities for the stateless rules that
     *         you define inside any single <code>StatelessRules</code> object.
     *         </p>
     *         <p>
     *         You can change the priority settings of your rules at any time. To make it easier to insert rules later,
     *         number them so there's a wide range in between, for example use 100, 200, and so on.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a
     * stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest priority
     * setting. You must ensure that the priority settings are unique for the rule group.
     * </p>
     * <p>
     * Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     * <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To ensure
     * unique priority settings for your rule groups, set unique priorities for the stateless rules that you define
     * inside any single <code>StatelessRules</code> object.
     * </p>
     * <p>
     * You can change the priority settings of your rules at any time. To make it easier to insert rules later, number
     * them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     * 
     * @param priority
     *        A setting that indicates the order in which to run this rule relative to all of the rules that are defined
     *        for a stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest
     *        priority setting. You must ensure that the priority settings are unique for the rule group. </p>
     *        <p>
     *        Each stateless rule group uses exactly one <code>StatelessRulesAndCustomActions</code> object, and each
     *        <code>StatelessRulesAndCustomActions</code> contains exactly one <code>StatelessRules</code> object. To
     *        ensure unique priority settings for your rule groups, set unique priorities for the stateless rules that
     *        you define inside any single <code>StatelessRules</code> object.
     *        </p>
     *        <p>
     *        You can change the priority settings of your rules at any time. To make it easier to insert rules later,
     *        number them so there's a wide range in between, for example use 100, 200, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRule withPriority(Integer priority) {
        setPriority(priority);
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
        if (getRuleDefinition() != null)
            sb.append("RuleDefinition: ").append(getRuleDefinition()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatelessRule == false)
            return false;
        StatelessRule other = (StatelessRule) obj;
        if (other.getRuleDefinition() == null ^ this.getRuleDefinition() == null)
            return false;
        if (other.getRuleDefinition() != null && other.getRuleDefinition().equals(this.getRuleDefinition()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleDefinition() == null) ? 0 : getRuleDefinition().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public StatelessRule clone() {
        try {
            return (StatelessRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatelessRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
