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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A string expression is evaluated against strings or substrings of the email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleStringExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleStringExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string to evaluate in a string condition expression.
     * </p>
     */
    private RuleStringToEvaluate evaluate;
    /**
     * <p>
     * The matching operator for a string condition expression.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS, if
     * multiple values are given, the values are processed as an OR. That is, if any of the values match the email's
     * string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
     * deemed to match if none of the given strings match the email's string.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The string to evaluate in a string condition expression.
     * </p>
     * 
     * @param evaluate
     *        The string to evaluate in a string condition expression.
     */

    public void setEvaluate(RuleStringToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The string to evaluate in a string condition expression.
     * </p>
     * 
     * @return The string to evaluate in a string condition expression.
     */

    public RuleStringToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The string to evaluate in a string condition expression.
     * </p>
     * 
     * @param evaluate
     *        The string to evaluate in a string condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleStringExpression withEvaluate(RuleStringToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The matching operator for a string condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a string condition expression.
     * @see RuleStringOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The matching operator for a string condition expression.
     * </p>
     * 
     * @return The matching operator for a string condition expression.
     * @see RuleStringOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The matching operator for a string condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a string condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStringOperator
     */

    public RuleStringExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The matching operator for a string condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a string condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStringOperator
     */

    public RuleStringExpression withOperator(RuleStringOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS, if
     * multiple values are given, the values are processed as an OR. That is, if any of the values match the email's
     * string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
     * deemed to match if none of the given strings match the email's string.
     * </p>
     * 
     * @return The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS,
     *         if multiple values are given, the values are processed as an OR. That is, if any of the values match the
     *         email's string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the
     *         condition is only deemed to match if none of the given strings match the email's string.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS, if
     * multiple values are given, the values are processed as an OR. That is, if any of the values match the email's
     * string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
     * deemed to match if none of the given strings match the email's string.
     * </p>
     * 
     * @param values
     *        The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS,
     *        if multiple values are given, the values are processed as an OR. That is, if any of the values match the
     *        email's string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the
     *        condition is only deemed to match if none of the given strings match the email's string.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS, if
     * multiple values are given, the values are processed as an OR. That is, if any of the values match the email's
     * string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
     * deemed to match if none of the given strings match the email's string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS,
     *        if multiple values are given, the values are processed as an OR. That is, if any of the values match the
     *        email's string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the
     *        condition is only deemed to match if none of the given strings match the email's string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleStringExpression withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS, if
     * multiple values are given, the values are processed as an OR. That is, if any of the values match the email's
     * string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
     * deemed to match if none of the given strings match the email's string.
     * </p>
     * 
     * @param values
     *        The string(s) to be evaluated in a string condition expression. For all operators, except for NOT_EQUALS,
     *        if multiple values are given, the values are processed as an OR. That is, if any of the values match the
     *        email's string using the given operator, the condition is deemed to match. However, for NOT_EQUALS, the
     *        condition is only deemed to match if none of the given strings match the email's string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleStringExpression withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getEvaluate() != null)
            sb.append("Evaluate: ").append(getEvaluate()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleStringExpression == false)
            return false;
        RuleStringExpression other = (RuleStringExpression) obj;
        if (other.getEvaluate() == null ^ this.getEvaluate() == null)
            return false;
        if (other.getEvaluate() != null && other.getEvaluate().equals(this.getEvaluate()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public RuleStringExpression clone() {
        try {
            return (RuleStringExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleStringExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
