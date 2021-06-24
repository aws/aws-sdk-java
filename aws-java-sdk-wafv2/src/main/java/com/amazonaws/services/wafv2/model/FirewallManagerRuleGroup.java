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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule group that's defined for an Firewall Manager WAF policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/FirewallManagerRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallManagerRuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates each
     * request against the rule groups in order, starting from the lowest priority setting. The priorities don't need to
     * be consecutive, but they must all be different.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can
     * only contain a rule group reference.
     * </p>
     */
    private FirewallManagerStatement firewallManagerStatement;
    /**
     * <p>
     * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule
     * group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * Set the override action to none to leave the rule actions in effect. Set it to count to only count matches,
     * regardless of the rule action settings.
     * </p>
     * <p>
     * In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     * <code>Action</code> setting, but not both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement references a rule group, use this override action setting and not the action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use the rule action setting and not this rule override
     * action setting.
     * </p>
     * </li>
     * </ul>
     */
    private OverrideAction overrideAction;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private VisibilityConfig visibilityConfig;

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     * 
     * @param name
     *        The name of the rule group. You cannot change the name of a rule group after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     * 
     * @return The name of the rule group. You cannot change the name of a rule group after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     * 
     * @param name
     *        The name of the rule group. You cannot change the name of a rule group after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerRuleGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates each
     * request against the rule groups in order, starting from the lowest priority setting. The priorities don't need to
     * be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates
     *        each request against the rule groups in order, starting from the lowest priority setting. The priorities
     *        don't need to be consecutive, but they must all be different.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates each
     * request against the rule groups in order, starting from the lowest priority setting. The priorities don't need to
     * be consecutive, but they must all be different.
     * </p>
     * 
     * @return If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates
     *         each request against the rule groups in order, starting from the lowest priority setting. The priorities
     *         don't need to be consecutive, but they must all be different.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates each
     * request against the rule groups in order, starting from the lowest priority setting. The priorities don't need to
     * be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates
     *        each request against the rule groups in order, starting from the lowest priority setting. The priorities
     *        don't need to be consecutive, but they must all be different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerRuleGroup withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can
     * only contain a rule group reference.
     * </p>
     * 
     * @param firewallManagerStatement
     *        The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it
     *        can only contain a rule group reference.
     */

    public void setFirewallManagerStatement(FirewallManagerStatement firewallManagerStatement) {
        this.firewallManagerStatement = firewallManagerStatement;
    }

    /**
     * <p>
     * The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can
     * only contain a rule group reference.
     * </p>
     * 
     * @return The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but
     *         it can only contain a rule group reference.
     */

    public FirewallManagerStatement getFirewallManagerStatement() {
        return this.firewallManagerStatement;
    }

    /**
     * <p>
     * The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can
     * only contain a rule group reference.
     * </p>
     * 
     * @param firewallManagerStatement
     *        The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it
     *        can only contain a rule group reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerRuleGroup withFirewallManagerStatement(FirewallManagerStatement firewallManagerStatement) {
        setFirewallManagerStatement(firewallManagerStatement);
        return this;
    }

    /**
     * <p>
     * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule
     * group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * Set the override action to none to leave the rule actions in effect. Set it to count to only count matches,
     * regardless of the rule action settings.
     * </p>
     * <p>
     * In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     * <code>Action</code> setting, but not both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement references a rule group, use this override action setting and not the action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use the rule action setting and not this rule override
     * action setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param overrideAction
     *        The override action to apply to the rules in a rule group. Used only for rule statements that reference a
     *        rule group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>. </p>
     *        <p>
     *        Set the override action to none to leave the rule actions in effect. Set it to count to only count
     *        matches, regardless of the rule action settings.
     *        </p>
     *        <p>
     *        In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     *        <code>Action</code> setting, but not both:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the rule statement references a rule group, use this override action setting and not the action
     *        setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the rule statement does not reference a rule group, use the rule action setting and not this rule
     *        override action setting.
     *        </p>
     *        </li>
     */

    public void setOverrideAction(OverrideAction overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule
     * group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * Set the override action to none to leave the rule actions in effect. Set it to count to only count matches,
     * regardless of the rule action settings.
     * </p>
     * <p>
     * In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     * <code>Action</code> setting, but not both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement references a rule group, use this override action setting and not the action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use the rule action setting and not this rule override
     * action setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The override action to apply to the rules in a rule group. Used only for rule statements that reference a
     *         rule group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     *         </p>
     *         <p>
     *         Set the override action to none to leave the rule actions in effect. Set it to count to only count
     *         matches, regardless of the rule action settings.
     *         </p>
     *         <p>
     *         In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     *         <code>Action</code> setting, but not both:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the rule statement references a rule group, use this override action setting and not the action
     *         setting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the rule statement does not reference a rule group, use the rule action setting and not this rule
     *         override action setting.
     *         </p>
     *         </li>
     */

    public OverrideAction getOverrideAction() {
        return this.overrideAction;
    }

    /**
     * <p>
     * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule
     * group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * Set the override action to none to leave the rule actions in effect. Set it to count to only count matches,
     * regardless of the rule action settings.
     * </p>
     * <p>
     * In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     * <code>Action</code> setting, but not both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement references a rule group, use this override action setting and not the action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use the rule action setting and not this rule override
     * action setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param overrideAction
     *        The override action to apply to the rules in a rule group. Used only for rule statements that reference a
     *        rule group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>. </p>
     *        <p>
     *        Set the override action to none to leave the rule actions in effect. Set it to count to only count
     *        matches, regardless of the rule action settings.
     *        </p>
     *        <p>
     *        In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule
     *        <code>Action</code> setting, but not both:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the rule statement references a rule group, use this override action setting and not the action
     *        setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the rule statement does not reference a rule group, use the rule action setting and not this rule
     *        override action setting.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerRuleGroup withOverrideAction(OverrideAction overrideAction) {
        setOverrideAction(overrideAction);
        return this;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public void setVisibilityConfig(VisibilityConfig visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public VisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerRuleGroup withVisibilityConfig(VisibilityConfig visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getFirewallManagerStatement() != null)
            sb.append("FirewallManagerStatement: ").append(getFirewallManagerStatement()).append(",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: ").append(getOverrideAction()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallManagerRuleGroup == false)
            return false;
        FirewallManagerRuleGroup other = (FirewallManagerRuleGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getFirewallManagerStatement() == null ^ this.getFirewallManagerStatement() == null)
            return false;
        if (other.getFirewallManagerStatement() != null && other.getFirewallManagerStatement().equals(this.getFirewallManagerStatement()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null && other.getOverrideAction().equals(this.getOverrideAction()) == false)
            return false;
        if (other.getVisibilityConfig() == null ^ this.getVisibilityConfig() == null)
            return false;
        if (other.getVisibilityConfig() != null && other.getVisibilityConfig().equals(this.getVisibilityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getFirewallManagerStatement() == null) ? 0 : getFirewallManagerStatement().hashCode());
        hashCode = prime * hashCode + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        return hashCode;
    }

    @Override
    public FirewallManagerRuleGroup clone() {
        try {
            return (FirewallManagerRuleGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.FirewallManagerRuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
