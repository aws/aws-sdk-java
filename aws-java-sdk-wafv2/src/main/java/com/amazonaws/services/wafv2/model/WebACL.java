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
 * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined
 * (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a default
 * action to take (allow, block) for any request that does not match any of the rules. The rules in a web ACL can be a
 * combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a web ACL with one
 * or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront distribution, an Amazon
 * API Gateway REST API, an Application Load Balancer, or an AppSync GraphQL API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/WebACL" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebACL implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the web ACL. You cannot change the name of a web ACL after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     */
    private DefaultAction defaultAction;
    /**
     * <p>
     * A description of the web ACL that helps with identification.
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
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
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
     * The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized after these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     */
    private java.util.List<FirewallManagerRuleGroup> preProcessFirewallManagerRuleGroups;
    /**
     * <p>
     * The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized before these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     */
    private java.util.List<FirewallManagerRuleGroup> postProcessFirewallManagerRuleGroups;
    /**
     * <p>
     * Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can delete the
     * web ACL or any Firewall Manager rule groups in the web ACL.
     * </p>
     */
    private Boolean managedByFirewallManager;
    /**
     * <p>
     * The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a web ACL is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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
     * custom response to the web request. You define these for the web ACL, and then use them in the rules and default
     * actions that you define in the web ACL.
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
     * The name of the web ACL. You cannot change the name of a web ACL after you create it.
     * </p>
     * 
     * @param name
     *        The name of the web ACL. You cannot change the name of a web ACL after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the web ACL. You cannot change the name of a web ACL after you create it.
     * </p>
     * 
     * @return The name of the web ACL. You cannot change the name of a web ACL after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the web ACL. You cannot change the name of a web ACL after you create it.
     * </p>
     * 
     * @param name
     *        The name of the web ACL. You cannot change the name of a web ACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     *        commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     * 
     * @return A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     *         commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     *        commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     */

    public void setDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @return The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     */

    public DefaultAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withDefaultAction(DefaultAction defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * A description of the web ACL that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the web ACL that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the web ACL that helps with identification.
     * </p>
     * 
     * @return A description of the web ACL that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the web ACL that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the web ACL that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withDescription(String description) {
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

    public WebACL withRules(Rule... rules) {
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

    public WebACL withRules(java.util.Collection<Rule> rules) {
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

    public WebACL withVisibilityConfig(VisibilityConfig visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
        return this;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
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
     *        The web ACL capacity units (WCUs) currently being used by this web ACL. </p>
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
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) currently being used by this web ACL. </p>
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
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
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
     *        The web ACL capacity units (WCUs) currently being used by this web ACL. </p>
     *        <p>
     *        WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost
     *        of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more
     *        processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage
     *        when they use a rule group. The WCU limit for web ACLs is 1,500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withCapacity(Long capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized after these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * 
     * @return The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF
     *         policy and contains only rule group references. You can't alter these. Any rules and rule groups that you
     *         define for the web ACL are prioritized after these. </p>
     *         <p>
     *         In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *         run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *         prioritizes the rule groups, to determine their relative processing order.
     */

    public java.util.List<FirewallManagerRuleGroup> getPreProcessFirewallManagerRuleGroups() {
        return preProcessFirewallManagerRuleGroups;
    }

    /**
     * <p>
     * The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized after these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * 
     * @param preProcessFirewallManagerRuleGroups
     *        The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF
     *        policy and contains only rule group references. You can't alter these. Any rules and rule groups that you
     *        define for the web ACL are prioritized after these. </p>
     *        <p>
     *        In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *        run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *        prioritizes the rule groups, to determine their relative processing order.
     */

    public void setPreProcessFirewallManagerRuleGroups(java.util.Collection<FirewallManagerRuleGroup> preProcessFirewallManagerRuleGroups) {
        if (preProcessFirewallManagerRuleGroups == null) {
            this.preProcessFirewallManagerRuleGroups = null;
            return;
        }

        this.preProcessFirewallManagerRuleGroups = new java.util.ArrayList<FirewallManagerRuleGroup>(preProcessFirewallManagerRuleGroups);
    }

    /**
     * <p>
     * The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized after these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreProcessFirewallManagerRuleGroups(java.util.Collection)} or
     * {@link #withPreProcessFirewallManagerRuleGroups(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param preProcessFirewallManagerRuleGroups
     *        The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF
     *        policy and contains only rule group references. You can't alter these. Any rules and rule groups that you
     *        define for the web ACL are prioritized after these. </p>
     *        <p>
     *        In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *        run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *        prioritizes the rule groups, to determine their relative processing order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withPreProcessFirewallManagerRuleGroups(FirewallManagerRuleGroup... preProcessFirewallManagerRuleGroups) {
        if (this.preProcessFirewallManagerRuleGroups == null) {
            setPreProcessFirewallManagerRuleGroups(new java.util.ArrayList<FirewallManagerRuleGroup>(preProcessFirewallManagerRuleGroups.length));
        }
        for (FirewallManagerRuleGroup ele : preProcessFirewallManagerRuleGroups) {
            this.preProcessFirewallManagerRuleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized after these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * 
     * @param preProcessFirewallManagerRuleGroups
     *        The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF
     *        policy and contains only rule group references. You can't alter these. Any rules and rule groups that you
     *        define for the web ACL are prioritized after these. </p>
     *        <p>
     *        In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *        run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *        prioritizes the rule groups, to determine their relative processing order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withPreProcessFirewallManagerRuleGroups(java.util.Collection<FirewallManagerRuleGroup> preProcessFirewallManagerRuleGroups) {
        setPreProcessFirewallManagerRuleGroups(preProcessFirewallManagerRuleGroups);
        return this;
    }

    /**
     * <p>
     * The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized before these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * 
     * @return The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF
     *         policy and contains only rule group references. You can't alter these. Any rules and rule groups that you
     *         define for the web ACL are prioritized before these. </p>
     *         <p>
     *         In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *         run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *         prioritizes the rule groups, to determine their relative processing order.
     */

    public java.util.List<FirewallManagerRuleGroup> getPostProcessFirewallManagerRuleGroups() {
        return postProcessFirewallManagerRuleGroups;
    }

    /**
     * <p>
     * The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized before these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * 
     * @param postProcessFirewallManagerRuleGroups
     *        The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy
     *        and contains only rule group references. You can't alter these. Any rules and rule groups that you define
     *        for the web ACL are prioritized before these. </p>
     *        <p>
     *        In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *        run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *        prioritizes the rule groups, to determine their relative processing order.
     */

    public void setPostProcessFirewallManagerRuleGroups(java.util.Collection<FirewallManagerRuleGroup> postProcessFirewallManagerRuleGroups) {
        if (postProcessFirewallManagerRuleGroups == null) {
            this.postProcessFirewallManagerRuleGroups = null;
            return;
        }

        this.postProcessFirewallManagerRuleGroups = new java.util.ArrayList<FirewallManagerRuleGroup>(postProcessFirewallManagerRuleGroups);
    }

    /**
     * <p>
     * The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized before these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPostProcessFirewallManagerRuleGroups(java.util.Collection)} or
     * {@link #withPostProcessFirewallManagerRuleGroups(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param postProcessFirewallManagerRuleGroups
     *        The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy
     *        and contains only rule group references. You can't alter these. Any rules and rule groups that you define
     *        for the web ACL are prioritized before these. </p>
     *        <p>
     *        In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *        run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *        prioritizes the rule groups, to determine their relative processing order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withPostProcessFirewallManagerRuleGroups(FirewallManagerRuleGroup... postProcessFirewallManagerRuleGroups) {
        if (this.postProcessFirewallManagerRuleGroups == null) {
            setPostProcessFirewallManagerRuleGroups(new java.util.ArrayList<FirewallManagerRuleGroup>(postProcessFirewallManagerRuleGroups.length));
        }
        for (FirewallManagerRuleGroup ele : postProcessFirewallManagerRuleGroups) {
            this.postProcessFirewallManagerRuleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and
     * contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web
     * ACL are prioritized before these.
     * </p>
     * <p>
     * In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run
     * first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the
     * rule groups, to determine their relative processing order.
     * </p>
     * 
     * @param postProcessFirewallManagerRuleGroups
     *        The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy
     *        and contains only rule group references. You can't alter these. Any rules and rule groups that you define
     *        for the web ACL are prioritized before these. </p>
     *        <p>
     *        In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to
     *        run first in the web ACL and a set of rule groups to run last. Within each set, the administrator
     *        prioritizes the rule groups, to determine their relative processing order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withPostProcessFirewallManagerRuleGroups(java.util.Collection<FirewallManagerRuleGroup> postProcessFirewallManagerRuleGroups) {
        setPostProcessFirewallManagerRuleGroups(postProcessFirewallManagerRuleGroups);
        return this;
    }

    /**
     * <p>
     * Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can delete the
     * web ACL or any Firewall Manager rule groups in the web ACL.
     * </p>
     * 
     * @param managedByFirewallManager
     *        Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can
     *        delete the web ACL or any Firewall Manager rule groups in the web ACL.
     */

    public void setManagedByFirewallManager(Boolean managedByFirewallManager) {
        this.managedByFirewallManager = managedByFirewallManager;
    }

    /**
     * <p>
     * Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can delete the
     * web ACL or any Firewall Manager rule groups in the web ACL.
     * </p>
     * 
     * @return Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can
     *         delete the web ACL or any Firewall Manager rule groups in the web ACL.
     */

    public Boolean getManagedByFirewallManager() {
        return this.managedByFirewallManager;
    }

    /**
     * <p>
     * Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can delete the
     * web ACL or any Firewall Manager rule groups in the web ACL.
     * </p>
     * 
     * @param managedByFirewallManager
     *        Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can
     *        delete the web ACL or any Firewall Manager rule groups in the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withManagedByFirewallManager(Boolean managedByFirewallManager) {
        setManagedByFirewallManager(managedByFirewallManager);
        return this;
    }

    /**
     * <p>
     * Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can delete the
     * web ACL or any Firewall Manager rule groups in the web ACL.
     * </p>
     * 
     * @return Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can
     *         delete the web ACL or any Firewall Manager rule groups in the web ACL.
     */

    public Boolean isManagedByFirewallManager() {
        return this.managedByFirewallManager;
    }

    /**
     * <p>
     * The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a web ACL is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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
     *        The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for a web ACL is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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
     * The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a web ACL is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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
     * @return The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The syntax for the label namespace prefix for a web ACL is the following:
     *         </p>
     *         <p>
     *         <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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
     * The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a web ACL is the following:
     * </p>
     * <p>
     * <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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
     *        The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for a web ACL is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:</code>
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

    public WebACL withLabelNamespace(String labelNamespace) {
        setLabelNamespace(labelNamespace);
        return this;
    }

    /**
     * <p>
     * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a
     * custom response to the web request. You define these for the web ACL, and then use them in the rules and default
     * actions that you define in the web ACL.
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
     *         send a custom response to the web request. You define these for the web ACL, and then use them in the
     *         rules and default actions that you define in the web ACL. </p>
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
     * custom response to the web request. You define these for the web ACL, and then use them in the rules and default
     * actions that you define in the web ACL.
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
     *        a custom response to the web request. You define these for the web ACL, and then use them in the rules and
     *        default actions that you define in the web ACL. </p>
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
     * custom response to the web request. You define these for the web ACL, and then use them in the rules and default
     * actions that you define in the web ACL.
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
     *        a custom response to the web request. You define these for the web ACL, and then use them in the rules and
     *        default actions that you define in the web ACL. </p>
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

    public WebACL withCustomResponseBodies(java.util.Map<String, CustomResponseBody> customResponseBodies) {
        setCustomResponseBodies(customResponseBodies);
        return this;
    }

    /**
     * Add a single CustomResponseBodies entry
     *
     * @see WebACL#withCustomResponseBodies
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WebACL addCustomResponseBodiesEntry(String key, CustomResponseBody value) {
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

    public WebACL clearCustomResponseBodiesEntries() {
        this.customResponseBodies = null;
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getPreProcessFirewallManagerRuleGroups() != null)
            sb.append("PreProcessFirewallManagerRuleGroups: ").append(getPreProcessFirewallManagerRuleGroups()).append(",");
        if (getPostProcessFirewallManagerRuleGroups() != null)
            sb.append("PostProcessFirewallManagerRuleGroups: ").append(getPostProcessFirewallManagerRuleGroups()).append(",");
        if (getManagedByFirewallManager() != null)
            sb.append("ManagedByFirewallManager: ").append(getManagedByFirewallManager()).append(",");
        if (getLabelNamespace() != null)
            sb.append("LabelNamespace: ").append(getLabelNamespace()).append(",");
        if (getCustomResponseBodies() != null)
            sb.append("CustomResponseBodies: ").append(getCustomResponseBodies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACL == false)
            return false;
        WebACL other = (WebACL) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
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
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getPreProcessFirewallManagerRuleGroups() == null ^ this.getPreProcessFirewallManagerRuleGroups() == null)
            return false;
        if (other.getPreProcessFirewallManagerRuleGroups() != null
                && other.getPreProcessFirewallManagerRuleGroups().equals(this.getPreProcessFirewallManagerRuleGroups()) == false)
            return false;
        if (other.getPostProcessFirewallManagerRuleGroups() == null ^ this.getPostProcessFirewallManagerRuleGroups() == null)
            return false;
        if (other.getPostProcessFirewallManagerRuleGroups() != null
                && other.getPostProcessFirewallManagerRuleGroups().equals(this.getPostProcessFirewallManagerRuleGroups()) == false)
            return false;
        if (other.getManagedByFirewallManager() == null ^ this.getManagedByFirewallManager() == null)
            return false;
        if (other.getManagedByFirewallManager() != null && other.getManagedByFirewallManager().equals(this.getManagedByFirewallManager()) == false)
            return false;
        if (other.getLabelNamespace() == null ^ this.getLabelNamespace() == null)
            return false;
        if (other.getLabelNamespace() != null && other.getLabelNamespace().equals(this.getLabelNamespace()) == false)
            return false;
        if (other.getCustomResponseBodies() == null ^ this.getCustomResponseBodies() == null)
            return false;
        if (other.getCustomResponseBodies() != null && other.getCustomResponseBodies().equals(this.getCustomResponseBodies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getPreProcessFirewallManagerRuleGroups() == null) ? 0 : getPreProcessFirewallManagerRuleGroups().hashCode());
        hashCode = prime * hashCode + ((getPostProcessFirewallManagerRuleGroups() == null) ? 0 : getPostProcessFirewallManagerRuleGroups().hashCode());
        hashCode = prime * hashCode + ((getManagedByFirewallManager() == null) ? 0 : getManagedByFirewallManager().hashCode());
        hashCode = prime * hashCode + ((getLabelNamespace() == null) ? 0 : getLabelNamespace().hashCode());
        hashCode = prime * hashCode + ((getCustomResponseBodies() == null) ? 0 : getCustomResponseBodies().hashCode());
        return hashCode;
    }

    @Override
    public WebACL clone() {
        try {
            return (WebACL) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.WebACLMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
