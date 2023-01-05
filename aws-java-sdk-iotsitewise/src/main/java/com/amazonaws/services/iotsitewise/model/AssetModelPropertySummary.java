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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of a property associated with a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelPropertySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelPropertySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the property.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the property.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The data type of the structure for this property. This parameter exists on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     */
    private String dataTypeSpec;
    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     * </p>
     */
    private String unit;

    private PropertyType type;
    /**
     * <p>
     * The ID of the composite model that contains the asset model property.
     * </p>
     */
    private String assetModelCompositeModelId;

    /**
     * <p>
     * The ID of the property.
     * </p>
     * 
     * @param id
     *        The ID of the property.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the property.
     * </p>
     * 
     * @return The ID of the property.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the property.
     * </p>
     * 
     * @param id
     *        The ID of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param name
     *        The name of the property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @return The name of the property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param name
     *        The name of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the property.
     * </p>
     * 
     * @param dataType
     *        The data type of the property.
     * @see PropertyDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the property.
     * </p>
     * 
     * @return The data type of the property.
     * @see PropertyDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the property.
     * </p>
     * 
     * @param dataType
     *        The data type of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public AssetModelPropertySummary withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the property.
     * </p>
     * 
     * @param dataType
     *        The data type of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public AssetModelPropertySummary withDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The data type of the structure for this property. This parameter exists on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * 
     * @param dataTypeSpec
     *        The data type of the structure for this property. This parameter exists on properties that have the
     *        <code>STRUCT</code> data type.
     */

    public void setDataTypeSpec(String dataTypeSpec) {
        this.dataTypeSpec = dataTypeSpec;
    }

    /**
     * <p>
     * The data type of the structure for this property. This parameter exists on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * 
     * @return The data type of the structure for this property. This parameter exists on properties that have the
     *         <code>STRUCT</code> data type.
     */

    public String getDataTypeSpec() {
        return this.dataTypeSpec;
    }

    /**
     * <p>
     * The data type of the structure for this property. This parameter exists on properties that have the
     * <code>STRUCT</code> data type.
     * </p>
     * 
     * @param dataTypeSpec
     *        The data type of the structure for this property. This parameter exists on properties that have the
     *        <code>STRUCT</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertySummary withDataTypeSpec(String dataTypeSpec) {
        setDataTypeSpec(dataTypeSpec);
        return this;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     * </p>
     * 
     * @param unit
     *        The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     * </p>
     * 
     * @return The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     * </p>
     * 
     * @param unit
     *        The unit (such as <code>Newtons</code> or <code>RPM</code>) of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertySummary withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * @param type
     */

    public void setType(PropertyType type) {
        this.type = type;
    }

    /**
     * @return
     */

    public PropertyType getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertySummary withType(PropertyType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The ID of the composite model that contains the asset model property.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of the composite model that contains the asset model property.
     */

    public void setAssetModelCompositeModelId(String assetModelCompositeModelId) {
        this.assetModelCompositeModelId = assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of the composite model that contains the asset model property.
     * </p>
     * 
     * @return The ID of the composite model that contains the asset model property.
     */

    public String getAssetModelCompositeModelId() {
        return this.assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of the composite model that contains the asset model property.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of the composite model that contains the asset model property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelPropertySummary withAssetModelCompositeModelId(String assetModelCompositeModelId) {
        setAssetModelCompositeModelId(assetModelCompositeModelId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDataTypeSpec() != null)
            sb.append("DataTypeSpec: ").append(getDataTypeSpec()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAssetModelCompositeModelId() != null)
            sb.append("AssetModelCompositeModelId: ").append(getAssetModelCompositeModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelPropertySummary == false)
            return false;
        AssetModelPropertySummary other = (AssetModelPropertySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
        if (other.getAssetModelCompositeModelId() == null ^ this.getAssetModelCompositeModelId() == null)
            return false;
        if (other.getAssetModelCompositeModelId() != null && other.getAssetModelCompositeModelId().equals(this.getAssetModelCompositeModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataTypeSpec() == null) ? 0 : getDataTypeSpec().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelId() == null) ? 0 : getAssetModelCompositeModelId().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelPropertySummary clone() {
        try {
            return (AssetModelPropertySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelPropertySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
