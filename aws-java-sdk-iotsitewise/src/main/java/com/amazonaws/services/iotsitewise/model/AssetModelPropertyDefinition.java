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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an asset model property definition. This property definition is applied to all assets created from the asset
 * model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelPropertyDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelPropertyDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the property definition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this property.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The data type of the structure for this property. This parameter is required on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you define this property. Use
     * <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     * </p>
     */
    private String dataTypeSpec;
    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     * definition.
     * </p>
     */
    private PropertyType type;

    /**
     * <p>
     * The name of the property definition.
     * </p>
     * 
     * @param name
     *        The name of the property definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property definition.
     * </p>
     * 
     * @return The name of the property definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the property definition.
     * </p>
     * 
     * @param name
     *        The name of the property definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertyDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this property.
     * </p>
     * 
     * @param dataType
     *        The data type of the property definition.</p>
     *        <p>
     *        If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *        of the structure for this property.
     * @see PropertyDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this property.
     * </p>
     * 
     * @return The data type of the property definition.</p>
     *         <p>
     *         If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *         of the structure for this property.
     * @see PropertyDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this property.
     * </p>
     * 
     * @param dataType
     *        The data type of the property definition.</p>
     *        <p>
     *        If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *        of the structure for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public AssetModelPropertyDefinition withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this property.
     * </p>
     * 
     * @param dataType
     *        The data type of the property definition.</p>
     *        <p>
     *        If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *        of the structure for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public AssetModelPropertyDefinition withDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The data type of the structure for this property. This parameter is required on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you define this property. Use
     * <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     * </p>
     * 
     * @param dataTypeSpec
     *        The data type of the structure for this property. This parameter is required on properties that have the
     *        <code>STRUCT</code> data type.</p>
     *        <p>
     *        The options for this parameter depend on the type of the composite model in which you define this
     *        property. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     */

    public void setDataTypeSpec(String dataTypeSpec) {
        this.dataTypeSpec = dataTypeSpec;
    }

    /**
     * <p>
     * The data type of the structure for this property. This parameter is required on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you define this property. Use
     * <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     * </p>
     * 
     * @return The data type of the structure for this property. This parameter is required on properties that have the
     *         <code>STRUCT</code> data type.</p>
     *         <p>
     *         The options for this parameter depend on the type of the composite model in which you define this
     *         property. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     */

    public String getDataTypeSpec() {
        return this.dataTypeSpec;
    }

    /**
     * <p>
     * The data type of the structure for this property. This parameter is required on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you define this property. Use
     * <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     * </p>
     * 
     * @param dataTypeSpec
     *        The data type of the structure for this property. This parameter is required on properties that have the
     *        <code>STRUCT</code> data type.</p>
     *        <p>
     *        The options for this parameter depend on the type of the composite model in which you define this
     *        property. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertyDefinition withDataTypeSpec(String dataTypeSpec) {
        setDataTypeSpec(dataTypeSpec);
        return this;
    }

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     * 
     * @param unit
     *        The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     * 
     * @return The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     * 
     * @param unit
     *        The unit of the property definition, such as <code>Newtons</code> or <code>RPM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertyDefinition withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     * definition.
     * </p>
     * 
     * @param type
     *        The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     *        definition.
     */

    public void setType(PropertyType type) {
        this.type = type;
    }

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     * definition.
     * </p>
     * 
     * @return The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     *         definition.
     */

    public PropertyType getType() {
        return this.type;
    }

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     * definition.
     * </p>
     * 
     * @param type
     *        The property definition type (see <code>PropertyType</code>). You can only specify one type in a property
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertyDefinition withType(PropertyType type) {
        setType(type);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDataTypeSpec() != null)
            sb.append("DataTypeSpec: ").append(getDataTypeSpec()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
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

        if (obj instanceof AssetModelPropertyDefinition == false)
            return false;
        AssetModelPropertyDefinition other = (AssetModelPropertyDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDataTypeSpec() == null ^ this.getDataTypeSpec() == null)
            return false;
        if (other.getDataTypeSpec() != null && other.getDataTypeSpec().equals(this.getDataTypeSpec()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataTypeSpec() == null) ? 0 : getDataTypeSpec().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelPropertyDefinition clone() {
        try {
            return (AssetModelPropertyDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelPropertyDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
