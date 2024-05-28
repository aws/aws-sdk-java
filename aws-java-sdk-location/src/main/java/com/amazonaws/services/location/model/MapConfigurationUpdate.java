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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the political view for the style.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/MapConfigurationUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     * support custom layers, you can enable layer(s), such as <code>POI</code> layer for the VectorEsriNavigation
     * style. Default is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers">Custom
     * Layers</a>.
     * </p>
     * </note>
     */
    private java.util.List<String> customLayers;
    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not use a political view, or, for styles
     * that support specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views">Political
     * views</a> for more information.
     * </p>
     * </note>
     */
    private String politicalView;

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     * support custom layers, you can enable layer(s), such as <code>POI</code> layer for the VectorEsriNavigation
     * style. Default is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers">Custom
     * Layers</a>.
     * </p>
     * </note>
     * 
     * @return Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles
     *         that support custom layers, you can enable layer(s), such as <code>POI</code> layer for the
     *         VectorEsriNavigation style. Default is <code>unset</code>.</p> <note>
     *         <p>
     *         Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers">Custom
     *         Layers</a>.
     *         </p>
     */

    public java.util.List<String> getCustomLayers() {
        return customLayers;
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     * support custom layers, you can enable layer(s), such as <code>POI</code> layer for the VectorEsriNavigation
     * style. Default is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers">Custom
     * Layers</a>.
     * </p>
     * </note>
     * 
     * @param customLayers
     *        Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     *        support custom layers, you can enable layer(s), such as <code>POI</code> layer for the
     *        VectorEsriNavigation style. Default is <code>unset</code>.</p> <note>
     *        <p>
     *        Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers"
     *        >Custom Layers</a>.
     *        </p>
     */

    public void setCustomLayers(java.util.Collection<String> customLayers) {
        if (customLayers == null) {
            this.customLayers = null;
            return;
        }

        this.customLayers = new java.util.ArrayList<String>(customLayers);
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     * support custom layers, you can enable layer(s), such as <code>POI</code> layer for the VectorEsriNavigation
     * style. Default is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers">Custom
     * Layers</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomLayers(java.util.Collection)} or {@link #withCustomLayers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customLayers
     *        Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     *        support custom layers, you can enable layer(s), such as <code>POI</code> layer for the
     *        VectorEsriNavigation style. Default is <code>unset</code>.</p> <note>
     *        <p>
     *        Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers"
     *        >Custom Layers</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapConfigurationUpdate withCustomLayers(String... customLayers) {
        if (this.customLayers == null) {
            setCustomLayers(new java.util.ArrayList<String>(customLayers.length));
        }
        for (String ele : customLayers) {
            this.customLayers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     * support custom layers, you can enable layer(s), such as <code>POI</code> layer for the VectorEsriNavigation
     * style. Default is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers">Custom
     * Layers</a>.
     * </p>
     * </note>
     * 
     * @param customLayers
     *        Specifies the custom layers for the style. Leave unset to not enable any custom layer, or, for styles that
     *        support custom layers, you can enable layer(s), such as <code>POI</code> layer for the
     *        VectorEsriNavigation style. Default is <code>unset</code>.</p> <note>
     *        <p>
     *        Currenlty only <code>VectorEsriNavigation</code> supports CustomLayers. For more information, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#map-custom-layers"
     *        >Custom Layers</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapConfigurationUpdate withCustomLayers(java.util.Collection<String> customLayers) {
        setCustomLayers(customLayers);
        return this;
    }

    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not use a political view, or, for styles
     * that support specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views">Political
     * views</a> for more information.
     * </p>
     * </note>
     * 
     * @param politicalView
     *        Specifies the political view for the style. Set to an empty string to not use a political view, or, for
     *        styles that support specific political views, you can choose a view, such as <code>IND</code> for the
     *        Indian view.</p> <note>
     *        <p>
     *        Not all map resources or styles support political view styles. See <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *        >Political views</a> for more information.
     *        </p>
     */

    public void setPoliticalView(String politicalView) {
        this.politicalView = politicalView;
    }

    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not use a political view, or, for styles
     * that support specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views">Political
     * views</a> for more information.
     * </p>
     * </note>
     * 
     * @return Specifies the political view for the style. Set to an empty string to not use a political view, or, for
     *         styles that support specific political views, you can choose a view, such as <code>IND</code> for the
     *         Indian view.</p> <note>
     *         <p>
     *         Not all map resources or styles support political view styles. See <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *         >Political views</a> for more information.
     *         </p>
     */

    public String getPoliticalView() {
        return this.politicalView;
    }

    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not use a political view, or, for styles
     * that support specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views">Political
     * views</a> for more information.
     * </p>
     * </note>
     * 
     * @param politicalView
     *        Specifies the political view for the style. Set to an empty string to not use a political view, or, for
     *        styles that support specific political views, you can choose a view, such as <code>IND</code> for the
     *        Indian view.</p> <note>
     *        <p>
     *        Not all map resources or styles support political view styles. See <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *        >Political views</a> for more information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapConfigurationUpdate withPoliticalView(String politicalView) {
        setPoliticalView(politicalView);
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
        if (getCustomLayers() != null)
            sb.append("CustomLayers: ").append(getCustomLayers()).append(",");
        if (getPoliticalView() != null)
            sb.append("PoliticalView: ").append(getPoliticalView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapConfigurationUpdate == false)
            return false;
        MapConfigurationUpdate other = (MapConfigurationUpdate) obj;
        if (other.getCustomLayers() == null ^ this.getCustomLayers() == null)
            return false;
        if (other.getCustomLayers() != null && other.getCustomLayers().equals(this.getCustomLayers()) == false)
            return false;
        if (other.getPoliticalView() == null ^ this.getPoliticalView() == null)
            return false;
        if (other.getPoliticalView() != null && other.getPoliticalView().equals(this.getPoliticalView()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomLayers() == null) ? 0 : getCustomLayers().hashCode());
        hashCode = prime * hashCode + ((getPoliticalView() == null) ? 0 : getPoliticalView().hashCode());
        return hashCode;
    }

    @Override
    public MapConfigurationUpdate clone() {
        try {
            return (MapConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.MapConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
