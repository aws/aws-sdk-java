/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An AWS Lambda function that evaluates configuration items to assess
 * whether your AWS resources comply with your desired configurations.
 * This function can run when AWS Config detects a configuration change
 * or delivers a configuration snapshot. This function can evaluate any
 * resource in the recording group. To define which of these are
 * evaluated, specify a value for the <code>Scope</code> key.
 * </p>
 * <p>
 * For more information about developing and using AWS Config rules, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html"> Evaluating AWS Resource Configurations with AWS Config </a>
 * in the <i>AWS Config Developer Guide</i> .
 * </p>
 */
public class ConfigRule implements Serializable, Cloneable {

    /**
     * The name that you assign to the AWS Config rule. The name is required
     * if you are adding a new rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configRuleName;

    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    private String configRuleArn;

    /**
     * The ID of the AWS Config rule.
     */
    private String configRuleId;

    /**
     * The description that you provide for the AWS Config rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and
     * value, or a combination of one resource type and one or more resource
     * IDs. Specify a scope to constrain the resources that are evaluated. If
     * you do not specify a scope, the AWS Config Rule evaluates all
     * resources in the recording group.
     */
    private Scope scope;

    /**
     * Provides the rule owner (AWS or customer), the rule identifier, and
     * the events that cause the function to evaluate your AWS resources.
     */
    private Source source;

    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String inputParameters;

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * <p>If your rule is periodic, meaning it runs an evaluation when AWS
     * Config delivers a configuration snapshot, then it cannot run
     * evaluations more frequently than AWS Config delivers the snapshots.
     * For periodic rules, set the value of the
     * <code>MaximumExecutionFrequency</code> key to be equal to or greater
     * than the value of the <code>deliveryFrequency</code> key, which is
     * part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     * frequency with which AWS Config delivers your snapshots, use the
     * <code>PutDeliveryChannel</code> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     */
    private String maximumExecutionFrequency;

    /**
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config. <p>AWS Config sets the state of a rule to
     * <code>DELETING</code> temporarily after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS
     * Config finishes deleting a rule, the rule and all of its evaluations
     * are erased and no longer available. <p>You cannot add a rule to AWS
     * Config that has the state set to <code>DELETING</code>. If you want to
     * delete a rule, you must use the <code>DeleteConfigRule</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETING
     */
    private String configRuleState;

    /**
     * The name that you assign to the AWS Config rule. The name is required
     * if you are adding a new rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name that you assign to the AWS Config rule. The name is required
     *         if you are adding a new rule.
     */
    public String getConfigRuleName() {
        return configRuleName;
    }
    
