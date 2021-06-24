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
 * The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can only
 * contain a rule group reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/FirewallManagerStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallManagerStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     */
    private ManagedRuleGroupStatement managedRuleGroupStatement;
    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     */
    private RuleGroupReferenceStatement ruleGroupReferenceStatement;

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @param managedRuleGroupStatement
     *        A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *        vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *        calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *        <p>
     *        You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     */

    public void setManagedRuleGroupStatement(ManagedRuleGroupStatement managedRuleGroupStatement) {
        this.managedRuleGroupStatement = managedRuleGroupStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @return A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *         vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *         calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *         <p>
     *         You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *         within a rule.
     */

    public ManagedRuleGroupStatement getManagedRuleGroupStatement() {
        return this.managedRuleGroupStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @param managedRuleGroupStatement
     *        A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *        vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *        calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *        <p>
     *        You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerStatement withManagedRuleGroupStatement(ManagedRuleGroupStatement managedRuleGroupStatement) {
        setManagedRuleGroupStatement(managedRuleGroupStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     * 
     * @param ruleGroupReferenceStatement
     *        A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *        group with your rules, then provide the ARN of the rule group in this statement.</p>
     *        <p>
     *        You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     */

    public void setRuleGroupReferenceStatement(RuleGroupReferenceStatement ruleGroupReferenceStatement) {
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     * 
     * @return A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *         group with your rules, then provide the ARN of the rule group in this statement.</p>
     *         <p>
     *         You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *         within a rule.
     */

    public RuleGroupReferenceStatement getRuleGroupReferenceStatement() {
        return this.ruleGroupReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     * 
     * @param ruleGroupReferenceStatement
     *        A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *        group with your rules, then provide the ARN of the rule group in this statement.</p>
     *        <p>
     *        You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallManagerStatement withRuleGroupReferenceStatement(RuleGroupReferenceStatement ruleGroupReferenceStatement) {
        setRuleGroupReferenceStatement(ruleGroupReferenceStatement);
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
        if (getManagedRuleGroupStatement() != null)
            sb.append("ManagedRuleGroupStatement: ").append(getManagedRuleGroupStatement()).append(",");
        if (getRuleGroupReferenceStatement() != null)
            sb.append("RuleGroupReferenceStatement: ").append(getRuleGroupReferenceStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallManagerStatement == false)
            return false;
        FirewallManagerStatement other = (FirewallManagerStatement) obj;
        if (other.getManagedRuleGroupStatement() == null ^ this.getManagedRuleGroupStatement() == null)
            return false;
        if (other.getManagedRuleGroupStatement() != null && other.getManagedRuleGroupStatement().equals(this.getManagedRuleGroupStatement()) == false)
            return false;
        if (other.getRuleGroupReferenceStatement() == null ^ this.getRuleGroupReferenceStatement() == null)
            return false;
        if (other.getRuleGroupReferenceStatement() != null && other.getRuleGroupReferenceStatement().equals(this.getRuleGroupReferenceStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedRuleGroupStatement() == null) ? 0 : getManagedRuleGroupStatement().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupReferenceStatement() == null) ? 0 : getRuleGroupReferenceStatement().hashCode());
        return hashCode;
    }

    @Override
    public FirewallManagerStatement clone() {
        try {
            return (FirewallManagerStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.FirewallManagerStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
