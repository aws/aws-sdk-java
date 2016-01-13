/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * An AWS Lambda function that evaluates configuration items to assess whether
 * your AWS resources comply with your desired configurations. This function can
 * run when AWS Config detects a configuration change or delivers a
 * configuration snapshot. This function can evaluate any resource in the
 * recording group. To define which of these are evaluated, specify a value for
 * the <code>Scope</code> key.
 * </p>
 * <p>
 * For more information about developing and using AWS Config rules, see <a
 * href=
 * "http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html"
 * >Evaluating AWS Resource Configurations with AWS Config</a> in the <i>AWS
 * Config Developer Guide</i>.
 * </p>
 */
public class ConfigRule implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if
     * you are adding a new rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     */
    private String configRuleArn;
    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     */
    private String configRuleId;
    /**
     * <p>
     * The description that you provide for the AWS Config rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and value,
     * or a combination of one resource type and one or more resource IDs.
     * Specify a scope to constrain the resources that are evaluated. If you do
     * not specify a scope, the AWS Config Rule evaluates all resources in the
     * recording group.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the
     * events that cause the function to evaluate your AWS resources.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * </p>
     */
    private String inputParameters;
    /**
     * <p>
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * </p>
     * <p>
     * If your rule is periodic, meaning it runs an evaluation when AWS Config
     * delivers a configuration snapshot, then it cannot run evaluations more
     * frequently than AWS Config delivers the snapshots. For periodic rules,
     * set the value of the <code>MaximumExecutionFrequency</code> key to be
     * equal to or greater than the value of the <code>deliveryFrequency</code>
     * key, which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     * update the frequency with which AWS Config delivers your snapshots, use
     * the <code>PutDeliveryChannel</code> action.
     * </p>
     */
    private String maximumExecutionFrequency;
    /**
     * <p>
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> temporarily
     * after you use the <code>DeleteConfigRule</code> request to delete the
     * rule. After AWS Config finishes deleting a rule, the rule and all of its
     * evaluations are erased and no longer available.
     * </p>
     * <p>
     * You cannot add a rule to AWS Config that has the state set to
     * <code>DELETING</code>. If you want to delete a rule, you must use the
     * <code>DeleteConfigRule</code> request.
     * </p>
     */
    private String configRuleState;

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if
     * you are adding a new rule.
     * </p>
     * 
     * @param configRuleName
     *        The name that you assign to the AWS Config rule. The name is
     *        required if you are adding a new rule.
     */
    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if
     * you are adding a new rule.
     * </p>
     * 
     * @return The name that you assign to the AWS Config rule. The name is
     *         required if you are adding a new rule.
     */
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if
     * you are adding a new rule.
     * </p>
     * 
     * @param configRuleName
     *        The name that you assign to the AWS Config rule. The name is
     *        required if you are adding a new rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     * 
     * @param configRuleArn
     *        The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    public void setConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    public String getConfigRuleArn() {
        return this.configRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     * 
     * @param configRuleArn
     *        The Amazon Resource Name (ARN) of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withConfigRuleArn(String configRuleArn) {
        setConfigRuleArn(configRuleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     * 
     * @param configRuleId
     *        The ID of the AWS Config rule.
     */
    public void setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
    }

    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     * 
     * @return The ID of the AWS Config rule.
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     * 
     * @param configRuleId
     *        The ID of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withConfigRuleId(String configRuleId) {
        setConfigRuleId(configRuleId);
        return this;
    }

    /**
     * <p>
     * The description that you provide for the AWS Config rule.
     * </p>
     * 
     * @param description
     *        The description that you provide for the AWS Config rule.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you provide for the AWS Config rule.
     * </p>
     * 
     * @return The description that you provide for the AWS Config rule.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description that you provide for the AWS Config rule.
     * </p>
     * 
     * @param description
     *        The description that you provide for the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and value,
     * or a combination of one resource type and one or more resource IDs.
     * Specify a scope to constrain the resources that are evaluated. If you do
     * not specify a scope, the AWS Config Rule evaluates all resources in the
     * recording group.
     * </p>
     * 
     * @param scope
     *        Defines which resources the AWS Config rule evaluates. The scope
     *        can include one or more resource types, a combination of a tag key
     *        and value, or a combination of one resource type and one or more
     *        resource IDs. Specify a scope to constrain the resources that are
     *        evaluated. If you do not specify a scope, the AWS Config Rule
     *        evaluates all resources in the recording group.
     */
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and value,
     * or a combination of one resource type and one or more resource IDs.
     * Specify a scope to constrain the resources that are evaluated. If you do
     * not specify a scope, the AWS Config Rule evaluates all resources in the
     * recording group.
     * </p>
     * 
     * @return Defines which resources the AWS Config rule evaluates. The scope
     *         can include one or more resource types, a combination of a tag
     *         key and value, or a combination of one resource type and one or
     *         more resource IDs. Specify a scope to constrain the resources
     *         that are evaluated. If you do not specify a scope, the AWS Config
     *         Rule evaluates all resources in the recording group.
     */
    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and value,
     * or a combination of one resource type and one or more resource IDs.
     * Specify a scope to constrain the resources that are evaluated. If you do
     * not specify a scope, the AWS Config Rule evaluates all resources in the
     * recording group.
     * </p>
     * 
     * @param scope
     *        Defines which resources the AWS Config rule evaluates. The scope
     *        can include one or more resource types, a combination of a tag key
     *        and value, or a combination of one resource type and one or more
     *        resource IDs. Specify a scope to constrain the resources that are
     *        evaluated. If you do not specify a scope, the AWS Config Rule
     *        evaluates all resources in the recording group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the
     * events that cause the function to evaluate your AWS resources.
     * </p>
     * 
     * @param source
     *        Provides the rule owner (AWS or customer), the rule identifier,
     *        and the events that cause the function to evaluate your AWS
     *        resources.
     */
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the
     * events that cause the function to evaluate your AWS resources.
     * </p>
     * 
     * @return Provides the rule owner (AWS or customer), the rule identifier,
     *         and the events that cause the function to evaluate your AWS
     *         resources.
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the
     * events that cause the function to evaluate your AWS resources.
     * </p>
     * 
     * @param source
     *        Provides the rule owner (AWS or customer), the rule identifier,
     *        and the events that cause the function to evaluate your AWS
     *        resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * </p>
     * 
     * @param inputParameters
     *        A string in JSON format that is passed to the AWS Config rule
     *        Lambda function.
     */
    public void setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
    }

    /**
     * <p>
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * </p>
     * 
     * @return A string in JSON format that is passed to the AWS Config rule
     *         Lambda function.
     */
    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * <p>
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * </p>
     * 
     * @param inputParameters
     *        A string in JSON format that is passed to the AWS Config rule
     *        Lambda function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ConfigRule withInputParameters(String inputParameters) {
        setInputParameters(inputParameters);
        return this;
    }

    /**
     * <p>
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * </p>
     * <p>
     * If your rule is periodic, meaning it runs an evaluation when AWS Config
     * delivers a configuration snapshot, then it cannot run evaluations more
     * frequently than AWS Config delivers the snapshots. For periodic rules,
     * set the value of the <code>MaximumExecutionFrequency</code> key to be
     * equal to or greater than the value of the <code>deliveryFrequency</code>
     * key, which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     * update the frequency with which AWS Config delivers your snapshots, use
     * the <code>PutDeliveryChannel</code> action.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency at which the AWS Config rule runs
     *        evaluations.</p>
     *        <p>
     *        If your rule is periodic, meaning it runs an evaluation when AWS
     *        Config delivers a configuration snapshot, then it cannot run
     *        evaluations more frequently than AWS Config delivers the
     *        snapshots. For periodic rules, set the value of the
     *        <code>MaximumExecutionFrequency</code> key to be equal to or
     *        greater than the value of the <code>deliveryFrequency</code> key,
     *        which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     *        update the frequency with which AWS Config delivers your
     *        snapshots, use the <code>PutDeliveryChannel</code> action.
     * @see MaximumExecutionFrequency
     */
    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * </p>
     * <p>
     * If your rule is periodic, meaning it runs an evaluation when AWS Config
     * delivers a configuration snapshot, then it cannot run evaluations more
     * frequently than AWS Config delivers the snapshots. For periodic rules,
     * set the value of the <code>MaximumExecutionFrequency</code> key to be
     * equal to or greater than the value of the <code>deliveryFrequency</code>
     * key, which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     * update the frequency with which AWS Config delivers your snapshots, use
     * the <code>PutDeliveryChannel</code> action.
     * </p>
     * 
     * @return The maximum frequency at which the AWS Config rule runs
     *         evaluations.</p>
     *         <p>
     *         If your rule is periodic, meaning it runs an evaluation when AWS
     *         Config delivers a configuration snapshot, then it cannot run
     *         evaluations more frequently than AWS Config delivers the
     *         snapshots. For periodic rules, set the value of the
     *         <code>MaximumExecutionFrequency</code> key to be equal to or
     *         greater than the value of the <code>deliveryFrequency</code> key,
     *         which is part of <code>ConfigSnapshotDeliveryProperties</code>.
     *         To update the frequency with which AWS Config delivers your
     *         snapshots, use the <code>PutDeliveryChannel</code> action.
     * @see MaximumExecutionFrequency
     */
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * </p>
     * <p>
     * If your rule is periodic, meaning it runs an evaluation when AWS Config
     * delivers a configuration snapshot, then it cannot run evaluations more
     * frequently than AWS Config delivers the snapshots. For periodic rules,
     * set the value of the <code>MaximumExecutionFrequency</code> key to be
     * equal to or greater than the value of the <code>deliveryFrequency</code>
     * key, which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     * update the frequency with which AWS Config delivers your snapshots, use
     * the <code>PutDeliveryChannel</code> action.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency at which the AWS Config rule runs
     *        evaluations.</p>
     *        <p>
     *        If your rule is periodic, meaning it runs an evaluation when AWS
     *        Config delivers a configuration snapshot, then it cannot run
     *        evaluations more frequently than AWS Config delivers the
     *        snapshots. For periodic rules, set the value of the
     *        <code>MaximumExecutionFrequency</code> key to be equal to or
     *        greater than the value of the <code>deliveryFrequency</code> key,
     *        which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     *        update the frequency with which AWS Config delivers your
     *        snapshots, use the <code>PutDeliveryChannel</code> action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MaximumExecutionFrequency
     */
    public ConfigRule withMaximumExecutionFrequency(
            String maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * <p>
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * </p>
     * <p>
     * If your rule is periodic, meaning it runs an evaluation when AWS Config
     * delivers a configuration snapshot, then it cannot run evaluations more
     * frequently than AWS Config delivers the snapshots. For periodic rules,
     * set the value of the <code>MaximumExecutionFrequency</code> key to be
     * equal to or greater than the value of the <code>deliveryFrequency</code>
     * key, which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     * update the frequency with which AWS Config delivers your snapshots, use
     * the <code>PutDeliveryChannel</code> action.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency at which the AWS Config rule runs
     *        evaluations.</p>
     *        <p>
     *        If your rule is periodic, meaning it runs an evaluation when AWS
     *        Config delivers a configuration snapshot, then it cannot run
     *        evaluations more frequently than AWS Config delivers the
     *        snapshots. For periodic rules, set the value of the
     *        <code>MaximumExecutionFrequency</code> key to be equal to or
     *        greater than the value of the <code>deliveryFrequency</code> key,
     *        which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     *        update the frequency with which AWS Config delivers your
     *        snapshots, use the <code>PutDeliveryChannel</code> action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MaximumExecutionFrequency
     */
    public void setMaximumExecutionFrequency(
            MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
    }

    /**
     * <p>
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * </p>
     * <p>
     * If your rule is periodic, meaning it runs an evaluation when AWS Config
     * delivers a configuration snapshot, then it cannot run evaluations more
     * frequently than AWS Config delivers the snapshots. For periodic rules,
     * set the value of the <code>MaximumExecutionFrequency</code> key to be
     * equal to or greater than the value of the <code>deliveryFrequency</code>
     * key, which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     * update the frequency with which AWS Config delivers your snapshots, use
     * the <code>PutDeliveryChannel</code> action.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency at which the AWS Config rule runs
     *        evaluations.</p>
     *        <p>
     *        If your rule is periodic, meaning it runs an evaluation when AWS
     *        Config delivers a configuration snapshot, then it cannot run
     *        evaluations more frequently than AWS Config delivers the
     *        snapshots. For periodic rules, set the value of the
     *        <code>MaximumExecutionFrequency</code> key to be equal to or
     *        greater than the value of the <code>deliveryFrequency</code> key,
     *        which is part of <code>ConfigSnapshotDeliveryProperties</code>. To
     *        update the frequency with which AWS Config delivers your
     *        snapshots, use the <code>PutDeliveryChannel</code> action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MaximumExecutionFrequency
     */
    public ConfigRule withMaximumExecutionFrequency(
            MaximumExecutionFrequency maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> temporarily
     * after you use the <code>DeleteConfigRule</code> request to delete the
     * rule. After AWS Config finishes deleting a rule, the rule and all of its
     * evaluations are erased and no longer available.
     * </p>
     * <p>
     * You cannot add a rule to AWS Config that has the state set to
     * <code>DELETING</code>. If you want to delete a rule, you must use the
     * <code>DeleteConfigRule</code> request.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or currently being
     *        deleted by AWS Config.</p>
     *        <p>
     *        AWS Config sets the state of a rule to <code>DELETING</code>
     *        temporarily after you use the <code>DeleteConfigRule</code>
     *        request to delete the rule. After AWS Config finishes deleting a
     *        rule, the rule and all of its evaluations are erased and no longer
     *        available.
     *        </p>
     *        <p>
     *        You cannot add a rule to AWS Config that has the state set to
     *        <code>DELETING</code>. If you want to delete a rule, you must use
     *        the <code>DeleteConfigRule</code> request.
     * @see ConfigRuleState
     */
    public void setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> temporarily
     * after you use the <code>DeleteConfigRule</code> request to delete the
     * rule. After AWS Config finishes deleting a rule, the rule and all of its
     * evaluations are erased and no longer available.
     * </p>
     * <p>
     * You cannot add a rule to AWS Config that has the state set to
     * <code>DELETING</code>. If you want to delete a rule, you must use the
     * <code>DeleteConfigRule</code> request.
     * </p>
     * 
     * @return Indicates whether the AWS Config rule is active or currently
     *         being deleted by AWS Config.</p>
     *         <p>
     *         AWS Config sets the state of a rule to <code>DELETING</code>
     *         temporarily after you use the <code>DeleteConfigRule</code>
     *         request to delete the rule. After AWS Config finishes deleting a
     *         rule, the rule and all of its evaluations are erased and no
     *         longer available.
     *         </p>
     *         <p>
     *         You cannot add a rule to AWS Config that has the state set to
     *         <code>DELETING</code>. If you want to delete a rule, you must use
     *         the <code>DeleteConfigRule</code> request.
     * @see ConfigRuleState
     */
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> temporarily
     * after you use the <code>DeleteConfigRule</code> request to delete the
     * rule. After AWS Config finishes deleting a rule, the rule and all of its
     * evaluations are erased and no longer available.
     * </p>
     * <p>
     * You cannot add a rule to AWS Config that has the state set to
     * <code>DELETING</code>. If you want to delete a rule, you must use the
     * <code>DeleteConfigRule</code> request.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or currently being
     *        deleted by AWS Config.</p>
     *        <p>
     *        AWS Config sets the state of a rule to <code>DELETING</code>
     *        temporarily after you use the <code>DeleteConfigRule</code>
     *        request to delete the rule. After AWS Config finishes deleting a
     *        rule, the rule and all of its evaluations are erased and no longer
     *        available.
     *        </p>
     *        <p>
     *        You cannot add a rule to AWS Config that has the state set to
     *        <code>DELETING</code>. If you want to delete a rule, you must use
     *        the <code>DeleteConfigRule</code> request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ConfigRuleState
     */
    public ConfigRule withConfigRuleState(String configRuleState) {
        setConfigRuleState(configRuleState);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> temporarily
     * after you use the <code>DeleteConfigRule</code> request to delete the
     * rule. After AWS Config finishes deleting a rule, the rule and all of its
     * evaluations are erased and no longer available.
     * </p>
     * <p>
     * You cannot add a rule to AWS Config that has the state set to
     * <code>DELETING</code>. If you want to delete a rule, you must use the
     * <code>DeleteConfigRule</code> request.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or currently being
     *        deleted by AWS Config.</p>
     *        <p>
     *        AWS Config sets the state of a rule to <code>DELETING</code>
     *        temporarily after you use the <code>DeleteConfigRule</code>
     *        request to delete the rule. After AWS Config finishes deleting a
     *        rule, the rule and all of its evaluations are erased and no longer
     *        available.
     *        </p>
     *        <p>
     *        You cannot add a rule to AWS Config that has the state set to
     *        <code>DELETING</code>. If you want to delete a rule, you must use
     *        the <code>DeleteConfigRule</code> request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ConfigRuleState
     */
    public void setConfigRuleState(ConfigRuleState configRuleState) {
        this.configRuleState = configRuleState.toString();
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> temporarily
     * after you use the <code>DeleteConfigRule</code> request to delete the
     * rule. After AWS Config finishes deleting a rule, the rule and all of its
     * evaluations are erased and no longer available.
     * </p>
     * <p>
     * You cannot add a rule to AWS Config that has the state set to
     * <code>DELETING</code>. If you want to delete a rule, you must use the
     * <code>DeleteConfigRule</code> request.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or currently being
     *        deleted by AWS Config.</p>
     *        <p>
     *        AWS Config sets the state of a rule to <code>DELETING</code>
     *        temporarily after you use the <code>DeleteConfigRule</code>
     *        request to delete the rule. After AWS Config finishes deleting a
     *        rule, the rule and all of its evaluations are erased and no longer
     *        available.
     *        </p>
     *        <p>
     *        You cannot add a rule to AWS Config that has the state set to
     *        <code>DELETING</code>. If you want to delete a rule, you must use
     *        the <code>DeleteConfigRule</code> request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ConfigRuleState
     */
    public ConfigRule withConfigRuleState(ConfigRuleState configRuleState) {
        setConfigRuleState(configRuleState);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: " + getConfigRuleName() + ",");
        if (getConfigRuleArn() != null)
            sb.append("ConfigRuleArn: " + getConfigRuleArn() + ",");
        if (getConfigRuleId() != null)
            sb.append("ConfigRuleId: " + getConfigRuleId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getScope() != null)
            sb.append("Scope: " + getScope() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getInputParameters() != null)
            sb.append("InputParameters: " + getInputParameters() + ",");
        if (getMaximumExecutionFrequency() != null)
            sb.append("MaximumExecutionFrequency: "
                    + getMaximumExecutionFrequency() + ",");
        if (getConfigRuleState() != null)
            sb.append("ConfigRuleState: " + getConfigRuleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigRule == false)
            return false;
        ConfigRule other = (ConfigRule) obj;
        if (other.getConfigRuleName() == null
                ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null
                && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getConfigRuleArn() == null ^ this.getConfigRuleArn() == null)
            return false;
        if (other.getConfigRuleArn() != null
                && other.getConfigRuleArn().equals(this.getConfigRuleArn()) == false)
            return false;
        if (other.getConfigRuleId() == null ^ this.getConfigRuleId() == null)
            return false;
        if (other.getConfigRuleId() != null
                && other.getConfigRuleId().equals(this.getConfigRuleId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null
                && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null
                && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getInputParameters() == null
                ^ this.getInputParameters() == null)
            return false;
        if (other.getInputParameters() != null
                && other.getInputParameters().equals(this.getInputParameters()) == false)
            return false;
        if (other.getMaximumExecutionFrequency() == null
                ^ this.getMaximumExecutionFrequency() == null)
            return false;
        if (other.getMaximumExecutionFrequency() != null
                && other.getMaximumExecutionFrequency().equals(
                        this.getMaximumExecutionFrequency()) == false)
            return false;
        if (other.getConfigRuleState() == null
                ^ this.getConfigRuleState() == null)
            return false;
        if (other.getConfigRuleState() != null
                && other.getConfigRuleState().equals(this.getConfigRuleState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConfigRuleName() == null) ? 0 : getConfigRuleName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigRuleArn() == null) ? 0 : getConfigRuleArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigRuleId() == null) ? 0 : getConfigRuleId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode
                + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputParameters() == null) ? 0 : getInputParameters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumExecutionFrequency() == null) ? 0
                        : getMaximumExecutionFrequency().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigRuleState() == null) ? 0 : getConfigRuleState()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ConfigRule clone() {
        try {
            return (ConfigRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}