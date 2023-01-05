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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostCategoryDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCostCategoryDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     */
    private String costCategoryArn;
    /**
     * <p>
     * The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the
     * date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months,
     * or in the future.
     * </p>
     */
    private String effectiveStart;

    private String ruleVersion;
    /**
     * <p>
     * The <code>Expression</code> object used to categorize costs. For more information, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule </a>.
     * </p>
     */
    private java.util.List<CostCategoryRule> rules;

    private String defaultValue;
    /**
     * <p>
     * The split charge rules used to allocate your charges between your Cost Category values.
     * </p>
     */
    private java.util.List<CostCategorySplitChargeRule> splitChargeRules;

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * 
     * @param costCategoryArn
     *        The unique identifier for your Cost Category.
     */

    public void setCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * 
     * @return The unique identifier for your Cost Category.
     */

    public String getCostCategoryArn() {
        return this.costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * 
     * @param costCategoryArn
     *        The unique identifier for your Cost Category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withCostCategoryArn(String costCategoryArn) {
        setCostCategoryArn(costCategoryArn);
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the
     * date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months,
     * or in the future.
     * </p>
     * 
     * @param effectiveStart
     *        The Cost Category's effective start date. It can only be a billing start date (first day of the month). If
     *        the date isn't provided, it's the first day of the current month. Dates can't be before the previous
     *        twelve months, or in the future.
     */

    public void setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the
     * date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months,
     * or in the future.
     * </p>
     * 
     * @return The Cost Category's effective start date. It can only be a billing start date (first day of the month).
     *         If the date isn't provided, it's the first day of the current month. Dates can't be before the previous
     *         twelve months, or in the future.
     */

    public String getEffectiveStart() {
        return this.effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the
     * date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months,
     * or in the future.
     * </p>
     * 
     * @param effectiveStart
     *        The Cost Category's effective start date. It can only be a billing start date (first day of the month). If
     *        the date isn't provided, it's the first day of the current month. Dates can't be before the previous
     *        twelve months, or in the future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withEffectiveStart(String effectiveStart) {
        setEffectiveStart(effectiveStart);
        return this;
    }

    /**
     * @param ruleVersion
     * @see CostCategoryRuleVersion
     */

    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * @return
     * @see CostCategoryRuleVersion
     */

    public String getRuleVersion() {
        return this.ruleVersion;
    }

    /**
     * @param ruleVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryRuleVersion
     */

    public UpdateCostCategoryDefinitionRequest withRuleVersion(String ruleVersion) {
        setRuleVersion(ruleVersion);
        return this;
    }

    /**
     * @param ruleVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryRuleVersion
     */

    public UpdateCostCategoryDefinitionRequest withRuleVersion(CostCategoryRuleVersion ruleVersion) {
        this.ruleVersion = ruleVersion.toString();
        return this;
    }

    /**
     * <p>
     * The <code>Expression</code> object used to categorize costs. For more information, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule </a>.
     * </p>
     * 
     * @return The <code>Expression</code> object used to categorize costs. For more information, see <a
     *         href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *         >CostCategoryRule </a>.
     */

    public java.util.List<CostCategoryRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The <code>Expression</code> object used to categorize costs. For more information, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule </a>.
     * </p>
     * 
     * @param rules
     *        The <code>Expression</code> object used to categorize costs. For more information, see <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *        >CostCategoryRule </a>.
     */

    public void setRules(java.util.Collection<CostCategoryRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<CostCategoryRule>(rules);
    }

    /**
     * <p>
     * The <code>Expression</code> object used to categorize costs. For more information, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule </a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The <code>Expression</code> object used to categorize costs. For more information, see <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *        >CostCategoryRule </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withRules(CostCategoryRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<CostCategoryRule>(rules.length));
        }
        for (CostCategoryRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Expression</code> object used to categorize costs. For more information, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule </a>.
     * </p>
     * 
     * @param rules
     *        The <code>Expression</code> object used to categorize costs. For more information, see <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *        >CostCategoryRule </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withRules(java.util.Collection<CostCategoryRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * @param defaultValue
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * @return
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @param defaultValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The split charge rules used to allocate your charges between your Cost Category values.
     * </p>
     * 
     * @return The split charge rules used to allocate your charges between your Cost Category values.
     */

    public java.util.List<CostCategorySplitChargeRule> getSplitChargeRules() {
        return splitChargeRules;
    }

    /**
     * <p>
     * The split charge rules used to allocate your charges between your Cost Category values.
     * </p>
     * 
     * @param splitChargeRules
     *        The split charge rules used to allocate your charges between your Cost Category values.
     */

    public void setSplitChargeRules(java.util.Collection<CostCategorySplitChargeRule> splitChargeRules) {
        if (splitChargeRules == null) {
            this.splitChargeRules = null;
            return;
        }

        this.splitChargeRules = new java.util.ArrayList<CostCategorySplitChargeRule>(splitChargeRules);
    }

    /**
     * <p>
     * The split charge rules used to allocate your charges between your Cost Category values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSplitChargeRules(java.util.Collection)} or {@link #withSplitChargeRules(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param splitChargeRules
     *        The split charge rules used to allocate your charges between your Cost Category values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withSplitChargeRules(CostCategorySplitChargeRule... splitChargeRules) {
        if (this.splitChargeRules == null) {
            setSplitChargeRules(new java.util.ArrayList<CostCategorySplitChargeRule>(splitChargeRules.length));
        }
        for (CostCategorySplitChargeRule ele : splitChargeRules) {
            this.splitChargeRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The split charge rules used to allocate your charges between your Cost Category values.
     * </p>
     * 
     * @param splitChargeRules
     *        The split charge rules used to allocate your charges between your Cost Category values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostCategoryDefinitionRequest withSplitChargeRules(java.util.Collection<CostCategorySplitChargeRule> splitChargeRules) {
        setSplitChargeRules(splitChargeRules);
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
        if (getCostCategoryArn() != null)
            sb.append("CostCategoryArn: ").append(getCostCategoryArn()).append(",");
        if (getEffectiveStart() != null)
            sb.append("EffectiveStart: ").append(getEffectiveStart()).append(",");
        if (getRuleVersion() != null)
            sb.append("RuleVersion: ").append(getRuleVersion()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getSplitChargeRules() != null)
            sb.append("SplitChargeRules: ").append(getSplitChargeRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCostCategoryDefinitionRequest == false)
            return false;
        UpdateCostCategoryDefinitionRequest other = (UpdateCostCategoryDefinitionRequest) obj;
        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        if (other.getEffectiveStart() == null ^ this.getEffectiveStart() == null)
            return false;
        if (other.getEffectiveStart() != null && other.getEffectiveStart().equals(this.getEffectiveStart()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null && other.getRuleVersion().equals(this.getRuleVersion()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getSplitChargeRules() == null ^ this.getSplitChargeRules() == null)
            return false;
        if (other.getSplitChargeRules() != null && other.getSplitChargeRules().equals(this.getSplitChargeRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostCategoryArn() == null) ? 0 : getCostCategoryArn().hashCode());
        hashCode = prime * hashCode + ((getEffectiveStart() == null) ? 0 : getEffectiveStart().hashCode());
        hashCode = prime * hashCode + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getSplitChargeRules() == null) ? 0 : getSplitChargeRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCostCategoryDefinitionRequest clone() {
        return (UpdateCostCategoryDefinitionRequest) super.clone();
    }

}
