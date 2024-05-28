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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A specific result obtained by specifying the name, value, and operator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are
     * joined with an OR, and the request returns all results that match any of the specified values
     * </p>
     */
    private String value;
    /**
     * <p>
     * The operator for the filter.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @return The name of the filter. Filter names are case-sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are
     * joined with an OR, and the request returns all results that match any of the specified values
     * </p>
     * 
     * @param value
     *        The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the
     *        values are joined with an OR, and the request returns all results that match any of the specified values
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are
     * joined with an OR, and the request returns all results that match any of the specified values
     * </p>
     * 
     * @return The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the
     *         values are joined with an OR, and the request returns all results that match any of the specified values
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are
     * joined with an OR, and the request returns all results that match any of the specified values
     * </p>
     * 
     * @param value
     *        The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the
     *        values are joined with an OR, and the request returns all results that match any of the specified values
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The operator for the filter.
     * </p>
     * 
     * @param operator
     *        The operator for the filter.
     * @see FilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator for the filter.
     * </p>
     * 
     * @return The operator for the filter.
     * @see FilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator for the filter.
     * </p>
     * 
     * @param operator
     *        The operator for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public Filter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator for the filter.
     * </p>
     * 
     * @param operator
     *        The operator for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public Filter withOperator(FilterOperator operator) {
        this.operator = operator.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
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
        com.amazonaws.services.ssmsap.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
