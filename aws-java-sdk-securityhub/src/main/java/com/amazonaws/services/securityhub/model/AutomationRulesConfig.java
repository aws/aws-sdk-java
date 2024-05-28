/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the configuration of an automation rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AutomationRulesConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a rule.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>, Security Hub
     * starts applying the rule to findings and finding updates after the rule is created.
     * </p>
     */
    private String ruleStatus;
    /**
     * <p>
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to findings.
     * Security Hub applies rules with lower values for this parameter first.
     * </p>
     */
    private Integer ruleOrder;
    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * A description of the rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the rule criteria. This
     * is useful when a finding matches the criteria for multiple rules, and each rule has different actions. If a rule
     * is terminal, Security Hub applies the rule action to a finding that matches the rule criteria and doesn't
     * evaluate other rules for the finding. By default, a rule isn't terminal.
     * </p>
     */
    private Boolean isTerminal;
    /**
     * <p>
     * A set of <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> finding field attributes and corresponding expected values that Security Hub
     * uses to filter findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
     * Security Hub applies the rule action to the finding.
     * </p>
     */
    private AutomationRulesFindingFilters criteria;
    /**
     * <p>
     * One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * </p>
     */
    private java.util.List<AutomationRulesAction> actions;
    /**
     * <p>
     * A timestamp that indicates when the rule was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A timestamp that indicates when the rule was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The principal that created a rule.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of a rule.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a rule.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>, Security Hub
     * starts applying the rule to findings and finding updates after the rule is created.
     * </p>
     * 
     * @param ruleStatus
     *        Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>,
     *        Security Hub starts applying the rule to findings and finding updates after the rule is created.
     * @see RuleStatus
     */

    public void setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
    }

    /**
     * <p>
     * Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>, Security Hub
     * starts applying the rule to findings and finding updates after the rule is created.
     * </p>
     * 
     * @return Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>,
     *         Security Hub starts applying the rule to findings and finding updates after the rule is created.
     * @see RuleStatus
     */

    public String getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * <p>
     * Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>, Security Hub
     * starts applying the rule to findings and finding updates after the rule is created.
     * </p>
     * 
     * @param ruleStatus
     *        Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>,
     *        Security Hub starts applying the rule to findings and finding updates after the rule is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStatus
     */

    public AutomationRulesConfig withRuleStatus(String ruleStatus) {
        setRuleStatus(ruleStatus);
        return this;
    }

    /**
     * <p>
     * Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>, Security Hub
     * starts applying the rule to findings and finding updates after the rule is created.
     * </p>
     * 
     * @param ruleStatus
     *        Whether the rule is active after it is created. If this parameter is equal to <code>ENABLED</code>,
     *        Security Hub starts applying the rule to findings and finding updates after the rule is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStatus
     */

    public AutomationRulesConfig withRuleStatus(RuleStatus ruleStatus) {
        this.ruleStatus = ruleStatus.toString();
        return this;
    }

    /**
     * <p>
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to findings.
     * Security Hub applies rules with lower values for this parameter first.
     * </p>
     * 
     * @param ruleOrder
     *        An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to
     *        findings. Security Hub applies rules with lower values for this parameter first.
     */

    public void setRuleOrder(Integer ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    /**
     * <p>
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to findings.
     * Security Hub applies rules with lower values for this parameter first.
     * </p>
     * 
     * @return An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to
     *         findings. Security Hub applies rules with lower values for this parameter first.
     */

    public Integer getRuleOrder() {
        return this.ruleOrder;
    }

    /**
     * <p>
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to findings.
     * Security Hub applies rules with lower values for this parameter first.
     * </p>
     * 
     * @param ruleOrder
     *        An integer ranging from 1 to 1000 that represents the order in which the rule action is applied to
     *        findings. Security Hub applies rules with lower values for this parameter first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withRuleOrder(Integer ruleOrder) {
        setRuleOrder(ruleOrder);
        return this;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * A description of the rule.
     * </p>
     * 
     * @param description
     *        A description of the rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the rule.
     * </p>
     * 
     * @return A description of the rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the rule.
     * </p>
     * 
     * @param description
     *        A description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the rule criteria. This
     * is useful when a finding matches the criteria for multiple rules, and each rule has different actions. If a rule
     * is terminal, Security Hub applies the rule action to a finding that matches the rule criteria and doesn't
     * evaluate other rules for the finding. By default, a rule isn't terminal.
     * </p>
     * 
     * @param isTerminal
     *        Specifies whether a rule is the last to be applied with respect to a finding that matches the rule
     *        criteria. This is useful when a finding matches the criteria for multiple rules, and each rule has
     *        different actions. If a rule is terminal, Security Hub applies the rule action to a finding that matches
     *        the rule criteria and doesn't evaluate other rules for the finding. By default, a rule isn't terminal.
     */

    public void setIsTerminal(Boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    /**
     * <p>
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the rule criteria. This
     * is useful when a finding matches the criteria for multiple rules, and each rule has different actions. If a rule
     * is terminal, Security Hub applies the rule action to a finding that matches the rule criteria and doesn't
     * evaluate other rules for the finding. By default, a rule isn't terminal.
     * </p>
     * 
     * @return Specifies whether a rule is the last to be applied with respect to a finding that matches the rule
     *         criteria. This is useful when a finding matches the criteria for multiple rules, and each rule has
     *         different actions. If a rule is terminal, Security Hub applies the rule action to a finding that matches
     *         the rule criteria and doesn't evaluate other rules for the finding. By default, a rule isn't terminal.
     */

    public Boolean getIsTerminal() {
        return this.isTerminal;
    }

    /**
     * <p>
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the rule criteria. This
     * is useful when a finding matches the criteria for multiple rules, and each rule has different actions. If a rule
     * is terminal, Security Hub applies the rule action to a finding that matches the rule criteria and doesn't
     * evaluate other rules for the finding. By default, a rule isn't terminal.
     * </p>
     * 
     * @param isTerminal
     *        Specifies whether a rule is the last to be applied with respect to a finding that matches the rule
     *        criteria. This is useful when a finding matches the criteria for multiple rules, and each rule has
     *        different actions. If a rule is terminal, Security Hub applies the rule action to a finding that matches
     *        the rule criteria and doesn't evaluate other rules for the finding. By default, a rule isn't terminal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withIsTerminal(Boolean isTerminal) {
        setIsTerminal(isTerminal);
        return this;
    }

    /**
     * <p>
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the rule criteria. This
     * is useful when a finding matches the criteria for multiple rules, and each rule has different actions. If a rule
     * is terminal, Security Hub applies the rule action to a finding that matches the rule criteria and doesn't
     * evaluate other rules for the finding. By default, a rule isn't terminal.
     * </p>
     * 
     * @return Specifies whether a rule is the last to be applied with respect to a finding that matches the rule
     *         criteria. This is useful when a finding matches the criteria for multiple rules, and each rule has
     *         different actions. If a rule is terminal, Security Hub applies the rule action to a finding that matches
     *         the rule criteria and doesn't evaluate other rules for the finding. By default, a rule isn't terminal.
     */

    public Boolean isTerminal() {
        return this.isTerminal;
    }

    /**
     * <p>
     * A set of <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> finding field attributes and corresponding expected values that Security Hub
     * uses to filter findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
     * Security Hub applies the rule action to the finding.
     * </p>
     * 
     * @param criteria
     *        A set of <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon
     *        Web Services Security Finding Format</a> finding field attributes and corresponding expected values that
     *        Security Hub uses to filter findings. If a rule is enabled and a finding matches the conditions specified
     *        in this parameter, Security Hub applies the rule action to the finding.
     */

    public void setCriteria(AutomationRulesFindingFilters criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * A set of <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> finding field attributes and corresponding expected values that Security Hub
     * uses to filter findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
     * Security Hub applies the rule action to the finding.
     * </p>
     * 
     * @return A set of <a
     *         href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon
     *         Web Services Security Finding Format</a> finding field attributes and corresponding expected values that
     *         Security Hub uses to filter findings. If a rule is enabled and a finding matches the conditions specified
     *         in this parameter, Security Hub applies the rule action to the finding.
     */

    public AutomationRulesFindingFilters getCriteria() {
        return this.criteria;
    }

    /**
     * <p>
     * A set of <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> finding field attributes and corresponding expected values that Security Hub
     * uses to filter findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
     * Security Hub applies the rule action to the finding.
     * </p>
     * 
     * @param criteria
     *        A set of <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon
     *        Web Services Security Finding Format</a> finding field attributes and corresponding expected values that
     *        Security Hub uses to filter findings. If a rule is enabled and a finding matches the conditions specified
     *        in this parameter, Security Hub applies the rule action to the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withCriteria(AutomationRulesFindingFilters criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * </p>
     * 
     * @return One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     */

    public java.util.List<AutomationRulesAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * </p>
     * 
     * @param actions
     *        One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     */

    public void setActions(java.util.Collection<AutomationRulesAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<AutomationRulesAction>(actions);
    }

    /**
     * <p>
     * One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withActions(AutomationRulesAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<AutomationRulesAction>(actions.length));
        }
        for (AutomationRulesAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * </p>
     * 
     * @param actions
     *        One or more actions to update finding fields if a finding matches the defined criteria of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withActions(java.util.Collection<AutomationRulesAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the rule was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param createdAt
     *        A timestamp that indicates when the rule was created. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the rule was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return A timestamp that indicates when the rule was created. </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the rule was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param createdAt
     *        A timestamp that indicates when the rule was created. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the rule was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param updatedAt
     *        A timestamp that indicates when the rule was most recently updated. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the rule was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return A timestamp that indicates when the rule was most recently updated. </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the rule was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param updatedAt
     *        A timestamp that indicates when the rule was most recently updated. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The principal that created a rule.
     * </p>
     * 
     * @param createdBy
     *        The principal that created a rule.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The principal that created a rule.
     * </p>
     * 
     * @return The principal that created a rule.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The principal that created a rule.
     * </p>
     * 
     * @param createdBy
     *        The principal that created a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesConfig withCreatedBy(String createdBy) {
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
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
        if (getRuleStatus() != null)
            sb.append("RuleStatus: ").append(getRuleStatus()).append(",");
        if (getRuleOrder() != null)
            sb.append("RuleOrder: ").append(getRuleOrder()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsTerminal() != null)
            sb.append("IsTerminal: ").append(getIsTerminal()).append(",");
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
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

        if (obj instanceof AutomationRulesConfig == false)
            return false;
        AutomationRulesConfig other = (AutomationRulesConfig) obj;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getRuleStatus() == null ^ this.getRuleStatus() == null)
            return false;
        if (other.getRuleStatus() != null && other.getRuleStatus().equals(this.getRuleStatus()) == false)
            return false;
        if (other.getRuleOrder() == null ^ this.getRuleOrder() == null)
            return false;
        if (other.getRuleOrder() != null && other.getRuleOrder().equals(this.getRuleOrder()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsTerminal() == null ^ this.getIsTerminal() == null)
            return false;
        if (other.getIsTerminal() != null && other.getIsTerminal().equals(this.getIsTerminal()) == false)
            return false;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getRuleStatus() == null) ? 0 : getRuleStatus().hashCode());
        hashCode = prime * hashCode + ((getRuleOrder() == null) ? 0 : getRuleOrder().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsTerminal() == null) ? 0 : getIsTerminal().hashCode());
        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public AutomationRulesConfig clone() {
        try {
            return (AutomationRulesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AutomationRulesConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
