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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <important>
 * <p>
 * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost
 * Categories is subject to the Beta Service Participation terms of the <a
 * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
 * </p>
 * </important>
 * <p>
 * Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is
 * used to determine that Cost Category value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategoryRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryRule implements Serializable, Cloneable, StructuredPojo {

    private String value;
    /**
     * <p>
     * An <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     */
    private Expression rule;

    /**
     * @param value
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return
     */

    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryRule withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * An <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * 
     * @param rule
     *        An <a
     *        href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression
     *        </a> object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently
     *        the only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *        <p>
     *        Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     */

    public void setRule(Expression rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * An <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * 
     * @return An <a
     *         href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression
     *         </a> object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently
     *         the only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *         <p>
     *         Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     */

    public Expression getRule() {
        return this.rule;
    }

    /**
     * <p>
     * An <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only
     * dimensions supported is <code>LINKED_ACCOUNT</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * </p>
     * 
     * @param rule
     *        An <a
     *        href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression
     *        </a> object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently
     *        the only dimensions supported is <code>LINKED_ACCOUNT</code>.</p>
     *        <p>
     *        Root level <code>OR</code> is not supported. We recommend you create a separate rule instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryRule withRule(Expression rule) {
        setRule(rule);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getRule() != null)
            sb.append("Rule: ").append(getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryRule == false)
            return false;
        CostCategoryRule other = (CostCategoryRule) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public CostCategoryRule clone() {
        try {
            return (CostCategoryRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategoryRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
