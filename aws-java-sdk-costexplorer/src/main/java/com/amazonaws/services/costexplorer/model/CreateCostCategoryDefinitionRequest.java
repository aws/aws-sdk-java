/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateCostCategoryDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCostCategoryDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;

    private String ruleVersion;
    /**
     * <p>
     * <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     */
    private java.util.List<CostCategoryRule> rules;

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

    public CreateCostCategoryDefinitionRequest withName(String name) {
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

    public CreateCostCategoryDefinitionRequest withRuleVersion(String ruleVersion) {
        setRuleVersion(ruleVersion);
        return this;
    }

    /**
     * @param ruleVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryRuleVersion
     */

    public CreateCostCategoryDefinitionRequest withRuleVersion(CostCategoryRuleVersion ruleVersion) {
        this.ruleVersion = ruleVersion.toString();
        return this;
    }

    /**
     * <p>
     * <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * 
     * @return <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently
     *         the only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *         <p>
     *         Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     *         </p>
     *         <p>
     *         Rules are processed in order. If there are multiple rules that match the line item, then the first rule
     *         to match is used to determine that Cost Category value.
     */

    public java.util.List<CostCategoryRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * 
     * @param rules
     *        <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the
     *        only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *        <p>
     *        Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     *        </p>
     *        <p>
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
     * <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
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
     *        <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the
     *        only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *        <p>
     *        Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     *        </p>
     *        <p>
     *        Rules are processed in order. If there are multiple rules that match the line item, then the first rule to
     *        match is used to determine that Cost Category value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCostCategoryDefinitionRequest withRules(CostCategoryRule... rules) {
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
     * <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * <p>
     * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match
     * is used to determine that Cost Category value.
     * </p>
     * 
     * @param rules
     *        <code>CreateCostCategoryDefinition</code> supports dimensions, Tags, and nested expressions. Currently the
     *        only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *        <p>
     *        Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     *        </p>
     *        <p>
     *        Rules are processed in order. If there are multiple rules that match the line item, then the first rule to
     *        match is used to determine that Cost Category value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCostCategoryDefinitionRequest withRules(java.util.Collection<CostCategoryRule> rules) {
        setRules(rules);
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
        if (getRuleVersion() != null)
            sb.append("RuleVersion: ").append(getRuleVersion()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCostCategoryDefinitionRequest == false)
            return false;
        CreateCostCategoryDefinitionRequest other = (CreateCostCategoryDefinitionRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public CreateCostCategoryDefinitionRequest clone() {
        return (CreateCostCategoryDefinitionRequest) super.clone();
    }

}
