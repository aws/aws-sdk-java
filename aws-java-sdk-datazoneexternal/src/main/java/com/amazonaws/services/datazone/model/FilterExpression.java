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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter expression in Amazon DataZone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/FilterExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The search filter expression.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The search filter explresison type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The search filter expression.
     * </p>
     * 
     * @param expression
     *        The search filter expression.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The search filter expression.
     * </p>
     * 
     * @return The search filter expression.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The search filter expression.
     * </p>
     * 
     * @param expression
     *        The search filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The search filter explresison type.
     * </p>
     * 
     * @param type
     *        The search filter explresison type.
     * @see FilterExpressionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The search filter explresison type.
     * </p>
     * 
     * @return The search filter explresison type.
     * @see FilterExpressionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The search filter explresison type.
     * </p>
     * 
     * @param type
     *        The search filter explresison type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterExpressionType
     */

    public FilterExpression withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The search filter explresison type.
     * </p>
     * 
     * @param type
     *        The search filter explresison type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterExpressionType
     */

    public FilterExpression withType(FilterExpressionType type) {
        this.type = type.toString();
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
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
        com.amazonaws.services.datazone.model.transform.FilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
