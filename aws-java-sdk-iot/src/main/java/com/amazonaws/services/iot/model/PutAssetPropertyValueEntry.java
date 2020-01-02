/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An asset property value entry containing the following information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAssetPropertyValueEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to better track which message caused an error in
     * case of failure. Accepts substitution templates. Defaults to a new UUID.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     */
    private String propertyId;
    /**
     * <p>
     * The name of the property alias associated with your asset property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     */
    private String propertyAlias;
    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
     * </p>
     */
    private java.util.List<AssetPropertyValue> propertyValues;

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to better track which message caused an error in
     * case of failure. Accepts substitution templates. Defaults to a new UUID.
     * </p>
     * 
     * @param entryId
     *        Optional. A unique identifier for this entry that you can define to better track which message caused an
     *        error in case of failure. Accepts substitution templates. Defaults to a new UUID.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to better track which message caused an error in
     * case of failure. Accepts substitution templates. Defaults to a new UUID.
     * </p>
     * 
     * @return Optional. A unique identifier for this entry that you can define to better track which message caused an
     *         error in case of failure. Accepts substitution templates. Defaults to a new UUID.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to better track which message caused an error in
     * case of failure. Accepts substitution templates. Defaults to a new UUID.
     * </p>
     * 
     * @param entryId
     *        Optional. A unique identifier for this entry that you can define to better track which message caused an
     *        error in case of failure. Accepts substitution templates. Defaults to a new UUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * 
     * @param assetId
     *        The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     *        <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * 
     * @return The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     *         <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * 
     * @param assetId
     *        The ID of the AWS IoT SiteWise asset. You must specify either a <code>propertyAlias</code> or both an
     *        <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     *        <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * 
     * @return The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     *         <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset's property. You must specify either a <code>propertyAlias</code> or both an
     *        <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The name of the property alias associated with your asset property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * 
     * @param propertyAlias
     *        The name of the property alias associated with your asset property. You must specify either a
     *        <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts
     *        substitution templates.
     */

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The name of the property alias associated with your asset property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * 
     * @return The name of the property alias associated with your asset property. You must specify either a
     *         <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts
     *         substitution templates.
     */

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    /**
     * <p>
     * The name of the property alias associated with your asset property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * 
     * @param propertyAlias
     *        The name of the property alias associated with your asset property. You must specify either a
     *        <code>propertyAlias</code> or both an <code>aliasId</code> and a <code>propertyId</code>. Accepts
     *        substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAssetPropertyValueEntry withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
        return this;
    }

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
     * </p>
     * 
     * @return A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
     */

    public java.util.List<AssetPropertyValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
     * </p>
     * 
     * @param propertyValues
     *        A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
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
     * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyValues(java.util.Collection)} or {@link #withPropertyValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param propertyValues
     *        A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
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
     * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
     * </p>
     * 
     * @param propertyValues
     *        A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
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
        com.amazonaws.services.iot.model.transform.PutAssetPropertyValueEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
