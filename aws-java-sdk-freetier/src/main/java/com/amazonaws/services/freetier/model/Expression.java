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
package com.amazonaws.services.freetier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use <code>Expression</code> to filter in the <code>GetFreeTierUsage</code> API operation.
 * </p>
 * <p>
 * You can use the following patterns:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Simple dimension values (<code>Dimensions</code> root operator)
 * </p>
 * </li>
 * <li>
 * <p>
 * Complex expressions with logical operators (<code>AND</code>, <code>NOT</code>, and <code>OR</code> root operators).
 * </p>
 * </li>
 * </ul>
 * <p>
 * For <i>simple dimension values</i>, you can set the dimension name, values, and match type for the filters that you
 * plan to use.
 * </p>
 * <p>
 * <b>Example for simple dimension values</b>
 * </p>
 * <p>
 * You can filter to match exactly for <code>REGION==us-east-1 OR REGION==us-west-1</code>.
 * </p>
 * <p>
 * The corresponding <code>Expression</code> appears like the following:
 * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ], "MatchOptions": ["EQUALS"] } }</code>
 * </p>
 * <p>
 * As shown in the previous example, lists of dimension values are combined with <code>OR</code> when you apply the
 * filter.
 * </p>
 * <p>
 * For <i>complex expressions with logical operators</i>, you can have nested expressions to use the logical operators
 * and specify advanced filtering.
 * </p>
 * <p>
 * <b>Example for complex expressions with logical operators</b>
 * </p>
 * <p>
 * You can filter by
 * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (SERVICE CONTAINS AWSLambda)) AND (USAGE_TYPE !CONTAINS DataTransfer)</code>
 * .
 * </p>
 * <p>
 * The corresponding <code>Expression</code> appears like the following:
 * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ], "MatchOptions": ["EQUALS"] }}, {"Dimensions": { "Key": "SERVICE", "Values": ["AWSLambda"], "MatchOptions": ["CONTAINS"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"], "MatchOptions": ["CONTAINS"] }}} ] }</code>
 * </p>
 * <p>
 * In the following <b>Contents</b>, you must specify exactly one of the following root operators.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/Expression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Expression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Return results that match all <code>Expressions</code> that you specified in the array.
     * </p>
     */
    private java.util.List<Expression> and;
    /**
     * <p>
     * The specific dimension, values, and match type to filter objects with.
     * </p>
     */
    private DimensionValues dimensions;
    /**
     * <p>
     * Return results that don’t match the <code>Expression</code> that you specified.
     * </p>
     */
    private Expression not;
    /**
     * <p>
     * Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * </p>
     */
    private java.util.List<Expression> or;

    /**
     * <p>
     * Return results that match all <code>Expressions</code> that you specified in the array.
     * </p>
     * 
     * @return Return results that match all <code>Expressions</code> that you specified in the array.
     */

    public java.util.List<Expression> getAnd() {
        return and;
    }

    /**
     * <p>
     * Return results that match all <code>Expressions</code> that you specified in the array.
     * </p>
     * 
     * @param and
     *        Return results that match all <code>Expressions</code> that you specified in the array.
     */

    public void setAnd(java.util.Collection<Expression> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<Expression>(and);
    }

    /**
     * <p>
     * Return results that match all <code>Expressions</code> that you specified in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        Return results that match all <code>Expressions</code> that you specified in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAnd(Expression... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<Expression>(and.length));
        }
        for (Expression ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return results that match all <code>Expressions</code> that you specified in the array.
     * </p>
     * 
     * @param and
     *        Return results that match all <code>Expressions</code> that you specified in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAnd(java.util.Collection<Expression> and) {
        setAnd(and);
        return this;
    }

    /**
     * <p>
     * The specific dimension, values, and match type to filter objects with.
     * </p>
     * 
     * @param dimensions
     *        The specific dimension, values, and match type to filter objects with.
     */

    public void setDimensions(DimensionValues dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The specific dimension, values, and match type to filter objects with.
     * </p>
     * 
     * @return The specific dimension, values, and match type to filter objects with.
     */

    public DimensionValues getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The specific dimension, values, and match type to filter objects with.
     * </p>
     * 
     * @param dimensions
     *        The specific dimension, values, and match type to filter objects with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withDimensions(DimensionValues dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * Return results that don’t match the <code>Expression</code> that you specified.
     * </p>
     * 
     * @param not
     *        Return results that don’t match the <code>Expression</code> that you specified.
     */

    public void setNot(Expression not) {
        this.not = not;
    }

    /**
     * <p>
     * Return results that don’t match the <code>Expression</code> that you specified.
     * </p>
     * 
     * @return Return results that don’t match the <code>Expression</code> that you specified.
     */

    public Expression getNot() {
        return this.not;
    }

    /**
     * <p>
     * Return results that don’t match the <code>Expression</code> that you specified.
     * </p>
     * 
     * @param not
     *        Return results that don’t match the <code>Expression</code> that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withNot(Expression not) {
        setNot(not);
        return this;
    }

    /**
     * <p>
     * Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * </p>
     * 
     * @return Return results that match any of the <code>Expressions</code> that you specified. in the array.
     */

    public java.util.List<Expression> getOr() {
        return or;
    }

    /**
     * <p>
     * Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * </p>
     * 
     * @param or
     *        Return results that match any of the <code>Expressions</code> that you specified. in the array.
     */

    public void setOr(java.util.Collection<Expression> or) {
        if (or == null) {
            this.or = null;
            return;
        }

        this.or = new java.util.ArrayList<Expression>(or);
    }

    /**
     * <p>
     * Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOr(java.util.Collection)} or {@link #withOr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param or
     *        Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withOr(Expression... or) {
        if (this.or == null) {
            setOr(new java.util.ArrayList<Expression>(or.length));
        }
        for (Expression ele : or) {
            this.or.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * </p>
     * 
     * @param or
     *        Return results that match any of the <code>Expressions</code> that you specified. in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withOr(java.util.Collection<Expression> or) {
        setOr(or);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getNot() != null)
            sb.append("Not: ").append(getNot()).append(",");
        if (getOr() != null)
            sb.append("Or: ").append(getOr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expression == false)
            return false;
        Expression other = (Expression) obj;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getNot() == null ^ this.getNot() == null)
            return false;
        if (other.getNot() != null && other.getNot().equals(this.getNot()) == false)
            return false;
        if (other.getOr() == null ^ this.getOr() == null)
            return false;
        if (other.getOr() != null && other.getOr().equals(this.getOr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getNot() == null) ? 0 : getNot().hashCode());
        hashCode = prime * hashCode + ((getOr() == null) ? 0 : getOr().hashCode());
        return hashCode;
    }

    @Override
    public Expression clone() {
        try {
            return (Expression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.freetier.model.transform.ExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
