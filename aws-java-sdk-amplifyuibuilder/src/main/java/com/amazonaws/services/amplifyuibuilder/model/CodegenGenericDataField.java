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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a field in a generic data schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenGenericDataField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenGenericDataField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data type for the generic data field.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The value of the data type for the generic data field.
     * </p>
     */
    private String dataTypeValue;
    /**
     * <p>
     * Specifies whether the generic data field is required.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * Specifies whether the generic data field is read-only.
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * Specifies whether the generic data field is an array.
     * </p>
     */
    private Boolean isArray;
    /**
     * <p>
     * The relationship of the generic data schema.
     * </p>
     */
    private CodegenGenericDataRelationshipType relationship;

    /**
     * <p>
     * The data type for the generic data field.
     * </p>
     * 
     * @param dataType
     *        The data type for the generic data field.
     * @see CodegenGenericDataFieldDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type for the generic data field.
     * </p>
     * 
     * @return The data type for the generic data field.
     * @see CodegenGenericDataFieldDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type for the generic data field.
     * </p>
     * 
     * @param dataType
     *        The data type for the generic data field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodegenGenericDataFieldDataType
     */

    public CodegenGenericDataField withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type for the generic data field.
     * </p>
     * 
     * @param dataType
     *        The data type for the generic data field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodegenGenericDataFieldDataType
     */

    public CodegenGenericDataField withDataType(CodegenGenericDataFieldDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the data type for the generic data field.
     * </p>
     * 
     * @param dataTypeValue
     *        The value of the data type for the generic data field.
     */

    public void setDataTypeValue(String dataTypeValue) {
        this.dataTypeValue = dataTypeValue;
    }

    /**
     * <p>
     * The value of the data type for the generic data field.
     * </p>
     * 
     * @return The value of the data type for the generic data field.
     */

    public String getDataTypeValue() {
        return this.dataTypeValue;
    }

    /**
     * <p>
     * The value of the data type for the generic data field.
     * </p>
     * 
     * @param dataTypeValue
     *        The value of the data type for the generic data field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataField withDataTypeValue(String dataTypeValue) {
        setDataTypeValue(dataTypeValue);
        return this;
    }

    /**
     * <p>
     * Specifies whether the generic data field is required.
     * </p>
     * 
     * @param required
     *        Specifies whether the generic data field is required.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Specifies whether the generic data field is required.
     * </p>
     * 
     * @return Specifies whether the generic data field is required.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies whether the generic data field is required.
     * </p>
     * 
     * @param required
     *        Specifies whether the generic data field is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataField withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Specifies whether the generic data field is required.
     * </p>
     * 
     * @return Specifies whether the generic data field is required.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies whether the generic data field is read-only.
     * </p>
     * 
     * @param readOnly
     *        Specifies whether the generic data field is read-only.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * Specifies whether the generic data field is read-only.
     * </p>
     * 
     * @return Specifies whether the generic data field is read-only.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Specifies whether the generic data field is read-only.
     * </p>
     * 
     * @param readOnly
     *        Specifies whether the generic data field is read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataField withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * Specifies whether the generic data field is read-only.
     * </p>
     * 
     * @return Specifies whether the generic data field is read-only.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Specifies whether the generic data field is an array.
     * </p>
     * 
     * @param isArray
     *        Specifies whether the generic data field is an array.
     */

    public void setIsArray(Boolean isArray) {
        this.isArray = isArray;
    }

    /**
     * <p>
     * Specifies whether the generic data field is an array.
     * </p>
     * 
     * @return Specifies whether the generic data field is an array.
     */

    public Boolean getIsArray() {
        return this.isArray;
    }

    /**
     * <p>
     * Specifies whether the generic data field is an array.
     * </p>
     * 
     * @param isArray
     *        Specifies whether the generic data field is an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataField withIsArray(Boolean isArray) {
        setIsArray(isArray);
        return this;
    }

    /**
     * <p>
     * Specifies whether the generic data field is an array.
     * </p>
     * 
     * @return Specifies whether the generic data field is an array.
     */

    public Boolean isArray() {
        return this.isArray;
    }

    /**
     * <p>
     * The relationship of the generic data schema.
     * </p>
     * 
     * @param relationship
     *        The relationship of the generic data schema.
     */

    public void setRelationship(CodegenGenericDataRelationshipType relationship) {
        this.relationship = relationship;
    }

    /**
     * <p>
     * The relationship of the generic data schema.
     * </p>
     * 
     * @return The relationship of the generic data schema.
     */

    public CodegenGenericDataRelationshipType getRelationship() {
        return this.relationship;
    }

    /**
     * <p>
     * The relationship of the generic data schema.
     * </p>
     * 
     * @param relationship
     *        The relationship of the generic data schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataField withRelationship(CodegenGenericDataRelationshipType relationship) {
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDataTypeValue() != null)
            sb.append("DataTypeValue: ").append(getDataTypeValue()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getIsArray() != null)
            sb.append("IsArray: ").append(getIsArray()).append(",");
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

        if (obj instanceof CodegenGenericDataField == false)
            return false;
        CodegenGenericDataField other = (CodegenGenericDataField) obj;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDataTypeValue() == null ^ this.getDataTypeValue() == null)
            return false;
        if (other.getDataTypeValue() != null && other.getDataTypeValue().equals(this.getDataTypeValue()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getIsArray() == null ^ this.getIsArray() == null)
            return false;
        if (other.getIsArray() != null && other.getIsArray().equals(this.getIsArray()) == false)
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

        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataTypeValue() == null) ? 0 : getDataTypeValue().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getIsArray() == null) ? 0 : getIsArray().hashCode());
        hashCode = prime * hashCode + ((getRelationship() == null) ? 0 : getRelationship().hashCode());
        return hashCode;
    }

    @Override
    public CodegenGenericDataField clone() {
        try {
            return (CodegenGenericDataField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenGenericDataFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
