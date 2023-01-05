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
 * Details about the rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional settings to use in the specified rules.
     * </p>
     */
    private RuleGroupVariables ruleVariables;
    /**
     * <p>
     * The rules and actions for the rule group.
     * </p>
     * <p>
     * For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     * <code>StatefulRules</code>.
     * </p>
     * <p>
     * For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     * </p>
     */
    private RuleGroupSource rulesSource;

    /**
     * <p>
     * Additional settings to use in the specified rules.
     * </p>
     * 
     * @param ruleVariables
     *        Additional settings to use in the specified rules.
     */

    public void setRuleVariables(RuleGroupVariables ruleVariables) {
        this.ruleVariables = ruleVariables;
    }

    /**
     * <p>
     * Additional settings to use in the specified rules.
     * </p>
     * 
     * @return Additional settings to use in the specified rules.
     */

    public RuleGroupVariables getRuleVariables() {
        return this.ruleVariables;
    }

    /**
     * <p>
     * Additional settings to use in the specified rules.
     * </p>
     * 
     * @param ruleVariables
     *        Additional settings to use in the specified rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupDetails withRuleVariables(RuleGroupVariables ruleVariables) {
        setRuleVariables(ruleVariables);
        return this;
    }

    /**
     * <p>
     * The rules and actions for the rule group.
     * </p>
     * <p>
     * For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     * <code>StatefulRules</code>.
     * </p>
     * <p>
     * For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     * </p>
     * 
     * @param rulesSource
     *        The rules and actions for the rule group.</p>
     *        <p>
     *        For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     *        <code>StatefulRules</code>.
     *        </p>
     *        <p>
     *        For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     */

    public void setRulesSource(RuleGroupSource rulesSource) {
        this.rulesSource = rulesSource;
    }

    /**
     * <p>
     * The rules and actions for the rule group.
     * </p>
     * <p>
     * For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     * <code>StatefulRules</code>.
     * </p>
     * <p>
     * For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     * </p>
     * 
     * @return The rules and actions for the rule group.</p>
     *         <p>
     *         For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     *         <code>StatefulRules</code>.
     *         </p>
     *         <p>
     *         For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     */

    public RuleGroupSource getRulesSource() {
        return this.rulesSource;
    }

    /**
     * <p>
     * The rules and actions for the rule group.
     * </p>
     * <p>
     * For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     * <code>StatefulRules</code>.
     * </p>
     * <p>
     * For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     * </p>
     * 
     * @param rulesSource
     *        The rules and actions for the rule group.</p>
     *        <p>
     *        For stateful rule groups, can contain <code>RulesString</code>, <code>RulesSourceList</code>, or
     *        <code>StatefulRules</code>.
     *        </p>
     *        <p>
     *        For stateless rule groups, contains <code>StatelessRulesAndCustomActions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupDetails withRulesSource(RuleGroupSource rulesSource) {
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

        if (obj instanceof RuleGroupDetails == false)
            return false;
        RuleGroupDetails other = (RuleGroupDetails) obj;
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
    public RuleGroupDetails clone() {
        try {
            return (RuleGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
