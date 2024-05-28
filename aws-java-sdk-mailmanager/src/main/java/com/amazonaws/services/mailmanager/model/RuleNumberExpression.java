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
 * A number expression to match numeric conditions with integers from the incoming email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleNumberExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleNumberExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number to evaluate in a numeric condition expression.
     * </p>
     */
    private RuleNumberToEvaluate evaluate;
    /**
     * <p>
     * The operator for a numeric condition expression.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The value to evaluate in a numeric condition expression.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The number to evaluate in a numeric condition expression.
     * </p>
     * 
     * @param evaluate
     *        The number to evaluate in a numeric condition expression.
     */

    public void setEvaluate(RuleNumberToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The number to evaluate in a numeric condition expression.
     * </p>
     * 
     * @return The number to evaluate in a numeric condition expression.
     */

    public RuleNumberToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The number to evaluate in a numeric condition expression.
     * </p>
     * 
     * @param evaluate
     *        The number to evaluate in a numeric condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleNumberExpression withEvaluate(RuleNumberToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The operator for a numeric condition expression.
     * </p>
     * 
     * @param operator
     *        The operator for a numeric condition expression.
     * @see RuleNumberOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator for a numeric condition expression.
     * </p>
     * 
     * @return The operator for a numeric condition expression.
     * @see RuleNumberOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator for a numeric condition expression.
     * </p>
     * 
     * @param operator
     *        The operator for a numeric condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleNumberOperator
     */

    public RuleNumberExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator for a numeric condition expression.
     * </p>
     * 
     * @param operator
     *        The operator for a numeric condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleNumberOperator
     */

    public RuleNumberExpression withOperator(RuleNumberOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The value to evaluate in a numeric condition expression.
     * </p>
     * 
     * @param value
     *        The value to evaluate in a numeric condition expression.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to evaluate in a numeric condition expression.
     * </p>
     * 
     * @return The value to evaluate in a numeric condition expression.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to evaluate in a numeric condition expression.
     * </p>
     * 
     * @param value
     *        The value to evaluate in a numeric condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleNumberExpression withValue(Double value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleNumberExpression == false)
            return false;
        RuleNumberExpression other = (RuleNumberExpression) obj;
        if (other.getEvaluate() == null ^ this.getEvaluate() == null)
            return false;
        if (other.getEvaluate() != null && other.getEvaluate().equals(this.getEvaluate()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public RuleNumberExpression clone() {
        try {
            return (RuleNumberExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleNumberExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
