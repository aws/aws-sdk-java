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
 * An object that specifies the data type of a property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DataType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The underlying type of the data type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The nested type in the data type.
     * </p>
     */
    private DataType nestedType;
    /**
     * <p>
     * The allowed values for this data type.
     * </p>
     */
    private java.util.List<DataValue> allowedValues;
    /**
     * <p>
     * The unit of measure used in this data type.
     * </p>
     */
    private String unitOfMeasure;
    /**
     * <p>
     * A relationship that associates a component with another component.
     * </p>
     */
    private Relationship relationship;

    /**
     * <p>
     * The underlying type of the data type.
     * </p>
     * 
     * @param type
     *        The underlying type of the data type.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The underlying type of the data type.
     * </p>
     * 
     * @return The underlying type of the data type.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The underlying type of the data type.
     * </p>
     * 
     * @param type
     *        The underlying type of the data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public DataType withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The underlying type of the data type.
     * </p>
     * 
     * @param type
     *        The underlying type of the data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public DataType withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The nested type in the data type.
     * </p>
     * 
     * @param nestedType
     *        The nested type in the data type.
     */

    public void setNestedType(DataType nestedType) {
        this.nestedType = nestedType;
    }

    /**
     * <p>
     * The nested type in the data type.
     * </p>
     * 
     * @return The nested type in the data type.
     */

    public DataType getNestedType() {
        return this.nestedType;
    }

    /**
     * <p>
     * The nested type in the data type.
     * </p>
     * 
     * @param nestedType
     *        The nested type in the data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataType withNestedType(DataType nestedType) {
        setNestedType(nestedType);
        return this;
    }

    /**
     * <p>
     * The allowed values for this data type.
     * </p>
     * 
     * @return The allowed values for this data type.
     */

    public java.util.List<DataValue> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The allowed values for this data type.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values for this data type.
     */

    public void setAllowedValues(java.util.Collection<DataValue> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<DataValue>(allowedValues);
    }

    /**
     * <p>
     * The allowed values for this data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values for this data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataType withAllowedValues(DataValue... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<DataValue>(allowedValues.length));
        }
        for (DataValue ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed values for this data type.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values for this data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataType withAllowedValues(java.util.Collection<DataValue> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The unit of measure used in this data type.
     * </p>
     * 
     * @param unitOfMeasure
     *        The unit of measure used in this data type.
     */

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * <p>
     * The unit of measure used in this data type.
     * </p>
     * 
     * @return The unit of measure used in this data type.
     */

    public String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * <p>
     * The unit of measure used in this data type.
     * </p>
     * 
     * @param unitOfMeasure
     *        The unit of measure used in this data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataType withUnitOfMeasure(String unitOfMeasure) {
        setUnitOfMeasure(unitOfMeasure);
        return this;
    }

    /**
     * <p>
     * A relationship that associates a component with another component.
     * </p>
     * 
     * @param relationship
     *        A relationship that associates a component with another component.
     */

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    /**
     * <p>
     * A relationship that associates a component with another component.
     * </p>
     * 
     * @return A relationship that associates a component with another component.
     */

    public Relationship getRelationship() {
        return this.relationship;
    }

    /**
     * <p>
     * A relationship that associates a component with another component.
     * </p>
     * 
     * @param relationship
     *        A relationship that associates a component with another component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataType withRelationship(Relationship relationship) {
        setRelationship(relationship);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNestedType() != null)
            sb.append("NestedType: ").append(getNestedType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getUnitOfMeasure() != null)
            sb.append("UnitOfMeasure: ").append(getUnitOfMeasure()).append(",");
        if (getRelationship() != null)
            sb.append("Relationship: ").append(getRelationship());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataType == false)
            return false;
        DataType other = (DataType) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNestedType() == null ^ this.getNestedType() == null)
            return false;
        if (other.getNestedType() != null && other.getNestedType().equals(this.getNestedType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getUnitOfMeasure() == null ^ this.getUnitOfMeasure() == null)
            return false;
        if (other.getUnitOfMeasure() != null && other.getUnitOfMeasure().equals(this.getUnitOfMeasure()) == false)
            return false;
        if (other.getRelationship() == null ^ this.getRelationship() == null)
            return false;
        if (other.getRelationship() != null && other.getRelationship().equals(this.getRelationship()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNestedType() == null) ? 0 : getNestedType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getUnitOfMeasure() == null) ? 0 : getUnitOfMeasure().hashCode());
        hashCode = prime * hashCode + ((getRelationship() == null) ? 0 : getRelationship().hashCode());
        return hashCode;
    }

    @Override
    public DataType clone() {
        try {
            return (DataType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.DataTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
