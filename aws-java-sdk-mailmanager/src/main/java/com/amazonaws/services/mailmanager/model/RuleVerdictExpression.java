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
 * A verdict expression is evaluated against verdicts of the email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleVerdictExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleVerdictExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The verdict to evaluate in a verdict condition expression.
     * </p>
     */
    private RuleVerdictToEvaluate evaluate;
    /**
     * <p>
     * The matching operator for a verdict condition expression.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The values to match with the email's verdict using the given operator. For the EQUALS operator, if multiple
     * values are given, the condition is deemed to match if any of the given verdicts match that of the email. For the
     * NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none of the given verdicts
     * match the verdict of the email.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The verdict to evaluate in a verdict condition expression.
     * </p>
     * 
     * @param evaluate
     *        The verdict to evaluate in a verdict condition expression.
     */

    public void setEvaluate(RuleVerdictToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The verdict to evaluate in a verdict condition expression.
     * </p>
     * 
     * @return The verdict to evaluate in a verdict condition expression.
     */

    public RuleVerdictToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The verdict to evaluate in a verdict condition expression.
     * </p>
     * 
     * @param evaluate
     *        The verdict to evaluate in a verdict condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleVerdictExpression withEvaluate(RuleVerdictToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The matching operator for a verdict condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a verdict condition expression.
     * @see RuleVerdictOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The matching operator for a verdict condition expression.
     * </p>
     * 
     * @return The matching operator for a verdict condition expression.
     * @see RuleVerdictOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The matching operator for a verdict condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a verdict condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdictOperator
     */

    public RuleVerdictExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The matching operator for a verdict condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a verdict condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdictOperator
     */

    public RuleVerdictExpression withOperator(RuleVerdictOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The values to match with the email's verdict using the given operator. For the EQUALS operator, if multiple
     * values are given, the condition is deemed to match if any of the given verdicts match that of the email. For the
     * NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none of the given verdicts
     * match the verdict of the email.
     * </p>
     * 
     * @return The values to match with the email's verdict using the given operator. For the EQUALS operator, if
     *         multiple values are given, the condition is deemed to match if any of the given verdicts match that of
     *         the email. For the NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of
     *         none of the given verdicts match the verdict of the email.
     * @see RuleVerdict
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values to match with the email's verdict using the given operator. For the EQUALS operator, if multiple
     * values are given, the condition is deemed to match if any of the given verdicts match that of the email. For the
     * NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none of the given verdicts
     * match the verdict of the email.
     * </p>
     * 
     * @param values
     *        The values to match with the email's verdict using the given operator. For the EQUALS operator, if
     *        multiple values are given, the condition is deemed to match if any of the given verdicts match that of the
     *        email. For the NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none
     *        of the given verdicts match the verdict of the email.
     * @see RuleVerdict
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
     * The values to match with the email's verdict using the given operator. For the EQUALS operator, if multiple
     * values are given, the condition is deemed to match if any of the given verdicts match that of the email. For the
     * NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none of the given verdicts
     * match the verdict of the email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values to match with the email's verdict using the given operator. For the EQUALS operator, if
     *        multiple values are given, the condition is deemed to match if any of the given verdicts match that of the
     *        email. For the NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none
     *        of the given verdicts match the verdict of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdict
     */

    public RuleVerdictExpression withValues(String... values) {
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
     * The values to match with the email's verdict using the given operator. For the EQUALS operator, if multiple
     * values are given, the condition is deemed to match if any of the given verdicts match that of the email. For the
     * NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none of the given verdicts
     * match the verdict of the email.
     * </p>
     * 
     * @param values
     *        The values to match with the email's verdict using the given operator. For the EQUALS operator, if
     *        multiple values are given, the condition is deemed to match if any of the given verdicts match that of the
     *        email. For the NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none
     *        of the given verdicts match the verdict of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdict
     */

    public RuleVerdictExpression withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The values to match with the email's verdict using the given operator. For the EQUALS operator, if multiple
     * values are given, the condition is deemed to match if any of the given verdicts match that of the email. For the
     * NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none of the given verdicts
     * match the verdict of the email.
     * </p>
     * 
     * @param values
     *        The values to match with the email's verdict using the given operator. For the EQUALS operator, if
     *        multiple values are given, the condition is deemed to match if any of the given verdicts match that of the
     *        email. For the NOT_EQUALS operator, if multiple values are given, the condition is deemed to match of none
     *        of the given verdicts match the verdict of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdict
     */

    public RuleVerdictExpression withValues(RuleVerdict... values) {
        java.util.ArrayList<String> valuesCopy = new java.util.ArrayList<String>(values.length);
        for (RuleVerdict value : values) {
            valuesCopy.add(value.toString());
        }
        if (getValues() == null) {
            setValues(valuesCopy);
        } else {
            getValues().addAll(valuesCopy);
        }
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

        if (obj instanceof RuleVerdictExpression == false)
            return false;
        RuleVerdictExpression other = (RuleVerdictExpression) obj;
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
    public RuleVerdictExpression clone() {
        try {
            return (RuleVerdictExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleVerdictExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
