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
 * Contains a list of value updates for an asset property in the list of asset entries consumed by the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchPutAssetPropertyValue.html"
 * >BatchPutAssetPropertyValue</a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutAssetPropertyValueEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAssetPropertyValueEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify which entries failed.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     */
    private String propertyId;
    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String propertyAlias;
    /**
     * <p>
     * The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array elements.
     * </p>
     */
    private java.util.List<AssetPropertyValue> propertyValues;

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify which entries failed.
     * </p>
     * 
     * @param entryId
     *        The user specified ID for the entry. You can use this ID to identify which entries failed.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify which entries failed.
     * </p>
     * 
     * @return The user specified ID for the entry. You can use this ID to identify which entries failed.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify which entries failed.
     * </p>
     * 
     * @param entryId
     *        The user specified ID for the entry. You can use this ID to identify which entries failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to update.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     * 
     * @return The ID of the asset to update.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property for this entry.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     * 
     * @return The ID of the asset property for this entry.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property for this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param propertyAlias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *         industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param propertyAlias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
        return this;
    }

    /**
     * <p>
     * The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array elements.
     * </p>
     * 
     * @return The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array
     *         elements.
     */

    public java.util.List<AssetPropertyValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array elements.
     * </p>
     * 
     * @param propertyValues
     *        The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array
     *        elements.
     */

    public void setPropertyValues(java.util.Collection<AssetPropertyValue> propertyValues) {
        if (propertyValues == null) {
            this.propertyValues = null;
            return;
        }

        this.propertyValues = new java.util.ArrayList<AssetPropertyValue>(propertyValues);
    }

    /**
     * <p>
     * The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyValues(java.util.Collection)} or {@link #withPropertyValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param propertyValues
     *        The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array
     *        elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withPropertyValues(AssetPropertyValue... propertyValues) {
        if (this.propertyValues == null) {
            setPropertyValues(new java.util.ArrayList<AssetPropertyValue>(propertyValues.length));
        }
        for (AssetPropertyValue ele : propertyValues) {
            this.propertyValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array elements.
     * </p>
     * 
     * @param propertyValues
     *        The list of property values to upload. You can specify up to 10 <code>propertyValues</code> array
     *        elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withPropertyValues(java.util.Collection<AssetPropertyValue> propertyValues) {
        setPropertyValues(propertyValues);
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId()).append(",");
        if (getPropertyAlias() != null)
            sb.append("PropertyAlias: ").append(getPropertyAlias()).append(",");
        if (getPropertyValues() != null)
            sb.append("PropertyValues: ").append(getPropertyValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAssetPropertyValueEntry == false)
            return false;
        PutAssetPropertyValueEntry other = (PutAssetPropertyValueEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        if (other.getPropertyValues() == null ^ this.getPropertyValues() == null)
            return false;
        if (other.getPropertyValues() != null && other.getPropertyValues().equals(this.getPropertyValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode + ((getPropertyValues() == null) ? 0 : getPropertyValues().hashCode());
        return hashCode;
    }

    @Override
    public PutAssetPropertyValueEntry clone() {
        try {
            return (PutAssetPropertyValueEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.PutAssetPropertyValueEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
