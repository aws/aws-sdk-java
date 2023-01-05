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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure representing the items in the response for SearchRasterDataCollection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ItemSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemSource implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private java.util.Map<String, AssetValue> assets;
    /** <p/> */
    private java.util.Date dateTime;
    /** <p/> */
    private Geometry geometry;
    /**
     * <p>
     * A unique Id for the source item.
     * </p>
     */
    private String id;
    /** <p/> */
    private Properties properties;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Map<String, AssetValue> getAssets() {
        return assets;
    }

    /**
     * <p/>
     * 
     * @param assets
     */

    public void setAssets(java.util.Map<String, AssetValue> assets) {
        this.assets = assets;
    }

    /**
     * <p/>
     * 
     * @param assets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource withAssets(java.util.Map<String, AssetValue> assets) {
        setAssets(assets);
        return this;
    }

    /**
     * Add a single Assets entry
     *
     * @see ItemSource#withAssets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource addAssetsEntry(String key, AssetValue value) {
        if (null == this.assets) {
            this.assets = new java.util.HashMap<String, AssetValue>();
        }
        if (this.assets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.assets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Assets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource clearAssetsEntries() {
        this.assets = null;
        return this;
    }

    /**
     * <p/>
     * 
     * @param dateTime
     */

    public void setDateTime(java.util.Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getDateTime() {
        return this.dateTime;
    }

    /**
     * <p/>
     * 
     * @param dateTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource withDateTime(java.util.Date dateTime) {
        setDateTime(dateTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @param geometry
     */

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Geometry getGeometry() {
        return this.geometry;
    }

    /**
     * <p/>
     * 
     * @param geometry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource withGeometry(Geometry geometry) {
        setGeometry(geometry);
        return this;
    }

    /**
     * <p>
     * A unique Id for the source item.
     * </p>
     * 
     * @param id
     *        A unique Id for the source item.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique Id for the source item.
     * </p>
     * 
     * @return A unique Id for the source item.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique Id for the source item.
     * </p>
     * 
     * @param id
     *        A unique Id for the source item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p/>
     * 
     * @param properties
     */

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Properties getProperties() {
        return this.properties;
    }

    /**
     * <p/>
     * 
     * @param properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemSource withProperties(Properties properties) {
        setProperties(properties);
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
        if (getAssets() != null)
            sb.append("Assets: ").append(getAssets()).append(",");
        if (getDateTime() != null)
            sb.append("DateTime: ").append(getDateTime()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemSource == false)
            return false;
        ItemSource other = (ItemSource) obj;
        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        if (other.getDateTime() == null ^ this.getDateTime() == null)
            return false;
        if (other.getDateTime() != null && other.getDateTime().equals(this.getDateTime()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        hashCode = prime * hashCode + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public ItemSource clone() {
        try {
            return (ItemSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ItemSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
