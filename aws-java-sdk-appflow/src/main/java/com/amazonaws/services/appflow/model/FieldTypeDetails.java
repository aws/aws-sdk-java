/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details regarding the supported field type and the operators that can be applied for filtering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/FieldTypeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldTypeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of field, such as string, integer, date, and so on.
     * </p>
     */
    private String fieldType;
    /**
     * <p>
     * The list of operators supported by a field.
     * </p>
     */
    private java.util.List<String> filterOperators;
    /**
     * <p>
     * The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two values:
     * "true" and "false".
     * </p>
     */
    private java.util.List<String> supportedValues;

    /**
     * <p>
     * The type of field, such as string, integer, date, and so on.
     * </p>
     * 
     * @param fieldType
     *        The type of field, such as string, integer, date, and so on.
     */

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * <p>
     * The type of field, such as string, integer, date, and so on.
     * </p>
     * 
     * @return The type of field, such as string, integer, date, and so on.
     */

    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * <p>
     * The type of field, such as string, integer, date, and so on.
     * </p>
     * 
     * @param fieldType
     *        The type of field, such as string, integer, date, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldTypeDetails withFieldType(String fieldType) {
        setFieldType(fieldType);
        return this;
    }

    /**
     * <p>
     * The list of operators supported by a field.
     * </p>
     * 
     * @return The list of operators supported by a field.
     * @see Operator
     */

    public java.util.List<String> getFilterOperators() {
        return filterOperators;
    }

    /**
     * <p>
     * The list of operators supported by a field.
     * </p>
     * 
     * @param filterOperators
     *        The list of operators supported by a field.
     * @see Operator
     */

    public void setFilterOperators(java.util.Collection<String> filterOperators) {
        if (filterOperators == null) {
            this.filterOperators = null;
            return;
        }

        this.filterOperators = new java.util.ArrayList<String>(filterOperators);
    }

    /**
     * <p>
     * The list of operators supported by a field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterOperators(java.util.Collection)} or {@link #withFilterOperators(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param filterOperators
     *        The list of operators supported by a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FieldTypeDetails withFilterOperators(String... filterOperators) {
        if (this.filterOperators == null) {
            setFilterOperators(new java.util.ArrayList<String>(filterOperators.length));
        }
        for (String ele : filterOperators) {
            this.filterOperators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of operators supported by a field.
     * </p>
     * 
     * @param filterOperators
     *        The list of operators supported by a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FieldTypeDetails withFilterOperators(java.util.Collection<String> filterOperators) {
        setFilterOperators(filterOperators);
        return this;
    }

    /**
     * <p>
     * The list of operators supported by a field.
     * </p>
     * 
     * @param filterOperators
     *        The list of operators supported by a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FieldTypeDetails withFilterOperators(Operator... filterOperators) {
        java.util.ArrayList<String> filterOperatorsCopy = new java.util.ArrayList<String>(filterOperators.length);
        for (Operator value : filterOperators) {
            filterOperatorsCopy.add(value.toString());
        }
        if (getFilterOperators() == null) {
            setFilterOperators(filterOperatorsCopy);
        } else {
            getFilterOperators().addAll(filterOperatorsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two values:
     * "true" and "false".
     * </p>
     * 
     * @return The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two
     *         values: "true" and "false".
     */

    public java.util.List<String> getSupportedValues() {
        return supportedValues;
    }

    /**
     * <p>
     * The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two values:
     * "true" and "false".
     * </p>
     * 
     * @param supportedValues
     *        The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two
     *        values: "true" and "false".
     */

    public void setSupportedValues(java.util.Collection<String> supportedValues) {
        if (supportedValues == null) {
            this.supportedValues = null;
            return;
        }

        this.supportedValues = new java.util.ArrayList<String>(supportedValues);
    }

    /**
     * <p>
     * The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two values:
     * "true" and "false".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedValues(java.util.Collection)} or {@link #withSupportedValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedValues
     *        The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two
     *        values: "true" and "false".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldTypeDetails withSupportedValues(String... supportedValues) {
        if (this.supportedValues == null) {
            setSupportedValues(new java.util.ArrayList<String>(supportedValues.length));
        }
        for (String ele : supportedValues) {
            this.supportedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two values:
     * "true" and "false".
     * </p>
     * 
     * @param supportedValues
     *        The list of values that a field can contain. For example, a Boolean <code>fieldType</code> can have two
     *        values: "true" and "false".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldTypeDetails withSupportedValues(java.util.Collection<String> supportedValues) {
        setSupportedValues(supportedValues);
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
        if (getFieldType() != null)
            sb.append("FieldType: ").append(getFieldType()).append(",");
        if (getFilterOperators() != null)
            sb.append("FilterOperators: ").append(getFilterOperators()).append(",");
        if (getSupportedValues() != null)
            sb.append("SupportedValues: ").append(getSupportedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldTypeDetails == false)
            return false;
        FieldTypeDetails other = (FieldTypeDetails) obj;
        if (other.getFieldType() == null ^ this.getFieldType() == null)
            return false;
        if (other.getFieldType() != null && other.getFieldType().equals(this.getFieldType()) == false)
            return false;
        if (other.getFilterOperators() == null ^ this.getFilterOperators() == null)
            return false;
        if (other.getFilterOperators() != null && other.getFilterOperators().equals(this.getFilterOperators()) == false)
            return false;
        if (other.getSupportedValues() == null ^ this.getSupportedValues() == null)
            return false;
        if (other.getSupportedValues() != null && other.getSupportedValues().equals(this.getSupportedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldType() == null) ? 0 : getFieldType().hashCode());
        hashCode = prime * hashCode + ((getFilterOperators() == null) ? 0 : getFilterOperators().hashCode());
        hashCode = prime * hashCode + ((getSupportedValues() == null) ? 0 : getSupportedValues().hashCode());
        return hashCode;
    }

    @Override
    public FieldTypeDetails clone() {
        try {
            return (FieldTypeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.FieldTypeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
