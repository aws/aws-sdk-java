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
 * The structure for a string based condition matching on the incoming mail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/IngressStringExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressStringExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The left hand side argument of a string condition expression.
     * </p>
     */
    private IngressStringToEvaluate evaluate;
    /**
     * <p>
     * The matching operator for a string condition expression.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The right hand side argument of a string condition expression.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The left hand side argument of a string condition expression.
     * </p>
     * 
     * @param evaluate
     *        The left hand side argument of a string condition expression.
     */

    public void setEvaluate(IngressStringToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The left hand side argument of a string condition expression.
     * </p>
     * 
     * @return The left hand side argument of a string condition expression.
     */

    public IngressStringToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The left hand side argument of a string condition expression.
     * </p>
     * 
     * @param evaluate
     *        The left hand side argument of a string condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressStringExpression withEvaluate(IngressStringToEvaluate evaluate) {
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
     * @see IngressStringOperator
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
     * @see IngressStringOperator
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
     * @see IngressStringOperator
     */

    public IngressStringExpression withOperator(String operator) {
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
     * @see IngressStringOperator
     */

    public IngressStringExpression withOperator(IngressStringOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The right hand side argument of a string condition expression.
     * </p>
     * 
     * @return The right hand side argument of a string condition expression.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The right hand side argument of a string condition expression.
     * </p>
     * 
     * @param values
     *        The right hand side argument of a string condition expression.
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
     * The right hand side argument of a string condition expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The right hand side argument of a string condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressStringExpression withValues(String... values) {
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
     * The right hand side argument of a string condition expression.
     * </p>
     * 
     * @param values
     *        The right hand side argument of a string condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressStringExpression withValues(java.util.Collection<String> values) {
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

        if (obj instanceof IngressStringExpression == false)
            return false;
        IngressStringExpression other = (IngressStringExpression) obj;
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
    public IngressStringExpression clone() {
        try {
            return (IngressStringExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.IngressStringExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
