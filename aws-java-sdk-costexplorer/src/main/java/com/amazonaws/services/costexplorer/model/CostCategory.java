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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of Cost Categories. This includes detailed metadata and the set of rules for the
 * <code>CostCategory</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     */
    private String costCategoryArn;
    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     */
    private String effectiveStart;
    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     */
    private String effectiveEnd;

    private String name;

    private String ruleVersion;
    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     */
    private java.util.List<CostCategoryRule> rules;
    /**
     * <p>
     * The list of processing statuses for Cost Management products for a specific cost category.
     * </p>
     */
    private java.util.List<CostCategoryProcessingStatus> processingStatus;

    private String defaultValue;

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

    public CostCategory withCostCategoryArn(String costCategoryArn) {
        setCostCategoryArn(costCategoryArn);
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * 
     * @param effectiveStart
     *        The Cost Category's effective start date.
     */

    public void setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * 
     * @return The Cost Category's effective start date.
     */

    public String getEffectiveStart() {
        return this.effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * 
     * @param effectiveStart
     *        The Cost Category's effective start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withEffectiveStart(String effectiveStart) {
        setEffectiveStart(effectiveStart);
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * 
     * @param effectiveEnd
     *        The Cost Category's effective end date.
     */

    public void setEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * 
     * @return The Cost Category's effective end date.
     */

    public String getEffectiveEnd() {
        return this.effectiveEnd;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * 
     * @param effectiveEnd
     *        The Cost Category's effective end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withEffectiveEnd(String effectiveEnd) {
        setEffectiveEnd(effectiveEnd);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withName(String name) {
        setName(name);
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

    public CostCategory withRuleVersion(String ruleVersion) {
        setRuleVersion(ruleVersion);
        return this;
    }

    /**
     * @param ruleVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryRuleVersion
     */

    public CostCategory withRuleVersion(CostCategoryRuleVersion ruleVersion) {
        this.ruleVersion = ruleVersion.toString();
        return this;
    }

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * 
     * @return Rules are processed in order. If there are multiple rules that match the line item, then the first rule
     *         to match is used to determine that Cost Category value.
     */

    public java.util.List<CostCategoryRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * 
     * @param rules
     *        Rules are processed in order. If there are multiple rules that match the line item, then the first rule to
     *        match is used to determine that Cost Category value.
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
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Rules are processed in order. If there are multiple rules that match the line item, then the first rule to
     *        match is used to determine that Cost Category value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withRules(CostCategoryRule... rules) {
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
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * 
     * @param rules
     *        Rules are processed in order. If there are multiple rules that match the line item, then the first rule to
     *        match is used to determine that Cost Category value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withRules(java.util.Collection<CostCategoryRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The list of processing statuses for Cost Management products for a specific cost category.
     * </p>
     * 
     * @return The list of processing statuses for Cost Management products for a specific cost category.
     */

    public java.util.List<CostCategoryProcessingStatus> getProcessingStatus() {
        return processingStatus;
    }

    /**
     * <p>
     * The list of processing statuses for Cost Management products for a specific cost category.
     * </p>
     * 
     * @param processingStatus
     *        The list of processing statuses for Cost Management products for a specific cost category.
     */

    public void setProcessingStatus(java.util.Collection<CostCategoryProcessingStatus> processingStatus) {
        if (processingStatus == null) {
            this.processingStatus = null;
            return;
        }

        this.processingStatus = new java.util.ArrayList<CostCategoryProcessingStatus>(processingStatus);
    }

    /**
     * <p>
     * The list of processing statuses for Cost Management products for a specific cost category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessingStatus(java.util.Collection)} or {@link #withProcessingStatus(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param processingStatus
     *        The list of processing statuses for Cost Management products for a specific cost category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withProcessingStatus(CostCategoryProcessingStatus... processingStatus) {
        if (this.processingStatus == null) {
            setProcessingStatus(new java.util.ArrayList<CostCategoryProcessingStatus>(processingStatus.length));
        }
        for (CostCategoryProcessingStatus ele : processingStatus) {
            this.processingStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of processing statuses for Cost Management products for a specific cost category.
     * </p>
     * 
     * @param processingStatus
     *        The list of processing statuses for Cost Management products for a specific cost category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategory withProcessingStatus(java.util.Collection<CostCategoryProcessingStatus> processingStatus) {
        setProcessingStatus(processingStatus);
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

    public CostCategory withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getEffectiveEnd() != null)
            sb.append("EffectiveEnd: ").append(getEffectiveEnd()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuleVersion() != null)
            sb.append("RuleVersion: ").append(getRuleVersion()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getProcessingStatus() != null)
            sb.append("ProcessingStatus: ").append(getProcessingStatus()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategory == false)
            return false;
        CostCategory other = (CostCategory) obj;
        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        if (other.getEffectiveStart() == null ^ this.getEffectiveStart() == null)
            return false;
        if (other.getEffectiveStart() != null && other.getEffectiveStart().equals(this.getEffectiveStart()) == false)
            return false;
        if (other.getEffectiveEnd() == null ^ this.getEffectiveEnd() == null)
            return false;
        if (other.getEffectiveEnd() != null && other.getEffectiveEnd().equals(this.getEffectiveEnd()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null && other.getRuleVersion().equals(this.getRuleVersion()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getProcessingStatus() == null ^ this.getProcessingStatus() == null)
            return false;
        if (other.getProcessingStatus() != null && other.getProcessingStatus().equals(this.getProcessingStatus()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostCategoryArn() == null) ? 0 : getCostCategoryArn().hashCode());
        hashCode = prime * hashCode + ((getEffectiveStart() == null) ? 0 : getEffectiveStart().hashCode());
        hashCode = prime * hashCode + ((getEffectiveEnd() == null) ? 0 : getEffectiveEnd().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getProcessingStatus() == null) ? 0 : getProcessingStatus().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public CostCategory clone() {
        try {
            return (CostCategory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
