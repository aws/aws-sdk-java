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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an asset model property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset model property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are callling <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT SiteWise
     * automatically generates a unique ID for you, so this parameter is never required. However, if you prefer to
     * supply your own ID instead, you can specify it here in UUID format. If you specify your own ID, it must be
     * globally unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual ID in
     * UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references">
     * Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String id;
    /**
     * <p>
     * The name of the asset model property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the asset model property.
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
     * The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The property type (see <code>PropertyType</code>).
     * </p>
     */
    private PropertyType type;
    /**
     * <p>
     * The structured path to the property from the root of the asset model.
     * </p>
     */
    private java.util.List<AssetModelPropertyPathSegment> path;
    /**
     * <p>
     * The external ID (if any) provided in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call to <a
     * href
     * ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">UpdateAssetModel</a>.
     * However, you can't change the external ID if one is already assigned. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The ID of the asset model property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are callling <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT SiteWise
     * automatically generates a unique ID for you, so this parameter is never required. However, if you prefer to
     * supply your own ID instead, you can specify it here in UUID format. If you specify your own ID, it must be
     * globally unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual ID in
     * UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references">
     * Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param id
     *        The ID of the asset model property.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are callling <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT
     *        SiteWise automatically generates a unique ID for you, so this parameter is never required. However, if you
     *        prefer to supply your own ID instead, you can specify it here in UUID format. If you specify your own ID,
     *        it must be globally unique.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual
     *        ID in UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     *        </p>
     *        </li>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset model property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are callling <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT SiteWise
     * automatically generates a unique ID for you, so this parameter is never required. However, if you prefer to
     * supply your own ID instead, you can specify it here in UUID format. If you specify your own ID, it must be
     * globally unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual ID in
     * UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references">
     * Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the asset model property.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are callling <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *         >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT
     *         SiteWise automatically generates a unique ID for you, so this parameter is never required. However, if
     *         you prefer to supply your own ID instead, you can specify it here in UUID format. If you specify your own
     *         ID, it must be globally unique.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual
     *         ID in UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *         >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     *         </p>
     *         </li>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset model property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are callling <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT SiteWise
     * automatically generates a unique ID for you, so this parameter is never required. However, if you prefer to
     * supply your own ID instead, you can specify it here in UUID format. If you specify your own ID, it must be
     * globally unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual ID in
     * UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references">
     * Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param id
     *        The ID of the asset model property.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are callling <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> to create a <i>new</i> property: You can specify its ID here, if desired. IoT
     *        SiteWise automatically generates a unique ID for you, so this parameter is never required. However, if you
     *        prefer to supply your own ID instead, you can specify it here in UUID format. If you specify your own ID,
     *        it must be globally unique.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are calling UpdateAssetModel to modify an <i>existing</i> property: This can be either the actual
     *        ID in UUID format, or else <code>externalId:</code> followed by the external ID, if it has one. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the asset model property.
     * </p>
     * 
     * @param name
     *        The name of the asset model property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset model property.
     * </p>
     * 
     * @return The name of the asset model property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset model property.
     * </p>
     * 
     * @param name
     *        The name of the asset model property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the asset model property.
     * </p>
     * 
     * @param dataType
     *        The data type of the asset model property.
     * @see PropertyDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the asset model property.
     * </p>
     * 
     * @return The data type of the asset model property.
     * @see PropertyDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the asset model property.
     * </p>
     * 
     * @param dataType
     *        The data type of the asset model property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public AssetModelProperty withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the asset model property.
     * </p>
     * 
     * @param dataType
     *        The data type of the asset model property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public AssetModelProperty withDataType(PropertyDataType dataType) {
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

    public AssetModelProperty withDataTypeSpec(String dataTypeSpec) {
        setDataTypeSpec(dataTypeSpec);
        return this;
    }

    /**
     * <p>
     * The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     * 
     * @param unit
     *        The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     * 
     * @return The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     * </p>
     * 
     * @param unit
     *        The unit of the asset model property, such as <code>Newtons</code> or <code>RPM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>).
     * </p>
     * 
     * @param type
     *        The property type (see <code>PropertyType</code>).
     */

    public void setType(PropertyType type) {
        this.type = type;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>).
     * </p>
     * 
     * @return The property type (see <code>PropertyType</code>).
     */

    public PropertyType getType() {
        return this.type;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>).
     * </p>
     * 
     * @param type
     *        The property type (see <code>PropertyType</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withType(PropertyType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset model.
     * </p>
     * 
     * @return The structured path to the property from the root of the asset model.
     */

    public java.util.List<AssetModelPropertyPathSegment> getPath() {
        return path;
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset model.
     * </p>
     * 
     * @param path
     *        The structured path to the property from the root of the asset model.
     */

    public void setPath(java.util.Collection<AssetModelPropertyPathSegment> path) {
        if (path == null) {
            this.path = null;
            return;
        }

        this.path = new java.util.ArrayList<AssetModelPropertyPathSegment>(path);
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPath(java.util.Collection)} or {@link #withPath(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param path
     *        The structured path to the property from the root of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withPath(AssetModelPropertyPathSegment... path) {
        if (this.path == null) {
            setPath(new java.util.ArrayList<AssetModelPropertyPathSegment>(path.length));
        }
        for (AssetModelPropertyPathSegment ele : path) {
            this.path.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset model.
     * </p>
     * 
     * @param path
     *        The structured path to the property from the root of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withPath(java.util.Collection<AssetModelPropertyPathSegment> path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The external ID (if any) provided in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call to <a
     * href
     * ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">UpdateAssetModel</a>.
     * However, you can't change the external ID if one is already assigned. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID (if any) provided in the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *        >CreateAssetModel</a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call
     *        to <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">
     *        UpdateAssetModel</a>. However, you can't change the external ID if one is already assigned. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID (if any) provided in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call to <a
     * href
     * ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">UpdateAssetModel</a>.
     * However, you can't change the external ID if one is already assigned. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The external ID (if any) provided in the <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *         >CreateAssetModel</a> or <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *         >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call
     *         to <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">
     *         UpdateAssetModel</a>. However, you can't change the external ID if one is already assigned. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID (if any) provided in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call to <a
     * href
     * ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">UpdateAssetModel</a>.
     * However, you can't change the external ID if one is already assigned. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID (if any) provided in the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *        >CreateAssetModel</a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> operation. You can assign an external ID by specifying this value as part of a call
     *        to <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html">
     *        UpdateAssetModel</a>. However, you can't change the external ID if one is already assigned. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelProperty withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelProperty == false)
            return false;
        AssetModelProperty other = (AssetModelProperty) obj;
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
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
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
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelProperty clone() {
        try {
            return (AssetModelProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
