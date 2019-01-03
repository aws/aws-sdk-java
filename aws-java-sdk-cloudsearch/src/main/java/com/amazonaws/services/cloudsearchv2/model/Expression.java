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
 * A named expression that can be evaluated at search time. Can be used to sort the search results, define other
 * expressions, or return computed information in the search results.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Expression implements Serializable, Cloneable {

    private String expressionName;

    private String expressionValue;

    /**
     * @param expressionName
     */

    public void setExpressionName(String expressionName) {
        this.expressionName = expressionName;
    }

    /**
     * @return
     */

    public String getExpressionName() {
        return this.expressionName;
    }

    /**
     * @param expressionName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withExpressionName(String expressionName) {
        setExpressionName(expressionName);
        return this;
    }

    /**
     * @param expressionValue
     */

    public void setExpressionValue(String expressionValue) {
        this.expressionValue = expressionValue;
    }

    /**
     * @return
     */

    public String getExpressionValue() {
        return this.expressionValue;
    }

    /**
     * @param expressionValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withExpressionValue(String expressionValue) {
        setExpressionValue(expressionValue);
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
        if (getExpressionName() != null)
            sb.append("ExpressionName: ").append(getExpressionName()).append(",");
        if (getExpressionValue() != null)
            sb.append("ExpressionValue: ").append(getExpressionValue());
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
        if (other.getExpressionName() == null ^ this.getExpressionName() == null)
            return false;
        if (other.getExpressionName() != null && other.getExpressionName().equals(this.getExpressionName()) == false)
            return false;
        if (other.getExpressionValue() == null ^ this.getExpressionValue() == null)
            return false;
        if (other.getExpressionValue() != null && other.getExpressionValue().equals(this.getExpressionValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpressionName() == null) ? 0 : getExpressionName().hashCode());
        hashCode = prime * hashCode + ((getExpressionValue() == null) ? 0 : getExpressionValue().hashCode());
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

}
