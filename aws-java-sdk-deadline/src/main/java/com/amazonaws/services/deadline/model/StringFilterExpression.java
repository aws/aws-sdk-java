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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Searches for a particular string.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StringFilterExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringFilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field name to search.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of comparison to use for this search.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The string to search for.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The field name to search.
     * </p>
     * 
     * @param name
     *        The field name to search.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The field name to search.
     * </p>
     * 
     * @return The field name to search.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The field name to search.
     * </p>
     * 
     * @param name
     *        The field name to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringFilterExpression withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of comparison to use for this search.
     * </p>
     * 
     * @param operator
     *        The type of comparison to use for this search.
     * @see ComparisonOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The type of comparison to use for this search.
     * </p>
     * 
     * @return The type of comparison to use for this search.
     * @see ComparisonOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The type of comparison to use for this search.
     * </p>
     * 
     * @param operator
     *        The type of comparison to use for this search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public StringFilterExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The type of comparison to use for this search.
     * </p>
     * 
     * @param operator
     *        The type of comparison to use for this search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public StringFilterExpression withOperator(ComparisonOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The string to search for.
     * </p>
     * 
     * @param value
     *        The string to search for.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The string to search for.
     * </p>
     * 
     * @return The string to search for.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The string to search for.
     * </p>
     * 
     * @param value
     *        The string to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringFilterExpression withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof StringFilterExpression == false)
            return false;
        StringFilterExpression other = (StringFilterExpression) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public StringFilterExpression clone() {
        try {
            return (StringFilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StringFilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
