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
 * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name
 * and the name of the rule group in this statement. You can retrieve the required names by calling
 * <a>ListAvailableManagedRuleGroups</a>.
 * </p>
 * <p>
 * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code> or
 * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
 * </p>
 * <note>
 * <p>
 * You are charged additional fees when you use the WAF Bot Control managed rule group
 * <code>AWSManagedRulesBotControlRuleSet</code> or the WAF Fraud Control account takeover prevention (ATP) managed rule
 * group <code>AWSManagedRulesATPRuleSet</code>. For more information, see <a
 * href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleGroupStatement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     */
    private String vendorName;
    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the managed rule group to use. If you specify this, the version setting is fixed until you change
     * it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at the vendor's
     * default when the vendor updates the managed rule group settings.
     * </p>
     */
    private String version;
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
     * An optional nested statement that narrows the scope of the web requests that are evaluated by the managed rule
     * group. Requests are only evaluated by the rule group if they match the scope-down statement. You can use any
     * nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level, the same as you
     * can for a rule statement.
     * </p>
     */
    private Statement scopeDownStatement;
    /**
     * <p>
     * Additional information that's used by a managed rule group. Many managed rule groups don't require this.
     * </p>
     * <p>
     * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that
     * you want the Bot Control rule group to use.
     * </p>
     */
    private java.util.List<ManagedRuleGroupConfig> managedRuleGroupConfigs;
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
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *        rule group.
     */

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @return The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *         rule group.
     */

    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *        rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withVendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @param name
     *        The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @return The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @param name
     *        The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the managed rule group to use. If you specify this, the version setting is fixed until you change
     * it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at the vendor's
     * default when the vendor updates the managed rule group settings.
     * </p>
     * 
     * @param version
     *        The version of the managed rule group to use. If you specify this, the version setting is fixed until you
     *        change it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at
     *        the vendor's default when the vendor updates the managed rule group settings.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the managed rule group to use. If you specify this, the version setting is fixed until you change
     * it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at the vendor's
     * default when the vendor updates the managed rule group settings.
     * </p>
     * 
     * @return The version of the managed rule group to use. If you specify this, the version setting is fixed until you
     *         change it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version
     *         at the vendor's default when the vendor updates the managed rule group settings.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the managed rule group to use. If you specify this, the version setting is fixed until you change
     * it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at the vendor's
     * default when the vendor updates the managed rule group settings.
     * </p>
     * 
     * @param version
     *        The version of the managed rule group to use. If you specify this, the version setting is fixed until you
     *        change it. If you don't specify this, WAF uses the vendor's default version, and then keeps the version at
     *        the vendor's default when the vendor updates the managed rule group settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withVersion(String version) {
        setVersion(version);
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

    public ManagedRuleGroupStatement withExcludedRules(ExcludedRule... excludedRules) {
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

    public ManagedRuleGroupStatement withExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        setExcludedRules(excludedRules);
        return this;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated by the managed rule
     * group. Requests are only evaluated by the rule group if they match the scope-down statement. You can use any
     * nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level, the same as you
     * can for a rule statement.
     * </p>
     * 
     * @param scopeDownStatement
     *        An optional nested statement that narrows the scope of the web requests that are evaluated by the managed
     *        rule group. Requests are only evaluated by the rule group if they match the scope-down statement. You can
     *        use any nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level,
     *        the same as you can for a rule statement.
     */

    public void setScopeDownStatement(Statement scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated by the managed rule
     * group. Requests are only evaluated by the rule group if they match the scope-down statement. You can use any
     * nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level, the same as you
     * can for a rule statement.
     * </p>
     * 
     * @return An optional nested statement that narrows the scope of the web requests that are evaluated by the managed
     *         rule group. Requests are only evaluated by the rule group if they match the scope-down statement. You can
     *         use any nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level,
     *         the same as you can for a rule statement.
     */

    public Statement getScopeDownStatement() {
        return this.scopeDownStatement;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated by the managed rule
     * group. Requests are only evaluated by the rule group if they match the scope-down statement. You can use any
     * nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level, the same as you
     * can for a rule statement.
     * </p>
     * 
     * @param scopeDownStatement
     *        An optional nested statement that narrows the scope of the web requests that are evaluated by the managed
     *        rule group. Requests are only evaluated by the rule group if they match the scope-down statement. You can
     *        use any nestable <a>Statement</a> in the scope-down statement, and you can nest statements at any level,
     *        the same as you can for a rule statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withScopeDownStatement(Statement scopeDownStatement) {
        setScopeDownStatement(scopeDownStatement);
        return this;
    }

    /**
     * <p>
     * Additional information that's used by a managed rule group. Many managed rule groups don't require this.
     * </p>
     * <p>
     * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that
     * you want the Bot Control rule group to use.
     * </p>
     * 
     * @return Additional information that's used by a managed rule group. Many managed rule groups don't require
     *         this.</p>
     *         <p>
     *         Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection
     *         level that you want the Bot Control rule group to use.
     */

    public java.util.List<ManagedRuleGroupConfig> getManagedRuleGroupConfigs() {
        return managedRuleGroupConfigs;
    }

    /**
     * <p>
     * Additional information that's used by a managed rule group. Many managed rule groups don't require this.
     * </p>
     * <p>
     * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that
     * you want the Bot Control rule group to use.
     * </p>
     * 
     * @param managedRuleGroupConfigs
     *        Additional information that's used by a managed rule group. Many managed rule groups don't require
     *        this.</p>
     *        <p>
     *        Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection
     *        level that you want the Bot Control rule group to use.
     */

    public void setManagedRuleGroupConfigs(java.util.Collection<ManagedRuleGroupConfig> managedRuleGroupConfigs) {
        if (managedRuleGroupConfigs == null) {
            this.managedRuleGroupConfigs = null;
            return;
        }

        this.managedRuleGroupConfigs = new java.util.ArrayList<ManagedRuleGroupConfig>(managedRuleGroupConfigs);
    }

    /**
     * <p>
     * Additional information that's used by a managed rule group. Many managed rule groups don't require this.
     * </p>
     * <p>
     * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that
     * you want the Bot Control rule group to use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedRuleGroupConfigs(java.util.Collection)} or
     * {@link #withManagedRuleGroupConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param managedRuleGroupConfigs
     *        Additional information that's used by a managed rule group. Many managed rule groups don't require
     *        this.</p>
     *        <p>
     *        Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection
     *        level that you want the Bot Control rule group to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withManagedRuleGroupConfigs(ManagedRuleGroupConfig... managedRuleGroupConfigs) {
        if (this.managedRuleGroupConfigs == null) {
            setManagedRuleGroupConfigs(new java.util.ArrayList<ManagedRuleGroupConfig>(managedRuleGroupConfigs.length));
        }
        for (ManagedRuleGroupConfig ele : managedRuleGroupConfigs) {
            this.managedRuleGroupConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information that's used by a managed rule group. Many managed rule groups don't require this.
     * </p>
     * <p>
     * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that
     * you want the Bot Control rule group to use.
     * </p>
     * 
     * @param managedRuleGroupConfigs
     *        Additional information that's used by a managed rule group. Many managed rule groups don't require
     *        this.</p>
     *        <p>
     *        Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection
     *        level that you want the Bot Control rule group to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withManagedRuleGroupConfigs(java.util.Collection<ManagedRuleGroupConfig> managedRuleGroupConfigs) {
        setManagedRuleGroupConfigs(managedRuleGroupConfigs);
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

    public ManagedRuleGroupStatement withRuleActionOverrides(RuleActionOverride... ruleActionOverrides) {
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

    public ManagedRuleGroupStatement withRuleActionOverrides(java.util.Collection<RuleActionOverride> ruleActionOverrides) {
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
        if (getVendorName() != null)
            sb.append("VendorName: ").append(getVendorName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getExcludedRules() != null)
            sb.append("ExcludedRules: ").append(getExcludedRules()).append(",");
        if (getScopeDownStatement() != null)
            sb.append("ScopeDownStatement: ").append(getScopeDownStatement()).append(",");
        if (getManagedRuleGroupConfigs() != null)
            sb.append("ManagedRuleGroupConfigs: ").append(getManagedRuleGroupConfigs()).append(",");
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

        if (obj instanceof ManagedRuleGroupStatement == false)
            return false;
        ManagedRuleGroupStatement other = (ManagedRuleGroupStatement) obj;
        if (other.getVendorName() == null ^ this.getVendorName() == null)
            return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getExcludedRules() == null ^ this.getExcludedRules() == null)
            return false;
        if (other.getExcludedRules() != null && other.getExcludedRules().equals(this.getExcludedRules()) == false)
            return false;
        if (other.getScopeDownStatement() == null ^ this.getScopeDownStatement() == null)
            return false;
        if (other.getScopeDownStatement() != null && other.getScopeDownStatement().equals(this.getScopeDownStatement()) == false)
            return false;
        if (other.getManagedRuleGroupConfigs() == null ^ this.getManagedRuleGroupConfigs() == null)
            return false;
        if (other.getManagedRuleGroupConfigs() != null && other.getManagedRuleGroupConfigs().equals(this.getManagedRuleGroupConfigs()) == false)
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

        hashCode = prime * hashCode + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getExcludedRules() == null) ? 0 : getExcludedRules().hashCode());
        hashCode = prime * hashCode + ((getScopeDownStatement() == null) ? 0 : getScopeDownStatement().hashCode());
        hashCode = prime * hashCode + ((getManagedRuleGroupConfigs() == null) ? 0 : getManagedRuleGroupConfigs().hashCode());
        hashCode = prime * hashCode + ((getRuleActionOverrides() == null) ? 0 : getRuleActionOverrides().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleGroupStatement clone() {
        try {
            return (ManagedRuleGroupStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleGroupStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
