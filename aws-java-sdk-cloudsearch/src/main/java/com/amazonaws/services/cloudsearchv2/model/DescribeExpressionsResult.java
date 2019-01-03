/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeExpressions</code> request. Contains the expressions configured for the domain
 * specified in the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExpressionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The expressions configured for the domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExpressionStatus> expressions;

    /**
     * <p>
     * The expressions configured for the domain.
     * </p>
     * 
     * @return The expressions configured for the domain.
     */

    public java.util.List<ExpressionStatus> getExpressions() {
        if (expressions == null) {
            expressions = new com.amazonaws.internal.SdkInternalList<ExpressionStatus>();
        }
        return expressions;
    }

    /**
     * <p>
     * The expressions configured for the domain.
     * </p>
     * 
     * @param expressions
     *        The expressions configured for the domain.
     */

    public void setExpressions(java.util.Collection<ExpressionStatus> expressions) {
        if (expressions == null) {
            this.expressions = null;
            return;
        }

        this.expressions = new com.amazonaws.internal.SdkInternalList<ExpressionStatus>(expressions);
    }

    /**
     * <p>
     * The expressions configured for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpressions(java.util.Collection)} or {@link #withExpressions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param expressions
     *        The expressions configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExpressionsResult withExpressions(ExpressionStatus... expressions) {
        if (this.expressions == null) {
            setExpressions(new com.amazonaws.internal.SdkInternalList<ExpressionStatus>(expressions.length));
        }
        for (ExpressionStatus ele : expressions) {
            this.expressions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The expressions configured for the domain.
     * </p>
     * 
     * @param expressions
     *        The expressions configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExpressionsResult withExpressions(java.util.Collection<ExpressionStatus> expressions) {
        setExpressions(expressions);
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
        if (getExpressions() != null)
            sb.append("Expressions: ").append(getExpressions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExpressionsResult == false)
            return false;
        DescribeExpressionsResult other = (DescribeExpressionsResult) obj;
        if (other.getExpressions() == null ^ this.getExpressions() == null)
            return false;
        if (other.getExpressions() != null && other.getExpressions().equals(this.getExpressions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpressions() == null) ? 0 : getExpressions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExpressionsResult clone() {
        try {
            return (DescribeExpressionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
