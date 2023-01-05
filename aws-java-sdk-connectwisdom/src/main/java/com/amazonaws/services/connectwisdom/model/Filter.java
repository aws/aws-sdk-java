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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A search filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field on which to filter.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The operator to use for comparing the field’s value with the provided value.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The desired field value on which to filter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The field on which to filter.
     * </p>
     * 
     * @param field
     *        The field on which to filter.
     * @see FilterField
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field on which to filter.
     * </p>
     * 
     * @return The field on which to filter.
     * @see FilterField
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field on which to filter.
     * </p>
     * 
     * @param field
     *        The field on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterField
     */

    public Filter withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The field on which to filter.
     * </p>
     * 
     * @param field
     *        The field on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterField
     */

    public Filter withField(FilterField field) {
        this.field = field.toString();
        return this;
    }

    /**
     * <p>
     * The operator to use for comparing the field’s value with the provided value.
     * </p>
     * 
     * @param operator
     *        The operator to use for comparing the field’s value with the provided value.
     * @see FilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use for comparing the field’s value with the provided value.
     * </p>
     * 
     * @return The operator to use for comparing the field’s value with the provided value.
     * @see FilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use for comparing the field’s value with the provided value.
     * </p>
     * 
     * @param operator
     *        The operator to use for comparing the field’s value with the provided value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public Filter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to use for comparing the field’s value with the provided value.
     * </p>
     * 
     * @param operator
     *        The operator to use for comparing the field’s value with the provided value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public Filter withOperator(FilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The desired field value on which to filter.
     * </p>
     * 
     * @param value
     *        The desired field value on which to filter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The desired field value on which to filter.
     * </p>
     * 
     * @return The desired field value on which to filter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The desired field value on which to filter.
     * </p>
     * 
     * @param value
     *        The desired field value on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValue(String value) {
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
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

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
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

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
