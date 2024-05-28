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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is an object that contains the information of a property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the schema for the property.
     * </p>
     */
    private PropertyDefinitionResponse definition;
    /**
     * <p>
     * This is the name of the property.
     * </p>
     */
    private String propertyName;
    /**
     * <p>
     * This is the value for the property.
     * </p>
     */
    private DataValue value;
    /**
     * <p>
     * This flag notes whether all values of a list or map type property are returned in the API response. The maximum
     * number of values per property returned is 50.
     * </p>
     */
    private Boolean areAllPropertyValuesReturned;

    /**
     * <p>
     * This is the schema for the property.
     * </p>
     * 
     * @param definition
     *        This is the schema for the property.
     */

    public void setDefinition(PropertyDefinitionResponse definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * This is the schema for the property.
     * </p>
     * 
     * @return This is the schema for the property.
     */

    public PropertyDefinitionResponse getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * This is the schema for the property.
     * </p>
     * 
     * @param definition
     *        This is the schema for the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertySummary withDefinition(PropertyDefinitionResponse definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * This is the name of the property.
     * </p>
     * 
     * @param propertyName
     *        This is the name of the property.
     */

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * This is the name of the property.
     * </p>
     * 
     * @return This is the name of the property.
     */

    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * <p>
     * This is the name of the property.
     * </p>
     * 
     * @param propertyName
     *        This is the name of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertySummary withPropertyName(String propertyName) {
        setPropertyName(propertyName);
        return this;
    }

    /**
     * <p>
     * This is the value for the property.
     * </p>
     * 
     * @param value
     *        This is the value for the property.
     */

    public void setValue(DataValue value) {
        this.value = value;
    }

    /**
     * <p>
     * This is the value for the property.
     * </p>
     * 
     * @return This is the value for the property.
     */

    public DataValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * This is the value for the property.
     * </p>
     * 
     * @param value
     *        This is the value for the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertySummary withValue(DataValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * This flag notes whether all values of a list or map type property are returned in the API response. The maximum
     * number of values per property returned is 50.
     * </p>
     * 
     * @param areAllPropertyValuesReturned
     *        This flag notes whether all values of a list or map type property are returned in the API response. The
     *        maximum number of values per property returned is 50.
     */

    public void setAreAllPropertyValuesReturned(Boolean areAllPropertyValuesReturned) {
        this.areAllPropertyValuesReturned = areAllPropertyValuesReturned;
    }

    /**
     * <p>
     * This flag notes whether all values of a list or map type property are returned in the API response. The maximum
     * number of values per property returned is 50.
     * </p>
     * 
     * @return This flag notes whether all values of a list or map type property are returned in the API response. The
     *         maximum number of values per property returned is 50.
     */

    public Boolean getAreAllPropertyValuesReturned() {
        return this.areAllPropertyValuesReturned;
    }

    /**
     * <p>
     * This flag notes whether all values of a list or map type property are returned in the API response. The maximum
     * number of values per property returned is 50.
     * </p>
     * 
     * @param areAllPropertyValuesReturned
     *        This flag notes whether all values of a list or map type property are returned in the API response. The
     *        maximum number of values per property returned is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertySummary withAreAllPropertyValuesReturned(Boolean areAllPropertyValuesReturned) {
        setAreAllPropertyValuesReturned(areAllPropertyValuesReturned);
        return this;
    }

    /**
     * <p>
     * This flag notes whether all values of a list or map type property are returned in the API response. The maximum
     * number of values per property returned is 50.
     * </p>
     * 
     * @return This flag notes whether all values of a list or map type property are returned in the API response. The
     *         maximum number of values per property returned is 50.
     */

    public Boolean isAreAllPropertyValuesReturned() {
        return this.areAllPropertyValuesReturned;
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getPropertyName() != null)
            sb.append("PropertyName: ").append(getPropertyName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getAreAllPropertyValuesReturned() != null)
            sb.append("AreAllPropertyValuesReturned: ").append(getAreAllPropertyValuesReturned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertySummary == false)
            return false;
        PropertySummary other = (PropertySummary) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null && other.getPropertyName().equals(this.getPropertyName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAreAllPropertyValuesReturned() == null ^ this.getAreAllPropertyValuesReturned() == null)
            return false;
        if (other.getAreAllPropertyValuesReturned() != null && other.getAreAllPropertyValuesReturned().equals(this.getAreAllPropertyValuesReturned()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAreAllPropertyValuesReturned() == null) ? 0 : getAreAllPropertyValuesReturned().hashCode());
        return hashCode;
    }

    @Override
    public PropertySummary clone() {
        try {
            return (PropertySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
