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
 * Contains a summary of a property associated with an asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetPropertySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the property.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The unit of measure (such as Newtons or RPM) of the asset property.
     * </p>
     */
    private String unit;

    private PropertyNotification notification;
    /**
     * <p>
     * The ID of the composite model that contains the asset property.
     * </p>
     */
    private String assetCompositeModelId;
    /**
     * <p>
     * The structured path to the property from the root of the asset.
     * </p>
     */
    private java.util.List<AssetPropertyPathSegment> path;
    /**
     * <p>
     * The external ID of the property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String externalId;

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

    public AssetPropertySummary withId(String id) {
        setId(id);
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
     * @param alias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param alias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The unit of measure (such as Newtons or RPM) of the asset property.
     * </p>
     * 
     * @param unit
     *        The unit of measure (such as Newtons or RPM) of the asset property.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure (such as Newtons or RPM) of the asset property.
     * </p>
     * 
     * @return The unit of measure (such as Newtons or RPM) of the asset property.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure (such as Newtons or RPM) of the asset property.
     * </p>
     * 
     * @param unit
     *        The unit of measure (such as Newtons or RPM) of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * @param notification
     */

    public void setNotification(PropertyNotification notification) {
        this.notification = notification;
    }

    /**
     * @return
     */

    public PropertyNotification getNotification() {
        return this.notification;
    }

    /**
     * @param notification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withNotification(PropertyNotification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The ID of the composite model that contains the asset property.
     * </p>
     * 
     * @param assetCompositeModelId
     *        The ID of the composite model that contains the asset property.
     */

    public void setAssetCompositeModelId(String assetCompositeModelId) {
        this.assetCompositeModelId = assetCompositeModelId;
    }

    /**
     * <p>
     * The ID of the composite model that contains the asset property.
     * </p>
     * 
     * @return The ID of the composite model that contains the asset property.
     */

    public String getAssetCompositeModelId() {
        return this.assetCompositeModelId;
    }

    /**
     * <p>
     * The ID of the composite model that contains the asset property.
     * </p>
     * 
     * @param assetCompositeModelId
     *        The ID of the composite model that contains the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withAssetCompositeModelId(String assetCompositeModelId) {
        setAssetCompositeModelId(assetCompositeModelId);
        return this;
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset.
     * </p>
     * 
     * @return The structured path to the property from the root of the asset.
     */

    public java.util.List<AssetPropertyPathSegment> getPath() {
        return path;
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset.
     * </p>
     * 
     * @param path
     *        The structured path to the property from the root of the asset.
     */

    public void setPath(java.util.Collection<AssetPropertyPathSegment> path) {
        if (path == null) {
            this.path = null;
            return;
        }

        this.path = new java.util.ArrayList<AssetPropertyPathSegment>(path);
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPath(java.util.Collection)} or {@link #withPath(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param path
     *        The structured path to the property from the root of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withPath(AssetPropertyPathSegment... path) {
        if (this.path == null) {
            setPath(new java.util.ArrayList<AssetPropertyPathSegment>(path.length));
        }
        for (AssetPropertyPathSegment ele : path) {
            this.path.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The structured path to the property from the root of the asset.
     * </p>
     * 
     * @param path
     *        The structured path to the property from the root of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withPath(java.util.Collection<AssetPropertyPathSegment> path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The external ID of the property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID of the property. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of the property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The external ID of the property. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of the property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID of the property. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertySummary withExternalId(String externalId) {
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getAssetCompositeModelId() != null)
            sb.append("AssetCompositeModelId: ").append(getAssetCompositeModelId()).append(",");
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

        if (obj instanceof AssetPropertySummary == false)
            return false;
        AssetPropertySummary other = (AssetPropertySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getAssetCompositeModelId() == null ^ this.getAssetCompositeModelId() == null)
            return false;
        if (other.getAssetCompositeModelId() != null && other.getAssetCompositeModelId().equals(this.getAssetCompositeModelId()) == false)
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
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelId() == null) ? 0 : getAssetCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public AssetPropertySummary clone() {
        try {
            return (AssetPropertySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetPropertySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
