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
 * A rule group defines a collection of rules to inspect and control web requests that you can use in a <a>WebACL</a>.
 * When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay
 * within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * When you create your own rule group, you define this, and you cannot change it after creation. When you add or
     * modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of rules using
     * <a>CheckCapacity</a>.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     */
    private Long capacity;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how
     * WAF handles them.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private VisibilityConfig visibilityConfig;
    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for your rule groups is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     */
    private String labelNamespace;
    /**
     * <p>
     * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a
     * custom response to the web request. You define these for the rule group, and then use them in the rules that you
     * define in the rule group.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     */
    private java.util.Map<String, CustomResponseBody> customResponseBodies;
    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     */
    private java.util.List<LabelSummary> availableLabels;
    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     */
    private java.util.List<LabelSummary> consumedLabels;

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

    public RuleGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the rule group. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @return A unique identifier for the rule group. This ID is returned in the responses to create and list commands.
     *         You provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the rule group. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * When you create your own rule group, you define this, and you cannot change it after creation. When you add or
     * modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of rules using
     * <a>CheckCapacity</a>.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group.</p>
     *        <p>
     *        When you create your own rule group, you define this, and you cannot change it after creation. When you
     *        add or modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of
     *        rules using <a>CheckCapacity</a>.
     *        </p>
     *        <p>
     *        WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost
     *        of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more
     *        processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage
     *        when they use a rule group. The WCU limit for web ACLs is 1,500.
     */

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * When you create your own rule group, you define this, and you cannot change it after creation. When you add or
     * modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of rules using
     * <a>CheckCapacity</a>.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) required for this rule group.</p>
     *         <p>
     *         When you create your own rule group, you define this, and you cannot change it after creation. When you
     *         add or modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of
     *         rules using <a>CheckCapacity</a>.
     *         </p>
     *         <p>
     *         WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *         groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative
     *         cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use
     *         more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU
     *         usage when they use a rule group. The WCU limit for web ACLs is 1,500.
     */

    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * When you create your own rule group, you define this, and you cannot change it after creation. When you add or
     * modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of rules using
     * <a>CheckCapacity</a>.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group.</p>
     *        <p>
     *        When you create your own rule group, you define this, and you cannot change it after creation. When you
     *        add or modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of
     *        rules using <a>CheckCapacity</a>.
     *        </p>
     *        <p>
     *        WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost
     *        of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more
     *        processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage
     *        when they use a rule group. The WCU limit for web ACLs is 1,500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withCapacity(Long capacity) {
        setCapacity(capacity);
        return this;
    }

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

    public RuleGroup withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the rule group that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     * 
     * @return A description of the rule group that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the rule group that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how
     * WAF handles them.
     * </p>
     * 
     * @return The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count.
     *         Each rule includes one top-level statement that WAF uses to identify matching web requests, and
     *         parameters that govern how WAF handles them.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how
     * WAF handles them.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *        govern how WAF handles them.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how
     * WAF handles them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *        govern how WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how
     * WAF handles them.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *        govern how WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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

    public RuleGroup withVisibilityConfig(VisibilityConfig visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
        return this;
    }

    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for your rule groups is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelNamespace
     *        The label namespace prefix for this rule group. All labels added by rules in this rule group have this
     *        prefix. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for your rule groups is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     *        qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined
     *        and the label from the rule, separated by a colon:
     *        </p>
     *        <p>
     *        <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *        </p>
     *        </li>
     */

    public void setLabelNamespace(String labelNamespace) {
        this.labelNamespace = labelNamespace;
    }

    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for your rule groups is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The label namespace prefix for this rule group. All labels added by rules in this rule group have this
     *         prefix. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The syntax for the label namespace prefix for your rule groups is the following:
     *         </p>
     *         <p>
     *         <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A
     *         fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is
     *         defined and the label from the rule, separated by a colon:
     *         </p>
     *         <p>
     *         <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *         </p>
     *         </li>
     */

    public String getLabelNamespace() {
        return this.labelNamespace;
    }

    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for your rule groups is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelNamespace
     *        The label namespace prefix for this rule group. All labels added by rules in this rule group have this
     *        prefix. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for your rule groups is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     *        qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined
     *        and the label from the rule, separated by a colon:
     *        </p>
     *        <p>
     *        <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withLabelNamespace(String labelNamespace) {
        setLabelNamespace(labelNamespace);
        return this;
    }

    /**
     * <p>
     * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a
     * custom response to the web request. You define these for the rule group, and then use them in the rules that you
     * define in the rule group.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return A map of custom response keys and content bodies. When you create a rule with a block action, you can
     *         send a custom response to the web request. You define these for the rule group, and then use them in the
     *         rules that you define in the rule group. </p>
     *         <p>
     *         For information about customizing web requests and responses, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *         web requests and responses in WAF</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     *         </p>
     *         <p>
     *         For information about the limits on count and size for custom request and response settings, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public java.util.Map<String, CustomResponseBody> getCustomResponseBodies() {
        return customResponseBodies;
    }

    /**
     * <p>
     * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a
     * custom response to the web request. You define these for the rule group, and then use them in the rules that you
     * define in the rule group.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param customResponseBodies
     *        A map of custom response keys and content bodies. When you create a rule with a block action, you can send
     *        a custom response to the web request. You define these for the rule group, and then use them in the rules
     *        that you define in the rule group. </p>
     *        <p>
     *        For information about customizing web requests and responses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     *        </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setCustomResponseBodies(java.util.Map<String, CustomResponseBody> customResponseBodies) {
        this.customResponseBodies = customResponseBodies;
    }

    /**
     * <p>
     * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a
     * custom response to the web request. You define these for the rule group, and then use them in the rules that you
     * define in the rule group.
     * </p>
     * <p>
     * For information about customizing web requests and responses, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing web
     * requests and responses in WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * <p>
     * For information about the limits on count and size for custom request and response settings, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param customResponseBodies
     *        A map of custom response keys and content bodies. When you create a rule with a block action, you can send
     *        a custom response to the web request. You define these for the rule group, and then use them in the rules
     *        that you define in the rule group. </p>
     *        <p>
     *        For information about customizing web requests and responses, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html">Customizing
     *        web requests and responses in WAF</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     *        </p>
     *        <p>
     *        For information about the limits on count and size for custom request and response settings, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">WAF quotas</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withCustomResponseBodies(java.util.Map<String, CustomResponseBody> customResponseBodies) {
        setCustomResponseBodies(customResponseBodies);
        return this;
    }

    /**
     * Add a single CustomResponseBodies entry
     *
     * @see RuleGroup#withCustomResponseBodies
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup addCustomResponseBodiesEntry(String key, CustomResponseBody value) {
        if (null == this.customResponseBodies) {
            this.customResponseBodies = new java.util.HashMap<String, CustomResponseBody>();
        }
        if (this.customResponseBodies.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customResponseBodies.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomResponseBodies.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup clearCustomResponseBodiesEntries() {
        this.customResponseBodies = null;
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * 
     * @return The labels that one or more rules in this rule group add to matching web requests. These labels are
     *         defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     */

    public java.util.List<LabelSummary> getAvailableLabels() {
        return availableLabels;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * 
     * @param availableLabels
     *        The labels that one or more rules in this rule group add to matching web requests. These labels are
     *        defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     */

    public void setAvailableLabels(java.util.Collection<LabelSummary> availableLabels) {
        if (availableLabels == null) {
            this.availableLabels = null;
            return;
        }

        this.availableLabels = new java.util.ArrayList<LabelSummary>(availableLabels);
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableLabels(java.util.Collection)} or {@link #withAvailableLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param availableLabels
     *        The labels that one or more rules in this rule group add to matching web requests. These labels are
     *        defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withAvailableLabels(LabelSummary... availableLabels) {
        if (this.availableLabels == null) {
            setAvailableLabels(new java.util.ArrayList<LabelSummary>(availableLabels.length));
        }
        for (LabelSummary ele : availableLabels) {
            this.availableLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * 
     * @param availableLabels
     *        The labels that one or more rules in this rule group add to matching web requests. These labels are
     *        defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withAvailableLabels(java.util.Collection<LabelSummary> availableLabels) {
        setAvailableLabels(availableLabels);
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * 
     * @return The labels that one or more rules in this rule group match against in label match statements. These
     *         labels are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a>
     *         definition of a rule.
     */

    public java.util.List<LabelSummary> getConsumedLabels() {
        return consumedLabels;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * 
     * @param consumedLabels
     *        The labels that one or more rules in this rule group match against in label match statements. These labels
     *        are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a
     *        rule.
     */

    public void setConsumedLabels(java.util.Collection<LabelSummary> consumedLabels) {
        if (consumedLabels == null) {
            this.consumedLabels = null;
            return;
        }

        this.consumedLabels = new java.util.ArrayList<LabelSummary>(consumedLabels);
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedLabels(java.util.Collection)} or {@link #withConsumedLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param consumedLabels
     *        The labels that one or more rules in this rule group match against in label match statements. These labels
     *        are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withConsumedLabels(LabelSummary... consumedLabels) {
        if (this.consumedLabels == null) {
            setConsumedLabels(new java.util.ArrayList<LabelSummary>(consumedLabels.length));
        }
        for (LabelSummary ele : consumedLabels) {
            this.consumedLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * 
     * @param consumedLabels
     *        The labels that one or more rules in this rule group match against in label match statements. These labels
     *        are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withConsumedLabels(java.util.Collection<LabelSummary> consumedLabels) {
        setConsumedLabels(consumedLabels);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig()).append(",");
        if (getLabelNamespace() != null)
            sb.append("LabelNamespace: ").append(getLabelNamespace()).append(",");
        if (getCustomResponseBodies() != null)
            sb.append("CustomResponseBodies: ").append(getCustomResponseBodies()).append(",");
        if (getAvailableLabels() != null)
            sb.append("AvailableLabels: ").append(getAvailableLabels()).append(",");
        if (getConsumedLabels() != null)
            sb.append("ConsumedLabels: ").append(getConsumedLabels());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getVisibilityConfig() == null ^ this.getVisibilityConfig() == null)
            return false;
        if (other.getVisibilityConfig() != null && other.getVisibilityConfig().equals(this.getVisibilityConfig()) == false)
            return false;
        if (other.getLabelNamespace() == null ^ this.getLabelNamespace() == null)
            return false;
        if (other.getLabelNamespace() != null && other.getLabelNamespace().equals(this.getLabelNamespace()) == false)
            return false;
        if (other.getCustomResponseBodies() == null ^ this.getCustomResponseBodies() == null)
            return false;
        if (other.getCustomResponseBodies() != null && other.getCustomResponseBodies().equals(this.getCustomResponseBodies()) == false)
            return false;
        if (other.getAvailableLabels() == null ^ this.getAvailableLabels() == null)
            return false;
        if (other.getAvailableLabels() != null && other.getAvailableLabels().equals(this.getAvailableLabels()) == false)
            return false;
        if (other.getConsumedLabels() == null ^ this.getConsumedLabels() == null)
            return false;
        if (other.getConsumedLabels() != null && other.getConsumedLabels().equals(this.getConsumedLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        hashCode = prime * hashCode + ((getLabelNamespace() == null) ? 0 : getLabelNamespace().hashCode());
        hashCode = prime * hashCode + ((getCustomResponseBodies() == null) ? 0 : getCustomResponseBodies().hashCode());
        hashCode = prime * hashCode + ((getAvailableLabels() == null) ? 0 : getAvailableLabels().hashCode());
        hashCode = prime * hashCode + ((getConsumedLabels() == null) ? 0 : getConsumedLabels().hashCode());
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
        com.amazonaws.services.wafv2.model.transform.RuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
