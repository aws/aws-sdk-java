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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group with
 * your rules, then provide the ARN of the rule group in this statement.
 * </p>
 * <p>
 * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a <code>NotStatement</code> or
 * <code>OrStatement</code>. You can only use a rule group reference statement at the top level inside a web ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RuleGroupReferenceStatement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupReferenceStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Rules in the referenced rule group whose actions are set to <code>Count</code>.
     * </p>
     * <note>
     * <p>
     * Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting, including
     * <code>Count</code>.
     * </p>
     * </note>
     */
    private java.util.List<ExcludedRule> excludedRules;
    /**
     * <p>
     * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify
     * one override for each rule whose action you want to change.
     * </p>
     * <p>
     * You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and
     * then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can
     * also permanently override some or all actions, to modify how the rule group manages your web traffic.
     * </p>
     */
    private java.util.List<RuleActionOverride> ruleActionOverrides;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupReferenceStatement withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Rules in the referenced rule group whose actions are set to <code>Count</code>.
     * </p>
     * <note>
     * <p>
     * Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting, including
     * <code>Count</code>.
     * </p>
     * </note>
     * 
     * @return Rules in the referenced rule group whose actions are set to <code>Count</code>. </p> <note>
     *         <p>
     *         Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting,
     *         including <code>Count</code>.
     *         </p>
     */

    public java.util.List<ExcludedRule> getExcludedRules() {
        return excludedRules;
    }

    /**
     * <p>
     * Rules in the referenced rule group whose actions are set to <code>Count</code>.
     * </p>
     * <note>
     * <p>
     * Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting, including
     * <code>Count</code>.
     * </p>
     * </note>
     * 
     * @param excludedRules
     *        Rules in the referenced rule group whose actions are set to <code>Count</code>. </p> <note>
     *        <p>
     *        Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting,
     *        including <code>Count</code>.
     *        </p>
     */

    public void setExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        if (excludedRules == null) {
            this.excludedRules = null;
            return;
        }

        this.excludedRules = new java.util.ArrayList<ExcludedRule>(excludedRules);
    }

    /**
     * <p>
     * Rules in the referenced rule group whose actions are set to <code>Count</code>.
     * </p>
     * <note>
     * <p>
     * Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting, including
     * <code>Count</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedRules(java.util.Collection)} or {@link #withExcludedRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludedRules
     *        Rules in the referenced rule group whose actions are set to <code>Count</code>. </p> <note>
     *        <p>
     *        Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting,
     *        including <code>Count</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupReferenceStatement withExcludedRules(ExcludedRule... excludedRules) {
        if (this.excludedRules == null) {
            setExcludedRules(new java.util.ArrayList<ExcludedRule>(excludedRules.length));
        }
        for (ExcludedRule ele : excludedRules) {
            this.excludedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules in the referenced rule group whose actions are set to <code>Count</code>.
     * </p>
     * <note>
     * <p>
     * Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting, including
     * <code>Count</code>.
     * </p>
     * </note>
     * 
     * @param excludedRules
     *        Rules in the referenced rule group whose actions are set to <code>Count</code>. </p> <note>
     *        <p>
     *        Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting,
     *        including <code>Count</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupReferenceStatement withExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        setExcludedRules(excludedRules);
        return this;
    }

    /**
     * <p>
     * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify
     * one override for each rule whose action you want to change.
     * </p>
     * <p>
     * You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and
     * then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can
     * also permanently override some or all actions, to modify how the rule group manages your web traffic.
     * </p>
     * 
     * @return Action settings to use in the place of the rule actions that are configured inside the rule group. You
     *         specify one override for each rule whose action you want to change. </p>
     *         <p>
     *         You can use overrides for testing, for example you can override all of rule actions to <code>Count</code>
     *         and then monitor the resulting count metrics to understand how the rule group would handle your web
     *         traffic. You can also permanently override some or all actions, to modify how the rule group manages your
     *         web traffic.
     */

    public java.util.List<RuleActionOverride> getRuleActionOverrides() {
        return ruleActionOverrides;
    }

    /**
     * <p>
     * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify
     * one override for each rule whose action you want to change.
     * </p>
     * <p>
     * You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and
     * then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can
     * also permanently override some or all actions, to modify how the rule group manages your web traffic.
     * </p>
     * 
     * @param ruleActionOverrides
     *        Action settings to use in the place of the rule actions that are configured inside the rule group. You
     *        specify one override for each rule whose action you want to change. </p>
     *        <p>
     *        You can use overrides for testing, for example you can override all of rule actions to <code>Count</code>
     *        and then monitor the resulting count metrics to understand how the rule group would handle your web
     *        traffic. You can also permanently override some or all actions, to modify how the rule group manages your
     *        web traffic.
     */

    public void setRuleActionOverrides(java.util.Collection<RuleActionOverride> ruleActionOverrides) {
        if (ruleActionOverrides == null) {
            this.ruleActionOverrides = null;
            return;
        }

        this.ruleActionOverrides = new java.util.ArrayList<RuleActionOverride>(ruleActionOverrides);
    }

    /**
     * <p>
     * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify
     * one override for each rule whose action you want to change.
     * </p>
     * <p>
     * You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and
     * then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can
     * also permanently override some or all actions, to modify how the rule group manages your web traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleActionOverrides(java.util.Collection)} or {@link #withRuleActionOverrides(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ruleActionOverrides
     *        Action settings to use in the place of the rule actions that are configured inside the rule group. You
     *        specify one override for each rule whose action you want to change. </p>
     *        <p>
     *        You can use overrides for testing, for example you can override all of rule actions to <code>Count</code>
     *        and then monitor the resulting count metrics to understand how the rule group would handle your web
     *        traffic. You can also permanently override some or all actions, to modify how the rule group manages your
     *        web traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupReferenceStatement withRuleActionOverrides(RuleActionOverride... ruleActionOverrides) {
        if (this.ruleActionOverrides == null) {
            setRuleActionOverrides(new java.util.ArrayList<RuleActionOverride>(ruleActionOverrides.length));
        }
        for (RuleActionOverride ele : ruleActionOverrides) {
            this.ruleActionOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify
     * one override for each rule whose action you want to change.
     * </p>
     * <p>
     * You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and
     * then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can
     * also permanently override some or all actions, to modify how the rule group manages your web traffic.
     * </p>
     * 
     * @param ruleActionOverrides
     *        Action settings to use in the place of the rule actions that are configured inside the rule group. You
     *        specify one override for each rule whose action you want to change. </p>
     *        <p>
     *        You can use overrides for testing, for example you can override all of rule actions to <code>Count</code>
     *        and then monitor the resulting count metrics to understand how the rule group would handle your web
     *        traffic. You can also permanently override some or all actions, to modify how the rule group manages your
     *        web traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupReferenceStatement withRuleActionOverrides(java.util.Collection<RuleActionOverride> ruleActionOverrides) {
        setRuleActionOverrides(ruleActionOverrides);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getExcludedRules() != null)
            sb.append("ExcludedRules: ").append(getExcludedRules()).append(",");
        if (getRuleActionOverrides() != null)
            sb.append("RuleActionOverrides: ").append(getRuleActionOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupReferenceStatement == false)
            return false;
        RuleGroupReferenceStatement other = (RuleGroupReferenceStatement) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getExcludedRules() == null ^ this.getExcludedRules() == null)
            return false;
        if (other.getExcludedRules() != null && other.getExcludedRules().equals(this.getExcludedRules()) == false)
            return false;
        if (other.getRuleActionOverrides() == null ^ this.getRuleActionOverrides() == null)
            return false;
        if (other.getRuleActionOverrides() != null && other.getRuleActionOverrides().equals(this.getRuleActionOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getExcludedRules() == null) ? 0 : getExcludedRules().hashCode());
        hashCode = prime * hashCode + ((getRuleActionOverrides() == null) ? 0 : getRuleActionOverrides().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupReferenceStatement clone() {
        try {
            return (RuleGroupReferenceStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RuleGroupReferenceStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
