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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetPropertyValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the asset property.
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
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyValueRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @return The ID of the asset property.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyValueRequest withPropertyId(String propertyId) {
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

    public GetAssetPropertyValueRequest withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId()).append(",");
        if (getPropertyAlias() != null)
            sb.append("PropertyAlias: ").append(getPropertyAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetPropertyValueRequest == false)
            return false;
        GetAssetPropertyValueRequest other = (GetAssetPropertyValueRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetPropertyValueRequest clone() {
        return (GetAssetPropertyValueRequest) super.clone();
    }

}
