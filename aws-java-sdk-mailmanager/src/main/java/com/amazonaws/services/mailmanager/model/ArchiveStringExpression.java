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
 * A string expression to evaluate an email attribute value against one or more string values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ArchiveStringExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveStringExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute of the email to evaluate.
     * </p>
     */
    private ArchiveStringToEvaluate evaluate;
    /**
     * <p>
     * The operator to use when evaluating the string values.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The list of string values to evaluate the email attribute against.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The attribute of the email to evaluate.
     * </p>
     * 
     * @param evaluate
     *        The attribute of the email to evaluate.
     */

    public void setEvaluate(ArchiveStringToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The attribute of the email to evaluate.
     * </p>
     * 
     * @return The attribute of the email to evaluate.
     */

    public ArchiveStringToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The attribute of the email to evaluate.
     * </p>
     * 
     * @param evaluate
     *        The attribute of the email to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveStringExpression withEvaluate(ArchiveStringToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The operator to use when evaluating the string values.
     * </p>
     * 
     * @param operator
     *        The operator to use when evaluating the string values.
     * @see ArchiveStringOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use when evaluating the string values.
     * </p>
     * 
     * @return The operator to use when evaluating the string values.
     * @see ArchiveStringOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use when evaluating the string values.
     * </p>
     * 
     * @param operator
     *        The operator to use when evaluating the string values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveStringOperator
     */

    public ArchiveStringExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to use when evaluating the string values.
     * </p>
     * 
     * @param operator
     *        The operator to use when evaluating the string values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveStringOperator
     */

    public ArchiveStringExpression withOperator(ArchiveStringOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The list of string values to evaluate the email attribute against.
     * </p>
     * 
     * @return The list of string values to evaluate the email attribute against.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The list of string values to evaluate the email attribute against.
     * </p>
     * 
     * @param values
     *        The list of string values to evaluate the email attribute against.
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
     * The list of string values to evaluate the email attribute against.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The list of string values to evaluate the email attribute against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveStringExpression withValues(String... values) {
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
     * The list of string values to evaluate the email attribute against.
     * </p>
     * 
     * @param values
     *        The list of string values to evaluate the email attribute against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveStringExpression withValues(java.util.Collection<String> values) {
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

        if (obj instanceof ArchiveStringExpression == false)
            return false;
        ArchiveStringExpression other = (ArchiveStringExpression) obj;
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
    public ArchiveStringExpression clone() {
        try {
            return (ArchiveStringExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.ArchiveStringExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