    /**
     * The name that you assign to the AWS Config rule. The name is required
     * if you are adding a new rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name that you assign to the AWS Config rule. The name is required
     *         if you are adding a new rule.
     */
    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }
    
    /**
     * The name that you assign to the AWS Config rule. The name is required
     * if you are adding a new rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name that you assign to the AWS Config rule. The name is required
     *         if you are adding a new rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     *
     * @return The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    public String getConfigRuleArn() {
        return configRuleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     *
     * @param configRuleArn The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    public void setConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRuleArn The Amazon Resource Name (ARN) of the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
        return this;
    }

    /**
     * The ID of the AWS Config rule.
     *
     * @return The ID of the AWS Config rule.
     */
    public String getConfigRuleId() {
        return configRuleId;
    }
    
    /**
     * The ID of the AWS Config rule.
     *
     * @param configRuleId The ID of the AWS Config rule.
     */
    public void setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
    }
    
    /**
     * The ID of the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRuleId The ID of the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }

    /**
     * The description that you provide for the AWS Config rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The description that you provide for the AWS Config rule.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description that you provide for the AWS Config rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description The description that you provide for the AWS Config rule.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description that you provide for the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description The description that you provide for the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and
     * value, or a combination of one resource type and one or more resource
     * IDs. Specify a scope to constrain the resources that are evaluated. If
     * you do not specify a scope, the AWS Config Rule evaluates all
     * resources in the recording group.
     *
     * @return Defines which resources the AWS Config rule evaluates. The scope can
     *         include one or more resource types, a combination of a tag key and
     *         value, or a combination of one resource type and one or more resource
     *         IDs. Specify a scope to constrain the resources that are evaluated. If
     *         you do not specify a scope, the AWS Config Rule evaluates all
     *         resources in the recording group.
     */
    public Scope getScope() {
        return scope;
    }
    
    /**
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and
     * value, or a combination of one resource type and one or more resource
     * IDs. Specify a scope to constrain the resources that are evaluated. If
     * you do not specify a scope, the AWS Config Rule evaluates all
     * resources in the recording group.
     *
     * @param scope Defines which resources the AWS Config rule evaluates. The scope can
     *         include one or more resource types, a combination of a tag key and
     *         value, or a combination of one resource type and one or more resource
     *         IDs. Specify a scope to constrain the resources that are evaluated. If
     *         you do not specify a scope, the AWS Config Rule evaluates all
     *         resources in the recording group.
     */
    public void setScope(Scope scope) {
        this.scope = scope;
    }
    
    /**
     * Defines which resources the AWS Config rule evaluates. The scope can
     * include one or more resource types, a combination of a tag key and
     * value, or a combination of one resource type and one or more resource
     * IDs. Specify a scope to constrain the resources that are evaluated. If
     * you do not specify a scope, the AWS Config Rule evaluates all
     * resources in the recording group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scope Defines which resources the AWS Config rule evaluates. The scope can
     *         include one or more resource types, a combination of a tag key and
     *         value, or a combination of one resource type and one or more resource
     *         IDs. Specify a scope to constrain the resources that are evaluated. If
     *         you do not specify a scope, the AWS Config Rule evaluates all
     *         resources in the recording group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withScope(Scope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Provides the rule owner (AWS or customer), the rule identifier, and
     * the events that cause the function to evaluate your AWS resources.
     *
     * @return Provides the rule owner (AWS or customer), the rule identifier, and
     *         the events that cause the function to evaluate your AWS resources.
     */
    public Source getSource() {
        return source;
    }
    
    /**
     * Provides the rule owner (AWS or customer), the rule identifier, and
     * the events that cause the function to evaluate your AWS resources.
     *
     * @param source Provides the rule owner (AWS or customer), the rule identifier, and
     *         the events that cause the function to evaluate your AWS resources.
     */
    public void setSource(Source source) {
        this.source = source;
    }
    
    /**
     * Provides the rule owner (AWS or customer), the rule identifier, and
     * the events that cause the function to evaluate your AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source Provides the rule owner (AWS or customer), the rule identifier, and
     *         the events that cause the function to evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return A string in JSON format that is passed to the AWS Config rule Lambda
     *         function.
     */
    public String getInputParameters() {
        return inputParameters;
    }
    
    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param inputParameters A string in JSON format that is passed to the AWS Config rule Lambda
     *         function.
     */
    public void setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
    }
    
    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda
     * function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param inputParameters A string in JSON format that is passed to the AWS Config rule Lambda
     *         function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRule withInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * <p>If your rule is periodic, meaning it runs an evaluation when AWS
     * Config delivers a configuration snapshot, then it cannot run
     * evaluations more frequently than AWS Config delivers the snapshots.
     * For periodic rules, set the value of the
     * <code>MaximumExecutionFrequency</code> key to be equal to or greater
     * than the value of the <code>deliveryFrequency</code> key, which is
     * part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     * frequency with which AWS Config delivers your snapshots, use the
     * <code>PutDeliveryChannel</code> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @return The maximum frequency at which the AWS Config rule runs evaluations.
     *         <p>If your rule is periodic, meaning it runs an evaluation when AWS
     *         Config delivers a configuration snapshot, then it cannot run
     *         evaluations more frequently than AWS Config delivers the snapshots.
     *         For periodic rules, set the value of the
     *         <code>MaximumExecutionFrequency</code> key to be equal to or greater
     *         than the value of the <code>deliveryFrequency</code> key, which is
     *         part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     *         frequency with which AWS Config delivers your snapshots, use the
     *         <code>PutDeliveryChannel</code> action.
     *
     * @see MaximumExecutionFrequency
     */
    public String getMaximumExecutionFrequency() {
        return maximumExecutionFrequency;
    }
    
    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * <p>If your rule is periodic, meaning it runs an evaluation when AWS
     * Config delivers a configuration snapshot, then it cannot run
     * evaluations more frequently than AWS Config delivers the snapshots.
     * For periodic rules, set the value of the
     * <code>MaximumExecutionFrequency</code> key to be equal to or greater
     * than the value of the <code>deliveryFrequency</code> key, which is
     * part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     * frequency with which AWS Config delivers your snapshots, use the
     * <code>PutDeliveryChannel</code> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs evaluations.
     *         <p>If your rule is periodic, meaning it runs an evaluation when AWS
     *         Config delivers a configuration snapshot, then it cannot run
     *         evaluations more frequently than AWS Config delivers the snapshots.
     *         For periodic rules, set the value of the
     *         <code>MaximumExecutionFrequency</code> key to be equal to or greater
     *         than the value of the <code>deliveryFrequency</code> key, which is
     *         part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     *         frequency with which AWS Config delivers your snapshots, use the
     *         <code>PutDeliveryChannel</code> action.
     *
     * @see MaximumExecutionFrequency
     */
    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }
    
    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * <p>If your rule is periodic, meaning it runs an evaluation when AWS
     * Config delivers a configuration snapshot, then it cannot run
     * evaluations more frequently than AWS Config delivers the snapshots.
     * For periodic rules, set the value of the
     * <code>MaximumExecutionFrequency</code> key to be equal to or greater
     * than the value of the <code>deliveryFrequency</code> key, which is
     * part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     * frequency with which AWS Config delivers your snapshots, use the
     * <code>PutDeliveryChannel</code> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs evaluations.
     *         <p>If your rule is periodic, meaning it runs an evaluation when AWS
     *         Config delivers a configuration snapshot, then it cannot run
     *         evaluations more frequently than AWS Config delivers the snapshots.
     *         For periodic rules, set the value of the
     *         <code>MaximumExecutionFrequency</code> key to be equal to or greater
     *         than the value of the <code>deliveryFrequency</code> key, which is
     *         part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     *         frequency with which AWS Config delivers your snapshots, use the
     *         <code>PutDeliveryChannel</code> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MaximumExecutionFrequency
     */
    public ConfigRule withMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * <p>If your rule is periodic, meaning it runs an evaluation when AWS
     * Config delivers a configuration snapshot, then it cannot run
     * evaluations more frequently than AWS Config delivers the snapshots.
     * For periodic rules, set the value of the
     * <code>MaximumExecutionFrequency</code> key to be equal to or greater
     * than the value of the <code>deliveryFrequency</code> key, which is
     * part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     * frequency with which AWS Config delivers your snapshots, use the
     * <code>PutDeliveryChannel</code> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs evaluations.
     *         <p>If your rule is periodic, meaning it runs an evaluation when AWS
     *         Config delivers a configuration snapshot, then it cannot run
     *         evaluations more frequently than AWS Config delivers the snapshots.
     *         For periodic rules, set the value of the
     *         <code>MaximumExecutionFrequency</code> key to be equal to or greater
     *         than the value of the <code>deliveryFrequency</code> key, which is
     *         part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     *         frequency with which AWS Config delivers your snapshots, use the
     *         <code>PutDeliveryChannel</code> action.
     *
     * @see MaximumExecutionFrequency
     */
    public void setMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
    }
    
    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     * <p>If your rule is periodic, meaning it runs an evaluation when AWS
     * Config delivers a configuration snapshot, then it cannot run
     * evaluations more frequently than AWS Config delivers the snapshots.
     * For periodic rules, set the value of the
     * <code>MaximumExecutionFrequency</code> key to be equal to or greater
     * than the value of the <code>deliveryFrequency</code> key, which is
     * part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     * frequency with which AWS Config delivers your snapshots, use the
     * <code>PutDeliveryChannel</code> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs evaluations.
     *         <p>If your rule is periodic, meaning it runs an evaluation when AWS
     *         Config delivers a configuration snapshot, then it cannot run
     *         evaluations more frequently than AWS Config delivers the snapshots.
     *         For periodic rules, set the value of the
     *         <code>MaximumExecutionFrequency</code> key to be equal to or greater
     *         than the value of the <code>deliveryFrequency</code> key, which is
     *         part of <code>ConfigSnapshotDeliveryProperties</code>. To update the
     *         frequency with which AWS Config delivers your snapshots, use the
     *         <code>PutDeliveryChannel</code> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MaximumExecutionFrequency
     */
    public ConfigRule withMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
        return this;
    }

    /**
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config. <p>AWS Config sets the state of a rule to
     * <code>DELETING</code> temporarily after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS
     * Config finishes deleting a rule, the rule and all of its evaluations
     * are erased and no longer available. <p>You cannot add a rule to AWS
     * Config that has the state set to <code>DELETING</code>. If you want to
     * delete a rule, you must use the <code>DeleteConfigRule</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETING
     *
     * @return Indicates whether the AWS Config rule is active or currently being
     *         deleted by AWS Config. <p>AWS Config sets the state of a rule to
     *         <code>DELETING</code> temporarily after you use the
     *         <code>DeleteConfigRule</code> request to delete the rule. After AWS
     *         Config finishes deleting a rule, the rule and all of its evaluations
     *         are erased and no longer available. <p>You cannot add a rule to AWS
     *         Config that has the state set to <code>DELETING</code>. If you want to
     *         delete a rule, you must use the <code>DeleteConfigRule</code> request.
     *
     * @see ConfigRuleState
     */
    public String getConfigRuleState() {
        return configRuleState;
    }
    
    /**
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config. <p>AWS Config sets the state of a rule to
     * <code>DELETING</code> temporarily after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS
     * Config finishes deleting a rule, the rule and all of its evaluations
     * are erased and no longer available. <p>You cannot add a rule to AWS
     * Config that has the state set to <code>DELETING</code>. If you want to
     * delete a rule, you must use the <code>DeleteConfigRule</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETING
     *
     * @param configRuleState Indicates whether the AWS Config rule is active or currently being
     *         deleted by AWS Config. <p>AWS Config sets the state of a rule to
     *         <code>DELETING</code> temporarily after you use the
     *         <code>DeleteConfigRule</code> request to delete the rule. After AWS
     *         Config finishes deleting a rule, the rule and all of its evaluations
     *         are erased and no longer available. <p>You cannot add a rule to AWS
     *         Config that has the state set to <code>DELETING</code>. If you want to
     *         delete a rule, you must use the <code>DeleteConfigRule</code> request.
     *
     * @see ConfigRuleState
     */
    public void setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
    }
    
    /**
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config. <p>AWS Config sets the state of a rule to
     * <code>DELETING</code> temporarily after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS
     * Config finishes deleting a rule, the rule and all of its evaluations
     * are erased and no longer available. <p>You cannot add a rule to AWS
     * Config that has the state set to <code>DELETING</code>. If you want to
     * delete a rule, you must use the <code>DeleteConfigRule</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETING
     *
     * @param configRuleState Indicates whether the AWS Config rule is active or currently being
     *         deleted by AWS Config. <p>AWS Config sets the state of a rule to
     *         <code>DELETING</code> temporarily after you use the
     *         <code>DeleteConfigRule</code> request to delete the rule. After AWS
     *         Config finishes deleting a rule, the rule and all of its evaluations
     *         are erased and no longer available. <p>You cannot add a rule to AWS
     *         Config that has the state set to <code>DELETING</code>. If you want to
     *         delete a rule, you must use the <code>DeleteConfigRule</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ConfigRuleState
     */
    public ConfigRule withConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
        return this;
    }

    /**
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config. <p>AWS Config sets the state of a rule to
     * <code>DELETING</code> temporarily after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS
     * Config finishes deleting a rule, the rule and all of its evaluations
     * are erased and no longer available. <p>You cannot add a rule to AWS
     * Config that has the state set to <code>DELETING</code>. If you want to
     * delete a rule, you must use the <code>DeleteConfigRule</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETING
     *
     * @param configRuleState Indicates whether the AWS Config rule is active or currently being
     *         deleted by AWS Config. <p>AWS Config sets the state of a rule to
     *         <code>DELETING</code> temporarily after you use the
     *         <code>DeleteConfigRule</code> request to delete the rule. After AWS
     *         Config finishes deleting a rule, the rule and all of its evaluations
     *         are erased and no longer available. <p>You cannot add a rule to AWS
     *         Config that has the state set to <code>DELETING</code>. If you want to
     *         delete a rule, you must use the <code>DeleteConfigRule</code> request.
     *
     * @see ConfigRuleState
     */
    public void setConfigRuleState(ConfigRuleState configRuleState) {
        this.configRuleState = configRuleState.toString();
    }
    
    /**
     * Indicates whether the AWS Config rule is active or currently being
     * deleted by AWS Config. <p>AWS Config sets the state of a rule to
     * <code>DELETING</code> temporarily after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS
     * Config finishes deleting a rule, the rule and all of its evaluations
     * are erased and no longer available. <p>You cannot add a rule to AWS
     * Config that has the state set to <code>DELETING</code>. If you want to
     * delete a rule, you must use the <code>DeleteConfigRule</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETING
     *
     * @param configRuleState Indicates whether the AWS Config rule is active or currently being
     *         deleted by AWS Config. <p>AWS Config sets the state of a rule to
     *         <code>DELETING</code> temporarily after you use the
     *         <code>DeleteConfigRule</code> request to delete the rule. After AWS
     *         Config finishes deleting a rule, the rule and all of its evaluations
     *         are erased and no longer available. <p>You cannot add a rule to AWS
     *         Config that has the state set to <code>DELETING</code>. If you want to
     *         delete a rule, you must use the <code>DeleteConfigRule</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ConfigRuleState
     */
    public ConfigRule withConfigRuleState(ConfigRuleState configRuleState) {
        this.configRuleState = configRuleState.toString();
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
        if (getConfigRuleName() != null) sb.append("ConfigRuleName: " + getConfigRuleName() + ",");
        if (getConfigRuleArn() != null) sb.append("ConfigRuleArn: " + getConfigRuleArn() + ",");
        if (getConfigRuleId() != null) sb.append("ConfigRuleId: " + getConfigRuleId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getScope() != null) sb.append("Scope: " + getScope() + ",");
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getInputParameters() != null) sb.append("InputParameters: " + getInputParameters() + ",");
        if (getMaximumExecutionFrequency() != null) sb.append("MaximumExecutionFrequency: " + getMaximumExecutionFrequency() + ",");
        if (getConfigRuleState() != null) sb.append("ConfigRuleState: " + getConfigRuleState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getConfigRuleArn() == null) ? 0 : getConfigRuleArn().hashCode()); 
        hashCode = prime * hashCode + ((getConfigRuleId() == null) ? 0 : getConfigRuleId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode()); 
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode()); 
        hashCode = prime * hashCode + ((getInputParameters() == null) ? 0 : getInputParameters().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumExecutionFrequency() == null) ? 0 : getMaximumExecutionFrequency().hashCode()); 
        hashCode = prime * hashCode + ((getConfigRuleState() == null) ? 0 : getConfigRuleState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigRule == false) return false;
        ConfigRule other = (ConfigRule)obj;
        
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null) return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false) return false; 
        if (other.getConfigRuleArn() == null ^ this.getConfigRuleArn() == null) return false;
        if (other.getConfigRuleArn() != null && other.getConfigRuleArn().equals(this.getConfigRuleArn()) == false) return false; 
        if (other.getConfigRuleId() == null ^ this.getConfigRuleId() == null) return false;
        if (other.getConfigRuleId() != null && other.getConfigRuleId().equals(this.getConfigRuleId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getScope() == null ^ this.getScope() == null) return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false) return false; 
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false; 
        if (other.getInputParameters() == null ^ this.getInputParameters() == null) return false;
        if (other.getInputParameters() != null && other.getInputParameters().equals(this.getInputParameters()) == false) return false; 
        if (other.getMaximumExecutionFrequency() == null ^ this.getMaximumExecutionFrequency() == null) return false;
        if (other.getMaximumExecutionFrequency() != null && other.getMaximumExecutionFrequency().equals(this.getMaximumExecutionFrequency()) == false) return false; 
        if (other.getConfigRuleState() == null ^ this.getConfigRuleState() == null) return false;
        if (other.getConfigRuleState() != null && other.getConfigRuleState().equals(this.getConfigRuleState()) == false) return false; 
        return true;
    }
    
    @Override
    public ConfigRule clone() {
        try {
            return (ConfigRule) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    