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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateRuleGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule
     * group. The token marks the state of the rule group resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to
     * ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails
     * with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group again to get a current copy
     * of it with a current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     */
    private String updateToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String ruleGroupArn;
    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
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
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
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
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule
     * group. The token marks the state of the rule group resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to
     * ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails
     * with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group again to get a current copy
     * of it with a current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *        rule group. The token marks the state of the rule group resource at the time of the request. </p>
     *        <p>
     *        To make changes to the rule group, you provide the token in your request. Network Firewall uses the token
     *        to ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation
     *        fails with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group again to get a
     *        current copy of it with a current token. Reapply your changes as needed, then try the operation again
     *        using the new token.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule
     * group. The token marks the state of the rule group resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to
     * ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails
     * with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group again to get a current copy
     * of it with a current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @return A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *         rule group. The token marks the state of the rule group resource at the time of the request. </p>
     *         <p>
     *         To make changes to the rule group, you provide the token in your request. Network Firewall uses the token
     *         to ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the
     *         operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group
     *         again to get a current copy of it with a current token. Reapply your changes as needed, then try the
     *         operation again using the new token.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule
     * group. The token marks the state of the rule group resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to
     * ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails
     * with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group again to get a current copy
     * of it with a current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *        rule group. The token marks the state of the rule group resource at the time of the request. </p>
     *        <p>
     *        To make changes to the rule group, you provide the token in your request. Network Firewall uses the token
     *        to ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation
     *        fails with an <code>InvalidTokenException</code>. If this happens, retrieve the rule group again to get a
     *        current copy of it with a current token. Reapply your changes as needed, then try the operation again
     *        using the new token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleGroupRequest withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupArn
     *        The Amazon Resource Name (ARN) of the rule group.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule group.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupArn
     *        The Amazon Resource Name (ARN) of the rule group.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleGroupRequest withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the rule group. You can't change the name of a rule group after you create
     *         it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleGroupRequest withRuleGroupName(String ruleGroupName) {
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

    public UpdateRuleGroupRequest withRuleGroup(RuleGroup ruleGroup) {
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

    public UpdateRuleGroupRequest withRules(String rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *        <p>
     *        This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *        </p>
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
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @return Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *         stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *         <p>
     *         This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *         </p>
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
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *        <p>
     *        This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public UpdateRuleGroupRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *        <p>
     *        This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public UpdateRuleGroupRequest withType(RuleGroupType type) {
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

    public UpdateRuleGroupRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateRuleGroupRequest withDryRun(Boolean dryRun) {
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
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken()).append(",");
        if (getRuleGroupArn() != null)
            sb.append("RuleGroupArn: ").append(getRuleGroupArn()).append(",");
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

        if (obj instanceof UpdateRuleGroupRequest == false)
            return false;
        UpdateRuleGroupRequest other = (UpdateRuleGroupRequest) obj;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getRuleGroup() == null) ? 0 : getRuleGroup().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleGroupRequest clone() {
        return (UpdateRuleGroupRequest) super.clone();
    }

}
