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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a filter expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/FilterExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of operation to perform in the expression.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * Whether the expression is to be negated.
     * </p>
     */
    private Boolean negated;
    /**
     * <p>
     * A list of filter values.
     * </p>
     */
    private java.util.List<FilterValue> values;

    /**
     * <p>
     * The type of operation to perform in the expression.
     * </p>
     * 
     * @param operation
     *        The type of operation to perform in the expression.
     * @see FilterOperation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The type of operation to perform in the expression.
     * </p>
     * 
     * @return The type of operation to perform in the expression.
     * @see FilterOperation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The type of operation to perform in the expression.
     * </p>
     * 
     * @param operation
     *        The type of operation to perform in the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperation
     */

    public FilterExpression withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform in the expression.
     * </p>
     * 
     * @param operation
     *        The type of operation to perform in the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperation
     */

    public FilterExpression withOperation(FilterOperation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * Whether the expression is to be negated.
     * </p>
     * 
     * @param negated
     *        Whether the expression is to be negated.
     */

    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * <p>
     * Whether the expression is to be negated.
     * </p>
     * 
     * @return Whether the expression is to be negated.
     */

    public Boolean getNegated() {
        return this.negated;
    }

    /**
     * <p>
     * Whether the expression is to be negated.
     * </p>
     * 
     * @param negated
     *        Whether the expression is to be negated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression withNegated(Boolean negated) {
        setNegated(negated);
        return this;
    }

    /**
     * <p>
     * Whether the expression is to be negated.
     * </p>
     * 
     * @return Whether the expression is to be negated.
     */

    public Boolean isNegated() {
        return this.negated;
    }

    /**
     * <p>
     * A list of filter values.
     * </p>
     * 
     * @return A list of filter values.
     */

    public java.util.List<FilterValue> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of filter values.
     * </p>
     * 
     * @param values
     *        A list of filter values.
     */

    public void setValues(java.util.Collection<FilterValue> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<FilterValue>(values);
    }

    /**
     * <p>
     * A list of filter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression withValues(FilterValue... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<FilterValue>(values.length));
        }
        for (FilterValue ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter values.
     * </p>
     * 
     * @param values
     *        A list of filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression withValues(java.util.Collection<FilterValue> values) {
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getNegated() != null)
            sb.append("Negated: ").append(getNegated()).append(",");
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

        if (obj instanceof FilterExpression == false)
            return false;
        FilterExpression other = (FilterExpression) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getNegated() == null ^ this.getNegated() == null)
            return false;
        if (other.getNegated() != null && other.getNegated().equals(this.getNegated()) == false)
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

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getNegated() == null) ? 0 : getNegated().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public FilterExpression clone() {
        try {
            return (FilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.FilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
