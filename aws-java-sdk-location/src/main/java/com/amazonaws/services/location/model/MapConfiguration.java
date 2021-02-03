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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the map tile style selected from an available provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/MapConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     * <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>, <code>VectorEsriLightGrayCanvas</code>,
     * <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not use
     * HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     */
    private String style;

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     * <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>, <code>VectorEsriLightGrayCanvas</code>,
     * <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not use
     * HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param style
     *        Specifies the map style selected from an available data provider.</p>
     *        <p>
     *        Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     *        <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>,
     *        <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     *        </p>
     *        <note>
     *        <p>
     *        When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not
     *        use HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service
     *        Terms</a> for Amazon Location Service.
     *        </p>
     */

    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     * <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>, <code>VectorEsriLightGrayCanvas</code>,
     * <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not use
     * HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @return Specifies the map style selected from an available data provider.</p>
     *         <p>
     *         Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     *         <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>,
     *         <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     *         </p>
     *         <note>
     *         <p>
     *         When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not
     *         use HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service
     *         Terms</a> for Amazon Location Service.
     *         </p>
     */

    public String getStyle() {
        return this.style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     * <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>, <code>VectorEsriLightGrayCanvas</code>,
     * <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not use
     * HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param style
     *        Specifies the map style selected from an available data provider.</p>
     *        <p>
     *        Valid styles: <code>VectorEsriStreets</code>, <code>VectorEsriTopographic</code>,
     *        <code>VectorEsriNavigation</code>, <code>VectorEsriDarkGrayCanvas</code>,
     *        <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     *        </p>
     *        <note>
     *        <p>
     *        When using HERE as your data provider, and selecting the Style <code>VectorHereBerlin</code>, you may not
     *        use HERE Maps for Asset Management. See the <a href="https://aws.amazon.com/service-terms/">AWS Service
     *        Terms</a> for Amazon Location Service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapConfiguration withStyle(String style) {
        setStyle(style);
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
        if (getStyle() != null)
            sb.append("Style: ").append(getStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapConfiguration == false)
            return false;
        MapConfiguration other = (MapConfiguration) obj;
        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        return hashCode;
    }

    @Override
    public MapConfiguration clone() {
        try {
            return (MapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.MapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
