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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that filters items returned by a property request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property name associated with this property filter.
     * </p>
     */
    private String propertyName;
    /**
     * <p>
     * The operator associated with this property filter.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The value associated with this property filter.
     * </p>
     */
    private DataValue value;

    /**
     * <p>
     * The property name associated with this property filter.
     * </p>
     * 
     * @param propertyName
     *        The property name associated with this property filter.
     */

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * The property name associated with this property filter.
     * </p>
     * 
     * @return The property name associated with this property filter.
     */

    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * <p>
     * The property name associated with this property filter.
     * </p>
     * 
     * @param propertyName
     *        The property name associated with this property filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyFilter withPropertyName(String propertyName) {
        setPropertyName(propertyName);
        return this;
    }

    /**
     * <p>
     * The operator associated with this property filter.
     * </p>
     * 
     * @param operator
     *        The operator associated with this property filter.
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator associated with this property filter.
     * </p>
     * 
     * @return The operator associated with this property filter.
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator associated with this property filter.
     * </p>
     * 
     * @param operator
     *        The operator associated with this property filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The value associated with this property filter.
     * </p>
     * 
     * @param value
     *        The value associated with this property filter.
     */

    public void setValue(DataValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value associated with this property filter.
     * </p>
     * 
     * @return The value associated with this property filter.
     */

    public DataValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value associated with this property filter.
     * </p>
     * 
     * @param value
     *        The value associated with this property filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyFilter withValue(DataValue value) {
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
        if (getPropertyName() != null)
            sb.append("PropertyName: ").append(getPropertyName()).append(",");
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

        if (obj instanceof PropertyFilter == false)
            return false;
        PropertyFilter other = (PropertyFilter) obj;
        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null && other.getPropertyName().equals(this.getPropertyName()) == false)
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

        hashCode = prime * hashCode + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PropertyFilter clone() {
        try {
            return (PropertyFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
