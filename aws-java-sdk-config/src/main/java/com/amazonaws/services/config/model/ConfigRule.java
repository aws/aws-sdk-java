/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An AWS Config rule represents an AWS Lambda function that you create for a custom rule or a predefined function for
 * an AWS managed rule. The function evaluates configuration items to assess whether your AWS resources comply with your
 * desired configurations. This function can run when AWS Config detects a configuration change to an AWS resource and
 * at a periodic frequency that you choose (for example, every 24 hours).
 * </p>
 * <note>
 * <p>
 * You can use the AWS CLI and AWS SDKs if you want to create a rule that triggers evaluations for your resources when
 * AWS Config delivers the configuration snapshot. For more information, see <a>ConfigSnapshotDeliveryProperties</a>.
 * </p>
 * </note>
 * <p>
 * For more information about developing and using AWS Config rules, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource
 * Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
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
     * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types,
     * a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope
     * to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope,
     * evaluations are triggered when any resource in the recording group changes.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to
     * evaluate your AWS resources.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     * </p>
     */
    private String inputParameters;
    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     * <code>MaximumExecutionFrequency</code> when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using an AWS managed rule that is triggered at a periodic frequency.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     */
    private String maximumExecutionFrequency;
    /**
     * <p>
     * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate
     * the evaluation status for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     * <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     * <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and all of
     * its evaluations are erased and are no longer available.
     * </p>
     */
    private String configRuleState;
    /**
     * <p>
     * Service principal name of the service that created the rule.
     * </p>
     * <note>
     * <p>
     * The field is populated only if the service linked rule is created by a service. The field is empty if you create
     * your own rule.
     * </p>
     * </note>
     */
    private String createdBy;

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
     * </p>
     * 
     * @param configRuleName
     *        The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
     * </p>
     * 
     * @return The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
     * </p>
     * 
     * @param configRuleName
     *        The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types,
     * a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope
     * to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope,
     * evaluations are triggered when any resource in the recording group changes.
     * </p>
     * 
     * @param scope
     *        Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource
     *        types, a combination of one resource type and one resource ID, or a combination of a tag key and value.
     *        Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do not
     *        specify a scope, evaluations are triggered when any resource in the recording group changes.
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types,
     * a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope
     * to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope,
     * evaluations are triggered when any resource in the recording group changes.
     * </p>
     * 
     * @return Defines which resources can trigger an evaluation for the rule. The scope can include one or more
     *         resource types, a combination of one resource type and one resource ID, or a combination of a tag key and
     *         value. Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do
     *         not specify a scope, evaluations are triggered when any resource in the recording group changes.
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types,
     * a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope
     * to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope,
     * evaluations are triggered when any resource in the recording group changes.
     * </p>
     * 
     * @param scope
     *        Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource
     *        types, a combination of one resource type and one resource ID, or a combination of a tag key and value.
     *        Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do not
     *        specify a scope, evaluations are triggered when any resource in the recording group changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRule withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to
     * evaluate your AWS resources.
     * </p>
     * 
     * @param source
     *        Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the
     *        function to evaluate your AWS resources.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to
     * evaluate your AWS resources.
     * </p>
     * 
     * @return Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the
     *         function to evaluate your AWS resources.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to
     * evaluate your AWS resources.
     * </p>
     * 
     * @param source
     *        Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the
     *        function to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRule withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     * </p>
     * 
     * @param inputParameters
     *        A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     */

    public void setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     * </p>
     * 
     * @return A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     */

    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     * </p>
     * 
     * @param inputParameters
     *        A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRule withInputParameters(String inputParameters) {
        setInputParameters(inputParameters);
        return this;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     * <code>MaximumExecutionFrequency</code> when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using an AWS managed rule that is triggered at a periodic frequency.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     *        <code>MaximumExecutionFrequency</code> when:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You are using an AWS managed rule that is triggered at a periodic frequency.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information,
     *        see <a>ConfigSnapshotDeliveryProperties</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     * <code>MaximumExecutionFrequency</code> when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using an AWS managed rule that is triggered at a periodic frequency.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @return The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     *         <code>MaximumExecutionFrequency</code> when:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You are using an AWS managed rule that is triggered at a periodic frequency.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information,
     *         see <a>ConfigSnapshotDeliveryProperties</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify
     *         a valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *         </p>
     * @see MaximumExecutionFrequency
     */

    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     * <code>MaximumExecutionFrequency</code> when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using an AWS managed rule that is triggered at a periodic frequency.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     *        <code>MaximumExecutionFrequency</code> when:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You are using an AWS managed rule that is triggered at a periodic frequency.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information,
     *        see <a>ConfigSnapshotDeliveryProperties</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public ConfigRule withMaximumExecutionFrequency(String maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     * <code>MaximumExecutionFrequency</code> when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using an AWS managed rule that is triggered at a periodic frequency.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     *        <code>MaximumExecutionFrequency</code> when:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You are using an AWS managed rule that is triggered at a periodic frequency.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information,
     *        see <a>ConfigSnapshotDeliveryProperties</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        withMaximumExecutionFrequency(maximumExecutionFrequency);
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     * <code>MaximumExecutionFrequency</code> when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using an AWS managed rule that is triggered at a periodic frequency.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for
     *        <code>MaximumExecutionFrequency</code> when:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You are using an AWS managed rule that is triggered at a periodic frequency.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information,
     *        see <a>ConfigSnapshotDeliveryProperties</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public ConfigRule withMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate
     * the evaluation status for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     * <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     * <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and all of
     * its evaluations are erased and are no longer available.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also
     *        indicate the evaluation status for the AWS Config rule.</p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     *        <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     *        </p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     *        <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config
     *        rule.
     *        </p>
     *        <p>
     *        AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     *        <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and
     *        all of its evaluations are erased and are no longer available.
     * @see ConfigRuleState
     */

    public void setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate
     * the evaluation status for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     * <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     * <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and all of
     * its evaluations are erased and are no longer available.
     * </p>
     * 
     * @return Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also
     *         indicate the evaluation status for the AWS Config rule.</p>
     *         <p>
     *         AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     *         <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     *         </p>
     *         <p>
     *         AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     *         <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config
     *         rule.
     *         </p>
     *         <p>
     *         AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     *         <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and
     *         all of its evaluations are erased and are no longer available.
     * @see ConfigRuleState
     */

    public String getConfigRuleState() {
        return this.configRuleState;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate
     * the evaluation status for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     * <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     * <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and all of
     * its evaluations are erased and are no longer available.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also
     *        indicate the evaluation status for the AWS Config rule.</p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     *        <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     *        </p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     *        <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config
     *        rule.
     *        </p>
     *        <p>
     *        AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     *        <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and
     *        all of its evaluations are erased and are no longer available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigRuleState
     */

    public ConfigRule withConfigRuleState(String configRuleState) {
        setConfigRuleState(configRuleState);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate
     * the evaluation status for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     * <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     * <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and all of
     * its evaluations are erased and are no longer available.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also
     *        indicate the evaluation status for the AWS Config rule.</p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     *        <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     *        </p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     *        <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config
     *        rule.
     *        </p>
     *        <p>
     *        AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     *        <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and
     *        all of its evaluations are erased and are no longer available.
     * @see ConfigRuleState
     */

    public void setConfigRuleState(ConfigRuleState configRuleState) {
        withConfigRuleState(configRuleState);
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate
     * the evaluation status for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     * <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     * <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config rule.
     * </p>
     * <p>
     * AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     * <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and all of
     * its evaluations are erased and are no longer available.
     * </p>
     * 
     * @param configRuleState
     *        Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also
     *        indicate the evaluation status for the AWS Config rule.</p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>EVALUATING</code> temporarily after you use the
     *        <code>StartConfigRulesEvaluation</code> request to evaluate your resources against the AWS Config rule.
     *        </p>
     *        <p>
     *        AWS Config sets the state of the rule to <code>DELETING_RESULTS</code> temporarily after you use the
     *        <code>DeleteEvaluationResults</code> request to delete the current evaluation results for the AWS Config
     *        rule.
     *        </p>
     *        <p>
     *        AWS Config temporarily sets the state of a rule to <code>DELETING</code> after you use the
     *        <code>DeleteConfigRule</code> request to delete the rule. After AWS Config deletes the rule, the rule and
     *        all of its evaluations are erased and are no longer available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigRuleState
     */

    public ConfigRule withConfigRuleState(ConfigRuleState configRuleState) {
        this.configRuleState = configRuleState.toString();
        return this;
    }

    /**
     * <p>
     * Service principal name of the service that created the rule.
     * </p>
     * <note>
     * <p>
     * The field is populated only if the service linked rule is created by a service. The field is empty if you create
     * your own rule.
     * </p>
     * </note>
     * 
     * @param createdBy
     *        Service principal name of the service that created the rule.</p> <note>
     *        <p>
     *        The field is populated only if the service linked rule is created by a service. The field is empty if you
     *        create your own rule.
     *        </p>
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Service principal name of the service that created the rule.
     * </p>
     * <note>
     * <p>
     * The field is populated only if the service linked rule is created by a service. The field is empty if you create
     * your own rule.
     * </p>
     * </note>
     * 
     * @return Service principal name of the service that created the rule.</p> <note>
     *         <p>
     *         The field is populated only if the service linked rule is created by a service. The field is empty if you
     *         create your own rule.
     *         </p>
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Service principal name of the service that created the rule.
     * </p>
     * <note>
     * <p>
     * The field is populated only if the service linked rule is created by a service. The field is empty if you create
     * your own rule.
     * </p>
     * </note>
     * 
     * @param createdBy
     *        Service principal name of the service that created the rule.</p> <note>
     *        <p>
     *        The field is populated only if the service linked rule is created by a service. The field is empty if you
     *        create your own rule.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRule withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getConfigRuleArn() != null)
            sb.append("ConfigRuleArn: ").append(getConfigRuleArn()).append(",");
        if (getConfigRuleId() != null)
            sb.append("ConfigRuleId: ").append(getConfigRuleId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getInputParameters() != null)
            sb.append("InputParameters: ").append(getInputParameters()).append(",");
        if (getMaximumExecutionFrequency() != null)
            sb.append("MaximumExecutionFrequency: ").append(getMaximumExecutionFrequency()).append(",");
        if (getConfigRuleState() != null)
            sb.append("ConfigRuleState: ").append(getConfigRuleState()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
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
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getConfigRuleArn() == null ^ this.getConfigRuleArn() == null)
            return false;
        if (other.getConfigRuleArn() != null && other.getConfigRuleArn().equals(this.getConfigRuleArn()) == false)
            return false;
        if (other.getConfigRuleId() == null ^ this.getConfigRuleId() == null)
            return false;
        if (other.getConfigRuleId() != null && other.getConfigRuleId().equals(this.getConfigRuleId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getInputParameters() == null ^ this.getInputParameters() == null)
            return false;
        if (other.getInputParameters() != null && other.getInputParameters().equals(this.getInputParameters()) == false)
            return false;
        if (other.getMaximumExecutionFrequency() == null ^ this.getMaximumExecutionFrequency() == null)
            return false;
        if (other.getMaximumExecutionFrequency() != null && other.getMaximumExecutionFrequency().equals(this.getMaximumExecutionFrequency()) == false)
            return false;
        if (other.getConfigRuleState() == null ^ this.getConfigRuleState() == null)
            return false;
        if (other.getConfigRuleState() != null && other.getConfigRuleState().equals(this.getConfigRuleState()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public ConfigRule clone() {
        try {
            return (ConfigRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
