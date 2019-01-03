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
 * The result of a <code><a>DeleteExpression</a></code> request. Specifies the expression being deleted.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteExpressionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the expression being deleted.
     * </p>
     */
    private ExpressionStatus expression;

    /**
     * <p>
     * The status of the expression being deleted.
     * </p>
     * 
     * @param expression
     *        The status of the expression being deleted.
     */

    public void setExpression(ExpressionStatus expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The status of the expression being deleted.
     * </p>
     * 
     * @return The status of the expression being deleted.
     */

    public ExpressionStatus getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The status of the expression being deleted.
     * </p>
     * 
     * @param expression
     *        The status of the expression being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExpressionResult withExpression(ExpressionStatus expression) {
        setExpression(expression);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteExpressionResult == false)
            return false;
        DeleteExpressionResult other = (DeleteExpressionResult) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public DeleteExpressionResult clone() {
        try {
            return (DeleteExpressionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
