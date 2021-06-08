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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateRuleGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     */
    private String ruleGroupName;
    /**
     * <p>
     * An object that defines the rule group rules.
     * </p>
     * <note>
     * <p>
     * You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     * </p>
     * </note>
     */
    private RuleGroup ruleGroup;
    /**
     * <p>
     * A string containing stateful rule group rules specifications in Suricata flat format, with one rule per line. Use
     * this to import your existing Suricata compatible rule groups.
     * </p>
     * <note>
     * <p>
     * You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     * </p>
     * </note>
     * <p>
     * You can provide your rule group specification in Suricata flat format through this setting when you create or
     * update your rule group. The call response returns a <a>RuleGroup</a> object that Network Firewall has populated
     * from your string.
     * </p>
     */
    private String rules;
    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A description of the rule group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * <note>
     * <p>
     * You can't change or exceed this capacity when you update the rule group, so leave room for your rule group to
     * grow.
     * </p>
     * </note>
     * <p>
     * <b>Capacity for a stateless rule group</b>
     * </p>
     * <p>
     * For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules
     * that you expect to have in the rule group.
     * </p>
     * <p>
     * To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each of the
     * rule's match settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A match setting with no criteria specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * A match setting with <code>Any</code> specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other match settings have a value equal to the number of elements provided in the setting. For example, a
     * protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A protocol setting
     * ["UDP","TCP"] has a value of 2. A source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule with
     * protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a single
     * specification or no specification for each of the other match settings has a capacity requirement of 6.
     * </p>
     * <p>
     * <b>Capacity for a stateful rule group</b>
     * </p>
     * <p>
     * For a stateful rule group, the minimum capacity required is the number of individual rules that you expect to
     * have in the rule group.
     * </p>
     */
    private Integer capacity;
    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     */

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @return The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     */

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withRuleGroupName(String ruleGroupName) {
        setRuleGroupName(ruleGroupName);
        return this;
    }

    /**
     * <p>
     * An object that defines the rule group rules.
     * </p>
     * <note>
     * <p>
     * You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     * </p>
     * </note>
     * 
     * @param ruleGroup
     *        An object that defines the rule group rules. </p> <note>
     *        <p>
     *        You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     *        </p>
     */

    public void setRuleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * <p>
     * An object that defines the rule group rules.
     * </p>
     * <note>
     * <p>
     * You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     * </p>
     * </note>
     * 
     * @return An object that defines the rule group rules. </p> <note>
     *         <p>
     *         You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     *         </p>
     */

    public RuleGroup getRuleGroup() {
        return this.ruleGroup;
    }

    /**
     * <p>
     * An object that defines the rule group rules.
     * </p>
     * <note>
     * <p>
     * You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     * </p>
     * </note>
     * 
     * @param ruleGroup
     *        An object that defines the rule group rules. </p> <note>
     *        <p>
     *        You must provide either this rule group setting or a <code>Rules</code> setting, but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withRuleGroup(RuleGroup ruleGroup) {
        setRuleGroup(ruleGroup);
        return this;
    }

    /**
     * <p>
     * A string containing stateful rule group rules specifications in Suricata flat format, with one rule per line. Use
     * this to import your existing Suricata compatible rule groups.
     * </p>
     * <note>
     * <p>
     * You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     * </p>
     * </note>
     * <p>
     * You can provide your rule group specification in Suricata flat format through this setting when you create or
     * update your rule group. The call response returns a <a>RuleGroup</a> object that Network Firewall has populated
     * from your string.
     * </p>
     * 
     * @param rules
     *        A string containing stateful rule group rules specifications in Suricata flat format, with one rule per
     *        line. Use this to import your existing Suricata compatible rule groups. </p> <note>
     *        <p>
     *        You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     *        </p>
     *        </note>
     *        <p>
     *        You can provide your rule group specification in Suricata flat format through this setting when you create
     *        or update your rule group. The call response returns a <a>RuleGroup</a> object that Network Firewall has
     *        populated from your string.
     */

    public void setRules(String rules) {
        this.rules = rules;
    }

    /**
     * <p>
     * A string containing stateful rule group rules specifications in Suricata flat format, with one rule per line. Use
     * this to import your existing Suricata compatible rule groups.
     * </p>
     * <note>
     * <p>
     * You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     * </p>
     * </note>
     * <p>
     * You can provide your rule group specification in Suricata flat format through this setting when you create or
     * update your rule group. The call response returns a <a>RuleGroup</a> object that Network Firewall has populated
     * from your string.
     * </p>
     * 
     * @return A string containing stateful rule group rules specifications in Suricata flat format, with one rule per
     *         line. Use this to import your existing Suricata compatible rule groups. </p> <note>
     *         <p>
     *         You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     *         </p>
     *         </note>
     *         <p>
     *         You can provide your rule group specification in Suricata flat format through this setting when you
     *         create or update your rule group. The call response returns a <a>RuleGroup</a> object that Network
     *         Firewall has populated from your string.
     */

    public String getRules() {
        return this.rules;
    }

    /**
     * <p>
     * A string containing stateful rule group rules specifications in Suricata flat format, with one rule per line. Use
     * this to import your existing Suricata compatible rule groups.
     * </p>
     * <note>
     * <p>
     * You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     * </p>
     * </note>
     * <p>
     * You can provide your rule group specification in Suricata flat format through this setting when you create or
     * update your rule group. The call response returns a <a>RuleGroup</a> object that Network Firewall has populated
     * from your string.
     * </p>
     * 
     * @param rules
     *        A string containing stateful rule group rules specifications in Suricata flat format, with one rule per
     *        line. Use this to import your existing Suricata compatible rule groups. </p> <note>
     *        <p>
     *        You must provide either this rules setting or a populated <code>RuleGroup</code> setting, but not both.
     *        </p>
     *        </note>
     *        <p>
     *        You can provide your rule group specification in Suricata flat format through this setting when you create
     *        or update your rule group. The call response returns a <a>RuleGroup</a> object that Network Firewall has
     *        populated from your string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withRules(String rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @see RuleGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @return Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *         stateless rules. If it is stateful, it contains stateful rules.
     * @see RuleGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public CreateRuleGroupRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public CreateRuleGroupRequest withType(RuleGroupType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description of the rule group.
     * </p>
     * 
     * @param description
     *        A description of the rule group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the rule group.
     * </p>
     * 
     * @return A description of the rule group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the rule group.
     * </p>
     * 
     * @param description
     *        A description of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * <note>
     * <p>
     * You can't change or exceed this capacity when you update the rule group, so leave room for your rule group to
     * grow.
     * </p>
     * </note>
     * <p>
     * <b>Capacity for a stateless rule group</b>
     * </p>
     * <p>
     * For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules
     * that you expect to have in the rule group.
     * </p>
     * <p>
     * To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each of the
     * rule's match settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A match setting with no criteria specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * A match setting with <code>Any</code> specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other match settings have a value equal to the number of elements provided in the setting. For example, a
     * protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A protocol setting
     * ["UDP","TCP"] has a value of 2. A source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule with
     * protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a single
     * specification or no specification for each of the other match settings has a capacity requirement of 6.
     * </p>
     * <p>
     * <b>Capacity for a stateful rule group</b>
     * </p>
     * <p>
     * For a stateful rule group, the minimum capacity required is the number of individual rules that you expect to
     * have in the rule group.
     * </p>
     * 
     * @param capacity
     *        The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation.
     *        When you update a rule group, you are limited to this capacity. When you reference a rule group from a
     *        firewall policy, Network Firewall reserves this capacity for the rule group. </p>
     *        <p>
     *        You can retrieve the capacity that would be required for a rule group before you create the rule group by
     *        calling <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     *        </p>
     *        <note>
     *        <p>
     *        You can't change or exceed this capacity when you update the rule group, so leave room for your rule group
     *        to grow.
     *        </p>
     *        </note>
     *        <p>
     *        <b>Capacity for a stateless rule group</b>
     *        </p>
     *        <p>
     *        For a stateless rule group, the capacity required is the sum of the capacity requirements of the
     *        individual rules that you expect to have in the rule group.
     *        </p>
     *        <p>
     *        To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each
     *        of the rule's match settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A match setting with no criteria specified has a value of 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A match setting with <code>Any</code> specified has a value of 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All other match settings have a value equal to the number of elements provided in the setting. For
     *        example, a protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A
     *        protocol setting ["UDP","TCP"] has a value of 2. A source setting
     *        ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule
     *        with protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a
     *        single specification or no specification for each of the other match settings has a capacity requirement
     *        of 6.
     *        </p>
     *        <p>
     *        <b>Capacity for a stateful rule group</b>
     *        </p>
     *        <p>
     *        For a stateful rule group, the minimum capacity required is the number of individual rules that you expect
     *        to have in the rule group.
     */

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * <note>
     * <p>
     * You can't change or exceed this capacity when you update the rule group, so leave room for your rule group to
     * grow.
     * </p>
     * </note>
     * <p>
     * <b>Capacity for a stateless rule group</b>
     * </p>
     * <p>
     * For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules
     * that you expect to have in the rule group.
     * </p>
     * <p>
     * To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each of the
     * rule's match settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A match setting with no criteria specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * A match setting with <code>Any</code> specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other match settings have a value equal to the number of elements provided in the setting. For example, a
     * protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A protocol setting
     * ["UDP","TCP"] has a value of 2. A source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule with
     * protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a single
     * specification or no specification for each of the other match settings has a capacity requirement of 6.
     * </p>
     * <p>
     * <b>Capacity for a stateful rule group</b>
     * </p>
     * <p>
     * For a stateful rule group, the minimum capacity required is the number of individual rules that you expect to
     * have in the rule group.
     * </p>
     * 
     * @return The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation.
     *         When you update a rule group, you are limited to this capacity. When you reference a rule group from a
     *         firewall policy, Network Firewall reserves this capacity for the rule group. </p>
     *         <p>
     *         You can retrieve the capacity that would be required for a rule group before you create the rule group by
     *         calling <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     *         </p>
     *         <note>
     *         <p>
     *         You can't change or exceed this capacity when you update the rule group, so leave room for your rule
     *         group to grow.
     *         </p>
     *         </note>
     *         <p>
     *         <b>Capacity for a stateless rule group</b>
     *         </p>
     *         <p>
     *         For a stateless rule group, the capacity required is the sum of the capacity requirements of the
     *         individual rules that you expect to have in the rule group.
     *         </p>
     *         <p>
     *         To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each
     *         of the rule's match settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A match setting with no criteria specified has a value of 1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A match setting with <code>Any</code> specified has a value of 1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All other match settings have a value equal to the number of elements provided in the setting. For
     *         example, a protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A
     *         protocol setting ["UDP","TCP"] has a value of 2. A source setting
     *         ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule
     *         with protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a
     *         single specification or no specification for each of the other match settings has a capacity requirement
     *         of 6.
     *         </p>
     *         <p>
     *         <b>Capacity for a stateful rule group</b>
     *         </p>
     *         <p>
     *         For a stateful rule group, the minimum capacity required is the number of individual rules that you
     *         expect to have in the rule group.
     */

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * <note>
     * <p>
     * You can't change or exceed this capacity when you update the rule group, so leave room for your rule group to
     * grow.
     * </p>
     * </note>
     * <p>
     * <b>Capacity for a stateless rule group</b>
     * </p>
     * <p>
     * For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules
     * that you expect to have in the rule group.
     * </p>
     * <p>
     * To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each of the
     * rule's match settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A match setting with no criteria specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * A match setting with <code>Any</code> specified has a value of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other match settings have a value equal to the number of elements provided in the setting. For example, a
     * protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A protocol setting
     * ["UDP","TCP"] has a value of 2. A source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule with
     * protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a single
     * specification or no specification for each of the other match settings has a capacity requirement of 6.
     * </p>
     * <p>
     * <b>Capacity for a stateful rule group</b>
     * </p>
     * <p>
     * For a stateful rule group, the minimum capacity required is the number of individual rules that you expect to
     * have in the rule group.
     * </p>
     * 
     * @param capacity
     *        The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation.
     *        When you update a rule group, you are limited to this capacity. When you reference a rule group from a
     *        firewall policy, Network Firewall reserves this capacity for the rule group. </p>
     *        <p>
     *        You can retrieve the capacity that would be required for a rule group before you create the rule group by
     *        calling <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     *        </p>
     *        <note>
     *        <p>
     *        You can't change or exceed this capacity when you update the rule group, so leave room for your rule group
     *        to grow.
     *        </p>
     *        </note>
     *        <p>
     *        <b>Capacity for a stateless rule group</b>
     *        </p>
     *        <p>
     *        For a stateless rule group, the capacity required is the sum of the capacity requirements of the
     *        individual rules that you expect to have in the rule group.
     *        </p>
     *        <p>
     *        To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each
     *        of the rule's match settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A match setting with no criteria specified has a value of 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A match setting with <code>Any</code> specified has a value of 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All other match settings have a value equal to the number of elements provided in the setting. For
     *        example, a protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A
     *        protocol setting ["UDP","TCP"] has a value of 2. A source setting
     *        ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule
     *        with protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a
     *        single specification or no specification for each of the other match settings has a capacity requirement
     *        of 6.
     *        </p>
     *        <p>
     *        <b>Capacity for a stateful rule group</b>
     *        </p>
     *        <p>
     *        For a stateful rule group, the minimum capacity required is the number of individual rules that you expect
     *        to have in the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withCapacity(Integer capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @return The key:value pairs to associate with the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     *        request. </p>
     *        <p>
     *        If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     *        actually make the requested changes. The call returns the value that the request would return if you ran
     *        it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This
     *        option allows you to make sure that you have the required permissions to run the request and that your
     *        request parameters are valid.
     *        </p>
     *        <p>
     *        If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @return Indicates whether you want Network Firewall to just check the validity of the request, rather than run
     *         the request. </p>
     *         <p>
     *         If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but
     *         doesn't actually make the requested changes. The call returns the value that the request would return if
     *         you ran it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your
     *         resources. This option allows you to make sure that you have the required permissions to run the request
     *         and that your request parameters are valid.
     *         </p>
     *         <p>
     *         If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     *        request. </p>
     *        <p>
     *        If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     *        actually make the requested changes. The call returns the value that the request would return if you ran
     *        it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This
     *        option allows you to make sure that you have the required permissions to run the request and that your
     *        request parameters are valid.
     *        </p>
     *        <p>
     *        If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @return Indicates whether you want Network Firewall to just check the validity of the request, rather than run
     *         the request. </p>
     *         <p>
     *         If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but
     *         doesn't actually make the requested changes. The call returns the value that the request would return if
     *         you ran it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your
     *         resources. This option allows you to make sure that you have the required permissions to run the request
     *         and that your request parameters are valid.
     *         </p>
     *         <p>
     *         If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getRuleGroupName() != null)
            sb.append("RuleGroupName: ").append(getRuleGroupName()).append(",");
        if (getRuleGroup() != null)
            sb.append("RuleGroup: ").append(getRuleGroup()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleGroupRequest == false)
            return false;
        CreateRuleGroupRequest other = (CreateRuleGroupRequest) obj;
        if (other.getRuleGroupName() == null ^ this.getRuleGroupName() == null)
            return false;
        if (other.getRuleGroupName() != null && other.getRuleGroupName().equals(this.getRuleGroupName()) == false)
            return false;
        if (other.getRuleGroup() == null ^ this.getRuleGroup() == null)
            return false;
        if (other.getRuleGroup() != null && other.getRuleGroup().equals(this.getRuleGroup()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getRuleGroup() == null) ? 0 : getRuleGroup().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleGroupRequest clone() {
        return (CreateRuleGroupRequest) super.clone();
    }

}
