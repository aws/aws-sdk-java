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
 * A single rule, which you can use in a <a>WebACL</a> or <a>RuleGroup</a> to identify web requests that you want to
 * allow, block, or count. Each rule includes one top-level <a>Statement</a> that WAF uses to identify matching web
 * requests, and parameters that govern how WAF handles them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Rule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules with lower priority
     * first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     */
    private Statement statement;
    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * <p>
     * This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule
     * group include <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting, but not
     * both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use this rule action setting and not the rule override
     * action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement references a rule group, use the override action setting and not this action setting.
     * </p>
     * </li>
     * </ul>
     */
    private RuleAction action;
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
     * Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     * matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The
     * rule's rule group or web ACL defines the label namespace.
     * </p>
     * <p>
     * Rules that run after this rule in the web ACL can match against these labels using a
     * <code>LabelMatchStatement</code>.
     * </p>
     * <p>
     * For each label, provide a case-sensitive string containing optional namespaces and a label name, according to the
     * following guidelines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Separate each component of the label with a colon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each namespace or name can have up to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify up to 5 namespaces in a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     * <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     * <code>ipset</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * </p>
     */
    private java.util.List<Label> ruleLabels;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private VisibilityConfig visibilityConfig;

    /**
     * <p>
     * The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     * 
     * @param name
     *        The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     * 
     * @return The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     * 
     * @param name
     *        The name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules with lower priority
     * first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request against
     *        the <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules with
     *        lower priority first. The priorities don't need to be consecutive, but they must all be different.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules with lower priority
     * first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @return If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request
     *         against the <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules
     *         with lower priority first. The priorities don't need to be consecutive, but they must all be different.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules with lower priority
     * first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one <code>Rule</code> in a <code>WebACL</code>, WAF evaluates each request against
     *        the <code>Rules</code> in order based on the value of <code>Priority</code>. WAF processes rules with
     *        lower priority first. The priorities don't need to be consecutive, but they must all be different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     * 
     * @param statement
     *        The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     *        <a>SizeConstraintStatement</a>.
     */

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     * 
     * @return The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     *         <a>SizeConstraintStatement</a>.
     */

    public Statement getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     * 
     * @param statement
     *        The WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     *        <a>SizeConstraintStatement</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withStatement(Statement statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * <p>
     * This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule
     * group include <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting, but not
     * both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use this rule action setting and not the rule override
     * action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement references a rule group, use the override action setting and not this action setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action that WAF should take on a web request when it matches the rule statement. Settings at the web
     *        ACL level can override the rule action setting. </p>
     *        <p>
     *        This is used only for rules whose statements do not reference a rule group. Rule statements that reference
     *        a rule group include <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     *        </p>
     *        <p>
     *        You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting,
     *        but not both:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the rule statement does not reference a rule group, use this rule action setting and not the rule
     *        override action setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the rule statement references a rule group, use the override action setting and not this action
     *        setting.
     *        </p>
     *        </li>
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * <p>
     * This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule
     * group include <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting, but not
     * both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use this rule action setting and not the rule override
     * action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement references a rule group, use the override action setting and not this action setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action that WAF should take on a web request when it matches the rule statement. Settings at the web
     *         ACL level can override the rule action setting. </p>
     *         <p>
     *         This is used only for rules whose statements do not reference a rule group. Rule statements that
     *         reference a rule group include <code>RuleGroupReferenceStatement</code> and
     *         <code>ManagedRuleGroupStatement</code>.
     *         </p>
     *         <p>
     *         You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting,
     *         but not both:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the rule statement does not reference a rule group, use this rule action setting and not the rule
     *         override action setting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the rule statement references a rule group, use the override action setting and not this action
     *         setting.
     *         </p>
     *         </li>
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * <p>
     * This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule
     * group include <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     * </p>
     * <p>
     * You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting, but not
     * both:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the rule statement does not reference a rule group, use this rule action setting and not the rule override
     * action setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the rule statement references a rule group, use the override action setting and not this action setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action that WAF should take on a web request when it matches the rule statement. Settings at the web
     *        ACL level can override the rule action setting. </p>
     *        <p>
     *        This is used only for rules whose statements do not reference a rule group. Rule statements that reference
     *        a rule group include <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
     *        </p>
     *        <p>
     *        You must specify either this <code>Action</code> setting or the rule <code>OverrideAction</code> setting,
     *        but not both:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the rule statement does not reference a rule group, use this rule action setting and not the rule
     *        override action setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the rule statement references a rule group, use the override action setting and not this action
     *        setting.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withAction(RuleAction action) {
        setAction(action);
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

    public Rule withOverrideAction(OverrideAction overrideAction) {
        setOverrideAction(overrideAction);
        return this;
    }

    /**
     * <p>
     * Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     * matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The
     * rule's rule group or web ACL defines the label namespace.
     * </p>
     * <p>
     * Rules that run after this rule in the web ACL can match against these labels using a
     * <code>LabelMatchStatement</code>.
     * </p>
     * <p>
     * For each label, provide a case-sensitive string containing optional namespaces and a label name, according to the
     * following guidelines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Separate each component of the label with a colon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each namespace or name can have up to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify up to 5 namespaces in a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     * <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     * <code>ipset</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * </p>
     * 
     * @return Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels
     *         to matching web requests. A fully qualified label is the concatenation of a label namespace and a rule
     *         label. The rule's rule group or web ACL defines the label namespace. </p>
     *         <p>
     *         Rules that run after this rule in the web ACL can match against these labels using a
     *         <code>LabelMatchStatement</code>.
     *         </p>
     *         <p>
     *         For each label, provide a case-sensitive string containing optional namespaces and a label name,
     *         according to the following guidelines:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Separate each component of the label with a colon.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each namespace or name can have up to 128 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can specify up to 5 namespaces in a label.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     *         <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     *         <code>ipset</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     */

    public java.util.List<Label> getRuleLabels() {
        return ruleLabels;
    }

    /**
     * <p>
     * Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     * matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The
     * rule's rule group or web ACL defines the label namespace.
     * </p>
     * <p>
     * Rules that run after this rule in the web ACL can match against these labels using a
     * <code>LabelMatchStatement</code>.
     * </p>
     * <p>
     * For each label, provide a case-sensitive string containing optional namespaces and a label name, according to the
     * following guidelines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Separate each component of the label with a colon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each namespace or name can have up to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify up to 5 namespaces in a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     * <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     * <code>ipset</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * </p>
     * 
     * @param ruleLabels
     *        Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     *        matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label.
     *        The rule's rule group or web ACL defines the label namespace. </p>
     *        <p>
     *        Rules that run after this rule in the web ACL can match against these labels using a
     *        <code>LabelMatchStatement</code>.
     *        </p>
     *        <p>
     *        For each label, provide a case-sensitive string containing optional namespaces and a label name, according
     *        to the following guidelines:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Separate each component of the label with a colon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each namespace or name can have up to 128 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify up to 5 namespaces in a label.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     *        <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     *        <code>ipset</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     */

    public void setRuleLabels(java.util.Collection<Label> ruleLabels) {
        if (ruleLabels == null) {
            this.ruleLabels = null;
            return;
        }

        this.ruleLabels = new java.util.ArrayList<Label>(ruleLabels);
    }

    /**
     * <p>
     * Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     * matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The
     * rule's rule group or web ACL defines the label namespace.
     * </p>
     * <p>
     * Rules that run after this rule in the web ACL can match against these labels using a
     * <code>LabelMatchStatement</code>.
     * </p>
     * <p>
     * For each label, provide a case-sensitive string containing optional namespaces and a label name, according to the
     * following guidelines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Separate each component of the label with a colon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each namespace or name can have up to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify up to 5 namespaces in a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     * <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     * <code>ipset</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleLabels(java.util.Collection)} or {@link #withRuleLabels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleLabels
     *        Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     *        matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label.
     *        The rule's rule group or web ACL defines the label namespace. </p>
     *        <p>
     *        Rules that run after this rule in the web ACL can match against these labels using a
     *        <code>LabelMatchStatement</code>.
     *        </p>
     *        <p>
     *        For each label, provide a case-sensitive string containing optional namespaces and a label name, according
     *        to the following guidelines:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Separate each component of the label with a colon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each namespace or name can have up to 128 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify up to 5 namespaces in a label.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     *        <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     *        <code>ipset</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRuleLabels(Label... ruleLabels) {
        if (this.ruleLabels == null) {
            setRuleLabels(new java.util.ArrayList<Label>(ruleLabels.length));
        }
        for (Label ele : ruleLabels) {
            this.ruleLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     * matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The
     * rule's rule group or web ACL defines the label namespace.
     * </p>
     * <p>
     * Rules that run after this rule in the web ACL can match against these labels using a
     * <code>LabelMatchStatement</code>.
     * </p>
     * <p>
     * For each label, provide a case-sensitive string containing optional namespaces and a label name, according to the
     * following guidelines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Separate each component of the label with a colon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each namespace or name can have up to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify up to 5 namespaces in a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     * <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     * <code>ipset</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * </p>
     * 
     * @param ruleLabels
     *        Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to
     *        matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label.
     *        The rule's rule group or web ACL defines the label namespace. </p>
     *        <p>
     *        Rules that run after this rule in the web ACL can match against these labels using a
     *        <code>LabelMatchStatement</code>.
     *        </p>
     *        <p>
     *        For each label, provide a case-sensitive string containing optional namespaces and a label name, according
     *        to the following guidelines:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Separate each component of the label with a colon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each namespace or name can have up to 128 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify up to 5 namespaces in a label.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use the following reserved words in your label specification: <code>aws</code>, <code>waf</code>,
     *        <code>managed</code>, <code>rulegroup</code>, <code>webacl</code>, <code>regexpatternset</code>, or
     *        <code>ipset</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>myLabelName</code> or <code>nameSpace1:nameSpace2:myLabelName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRuleLabels(java.util.Collection<Label> ruleLabels) {
        setRuleLabels(ruleLabels);
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

    public Rule withVisibilityConfig(VisibilityConfig visibilityConfig) {
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
        if (getStatement() != null)
            sb.append("Statement: ").append(getStatement()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: ").append(getOverrideAction()).append(",");
        if (getRuleLabels() != null)
            sb.append("RuleLabels: ").append(getRuleLabels()).append(",");
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

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null && other.getOverrideAction().equals(this.getOverrideAction()) == false)
            return false;
        if (other.getRuleLabels() == null ^ this.getRuleLabels() == null)
            return false;
        if (other.getRuleLabels() != null && other.getRuleLabels().equals(this.getRuleLabels()) == false)
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
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getRuleLabels() == null) ? 0 : getRuleLabels().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
